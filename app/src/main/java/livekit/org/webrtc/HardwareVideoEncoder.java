package livekit.org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import livekit.org.webrtc.EglBase14;
import livekit.org.webrtc.EncodedImage;
import livekit.org.webrtc.ThreadUtils;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoFrame;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int REQUIRED_RESOLUTION_ALIGNMENT = 2;
    private static final String TAG = "HardwareVideoEncoder";
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private VideoEncoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private ByteBuffer configBuffer;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int frameSizeBytes;
    private int height;
    private boolean isEncodingStatisticsEnabled;
    private boolean isSemiPlanar;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private long nextPresentationTimestampUs;
    private Thread outputThread;
    private final Map<String, String> params;
    private volatile boolean running;
    private final EglBase14.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private final Integer surfaceColorFormat;
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private int width;
    private final Integer yuvColorFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();
    private final ThreadUtils.ThreadChecker outputThreadChecker = new ThreadUtils.ThreadChecker();
    private final BusyCount outputBuffersBusyCount = new BusyCount(0);

    /* loaded from: classes.dex */
    public static class BusyCount {
        private int count;
        private final Object countLock;

        public /* synthetic */ BusyCount(int i10) {
            this();
        }

        public void decrement() {
            synchronized (this.countLock) {
                try {
                    int i10 = this.count - 1;
                    this.count = i10;
                    if (i10 == 0) {
                        this.countLock.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z10;
            synchronized (this.countLock) {
                z10 = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e10) {
                        Logging.e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e10);
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }

        private BusyCount() {
            this.countLock = new Object();
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map<String, String> map, int i10, int i11, BitrateAdjuster bitrateAdjuster, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.params = map;
        this.keyFrameIntervalSec = i10;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i11);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        threadChecker.detachThread();
    }

    private boolean canUseSurface() {
        if (this.sharedContext != null && this.surfaceColorFormat != null) {
            return true;
        }
        return false;
    }

    private Thread createOutputThread() {
        return new Thread() { // from class: livekit.org.webrtc.HardwareVideoEncoder.1
            {
                HardwareVideoEncoder.this = this;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j6) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer == -1) {
                Logging.d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(dequeueInputBuffer);
                if (inputBuffer.capacity() < this.frameSizeBytes) {
                    int capacity = inputBuffer.capacity();
                    int i10 = this.frameSizeBytes;
                    Logging.e(TAG, "Input buffer size: " + capacity + " is smaller than frame size: " + i10);
                    return VideoCodecStatus.ERROR;
                }
                fillInputBuffer(inputBuffer, videoFrame.getBuffer());
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, this.frameSizeBytes, j6, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e10) {
                    Logging.e(TAG, "queueInputBuffer failed", e10);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e11) {
                Logging.e(TAG, "getInputBuffer with index=" + dequeueInputBuffer + " failed", e11);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e12) {
            Logging.e(TAG, "dequeueInputBuffer failed", e12);
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame, long j6) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j6));
            return VideoCodecStatus.OK;
        } catch (RuntimeException e10) {
            Logging.e(TAG, "encodeTexture failed", e10);
            return VideoCodecStatus.ERROR;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[Catch: IllegalStateException -> 0x008e, TryCatch #0 {IllegalStateException -> 0x008e, blocks: (B:9:0x002d, B:11:0x0067, B:15:0x0076, B:20:0x0085, B:25:0x0091, B:31:0x009e, B:32:0x00a6, B:33:0x00b4, B:35:0x00be, B:36:0x00c3, B:38:0x00c9, B:39:0x00d0, B:41:0x00e9, B:42:0x0105), top: B:49:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private VideoCodecStatus initEncodeInternal() {
        Integer num;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.nextPresentationTimestampUs = 0L;
        this.lastKeyFrameNs = -1L;
        char c10 = 0;
        this.isEncodingStatisticsEnabled = false;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            if (this.useSurfaceMode) {
                num = this.surfaceColorFormat;
            } else {
                num = this.yuvColorFormat;
            }
            int intValue = num.intValue();
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), this.width, this.height);
                createVideoFormat.setInteger("bitrate", this.adjustedBitrate);
                createVideoFormat.setInteger("bitrate-mode", 2);
                createVideoFormat.setInteger("color-format", intValue);
                createVideoFormat.setFloat("frame-rate", (float) this.bitrateAdjuster.getAdjustedFramerateFps());
                createVideoFormat.setInteger("i-frame-interval", this.keyFrameIntervalSec);
                if (this.codecType == VideoCodecMimeType.H264) {
                    String str = this.params.get("profile-level-id");
                    if (str == null) {
                        str = "42e01f";
                    }
                    int hashCode = str.hashCode();
                    if (hashCode != 1537948542) {
                        if (hashCode == 1595523974 && str.equals("640c1f")) {
                            if (c10 == 0) {
                                if (c10 != 1) {
                                    Logging.w(TAG, "Unknown profile level id: ".concat(str));
                                }
                            } else {
                                createVideoFormat.setInteger("profile", 8);
                                createVideoFormat.setInteger("level", 256);
                            }
                        }
                        c10 = '\uffff';
                        if (c10 == 0) {
                        }
                    } else {
                        if (str.equals("42e01f")) {
                            c10 = 1;
                            if (c10 == 0) {
                            }
                        }
                        c10 = '\uffff';
                        if (c10 == 0) {
                        }
                    }
                }
                if (this.codecName.equals("c2.google.av1.encoder")) {
                    createVideoFormat.setInteger("vendor.google-av1enc.encoding-preset.int32.value", 1);
                }
                if (isEncodingStatisticsSupported()) {
                    createVideoFormat.setInteger("video-encoding-statistics-level", 1);
                    this.isEncodingStatisticsEnabled = true;
                }
                Logging.d(TAG, "Format: " + createVideoFormat);
                this.codec.configure(createVideoFormat, null, null, 1);
                if (this.useSurfaceMode) {
                    this.textureEglBase = e.i(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                    Surface createInputSurface = this.codec.createInputSurface();
                    this.textureInputSurface = createInputSurface;
                    this.textureEglBase.createSurface(createInputSurface);
                    this.textureEglBase.makeCurrent();
                }
                updateInputFormat(this.codec.getInputFormat());
                this.codec.start();
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (IllegalStateException e10) {
                Logging.e(TAG, "initEncodeInternal failed", e10);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException unused) {
            Logging.e(TAG, "Cannot create media encoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    public /* synthetic */ void lambda$deliverEncodedImage$0(int i10) {
        try {
            this.codec.releaseOutputBuffer(i10, false);
        } catch (Exception e10) {
            Logging.e(TAG, "releaseOutputBuffer failed", e10);
        }
        this.outputBuffersBusyCount.decrement();
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e10) {
            Logging.e(TAG, "Media encoder stop failed", e10);
        }
        try {
            this.codec.release();
        } catch (Exception e11) {
            Logging.e(TAG, "Media encoder release failed", e11);
            this.shutdownException = e11;
        }
        this.configBuffer = null;
        Logging.d(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j6) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j6;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "requestKeyFrame failed", e10);
        }
    }

    private VideoCodecStatus resetCodec(int i10, int i11, boolean z10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        if (i10 % 2 == 0 && i11 % 2 == 0) {
            this.width = i10;
            this.height = i11;
            this.useSurfaceMode = z10;
            return initEncodeInternal();
        }
        Logging.e(TAG, "MediaCodec requires 2x2 alignment.");
        return VideoCodecStatus.ERR_SIZE;
    }

    private boolean shouldForceKeyFrame(long j6) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j10 = this.forcedKeyFrameNs;
        if (j10 > 0 && j6 > this.lastKeyFrameNs + j10) {
            return true;
        }
        return false;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "updateBitrate failed", e10);
            return VideoCodecStatus.ERROR;
        }
    }

    private void updateInputFormat(MediaFormat mediaFormat) {
        this.stride = this.width;
        this.sliceHeight = this.height;
        if (mediaFormat != null) {
            if (mediaFormat.containsKey("stride")) {
                int integer = mediaFormat.getInteger("stride");
                this.stride = integer;
                this.stride = Math.max(integer, this.width);
            }
            if (mediaFormat.containsKey("slice-height")) {
                int integer2 = mediaFormat.getInteger("slice-height");
                this.sliceHeight = integer2;
                this.sliceHeight = Math.max(integer2, this.height);
            }
        }
        boolean isSemiPlanar = isSemiPlanar(this.yuvColorFormat.intValue());
        this.isSemiPlanar = isSemiPlanar;
        if (isSemiPlanar) {
            int i10 = this.sliceHeight;
            int i11 = this.stride;
            this.frameSizeBytes = (((this.height + 1) / 2) * i11) + (i10 * i11);
        } else {
            int i12 = this.stride;
            int i13 = this.sliceHeight;
            this.frameSizeBytes = (((i13 + 1) / 2) * ((i12 + 1) / 2) * 2) + (i13 * i12);
        }
        int i14 = this.stride;
        int i15 = this.sliceHeight;
        int i16 = this.frameSizeBytes;
        Logging.d(TAG, "updateInputFormat format: " + mediaFormat + " stride: " + i14 + " sliceHeight: " + i15 + " isSemiPlanar: " + isSemiPlanar + " frameSizeBytes: " + i16);
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final /* synthetic */ long createNativeVideoEncoder() {
        return w.a(this);
    }

    public void deliverEncodedImage() {
        Integer num;
        ByteBuffer byteBuffer;
        EncodedImage.FrameType frameType;
        ByteBuffer byteBuffer2;
        MediaFormat outputFormat;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -3) {
                    this.outputBuffersBusyCount.waitForZero();
                    return;
                }
                return;
            }
            ByteBuffer outputBuffer = this.codec.getOutputBuffer(dequeueOutputBuffer);
            ByteBuffer byteBuffer3 = (ByteBuffer) outputBuffer.position(bufferInfo.offset);
            ByteBuffer byteBuffer4 = (ByteBuffer) outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            if ((bufferInfo.flags & 2) != 0) {
                Logging.d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                int i10 = bufferInfo.size;
                if (i10 > 0) {
                    VideoCodecMimeType videoCodecMimeType = this.codecType;
                    if (videoCodecMimeType == VideoCodecMimeType.H264 || videoCodecMimeType == VideoCodecMimeType.H265) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10);
                        this.configBuffer = allocateDirect;
                        allocateDirect.put(outputBuffer);
                        return;
                    }
                    return;
                }
                return;
            }
            this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
            if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                updateBitrate();
            }
            boolean z10 = true;
            if ((bufferInfo.flags & 1) == 0) {
                z10 = false;
            }
            if (z10) {
                Logging.d(TAG, "Sync frame generated");
            }
            i iVar = null;
            if (this.isEncodingStatisticsEnabled && (outputFormat = this.codec.getOutputFormat(dequeueOutputBuffer)) != null && outputFormat.containsKey("video-qp-average")) {
                num = Integer.valueOf(outputFormat.getInteger("video-qp-average"));
            } else {
                num = null;
            }
            if (z10 && (byteBuffer2 = this.configBuffer) != null) {
                Logging.d(TAG, "Prepending config buffer of size " + byteBuffer2.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                byteBuffer = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                ByteBuffer byteBuffer5 = (ByteBuffer) this.configBuffer.rewind();
                byteBuffer.put(this.configBuffer);
                byteBuffer.put(outputBuffer);
                ByteBuffer byteBuffer6 = (ByteBuffer) byteBuffer.rewind();
                this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else {
                byteBuffer = outputBuffer.slice();
                this.outputBuffersBusyCount.increment();
                iVar = new i(this, dequeueOutputBuffer, 0);
            }
            if (z10) {
                frameType = EncodedImage.FrameType.VideoFrameKey;
            } else {
                frameType = EncodedImage.FrameType.VideoFrameDelta;
            }
            EncodedImage.Builder poll = this.outputBuilders.poll();
            poll.setBuffer(byteBuffer, iVar);
            poll.setFrameType(frameType);
            poll.setQp(num);
            EncodedImage createEncodedImage = poll.createEncodedImage();
            this.callback.onEncodedFrame(createEncodedImage, new VideoEncoder.CodecSpecificInfo());
            createEncodedImage.release();
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "deliverOutput failed", e10);
        }
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        boolean z10;
        VideoCodecStatus videoCodecStatus;
        VideoCodecStatus resetCodec;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        boolean z11 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        if (canUseSurface() && z11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((width != this.width || height != this.height || z10 != this.useSurfaceMode) && (resetCodec = resetCodec(width, height, z10)) != VideoCodecStatus.OK) {
            return resetCodec;
        }
        if (this.outputBuilders.size() > 2) {
            Logging.e(TAG, "Dropped frame, encoder queue full");
            return VideoCodecStatus.NO_OUTPUT;
        }
        boolean z12 = false;
        for (EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
            if (frameType == EncodedImage.FrameType.VideoFrameKey) {
                z12 = true;
            }
        }
        if (z12 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
        long j6 = this.nextPresentationTimestampUs;
        this.nextPresentationTimestampUs += (long) (TimeUnit.SECONDS.toMicros(1L) / this.bitrateAdjuster.getAdjustedFramerateFps());
        if (this.useSurfaceMode) {
            videoCodecStatus = encodeTextureBuffer(videoFrame, j6);
        } else {
            videoCodecStatus = encodeByteBuffer(videoFrame, j6);
        }
        if (videoCodecStatus != VideoCodecStatus.OK) {
            this.outputBuilders.pollLast();
        }
        return videoCodecStatus;
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        VideoFrame.I420Buffer i420 = buffer.toI420();
        if (this.isSemiPlanar) {
            YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), this.stride, this.sliceHeight);
        } else {
            YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), this.stride, this.sliceHeight);
        }
        i420.release();
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(2, false);
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final /* synthetic */ VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return w.c(this);
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H264) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        int i10;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        int i11 = settings.width;
        if (i11 % 2 == 0) {
            int i12 = settings.height;
            if (i12 % 2 == 0) {
                this.width = i11;
                this.height = i12;
                this.useSurfaceMode = canUseSurface();
                int i13 = settings.startBitrate;
                if (i13 != 0 && (i10 = settings.maxFramerate) != 0) {
                    this.bitrateAdjuster.setTargets(i13 * 1000, i10);
                }
                this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
                String str = this.codecName;
                VideoCodecMimeType videoCodecMimeType = this.codecType;
                int i14 = this.width;
                int i15 = this.height;
                int i16 = settings.maxFramerate;
                int i17 = settings.startBitrate;
                boolean z10 = this.useSurfaceMode;
                Logging.d(TAG, "initEncode name: " + str + " type: " + videoCodecMimeType + " width: " + i14 + " height: " + i15 + " framerate_fps: " + i16 + " bitrate_kbps: " + i17 + " surface mode: " + z10);
                return initEncodeInternal();
            }
        }
        Logging.e(TAG, "MediaCodec requires 2x2 alignment.");
        return VideoCodecStatus.ERR_SIZE;
    }

    public boolean isEncodingStatisticsSupported() {
        MediaCodecInfo codecInfo;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        VideoCodecMimeType videoCodecMimeType = this.codecType;
        if (videoCodecMimeType == VideoCodecMimeType.VP8 || videoCodecMimeType == VideoCodecMimeType.VP9 || (codecInfo = this.codec.getCodecInfo()) == null || (capabilitiesForType = codecInfo.getCapabilitiesForType(this.codecType.mimeType())) == null) {
            return false;
        }
        return capabilitiesForType.isFeatureSupported("encoding-statistics");
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final /* synthetic */ boolean isHardwareEncoder() {
        return w.d(this);
    }

    public boolean isSemiPlanar(int i10) {
        if (i10 != 19) {
            if (i10 != 21 && i10 != 2141391872 && i10 != 2141391876) {
                throw new IllegalArgumentException(android.gov.nist.core.a.e("Unsupported colorFormat: ", i10));
            }
            return true;
        }
        return false;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i10 > 30) {
            i10 = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i10);
        return VideoCodecStatus.OK;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }
}

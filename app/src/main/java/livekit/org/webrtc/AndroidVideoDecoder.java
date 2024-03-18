package livekit.org.webrtc;

import android.gov.nist.core.Separators;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import k6.AbstractC4194d;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.EncodedImage;
import livekit.org.webrtc.ThreadUtils;
import livekit.org.webrtc.VideoDecoder;
import livekit.org.webrtc.VideoFrame;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "AndroidVideoDecoder";
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private final Object dimensionLock = new Object();
    private final Object renderedTextureMetadataLock = new Object();

    /* loaded from: classes.dex */
    public static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        public DecodedTextureMetadata(long j6, Integer num) {
            this.presentationTimestampUs = j6;
            this.decodeTimeMs = num;
        }
    }

    /* loaded from: classes2.dex */
    public static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        public FrameInfo(long j6, int i10) {
            this.decodeStartTimeMs = j6;
            this.rotation = i10;
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i10, EglBase.Context context) {
        if (isSupportedColorFormat(i10)) {
            Logging.d(TAG, "ctor name: " + str + " type: " + videoCodecMimeType + " color format: " + i10 + " context: " + context);
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
            this.codecName = str;
            this.codecType = videoCodecMimeType;
            this.colorFormat = i10;
            this.sharedContext = context;
            this.frameInfos = new LinkedBlockingDeque();
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Unsupported color format: ", i10));
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        int i14;
        if (i10 % 2 == 0) {
            int i15 = (i12 + 1) / 2;
            int i16 = i11 % 2;
            if (i16 == 0) {
                i14 = (i13 + 1) / 2;
            } else {
                i14 = i13 / 2;
            }
            int i17 = i14;
            int i18 = i10 / 2;
            int i19 = i10 * i11;
            int i20 = i18 * i17;
            int z10 = android.gov.nist.core.a.z(i18, i11, 2, i19);
            int i21 = z10 + i20;
            VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i12, i13);
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.limit(i10 * i13);
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(0);
            copyPlane(byteBuffer.slice(), i10, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i12, i13);
            ByteBuffer byteBuffer4 = (ByteBuffer) byteBuffer.limit(i19 + i20);
            ByteBuffer byteBuffer5 = (ByteBuffer) byteBuffer.position(i19);
            copyPlane(byteBuffer.slice(), i18, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i15, i17);
            if (i16 == 1) {
                ByteBuffer byteBuffer6 = (ByteBuffer) byteBuffer.position(((i17 - 1) * i18) + i19);
                ByteBuffer dataU = allocateI420Buffer.getDataU();
                ByteBuffer byteBuffer7 = (ByteBuffer) dataU.position(allocateI420Buffer.getStrideU() * i17);
                dataU.put(byteBuffer);
            }
            ByteBuffer byteBuffer8 = (ByteBuffer) byteBuffer.limit(i21);
            ByteBuffer byteBuffer9 = (ByteBuffer) byteBuffer.position(z10);
            copyPlane(byteBuffer.slice(), i18, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i15, i17);
            if (i16 == 1) {
                ByteBuffer byteBuffer10 = (ByteBuffer) byteBuffer.position(((i17 - 1) * i18) + z10);
                ByteBuffer dataV = allocateI420Buffer.getDataV();
                ByteBuffer byteBuffer11 = (ByteBuffer) dataV.position(allocateI420Buffer.getStrideV() * i17);
                dataV.put(byteBuffer);
            }
            return allocateI420Buffer;
        }
        throw new AssertionError(android.gov.nist.core.a.e("Stride is not divisible by two: ", i10));
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        return new NV12Buffer(i12, i13, i10, i11, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: livekit.org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private void deliverByteFrame(int i10, MediaCodec.BufferInfo bufferInfo, int i11, Integer num) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        VideoFrame.Buffer buffer;
        synchronized (this.dimensionLock) {
            i12 = this.width;
            i13 = this.height;
            i14 = this.stride;
            i15 = this.sliceHeight;
        }
        int i17 = bufferInfo.size;
        if (i17 < ((i12 * i13) * 3) / 2) {
            Logging.e(TAG, "Insufficient output buffer size: " + i17);
            return;
        }
        if (i17 < ((i14 * i13) * 3) / 2 && i15 == i13 && i14 > i12) {
            i16 = (i17 * 2) / (i13 * 3);
        } else {
            i16 = i14;
        }
        ByteBuffer outputBuffer = this.codec.getOutputBuffer(i10);
        ByteBuffer byteBuffer = (ByteBuffer) outputBuffer.position(bufferInfo.offset);
        ByteBuffer byteBuffer2 = (ByteBuffer) outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = outputBuffer.slice();
        if (this.colorFormat == 19) {
            buffer = copyI420Buffer(slice, i16, i15, i12, i13);
        } else {
            buffer = copyNV12ToI420Buffer(slice, i16, i15, i12, i13);
        }
        this.codec.releaseOutputBuffer(i10, false);
        VideoFrame videoFrame = new VideoFrame(buffer, i11, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    private void deliverTextureFrame(int i10, MediaCodec.BufferInfo bufferInfo, int i11, Integer num) {
        int i12;
        int i13;
        synchronized (this.dimensionLock) {
            i12 = this.width;
            i13 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.renderedTextureMetadata != null) {
                    this.codec.releaseOutputBuffer(i10, false);
                    return;
                }
                this.surfaceTextureHelper.setTextureSize(i12, i13);
                this.surfaceTextureHelper.setFrameRotation(i11);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                this.codec.releaseOutputBuffer(i10, true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private VideoCodecStatus initDecodeInternal(int i10, int i11) {
        Throwable e10;
        this.decoderThreadChecker.checkIsOnValidThread();
        String str = this.codecName;
        VideoCodecMimeType videoCodecMimeType = this.codecType;
        int i12 = this.colorFormat;
        Logging.d(TAG, "initDecodeInternal name: " + str + " type: " + videoCodecMimeType + " width: " + i10 + " height: " + i11 + " color format: " + i12);
        if (this.outputThread != null) {
            Logging.e(TAG, "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i10;
        this.height = i11;
        this.stride = i10;
        this.sliceHeight = i11;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i10, i11);
                if (this.sharedContext == null) {
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                Logging.d(TAG, "initDecodeInternal done");
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException e11) {
                e10 = e11;
                Logging.e(TAG, "initDecode failed", e10);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            } catch (IllegalStateException e12) {
                e10 = e12;
                Logging.e(TAG, "initDecode failed", e10);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            String str2 = this.codecName;
            Logging.e(TAG, "Cannot create media decoder " + str2);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i10) {
        for (int i11 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void reformat(MediaFormat mediaFormat) {
        int i10;
        int i11;
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Decoder format changed: " + mediaFormat);
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            i11 = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
            i10 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
        } else {
            i11 = mediaFormat.getInteger("width");
            i10 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            try {
                int i12 = this.width;
                if (i11 == i12) {
                    if (i10 != this.height) {
                    }
                    if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                        int integer = mediaFormat.getInteger("color-format");
                        this.colorFormat = integer;
                        AbstractC4194d.z("Color: 0x", Integer.toHexString(integer), TAG);
                        if (!isSupportedColorFormat(this.colorFormat)) {
                            stopOnOutputThread(new IllegalStateException(android.gov.nist.core.a.e("Unsupported color format: ", this.colorFormat)));
                            return;
                        }
                    }
                    synchronized (this.dimensionLock) {
                        try {
                            if (mediaFormat.containsKey("stride")) {
                                this.stride = mediaFormat.getInteger("stride");
                            }
                            if (mediaFormat.containsKey("slice-height")) {
                                this.sliceHeight = mediaFormat.getInteger("slice-height");
                            }
                            int i13 = this.stride;
                            int i14 = this.sliceHeight;
                            Logging.d(TAG, "Frame stride and slice height: " + i13 + " x " + i14);
                            this.stride = Math.max(this.width, this.stride);
                            this.sliceHeight = Math.max(this.height, this.sliceHeight);
                        } finally {
                        }
                    }
                    return;
                }
                if (this.hasDecodedFirstFrame) {
                    int i15 = this.width;
                    int i16 = this.height;
                    stopOnOutputThread(new RuntimeException("Unexpected size change. Configured " + i15 + Separators.STAR + i16 + ". New " + i11 + Separators.STAR + i10));
                    return;
                }
                if (i11 > 0 && i10 > 0) {
                    this.width = i11;
                    this.height = i10;
                    if (this.surfaceTextureHelper == null) {
                        int integer2 = mediaFormat.getInteger("color-format");
                        this.colorFormat = integer2;
                        AbstractC4194d.z("Color: 0x", Integer.toHexString(integer2), TAG);
                        if (!isSupportedColorFormat(this.colorFormat)) {
                        }
                    }
                    synchronized (this.dimensionLock) {
                    }
                }
                int i17 = this.height;
                Logging.w(TAG, "Unexpected format dimensions. Configured " + i12 + Separators.STAR + i17 + ". New " + i11 + Separators.STAR + i10 + ". Skip it");
            } finally {
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i10, int i11) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        if (releaseInternal != VideoCodecStatus.OK) {
            return releaseInternal;
        }
        return initDecodeInternal(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e10) {
            Logging.e(TAG, "Media decoder stop failed", e10);
        }
        try {
            this.codec.release();
        } catch (Exception e11) {
            Logging.e(TAG, "Media decoder release failed", e11);
            this.shutdownException = e11;
        }
        Logging.d(TAG, "Release on output thread done");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [livekit.org.webrtc.MediaCodecWrapper, java.lang.Thread] */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                return VideoCodecStatus.ERROR;
            } else {
                this.codec = null;
                this.outputThread = null;
                return VideoCodecStatus.OK;
            }
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i10, int i11) {
        return JavaI420Buffer.allocate(i10, i11);
    }

    public void copyPlane(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, int i12, int i13) {
        YuvHelper.copyPlane(byteBuffer, i10, byteBuffer2, i11, i12, i13);
    }

    @Override // livekit.org.webrtc.VideoDecoder
    public final /* synthetic */ long createNativeVideoDecoder() {
        return t.a(this);
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // livekit.org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i10;
        int i11;
        VideoCodecStatus reinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        boolean z10 = false;
        if (mediaCodecWrapper != null && this.callback != null) {
            ByteBuffer byteBuffer = encodedImage.buffer;
            if (byteBuffer == null) {
                Logging.e(TAG, "decode() - no input data");
                return VideoCodecStatus.ERR_PARAMETER;
            }
            int remaining = byteBuffer.remaining();
            if (remaining == 0) {
                Logging.e(TAG, "decode() - input buffer empty");
                return VideoCodecStatus.ERR_PARAMETER;
            }
            synchronized (this.dimensionLock) {
                i10 = this.width;
                i11 = this.height;
            }
            int i12 = encodedImage.encodedWidth;
            int i13 = encodedImage.encodedHeight;
            if (i12 * i13 > 0 && ((i12 != i10 || i13 != i11) && (reinitDecode = reinitDecode(i12, i13)) != VideoCodecStatus.OK)) {
                return reinitDecode;
            }
            if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
                Logging.e(TAG, "decode() - key frame required first");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
                if (dequeueInputBuffer < 0) {
                    Logging.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                    return VideoCodecStatus.ERROR;
                }
                try {
                    ByteBuffer inputBuffer = this.codec.getInputBuffer(dequeueInputBuffer);
                    if (inputBuffer.capacity() < remaining) {
                        Logging.e(TAG, "decode() - HW buffer too small");
                        return VideoCodecStatus.ERROR;
                    }
                    inputBuffer.put(encodedImage.buffer);
                    this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                    try {
                        this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                        if (this.keyFrameRequired) {
                            this.keyFrameRequired = false;
                        }
                        return VideoCodecStatus.OK;
                    } catch (IllegalStateException e10) {
                        Logging.e(TAG, "queueInputBuffer failed", e10);
                        this.frameInfos.pollLast();
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
        if (mediaCodecWrapper != null) {
            z10 = true;
        }
        VideoDecoder.Callback callback = this.callback;
        Logging.d(TAG, "decode uninitalized, codec: " + z10 + ", callback: " + callback);
        return VideoCodecStatus.UNINITIALIZED;
    }

    public void deliverDecodedFrame() {
        Integer num;
        int i10;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
            } else if (dequeueOutputBuffer < 0) {
                Logging.v(TAG, "dequeueOutputBuffer returned " + dequeueOutputBuffer);
            } else {
                FrameInfo poll = this.frameInfos.poll();
                if (poll != null) {
                    num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - poll.decodeStartTimeMs));
                    i10 = poll.rotation;
                } else {
                    num = null;
                    i10 = 0;
                }
                this.hasDecodedFirstFrame = true;
                if (this.surfaceTextureHelper != null) {
                    deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i10, num);
                } else {
                    deliverByteFrame(dequeueOutputBuffer, bufferInfo, i10, num);
                }
            }
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "deliverDecodedFrame failed", e10);
        }
    }

    @Override // livekit.org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // livekit.org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override // livekit.org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j6;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata != null) {
                j6 = decodedTextureMetadata.presentationTimestampUs * 1000;
                num = decodedTextureMetadata.decodeTimeMs;
                this.renderedTextureMetadata = null;
            } else {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j6), num, null);
    }

    @Override // livekit.org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        Logging.d(TAG, "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }
}

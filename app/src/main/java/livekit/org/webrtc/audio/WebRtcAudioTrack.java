package livekit.org.webrtc.audio;

import E9.f;
import android.annotation.TargetApi;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k6.AbstractC4194d;
import livekit.org.webrtc.CalledByNative;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.ThreadUtils;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class WebRtcAudioTrack {
    private static final int AUDIO_TRACK_START = 0;
    private static final int AUDIO_TRACK_STOP = 1;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrackExternal";
    private final AudioAttributes audioAttributes;
    private final AudioManager audioManager;
    private final JavaAudioDeviceModule.PlaybackSamplesReadyCallback audioSamplesReadyCallback;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private final Context context;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    private int initialBufferSizeInFrames;
    private long nativeAudioTrack;
    private volatile boolean speakerMute;
    private final JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    private final ThreadUtils.ThreadChecker threadChecker;
    private boolean useLowLatency;
    private final VolumeLogger volumeLogger;

    /* loaded from: classes2.dex */
    public class AudioTrackThread extends Thread {
        private volatile boolean keepAlive = true;
        private LowLatencyAudioBufferManager bufferManager = new LowLatencyAudioBufferManager();

        public AudioTrackThread(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z10;
            boolean z11;
            Process.setThreadPriority(-19);
            AbstractC4194d.z("AudioTrackThread", WebRtcAudioUtils.getThreadInfo(), WebRtcAudioTrack.TAG);
            if (WebRtcAudioTrack.this.audioTrack.getPlayState() == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            WebRtcAudioTrack.assertTrue(z10);
            WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                WebRtcAudioTrack.assertTrue(z11);
                if (WebRtcAudioTrack.this.speakerMute) {
                    ByteBuffer byteBuffer = (ByteBuffer) WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    ByteBuffer byteBuffer2 = (ByteBuffer) WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int write = WebRtcAudioTrack.this.audioTrack.write(WebRtcAudioTrack.this.byteBuffer, capacity, 0);
                if (write != capacity) {
                    Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + write);
                    if (write < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError(android.gov.nist.core.a.e("AudioTrack.write failed: ", write));
                    }
                }
                if (WebRtcAudioTrack.this.audioSamplesReadyCallback != null && this.keepAlive) {
                    WebRtcAudioTrack.this.audioSamplesReadyCallback.onWebRtcAudioTrackSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioTrack.this.audioTrack.getAudioFormat(), WebRtcAudioTrack.this.audioTrack.getChannelCount(), WebRtcAudioTrack.this.audioTrack.getSampleRate(), Arrays.copyOfRange(WebRtcAudioTrack.this.byteBuffer.array(), WebRtcAudioTrack.this.byteBuffer.arrayOffset(), WebRtcAudioTrack.this.byteBuffer.arrayOffset() + capacity)));
                }
                if (WebRtcAudioTrack.this.useLowLatency) {
                    this.bufferManager.maybeAdjustBufferSize(WebRtcAudioTrack.this.audioTrack);
                }
                ByteBuffer byteBuffer3 = (ByteBuffer) WebRtcAudioTrack.this.byteBuffer.rewind();
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    @CalledByNative
    public WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null, null, null, null, false, true);
    }

    @CalledByNative
    private int GetPlayoutUnderrunCount() {
        int underrunCount;
        if (Build.VERSION.SDK_INT >= 24) {
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null) {
                underrunCount = audioTrack.getUnderrunCount();
                return underrunCount;
            }
            return -1;
        }
        return -2;
    }

    @TargetApi(29)
    private static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes) {
        int allowedCapturePolicy;
        AudioAttributes.Builder allowedCapturePolicy2;
        allowedCapturePolicy = audioAttributes.getAllowedCapturePolicy();
        allowedCapturePolicy2 = builder.setAllowedCapturePolicy(allowedCapturePolicy);
        return allowedCapturePolicy2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z10) {
        if (z10) {
            return;
        }
        throw new AssertionError("Expected condition to be true");
    }

    private int channelCountToConfiguration(int i10) {
        return i10 == 1 ? 4 : 12;
    }

    private static AudioTrack createAudioTrackBeforeOreo(int i10, int i11, int i12, AudioAttributes audioAttributes) {
        Logging.d(TAG, "createAudioTrackBeforeOreo");
        logNativeOutputSampleRate(i10);
        return new AudioTrack(getAudioAttributes(audioAttributes), new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11).build(), i12, 1, 0);
    }

    @TargetApi(26)
    private static AudioTrack createAudioTrackOnOreoOrHigher(int i10, int i11, int i12, AudioAttributes audioAttributes) {
        AudioTrack.Builder performanceMode;
        Logging.d(TAG, "createAudioTrackOnOreoOrHigher");
        logNativeOutputSampleRate(i10);
        performanceMode = new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes)).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11).build()).setBufferSizeInBytes(i12).setPerformanceMode(1);
        return performanceMode.setTransferMode(1).setSessionId(0).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioTrackStateCallback(int i10) {
        AbstractC4194d.y("doAudioTrackStateCallback: ", i10, TAG);
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback != null) {
            if (i10 == 0) {
                audioTrackStateCallback.onWebRtcAudioTrackStart();
            } else if (i10 == 1) {
                audioTrackStateCallback.onWebRtcAudioTrackStop();
            } else {
                Logging.e(TAG, "Invalid audio state");
            }
        }
    }

    private static AudioAttributes getAudioAttributes(AudioAttributes audioAttributes) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(2).setContentType(1);
        if (audioAttributes != null) {
            if (audioAttributes.getUsage() != 0) {
                contentType.setUsage(audioAttributes.getUsage());
            }
            if (audioAttributes.getContentType() != 0) {
                contentType.setContentType(audioAttributes.getContentType());
            }
            contentType.setFlags(audioAttributes.getFlags());
            if (Build.VERSION.SDK_INT >= 29) {
                contentType = applyAttributesOnQOrHigher(contentType, audioAttributes);
            }
        }
        return contentType.build();
    }

    @CalledByNative
    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    @CalledByNative
    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    @CalledByNative
    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    @CalledByNative
    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    @CalledByNative
    private int initPlayout(int i10, int i11, double d10) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initPlayout(sampleRate=" + i10 + ", channels=" + i11 + ", bufferSizeFactor=" + d10 + Separators.RPAREN);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i10 / BUFFERS_PER_SECOND) * i11 * 2);
        this.byteBuffer = allocateDirect;
        AbstractC4194d.y("byteBuffer.capacity: ", allocateDirect.capacity(), TAG);
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i11);
        int minBufferSize = (int) (((double) AudioTrack.getMinBufferSize(i10, channelCountToConfiguration, 2)) * d10);
        AbstractC4194d.y("minBufferSizeInBytes: ", minBufferSize, TAG);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (d10 > 1.0d) {
            this.useLowLatency = false;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            if (this.useLowLatency && Build.VERSION.SDK_INT >= 26) {
                this.audioTrack = createAudioTrackOnOreoOrHigher(i10, channelCountToConfiguration, minBufferSize, this.audioAttributes);
            } else {
                this.audioTrack = createAudioTrackBeforeOreo(i10, channelCountToConfiguration, minBufferSize, this.audioAttributes);
            }
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null && audioTrack.getState() == 1) {
                this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
                logMainParameters();
                logMainParametersExtended();
                return minBufferSize;
            }
            reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
            releaseAudioResources();
            return -1;
        } catch (IllegalArgumentException e10) {
            reportWebRtcAudioTrackInitError(e10.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    private void logBufferCapacityInFrames() {
        int bufferCapacityInFrames;
        if (Build.VERSION.SDK_INT >= 24) {
            bufferCapacityInFrames = this.audioTrack.getBufferCapacityInFrames();
            AbstractC4194d.y("AudioTrack: buffer capacity in frames: ", bufferCapacityInFrames, TAG);
        }
    }

    private void logBufferSizeInFrames() {
        AbstractC4194d.y("AudioTrack: buffer size in frames: ", this.audioTrack.getBufferSizeInFrames(), TAG);
    }

    private void logMainParameters() {
        int audioSessionId = this.audioTrack.getAudioSessionId();
        int channelCount = this.audioTrack.getChannelCount();
        int sampleRate = this.audioTrack.getSampleRate();
        float maxVolume = AudioTrack.getMaxVolume();
        StringBuilder A10 = f.A("AudioTrack: session ID: ", audioSessionId, ", channels: ", channelCount, ", sample rate: ");
        A10.append(sampleRate);
        A10.append(", max gain: ");
        A10.append(maxVolume);
        Logging.d(TAG, A10.toString());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private static void logNativeOutputSampleRate(int i10) {
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        AbstractC4194d.y("nativeOutputSampleRate: ", nativeOutputSampleRate, TAG);
        if (i10 != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
    }

    private void logUnderrunCount() {
        int underrunCount;
        if (Build.VERSION.SDK_INT >= 24) {
            underrunCount = this.audioTrack.getUnderrunCount();
            AbstractC4194d.y("underrun count: ", underrunCount, TAG);
        }
    }

    private static native void nativeCacheDirectBufferAddress(long j6, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeGetPlayoutData(long j6, int i10);

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    @CalledByNative
    private boolean setStreamVolume(int i10) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "setStreamVolume(" + i10 + Separators.RPAREN);
        if (this.audioManager.isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i10, 0);
        return true;
    }

    @CalledByNative
    private boolean startPlayout() {
        boolean z10;
        boolean z11;
        this.threadChecker.checkIsOnValidThread();
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.start();
        }
        Logging.d(TAG, "startPlayout");
        if (this.audioTrack != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
        if (this.audioThread == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        assertTrue(z11);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, android.gov.nist.core.a.e("AudioTrack.play failed - incorrect state :", this.audioTrack.getPlayState()));
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e10) {
            reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, R.a.r("AudioTrack.play failed: ", e10.getMessage()));
            releaseAudioResources();
            return false;
        }
    }

    @CalledByNative
    private boolean stopPlayout() {
        boolean z10;
        this.threadChecker.checkIsOnValidThread();
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.stop();
        }
        Logging.d(TAG, "stopPlayout");
        if (this.audioThread != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        if (this.audioTrack != null) {
            Logging.d(TAG, "Calling AudioTrack.stop...");
            try {
                this.audioTrack.stop();
                Logging.d(TAG, "AudioTrack.stop is done.");
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e10) {
                Logging.e(TAG, "AudioTrack.stop failed: " + e10.getMessage());
            }
        }
        releaseAudioResources();
        return true;
    }

    @CalledByNative
    public void setNativeAudioTrack(long j6) {
        this.nativeAudioTrack = j6;
    }

    public void setSpeakerMute(boolean z10) {
        Logging.w(TAG, "setSpeakerMute(" + z10 + Separators.RPAREN);
        this.speakerMute = z10;
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, AudioAttributes audioAttributes, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, JavaAudioDeviceModule.PlaybackSamplesReadyCallback playbackSamplesReadyCallback, boolean z10, boolean z11) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.audioAttributes = audioAttributes;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.volumeLogger = z11 ? new VolumeLogger(audioManager) : null;
        this.audioSamplesReadyCallback = playbackSamplesReadyCallback;
        this.useLowLatency = z10;
        AbstractC4194d.z("ctor", WebRtcAudioUtils.getThreadInfo(), TAG);
    }
}

package livekit.org.webrtc.voiceengine;

import E9.f;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import k6.AbstractC4194d;
import livekit.org.webrtc.ContextUtils;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.ThreadUtils;

/* loaded from: classes.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrack";
    private static ErrorCallback errorCallback = null;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld = null;
    private static volatile boolean speakerMute = false;
    private static int usageAttribute = 2;
    private final AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;

    /* loaded from: classes2.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* loaded from: classes2.dex */
    public class AudioTrackThread extends Thread {
        private volatile boolean keepAlive = true;

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
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                WebRtcAudioTrack.assertTrue(z11);
                if (WebRtcAudioTrack.speakerMute) {
                    ByteBuffer byteBuffer = (ByteBuffer) WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    ByteBuffer byteBuffer2 = (ByteBuffer) WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int write = WebRtcAudioTrack.this.audioTrack.write(WebRtcAudioTrack.this.byteBuffer, capacity, 0);
                if (write != capacity) {
                    Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + write);
                    if (write < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + write);
                    }
                }
                ByteBuffer byteBuffer3 = (ByteBuffer) WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (IllegalStateException e10) {
                    Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e10.getMessage());
                }
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* loaded from: classes2.dex */
    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    public WebRtcAudioTrack(long j6) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.checkIsOnValidThread();
        AbstractC4194d.z("ctor", WebRtcAudioUtils.getThreadInfo(), TAG);
        this.nativeAudioTrack = j6;
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

    private static AudioTrack createAudioTrack(int i10, int i11, int i12) {
        Logging.d(TAG, "createAudioTrack");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        AbstractC4194d.y("nativeOutputSampleRate: ", nativeOutputSampleRate, TAG);
        if (i10 != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        int i13 = usageAttribute;
        if (i13 != 2) {
            Logging.w(TAG, "A non default usage attribute is used: " + i13);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11).build(), i12, 1, 0);
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private int getStreamMaxVolume() {
        boolean z10;
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamMaxVolume");
        if (this.audioManager != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        boolean z10;
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamVolume");
        if (this.audioManager != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
        return this.audioManager.getStreamVolume(0);
    }

    private int initPlayout(int i10, int i11, double d10) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initPlayout(sampleRate=" + i10 + ", channels=" + i11 + ", bufferSizeFactor=" + d10 + Separators.RPAREN);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i10 / BUFFERS_PER_SECOND) * i11 * 2);
        this.byteBuffer = allocateDirect;
        AbstractC4194d.y("byteBuffer.capacity: ", allocateDirect.capacity(), TAG);
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i11);
        int minBufferSize = (int) (((double) AudioTrack.getMinBufferSize(i10, channelCountToConfiguration, 2)) * d10);
        AbstractC4194d.y("minBufferSizeInBytes: ", minBufferSize, TAG);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        } else if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        } else {
            try {
                AudioTrack createAudioTrack = createAudioTrack(i10, channelCountToConfiguration, minBufferSize);
                this.audioTrack = createAudioTrack;
                if (createAudioTrack != null && createAudioTrack.getState() == 1) {
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

    private void logUnderrunCount() {
        int underrunCount;
        if (Build.VERSION.SDK_INT >= 24) {
            underrunCount = this.audioTrack.getUnderrunCount();
            AbstractC4194d.y("underrun count: ", underrunCount, TAG);
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i10, long j6);

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
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i10) {
        synchronized (WebRtcAudioTrack.class) {
            Logging.w(TAG, "Default usage attribute is changed from: 2 to " + i10);
            usageAttribute = i10;
        }
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z10) {
        Logging.w(TAG, "setSpeakerMute(" + z10 + Separators.RPAREN);
        speakerMute = z10;
    }

    private boolean setStreamVolume(int i10) {
        boolean z10;
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "setStreamVolume(" + i10 + Separators.RPAREN);
        if (this.audioManager != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
        if (this.audioManager.isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i10, 0);
        return true;
    }

    private boolean startPlayout() {
        boolean z10;
        boolean z11;
        this.threadChecker.checkIsOnValidThread();
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
                reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, a.e("AudioTrack.play failed - incorrect state :", this.audioTrack.getPlayState()));
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e10) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, R.a.r("AudioTrack.play failed: ", e10.getMessage()));
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        boolean z10;
        this.threadChecker.checkIsOnValidThread();
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
            WebRtcAudioUtils.logAudioState(TAG);
        }
        Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }
}

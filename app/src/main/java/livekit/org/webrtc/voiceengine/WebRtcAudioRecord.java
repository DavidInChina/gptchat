package livekit.org.webrtc.voiceengine;

import A.AbstractC0044t0;
import E9.f;
import R.a;
import android.gov.nist.core.Separators;
import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k6.AbstractC4194d;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.ThreadUtils;

/* loaded from: classes.dex */
public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_AUDIO_SOURCE;
    private static final String TAG = "WebRtcAudioRecord";
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource;
    private static WebRtcAudioRecordErrorCallback errorCallback;
    private static volatile boolean microphoneMute;
    private AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects = WebRtcAudioEffects.create();
    private byte[] emptyBytes;
    private final long nativeAudioRecord;

    /* loaded from: classes2.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* loaded from: classes2.dex */
    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive = true;

        public AudioRecordThread(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z10;
            Process.setThreadPriority(-19);
            AbstractC4194d.z("AudioRecordThread", WebRtcAudioUtils.getThreadInfo(), WebRtcAudioRecord.TAG);
            if (WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            WebRtcAudioRecord.assertTrue(z10);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        ByteBuffer byteBuffer = (ByteBuffer) WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity()), 0));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + read;
                    Logging.e(WebRtcAudioRecord.TAG, str);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e10) {
                Logging.e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e10.getMessage());
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* loaded from: classes.dex */
    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public /* synthetic */ AudioSamples(AudioRecord audioRecord, byte[] bArr, int i10) {
            this(audioRecord, bArr);
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }
    }

    /* loaded from: classes2.dex */
    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    /* loaded from: classes.dex */
    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    public WebRtcAudioRecord(long j6) {
        AbstractC4194d.z("ctor", WebRtcAudioUtils.getThreadInfo(), TAG);
        this.nativeAudioRecord = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z10) {
        if (z10) {
            return;
        }
        throw new AssertionError("Expected condition to be true");
    }

    private int channelCountToConfiguration(int i10) {
        return i10 == 1 ? 16 : 12;
    }

    private boolean enableBuiltInAEC(boolean z10) {
        Logging.d(TAG, "enableBuiltInAEC(" + z10 + Separators.RPAREN);
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e(TAG, "Built-in AEC is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setAEC(z10);
    }

    private boolean enableBuiltInNS(boolean z10) {
        Logging.d(TAG, "enableBuiltInNS(" + z10 + Separators.RPAREN);
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e(TAG, "Built-in NS is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setNS(z10);
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private int initRecording(int i10, int i11) {
        Logging.d(TAG, AbstractC0044t0.y("initRecording(sampleRate=", i10, ", channels=", i11, Separators.RPAREN));
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i12 = i10 / BUFFERS_PER_SECOND;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * 2 * i12);
        this.byteBuffer = allocateDirect;
        AbstractC4194d.y("byteBuffer.capacity: ", allocateDirect.capacity(), TAG);
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int channelCountToConfiguration = channelCountToConfiguration(i11);
        int minBufferSize = AudioRecord.getMinBufferSize(i10, channelCountToConfiguration, 2);
        if (minBufferSize != -1 && minBufferSize != -2) {
            Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
            int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
            AbstractC4194d.y("bufferSizeInBytes: ", max, TAG);
            try {
                AudioRecord audioRecord = new AudioRecord(audioSource, i10, channelCountToConfiguration, 2, max);
                this.audioRecord = audioRecord;
                if (audioRecord.getState() != 1) {
                    reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                    releaseAudioResources();
                    return -1;
                }
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
                }
                logMainParameters();
                logMainParametersExtended();
                return i12;
            } catch (IllegalArgumentException e10) {
                reportWebRtcAudioRecordInitError(a.r("AudioRecord ctor error: ", e10.getMessage()));
                releaseAudioResources();
                return -1;
            }
        }
        reportWebRtcAudioRecordInitError(android.gov.nist.core.a.e("AudioRecord.getMinBufferSize failed: ", minBufferSize));
        return -1;
    }

    private void logMainParameters() {
        int audioSessionId = this.audioRecord.getAudioSessionId();
        int channelCount = this.audioRecord.getChannelCount();
        int sampleRate = this.audioRecord.getSampleRate();
        StringBuilder A10 = f.A("AudioRecord: session ID: ", audioSessionId, ", channels: ", channelCount, ", sample rate: ");
        A10.append(sampleRate);
        Logging.d(TAG, A10.toString());
    }

    private void logMainParametersExtended() {
        AbstractC4194d.y("AudioRecord: buffer size in frames: ", this.audioRecord.getBufferSizeInFrames(), TAG);
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(int i10, long j6);

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static synchronized void setAudioSource(int i10) {
        synchronized (WebRtcAudioRecord.class) {
            int i11 = audioSource;
            Logging.w(TAG, "Audio source is changed from: " + i11 + " to " + i10);
            audioSource = i10;
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z10) {
        Logging.w(TAG, "setMicrophoneMute(" + z10 + Separators.RPAREN);
        microphoneMute = z10;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() {
        boolean z10;
        boolean z11;
        Logging.d(TAG, "startRecording");
        if (this.audioRecord != null) {
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
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, android.gov.nist.core.a.e("AudioRecord.startRecording failed - incorrect state :", this.audioRecord.getRecordingState()));
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e10) {
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, a.r("AudioRecord.startRecording failed: ", e10.getMessage()));
            return false;
        }
    }

    private boolean stopRecording() {
        boolean z10;
        Logging.d(TAG, "stopRecording");
        if (this.audioThread != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }
}

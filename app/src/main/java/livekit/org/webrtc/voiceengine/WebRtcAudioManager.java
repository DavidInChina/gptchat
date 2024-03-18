package livekit.org.webrtc.voiceengine;

import A.AbstractC0044t0;
import android.gov.nist.core.Separators;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Timer;
import java.util.TimerTask;
import k6.AbstractC4194d;
import livekit.org.webrtc.ContextUtils;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final VolumeLogger volumeLogger;

    /* loaded from: classes2.dex */
    public static class VolumeLogger {
        private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
        private static final int TIMER_PERIOD_IN_SECONDS = 30;
        private final AudioManager audioManager;
        private Timer timer;

        /* loaded from: classes.dex */
        public class LogVolumeTask extends TimerTask {
            private final int maxRingVolume;
            private final int maxVoiceCallVolume;

            public LogVolumeTask(int i10, int i11) {
                this.maxRingVolume = i10;
                this.maxVoiceCallVolume = i11;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int mode = VolumeLogger.this.audioManager.getMode();
                if (mode == 1) {
                    Logging.d(WebRtcAudioManager.TAG, AbstractC0044t0.y("STREAM_RING stream volume: ", VolumeLogger.this.audioManager.getStreamVolume(2), " (max=", this.maxRingVolume, Separators.RPAREN));
                } else if (mode == 3) {
                    Logging.d(WebRtcAudioManager.TAG, AbstractC0044t0.y("VOICE_CALL stream volume: ", VolumeLogger.this.audioManager.getStreamVolume(0), " (max=", this.maxVoiceCallVolume, Separators.RPAREN));
                }
            }
        }

        public VolumeLogger(AudioManager audioManager) {
            this.audioManager = audioManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stop() {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
        }

        public void start() {
            Timer timer = new Timer(THREAD_NAME);
            this.timer = timer;
            timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
        }
    }

    public WebRtcAudioManager(long j6) {
        AbstractC4194d.z("ctor", WebRtcAudioUtils.getThreadInfo(), TAG);
        this.nativeAudioManager = j6;
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.audioManager = audioManager;
        this.volumeLogger = new VolumeLogger(audioManager);
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j6);
        WebRtcAudioUtils.logAudioState(TAG);
    }

    private static void assertTrue(boolean z10) {
        if (z10) {
            return;
        }
        throw new AssertionError("Expected condition to be true");
    }

    private void dispose() {
        AbstractC4194d.z("dispose", WebRtcAudioUtils.getThreadInfo(), TAG);
        if (this.initialized) {
            this.volumeLogger.stop();
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return DEFAULT_FRAME_PER_BUFFER;
        }
        return Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i10, int i11) {
        int i12;
        int i13 = i11 * 2;
        if (i11 == 1) {
            i12 = 16;
        } else {
            i12 = 12;
        }
        return AudioRecord.getMinBufferSize(i10, i12, 2) / i13;
    }

    private static int getMinOutputFrameSize(int i10, int i11) {
        int i12;
        int i13 = i11 * 2;
        if (i11 == 1) {
            i12 = 4;
        } else {
            i12 = 12;
        }
        return AudioTrack.getMinBufferSize(i10, i12, 2) / i13;
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        } else if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            int defaultSampleRateHz = WebRtcAudioUtils.getDefaultSampleRateHz();
            Logging.d(TAG, "Default sample rate is overriden to " + defaultSampleRateHz + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        } else {
            int sampleRateForApiLevel = getSampleRateForApiLevel();
            Logging.d(TAG, "Sample rate is set to " + sampleRateForApiLevel + " Hz");
            return sampleRateForApiLevel;
        }
    }

    private int getSampleRateForApiLevel() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        return Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        boolean z10;
        synchronized (WebRtcAudioManager.class) {
            z10 = useStereoInput;
        }
        return z10;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z10;
        synchronized (WebRtcAudioManager.class) {
            z10 = useStereoOutput;
        }
        return z10;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        AbstractC4194d.z("init", WebRtcAudioUtils.getThreadInfo(), TAG);
        if (this.initialized) {
            return blacklistDeviceForAAudioUsage;
        }
        AbstractC4194d.z("audio mode is: ", WebRtcAudioUtils.modeToString(this.audioManager.getMode()), TAG);
        this.initialized = blacklistDeviceForAAudioUsage;
        this.volumeLogger.start();
        return blacklistDeviceForAAudioUsage;
    }

    private boolean isAAudioSupported() {
        Logging.w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        if (this.audioManager.getMode() == 3) {
            return blacklistDeviceForAAudioUsage;
        }
        return false;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean z10;
        if (blacklistDeviceForOpenSLESUsageIsOverridden) {
            z10 = blacklistDeviceForOpenSLESUsage;
        } else {
            z10 = WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        }
        if (z10) {
            String str = Build.MODEL;
            Logging.d(TAG, str + " is blacklisted for OpenSL ES usage!");
        }
        return z10;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isProAudioSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    private native void nativeCacheAudioParameters(int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i13, int i14, long j6);

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z10) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = blacklistDeviceForAAudioUsage;
            blacklistDeviceForOpenSLESUsage = z10;
        }
    }

    public static synchronized void setStereoInput(boolean z10) {
        synchronized (WebRtcAudioManager.class) {
            Logging.w(TAG, "Overriding default input behavior: setStereoInput(" + z10 + Separators.RPAREN);
            useStereoInput = z10;
        }
    }

    public static synchronized void setStereoOutput(boolean z10) {
        synchronized (WebRtcAudioManager.class) {
            Logging.w(TAG, "Overriding default output behavior: setStereoOutput(" + z10 + Separators.RPAREN);
            useStereoOutput = z10;
        }
    }

    private void storeAudioParameters() {
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        if (getStereoOutput()) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        this.outputChannels = i10;
        if (getStereoInput()) {
            i13 = 2;
        }
        this.inputChannels = i13;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        if (this.lowLatencyOutput) {
            i11 = getLowLatencyOutputFramesPerBuffer();
        } else {
            i11 = getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        }
        this.outputBufferSize = i11;
        if (this.lowLatencyInput) {
            i12 = getLowLatencyInputFramesPerBuffer();
        } else {
            i12 = getMinInputFrameSize(this.sampleRate, this.inputChannels);
        }
        this.inputBufferSize = i12;
    }

    public boolean isLowLatencyInputSupported() {
        return isLowLatencyOutputSupported();
    }
}

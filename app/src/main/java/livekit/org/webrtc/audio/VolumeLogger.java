package livekit.org.webrtc.audio;

import A.AbstractC0044t0;
import android.gov.nist.core.Separators;
import android.media.AudioManager;
import java.util.Timer;
import java.util.TimerTask;
import k6.AbstractC4194d;
import livekit.org.webrtc.Logging;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class VolumeLogger {
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;
    private Timer timer;

    /* loaded from: classes2.dex */
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
                Logging.d(VolumeLogger.TAG, AbstractC0044t0.y("STREAM_RING stream volume: ", VolumeLogger.this.audioManager.getStreamVolume(2), " (max=", this.maxRingVolume, Separators.RPAREN));
            } else if (mode == 3) {
                Logging.d(VolumeLogger.TAG, AbstractC0044t0.y("VOICE_CALL stream volume: ", VolumeLogger.this.audioManager.getStreamVolume(0), " (max=", this.maxVoiceCallVolume, Separators.RPAREN));
            }
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        AbstractC4194d.z("start", WebRtcAudioUtils.getThreadInfo(), TAG);
        if (this.timer != null) {
            return;
        }
        String modeToString = WebRtcAudioUtils.modeToString(this.audioManager.getMode());
        Logging.d(TAG, "audio mode is: " + modeToString);
        Timer timer = new Timer(THREAD_NAME);
        this.timer = timer;
        timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
    }

    public void stop() {
        AbstractC4194d.z("stop", WebRtcAudioUtils.getThreadInfo(), TAG);
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}

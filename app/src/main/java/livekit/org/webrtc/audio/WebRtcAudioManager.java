package livekit.org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import livekit.org.webrtc.CalledByNative;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioManagerExternal";

    @CalledByNative
    public static AudioManager getAudioManager(Context context) {
        return (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    @CalledByNative
    public static int getInputBufferSize(Context context, AudioManager audioManager, int i10, int i11) {
        if (isLowLatencyInputSupported(context)) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinInputFrameSize(i10, i11);
    }

    private static int getLowLatencyFramesPerBuffer(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
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

    @CalledByNative
    public static int getOutputBufferSize(Context context, AudioManager audioManager, int i10, int i11) {
        if (isLowLatencyOutputSupported(context)) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinOutputFrameSize(i10, i11);
    }

    @CalledByNative
    public static int getSampleRate(AudioManager audioManager) {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel(audioManager);
        Logging.d(TAG, "Sample rate is set to " + sampleRateForApiLevel + " Hz");
        return sampleRateForApiLevel;
    }

    private static int getSampleRateForApiLevel(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return DEFAULT_SAMPLE_RATE_HZ;
        }
        return Integer.parseInt(property);
    }

    private static boolean isLowLatencyInputSupported(Context context) {
        return isLowLatencyOutputSupported(context);
    }

    private static boolean isLowLatencyOutputSupported(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}

package livekit.org.webrtc.audio;

import android.gov.nist.core.Separators;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import java.util.UUID;
import k6.AbstractC4194d;
import livekit.org.webrtc.Logging;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffectsExternal";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;
    private NoiseSuppressor ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    public WebRtcAudioEffects() {
        AbstractC4194d.z("ctor", WebRtcAudioUtils.getThreadInfo(), TAG);
    }

    private static void assertTrue(boolean z10) {
        if (z10) {
            return;
        }
        throw new AssertionError("Expected condition to be true");
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if ((AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported())) {
            return true;
        }
        return false;
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    private static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !descriptor.uuid.equals(uuid2);
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    public void enable(int i10) {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        String str2;
        String str3;
        Logging.d(TAG, "enable(audioSession=" + i10 + Separators.RPAREN);
        boolean z13 = false;
        if (this.aec == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        assertTrue(z10);
        if (this.ns == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        assertTrue(z11);
        String str4 = "disabled";
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i10);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                if (this.shouldEnableAec && isAcousticEchoCancelerSupported()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.aec.setEnabled(z12) != 0) {
                    Logging.e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                if (enabled) {
                    str2 = "enabled";
                } else {
                    str2 = str4;
                }
                if (this.aec.getEnabled()) {
                    str3 = "enabled";
                } else {
                    str3 = str4;
                }
                Logging.d(TAG, "AcousticEchoCanceler: was " + str2 + ", enable: " + z12 + ", is now: " + str3);
            } else {
                Logging.e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i10);
            this.ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                if (this.shouldEnableNs && isNoiseSuppressorSupported()) {
                    z13 = true;
                }
                if (this.ns.setEnabled(z13) != 0) {
                    Logging.e(TAG, "Failed to set the NoiseSuppressor state");
                }
                if (enabled2) {
                    str = "enabled";
                } else {
                    str = str4;
                }
                if (this.ns.getEnabled()) {
                    str4 = "enabled";
                }
                Logging.d(TAG, "NoiseSuppressor: was " + str + ", enable: " + z13 + ", is now: " + str4);
                return;
            }
            Logging.e(TAG, "Failed to create the NoiseSuppressor instance");
        }
    }

    public void release() {
        Logging.d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z10) {
        Logging.d(TAG, "setAEC(" + z10 + Separators.RPAREN);
        if (!isAcousticEchoCancelerSupported()) {
            Logging.w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec != null && z10 != this.shouldEnableAec) {
            Logging.e(TAG, "Platform AEC state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableAec = z10;
            return true;
        }
    }

    public boolean setNS(boolean z10) {
        Logging.d(TAG, "setNS(" + z10 + Separators.RPAREN);
        if (!isNoiseSuppressorSupported()) {
            Logging.w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.ns != null && z10 != this.shouldEnableNs) {
            Logging.e(TAG, "Platform NS state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableNs = z10;
            return true;
        }
    }
}

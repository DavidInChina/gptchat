package A2;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class E {
    public static void a(AudioTrack audioTrack, G g10) {
        AudioDeviceInfo audioDeviceInfo;
        if (g10 == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = g10.f393a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}

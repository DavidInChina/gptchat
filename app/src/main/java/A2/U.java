package A2;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class U {
    public static void a(AbstractC0075t abstractC0075t, Object obj) {
        G g10;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        S s10 = (S) abstractC0075t;
        if (audioDeviceInfo == null) {
            g10 = null;
        } else {
            s10.getClass();
            g10 = new G(audioDeviceInfo);
        }
        s10.f459b0 = g10;
        AudioTrack audioTrack = s10.f487x;
        if (audioTrack != null) {
            E.a(audioTrack, g10);
        }
    }
}

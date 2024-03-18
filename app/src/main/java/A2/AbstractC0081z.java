package A2;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import s2.AbstractC5530A;

/* renamed from: A2.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0081z {
    public static C0064h a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C0064h.f554d;
        }
        boolean z11 = false;
        C0063g c0063g = new C0063g(0);
        if (AbstractC5530A.f45131a > 32 && playbackOffloadSupport == 2) {
            z11 = true;
        }
        c0063g.f551a = true;
        c0063g.f552b = z11;
        c0063g.f553c = z10;
        return c0063g.a();
    }
}

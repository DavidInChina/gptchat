package A2;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: A2.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0080y {
    public static C0064h a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return C0064h.f554d;
        }
        C0063g c0063g = new C0063g(0);
        c0063g.f551a = true;
        c0063g.f553c = z10;
        return c0063g.a();
    }
}

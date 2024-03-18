package androidx.compose.ui.input.key;

import A.C0043t;
import android.view.KeyEvent;
import l0.AbstractC4326r;
import wf.k;
import z0.C6738a;

/* loaded from: classes.dex */
public abstract class a {
    public static final long a(int i10) {
        long j6 = (i10 << 32) | (0 & 4294967295L);
        int i11 = C6738a.f51430n;
        return j6;
    }

    public static final long b(KeyEvent keyEvent) {
        return a(keyEvent.getKeyCode());
    }

    public static final int c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public static final AbstractC4326r d(AbstractC4326r abstractC4326r, k kVar) {
        return abstractC4326r.g(new KeyInputElement(kVar, null));
    }

    public static final AbstractC4326r e(AbstractC4326r abstractC4326r, C0043t c0043t) {
        return abstractC4326r.g(new KeyInputElement(null, c0043t));
    }
}

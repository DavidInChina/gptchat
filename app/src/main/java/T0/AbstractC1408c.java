package T0;

import android.view.inputmethod.CursorAnchorInfo;
import q0.C5252d;

/* renamed from: T0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1408c {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, N0.C c10, C5252d c5252d) {
        int h10;
        int h11;
        if (c5252d.f43625a < c5252d.f43627c) {
            float f6 = c5252d.f43626b;
            float f10 = c5252d.f43628d;
            if (f6 < f10 && (h10 = c10.h(f6)) <= (h11 = c10.h(f10))) {
                while (true) {
                    builder.addVisibleLineBounds(c10.i(h10), c10.l(h10), c10.j(h10), c10.e(h10));
                    if (h10 == h11) {
                        break;
                    }
                    h10++;
                }
            }
        }
        return builder;
    }
}

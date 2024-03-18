package A;

import android.os.Build;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: A.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0032n {

    /* renamed from: a  reason: collision with root package name */
    public static final AbstractC4326r f256a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        AbstractC4326r abstractC4326r = C4323o.f37719b;
        if (i10 >= 31) {
            abstractC4326r = androidx.compose.ui.layout.a.g(androidx.compose.ui.layout.a.g(abstractC4326r, C0030m.f251Z), C0030m.f252h0);
        }
        f256a = abstractC4326r;
    }
}

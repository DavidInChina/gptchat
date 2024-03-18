package A;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import l0.AbstractC4326r;
import l0.C4323o;

/* loaded from: classes.dex */
public abstract class A0 {

    /* renamed from: a  reason: collision with root package name */
    public static final L0.u f8a = new L0.u("MagnifierPositionInRoot");

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static AbstractC4326r b(G.X x10, N.i0 i0Var, N0 n02) {
        C4323o c4323o = C4323o.f37719b;
        long j6 = Z0.g.f22793c;
        if (a()) {
            return new MagnifierElement(x10, null, i0Var, Float.NaN, true, j6, Float.NaN, Float.NaN, true, n02);
        }
        return H0.Q.s(c4323o, c4323o);
    }
}

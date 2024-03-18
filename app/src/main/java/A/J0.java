package A;

import id.AbstractC3557B;
import jf.C3970t;

/* loaded from: classes2.dex */
public final class J0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f80a;

    /* renamed from: b  reason: collision with root package name */
    public final E.g0 f81b;

    public J0() {
        long c10 = androidx.compose.ui.graphics.a.c(4284900966L);
        E.i0 b10 = androidx.compose.foundation.layout.a.b(0.0f, 3);
        this.f80a = c10;
        this.f81b = b10;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(J0.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration", obj);
        J0 j02 = (J0) obj;
        if (r0.r.c(this.f80a, j02.f80a) && AbstractC3557B.K(this.f81b, j02.f81b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return this.f81b.hashCode() + (C3970t.a(this.f80a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC0044t0.B(this.f80a, sb2, ", drawPadding=");
        sb2.append(this.f81b);
        sb2.append(')');
        return sb2.toString();
    }
}

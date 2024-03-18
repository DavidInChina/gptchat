package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Za.i0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1852i0 {
    public static final C1850h0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23564a;

    public C1852i0(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f23564a = str;
        } else {
            R4.b.e2(i10, 1, C1848g0.f23561b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1852i0) && AbstractC3557B.K(this.f23564a, ((C1852i0) obj).f23564a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23564a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ApiGizmoToolAuth(type="), this.f23564a, Separators.RPAREN);
    }
}

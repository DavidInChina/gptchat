package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import cb.C2350T;
import cb.C2353W;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import yf.AbstractC6583a;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class P {
    public static final O Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final T f23496a;

    /* renamed from: b  reason: collision with root package name */
    public final W f23497b;

    public P(int i10, T t10, W w10) {
        if (3 == (i10 & 3)) {
            this.f23496a = t10;
            this.f23497b = w10;
            return;
        }
        R4.b.e2(i10, 3, N.f23489b);
        throw null;
    }

    public final C2350T a() {
        C2353W c2353w;
        T t10 = this.f23496a;
        if (t10 != null) {
            String str = t10.f23518d;
            boolean f22 = Lg.n.f2(str, "featured");
            boolean f23 = Lg.n.f2(str, "ranked");
            c2353w = new C2353W(t10.f23515a, t10.f23516b, t10.f23517c, f22, f23);
        } else {
            c2353w = new C2353W();
        }
        W w10 = this.f23497b;
        List<M> list = w10.f23526a;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (M m10 : list) {
            arrayList.add(m10.f23484a.a());
        }
        return new C2350T(c2353w, arrayList, w10.f23527b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        if (AbstractC3557B.K(this.f23496a, p10.f23496a) && AbstractC3557B.K(this.f23497b, p10.f23497b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        T t10 = this.f23496a;
        if (t10 == null) {
            i10 = 0;
        } else {
            i10 = t10.hashCode();
        }
        return this.f23497b.hashCode() + (i10 * 31);
    }

    public final String toString() {
        return "ApiGizmoList(info=" + this.f23496a + ", list=" + this.f23497b + Separators.RPAREN;
    }
}

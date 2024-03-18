package E;

import Z.C1724m0;
import Z.o1;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class y0 implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3981a;

    /* renamed from: b  reason: collision with root package name */
    public final C1724m0 f3982b;

    public y0(V v10, String str) {
        this.f3981a = str;
        this.f3982b = AbstractC4828h.Z(v10, o1.f22665a);
    }

    @Override // E.A0
    public final int a(Z0.b bVar, Z0.l lVar) {
        return e().f3823a;
    }

    @Override // E.A0
    public final int b(Z0.b bVar, Z0.l lVar) {
        return e().f3825c;
    }

    @Override // E.A0
    public final int c(Z0.b bVar) {
        return e().f3824b;
    }

    @Override // E.A0
    public final int d(Z0.b bVar) {
        return e().f3826d;
    }

    public final V e() {
        return (V) this.f3982b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        return AbstractC3557B.K(e(), ((y0) obj).e());
    }

    public final void f(V v10) {
        this.f3982b.setValue(v10);
    }

    public final int hashCode() {
        return this.f3981a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3981a);
        sb2.append("(left=");
        sb2.append(e().f3823a);
        sb2.append(", top=");
        sb2.append(e().f3824b);
        sb2.append(", right=");
        sb2.append(e().f3825c);
        sb2.append(", bottom=");
        return AbstractC2469q0.j(sb2, e().f3826d, ')');
    }
}

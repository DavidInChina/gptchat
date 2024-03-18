package S8;

import A.C0053y;
import E.AbstractC0434s;
import H0.AbstractC0701r0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: S8.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1359c implements AbstractC1360d {

    /* renamed from: a  reason: collision with root package name */
    public final long f16309a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16310b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16311c;

    /* renamed from: d  reason: collision with root package name */
    public final wf.k f16312d;

    public C1359c() {
        long V10 = M3.H.V(6);
        long V11 = M3.H.V(3);
        long V12 = M3.H.V(6);
        C1358b c1358b = C1358b.f16299Z;
        this.f16309a = V10;
        this.f16310b = V11;
        this.f16311c = V12;
        this.f16312d = c1358b;
    }

    public final void a(M m10, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        Z.r rVar;
        int i12;
        int i13;
        AbstractC3557B.c0("<this>", m10);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(2046098125);
        if ((i10 & 14) == 0) {
            if (rVar2.g(m10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar2.g(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && rVar2.B()) {
            rVar2.P();
            rVar = rVar2;
        } else {
            Z0.b bVar = (Z0.b) rVar2.m(AbstractC0701r0.f7002e);
            long j6 = ((r0.r) this.f16312d.invoke(new r0.r(L.d(m10, rVar2)))).f44265a;
            long j10 = this.f16309a;
            Z0.n nVar = new Z0.n(j10);
            long j11 = this.f16311c;
            Z0.n nVar2 = new Z0.n(j11);
            long j12 = this.f16310b;
            Object[] objArr = {nVar, nVar2, new Z0.n(j12), new r0.r(j6)};
            rVar = rVar2;
            rVar.W(-568225417);
            int i14 = 0;
            boolean z10 = false;
            for (int i15 = 4; i14 < i15; i15 = 4) {
                z10 |= rVar.g(objArr[i14]);
                i14++;
            }
            Object K10 = rVar.K();
            if (z10 || K10 == C1723m.f22654Y) {
                AbstractC4326r m11 = androidx.compose.foundation.layout.e.m(androidx.compose.foundation.layout.a.v(C4323o.f37719b, bVar.t(j10), 0.0f, bVar.t(j11), 0.0f, 10), bVar.t(j12));
                K.e eVar = K.f.f9317a;
                K.d dVar = new K.d(50);
                K10 = androidx.compose.foundation.a.d(m11, j6, new K.a(dVar, dVar, dVar, dVar));
                rVar.h0(K10);
            }
            rVar.t(false);
            AbstractC0434s.a((AbstractC4326r) K10, rVar, 0);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0053y(this, m10, i10, 9);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1359c)) {
            return false;
        }
        C1359c c1359c = (C1359c) obj;
        if (Z0.n.a(this.f16309a, c1359c.f16309a) && Z0.n.a(this.f16310b, c1359c.f16310b) && Z0.n.a(this.f16311c, c1359c.f16311c) && AbstractC3557B.K(this.f16312d, c1359c.f16312d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d10 = Z0.n.d(this.f16310b);
        int d11 = Z0.n.d(this.f16311c);
        return this.f16312d.hashCode() + ((d11 + ((d10 + (Z0.n.d(this.f16309a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String e10 = Z0.n.e(this.f16309a);
        String e11 = Z0.n.e(this.f16310b);
        String e12 = Z0.n.e(this.f16311c);
        StringBuilder t10 = android.gov.nist.core.a.t("BarGutter(startMargin=", e10, ", barWidth=", e11, ", endMargin=");
        t10.append(e12);
        t10.append(", color=");
        t10.append(this.f16312d);
        t10.append(Separators.RPAREN);
        return t10.toString();
    }
}

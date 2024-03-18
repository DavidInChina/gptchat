package F;

import G.C0550e;
import G.e0;
import Z.AbstractC1725n;
import Z.C1741v0;
import id.AbstractC3557B;
import z.C6675O;

/* loaded from: classes.dex */
public final class p implements G.F {

    /* renamed from: a  reason: collision with root package name */
    public final J f4947a;

    /* renamed from: b  reason: collision with root package name */
    public final C0535i f4948b;

    /* renamed from: c  reason: collision with root package name */
    public final C0529c f4949c;

    /* renamed from: d  reason: collision with root package name */
    public final G.H f4950d;

    public p(J j6, C0535i c0535i, C0529c c0529c, e0 e0Var) {
        this.f4947a = j6;
        this.f4948b = c0535i;
        this.f4949c = c0529c;
        this.f4950d = e0Var;
    }

    @Override // G.F
    public final int a() {
        return this.f4948b.B().f5494b;
    }

    @Override // G.F
    public final Object b(int i10) {
        Object b10 = this.f4950d.b(i10);
        if (b10 == null) {
            return this.f4948b.C(i10);
        }
        return b10;
    }

    @Override // G.F
    public final int c(Object obj) {
        return this.f4950d.c(obj);
    }

    @Override // G.F
    public final Object d(int i10) {
        C0550e d10 = this.f4948b.f4929n0.d(i10);
        return ((G.B) d10.f5498c).getType().invoke(Integer.valueOf(i10 - d10.f5496a));
    }

    @Override // G.F
    public final void e(int i10, Object obj, AbstractC1725n abstractC1725n, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-462424778);
        Gi.e.c(obj, i10, this.f4947a.f4890t, R4.b.X(rVar, -824725566, new C6675O(this, i10, 1)), rVar, ((i11 << 3) & 112) | 3592);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new o(this, i10, obj, i11, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return AbstractC3557B.K(this.f4948b, ((p) obj).f4948b);
    }

    public final int hashCode() {
        return this.f4948b.hashCode();
    }
}

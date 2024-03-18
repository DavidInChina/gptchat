package H;

import G.e0;
import Z.AbstractC1725n;
import Z.C1741v0;
import id.AbstractC3557B;
import z.C6675O;

/* loaded from: classes2.dex */
public final class t implements G.F {

    /* renamed from: a  reason: collision with root package name */
    public final F f6666a;

    /* renamed from: b  reason: collision with root package name */
    public final K4.J f6667b;

    /* renamed from: c  reason: collision with root package name */
    public final G.H f6668c;

    public t(F f6, s sVar, e0 e0Var) {
        this.f6666a = f6;
        this.f6667b = sVar;
        this.f6668c = e0Var;
    }

    @Override // G.F
    public final int a() {
        return this.f6667b.B().f5494b;
    }

    @Override // G.F
    public final Object b(int i10) {
        Object b10 = this.f6668c.b(i10);
        if (b10 == null) {
            return this.f6667b.C(i10);
        }
        return b10;
    }

    @Override // G.F
    public final int c(Object obj) {
        return this.f6668c.c(obj);
    }

    @Override // G.F
    public final /* synthetic */ Object d(int i10) {
        return null;
    }

    @Override // G.F
    public final void e(int i10, Object obj, AbstractC1725n abstractC1725n, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1201380429);
        Gi.e.c(obj, i10, this.f6666a.f6571z, R4.b.X(rVar, 1142237095, new C6675O(this, i10, 3)), rVar, ((i11 << 3) & 112) | 3592);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new F.o(this, i10, obj, i11, 1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return AbstractC3557B.K(this.f6667b, ((t) obj).f6667b);
    }

    public final int hashCode() {
        return this.f6667b.hashCode();
    }
}

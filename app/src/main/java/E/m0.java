package E;

import A.AbstractC0044t0;
import h.C3281g;
import id.AbstractC3557B;
import java.util.List;
import y.AbstractC6463a;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class m0 implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final int f3914a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0425i f3915b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0427k f3916c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3917d;

    /* renamed from: e  reason: collision with root package name */
    public final r.f f3918e;

    public m0(int i10, AbstractC0425i abstractC0425i, AbstractC0427k abstractC0427k, float f6, r.f fVar) {
        this.f3914a = i10;
        this.f3915b = abstractC0425i;
        this.f3916c = abstractC0427k;
        this.f3917d = f6;
        this.f3918e = fVar;
    }

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        AbstractC0427k abstractC0427k = this.f3916c;
        float f6 = this.f3917d;
        n0 n0Var = new n0(this.f3914a, this.f3915b, abstractC0427k, f6, this.f3918e, list, new E0.d0[list.size()]);
        l0 c10 = n0Var.c(p10, j6, 0, list.size());
        int i10 = this.f3914a;
        int i11 = c10.f3901a;
        int i12 = c10.f3902b;
        if (i10 == 1) {
            i12 = i11;
            i11 = i12;
        }
        return p10.j0(i11, i12, kf.w.f37484Y, new C3281g(n0Var, c10, p10, 9));
    }

    @Override // E0.N
    public final int b(G0.g0 g0Var, List list, int i10) {
        M m10;
        if (this.f3914a == 1) {
            m10 = M.f3789k0;
        } else {
            m10 = M.f3793o0;
        }
        Integer valueOf = Integer.valueOf(i10);
        g0Var.getClass();
        return ((Number) m10.invoke(list, valueOf, Integer.valueOf(R.a.b(this.f3917d, g0Var)))).intValue();
    }

    @Override // E0.N
    public final int c(G0.g0 g0Var, List list, int i10) {
        M m10;
        if (this.f3914a == 1) {
            m10 = M.f3790l0;
        } else {
            m10 = M.f3794p0;
        }
        Integer valueOf = Integer.valueOf(i10);
        g0Var.getClass();
        return ((Number) m10.invoke(list, valueOf, Integer.valueOf(R.a.b(this.f3917d, g0Var)))).intValue();
    }

    @Override // E0.N
    public final int d(G0.g0 g0Var, List list, int i10) {
        M m10;
        if (this.f3914a == 1) {
            m10 = M.f3791m0;
        } else {
            m10 = M.f3795q0;
        }
        Integer valueOf = Integer.valueOf(i10);
        g0Var.getClass();
        return ((Number) m10.invoke(list, valueOf, Integer.valueOf(R.a.b(this.f3917d, g0Var)))).intValue();
    }

    @Override // E0.N
    public final int e(G0.g0 g0Var, List list, int i10) {
        M m10;
        if (this.f3914a == 1) {
            m10 = M.f3788j0;
        } else {
            m10 = M.f3792n0;
        }
        Integer valueOf = Integer.valueOf(i10);
        g0Var.getClass();
        return ((Number) m10.invoke(list, valueOf, Integer.valueOf(R.a.b(this.f3917d, g0Var)))).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.f3914a == m0Var.f3914a && AbstractC3557B.K(this.f3915b, m0Var.f3915b) && AbstractC3557B.K(this.f3916c, m0Var.f3916c) && Z0.e.a(this.f3917d, m0Var.f3917d) && AbstractC3557B.K(this.f3918e, m0Var.f3918e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f6 = AbstractC6708l.f(this.f3914a) * 31;
        int i11 = 0;
        AbstractC0425i abstractC0425i = this.f3915b;
        if (abstractC0425i == null) {
            i10 = 0;
        } else {
            i10 = abstractC0425i.hashCode();
        }
        int i12 = (f6 + i10) * 31;
        AbstractC0427k abstractC0427k = this.f3916c;
        if (abstractC0427k != null) {
            i11 = abstractC0427k.hashCode();
        }
        return this.f3918e.hashCode() + AbstractC6708l.d(1, AbstractC6463a.e(this.f3917d, (i12 + i11) * 31, 31), 31);
    }

    public final String toString() {
        return "RowColumnMeasurePolicy(orientation=" + AbstractC0044t0.M(this.f3914a) + ", horizontalArrangement=" + this.f3915b + ", verticalArrangement=" + this.f3916c + ", arrangementSpacing=" + ((Object) Z0.e.b(this.f3917d)) + ", crossAxisSize=" + AbstractC0044t0.N(1) + ", crossAxisAlignment=" + this.f3918e + ')';
    }
}

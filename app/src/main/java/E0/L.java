package E0;

import id.AbstractC3557B;
import l8.AbstractC4344b;
import q0.C5251c;
import q0.C5252d;

/* loaded from: classes.dex */
public final class L implements AbstractC0461u {

    /* renamed from: Y  reason: collision with root package name */
    public final G0.T f4030Y;

    public L(G0.T t10) {
        this.f4030Y = t10;
    }

    @Override // E0.AbstractC0461u
    public final long B(AbstractC0461u abstractC0461u, long j6) {
        boolean z10 = abstractC0461u instanceof L;
        G0.T t10 = this.f4030Y;
        if (z10) {
            G0.T t11 = ((L) abstractC0461u).f4030Y;
            t11.f5673n0.N0();
            G0.T E02 = t10.f5673n0.C0(t11.f5673n0).E0();
            if (E02 != null) {
                long v02 = t11.v0(E02);
                long c10 = kotlin.jvm.internal.m.c(AbstractC4344b.Y0(C5251c.d(j6)), AbstractC4344b.Y0(C5251c.e(j6)));
                long c11 = kotlin.jvm.internal.m.c(((int) (v02 >> 32)) + ((int) (c10 >> 32)), ((int) (v02 & 4294967295L)) + ((int) (c10 & 4294967295L)));
                long v03 = t10.v0(E02);
                long c12 = kotlin.jvm.internal.m.c(((int) (c11 >> 32)) - ((int) (v03 >> 32)), ((int) (c11 & 4294967295L)) - ((int) (v03 & 4294967295L)));
                return R4.b.r((int) (c12 >> 32), (int) (c12 & 4294967295L));
            }
            G0.T f6 = androidx.compose.ui.layout.a.f(t11);
            long v04 = t11.v0(f6);
            long j10 = f6.f5674o0;
            long c13 = kotlin.jvm.internal.m.c(((int) (v04 >> 32)) + ((int) (j10 >> 32)), ((int) (v04 & 4294967295L)) + ((int) (j10 & 4294967295L)));
            long c14 = kotlin.jvm.internal.m.c(AbstractC4344b.Y0(C5251c.d(j6)), AbstractC4344b.Y0(C5251c.e(j6)));
            long c15 = kotlin.jvm.internal.m.c(((int) (c13 >> 32)) + ((int) (c14 >> 32)), ((int) (c13 & 4294967295L)) + ((int) (c14 & 4294967295L)));
            long v05 = t10.v0(androidx.compose.ui.layout.a.f(t10));
            long j11 = androidx.compose.ui.layout.a.f(t10).f5674o0;
            long c16 = kotlin.jvm.internal.m.c(((int) (v05 >> 32)) + ((int) (j11 >> 32)), ((int) (v05 & 4294967295L)) + ((int) (j11 & 4294967295L)));
            long c17 = kotlin.jvm.internal.m.c(((int) (c15 >> 32)) - ((int) (c16 >> 32)), ((int) (c15 & 4294967295L)) - ((int) (c16 & 4294967295L)));
            G0.g0 g0Var = androidx.compose.ui.layout.a.f(t10).f5673n0.f5772p0;
            AbstractC3557B.Z(g0Var);
            G0.g0 g0Var2 = f6.f5673n0.f5772p0;
            AbstractC3557B.Z(g0Var2);
            return g0Var.B(g0Var2, R4.b.r((int) (c17 >> 32), (int) (c17 & 4294967295L)));
        }
        G0.T f10 = androidx.compose.ui.layout.a.f(t10);
        long B10 = B(f10.f5676q0, j6);
        G0.g0 g0Var3 = f10.f5673n0;
        g0Var3.getClass();
        return C5251c.h(B10, g0Var3.B(abstractC0461u, C5251c.f43619b));
    }

    @Override // E0.AbstractC0461u
    public final C5252d F(AbstractC0461u abstractC0461u, boolean z10) {
        return this.f4030Y.f5673n0.F(abstractC0461u, z10);
    }

    @Override // E0.AbstractC0461u
    public final long M(long j6) {
        return this.f4030Y.f5673n0.M(C5251c.h(j6, a()));
    }

    @Override // E0.AbstractC0461u
    public final void Q(AbstractC0461u abstractC0461u, float[] fArr) {
        this.f4030Y.f5673n0.Q(abstractC0461u, fArr);
    }

    public final long a() {
        G0.T t10 = this.f4030Y;
        G0.T f6 = androidx.compose.ui.layout.a.f(t10);
        int i10 = C5251c.f43622e;
        long j6 = C5251c.f43619b;
        return C5251c.g(B(f6.f5676q0, j6), t10.f5673n0.B(f6.f5673n0, j6));
    }

    @Override // E0.AbstractC0461u
    public final long d(long j6) {
        return this.f4030Y.f5673n0.d(C5251c.h(j6, a()));
    }

    @Override // E0.AbstractC0461u
    public final AbstractC0461u f() {
        G0.T E02;
        if (i()) {
            G0.g0 g0Var = this.f4030Y.f5673n0.f5772p0;
            if (g0Var != null && (E02 = g0Var.E0()) != null) {
                return E02.f5676q0;
            }
            return null;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // E0.AbstractC0461u
    public final boolean i() {
        return this.f4030Y.f5673n0.G0().f37732r0;
    }

    @Override // E0.AbstractC0461u
    public final long j() {
        G0.T t10 = this.f4030Y;
        return Ng.H.c(t10.f4053Y, t10.f4054Z);
    }

    @Override // E0.AbstractC0461u
    public final long s(long j6) {
        return C5251c.h(this.f4030Y.f5673n0.s(j6), a());
    }

    @Override // E0.AbstractC0461u
    public final AbstractC0461u x() {
        G0.T E02;
        if (i()) {
            G0.g0 g0Var = this.f4030Y.f5673n0.f5770n0.f24831B0.f5702c.f5772p0;
            if (g0Var == null || (E02 = g0Var.E0()) == null) {
                return null;
            }
            return E02.f5676q0;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }
}

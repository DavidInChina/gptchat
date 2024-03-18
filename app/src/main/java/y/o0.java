package y;

import Z.C1724m0;
import Z.o1;
import nf.AbstractC4828h;
import z.AbstractC6652A0;
import z.AbstractC6659E;
import z.AbstractC6714o;
import z.C6694e;

/* loaded from: classes2.dex */
public final class o0 extends j0 {

    /* renamed from: s0  reason: collision with root package name */
    public AbstractC6714o f50262s0;

    /* renamed from: t0  reason: collision with root package name */
    public wf.n f50263t0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f50266w0;

    /* renamed from: u0  reason: collision with root package name */
    public long f50264u0 = androidx.compose.animation.a.f24635a;

    /* renamed from: v0  reason: collision with root package name */
    public long f50265v0 = A7.b.n(0, 0, 0, 0, 15);

    /* renamed from: x0  reason: collision with root package name */
    public final C1724m0 f50267x0 = AbstractC4828h.Z(null, o1.f22665a);

    public o0(AbstractC6659E abstractC6659E, wf.n nVar) {
        this.f50262s0 = abstractC6659E;
        this.f50263t0 = nVar;
    }

    @Override // G0.C
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        E0.d0 d0Var;
        long j10;
        if (p10.P()) {
            this.f50265v0 = j6;
            this.f50266w0 = true;
            d0Var = m10.o(j6);
        } else {
            if (this.f50266w0) {
                j10 = this.f50265v0;
            } else {
                j10 = j6;
            }
            d0Var = m10.o(j10);
        }
        long c10 = Ng.H.c(d0Var.f4053Y, d0Var.f4054Z);
        if (p10.P()) {
            this.f50264u0 = c10;
        } else {
            if (!Z0.k.a(this.f50264u0, androidx.compose.animation.a.f24635a)) {
                c10 = this.f50264u0;
            }
            long j11 = c10;
            C1724m0 c1724m0 = this.f50267x0;
            m0 m0Var = (m0) c1724m0.getValue();
            if (m0Var != null) {
                C6694e c6694e = m0Var.f50240a;
                if (!Z0.k.a(j11, ((Z0.k) c6694e.f51232e.getValue()).f22804a)) {
                    m0Var.f50241b = ((Z0.k) c6694e.e()).f22804a;
                    Ad.l.O0(p0(), null, null, new n0(m0Var, j11, this, null), 3);
                }
            } else {
                m0Var = new m0(new C6694e(new Z0.k(j11), AbstractC6652A0.f51123h, new Z0.k(Ng.H.c(1, 1)), 8), j11);
            }
            c1724m0.setValue(m0Var);
            c10 = A7.b.q0(j6, ((Z0.k) m0Var.f50240a.e()).f22804a);
        }
        return p10.j0((int) (c10 >> 32), (int) (4294967295L & c10), kf.w.f37484Y, new D(d0Var, 3));
    }

    @Override // l0.AbstractC4325q
    public final void t0() {
        this.f50264u0 = androidx.compose.animation.a.f24635a;
        this.f50266w0 = false;
    }

    @Override // l0.AbstractC4325q
    public final void v0() {
        this.f50267x0.setValue(null);
    }
}

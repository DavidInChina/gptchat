package G0;

import H0.C0714y;
import b0.C2104h;
import id.AbstractC3557B;
import l0.AbstractC4325q;
import r0.AbstractC5350n;
import r0.AbstractC5352p;
import r0.C5347k;
import t0.AbstractC5646e;
import t0.AbstractC5650i;
import t0.AbstractC5651j;
import t0.C5642a;
import t0.C5643b;
import t0.C5644c;

/* loaded from: classes2.dex */
public final class J implements AbstractC5650i, AbstractC5646e {

    /* renamed from: Y  reason: collision with root package name */
    public final C5644c f5596Y = new C5644c();

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC0590t f5597Z;

    @Override // Z0.b
    public final long C(int i10) {
        return this.f5596Y.C(i10);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return this.f5596Y.D(f6);
    }

    @Override // t0.AbstractC5650i
    public final void E(long j6, float f6, float f10, long j10, long j11, float f11, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f5596Y.E(j6, f6, f10, j10, j11, f11, abstractC5651j, c5347k, i10);
    }

    @Override // Z0.b
    public final float J(int i10) {
        return this.f5596Y.J(i10);
    }

    @Override // Z0.b
    public final float K(float f6) {
        return f6 / this.f5596Y.b();
    }

    @Override // t0.AbstractC5650i
    public final void L(AbstractC5350n abstractC5350n, long j6, long j10, long j11, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f5596Y.L(abstractC5350n, j6, j10, j11, f6, abstractC5651j, c5347k, i10);
    }

    @Override // Z0.b
    public final float O() {
        return this.f5596Y.O();
    }

    @Override // Z0.b
    public final float R(float f6) {
        return this.f5596Y.b() * f6;
    }

    @Override // t0.AbstractC5650i
    public final C5643b V() {
        return this.f5596Y.f45612Z;
    }

    @Override // t0.AbstractC5650i
    public final void Y(AbstractC5350n abstractC5350n, long j6, long j10, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f5596Y.Y(abstractC5350n, j6, j10, f6, abstractC5651j, c5347k, i10);
    }

    @Override // t0.AbstractC5650i
    public final void Z(r0.z zVar, long j6, long j10, long j11, long j12, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10, int i11) {
        this.f5596Y.Z(zVar, j6, j10, j11, j12, f6, abstractC5651j, c5347k, i10, i11);
    }

    public final void a() {
        AbstractC5352p a5 = this.f5596Y.f45612Z.a();
        AbstractC0590t abstractC0590t = this.f5597Z;
        AbstractC3557B.Z(abstractC0590t);
        AbstractC4325q abstractC4325q = (AbstractC4325q) abstractC0590t;
        AbstractC4325q abstractC4325q2 = abstractC4325q.f37720Y.f37725k0;
        if (abstractC4325q2 != null && (abstractC4325q2.f37723i0 & 4) != 0) {
            while (abstractC4325q2 != null) {
                int i10 = abstractC4325q2.f37722h0;
                if ((i10 & 2) != 0) {
                    break;
                } else if ((i10 & 4) != 0) {
                    break;
                } else {
                    abstractC4325q2 = abstractC4325q2.f37725k0;
                }
            }
        }
        abstractC4325q2 = null;
        if (abstractC4325q2 != null) {
            C2104h c2104h = null;
            while (abstractC4325q2 != null) {
                if (abstractC4325q2 instanceof AbstractC0590t) {
                    AbstractC0590t abstractC0590t2 = (AbstractC0590t) abstractC4325q2;
                    g0 z10 = AbstractC0579h.z(abstractC0590t2, 4);
                    long z11 = Ng.H.z(z10.f4055h0);
                    androidx.compose.ui.node.a aVar = z10.f5770n0;
                    aVar.getClass();
                    ((C0714y) AbstractC0579h.C(aVar)).getSharedDrawScope().c(a5, z11, z10, abstractC0590t2);
                } else if ((abstractC4325q2.f37722h0 & 4) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                    int i11 = 0;
                    for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                        if ((abstractC4325q3.f37722h0 & 4) != 0) {
                            i11++;
                            if (i11 == 1) {
                                abstractC4325q2 = abstractC4325q3;
                            } else {
                                if (c2104h == null) {
                                    c2104h = new C2104h(new AbstractC4325q[16]);
                                }
                                if (abstractC4325q2 != null) {
                                    c2104h.b(abstractC4325q2);
                                    abstractC4325q2 = null;
                                }
                                c2104h.b(abstractC4325q3);
                            }
                        }
                    }
                    if (i11 == 1) {
                    }
                }
                abstractC4325q2 = AbstractC0579h.f(c2104h);
            }
            return;
        }
        g0 z12 = AbstractC0579h.z(abstractC0590t, 4);
        if (z12.G0() == abstractC4325q.f37720Y) {
            z12 = z12.f5771o0;
            AbstractC3557B.Z(z12);
        }
        z12.Q0(a5);
    }

    @Override // Z0.b
    public final int a0(float f6) {
        C5644c c5644c = this.f5596Y;
        c5644c.getClass();
        return R.a.b(f6, c5644c);
    }

    @Override // Z0.b
    public final float b() {
        return this.f5596Y.b();
    }

    public final void c(AbstractC5352p abstractC5352p, long j6, g0 g0Var, AbstractC0590t abstractC0590t) {
        AbstractC0590t abstractC0590t2 = this.f5597Z;
        this.f5597Z = abstractC0590t;
        Z0.l lVar = g0Var.f5770n0.f24860x0;
        C5644c c5644c = this.f5596Y;
        C5642a c5642a = c5644c.f45611Y;
        Z0.b bVar = c5642a.f45605a;
        Z0.l lVar2 = c5642a.f45606b;
        AbstractC5352p abstractC5352p2 = c5642a.f45607c;
        long j10 = c5642a.f45608d;
        c5642a.f45605a = g0Var;
        c5642a.f45606b = lVar;
        c5642a.f45607c = abstractC5352p;
        c5642a.f45608d = j6;
        abstractC5352p.h();
        abstractC0590t.f(this);
        abstractC5352p.q();
        C5642a c5642a2 = c5644c.f45611Y;
        c5642a2.f45605a = bVar;
        c5642a2.f45606b = lVar2;
        c5642a2.f45607c = abstractC5352p2;
        c5642a2.f45608d = j10;
        this.f5597Z = abstractC0590t2;
    }

    @Override // t0.AbstractC5650i
    public final long c0() {
        return this.f5596Y.c0();
    }

    @Override // t0.AbstractC5650i
    public final void f0(r0.E e10, AbstractC5350n abstractC5350n, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f5596Y.f0(e10, abstractC5350n, f6, abstractC5651j, c5347k, i10);
    }

    @Override // t0.AbstractC5650i
    public final long g() {
        return this.f5596Y.g();
    }

    @Override // Z0.b
    public final long g0(long j6) {
        C5644c c5644c = this.f5596Y;
        c5644c.getClass();
        return R.a.g(j6, c5644c);
    }

    @Override // t0.AbstractC5650i
    public final Z0.l getLayoutDirection() {
        return this.f5596Y.f45611Y.f45606b;
    }

    @Override // Z0.b
    public final float i0(long j6) {
        C5644c c5644c = this.f5596Y;
        c5644c.getClass();
        return R.a.f(j6, c5644c);
    }

    @Override // t0.AbstractC5650i
    public final void k(long j6, long j10, long j11, long j12, AbstractC5651j abstractC5651j, float f6, C5347k c5347k, int i10) {
        this.f5596Y.k(j6, j10, j11, j12, abstractC5651j, f6, c5347k, i10);
    }

    @Override // t0.AbstractC5650i
    public final void m0(long j6, long j10, long j11, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f5596Y.m0(j6, j10, j11, f6, abstractC5651j, c5347k, i10);
    }

    @Override // t0.AbstractC5650i
    public final void n(long j6, float f6, long j10, float f10, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f5596Y.n(j6, f6, j10, f10, abstractC5651j, c5347k, i10);
    }

    @Override // t0.AbstractC5650i
    public final void o0(long j6, long j10, long j11, float f6, int i10, float f10, C5347k c5347k, int i11) {
        this.f5596Y.o0(j6, j10, j11, f6, i10, f10, c5347k, i11);
    }

    @Override // Z0.b
    public final long p(long j6) {
        C5644c c5644c = this.f5596Y;
        c5644c.getClass();
        return R.a.e(j6, c5644c);
    }

    @Override // t0.AbstractC5650i
    public final void r(r0.E e10, long j6, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f5596Y.r(e10, j6, f6, abstractC5651j, c5347k, i10);
    }

    @Override // Z0.b
    public final float t(long j6) {
        C5644c c5644c = this.f5596Y;
        c5644c.getClass();
        return R.a.d(j6, c5644c);
    }

    @Override // t0.AbstractC5650i
    public final void v(AbstractC5350n abstractC5350n, long j6, long j10, float f6, int i10, float f10, C5347k c5347k, int i11) {
        this.f5596Y.v(abstractC5350n, j6, j10, f6, i10, f10, c5347k, i11);
    }

    @Override // t0.AbstractC5650i
    public final void w(r0.z zVar, long j6, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f5596Y.w(zVar, j6, f6, abstractC5651j, c5347k, i10);
    }
}

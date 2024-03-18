package G0;

import E0.AbstractC0461u;
import H0.B0;
import H0.C0713x0;
import H0.C0714y;
import H0.N0;
import H0.c1;
import H0.g1;
import android.view.View;
import androidx.compose.ui.node.Owner;
import b0.C2104h;
import id.AbstractC3557B;
import j0.AbstractC3893i;
import java.lang.ref.Reference;
import java.util.LinkedHashMap;
import l0.AbstractC4325q;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5250b;
import q0.C5251c;
import q0.C5252d;
import q0.C5254f;
import r0.AbstractC5352p;
import r0.C5335B;
import r0.C5342f;
import z.C6672L;

/* loaded from: classes2.dex */
public abstract class g0 extends S implements E0.M, AbstractC0461u, q0 {

    /* renamed from: G0  reason: collision with root package name */
    public static final r0.I f5759G0;

    /* renamed from: H0  reason: collision with root package name */
    public static final A f5760H0 = new A();

    /* renamed from: I0  reason: collision with root package name */
    public static final float[] f5761I0 = C5335B.a();

    /* renamed from: J0  reason: collision with root package name */
    public static final Cf.h f5762J0 = new Cf.h(0);

    /* renamed from: K0  reason: collision with root package name */
    public static final Cf.h f5763K0 = new Cf.h(1);

    /* renamed from: A0  reason: collision with root package name */
    public C5250b f5764A0;

    /* renamed from: B0  reason: collision with root package name */
    public A f5765B0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f5768E0;

    /* renamed from: F0  reason: collision with root package name */
    public n0 f5769F0;

    /* renamed from: n0  reason: collision with root package name */
    public final androidx.compose.ui.node.a f5770n0;

    /* renamed from: o0  reason: collision with root package name */
    public g0 f5771o0;

    /* renamed from: p0  reason: collision with root package name */
    public g0 f5772p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f5773q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f5774r0;

    /* renamed from: s0  reason: collision with root package name */
    public wf.k f5775s0;

    /* renamed from: t0  reason: collision with root package name */
    public Z0.b f5776t0;

    /* renamed from: u0  reason: collision with root package name */
    public Z0.l f5777u0;

    /* renamed from: w0  reason: collision with root package name */
    public E0.O f5779w0;

    /* renamed from: x0  reason: collision with root package name */
    public LinkedHashMap f5780x0;

    /* renamed from: z0  reason: collision with root package name */
    public float f5782z0;

    /* renamed from: v0  reason: collision with root package name */
    public float f5778v0 = 0.8f;

    /* renamed from: y0  reason: collision with root package name */
    public long f5781y0 = Z0.i.f22797b;

    /* renamed from: C0  reason: collision with root package name */
    public final C0571a f5766C0 = new C0571a(2, this);

    /* renamed from: D0  reason: collision with root package name */
    public final C6672L f5767D0 = new C6672L(24, this);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r0.I] */
    static {
        ?? obj = new Object();
        obj.f44182Z = 1.0f;
        obj.f44183h0 = 1.0f;
        obj.f44184i0 = 1.0f;
        long j6 = r0.y.f44272a;
        obj.f44188m0 = j6;
        obj.f44189n0 = j6;
        obj.f44193r0 = 8.0f;
        obj.f44194s0 = r0.P.f44225b;
        obj.f44195t0 = r0.G.f44171a;
        obj.f44197v0 = 0;
        obj.f44198w0 = C5254f.f43638c;
        obj.f44199x0 = new Z0.c(1.0f, 1.0f);
        f5759G0 = obj;
    }

    public g0(androidx.compose.ui.node.a aVar) {
        this.f5770n0 = aVar;
        this.f5776t0 = aVar.f24859w0;
        this.f5777u0 = aVar.f24860x0;
    }

    public static g0 V0(AbstractC0461u abstractC0461u) {
        E0.L l10;
        g0 g0Var;
        if (abstractC0461u instanceof E0.L) {
            l10 = (E0.L) abstractC0461u;
        } else {
            l10 = null;
        }
        if (l10 == null || (g0Var = l10.f4030Y.f5673n0) == null) {
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator", abstractC0461u);
            return (g0) abstractC0461u;
        }
        return g0Var;
    }

    public final void A0(AbstractC5352p abstractC5352p) {
        AbstractC4325q H02 = H0(4);
        if (H02 == null) {
            Q0(abstractC5352p);
            return;
        }
        androidx.compose.ui.node.a aVar = this.f5770n0;
        aVar.getClass();
        J sharedDrawScope = ((C0714y) AbstractC0579h.C(aVar)).getSharedDrawScope();
        long z10 = Ng.H.z(this.f4055h0);
        sharedDrawScope.getClass();
        C2104h c2104h = null;
        while (H02 != null) {
            if (H02 instanceof AbstractC0590t) {
                sharedDrawScope.c(abstractC5352p, z10, this, (AbstractC0590t) H02);
            } else if ((H02.f37722h0 & 4) != 0 && (H02 instanceof AbstractC0587p)) {
                int i10 = 0;
                for (AbstractC4325q abstractC4325q = ((AbstractC0587p) H02).f5816t0; abstractC4325q != null; abstractC4325q = abstractC4325q.f37725k0) {
                    if ((abstractC4325q.f37722h0 & 4) != 0) {
                        i10++;
                        if (i10 == 1) {
                            H02 = abstractC4325q;
                        } else {
                            if (c2104h == null) {
                                c2104h = new C2104h(new AbstractC4325q[16]);
                            }
                            if (H02 != null) {
                                c2104h.b(H02);
                                H02 = null;
                            }
                            c2104h.b(abstractC4325q);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            H02 = AbstractC0579h.f(c2104h);
        }
    }

    @Override // E0.AbstractC0461u
    public final long B(AbstractC0461u abstractC0461u, long j6) {
        if (abstractC0461u instanceof E0.L) {
            return C5251c.k(abstractC0461u.B(this, C5251c.k(j6)));
        }
        g0 V02 = V0(abstractC0461u);
        V02.N0();
        g0 C02 = C0(V02);
        while (V02 != C02) {
            j6 = V02.W0(j6);
            V02 = V02.f5772p0;
            AbstractC3557B.Z(V02);
        }
        return v0(C02, j6);
    }

    public abstract void B0();

    public final g0 C0(g0 g0Var) {
        androidx.compose.ui.node.a aVar = g0Var.f5770n0;
        androidx.compose.ui.node.a aVar2 = this.f5770n0;
        if (aVar == aVar2) {
            AbstractC4325q G02 = g0Var.G0();
            AbstractC4325q abstractC4325q = G0().f37720Y;
            if (abstractC4325q.f37732r0) {
                for (AbstractC4325q abstractC4325q2 = abstractC4325q.f37724j0; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37724j0) {
                    if ((abstractC4325q2.f37722h0 & 2) != 0 && abstractC4325q2 == G02) {
                        return g0Var;
                    }
                }
                return this;
            }
            throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        while (aVar.f24852p0 > aVar2.f24852p0) {
            aVar = aVar.E();
            AbstractC3557B.Z(aVar);
        }
        androidx.compose.ui.node.a aVar3 = aVar2;
        while (aVar3.f24852p0 > aVar.f24852p0) {
            aVar3 = aVar3.E();
            AbstractC3557B.Z(aVar3);
        }
        while (aVar != aVar3) {
            aVar = aVar.E();
            aVar3 = aVar3.E();
            if (aVar != null) {
                if (aVar3 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        if (aVar3 == aVar2) {
            return this;
        }
        if (aVar != g0Var.f5770n0) {
            return aVar.f24831B0.f5701b;
        }
        return g0Var;
    }

    public final long D0(long j6) {
        long j10 = this.f5781y0;
        float d10 = C5251c.d(j6);
        int i10 = Z0.i.f22798c;
        long r10 = R4.b.r(d10 - ((int) (j10 >> 32)), C5251c.e(j6) - ((int) (j10 & 4294967295L)));
        n0 n0Var = this.f5769F0;
        if (n0Var != null) {
            return n0Var.e(r10, true);
        }
        return r10;
    }

    public abstract T E0();

    /* JADX WARN: Type inference failed for: r2v3, types: [q0.b, java.lang.Object] */
    @Override // E0.AbstractC0461u
    public final C5252d F(AbstractC0461u abstractC0461u, boolean z10) {
        if (G0().f37732r0) {
            if (abstractC0461u.i()) {
                g0 V02 = V0(abstractC0461u);
                V02.N0();
                g0 C02 = C0(V02);
                C5250b c5250b = this.f5764A0;
                C5250b c5250b2 = c5250b;
                if (c5250b == null) {
                    ?? obj = new Object();
                    obj.f43615a = 0.0f;
                    obj.f43616b = 0.0f;
                    obj.f43617c = 0.0f;
                    obj.f43618d = 0.0f;
                    this.f5764A0 = obj;
                    c5250b2 = obj;
                }
                c5250b2.f43615a = 0.0f;
                c5250b2.f43616b = 0.0f;
                c5250b2.f43617c = (int) (abstractC0461u.j() >> 32);
                c5250b2.f43618d = (int) (abstractC0461u.j() & 4294967295L);
                while (V02 != C02) {
                    V02.S0(c5250b2, z10, false);
                    if (c5250b2.b()) {
                        return C5252d.f43624e;
                    }
                    V02 = V02.f5772p0;
                    AbstractC3557B.Z(V02);
                }
                u0(C02, c5250b2, z10);
                return new C5252d(c5250b2.f43615a, c5250b2.f43616b, c5250b2.f43617c, c5250b2.f43618d);
            }
            throw new IllegalStateException(("LayoutCoordinates " + abstractC0461u + " is not attached!").toString());
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final long F0() {
        return this.f5776t0.g0(this.f5770n0.f24861y0.c());
    }

    public abstract AbstractC4325q G0();

    public final AbstractC4325q H0(int i10) {
        boolean s10 = AbstractC0579h.s(i10);
        AbstractC4325q G02 = G0();
        if (s10 || (G02 = G02.f37724j0) != null) {
            for (AbstractC4325q I02 = I0(s10); I02 != null && (I02.f37723i0 & i10) != 0; I02 = I02.f37725k0) {
                if ((I02.f37722h0 & i10) != 0) {
                    return I02;
                }
                if (I02 == G02) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final AbstractC4325q I0(boolean z10) {
        AbstractC4325q G02;
        C0572a0 c0572a0 = this.f5770n0.f24831B0;
        if (c0572a0.f5702c == this) {
            return c0572a0.f5704e;
        }
        if (z10) {
            g0 g0Var = this.f5772p0;
            if (g0Var != null && (G02 = g0Var.G0()) != null) {
                return G02.f37725k0;
            }
        } else {
            g0 g0Var2 = this.f5772p0;
            if (g0Var2 != null) {
                return g0Var2.G0();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
        if (G0.AbstractC0579h.o(r21.r(), G0.AbstractC0579h.a(r15, r23)) > 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(c0 c0Var, long j6, C0593w c0593w, boolean z10, boolean z11) {
        int i10;
        n0 n0Var;
        float x02;
        Cf.h hVar = (Cf.h) c0Var;
        switch (hVar.f3114Y) {
            case 0:
                i10 = 16;
                break;
            default:
                i10 = 8;
                break;
        }
        AbstractC4325q H02 = H0(i10);
        if (!R4.b.v1(j6) || ((n0Var = this.f5769F0) != null && this.f5774r0 && !n0Var.d(j6))) {
            if (z10) {
                float x03 = x0(j6, F0());
                if (!Float.isInfinite(x03) && !Float.isNaN(x03)) {
                    if (c0593w.f5836h0 != AbstractC4344b.u0(c0593w)) {
                        if (AbstractC0579h.o(c0593w.r(), AbstractC0579h.a(x03, false)) <= 0) {
                            return;
                        }
                    }
                    if (H02 == null) {
                        K0(hVar, j6, c0593w, z10, false);
                    } else {
                        c0593w.s(H02, x03, false, new e0(this, H02, hVar, j6, c0593w, z10, false, x03, 0));
                    }
                }
            }
        } else if (H02 == null) {
            K0(hVar, j6, c0593w, z10, z11);
        } else {
            float d10 = C5251c.d(j6);
            float e10 = C5251c.e(j6);
            if (d10 >= 0.0f && e10 >= 0.0f && d10 < U() && e10 < T()) {
                c0593w.s(H02, -1.0f, z11, new d0(this, H02, hVar, j6, c0593w, z10, z11));
                return;
            }
            if (!z10) {
                x02 = Float.POSITIVE_INFINITY;
            } else {
                x02 = x0(j6, F0());
            }
            float f6 = x02;
            if (!Float.isInfinite(f6) && !Float.isNaN(f6)) {
                if (c0593w.f5836h0 != AbstractC4344b.u0(c0593w)) {
                }
                c0593w.s(H02, f6, z11, new e0(this, H02, hVar, j6, c0593w, z10, z11, f6, 0));
                return;
            }
            U0(H02, hVar, j6, c0593w, z10, z11, f6);
        }
    }

    public void K0(c0 c0Var, long j6, C0593w c0593w, boolean z10, boolean z11) {
        g0 g0Var = this.f5771o0;
        if (g0Var != null) {
            g0Var.J0(c0Var, g0Var.D0(j6), c0593w, z10, z11);
        }
    }

    public final void L0() {
        n0 n0Var = this.f5769F0;
        if (n0Var != null) {
            n0Var.invalidate();
            return;
        }
        g0 g0Var = this.f5772p0;
        if (g0Var != null) {
            g0Var.L0();
        }
    }

    @Override // E0.AbstractC0461u
    public final long M(long j6) {
        if (G0().f37732r0) {
            N0();
            for (g0 g0Var = this; g0Var != null; g0Var = g0Var.f5772p0) {
                j6 = g0Var.W0(j6);
            }
            return j6;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final boolean M0() {
        if (this.f5769F0 != null && this.f5778v0 <= 0.0f) {
            return true;
        }
        g0 g0Var = this.f5772p0;
        if (g0Var != null) {
            return g0Var.M0();
        }
        return false;
    }

    public final void N0() {
        O t10 = this.f5770n0.t();
        int v10 = t10.f5647a.v();
        if (v10 == 3 || v10 == 4) {
            if (t10.f5661o.f5620B0) {
                t10.d(true);
            } else {
                t10.c(true);
            }
        }
        if (v10 == 4) {
            L l10 = t10.f5662p;
            if (l10 != null && l10.f5616x0) {
                t10.d(true);
            } else {
                t10.c(true);
            }
        }
    }

    @Override // Z0.b
    public final float O() {
        return this.f5770n0.f24859w0.O();
    }

    public final void O0() {
        AbstractC4325q abstractC4325q;
        AbstractC4325q I02 = I0(AbstractC0579h.s(128));
        if (I02 != null && (I02.f37720Y.f37723i0 & 128) != 0) {
            int i10 = AbstractC3893i.f35891e;
            AbstractC3893i d10 = io.sentry.hints.i.d();
            try {
                AbstractC3893i j6 = d10.j();
                boolean s10 = AbstractC0579h.s(128);
                if (s10) {
                    abstractC4325q = G0();
                } else {
                    abstractC4325q = G0().f37724j0;
                    if (abstractC4325q == null) {
                        AbstractC3893i.p(j6);
                    }
                }
                for (AbstractC4325q I03 = I0(s10); I03 != null && (I03.f37723i0 & 128) != 0; I03 = I03.f37725k0) {
                    if ((I03.f37722h0 & 128) != 0) {
                        AbstractC4325q abstractC4325q2 = I03;
                        C2104h c2104h = null;
                        while (abstractC4325q2 != null) {
                            if (abstractC4325q2 instanceof B) {
                                ((B) abstractC4325q2).o(this.f4055h0);
                            } else if ((abstractC4325q2.f37722h0 & 128) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                                int i11 = 0;
                                for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                                    if ((abstractC4325q3.f37722h0 & 128) != 0) {
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
                    }
                    if (I03 == abstractC4325q) {
                        break;
                    }
                }
                AbstractC3893i.p(j6);
            } finally {
                d10.c();
            }
        }
    }

    public final void P0() {
        boolean s10 = AbstractC0579h.s(128);
        AbstractC4325q G02 = G0();
        if (s10 || (G02 = G02.f37724j0) != null) {
            for (AbstractC4325q I02 = I0(s10); I02 != null && (I02.f37723i0 & 128) != 0; I02 = I02.f37725k0) {
                if ((I02.f37722h0 & 128) != 0) {
                    AbstractC4325q abstractC4325q = I02;
                    C2104h c2104h = null;
                    while (abstractC4325q != null) {
                        if (abstractC4325q instanceof B) {
                            ((B) abstractC4325q).I(this);
                        } else if ((abstractC4325q.f37722h0 & 128) != 0 && (abstractC4325q instanceof AbstractC0587p)) {
                            int i10 = 0;
                            for (AbstractC4325q abstractC4325q2 = ((AbstractC0587p) abstractC4325q).f5816t0; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37725k0) {
                                if ((abstractC4325q2.f37722h0 & 128) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        abstractC4325q = abstractC4325q2;
                                    } else {
                                        if (c2104h == null) {
                                            c2104h = new C2104h(new AbstractC4325q[16]);
                                        }
                                        if (abstractC4325q != null) {
                                            c2104h.b(abstractC4325q);
                                            abstractC4325q = null;
                                        }
                                        c2104h.b(abstractC4325q2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC4325q = AbstractC0579h.f(c2104h);
                    }
                }
                if (I02 == G02) {
                    return;
                }
            }
        }
    }

    @Override // E0.AbstractC0461u
    public final void Q(AbstractC0461u abstractC0461u, float[] fArr) {
        g0 V02 = V0(abstractC0461u);
        V02.N0();
        g0 C02 = C0(V02);
        C5335B.d(fArr);
        while (!AbstractC3557B.K(V02, C02)) {
            n0 n0Var = V02.f5769F0;
            if (n0Var != null) {
                n0Var.b(fArr);
            }
            long j6 = V02.f5781y0;
            if (!Z0.i.a(j6, Z0.i.f22797b)) {
                float[] fArr2 = f5761I0;
                C5335B.d(fArr2);
                C5335B.f(fArr2, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                C5335B.e(fArr, fArr2);
            }
            V02 = V02.f5772p0;
            AbstractC3557B.Z(V02);
        }
        X0(C02, fArr);
    }

    public abstract void Q0(AbstractC5352p abstractC5352p);

    public final void R0(long j6, float f6, wf.k kVar) {
        Y0(kVar, false);
        if (!Z0.i.a(this.f5781y0, j6)) {
            this.f5781y0 = j6;
            androidx.compose.ui.node.a aVar = this.f5770n0;
            aVar.t().f5661o.p0();
            n0 n0Var = this.f5769F0;
            if (n0Var != null) {
                n0Var.j(j6);
            } else {
                g0 g0Var = this.f5772p0;
                if (g0Var != null) {
                    g0Var.L0();
                }
            }
            S.r0(this);
            Owner owner = aVar.f24850n0;
            if (owner != null) {
                ((C0714y) owner).s(aVar);
            }
        }
        this.f5782z0 = f6;
    }

    public final void S0(C5250b c5250b, boolean z10, boolean z11) {
        n0 n0Var = this.f5769F0;
        if (n0Var != null) {
            if (this.f5774r0) {
                if (z11) {
                    long F02 = F0();
                    float d10 = C5254f.d(F02) / 2.0f;
                    float b10 = C5254f.b(F02) / 2.0f;
                    long j6 = this.f4055h0;
                    c5250b.a(-d10, -b10, ((int) (j6 >> 32)) + d10, ((int) (j6 & 4294967295L)) + b10);
                } else if (z10) {
                    long j10 = this.f4055h0;
                    c5250b.a(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                }
                if (c5250b.b()) {
                    return;
                }
            }
            n0Var.c(c5250b, false);
        }
        long j11 = this.f5781y0;
        int i10 = Z0.i.f22798c;
        float f6 = (int) (j11 >> 32);
        c5250b.f43615a += f6;
        c5250b.f43617c += f6;
        float f10 = (int) (j11 & 4294967295L);
        c5250b.f43616b += f10;
        c5250b.f43618d += f10;
    }

    public final void T0(E0.O o10) {
        E0.O o11 = this.f5779w0;
        if (o10 != o11) {
            this.f5779w0 = o10;
            androidx.compose.ui.node.a aVar = this.f5770n0;
            if (o11 == null || o10.getWidth() != o11.getWidth() || o10.getHeight() != o11.getHeight()) {
                int width = o10.getWidth();
                int height = o10.getHeight();
                n0 n0Var = this.f5769F0;
                if (n0Var != null) {
                    n0Var.f(Ng.H.c(width, height));
                } else {
                    g0 g0Var = this.f5772p0;
                    if (g0Var != null) {
                        g0Var.L0();
                    }
                }
                b0(Ng.H.c(width, height));
                a1(false);
                boolean s10 = AbstractC0579h.s(4);
                AbstractC4325q G02 = G0();
                if (s10 || (G02 = G02.f37724j0) != null) {
                    for (AbstractC4325q I02 = I0(s10); I02 != null && (I02.f37723i0 & 4) != 0; I02 = I02.f37725k0) {
                        if ((I02.f37722h0 & 4) != 0) {
                            AbstractC4325q abstractC4325q = I02;
                            C2104h c2104h = null;
                            while (abstractC4325q != null) {
                                if (abstractC4325q instanceof AbstractC0590t) {
                                    ((AbstractC0590t) abstractC4325q).G();
                                } else if ((abstractC4325q.f37722h0 & 4) != 0 && (abstractC4325q instanceof AbstractC0587p)) {
                                    int i10 = 0;
                                    for (AbstractC4325q abstractC4325q2 = ((AbstractC0587p) abstractC4325q).f5816t0; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37725k0) {
                                        if ((abstractC4325q2.f37722h0 & 4) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC4325q = abstractC4325q2;
                                            } else {
                                                if (c2104h == null) {
                                                    c2104h = new C2104h(new AbstractC4325q[16]);
                                                }
                                                if (abstractC4325q != null) {
                                                    c2104h.b(abstractC4325q);
                                                    abstractC4325q = null;
                                                }
                                                c2104h.b(abstractC4325q2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC4325q = AbstractC0579h.f(c2104h);
                            }
                        }
                        if (I02 == G02) {
                            break;
                        }
                    }
                }
                Owner owner = aVar.f24850n0;
                if (owner != null) {
                    ((C0714y) owner).s(aVar);
                }
            }
            LinkedHashMap linkedHashMap = this.f5780x0;
            if (((linkedHashMap != null && !linkedHashMap.isEmpty()) || (!o10.a().isEmpty())) && !AbstractC3557B.K(o10.a(), this.f5780x0)) {
                aVar.t().f5661o.f5643y0.g();
                LinkedHashMap linkedHashMap2 = this.f5780x0;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.f5780x0 = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(o10.a());
            }
        }
    }

    public final void U0(AbstractC4325q abstractC4325q, c0 c0Var, long j6, C0593w c0593w, boolean z10, boolean z11, float f6) {
        if (abstractC4325q == null) {
            K0(c0Var, j6, c0593w, z10, z11);
            return;
        }
        Cf.h hVar = (Cf.h) c0Var;
        int i10 = 16;
        switch (hVar.f3114Y) {
            case 0:
                AbstractC4325q abstractC4325q2 = abstractC4325q;
                C2104h c2104h = null;
                while (abstractC4325q2 != null) {
                    if (abstractC4325q2 instanceof t0) {
                        ((t0) abstractC4325q2).H();
                    } else if ((abstractC4325q2.f37722h0 & 16) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                        int i11 = 0;
                        for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                            if ((abstractC4325q3.f37722h0 & 16) != 0) {
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
                break;
        }
        switch (hVar.f3114Y) {
            case 0:
                break;
            default:
                i10 = 8;
                break;
        }
        U0(AbstractC0579h.e(abstractC4325q, i10), c0Var, j6, c0593w, z10, z11, f6);
    }

    public final long W0(long j6) {
        n0 n0Var = this.f5769F0;
        if (n0Var != null) {
            j6 = n0Var.e(j6, false);
        }
        long j10 = this.f5781y0;
        float d10 = C5251c.d(j6);
        int i10 = Z0.i.f22798c;
        return R4.b.r(d10 + ((int) (j10 >> 32)), C5251c.e(j6) + ((int) (j10 & 4294967295L)));
    }

    public final void X0(g0 g0Var, float[] fArr) {
        if (!AbstractC3557B.K(g0Var, this)) {
            g0 g0Var2 = this.f5772p0;
            AbstractC3557B.Z(g0Var2);
            g0Var2.X0(g0Var, fArr);
            if (!Z0.i.a(this.f5781y0, Z0.i.f22797b)) {
                float[] fArr2 = f5761I0;
                C5335B.d(fArr2);
                long j6 = this.f5781y0;
                C5335B.f(fArr2, -((int) (j6 >> 32)), -((int) (j6 & 4294967295L)));
                C5335B.e(fArr, fArr2);
            }
            n0 n0Var = this.f5769F0;
            if (n0Var != null) {
                n0Var.h(fArr);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(wf.k kVar, boolean z10) {
        boolean z11;
        Owner owner;
        Reference poll;
        C2104h c2104h;
        C0713x0 c0713x0;
        androidx.compose.ui.node.a aVar = this.f5770n0;
        if (!z10 && this.f5775s0 == kVar && AbstractC3557B.K(this.f5776t0, aVar.f24859w0) && this.f5777u0 == aVar.f24860x0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f5775s0 = kVar;
        this.f5776t0 = aVar.f24859w0;
        this.f5777u0 = aVar.f24860x0;
        boolean S = aVar.S();
        C6672L c6672l = this.f5767D0;
        Object obj = null;
        if (S && kVar != null) {
            if (this.f5769F0 == null) {
                C0714y c0714y = (C0714y) AbstractC0579h.C(aVar);
                do {
                    g1 g1Var = c0714y.f7122q1;
                    poll = g1Var.f6957b.poll();
                    c2104h = g1Var.f6956a;
                    if (poll != null) {
                        c2104h.m(poll);
                        continue;
                    }
                } while (poll != null);
                while (true) {
                    if (!c2104h.l()) {
                        break;
                    }
                    Object obj2 = ((Reference) c2104h.n(c2104h.f25569h0 - 1)).get();
                    if (obj2 != null) {
                        obj = obj2;
                        break;
                    }
                }
                n0 n0Var = (n0) obj;
                C0571a c0571a = this.f5766C0;
                if (n0Var != null) {
                    n0Var.a(c6672l, c0571a);
                } else {
                    if (c0714y.isHardwareAccelerated() && c0714y.f7093V0) {
                        try {
                            n0Var = new N0(c0714y, c0571a, c6672l);
                        } catch (Throwable unused) {
                            c0714y.f7093V0 = false;
                        }
                    }
                    if (c0714y.f7080I0 == null) {
                        if (!c1.f6915z0) {
                            B0.f(new View(c0714y.getContext()));
                        }
                        if (c1.f6911A0) {
                            c0713x0 = new C0713x0(c0714y.getContext());
                        } else {
                            c0713x0 = new C0713x0(c0714y.getContext());
                        }
                        c0714y.f7080I0 = c0713x0;
                        c0714y.addView(c0713x0);
                    }
                    C0713x0 c0713x02 = c0714y.f7080I0;
                    AbstractC3557B.Z(c0713x02);
                    n0Var = new c1(c0714y, c0713x02, c0571a, c6672l);
                }
                n0Var.f(this.f4055h0);
                n0Var.j(this.f5781y0);
                this.f5769F0 = n0Var;
                a1(true);
                aVar.f24834E0 = true;
                c6672l.mo122invoke();
                return;
            } else if (z11) {
                a1(true);
                return;
            } else {
                return;
            }
        }
        n0 n0Var2 = this.f5769F0;
        if (n0Var2 != null) {
            n0Var2.destroy();
            aVar.f24834E0 = true;
            c6672l.mo122invoke();
            if (G0().f37732r0 && (owner = aVar.f24850n0) != null) {
                ((C0714y) owner).s(aVar);
            }
        }
        this.f5769F0 = null;
        this.f5768E0 = false;
    }

    public final void a1(boolean z10) {
        Owner owner;
        n0 n0Var = this.f5769F0;
        if (n0Var != null) {
            wf.k kVar = this.f5775s0;
            if (kVar != null) {
                r0.I i10 = f5759G0;
                i10.e(1.0f);
                i10.f(1.0f);
                i10.a(1.0f);
                i10.m(0.0f);
                i10.o(0.0f);
                i10.h(0.0f);
                long j6 = r0.y.f44272a;
                i10.c(j6);
                i10.j(j6);
                if (i10.f44190o0 != 0.0f) {
                    i10.f44181Y |= 256;
                    i10.f44190o0 = 0.0f;
                }
                if (i10.f44191p0 != 0.0f) {
                    i10.f44181Y |= 512;
                    i10.f44191p0 = 0.0f;
                }
                i10.d(0.0f);
                if (i10.f44193r0 != 8.0f) {
                    i10.f44181Y |= 2048;
                    i10.f44193r0 = 8.0f;
                }
                i10.l(r0.P.f44225b);
                i10.i(r0.G.f44171a);
                if (i10.f44196u0) {
                    i10.f44181Y |= 16384;
                    i10.f44196u0 = false;
                }
                if (!AbstractC3557B.K(null, null)) {
                    i10.f44181Y |= 131072;
                }
                if (!r0.G.c(i10.f44197v0, 0)) {
                    i10.f44181Y |= 32768;
                    i10.f44197v0 = 0;
                }
                i10.f44198w0 = C5254f.f43638c;
                i10.f44181Y = 0;
                androidx.compose.ui.node.a aVar = this.f5770n0;
                i10.f44199x0 = aVar.f24859w0;
                i10.f44198w0 = Ng.H.z(this.f4055h0);
                ((C0714y) AbstractC0579h.C(aVar)).getSnapshotObserver().a(this, C0578g.f5748o0, new f0(0, kVar));
                A a5 = this.f5765B0;
                if (a5 == null) {
                    a5 = new A();
                    this.f5765B0 = a5;
                }
                a5.f5582a = i10.f44182Z;
                a5.f5583b = i10.f44183h0;
                a5.f5584c = i10.f44185j0;
                a5.f5585d = i10.f44186k0;
                a5.f5586e = i10.f44190o0;
                a5.f5587f = i10.f44191p0;
                a5.f5588g = i10.f44192q0;
                a5.f5589h = i10.f44193r0;
                a5.f5590i = i10.f44194s0;
                n0Var.g(i10, aVar.f24860x0, aVar.f24859w0);
                this.f5774r0 = i10.f44196u0;
                this.f5778v0 = i10.f44184i0;
                if (z10 && (owner = aVar.f24850n0) != null) {
                    ((C0714y) owner).s(aVar);
                    return;
                }
                return;
            }
            throw new IllegalStateException("updateLayerParameters requires a non-null layerBlock".toString());
        } else if (this.f5775s0 == null) {
        } else {
            throw new IllegalStateException("null layer with a non-null layerBlock".toString());
        }
    }

    @Override // Z0.b
    public final float b() {
        return this.f5770n0.f24859w0.b();
    }

    @Override // E0.AbstractC0461u
    public final long d(long j6) {
        long M10 = M(j6);
        C0714y c0714y = (C0714y) AbstractC0579h.C(this.f5770n0);
        c0714y.v();
        return C5335B.b(M10, c0714y.f7088Q0);
    }

    @Override // G0.W
    public final androidx.compose.ui.node.a e0() {
        return this.f5770n0;
    }

    @Override // E0.AbstractC0461u
    public final AbstractC0461u f() {
        if (G0().f37732r0) {
            N0();
            return this.f5772p0;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // E0.AbstractC0459s
    public final Z0.l getLayoutDirection() {
        return this.f5770n0.f24860x0;
    }

    @Override // E0.AbstractC0461u
    public final boolean i() {
        return G0().f37732r0;
    }

    @Override // E0.AbstractC0461u
    public final long j() {
        return this.f4055h0;
    }

    @Override // G0.S
    public final S l0() {
        return this.f5771o0;
    }

    @Override // G0.S
    public final boolean n0() {
        if (this.f5779w0 != null) {
            return true;
        }
        return false;
    }

    @Override // G0.S
    public final E0.O p0() {
        E0.O o10 = this.f5779w0;
        if (o10 != null) {
            return o10;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    @Override // G0.q0
    public final boolean q() {
        if (this.f5769F0 != null && !this.f5773q0 && this.f5770n0.S()) {
            return true;
        }
        return false;
    }

    @Override // G0.S
    public final long q0() {
        return this.f5781y0;
    }

    @Override // E0.AbstractC0461u
    public final long s(long j6) {
        if (G0().f37732r0) {
            AbstractC0461u d10 = androidx.compose.ui.layout.a.d(this);
            C0714y c0714y = (C0714y) AbstractC0579h.C(this.f5770n0);
            c0714y.v();
            return B(d10, C5251c.g(C5335B.b(j6, c0714y.f7089R0), androidx.compose.ui.layout.a.l(d10)));
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // G0.S
    public final void s0() {
        X(this.f5781y0, this.f5782z0, this.f5775s0);
    }

    @Override // E0.d0, E0.r
    public final Object u() {
        androidx.compose.ui.node.a aVar = this.f5770n0;
        if (!aVar.f24831B0.d(64)) {
            return null;
        }
        G0();
        Object obj = null;
        for (AbstractC4325q abstractC4325q = aVar.f24831B0.f5703d; abstractC4325q != null; abstractC4325q = abstractC4325q.f37724j0) {
            if ((abstractC4325q.f37722h0 & 64) != 0) {
                AbstractC4325q abstractC4325q2 = abstractC4325q;
                C2104h c2104h = null;
                while (abstractC4325q2 != null) {
                    if (abstractC4325q2 instanceof s0) {
                        obj = ((s0) abstractC4325q2).n0(obj);
                    } else if ((abstractC4325q2.f37722h0 & 64) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                        int i10 = 0;
                        for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                            if ((abstractC4325q3.f37722h0 & 64) != 0) {
                                i10++;
                                if (i10 == 1) {
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
                        if (i10 == 1) {
                        }
                    }
                    abstractC4325q2 = AbstractC0579h.f(c2104h);
                }
            }
        }
        return obj;
    }

    public final void u0(g0 g0Var, C5250b c5250b, boolean z10) {
        if (g0Var == this) {
            return;
        }
        g0 g0Var2 = this.f5772p0;
        if (g0Var2 != null) {
            g0Var2.u0(g0Var, c5250b, z10);
        }
        long j6 = this.f5781y0;
        int i10 = Z0.i.f22798c;
        float f6 = (int) (j6 >> 32);
        c5250b.f43615a -= f6;
        c5250b.f43617c -= f6;
        float f10 = (int) (j6 & 4294967295L);
        c5250b.f43616b -= f10;
        c5250b.f43618d -= f10;
        n0 n0Var = this.f5769F0;
        if (n0Var != null) {
            n0Var.c(c5250b, true);
            if (this.f5774r0 && z10) {
                long j10 = this.f4055h0;
                c5250b.a(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
        }
    }

    public final long v0(g0 g0Var, long j6) {
        if (g0Var == this) {
            return j6;
        }
        g0 g0Var2 = this.f5772p0;
        if (g0Var2 != null && !AbstractC3557B.K(g0Var, g0Var2)) {
            return D0(g0Var2.v0(g0Var, j6));
        }
        return D0(j6);
    }

    public final long w0(long j6) {
        return AbstractC4828h.i(Math.max(0.0f, (C5254f.d(j6) - U()) / 2.0f), Math.max(0.0f, (C5254f.b(j6) - T()) / 2.0f));
    }

    @Override // E0.AbstractC0461u
    public final AbstractC0461u x() {
        if (G0().f37732r0) {
            N0();
            return this.f5770n0.f24831B0.f5702c.f5772p0;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final float x0(long j6, long j10) {
        float f6;
        float f10;
        if (U() >= C5254f.d(j10) && T() >= C5254f.b(j10)) {
            return Float.POSITIVE_INFINITY;
        }
        long w02 = w0(j10);
        float d10 = C5254f.d(w02);
        float b10 = C5254f.b(w02);
        float d11 = C5251c.d(j6);
        if (d11 < 0.0f) {
            f6 = -d11;
        } else {
            f6 = d11 - U();
        }
        float max = Math.max(0.0f, f6);
        float e10 = C5251c.e(j6);
        if (e10 < 0.0f) {
            f10 = -e10;
        } else {
            f10 = e10 - T();
        }
        long r10 = R4.b.r(max, Math.max(0.0f, f10));
        if ((d10 <= 0.0f && b10 <= 0.0f) || C5251c.d(r10) > d10 || C5251c.e(r10) > b10) {
            return Float.POSITIVE_INFINITY;
        }
        return (C5251c.e(r10) * C5251c.e(r10)) + (C5251c.d(r10) * C5251c.d(r10));
    }

    public final void y0(AbstractC5352p abstractC5352p) {
        n0 n0Var = this.f5769F0;
        if (n0Var != null) {
            n0Var.i(abstractC5352p);
            return;
        }
        long j6 = this.f5781y0;
        int i10 = Z0.i.f22798c;
        float f6 = (int) (j6 >> 32);
        float f10 = (int) (j6 & 4294967295L);
        abstractC5352p.p(f6, f10);
        A0(abstractC5352p);
        abstractC5352p.p(-f6, -f10);
    }

    public final void z0(AbstractC5352p abstractC5352p, C5342f c5342f) {
        long j6 = this.f4055h0;
        abstractC5352p.s(new C5252d(0.5f, 0.5f, ((int) (j6 >> 32)) - 0.5f, ((int) (j6 & 4294967295L)) - 0.5f), c5342f);
    }
}

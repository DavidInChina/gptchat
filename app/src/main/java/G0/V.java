package G0;

import H0.C0710w;
import b0.C2104h;
import id.AbstractC3557B;
import java.util.Arrays;
import l0.AbstractC4325q;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class V {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.compose.ui.node.a f5682a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5684c;

    /* renamed from: h  reason: collision with root package name */
    public Z0.a f5689h;

    /* renamed from: b  reason: collision with root package name */
    public final C0589s f5683b = new C0589s();

    /* renamed from: d  reason: collision with root package name */
    public final m0 f5685d = new m0();

    /* renamed from: e  reason: collision with root package name */
    public final C2104h f5686e = new C2104h(new p0[16]);

    /* renamed from: f  reason: collision with root package name */
    public final long f5687f = 1;

    /* renamed from: g  reason: collision with root package name */
    public final C2104h f5688g = new C2104h(new U[16]);

    public V(androidx.compose.ui.node.a aVar) {
        this.f5682a = aVar;
    }

    public static boolean g(androidx.compose.ui.node.a aVar) {
        if (aVar.B() == 1 || aVar.t().f5661o.f5643y0.f()) {
            return true;
        }
        return false;
    }

    public static boolean h(androidx.compose.ui.node.a aVar) {
        P p10;
        if (aVar.C() == 1) {
            return true;
        }
        L l10 = aVar.t().f5662p;
        if (l10 != null && (p10 = l10.f5613u0) != null && p10.f()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r10 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        AbstractC4325q abstractC4325q;
        C2104h c2104h = this.f5686e;
        int i10 = c2104h.f25569h0;
        if (i10 > 0) {
            Object[] objArr = c2104h.f25567Y;
            int i11 = 0;
            do {
                C0572a0 c0572a0 = ((androidx.compose.ui.node.a) ((p0) objArr[i11])).f24831B0;
                C0595y c0595y = c0572a0.f5701b;
                boolean s10 = AbstractC0579h.s(128);
                if (s10) {
                    abstractC4325q = c0595y.f5846L0;
                } else {
                    abstractC4325q = c0595y.f5846L0.f37724j0;
                }
                r0.I i12 = g0.f5759G0;
                for (AbstractC4325q I02 = c0595y.I0(s10); I02 != null && (I02.f37723i0 & 128) != 0; I02 = I02.f37725k0) {
                    if ((I02.f37722h0 & 128) != 0) {
                        AbstractC4325q abstractC4325q2 = I02;
                        C2104h c2104h2 = null;
                        while (abstractC4325q2 != null) {
                            if (abstractC4325q2 instanceof B) {
                                ((B) abstractC4325q2).I(c0572a0.f5701b);
                            } else if ((abstractC4325q2.f37722h0 & 128) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                                int i13 = 0;
                                for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                                    if ((abstractC4325q3.f37722h0 & 128) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            abstractC4325q2 = abstractC4325q3;
                                        } else {
                                            if (c2104h2 == null) {
                                                c2104h2 = new C2104h(new AbstractC4325q[16]);
                                            }
                                            if (abstractC4325q2 != null) {
                                                c2104h2.b(abstractC4325q2);
                                                abstractC4325q2 = null;
                                            }
                                            c2104h2.b(abstractC4325q3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            abstractC4325q2 = AbstractC0579h.f(c2104h2);
                        }
                    }
                    if (I02 == abstractC4325q) {
                        break;
                    }
                }
                i11++;
            } while (i11 < i10);
            c2104h.f();
        }
        c2104h.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r4 < r7) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z10) {
        androidx.compose.ui.node.a[] aVarArr;
        m0 m0Var = this.f5685d;
        if (z10) {
            C2104h c2104h = m0Var.f5812a;
            c2104h.f();
            androidx.compose.ui.node.a aVar = this.f5682a;
            c2104h.b(aVar);
            aVar.f24838I0 = true;
        }
        l0 l0Var = l0.f5810Y;
        C2104h c2104h2 = m0Var.f5812a;
        Object[] objArr = c2104h2.f25567Y;
        int i10 = c2104h2.f25569h0;
        AbstractC3557B.c0("<this>", objArr);
        Arrays.sort(objArr, 0, i10, l0Var);
        int i11 = c2104h2.f25569h0;
        androidx.compose.ui.node.a[] aVarArr2 = m0Var.f5813b;
        if (aVarArr2 != null) {
            int length = aVarArr2.length;
            aVarArr = aVarArr2;
        }
        aVarArr = new androidx.compose.ui.node.a[Math.max(16, i11)];
        m0Var.f5813b = null;
        for (int i12 = 0; i12 < i11; i12++) {
            aVarArr[i12] = c2104h2.f25567Y[i12];
        }
        c2104h2.f();
        for (int i13 = i11 - 1; -1 < i13; i13--) {
            androidx.compose.ui.node.a aVar2 = aVarArr[i13];
            AbstractC3557B.Z(aVar2);
            if (aVar2.f24838I0) {
                m0.a(aVar2);
            }
        }
        m0Var.f5813b = aVarArr;
    }

    public final boolean c(androidx.compose.ui.node.a aVar, Z0.a aVar2) {
        boolean z10;
        if (aVar.f24844h0 == null) {
            return false;
        }
        if (aVar2 != null) {
            z10 = aVar.W(aVar2);
        } else {
            z10 = androidx.compose.ui.node.a.X(aVar);
        }
        androidx.compose.ui.node.a E10 = aVar.E();
        if (z10 && E10 != null) {
            if (E10.f24844h0 == null) {
                r(E10, false);
            } else if (aVar.C() == 1) {
                p(E10, false);
            } else if (aVar.C() == 2) {
                o(E10, false);
            }
        }
        return z10;
    }

    public final boolean d(androidx.compose.ui.node.a aVar, Z0.a aVar2) {
        boolean z10;
        if (aVar2 != null) {
            z10 = aVar.h0(aVar2);
        } else {
            z10 = androidx.compose.ui.node.a.i0(aVar);
        }
        androidx.compose.ui.node.a E10 = aVar.E();
        if (z10 && E10 != null) {
            if (aVar.B() == 1) {
                r(E10, false);
            } else if (aVar.B() == 2) {
                q(E10, false);
            }
        }
        return z10;
    }

    public final void e(androidx.compose.ui.node.a aVar, boolean z10) {
        r rVar;
        boolean z11;
        C0589s c0589s = this.f5683b;
        if (z10) {
            rVar = c0589s.f5829a;
        } else {
            rVar = c0589s.f5830b;
        }
        if (rVar.f5820c.isEmpty()) {
            return;
        }
        if (this.f5684c) {
            if (z10) {
                z11 = aVar.x();
            } else {
                z11 = aVar.A();
            }
            if (!z11) {
                f(aVar, z10);
                return;
            }
            throw new IllegalArgumentException("node not yet measured".toString());
        }
        throw new IllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(androidx.compose.ui.node.a aVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        C2104h J10 = aVar.J();
        int i10 = J10.f25569h0;
        C0589s c0589s = this.f5683b;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if ((!z10 && g(aVar2)) || (z10 && h(aVar2))) {
                    if (AbstractC0579h.x(aVar2) && !z10) {
                        if (aVar2.x() && c0589s.f5829a.b(aVar2)) {
                            l(aVar2, true, false);
                        } else {
                            e(aVar2, true);
                        }
                    }
                    if (z10) {
                        z12 = aVar2.x();
                    } else {
                        z12 = aVar2.A();
                    }
                    if (z12) {
                        boolean b10 = c0589s.f5829a.b(aVar2);
                        if (!z10 ? b10 || c0589s.f5830b.b(aVar2) : b10) {
                            l(aVar2, z10, false);
                        }
                    }
                    if (z10) {
                        z13 = aVar2.x();
                    } else {
                        z13 = aVar2.A();
                    }
                    if (!z13) {
                        f(aVar2, z10);
                    }
                }
                i11++;
            } while (i11 < i10);
            if (!z10) {
                z11 = aVar.x();
            } else {
                z11 = aVar.A();
            }
            if (!z11) {
                boolean b11 = c0589s.f5829a.b(aVar);
                if (z10) {
                    if (!b11) {
                        return;
                    }
                } else if (!b11 && !c0589s.f5830b.b(aVar)) {
                    return;
                }
                l(aVar, z10, false);
                return;
            }
            return;
        }
        if (!z10) {
        }
        if (!z11) {
        }
    }

    public final boolean i(C0710w c0710w) {
        boolean z10;
        androidx.compose.ui.node.a aVar;
        C0589s c0589s = this.f5683b;
        androidx.compose.ui.node.a aVar2 = this.f5682a;
        if (aVar2.S()) {
            if (aVar2.T()) {
                if (!this.f5684c) {
                    boolean z11 = false;
                    if (this.f5689h != null) {
                        this.f5684c = true;
                        try {
                            if (c0589s.b()) {
                                z10 = false;
                                while (true) {
                                    boolean b10 = c0589s.b();
                                    r rVar = c0589s.f5829a;
                                    if (!b10) {
                                        break;
                                    }
                                    boolean z12 = !rVar.f5820c.isEmpty();
                                    if (z12) {
                                        aVar = (androidx.compose.ui.node.a) rVar.f5820c.first();
                                    } else {
                                        rVar = c0589s.f5830b;
                                        aVar = (androidx.compose.ui.node.a) rVar.f5820c.first();
                                    }
                                    rVar.c(aVar);
                                    boolean l10 = l(aVar, z12, true);
                                    if (aVar == aVar2 && l10) {
                                        z10 = true;
                                    }
                                }
                                if (c0710w != null) {
                                    c0710w.mo122invoke();
                                }
                            } else {
                                z10 = false;
                            }
                            this.f5684c = false;
                            z11 = z10;
                        } catch (Throwable th2) {
                            this.f5684c = false;
                            throw th2;
                        }
                    }
                    a();
                    return z11;
                }
                throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
            }
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
    }

    public final void j(androidx.compose.ui.node.a aVar, long j6) {
        if (aVar.f24839J0) {
            return;
        }
        androidx.compose.ui.node.a aVar2 = this.f5682a;
        if (!AbstractC3557B.K(aVar, aVar2)) {
            if (aVar2.S()) {
                if (aVar2.T()) {
                    if (!this.f5684c) {
                        if (this.f5689h != null) {
                            this.f5684c = true;
                            try {
                                C0589s c0589s = this.f5683b;
                                c0589s.f5829a.c(aVar);
                                c0589s.f5830b.c(aVar);
                                boolean c10 = c(aVar, new Z0.a(j6));
                                d(aVar, new Z0.a(j6));
                                if (!c10) {
                                    if (aVar.w()) {
                                    }
                                    if (aVar.u() && aVar.T()) {
                                        aVar.l0();
                                        this.f5685d.f5812a.b(aVar);
                                        aVar.f24838I0 = true;
                                    }
                                    this.f5684c = false;
                                }
                                if (AbstractC3557B.K(aVar.V(), Boolean.TRUE)) {
                                    aVar.Y();
                                }
                                if (aVar.u()) {
                                    aVar.l0();
                                    this.f5685d.f5812a.b(aVar);
                                    aVar.f24838I0 = true;
                                }
                                this.f5684c = false;
                            } catch (Throwable th2) {
                                this.f5684c = false;
                                throw th2;
                            }
                        }
                        a();
                        return;
                    }
                    throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
                }
                throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
            }
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
        throw new IllegalArgumentException("measureAndLayout called on root".toString());
    }

    public final void k() {
        C0589s c0589s = this.f5683b;
        if (c0589s.b()) {
            androidx.compose.ui.node.a aVar = this.f5682a;
            if (aVar.S()) {
                if (aVar.T()) {
                    if (!this.f5684c) {
                        if (this.f5689h != null) {
                            this.f5684c = true;
                            try {
                                if (!c0589s.f5829a.f5820c.isEmpty()) {
                                    if (aVar.f24844h0 != null) {
                                        n(aVar, true);
                                    } else {
                                        m(aVar);
                                    }
                                }
                                n(aVar, false);
                                this.f5684c = false;
                                return;
                            } catch (Throwable th2) {
                                this.f5684c = false;
                                throw th2;
                            }
                        }
                        return;
                    }
                    throw new IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
                }
                throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
            }
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
    }

    public final boolean l(androidx.compose.ui.node.a aVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        androidx.compose.ui.node.a E10;
        Z0.a aVar2;
        int i10 = 0;
        if (aVar.f24839J0) {
            return false;
        }
        if (!aVar.T() && !aVar.U() && ((!aVar.A() || !g(aVar)) && !AbstractC3557B.K(aVar.V(), Boolean.TRUE) && ((!aVar.x() || !h(aVar)) && !aVar.l()))) {
            return false;
        }
        boolean x10 = aVar.x();
        androidx.compose.ui.node.a aVar3 = this.f5682a;
        if (!x10 && !aVar.A()) {
            z13 = false;
            z12 = false;
        } else {
            if (aVar == aVar3) {
                aVar2 = this.f5689h;
                AbstractC3557B.Z(aVar2);
            } else {
                aVar2 = null;
            }
            if (aVar.x() && z10) {
                z12 = c(aVar, aVar2);
            } else {
                z12 = false;
            }
            z13 = d(aVar, aVar2);
        }
        if (z11) {
            if ((z12 || aVar.w()) && AbstractC3557B.K(aVar.V(), Boolean.TRUE) && z10) {
                aVar.Y();
            }
            if (aVar.u() && (aVar == aVar3 || ((E10 = aVar.E()) != null && E10.T() && aVar.U()))) {
                if (aVar == aVar3) {
                    aVar.g0();
                } else {
                    aVar.l0();
                }
                this.f5685d.f5812a.b(aVar);
                aVar.f24838I0 = true;
            }
        }
        C2104h c2104h = this.f5688g;
        if (c2104h.l()) {
            int i11 = c2104h.f25569h0;
            if (i11 > 0) {
                Object[] objArr = c2104h.f25567Y;
                do {
                    U u10 = (U) objArr[i10];
                    if (u10.f5679a.S()) {
                        boolean z14 = u10.f5680b;
                        boolean z15 = u10.f5681c;
                        androidx.compose.ui.node.a aVar4 = u10.f5679a;
                        if (!z14) {
                            r(aVar4, z15);
                        } else {
                            p(aVar4, z15);
                        }
                    }
                    i10++;
                } while (i10 < i11);
                c2104h.f();
            } else {
                c2104h.f();
            }
        }
        return z13;
    }

    public final void m(androidx.compose.ui.node.a aVar) {
        C2104h J10 = aVar.J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (g(aVar2)) {
                    if (AbstractC0579h.x(aVar2)) {
                        n(aVar2, true);
                    } else {
                        m(aVar2);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final void n(androidx.compose.ui.node.a aVar, boolean z10) {
        Z0.a aVar2;
        if (aVar == this.f5682a) {
            aVar2 = this.f5689h;
            AbstractC3557B.Z(aVar2);
        } else {
            aVar2 = null;
        }
        if (z10) {
            c(aVar, aVar2);
        } else {
            d(aVar, aVar2);
        }
    }

    public final boolean o(androidx.compose.ui.node.a aVar, boolean z10) {
        int f6 = AbstractC6708l.f(aVar.v());
        if (f6 != 0) {
            if (f6 == 1) {
                return false;
            }
            if (f6 != 2) {
                if (f6 == 3) {
                    return false;
                }
                if (f6 != 4) {
                    throw new RuntimeException();
                }
            }
        }
        if ((aVar.x() || aVar.w()) && !z10) {
            return false;
        }
        aVar.a0();
        aVar.Z();
        if (aVar.f24839J0) {
            return false;
        }
        androidx.compose.ui.node.a E10 = aVar.E();
        boolean K10 = AbstractC3557B.K(aVar.V(), Boolean.TRUE);
        C0589s c0589s = this.f5683b;
        if (K10 && ((E10 == null || !E10.x()) && (E10 == null || !E10.w()))) {
            c0589s.a(aVar, true);
        } else if (aVar.T() && ((E10 == null || !E10.u()) && (E10 == null || !E10.A()))) {
            c0589s.a(aVar, false);
        }
        if (this.f5684c) {
            return false;
        }
        return true;
    }

    public final boolean p(androidx.compose.ui.node.a aVar, boolean z10) {
        androidx.compose.ui.node.a E10;
        androidx.compose.ui.node.a E11;
        if (aVar.f24844h0 != null) {
            int f6 = AbstractC6708l.f(aVar.v());
            if (f6 != 0) {
                if (f6 == 1) {
                    return false;
                }
                if (f6 != 2 && f6 != 3) {
                    if (f6 == 4) {
                        if (aVar.x() && !z10) {
                            return false;
                        }
                        aVar.b0();
                        aVar.c0();
                        if (aVar.f24839J0) {
                            return false;
                        }
                        boolean K10 = AbstractC3557B.K(aVar.V(), Boolean.TRUE);
                        C0589s c0589s = this.f5683b;
                        if ((!K10 && (!aVar.x() || !h(aVar))) || ((E11 = aVar.E()) != null && E11.x())) {
                            if ((aVar.T() || (aVar.A() && g(aVar))) && ((E10 = aVar.E()) == null || !E10.A())) {
                                c0589s.a(aVar, false);
                            }
                        } else {
                            c0589s.a(aVar, true);
                        }
                        if (this.f5684c) {
                            return false;
                        }
                        return true;
                    }
                    throw new RuntimeException();
                }
            }
            this.f5688g.b(new U(aVar, true, z10));
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope".toString());
    }

    public final boolean q(androidx.compose.ui.node.a aVar, boolean z10) {
        androidx.compose.ui.node.a E10;
        int f6 = AbstractC6708l.f(aVar.v());
        if (f6 == 0 || f6 == 1 || f6 == 2 || f6 == 3) {
            return false;
        }
        if (f6 == 4) {
            if (!z10 && aVar.T() == aVar.U() && (aVar.A() || aVar.u())) {
                return false;
            }
            aVar.Z();
            if (aVar.f24839J0) {
                return false;
            }
            if (aVar.U() && (((E10 = aVar.E()) == null || !E10.u()) && (E10 == null || !E10.A()))) {
                this.f5683b.a(aVar, false);
            }
            if (this.f5684c) {
                return false;
            }
            return true;
        }
        throw new RuntimeException();
    }

    public final boolean r(androidx.compose.ui.node.a aVar, boolean z10) {
        androidx.compose.ui.node.a E10;
        int f6 = AbstractC6708l.f(aVar.v());
        if (f6 == 0 || f6 == 1) {
            return false;
        }
        if (f6 != 2 && f6 != 3) {
            if (f6 == 4) {
                if (aVar.A() && !z10) {
                    return false;
                }
                aVar.c0();
                if (aVar.f24839J0) {
                    return false;
                }
                if ((aVar.T() || (aVar.A() && g(aVar))) && ((E10 = aVar.E()) == null || !E10.A())) {
                    this.f5683b.a(aVar, false);
                }
                if (this.f5684c) {
                    return false;
                }
                return true;
            }
            throw new RuntimeException();
        }
        this.f5688g.b(new U(aVar, false, z10));
        return false;
    }

    public final void s(long j6) {
        Z0.a aVar = this.f5689h;
        if (aVar == null || !Z0.a.b(aVar.f22782a, j6)) {
            boolean z10 = true;
            if (!this.f5684c) {
                this.f5689h = new Z0.a(j6);
                androidx.compose.ui.node.a aVar2 = this.f5682a;
                if (aVar2.f24844h0 != null) {
                    aVar2.b0();
                }
                aVar2.c0();
                if (aVar2.f24844h0 == null) {
                    z10 = false;
                }
                this.f5683b.a(aVar2, z10);
                return;
            }
            throw new IllegalArgumentException("updateRootConstraints called while measuring".toString());
        }
    }
}

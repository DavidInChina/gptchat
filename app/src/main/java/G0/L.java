package G0;

import E0.AbstractC0442a;
import H0.C0714y;
import androidx.compose.ui.node.Owner;
import b0.C2104h;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class L extends E0.d0 implements E0.M, AbstractC0574c {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f5601A0;

    /* renamed from: B0  reason: collision with root package name */
    public final /* synthetic */ O f5602B0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5603k0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f5607o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f5608p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f5609q0;

    /* renamed from: r0  reason: collision with root package name */
    public Z0.a f5610r0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f5612t0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f5616x0;

    /* renamed from: z0  reason: collision with root package name */
    public Object f5618z0;

    /* renamed from: l0  reason: collision with root package name */
    public int f5604l0 = Integer.MAX_VALUE;

    /* renamed from: m0  reason: collision with root package name */
    public int f5605m0 = Integer.MAX_VALUE;

    /* renamed from: n0  reason: collision with root package name */
    public int f5606n0 = 3;

    /* renamed from: s0  reason: collision with root package name */
    public long f5611s0 = Z0.i.f22797b;

    /* renamed from: u0  reason: collision with root package name */
    public final P f5613u0 = new AbstractC0573b(this);

    /* renamed from: v0  reason: collision with root package name */
    public final C2104h f5614v0 = new C2104h(new L[16]);

    /* renamed from: w0  reason: collision with root package name */
    public boolean f5615w0 = true;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f5617y0 = true;

    /* JADX WARN: Type inference failed for: r0v3, types: [G0.P, G0.b] */
    public L(O o10) {
        this.f5602B0 = o10;
        this.f5618z0 = o10.f5661o.f5640v0;
    }

    @Override // G0.AbstractC0574c
    public final void A(wf.k kVar) {
        C2104h J10 = this.f5602B0.f5647a.J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                L l10 = ((androidx.compose.ui.node.a) objArr[i11]).t().f5662p;
                AbstractC3557B.Z(l10);
                kVar.invoke(l10);
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // E0.Q
    public final int G(AbstractC0442a abstractC0442a) {
        int i10;
        O o10 = this.f5602B0;
        androidx.compose.ui.node.a E10 = o10.f5647a.E();
        if (E10 != null) {
            i10 = E10.v();
        } else {
            i10 = 0;
        }
        P p10 = this.f5613u0;
        if (i10 == 2) {
            p10.f5710c = true;
        } else {
            androidx.compose.ui.node.a E11 = o10.f5647a.E();
            if (E11 != null && E11.v() == 4) {
                p10.f5711d = true;
            }
        }
        this.f5607o0 = true;
        T E02 = o10.a().E0();
        AbstractC3557B.Z(E02);
        int G10 = E02.G(abstractC0442a);
        this.f5607o0 = false;
        return G10;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    @Override // G0.AbstractC0574c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        T t10;
        C2104h J10;
        int i10;
        Z0.a aVar;
        this.f5616x0 = true;
        P p10 = this.f5613u0;
        p10.i();
        O o10 = this.f5602B0;
        boolean z10 = o10.f5654h;
        androidx.compose.ui.node.a aVar2 = o10.f5647a;
        if (z10 && (i10 = (J10 = aVar2.J()).f25569h0) > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar3.x() && aVar3.C() == 1) {
                    L l10 = aVar3.t().f5662p;
                    AbstractC3557B.Z(l10);
                    L l11 = aVar3.t().f5662p;
                    if (l11 != null) {
                        aVar = l11.f5610r0;
                    } else {
                        aVar = null;
                    }
                    AbstractC3557B.Z(aVar);
                    if (l10.r0(aVar.f22782a)) {
                        androidx.compose.ui.node.a.n0(aVar2, false, 3);
                    }
                }
                i11++;
            } while (i11 < i10);
            t10 = e().f5847M0;
            AbstractC3557B.Z(t10);
            if (!o10.f5655i) {
            }
            o10.f5654h = false;
            int i12 = o10.f5649c;
            o10.f5649c = 4;
            Owner C10 = AbstractC0579h.C(aVar2);
            o10.d(false);
            r0 snapshotObserver = ((C0714y) C10).getSnapshotObserver();
            F.s sVar = new F.s(this, t10, o10, 5);
            snapshotObserver.getClass();
            if (aVar2.f24844h0 == null) {
            }
            o10.f5649c = i12;
            if (o10.f5658l) {
                requestLayout();
            }
            o10.f5655i = false;
            if (p10.f5711d) {
            }
            if (p10.f5709b) {
                p10.h();
            }
            this.f5616x0 = false;
        }
        t10 = e().f5847M0;
        AbstractC3557B.Z(t10);
        if (!o10.f5655i || (!this.f5607o0 && !t10.f5671l0 && o10.f5654h)) {
            o10.f5654h = false;
            int i122 = o10.f5649c;
            o10.f5649c = 4;
            Owner C102 = AbstractC0579h.C(aVar2);
            o10.d(false);
            r0 snapshotObserver2 = ((C0714y) C102).getSnapshotObserver();
            F.s sVar2 = new F.s(this, t10, o10, 5);
            snapshotObserver2.getClass();
            if (aVar2.f24844h0 == null) {
                snapshotObserver2.a(aVar2, snapshotObserver2.f5828h, sVar2);
            } else {
                snapshotObserver2.a(aVar2, snapshotObserver2.f5825e, sVar2);
            }
            o10.f5649c = i122;
            if (o10.f5658l && t10.f5671l0) {
                requestLayout();
            }
            o10.f5655i = false;
        }
        if (p10.f5711d) {
            p10.f5712e = true;
        }
        if (p10.f5709b && p10.f()) {
            p10.h();
        }
        this.f5616x0 = false;
    }

    @Override // G0.AbstractC0574c
    public final boolean I() {
        return this.f5612t0;
    }

    @Override // G0.AbstractC0574c
    public final void N() {
        androidx.compose.ui.node.a.n0(this.f5602B0.f5647a, false, 3);
    }

    @Override // E0.r
    public final int S(int i10) {
        p0();
        T E02 = this.f5602B0.a().E0();
        AbstractC3557B.Z(E02);
        return ((C0594x) E02).S(i10);
    }

    @Override // E0.d0
    public final int T() {
        T E02 = this.f5602B0.a().E0();
        AbstractC3557B.Z(E02);
        return E02.T();
    }

    @Override // E0.d0
    public final int U() {
        T E02 = this.f5602B0.a().E0();
        AbstractC3557B.Z(E02);
        return E02.U();
    }

    @Override // E0.d0
    public final void X(long j6, float f6, wf.k kVar) {
        O o10 = this.f5602B0;
        if (!o10.f5647a.f24839J0) {
            o10.f5649c = 4;
            this.f5608p0 = true;
            this.f5601A0 = false;
            if (!Z0.i.a(j6, this.f5611s0)) {
                if (o10.f5659m || o10.f5658l) {
                    o10.f5654h = true;
                }
                n0();
            }
            androidx.compose.ui.node.a aVar = o10.f5647a;
            Owner C10 = AbstractC0579h.C(aVar);
            if (!o10.f5654h && this.f5612t0) {
                T E02 = o10.a().E0();
                AbstractC3557B.Z(E02);
                long j10 = E02.f4057j0;
                long c10 = kotlin.jvm.internal.m.c(((int) (j6 >> 32)) + ((int) (j10 >> 32)), ((int) (j6 & 4294967295L)) + ((int) (j10 & 4294967295L)));
                if (!Z0.i.a(E02.f5674o0, c10)) {
                    E02.f5674o0 = c10;
                    g0 g0Var = E02.f5673n0;
                    L l10 = g0Var.f5770n0.t().f5662p;
                    if (l10 != null) {
                        l10.n0();
                    }
                    S.r0(g0Var);
                }
                q0();
            } else {
                o10.c(false);
                this.f5613u0.f5714g = false;
                r0 snapshotObserver = ((C0714y) C10).getSnapshotObserver();
                K k10 = new K(o10, C10, j6);
                snapshotObserver.getClass();
                if (aVar.f24844h0 != null) {
                    snapshotObserver.a(aVar, snapshotObserver.f5827g, k10);
                } else {
                    snapshotObserver.a(aVar, snapshotObserver.f5826f, k10);
                }
            }
            this.f5611s0 = j6;
            o10.f5649c = 5;
            return;
        }
        throw new IllegalArgumentException("place is called on a deactivated node".toString());
    }

    @Override // G0.AbstractC0574c
    public final AbstractC0573b a() {
        return this.f5613u0;
    }

    @Override // E0.r
    public final int c(int i10) {
        p0();
        T E02 = this.f5602B0.a().E0();
        AbstractC3557B.Z(E02);
        return ((C0594x) E02).c(i10);
    }

    @Override // G0.AbstractC0574c
    public final C0595y e() {
        return this.f5602B0.f5647a.f24831B0.f5701b;
    }

    @Override // G0.AbstractC0574c
    public final AbstractC0574c h() {
        O t10;
        androidx.compose.ui.node.a E10 = this.f5602B0.f5647a.E();
        if (E10 != null && (t10 = E10.t()) != null) {
            return t10.f5662p;
        }
        return null;
    }

    public final void h0() {
        boolean z10 = this.f5612t0;
        this.f5612t0 = true;
        O o10 = this.f5602B0;
        if (!z10 && o10.f5653g) {
            androidx.compose.ui.node.a.n0(o10.f5647a, true, 2);
        }
        C2104h J10 = o10.f5647a.J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar.F() != Integer.MAX_VALUE) {
                    L y10 = aVar.y();
                    AbstractC3557B.Z(y10);
                    y10.h0();
                    androidx.compose.ui.node.a.q0(aVar);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // E0.r
    public final int l(int i10) {
        p0();
        T E02 = this.f5602B0.a().E0();
        AbstractC3557B.Z(E02);
        return ((C0594x) E02).l(i10);
    }

    public final void l0() {
        if (this.f5612t0) {
            int i10 = 0;
            this.f5612t0 = false;
            C2104h J10 = this.f5602B0.f5647a.J();
            int i11 = J10.f25569h0;
            if (i11 > 0) {
                Object[] objArr = J10.f25567Y;
                do {
                    L l10 = ((androidx.compose.ui.node.a) objArr[i10]).t().f5662p;
                    AbstractC3557B.Z(l10);
                    l10.l0();
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    @Override // E0.r
    public final int m(int i10) {
        p0();
        T E02 = this.f5602B0.a().E0();
        AbstractC3557B.Z(E02);
        return ((C0594x) E02).m(i10);
    }

    public final void n0() {
        C2104h J10;
        int i10;
        O o10 = this.f5602B0;
        if (o10.f5660n > 0 && (i10 = (J10 = o10.f5647a.J()).f25569h0) > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) objArr[i11];
                O t10 = aVar.t();
                if ((t10.f5658l || t10.f5659m) && !t10.f5651e) {
                    aVar.m0(false);
                }
                L l10 = t10.f5662p;
                if (l10 != null) {
                    l10.n0();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // E0.M
    public final E0.d0 o(long j6) {
        androidx.compose.ui.node.a E10;
        O o10 = this.f5602B0;
        androidx.compose.ui.node.a E11 = o10.f5647a.E();
        int i10 = 2;
        androidx.compose.ui.node.a aVar = o10.f5647a;
        if ((E11 != null && E11.v() == 2) || ((E10 = aVar.E()) != null && E10.v() == 4)) {
            o10.f5648b = false;
        }
        androidx.compose.ui.node.a E12 = aVar.E();
        if (E12 != null) {
            if (this.f5606n0 != 3 && !aVar.f24830A0) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
            }
            int f6 = AbstractC6708l.f(E12.v());
            if (f6 != 0 && f6 != 1) {
                if (f6 != 2 && f6 != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(E9.f.I(E12.v())));
                }
            } else {
                i10 = 1;
            }
            this.f5606n0 = i10;
        } else {
            this.f5606n0 = 3;
        }
        if (aVar.f24840K0 == 3) {
            aVar.d();
        }
        r0(j6);
        return this;
    }

    public final void p0() {
        int i10;
        O o10 = this.f5602B0;
        androidx.compose.ui.node.a.n0(o10.f5647a, false, 3);
        androidx.compose.ui.node.a aVar = o10.f5647a;
        androidx.compose.ui.node.a E10 = aVar.E();
        if (E10 != null && aVar.f24840K0 == 3) {
            int f6 = AbstractC6708l.f(E10.v());
            if (f6 != 0) {
                i10 = 2;
                if (f6 != 2) {
                    i10 = E10.f24840K0;
                }
            } else {
                i10 = 1;
            }
            aVar.f24840K0 = i10;
        }
    }

    public final void q0() {
        this.f5601A0 = true;
        androidx.compose.ui.node.a E10 = this.f5602B0.f5647a.E();
        if (!this.f5612t0) {
            h0();
            if (this.f5603k0 && E10 != null) {
                E10.m0(false);
            }
        }
        if (E10 != null) {
            if (!this.f5603k0 && (E10.v() == 3 || E10.v() == 4)) {
                if (this.f5605m0 == Integer.MAX_VALUE) {
                    this.f5605m0 = E10.t().f5656j;
                    E10.t().f5656j++;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
        } else {
            this.f5605m0 = 0;
        }
        H();
    }

    public final boolean r0(long j6) {
        boolean z10;
        long j10;
        Z0.a aVar;
        O o10 = this.f5602B0;
        androidx.compose.ui.node.a aVar2 = o10.f5647a;
        if (!aVar2.f24839J0) {
            androidx.compose.ui.node.a E10 = aVar2.E();
            androidx.compose.ui.node.a aVar3 = o10.f5647a;
            if (!aVar3.f24830A0 && (E10 == null || !E10.f24830A0)) {
                z10 = false;
            } else {
                z10 = true;
            }
            aVar3.f24830A0 = z10;
            if (!aVar3.x() && (aVar = this.f5610r0) != null && Z0.a.b(aVar.f22782a, j6)) {
                Owner owner = aVar3.f24850n0;
                if (owner != null) {
                    ((C0714y) owner).f7083L0.e(aVar3, true);
                }
                aVar3.s0();
                return false;
            }
            this.f5610r0 = new Z0.a(j6);
            d0(j6);
            this.f5613u0.f5713f = false;
            A(C0578g.f5743j0);
            if (this.f5609q0) {
                j10 = this.f4055h0;
            } else {
                j10 = Ng.H.c(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
            this.f5609q0 = true;
            T E02 = o10.a().E0();
            if (E02 != null) {
                o10.f5649c = 2;
                o10.f5653g = false;
                r0 snapshotObserver = ((C0714y) AbstractC0579h.C(aVar3)).getSnapshotObserver();
                N n10 = new N(o10, j6);
                snapshotObserver.getClass();
                if (aVar3.f24844h0 != null) {
                    snapshotObserver.a(aVar3, snapshotObserver.f5822b, n10);
                } else {
                    snapshotObserver.a(aVar3, snapshotObserver.f5823c, n10);
                }
                o10.f5654h = true;
                o10.f5655i = true;
                if (AbstractC0579h.x(aVar3)) {
                    o10.f5651e = true;
                    o10.f5652f = true;
                } else {
                    o10.f5650d = true;
                }
                o10.f5649c = 5;
                b0(Ng.H.c(E02.f4053Y, E02.f4054Z));
                if (((int) (j10 >> 32)) != E02.f4053Y || ((int) (4294967295L & j10)) != E02.f4054Z) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
        }
        throw new IllegalArgumentException("measure is called on a deactivated node".toString());
    }

    @Override // G0.AbstractC0574c
    public final void requestLayout() {
        this.f5602B0.f5647a.m0(false);
    }

    @Override // E0.d0, E0.r
    public final Object u() {
        return this.f5618z0;
    }
}

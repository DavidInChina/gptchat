package G0;

import A.C0007a0;
import E0.AbstractC0442a;
import H0.C0714y;
import androidx.compose.ui.node.Owner;
import b0.C2104h;
import id.AbstractC3557B;
import java.util.List;
import z.AbstractC6708l;
import z.C6672L;

/* loaded from: classes2.dex */
public final class M extends E0.d0 implements E0.M, AbstractC0574c {

    /* renamed from: B0  reason: collision with root package name */
    public boolean f5620B0;

    /* renamed from: D0  reason: collision with root package name */
    public float f5622D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f5623E0;

    /* renamed from: F0  reason: collision with root package name */
    public wf.k f5624F0;

    /* renamed from: G0  reason: collision with root package name */
    public long f5625G0;

    /* renamed from: H0  reason: collision with root package name */
    public float f5626H0;

    /* renamed from: I0  reason: collision with root package name */
    public final C0007a0 f5627I0;

    /* renamed from: J0  reason: collision with root package name */
    public final /* synthetic */ O f5628J0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5629k0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f5632n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f5633o0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f5635q0;

    /* renamed from: r0  reason: collision with root package name */
    public long f5636r0;

    /* renamed from: s0  reason: collision with root package name */
    public wf.k f5637s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f5638t0;

    /* renamed from: v0  reason: collision with root package name */
    public Object f5640v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f5641w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f5642x0;

    /* renamed from: l0  reason: collision with root package name */
    public int f5630l0 = Integer.MAX_VALUE;

    /* renamed from: m0  reason: collision with root package name */
    public int f5631m0 = Integer.MAX_VALUE;

    /* renamed from: p0  reason: collision with root package name */
    public int f5634p0 = 3;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f5639u0 = true;

    /* renamed from: y0  reason: collision with root package name */
    public final I f5643y0 = new AbstractC0573b(this);

    /* renamed from: z0  reason: collision with root package name */
    public final C2104h f5644z0 = new C2104h(new M[16]);

    /* renamed from: A0  reason: collision with root package name */
    public boolean f5619A0 = true;

    /* renamed from: C0  reason: collision with root package name */
    public final C6672L f5621C0 = new C6672L(22, this);

    /* JADX WARN: Type inference failed for: r3v0, types: [G0.I, G0.b] */
    public M(O o10) {
        this.f5628J0 = o10;
        long j6 = Z0.i.f22797b;
        this.f5636r0 = j6;
        this.f5625G0 = j6;
        this.f5627I0 = new C0007a0(o10, 13, this);
    }

    @Override // G0.AbstractC0574c
    public final void A(wf.k kVar) {
        C2104h J10 = this.f5628J0.f5647a.J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                kVar.invoke(((androidx.compose.ui.node.a) objArr[i11]).t().f5661o);
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // E0.Q
    public final int G(AbstractC0442a abstractC0442a) {
        int i10;
        O o10 = this.f5628J0;
        androidx.compose.ui.node.a E10 = o10.f5647a.E();
        if (E10 != null) {
            i10 = E10.v();
        } else {
            i10 = 0;
        }
        I i11 = this.f5643y0;
        if (i10 == 1) {
            i11.f5710c = true;
        } else {
            androidx.compose.ui.node.a E11 = o10.f5647a.E();
            if (E11 != null && E11.v() == 3) {
                i11.f5711d = true;
            }
        }
        this.f5635q0 = true;
        int G10 = o10.a().G(abstractC0442a);
        this.f5635q0 = false;
        return G10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    @Override // G0.AbstractC0574c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        C2104h J10;
        int i10;
        this.f5620B0 = true;
        I i11 = this.f5643y0;
        i11.i();
        O o10 = this.f5628J0;
        boolean z10 = o10.f5651e;
        androidx.compose.ui.node.a aVar = o10.f5647a;
        if (z10 && (i10 = (J10 = aVar.J()).f25569h0) > 0) {
            Object[] objArr = J10.f25567Y;
            int i12 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i12];
                if (aVar2.A() && aVar2.B() == 1 && androidx.compose.ui.node.a.i0(aVar2)) {
                    androidx.compose.ui.node.a.p0(aVar, false, 3);
                }
                i12++;
            } while (i12 < i10);
            if (!o10.f5652f) {
            }
            o10.f5651e = false;
            int i13 = o10.f5649c;
            o10.f5649c = 3;
            o10.d(false);
            r0 snapshotObserver = ((C0714y) AbstractC0579h.C(aVar)).getSnapshotObserver();
            snapshotObserver.a(aVar, snapshotObserver.f5825e, this.f5621C0);
            o10.f5649c = i13;
            if (e().f5671l0) {
                requestLayout();
            }
            o10.f5652f = false;
            if (i11.f5711d) {
            }
            if (i11.f5709b) {
                i11.h();
            }
            this.f5620B0 = false;
        }
        if (!o10.f5652f || (!this.f5635q0 && !e().f5671l0 && o10.f5651e)) {
            o10.f5651e = false;
            int i132 = o10.f5649c;
            o10.f5649c = 3;
            o10.d(false);
            r0 snapshotObserver2 = ((C0714y) AbstractC0579h.C(aVar)).getSnapshotObserver();
            snapshotObserver2.a(aVar, snapshotObserver2.f5825e, this.f5621C0);
            o10.f5649c = i132;
            if (e().f5671l0 && o10.f5658l) {
                requestLayout();
            }
            o10.f5652f = false;
        }
        if (i11.f5711d) {
            i11.f5712e = true;
        }
        if (i11.f5709b && i11.f()) {
            i11.h();
        }
        this.f5620B0 = false;
    }

    @Override // G0.AbstractC0574c
    public final boolean I() {
        return this.f5641w0;
    }

    @Override // G0.AbstractC0574c
    public final void N() {
        androidx.compose.ui.node.a.p0(this.f5628J0.f5647a, false, 3);
    }

    @Override // E0.r
    public final int S(int i10) {
        q0();
        return this.f5628J0.a().S(i10);
    }

    @Override // E0.d0
    public final int T() {
        return this.f5628J0.a().T();
    }

    @Override // E0.d0
    public final int U() {
        return this.f5628J0.a().U();
    }

    @Override // E0.d0
    public final void X(long j6, float f6, wf.k kVar) {
        E0.c0 c0Var;
        this.f5642x0 = true;
        boolean a5 = Z0.i.a(j6, this.f5636r0);
        O o10 = this.f5628J0;
        if (!a5) {
            if (o10.f5659m || o10.f5658l) {
                o10.f5651e = true;
            }
            p0();
        }
        boolean z10 = false;
        if (AbstractC0579h.x(o10.f5647a)) {
            g0 g0Var = o10.a().f5772p0;
            androidx.compose.ui.node.a aVar = o10.f5647a;
            if (g0Var == null || (c0Var = g0Var.f5672m0) == null) {
                c0Var = ((C0714y) AbstractC0579h.C(aVar)).getPlacementScope();
            }
            L l10 = o10.f5662p;
            AbstractC3557B.Z(l10);
            androidx.compose.ui.node.a E10 = aVar.E();
            if (E10 != null) {
                E10.t().f5656j = 0;
            }
            l10.f5605m0 = Integer.MAX_VALUE;
            E0.c0.d(c0Var, l10, (int) (j6 >> 32), (int) (4294967295L & j6));
        }
        L l11 = o10.f5662p;
        if (l11 != null && !l11.f5608p0) {
            z10 = true;
        }
        if (true ^ z10) {
            s0(j6, f6, kVar);
            return;
        }
        throw new IllegalArgumentException("Error: Placement happened before lookahead.".toString());
    }

    @Override // G0.AbstractC0574c
    public final AbstractC0573b a() {
        return this.f5643y0;
    }

    @Override // E0.r
    public final int c(int i10) {
        q0();
        return this.f5628J0.a().c(i10);
    }

    @Override // G0.AbstractC0574c
    public final C0595y e() {
        return this.f5628J0.f5647a.f24831B0.f5701b;
    }

    @Override // G0.AbstractC0574c
    public final AbstractC0574c h() {
        O t10;
        androidx.compose.ui.node.a E10 = this.f5628J0.f5647a.E();
        if (E10 != null && (t10 = E10.t()) != null) {
            return t10.f5661o;
        }
        return null;
    }

    public final List h0() {
        O o10 = this.f5628J0;
        o10.f5647a.y0();
        boolean z10 = this.f5619A0;
        C2104h c2104h = this.f5644z0;
        if (!z10) {
            return c2104h.e();
        }
        androidx.compose.ui.node.a aVar = o10.f5647a;
        C2104h J10 = aVar.J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (c2104h.f25569h0 <= i11) {
                    c2104h.b(aVar2.t().f5661o);
                } else {
                    c2104h.p(i11, aVar2.t().f5661o);
                }
                i11++;
            } while (i11 < i10);
            c2104h.o(aVar.o().size(), c2104h.f25569h0);
            this.f5619A0 = false;
            return c2104h.e();
        }
        c2104h.o(aVar.o().size(), c2104h.f25569h0);
        this.f5619A0 = false;
        return c2104h.e();
    }

    @Override // E0.r
    public final int l(int i10) {
        q0();
        return this.f5628J0.a().l(i10);
    }

    public final void l0() {
        boolean z10 = this.f5641w0;
        this.f5641w0 = true;
        androidx.compose.ui.node.a aVar = this.f5628J0.f5647a;
        if (!z10) {
            if (aVar.A()) {
                androidx.compose.ui.node.a.p0(aVar, true, 2);
            } else if (aVar.x()) {
                androidx.compose.ui.node.a.n0(aVar, true, 2);
            }
        }
        C0572a0 c0572a0 = aVar.f24831B0;
        g0 g0Var = c0572a0.f5701b.f5771o0;
        for (g0 g0Var2 = c0572a0.f5702c; !AbstractC3557B.K(g0Var2, g0Var) && g0Var2 != null; g0Var2 = g0Var2.f5771o0) {
            if (g0Var2.f5768E0) {
                g0Var2.L0();
            }
        }
        C2104h J10 = aVar.J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar2.F() != Integer.MAX_VALUE) {
                    aVar2.z().l0();
                    androidx.compose.ui.node.a.q0(aVar2);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    @Override // E0.r
    public final int m(int i10) {
        q0();
        return this.f5628J0.a().m(i10);
    }

    public final void n0() {
        if (this.f5641w0) {
            int i10 = 0;
            this.f5641w0 = false;
            C2104h J10 = this.f5628J0.f5647a.J();
            int i11 = J10.f25569h0;
            if (i11 > 0) {
                Object[] objArr = J10.f25567Y;
                do {
                    ((androidx.compose.ui.node.a) objArr[i10]).z().n0();
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    @Override // E0.M
    public final E0.d0 o(long j6) {
        int i10;
        O o10 = this.f5628J0;
        androidx.compose.ui.node.a aVar = o10.f5647a;
        if (aVar.f24840K0 == 3) {
            aVar.d();
        }
        androidx.compose.ui.node.a aVar2 = o10.f5647a;
        if (AbstractC0579h.x(aVar2)) {
            L l10 = o10.f5662p;
            AbstractC3557B.Z(l10);
            l10.f5606n0 = 3;
            l10.o(j6);
        }
        androidx.compose.ui.node.a E10 = aVar2.E();
        if (E10 != null) {
            if (this.f5634p0 != 3 && !aVar2.f24830A0) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
            }
            int f6 = AbstractC6708l.f(E10.v());
            if (f6 != 0) {
                i10 = 2;
                if (f6 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(E9.f.I(E10.v())));
                }
            } else {
                i10 = 1;
            }
            this.f5634p0 = i10;
        } else {
            this.f5634p0 = 3;
        }
        t0(j6);
        return this;
    }

    public final void p0() {
        C2104h J10;
        int i10;
        O o10 = this.f5628J0;
        if (o10.f5660n > 0 && (i10 = (J10 = o10.f5647a.J()).f25569h0) > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) objArr[i11];
                O t10 = aVar.t();
                if ((t10.f5658l || t10.f5659m) && !t10.f5651e) {
                    aVar.o0(false);
                }
                t10.f5661o.p0();
                i11++;
            } while (i11 < i10);
        }
    }

    public final void q0() {
        int i10;
        O o10 = this.f5628J0;
        androidx.compose.ui.node.a.p0(o10.f5647a, false, 3);
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

    public final void r0() {
        this.f5623E0 = true;
        O o10 = this.f5628J0;
        androidx.compose.ui.node.a E10 = o10.f5647a.E();
        float f6 = e().f5782z0;
        C0572a0 c0572a0 = o10.f5647a.f24831B0;
        g0 g0Var = c0572a0.f5702c;
        while (g0Var != c0572a0.f5701b) {
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator", g0Var);
            D d10 = (D) g0Var;
            f6 += d10.f5782z0;
            g0Var = d10.f5771o0;
        }
        if (f6 != this.f5622D0) {
            this.f5622D0 = f6;
            if (E10 != null) {
                E10.f0();
            }
            if (E10 != null) {
                E10.M();
            }
        }
        if (!this.f5641w0) {
            if (E10 != null) {
                E10.M();
            }
            l0();
            if (this.f5629k0 && E10 != null) {
                E10.o0(false);
            }
        }
        if (E10 != null) {
            if (!this.f5629k0 && E10.v() == 3) {
                if (this.f5631m0 == Integer.MAX_VALUE) {
                    this.f5631m0 = E10.t().f5657k;
                    E10.t().f5657k++;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
        } else {
            this.f5631m0 = 0;
        }
        H();
    }

    @Override // G0.AbstractC0574c
    public final void requestLayout() {
        this.f5628J0.f5647a.o0(false);
    }

    public final void s0(long j6, float f6, wf.k kVar) {
        O o10 = this.f5628J0;
        androidx.compose.ui.node.a aVar = o10.f5647a;
        if (!aVar.f24839J0) {
            o10.f5649c = 3;
            this.f5636r0 = j6;
            this.f5638t0 = f6;
            this.f5637s0 = kVar;
            this.f5633o0 = true;
            this.f5623E0 = false;
            Owner C10 = AbstractC0579h.C(aVar);
            if (!o10.f5651e && this.f5641w0) {
                g0 a5 = o10.a();
                long j10 = a5.f4057j0;
                int i10 = Z0.i.f22798c;
                a5.R0(kotlin.jvm.internal.m.c(((int) (j6 >> 32)) + ((int) (j10 >> 32)), ((int) (j6 & 4294967295L)) + ((int) (j10 & 4294967295L))), f6, kVar);
                r0();
            } else {
                this.f5643y0.f5714g = false;
                o10.c(false);
                this.f5624F0 = kVar;
                this.f5625G0 = j6;
                this.f5626H0 = f6;
                r0 snapshotObserver = ((C0714y) C10).getSnapshotObserver();
                snapshotObserver.a(o10.f5647a, snapshotObserver.f5826f, this.f5627I0);
                this.f5624F0 = null;
            }
            o10.f5649c = 5;
            return;
        }
        throw new IllegalArgumentException("place is called on a deactivated node".toString());
    }

    public final boolean t0(long j6) {
        boolean z10;
        O o10 = this.f5628J0;
        androidx.compose.ui.node.a aVar = o10.f5647a;
        boolean z11 = true;
        if (!aVar.f24839J0) {
            Owner C10 = AbstractC0579h.C(aVar);
            androidx.compose.ui.node.a aVar2 = o10.f5647a;
            androidx.compose.ui.node.a E10 = aVar2.E();
            if (!aVar2.f24830A0 && (E10 == null || !E10.f24830A0)) {
                z10 = false;
            } else {
                z10 = true;
            }
            aVar2.f24830A0 = z10;
            if (!aVar2.A() && Z0.a.b(this.f4056i0, j6)) {
                int i10 = o0.f5814a;
                ((C0714y) C10).f7083L0.e(aVar2, false);
                aVar2.s0();
                return false;
            }
            this.f5643y0.f5713f = false;
            A(C0578g.f5746m0);
            this.f5632n0 = true;
            long j10 = o10.a().f4055h0;
            d0(j6);
            if (o10.f5649c == 5) {
                o10.f5649c = 1;
                o10.f5650d = false;
                o10.f5663q = j6;
                r0 snapshotObserver = ((C0714y) AbstractC0579h.C(aVar2)).getSnapshotObserver();
                snapshotObserver.a(aVar2, snapshotObserver.f5823c, o10.f5664r);
                if (o10.f5649c == 1) {
                    o10.f5651e = true;
                    o10.f5652f = true;
                    o10.f5649c = 5;
                }
                if (Z0.k.a(o10.a().f4055h0, j10) && o10.a().f4053Y == this.f4053Y && o10.a().f4054Z == this.f4054Z) {
                    z11 = false;
                }
                b0(Ng.H.c(o10.a().f4053Y, o10.a().f4054Z));
                return z11;
            }
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }
        throw new IllegalArgumentException("measure is called on a deactivated node".toString());
    }

    @Override // E0.d0, E0.r
    public final Object u() {
        return this.f5640v0;
    }
}

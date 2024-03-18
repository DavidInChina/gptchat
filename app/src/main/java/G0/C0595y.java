package G0;

import E0.AbstractC0442a;
import H0.C0714y;
import androidx.compose.ui.node.Owner;
import b0.C2104h;
import l0.AbstractC4325q;
import r0.AbstractC5352p;
import r0.C5342f;

/* renamed from: G0.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0595y extends g0 {

    /* renamed from: N0  reason: collision with root package name */
    public static final C5342f f5845N0;

    /* renamed from: L0  reason: collision with root package name */
    public final w0 f5846L0;

    /* renamed from: M0  reason: collision with root package name */
    public T f5847M0;

    static {
        C5342f f6 = androidx.compose.ui.graphics.a.f();
        int i10 = r0.r.f44264l;
        f6.f(r0.r.f44259g);
        f6.l(1.0f);
        f6.m(1);
        f5845N0 = f6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [G0.w0, l0.q] */
    public C0595y(androidx.compose.ui.node.a aVar) {
        super(aVar);
        C0594x c0594x;
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f37723i0 = 0;
        this.f5846L0 = abstractC4325q;
        abstractC4325q.f37727m0 = this;
        if (aVar.f24844h0 != null) {
            c0594x = new C0594x(this);
        } else {
            c0594x = null;
        }
        this.f5847M0 = c0594x;
    }

    @Override // G0.g0
    public final void B0() {
        if (this.f5847M0 == null) {
            this.f5847M0 = new C0594x(this);
        }
    }

    @Override // G0.g0
    public final T E0() {
        return this.f5847M0;
    }

    @Override // G0.g0
    public final AbstractC4325q G0() {
        return this.f5846L0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if ((!r1) != false) goto L12;
     */
    @Override // G0.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(c0 c0Var, long j6, C0593w c0593w, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        C0593w c0593w2;
        int i10;
        Cf.h hVar;
        int i11;
        Object[] objArr;
        C0572a0 c0572a0;
        n0 n0Var;
        boolean z14;
        C0593w c0593w3 = c0593w;
        Cf.h hVar2 = (Cf.h) c0Var;
        int i12 = hVar2.f3114Y;
        int i13 = 1;
        androidx.compose.ui.node.a aVar = this.f5770n0;
        switch (i12) {
            default:
                L0.j p10 = aVar.p();
                if (p10 != null && p10.f10411h0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                break;
            case 0:
                if (!R4.b.v1(j6) || ((n0Var = this.f5769F0) != null && this.f5774r0 && !n0Var.d(j6))) {
                    if (z10) {
                        float x02 = x0(j6, F0());
                        if (!Float.isInfinite(x02) && !Float.isNaN(x02)) {
                            z13 = true;
                            z12 = false;
                            break;
                        }
                    }
                    z12 = z11;
                    z13 = false;
                    break;
                } else {
                    z12 = z11;
                    z13 = true;
                    break;
                }
                break;
        }
        if (z13) {
            int i14 = c0593w3.f5836h0;
            C2104h I10 = aVar.I();
            int i15 = I10.f25569h0;
            if (i15 > 0) {
                Object[] objArr2 = I10.f25567Y;
                int i16 = i15 - 1;
                while (true) {
                    androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr2[i16];
                    if (aVar2.T()) {
                        int i17 = hVar2.f3114Y;
                        C0572a0 c0572a02 = aVar2.f24831B0;
                        switch (i17) {
                            case 0:
                                objArr = objArr2;
                                c0572a0 = c0572a02;
                                i10 = i14;
                                i11 = i13;
                                hVar = hVar2;
                                c0593w2 = c0593w3;
                                aVar2.K(j6, c0593w, z10, z12);
                                break;
                            default:
                                c0572a02.f5702c.J0(g0.f5763K0, c0572a02.f5702c.D0(j6), c0593w, true, z12);
                                objArr = objArr2;
                                c0572a0 = c0572a02;
                                i10 = i14;
                                i11 = i13;
                                hVar = hVar2;
                                c0593w2 = c0593w3;
                                break;
                        }
                        long r10 = c0593w.r();
                        if (Float.intBitsToFloat((int) (r10 >> 32)) < 0.0f && ((int) (r10 & 4294967295L)) != 0) {
                            AbstractC4325q I02 = c0572a0.f5702c.I0(AbstractC0579h.s(16));
                            if (I02 != null && I02.f37732r0) {
                                AbstractC4325q abstractC4325q = I02.f37720Y;
                                if (abstractC4325q.f37732r0) {
                                    if ((abstractC4325q.f37723i0 & 16) != 0) {
                                        for (AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37725k0) {
                                            if ((abstractC4325q2.f37722h0 & 16) != 0) {
                                                AbstractC4325q abstractC4325q3 = abstractC4325q2;
                                                C2104h c2104h = null;
                                                while (abstractC4325q3 != null) {
                                                    if (abstractC4325q3 instanceof t0) {
                                                        if (((t0) abstractC4325q3).d0()) {
                                                            c0593w2.f5836h0 = c0593w2.f5837i0 - i11;
                                                        }
                                                    } else if ((abstractC4325q3.f37722h0 & 16) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                                                        int i18 = 0;
                                                        for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                                            if ((abstractC4325q4.f37722h0 & 16) != 0) {
                                                                i18++;
                                                                if (i18 == i11) {
                                                                    abstractC4325q3 = abstractC4325q4;
                                                                } else {
                                                                    if (c2104h == null) {
                                                                        c2104h = new C2104h(new AbstractC4325q[16]);
                                                                    }
                                                                    if (abstractC4325q3 != null) {
                                                                        c2104h.b(abstractC4325q3);
                                                                        abstractC4325q3 = null;
                                                                    }
                                                                    c2104h.b(abstractC4325q4);
                                                                }
                                                            }
                                                        }
                                                        if (i18 == i11) {
                                                        }
                                                    }
                                                    abstractC4325q3 = AbstractC0579h.f(c2104h);
                                                }
                                                continue;
                                            }
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
                                }
                            }
                        }
                    } else {
                        objArr = objArr2;
                        i10 = i14;
                        i11 = i13;
                        hVar = hVar2;
                        c0593w2 = c0593w3;
                    }
                    i16--;
                    if (i16 >= 0) {
                        objArr2 = objArr;
                        i14 = i10;
                        i13 = i11;
                        hVar2 = hVar;
                        c0593w3 = c0593w2;
                    }
                }
            } else {
                i10 = i14;
                c0593w2 = c0593w3;
            }
            c0593w2.f5836h0 = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // G0.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(AbstractC5352p abstractC5352p) {
        androidx.compose.ui.node.a aVar = this.f5770n0;
        Owner C10 = AbstractC0579h.C(aVar);
        C2104h I10 = aVar.I();
        int i10 = I10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = I10.f25567Y;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar2.T()) {
                    aVar2.j(abstractC5352p);
                }
                i11++;
            } while (i11 < i10);
            if (!((C0714y) C10).getShowLayoutBounds()) {
                z0(abstractC5352p, f5845N0);
            }
        } else if (!((C0714y) C10).getShowLayoutBounds()) {
        }
    }

    @Override // E0.r
    public final int S(int i10) {
        C0596z c0596z = this.f5770n0.f24858v0;
        E0.N a5 = c0596z.a();
        androidx.compose.ui.node.a aVar = c0596z.f5848a;
        return a5.c(aVar.f24831B0.f5702c, aVar.n(), i10);
    }

    @Override // E0.d0
    public final void X(long j6, float f6, wf.k kVar) {
        R0(j6, f6, kVar);
        if (this.f5670k0) {
            return;
        }
        P0();
        this.f5770n0.z().r0();
    }

    @Override // E0.r
    public final int c(int i10) {
        C0596z c0596z = this.f5770n0.f24858v0;
        E0.N a5 = c0596z.a();
        androidx.compose.ui.node.a aVar = c0596z.f5848a;
        return a5.e(aVar.f24831B0.f5702c, aVar.n(), i10);
    }

    @Override // G0.S
    public final int h0(AbstractC0442a abstractC0442a) {
        T t10 = this.f5847M0;
        if (t10 != null) {
            return t10.h0(abstractC0442a);
        }
        M m10 = this.f5770n0.t().f5661o;
        boolean z10 = m10.f5635q0;
        I i10 = m10.f5643y0;
        if (!z10) {
            O o10 = m10.f5628J0;
            if (o10.f5649c == 1) {
                i10.f5713f = true;
                if (i10.f5709b) {
                    o10.f5651e = true;
                    o10.f5652f = true;
                }
            } else {
                i10.f5714g = true;
            }
        }
        m10.e().f5671l0 = true;
        m10.H();
        m10.e().f5671l0 = false;
        Integer num = (Integer) i10.f5716i.get(abstractC0442a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // E0.r
    public final int l(int i10) {
        C0596z c0596z = this.f5770n0.f24858v0;
        E0.N a5 = c0596z.a();
        androidx.compose.ui.node.a aVar = c0596z.f5848a;
        return a5.d(aVar.f24831B0.f5702c, aVar.n(), i10);
    }

    @Override // E0.r
    public final int m(int i10) {
        C0596z c0596z = this.f5770n0.f24858v0;
        E0.N a5 = c0596z.a();
        androidx.compose.ui.node.a aVar = c0596z.f5848a;
        return a5.b(aVar.f24831B0.f5702c, aVar.n(), i10);
    }

    @Override // E0.M
    public final E0.d0 o(long j6) {
        d0(j6);
        androidx.compose.ui.node.a aVar = this.f5770n0;
        C2104h J10 = aVar.J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                ((androidx.compose.ui.node.a) objArr[i11]).z().f5634p0 = 3;
                i11++;
            } while (i11 < i10);
            T0(aVar.f24857u0.a(this, aVar.n(), j6));
            O0();
            return this;
        }
        T0(aVar.f24857u0.a(this, aVar.n(), j6));
        O0();
        return this;
    }
}

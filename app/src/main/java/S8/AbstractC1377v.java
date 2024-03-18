package S8;

import A.C0053y;
import E.g0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0701r0;
import N.C1041z;
import W.C1564i2;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1737t0;
import Z.C1741v0;
import Z.L0;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import l0.C4323o;
import y.AbstractC6463a;

/* renamed from: S8.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1377v {

    /* renamed from: a  reason: collision with root package name */
    public static final long f16382a = M3.H.V(8);

    /* renamed from: b  reason: collision with root package name */
    public static final long f16383b = M3.H.V(4);

    /* renamed from: c  reason: collision with root package name */
    public static final long f16384c = M3.H.V(4);

    /* renamed from: d  reason: collision with root package name */
    public static final C1358b f16385d = C1358b.f16304l0;

    /* renamed from: e  reason: collision with root package name */
    public static final C1358b f16386e = C1358b.f16305m0;

    /* renamed from: f  reason: collision with root package name */
    public static final Z.O f16387f = A7.b.o0(r.f16361Z);

    public static final void a(M m10, C c10, List list, wf.p pVar, AbstractC1725n abstractC1725n, int i10) {
        AbstractC3557B.c0("<this>", m10);
        AbstractC3557B.c0("listType", c10);
        AbstractC3557B.c0("items", list);
        AbstractC3557B.c0("drawItem", pVar);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1791622747);
        B b10 = O.c(O.b(m10, rVar)).f16251c;
        AbstractC3557B.Z(b10);
        Z0.b bVar = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
        Z0.n nVar = b10.f16206a;
        AbstractC3557B.Z(nVar);
        float t10 = bVar.t(nVar.f22811a);
        Z0.n nVar2 = b10.f16207b;
        AbstractC3557B.Z(nVar2);
        float t11 = bVar.t(nVar2.f22811a);
        Z0.n nVar3 = b10.f16208c;
        AbstractC3557B.Z(nVar3);
        float t12 = bVar.t(nVar3.f22811a);
        int intValue = ((Number) rVar.m(f16387f)).intValue();
        b(list.size(), t12, androidx.compose.foundation.layout.a.c(t10, t11, 0.0f, 10), R4.b.X(rVar, 1608846252, new C1371o(c10, b10, m10, intValue)), R4.b.X(rVar, 160839405, new C1373q(m10, b10, intValue, pVar, list)), rVar, 27648);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1564i2(m10, c10, list, pVar, i10, 2);
        }
    }

    public static final void b(int i10, float f6, g0 g0Var, wf.o oVar, wf.o oVar2, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1676804316);
        if ((i11 & 14) == 0) {
            if (rVar.e(i10)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (rVar.d(f6)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i11 & 896) == 0) {
            if (rVar.g(g0Var)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 7168) == 0) {
            if (rVar.i(oVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((57344 & i11) == 0) {
            if (rVar.i(oVar2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
        }
        if ((46811 & i12) == 9362 && rVar.B()) {
            rVar.P();
        } else {
            rVar.W(1580661954);
            boolean e10 = rVar.e(i10) | rVar.d(f6);
            Object K10 = rVar.K();
            if (e10 || K10 == C1723m.f22654Y) {
                K10 = new C1375t(i10, f6);
                rVar.h0(K10);
            }
            E0.N n10 = (E0.N) K10;
            rVar.t(false);
            rVar.W(-1323940314);
            C4323o c4323o = C4323o.f37719b;
            int i18 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i19 = androidx.compose.ui.layout.a.i(c4323o);
            if (rVar.f22696a instanceof AbstractC1707e) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                U3.f.n0(rVar, n10, C0583l.f5808f);
                U3.f.n0(rVar, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i18))) {
                    AbstractC6463a.q(i18, rVar, i18, c0581j);
                }
                i19.invoke(new L0(rVar), rVar, 0);
                rVar.W(2058660585);
                A7.b.B(R4.b.X(rVar, -1982761748, new C0053y(i10, g0Var, oVar)), rVar, 6);
                rVar.W(-387432877);
                for (int i20 = 0; i20 < i10; i20++) {
                    oVar2.invoke(Integer.valueOf(i20), rVar, Integer.valueOf((i12 >> 9) & 112));
                }
                AbstractC6463a.v(rVar, false, false, true, false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1376u(i10, f6, g0Var, oVar, oVar2, i11);
        }
    }

    public static final void c(wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        AbstractC3557B.c0("children", nVar);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-258482833);
        if ((i10 & 14) == 0) {
            if (rVar.i(nVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar.B()) {
            rVar.P();
        } else {
            A7.b.l(new C1737t0[]{f16387f.b(0)}, R4.b.X(rVar, -1707728721, new C1368l(nVar, 2)), rVar, 56);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1041z(nVar, i10, 1);
        }
    }
}

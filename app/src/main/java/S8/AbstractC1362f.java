package S8;

import A.C0053y;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0701r0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1741v0;
import Z.L0;
import h0.C3288a;
import id.AbstractC3557B;
import l0.C4323o;
import y.AbstractC6463a;

/* renamed from: S8.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1362f {

    /* renamed from: a  reason: collision with root package name */
    public static final C1359c f16320a = new C1359c();

    public static final void a(M m10, wf.o oVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        AbstractC3557B.c0("<this>", m10);
        AbstractC3557B.c0("children", oVar);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1874604858);
        if ((i10 & 14) == 0) {
            if (rVar.g(m10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.i(oVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && rVar.B()) {
            rVar.P();
        } else {
            int i14 = i11 & 14;
            AbstractC1360d abstractC1360d = O.c(O.b(m10, rVar)).f16252d;
            AbstractC3557B.Z(abstractC1360d);
            rVar.W(831269728);
            Z0.n nVar = O.c(O.b(m10, rVar)).f16249a;
            AbstractC3557B.Z(nVar);
            float t10 = ((Z0.b) rVar.m(AbstractC0701r0.f7002e)).t(nVar.f22811a) / 2;
            rVar.t(false);
            C1361e c1361e = C1361e.f16319a;
            rVar.W(-1323940314);
            C4323o c4323o = C4323o.f37719b;
            int i15 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i16 = androidx.compose.ui.layout.a.i(c4323o);
            if (rVar.f22696a instanceof AbstractC1707e) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                U3.f.n0(rVar, c1361e, C0583l.f5808f);
                U3.f.n0(rVar, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i15))) {
                    AbstractC6463a.q(i15, rVar, i15, c0581j);
                }
                AbstractC6463a.r(0, i16, new L0(rVar), rVar, 2058660585);
                rVar.W(-927654523);
                ((C1359c) abstractC1360d).a(m10, rVar, i14);
                rVar.t(false);
                P4.a.c(androidx.compose.foundation.layout.a.v(c4323o, 0.0f, t10, 0.0f, t10, 5), null, oVar, rVar, (i11 << 3) & 896, 2);
                AbstractC6463a.u(rVar, false, true, false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0053y(m10, oVar, i10, 10);
        }
    }
}

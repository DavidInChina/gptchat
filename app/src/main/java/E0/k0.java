package E0;

import A.C0033n0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1729p;
import Z.C1741v0;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;
import n0.C4707f;
import y.AbstractC6463a;
import z.C6672L;

/* loaded from: classes2.dex */
public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C4707f f4072a = new C4707f(23);

    public static final void a(n0 n0Var, AbstractC4326r abstractC4326r, wf.n nVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-511989831);
        if ((i11 & 2) != 0) {
            abstractC4326r = C4323o.f37719b;
        }
        AbstractC4326r abstractC4326r2 = abstractC4326r;
        int i12 = rVar.P;
        C1729p Q12 = R4.b.Q1(rVar);
        AbstractC4326r f02 = U3.f.f0(rVar, abstractC4326r2);
        AbstractC1732q0 p10 = rVar.p();
        C0582k c0582k = C0582k.f5800i0;
        rVar.W(1405779621);
        if (rVar.f22696a instanceof AbstractC1707e) {
            rVar.Z();
            if (rVar.f22695O) {
                rVar.o(new C0033n0(c0582k, 5));
            } else {
                rVar.k0();
            }
            U3.f.n0(rVar, n0Var, n0Var.f4085c);
            U3.f.n0(rVar, Q12, n0Var.f4086d);
            U3.f.n0(rVar, nVar, n0Var.f4087e);
            AbstractC0584m.f5811i.getClass();
            U3.f.n0(rVar, p10, C0583l.f5807e);
            U3.f.n0(rVar, f02, C0583l.f5806d);
            C0581j c0581j = C0583l.f5809g;
            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i12))) {
                AbstractC6463a.q(i12, rVar, i12, c0581j);
            }
            rVar.t(true);
            rVar.t(false);
            if (!rVar.B()) {
                AbstractC1734s.g(new C6672L(19, n0Var), rVar);
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new G.E(n0Var, abstractC4326r2, nVar, i10, i11, 5);
                return;
            }
            return;
        }
        R4.b.r1();
        throw null;
    }

    public static final void b(AbstractC4326r abstractC4326r, wf.n nVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        C4323o c4323o;
        int i13;
        int i14;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1298353104);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(abstractC4326r)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(nVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && rVar.B()) {
            rVar.P();
            abstractC4326r2 = abstractC4326r;
        } else {
            if (i15 != 0) {
                c4323o = C4323o.f37719b;
            } else {
                c4323o = abstractC4326r;
            }
            rVar.W(-492369756);
            Object K10 = rVar.K();
            if (K10 == C1723m.f22654Y) {
                K10 = new n0(C0453l.f4077e);
                rVar.h0(K10);
            }
            rVar.t(false);
            int i16 = i12 << 3;
            a((n0) K10, c4323o, nVar, rVar, (i16 & 112) | 8 | (i16 & 896), 0);
            abstractC4326r2 = c4323o;
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new N.A(abstractC4326r2, nVar, i10, i11, 2);
        }
    }

    public static final boolean c(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }
}

package E;

import A.C0033n0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import id.AbstractC3557B;
import l0.AbstractC4313e;
import l0.AbstractC4326r;
import l0.C4310b;
import y.AbstractC6463a;

/* renamed from: E.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0434s {

    /* renamed from: a  reason: collision with root package name */
    public static final C0437v f3945a = new C0437v(C4310b.f37693Y, false);

    /* renamed from: b  reason: collision with root package name */
    public static final r f3946b = r.f3943a;

    public static final void a(AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-211209833);
        if ((i10 & 14) == 0) {
            if (rVar.g(abstractC4326r)) {
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
            rVar.W(544976794);
            int i13 = rVar.P;
            AbstractC4326r f02 = U3.f.f0(rVar, abstractC4326r);
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            rVar.W(1405779621);
            if (rVar.f22696a instanceof AbstractC1707e) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(new C0033n0(c0582k, 1));
                } else {
                    rVar.k0();
                }
                U3.f.n0(rVar, f3946b, C0583l.f5808f);
                U3.f.n0(rVar, p10, C0583l.f5807e);
                U3.f.n0(rVar, f02, C0583l.f5806d);
                C0581j c0581j = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i13))) {
                    AbstractC6463a.q(i13, rVar, i13, c0581j);
                }
                AbstractC6463a.u(rVar, true, false, false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0432p(abstractC4326r, i10, 0);
        }
    }

    public static final void b(E0.c0 c0Var, E0.d0 d0Var, E0.M m10, Z0.l lVar, int i10, int i11, AbstractC4313e abstractC4313e) {
        C0431o c0431o;
        AbstractC4313e abstractC4313e2;
        AbstractC4313e abstractC4313e3;
        Object u10 = m10.u();
        if (u10 instanceof C0431o) {
            c0431o = (C0431o) u10;
        } else {
            c0431o = null;
        }
        if (c0431o != null && (abstractC4313e3 = c0431o.f3929s0) != null) {
            abstractC4313e2 = abstractC4313e3;
        } else {
            abstractC4313e2 = abstractC4313e;
        }
        E0.c0.f(c0Var, d0Var, abstractC4313e2.a(Ng.H.c(d0Var.f4053Y, d0Var.f4054Z), Ng.H.c(i10, i11), lVar));
    }

    public static final E0.N c(AbstractC4313e abstractC4313e, boolean z10, AbstractC1725n abstractC1725n) {
        E0.N n10;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(56522820);
        if (AbstractC3557B.K(abstractC4313e, C4310b.f37693Y) && !z10) {
            n10 = f3945a;
        } else {
            Boolean valueOf = Boolean.valueOf(z10);
            rVar.W(511388516);
            boolean g10 = rVar.g(valueOf) | rVar.g(abstractC4313e);
            Object K10 = rVar.K();
            if (g10 || K10 == C1723m.f22654Y) {
                K10 = new C0437v(abstractC4313e, z10);
                rVar.h0(K10);
            }
            rVar.t(false);
            n10 = (E0.N) K10;
        }
        rVar.t(false);
        return n10;
    }
}

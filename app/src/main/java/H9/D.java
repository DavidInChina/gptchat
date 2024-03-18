package H9;

import E.g0;
import F.AbstractC0539m;
import F.J;
import F.M;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.l1;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Y  reason: collision with root package name */
    public static final D f7505Y = new kotlin.jvm.internal.o(5);

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        int i13;
        g0 g0Var = (g0) obj;
        o oVar = (o) obj2;
        wf.k kVar = (wf.k) obj3;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
        int intValue = num.intValue();
        AbstractC3557B.c0("paddings", g0Var);
        AbstractC3557B.c0("state", oVar);
        AbstractC3557B.c0("onIntent", kVar);
        L0.u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 14) == 0) {
            if (((Z.r) abstractC1725n).g(g0Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | intValue;
        } else {
            i10 = intValue;
        }
        if ((intValue & 112) == 0) {
            if (((Z.r) abstractC1725n).g(oVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((intValue & 896) == 0) {
            if (((Z.r) abstractC1725n).i(kVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 5851) == 1170) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        J a5 = M.a(0, abstractC1725n, 3);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-1982677351);
        Object K10 = rVar2.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (K10 == iVar) {
            K10 = AbstractC4828h.E(new d9.h(2, a5));
            rVar2.h0(K10);
        }
        l1 l1Var = (l1) K10;
        rVar2.t(false);
        Object value = l1Var.getValue();
        Boolean valueOf = Boolean.valueOf(oVar.f7530a);
        rVar2.W(-1982677031);
        int i14 = i10 & 112;
        if (i14 == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = i10 & 896;
        if (i15 == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z10 | z11;
        Object K11 = rVar2.K();
        if (z14 || K11 == iVar) {
            K11 = new A(l1Var, oVar, kVar, null);
            rVar2.h0(K11);
        }
        rVar2.t(false);
        AbstractC1734s.d(value, valueOf, (wf.n) K11, rVar2);
        AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.e.f24739c, g0Var);
        rVar2.W(-1982676760);
        if (i14 == 32) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i15 == 256) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z15 = z12 | z13;
        Object K12 = rVar2.K();
        if (z15 || K12 == iVar) {
            K12 = new s3.r(oVar, 18, kVar);
            rVar2.h0(K12);
        }
        rVar2.t(false);
        AbstractC0539m.a(q10, a5, null, false, null, null, null, false, (wf.k) K12, rVar2, 0, 252);
        return jf.y.f36177a;
    }
}

package Ra;

import E.AbstractC0434s;
import E.g0;
import E0.N;
import F.AbstractC0539m;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import L0.u;
import W.I2;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import Z.l1;
import h0.C3288a;
import hc.F;
import hc.H;
import id.AbstractC3557B;
import id.C3556A;
import id.x;
import jf.y;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4323o;
import nf.AbstractC4828h;
import x9.C6383b;
import y.AbstractC6463a;
import z.C6686a;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15211Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f15212Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f15213h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gc.p pVar, l1 l1Var) {
        super(5);
        this.f15211Y = 1;
        this.f15213h0 = pVar;
        this.f15212Z = l1Var;
    }

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        y yVar = y.f36177a;
        C4323o c4323o = C4323o.f37719b;
        int i15 = this.f15211Y;
        Object obj5 = this.f15212Z;
        boolean z11 = true;
        Object obj6 = this.f15213h0;
        int i16 = 2;
        switch (i15) {
            case 0:
                g0 g0Var = (g0) obj;
                k kVar = (k) obj2;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
                int intValue = num.intValue();
                AbstractC3557B.c0("paddingValues", g0Var);
                AbstractC3557B.c0("state", kVar);
                AbstractC3557B.c0("$anonymous$parameter$2$", (wf.k) obj3);
                AbstractC4326r a5 = io.sentry.compose.b.a("ConversationSpreadsheetScreen");
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(g0Var)) {
                        i16 = 4;
                    }
                    i10 = intValue | i16;
                } else {
                    i10 = intValue;
                }
                if ((intValue & 112) == 0) {
                    if (((Z.r) abstractC1725n).g(kVar)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i10 |= i11;
                }
                if ((i10 & 5211) == 1042) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                C4318j c4318j = C4310b.f37697j0;
                AbstractC4326r a10 = AbstractC4194d.a((X) a5, androidx.compose.foundation.layout.a.q(c4323o, g0Var).g(androidx.compose.foundation.layout.e.f24739c));
                l1 l1Var = (l1) obj5;
                o oVar = (o) obj6;
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(733328855);
                N c10 = AbstractC0434s.c(c4318j, false, rVar2);
                rVar2.W(-1323940314);
                int i17 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i18 = androidx.compose.ui.layout.a.i(a10);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, c10, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i17))) {
                        AbstractC6463a.q(i17, rVar2, i17, c0581j);
                    }
                    AbstractC6463a.r(0, i18, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("ConversationSpreadsheetScreen");
                    x xVar = kVar.f15216c;
                    if (xVar == null) {
                        rVar2.W(-1785992261);
                        I2.b(a11, 0L, 0.0f, 0L, 0, rVar2, 0, 31);
                        rVar2.t(false);
                    } else {
                        rVar2.W(-1785992209);
                        Bi.c.x(xVar, (C3556A) l1Var.getValue(), new C6383b(22, oVar), rVar2, 0);
                        rVar2.t(false);
                    }
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return yVar;
                }
                R4.b.r1();
                throw null;
            case 1:
                g0 g0Var2 = (g0) obj;
                gc.o oVar2 = (gc.o) obj2;
                wf.k kVar2 = (wf.k) obj3;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj4;
                int intValue2 = num.intValue();
                AbstractC3557B.c0("paddings", g0Var2);
                AbstractC3557B.c0("state", oVar2);
                AbstractC3557B.c0("onIntent", kVar2);
                u uVar = io.sentry.compose.b.f34309a;
                if ((intValue2 & 14) == 0) {
                    if (((Z.r) abstractC1725n2).g(g0Var2)) {
                        i16 = 4;
                    }
                    i12 = intValue2 | i16;
                } else {
                    i12 = intValue2;
                }
                if ((intValue2 & 112) == 0) {
                    if (((Z.r) abstractC1725n2).g(oVar2)) {
                        i14 = 32;
                    } else {
                        i14 = 16;
                    }
                    i12 |= i14;
                }
                if ((intValue2 & 896) == 0) {
                    if (((Z.r) abstractC1725n2).i(kVar2)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i12 |= i13;
                }
                if ((i12 & 5851) == 1170) {
                    Z.r rVar3 = (Z.r) abstractC1725n2;
                    if (rVar3.B()) {
                        rVar3.P();
                        return yVar;
                    }
                }
                AbstractC4326r g10 = androidx.compose.foundation.layout.a.q(c4323o, g0Var2).g(androidx.compose.foundation.layout.e.f24739c);
                Z.r rVar4 = (Z.r) abstractC1725n2;
                rVar4.W(1636846393);
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 112) != 32) {
                    z11 = false;
                }
                gc.p pVar = (gc.p) obj6;
                boolean g11 = z10 | z11 | rVar4.g(pVar);
                l1 l1Var2 = (l1) obj5;
                Object K10 = rVar4.K();
                if (g11 || K10 == C1723m.f22654Y) {
                    K10 = new C6686a((Ad.s) oVar2, kVar2, (Object) l1Var2, (Object) pVar, 14);
                    rVar4.h0(K10);
                }
                rVar4.t(false);
                AbstractC0539m.a(g10, null, null, false, null, null, null, false, (wf.k) K10, rVar4, 0, 254);
                return yVar;
            default:
                g0 g0Var3 = (g0) obj;
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj4;
                int intValue3 = num.intValue();
                AbstractC3557B.c0("paddings", g0Var3);
                AbstractC3557B.c0("$anonymous$parameter$1$", (F) obj2);
                AbstractC3557B.c0("$anonymous$parameter$2$", (wf.k) obj3);
                u uVar2 = io.sentry.compose.b.f34309a;
                if ((intValue3 & 14) == 0) {
                    if (((Z.r) abstractC1725n3).g(g0Var3)) {
                        i16 = 4;
                    }
                    intValue3 |= i16;
                }
                if ((intValue3 & 5131) == 1026) {
                    Z.r rVar5 = (Z.r) abstractC1725n3;
                    if (rVar5.B()) {
                        rVar5.P();
                        return yVar;
                    }
                }
                A7.b.x(0, 4, abstractC1725n3, androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.e.f24739c, g0Var3), null, new F9.e((Tc.f) obj6, 27), ((F) AbstractC4828h.z(((H) obj5).f808e, abstractC1725n3).getValue()).f32144a);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, int i10, Object obj2) {
        super(5);
        this.f15211Y = i10;
        this.f15212Z = obj;
        this.f15213h0 = obj2;
    }
}

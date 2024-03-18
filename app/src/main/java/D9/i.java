package d9;

import Df.AbstractC0408g;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E0.N;
import F.A;
import F.AbstractC0528b;
import F.J;
import F.z;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import I9.B;
import L0.u;
import Rb.C;
import Rb.C1272s;
import Rb.F;
import Rb.M;
import Rb.O;
import W.AbstractC1522a0;
import W.C1568j1;
import W.j4;
import W.n4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import Z.r;
import ca.AbstractC2313e;
import ca.AbstractC2314f;
import ca.AbstractC2318j;
import cb.C2334C;
import cb.C2350T;
import fa.AbstractC2965B;
import fa.C2976e;
import fa.C2979h;
import gb.AbstractC3242t;
import gb.C3235l;
import gb.C3238o;
import gb.D;
import gc.AbstractC3250b;
import h0.C3288a;
import id.AbstractC3557B;
import ja.C3931c;
import java.util.ArrayList;
import java.util.List;
import jf.C3959i;
import jf.y;
import k6.AbstractC4194d;
import kb.C4209C;
import kf.t;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import lc.C4385I;
import m.AbstractActivityC4532l;
import na.C4751f0;
import pd.s;
import r9.x;
import s3.C5562l;
import wd.C6205s;
import wd.U;
import wd.Y;
import y.AbstractC6463a;
import y.C6471i;
import y.C6480s;
import y.L;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28143Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f28144Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f28145h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f28146i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C1568j1 c1568j1, Tc.f fVar, gc.p pVar) {
        super(4);
        this.f28143Y = 6;
        this.f28145h0 = c1568j1;
        this.f28144Z = fVar;
        this.f28146i0 = pVar;
    }

    public final void a(AbstractC0528b abstractC0528b, int i10, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        J j6;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        String str;
        String str2;
        U u10;
        U u11;
        U u12;
        AbstractC4326r abstractC4326r = C4323o.f37719b;
        int i18 = this.f28143Y;
        String str3 = null;
        Object obj = this.f28145h0;
        Object obj2 = this.f28146i0;
        Object obj3 = this.f28144Z;
        int i19 = 16;
        int i20 = 2;
        switch (i18) {
            case 1:
                AbstractC3557B.c0("$this$items", abstractC0528b);
                AbstractC4326r a5 = io.sentry.compose.b.a("Spinner");
                if ((i11 & 112) == 0) {
                    if (((r) abstractC1725n).e(i10)) {
                        i19 = 32;
                    }
                    i12 = i11 | i19;
                } else {
                    i12 = i11;
                }
                if ((i12 & 721) == 144) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                List list = (List) obj3;
                int size = i10 % list.size();
                int i21 = x.f44618a;
                F.n nVar = (F.n) t.p2(((z) ((J) obj).h()).f5012g);
                if (nVar != null) {
                    i13 = ((A) nVar).f4826a;
                } else {
                    i13 = 0;
                }
                if (i10 == ((int) ((j6.g() + i13) / 2))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((wf.k) obj2).invoke(list.get(size));
                }
                j4.b((String) list.get(size), AbstractC4194d.a((X) a5, K8.d.y0(androidx.compose.foundation.layout.a.t(abstractC4326r, 0.0f, p9.r.f42840d, 1), !z10)), 0L, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 0, 0, null, ((p4) ((r) abstractC1725n).m(q4.f20361a)).f20309j, abstractC1725n, 0, 0, 65020);
                return;
            case 2:
                if ((i11 & 14) == 0) {
                    if (((r) abstractC1725n).g(abstractC0528b)) {
                        i20 = 4;
                    }
                    i14 = i11 | i20;
                } else {
                    i14 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((r) abstractC1725n).e(i10)) {
                        i19 = 32;
                    }
                    i14 |= i19;
                }
                if ((i14 & 731) == 146) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                u uVar = io.sentry.compose.b.f34309a;
                L4.a.g(((C2350T) obj).f26486a, (C2334C) ((List) obj3).get(i10), (wf.k) obj2, abstractC1725n, 0);
                return;
            case 3:
            case 4:
            case 6:
            default:
                if ((i11 & 14) == 0) {
                    if (((r) abstractC1725n).g(abstractC0528b)) {
                        i20 = 4;
                    }
                    i17 = i11 | i20;
                } else {
                    i17 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((r) abstractC1725n).e(i10)) {
                        i19 = 32;
                    }
                    i17 |= i19;
                }
                if ((i17 & 731) == 146) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC2965B abstractC2965B = (AbstractC2965B) ((List) obj3).get(i10);
                u uVar2 = io.sentry.compose.b.f34309a;
                if (abstractC2965B instanceof C2976e) {
                    r rVar4 = (r) abstractC1725n;
                    rVar4.W(2106177617);
                    Y y10 = ((C2976e) abstractC2965B).f30060b;
                    String str4 = y10.f48372a;
                    wd.X x10 = y10.f48376e;
                    if (x10 != null && (u12 = x10.f48371a) != null) {
                        str3 = u12.f48368b;
                    }
                    AbstractC3242t.a(new C3235l(str4, str3, y10.f48374c, y10.f48375d, null, 67), new C4385I((List) obj, (wf.k) obj2, abstractC2965B), androidx.compose.foundation.layout.e.q(androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.e.f24739c, 0.0f, 0.0f, 0.0f, p9.r.f42839c, 7)), rVar4, 0, 0);
                    rVar4.t(false);
                    return;
                } else if (abstractC2965B instanceof C2979h) {
                    r rVar5 = (r) abstractC1725n;
                    rVar5.W(2106178866);
                    List<Y> list2 = ((C2979h) abstractC2965B).f30064b;
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list2, 10));
                    for (Y y11 : list2) {
                        String str5 = y11.f48372a;
                        wd.X x11 = y11.f48376e;
                        if (x11 != null && (u11 = x11.f48371a) != null) {
                            str = u11.f48368b;
                        } else {
                            str = null;
                        }
                        if (x11 != null && (u10 = x11.f48371a) != null) {
                            str2 = u10.f48367a;
                        } else {
                            str2 = null;
                        }
                        arrayList.add(new C3235l(str5, str, y11.f48374c, y11.f48375d, str2, 3));
                    }
                    AbstractC3242t.d(new C3238o(arrayList), new C4751f0((wf.k) obj2, (List) obj, 24), androidx.compose.foundation.layout.e.q(androidx.compose.foundation.layout.e.d(androidx.compose.foundation.layout.a.r(abstractC4326r, p9.r.f42839c), 1.0f)), rVar5, 0, 0);
                    rVar5.t(false);
                    return;
                } else {
                    r rVar6 = (r) abstractC1725n;
                    rVar6.W(2106180413);
                    rVar6.t(false);
                    return;
                }
            case 5:
                if ((i11 & 14) == 0) {
                    if (((r) abstractC1725n).g(abstractC0528b)) {
                        i20 = 4;
                    }
                    i15 = i11 | i20;
                } else {
                    i15 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((r) abstractC1725n).e(i10)) {
                        i19 = 32;
                    }
                    i15 |= i19;
                }
                if ((i15 & 731) == 146) {
                    r rVar7 = (r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                C6205s c6205s = (C6205s) ((List) obj3).get(i10);
                u uVar3 = io.sentry.compose.b.f34309a;
                if (!c6205s.d()) {
                    abstractC4326r = androidx.compose.foundation.a.h(abstractC4326r, new B((wf.k) obj, 23, c6205s));
                }
                r rVar8 = (r) abstractC1725n;
                rVar8.W(733328855);
                N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar8);
                rVar8.W(-1323940314);
                int i22 = rVar8.P;
                AbstractC1732q0 p10 = rVar8.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i23 = androidx.compose.ui.layout.a.i(abstractC4326r);
                if (rVar8.f22696a instanceof AbstractC1707e) {
                    rVar8.Z();
                    if (rVar8.f22695O) {
                        rVar8.o(c0582k);
                    } else {
                        rVar8.k0();
                    }
                    U3.f.n0(rVar8, c10, C0583l.f5808f);
                    U3.f.n0(rVar8, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar8.f22695O || !AbstractC3557B.K(rVar8.K(), Integer.valueOf(i22))) {
                        AbstractC6463a.q(i22, rVar8, i22, c0581j);
                    }
                    AbstractC6463a.r(0, i23, new L0(rVar8), rVar8, 2058660585);
                    Bi.c.c(c6205s, AbstractC3557B.K(c6205s, ((xd.e) obj2).b()), io.sentry.compose.b.a("AccountSwitcherDialog"), rVar8, 8, 4);
                    AbstractC6463a.v(rVar8, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 7:
                if ((i11 & 14) == 0) {
                    if (((r) abstractC1725n).g(abstractC0528b)) {
                        i20 = 4;
                    }
                    i16 = i11 | i20;
                } else {
                    i16 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((r) abstractC1725n).e(i10)) {
                        i19 = 32;
                    }
                    i16 |= i19;
                }
                if ((i16 & 731) == 146) {
                    r rVar9 = (r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                AbstractC2318j abstractC2318j = (AbstractC2318j) ((List) obj3).get(i10);
                u uVar4 = io.sentry.compose.b.f34309a;
                if (abstractC2318j instanceof AbstractC2313e) {
                    r rVar10 = (r) abstractC1725n;
                    rVar10.W(1927825709);
                    D.g((C3931c) obj, (C3931c) obj2, (AbstractC2313e) abstractC2318j, nc.e.f40228h0, androidx.compose.foundation.layout.e.d(abstractC4326r, 1.0f), false, false, null, rVar10, 27648, 224);
                    rVar10.t(false);
                    return;
                } else if (abstractC2318j instanceof AbstractC2314f) {
                    r rVar11 = (r) abstractC1725n;
                    rVar11.W(1927826275);
                    L4.a.y((AbstractC2314f) abstractC2318j, nc.e.f40229i0, androidx.compose.foundation.layout.e.d(abstractC4326r, 1.0f), rVar11, 432, 0);
                    rVar11.t(false);
                    return;
                } else {
                    r rVar12 = (r) abstractC1725n;
                    rVar12.W(1927826610);
                    rVar12.t(false);
                    return;
                }
        }
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        y yVar = y.f36177a;
        int i12 = this.f28143Y;
        int i13 = 2;
        Object obj5 = this.f28146i0;
        Object obj6 = this.f28145h0;
        Object obj7 = this.f28144Z;
        switch (i12) {
            case 0:
                ((Number) obj4).intValue();
                AbstractC3557B.c0("$this$composable", (L) obj);
                AbstractC3557B.c0("it", (C5562l) obj2);
                AbstractC4326r a5 = io.sentry.compose.b.a("AppNavHost");
                K8.d.H((Tc.f) obj7, (s) obj6, new h(0, (pd.g) obj5), a5, (AbstractC1725n) obj3, 8, 8);
                return yVar;
            case 1:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 2:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 3:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                AbstractC3557B.c0("$this$HorizontalPager", (H.y) obj);
                u uVar = io.sentry.compose.b.f34309a;
                x9.l lVar = (x9.l) obj7;
                boolean z10 = ((C4209C) obj6).f37230h;
                r rVar = (r) ((AbstractC1725n) obj3);
                rVar.W(-2112222991);
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj5;
                Object K10 = rVar.K();
                if (K10 == iVar) {
                    K10 = AbstractC6463a.h(abstractC1710f0, 9, rVar);
                }
                rVar.t(false);
                Ad.l.m(lVar, z10, (wf.k) K10, androidx.compose.foundation.layout.e.f24739c, rVar, 3464, 0);
                return yVar;
            case 4:
                C3959i c3959i = (C3959i) obj2;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
                ((Number) obj4).intValue();
                AbstractC3557B.c0("$this$AnimatedContent", (C6480s) obj);
                AbstractC3557B.c0("$name$for$destructuring$parameter$0$", c3959i);
                u uVar2 = io.sentry.compose.b.f34309a;
                C c10 = (C) c3959i.f36155Y;
                F f6 = (F) c3959i.f36156Z;
                AbstractC4326r n10 = androidx.compose.foundation.a.n(c4323o, androidx.compose.foundation.a.l(abstractC1725n));
                C1272s c1272s = (C1272s) obj7;
                O o10 = (O) obj6;
                M m10 = (M) obj5;
                r rVar2 = (r) abstractC1725n;
                rVar2.W(-483455358);
                N a10 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
                rVar2.W(-1323940314);
                int i14 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(n10);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a10, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar2, i14, c0581j);
                    }
                    AbstractC6463a.r(0, i15, new L0(rVar2), rVar2, 2058660585);
                    E.A a11 = E.A.f3733a;
                    if (f6 == null) {
                        rVar2.W(-1651119491);
                        Bi.c.I(a11, rVar2, 6);
                        rVar2.t(false);
                    } else if (c10 == null) {
                        rVar2.W(-1651119385);
                        rVar2.W(-1651119350);
                        boolean g10 = rVar2.g(o10);
                        Object K11 = rVar2.K();
                        if (g10 || K11 == iVar) {
                            K11 = new Rb.X(1, o10);
                            rVar2.h0(K11);
                        }
                        rVar2.t(false);
                        Bi.c.L(a11, c1272s, f6, (wf.k) ((AbstractC0408g) K11), rVar2, 6);
                        rVar2.t(false);
                    } else {
                        rVar2.W(-1651119255);
                        rVar2.W(-1651119211);
                        boolean g11 = rVar2.g(o10);
                        Object K12 = rVar2.K();
                        if (g11 || K12 == iVar) {
                            K12 = new Rb.X(2, o10);
                            rVar2.h0(K12);
                        }
                        rVar2.t(false);
                        Bi.c.K(a11, c1272s, c10, m10, (wf.k) ((AbstractC0408g) K12), rVar2, 6);
                        rVar2.t(false);
                    }
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return yVar;
                }
                R4.b.r1();
                throw null;
            case 5:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 6:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj3;
                int intValue = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (gc.o) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a12 = io.sentry.compose.b.a("ExperimentOverrideScreen");
                if ((intValue & 641) == 128) {
                    r rVar3 = (r) abstractC1725n2;
                    if (rVar3.B()) {
                        rVar3.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.d(AbstractC3250b.f31548a, a12, R4.b.X(abstractC1725n2, 822248953, new F9.f((Tc.f) obj7, 14)), R4.b.X(abstractC1725n2, -1389178576, new C6471i(24, (gc.p) obj5)), null, null, (n4) obj6, abstractC1725n2, 3462, 50);
                return yVar;
            case 7:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 8:
                nc.z zVar = (nc.z) obj;
                wf.k kVar = (wf.k) obj2;
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj3;
                int intValue2 = ((Number) obj4).intValue();
                AbstractC3557B.c0("state", zVar);
                AbstractC3557B.c0("onIntent", kVar);
                AbstractC4326r a13 = io.sentry.compose.b.a("ViewSharedConversationScreen");
                if ((intValue2 & 14) == 0) {
                    if (((r) abstractC1725n3).g(zVar)) {
                        i13 = 4;
                    }
                    i10 = i13 | intValue2;
                } else {
                    i10 = intValue2;
                }
                if ((intValue2 & 112) == 0) {
                    if (((r) abstractC1725n3).i(kVar)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i10 |= i11;
                }
                if ((i10 & 731) == 146) {
                    r rVar4 = (r) abstractC1725n3;
                    if (rVar4.B()) {
                        rVar4.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.d(nc.d.f40217a, a13, R4.b.X(abstractC1725n3, -46626101, new gc.l((Tc.f) obj7, 3, (AbstractActivityC4532l) obj6)), R4.b.X(abstractC1725n3, 851868852, new Q8.i(zVar, kVar, (AbstractC1710f0) obj5, 15)), null, null, null, abstractC1725n3, 3462, 114);
                return yVar;
            default:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        super(4);
        this.f28143Y = i10;
        this.f28144Z = obj;
        this.f28145h0 = obj2;
        this.f28146i0 = obj3;
    }
}

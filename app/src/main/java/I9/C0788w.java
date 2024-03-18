package I9;

import A.AbstractC0044t0;
import E.AbstractC0434s;
import F.AbstractC0528b;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import ca.C2311c;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import wd.C6168C;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: I9.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788w extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ j1 f8460Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f8461Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f8462h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0788w(j1 j1Var, wf.k kVar, boolean z10) {
        super(4);
        this.f8460Y = j1Var;
        this.f8461Z = kVar;
        this.f8462h0 = z10;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int intValue = ((Number) obj2).intValue();
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
        int intValue2 = ((Number) obj4).intValue();
        AbstractC3557B.c0("$this$items", (AbstractC0528b) obj);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("GizmosAndHistoryList");
        if ((intValue2 & 112) == 0) {
            if (((Z.r) abstractC1725n).e(intValue)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            intValue2 |= i10;
        }
        int i11 = intValue2 & 721;
        jf.y yVar = jf.y.f36177a;
        if (i11 == 144) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return yVar;
            }
        }
        j1 j1Var = this.f8460Y;
        AbstractC0775p abstractC0775p = (AbstractC0775p) j1Var.f8404v.get(intValue);
        if (abstractC0775p instanceof C0762i0) {
            Z.r rVar2 = (Z.r) abstractC1725n;
            rVar2.W(-1509682594);
            L4.a.o((C0762i0) abstractC0775p, a5, rVar2, 0, 2);
            rVar2.t(false);
        } else {
            boolean z10 = abstractC0775p instanceof J0;
            wf.k kVar = this.f8461Z;
            if (z10) {
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(-1509682483);
                rVar3.W(733328855);
                E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar3);
                rVar3.W(-1323940314);
                int i12 = rVar3.P;
                AbstractC1732q0 p10 = rVar3.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar3.f22696a instanceof AbstractC1707e) {
                    rVar3.Z();
                    if (rVar3.f22695O) {
                        rVar3.o(c0582k);
                    } else {
                        rVar3.k0();
                    }
                    U3.f.n0(rVar3, c10, C0583l.f5808f);
                    U3.f.n0(rVar3, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar3, i12, c0581j);
                    }
                    AbstractC6463a.r(0, i13, new Z.L0(rVar3), rVar3, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("GizmosAndHistoryList");
                    AbstractC1734s.e(yVar, new C0784u(kVar, abstractC0775p, null), rVar3);
                    rVar3.W(-796037805);
                    Object K10 = rVar3.K();
                    io.sentry.hints.i iVar = C1723m.f22654Y;
                    if (K10 == iVar) {
                        K10 = new w9.j(null, 3);
                        rVar3.h0(K10);
                    }
                    w9.j jVar = (w9.j) K10;
                    rVar3.t(false);
                    J0 j02 = (J0) abstractC0775p;
                    C0786v c0786v = new C0786v(abstractC0775p, kVar);
                    H9.B b10 = new H9.B(jVar, 2);
                    boolean contains = j1Var.f8396n.contains(new C6168C(j02.f8187a.f26374a));
                    C2311c c2311c = j02.f8187a;
                    L4.a.p(j02, c0786v, b10, a10, contains, j1Var.f8397o.contains(new C6168C(c2311c.f26374a)), j1Var.f8398p.contains(new C6168C(c2311c.f26374a)), this.f8462h0, rVar3, 0, 8);
                    C0786v c0786v2 = new C0786v(kVar, abstractC0775p);
                    H9.C c11 = new H9.C(kVar, abstractC0775p, 2);
                    H9.C c12 = new H9.C(kVar, abstractC0775p, 3);
                    rVar3.W(-796036211);
                    boolean g10 = rVar3.g(kVar);
                    Object K11 = rVar3.K();
                    if (g10 || K11 == iVar) {
                        K11 = AbstractC0044t0.t(5, kVar, rVar3);
                    }
                    rVar3.t(false);
                    Bi.c.h(jVar, j02.f8187a, j1Var.f8399q, c0786v2, c11, c12, (AbstractC6216a) K11, a10, rVar3, 0, 128);
                    AbstractC6463a.v(rVar3, false, true, false, false);
                    rVar3.t(false);
                } else {
                    R4.b.r1();
                    throw null;
                }
            } else if (abstractC0775p instanceof C0773o) {
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(-1509680478);
                C0773o c0773o = (C0773o) abstractC0775p;
                L4.a.K(c0773o.f8421a, c0773o.f8422b, c0773o.f8423c, this.f8461Z, a5, rVar4, 0, 16);
                rVar4.t(false);
            } else if (abstractC0775p instanceof l1) {
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(-1509680181);
                L4.a.Q((l1) abstractC0775p, this.f8461Z, a5, rVar5, 0, 4);
                rVar5.t(false);
            } else if (abstractC0775p instanceof C0765k) {
                Z.r rVar6 = (Z.r) abstractC1725n;
                rVar6.W(-1509679889);
                if (this.f8462h0) {
                    L4.a.E(0, 4, rVar6, a5, this.f8461Z, ((C0765k) abstractC0775p).f8405a);
                }
                rVar6.t(false);
            } else if (abstractC0775p instanceof k1) {
                Z.r rVar7 = (Z.r) abstractC1725n;
                rVar7.W(-1509679687);
                L4.a.N(kVar, a5, rVar7, 0, 2);
                rVar7.t(false);
            } else if (abstractC0775p instanceof C0771n) {
                Z.r rVar8 = (Z.r) abstractC1725n;
                rVar8.W(-1509679509);
                float f6 = p9.q.f42831b;
                float f10 = p9.r.f42841e;
                U3.f.c(androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.e.m(c4323o, f6 + f10), f10, 0.0f, 0.0f, 0.0f, 14), 0.0f, 0L, rVar8, 0, 6);
                rVar8.t(false);
            } else if (abstractC0775p instanceof C0767l) {
                Z.r rVar9 = (Z.r) abstractC1725n;
                rVar9.W(-1509679197);
                L4.a.F(kVar, a5, rVar9, 0, 2);
                rVar9.t(false);
            } else {
                Z.r rVar10 = (Z.r) abstractC1725n;
                rVar10.W(-1509678758);
                rVar10.t(false);
            }
        }
        return yVar;
    }
}

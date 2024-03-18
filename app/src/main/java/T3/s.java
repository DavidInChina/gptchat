package t3;

import A.AbstractC0044t0;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.i0;
import E0.N;
import F.AbstractC0528b;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import H9.B;
import H9.C;
import I9.AbstractC0775p;
import I9.C0762i0;
import I9.J0;
import S8.L;
import S8.M;
import W.AbstractC1577l0;
import W.C1572k0;
import W.E1;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import Z.l1;
import c1.AbstractC2279d;
import fb.AbstractC2992k;
import fb.C2995n;
import gc.C3251c;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import java.util.ListIterator;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import p9.AbstractC5102d;
import s3.C5562l;
import wf.AbstractC6216a;
import x8.W;
import x9.C6383b;
import y.AbstractC6463a;
import y.C6480s;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45706Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f45707Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f45708h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, int i10, Object obj2) {
        super(4);
        this.f45706Y = i10;
        this.f45707Z = obj;
        this.f45708h0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    public final void a(AbstractC0528b abstractC0528b, int i10, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        int i13;
        int i14;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i15 = this.f45706Y;
        int i16 = 4;
        Object obj = this.f45708h0;
        Object obj2 = this.f45707Z;
        int i17 = 16;
        switch (i15) {
            case 3:
                AbstractC3557B.c0("$this$items", abstractC0528b);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i11 & 112) == 0) {
                    if (((Z.r) abstractC1725n).e(i10)) {
                        i17 = 32;
                    }
                    i12 = i11 | i17;
                } else {
                    i12 = i11;
                }
                if ((i12 & 721) == 144) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                H9.o oVar = (H9.o) obj2;
                AbstractC0775p abstractC0775p = (AbstractC0775p) oVar.f7535f.get(i10);
                if (abstractC0775p instanceof C0762i0) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    rVar2.W(-245084004);
                    L4.a.o((C0762i0) abstractC0775p, a5, rVar2, 0, 2);
                    rVar2.t(false);
                    return;
                } else if (abstractC0775p instanceof J0) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    Object i18 = AbstractC6463a.i(rVar3, -245083889, -245083872);
                    if (i18 == iVar) {
                        i18 = new w9.j(null, 3);
                        rVar3.h0(i18);
                    }
                    w9.j jVar = (w9.j) i18;
                    rVar3.t(false);
                    wf.k kVar = (wf.k) obj;
                    rVar3.W(733328855);
                    N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar3);
                    rVar3.W(-1323940314);
                    int i19 = rVar3.P;
                    AbstractC1732q0 p10 = rVar3.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k = C0583l.f5804b;
                    C3288a i20 = androidx.compose.ui.layout.a.i(c4323o);
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
                        if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i19))) {
                            AbstractC6463a.q(i19, rVar3, i19, c0581j);
                        }
                        AbstractC6463a.r(0, i20, new L0(rVar3), rVar3, 2058660585);
                        AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                        J0 j02 = (J0) abstractC0775p;
                        L4.a.p(j02, new B(jVar, 0), new B(jVar, 1), a10, false, false, false, false, rVar3, 0, 248);
                        C c11 = new C(kVar, abstractC0775p, 0);
                        C c12 = new C(kVar, abstractC0775p, 1);
                        rVar3.W(-2056113902);
                        boolean g10 = rVar3.g(kVar);
                        Object K10 = rVar3.K();
                        if (g10 || K10 == iVar) {
                            K10 = AbstractC0044t0.t(2, kVar, rVar3);
                        }
                        rVar3.t(false);
                        Ad.l.b(jVar, j02.f8187a, oVar.f7534e, c11, c12, K10, a10, rVar3, 0, 64);
                        AbstractC6463a.v(rVar3, false, true, false, false);
                        rVar3.t(false);
                        return;
                    }
                    R4.b.r1();
                    throw null;
                } else {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    rVar4.W(-245082874);
                    rVar4.t(false);
                    return;
                }
            case 4:
                if ((i11 & 14) == 0) {
                    if (!((Z.r) abstractC1725n).g(abstractC0528b)) {
                        i16 = 2;
                    }
                    i13 = i11 | i16;
                } else {
                    i13 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((Z.r) abstractC1725n).e(i10)) {
                        i17 = 32;
                    }
                    i13 |= i17;
                }
                if ((i13 & 731) == 146) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                C2995n c2995n = (C2995n) ((List) obj2).get(i10);
                L0.u uVar = io.sentry.compose.b.f34309a;
                Z.r rVar6 = (Z.r) abstractC1725n;
                rVar6.W(-777768822);
                AbstractC2992k abstractC2992k = (AbstractC2992k) obj;
                boolean g11 = rVar6.g(abstractC2992k) | rVar6.g(c2995n);
                Object K11 = rVar6.K();
                if (g11 || K11 == iVar) {
                    K11 = new I9.B(abstractC2992k, 12, c2995n);
                    rVar6.h0(K11);
                }
                rVar6.t(false);
                K8.d.d(c2995n, (AbstractC6216a) K11, rVar6, 0);
                return;
            default:
                if ((i11 & 14) == 0) {
                    if (!((Z.r) abstractC1725n).g(abstractC0528b)) {
                        i16 = 2;
                    }
                    i14 = i11 | i16;
                } else {
                    i14 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((Z.r) abstractC1725n).e(i10)) {
                        i17 = 32;
                    }
                    i14 |= i17;
                }
                if ((i14 & 731) == 146) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                C3251c c3251c = (C3251c) ((List) obj2).get(i10);
                E1.a(R4.b.X(abstractC1725n, 1365127420, new gc.j(c3251c)), io.sentry.compose.b.a("ExperimentOverrideScreen"), null, null, null, R4.b.X(abstractC1725n, 2091865751, new gc.l(c3251c, 0, (gc.p) obj)), null, 0.0f, 0.0f, abstractC1725n, 196614, 478);
                return;
        }
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        jf.y yVar = jf.y.f36177a;
        int i12 = this.f45706Y;
        int i13 = 2;
        Object obj5 = null;
        Object obj6 = this.f45708h0;
        Object obj7 = this.f45707Z;
        switch (i12) {
            case 0:
                C6480s c6480s = (C6480s) obj;
                C5562l c5562l = (C5562l) obj2;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
                ((Number) obj4).intValue();
                List list = (List) ((l1) obj6).getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (AbstractC3557B.K(c5562l, (C5562l) previous)) {
                            obj5 = previous;
                        }
                    }
                }
                C5562l c5562l2 = (C5562l) obj5;
                if (c5562l2 != null) {
                    AbstractC2279d.e(c5562l2, (i0.e) obj7, R4.b.X(abstractC1725n, -1425390790, new androidx.compose.foundation.layout.c(c5562l2, 11, c6480s)), abstractC1725n, 456);
                }
                return yVar;
            case 1:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj3;
                int intValue3 = ((Number) obj4).intValue();
                if ((intValue3 & 14) == 0) {
                    if (((Z.r) abstractC1725n2).e(intValue)) {
                        i13 = 4;
                    }
                    i10 = i13 | intValue3;
                } else {
                    i10 = intValue3;
                }
                if ((intValue3 & 112) == 0) {
                    if (((Z.r) abstractC1725n2).e(intValue2)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i10 |= i11;
                }
                if ((i10 & 731) == 146) {
                    Z.r rVar = (Z.r) abstractC1725n2;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                wf.k[] kVarArr = (wf.k[]) obj6;
                L.c((M) obj7, (String) kVarArr[intValue % kVarArr.length].invoke(Integer.valueOf(intValue2)), null, null, 0, false, 0, abstractC1725n2, 0, 62);
                return yVar;
            case 2:
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj3;
                int intValue4 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (H9.o) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue4 & 641) == 128) {
                    Z.r rVar2 = (Z.r) abstractC1725n3;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                Z.r rVar3 = (Z.r) abstractC1725n3;
                rVar3.W(-1270718991);
                H9.p pVar = (H9.p) obj7;
                boolean g10 = rVar3.g(pVar);
                Object K10 = rVar3.K();
                if (g10 || K10 == iVar) {
                    K10 = new C6383b(4, pVar);
                    rVar3.h0(K10);
                }
                rVar3.t(false);
                K8.d.F((wf.k) K10, new F9.e((Tc.f) obj6, 2), false, false, null, rVar3, 0, 28);
                return yVar;
            case 3:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 4:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 5:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            default:
                AbstractC1725n abstractC1725n4 = (AbstractC1725n) obj3;
                int intValue5 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (Jd.h) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((intValue5 & 641) == 128) {
                    Z.r rVar4 = (Z.r) abstractC1725n4;
                    if (rVar4.B()) {
                        rVar4.P();
                        return yVar;
                    }
                }
                Jd.h hVar = (Jd.h) obj7;
                Jd.i iVar2 = (Jd.i) obj6;
                Z.r rVar5 = (Z.r) abstractC1725n4;
                rVar5.W(-483455358);
                N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar5);
                rVar5.W(-1323940314);
                int i14 = rVar5.P;
                AbstractC1732q0 p10 = rVar5.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar5.f22696a instanceof AbstractC1707e) {
                    rVar5.Z();
                    if (rVar5.f22695O) {
                        rVar5.o(c0582k);
                    } else {
                        rVar5.k0();
                    }
                    U3.f.n0(rVar5, a5, C0583l.f5808f);
                    U3.f.n0(rVar5, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar5.f22695O || !AbstractC3557B.K(rVar5.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar5, i14, c0581j);
                    }
                    AbstractC6463a.r(0, i15, new L0(rVar5), rVar5, 2058660585);
                    X x10 = (X) io.sentry.compose.b.a("VoiceTrainingScreen");
                    AbstractC4326r a10 = AbstractC4194d.a(x10, androidx.compose.foundation.layout.e.d(c4323o, 1.0f));
                    boolean z10 = hVar.f9095a;
                    i0 i0Var = AbstractC1577l0.f20203a;
                    C1572k0 b10 = AbstractC1577l0.b(AbstractC5102d.f42766c, AbstractC5102d.f42769f, rVar5, 12);
                    rVar5.W(-935960580);
                    boolean g11 = rVar5.g(iVar2);
                    Object K11 = rVar5.K();
                    if (g11 || K11 == iVar) {
                        K11 = new Jd.g(iVar2, 0);
                        rVar5.h0(K11);
                    }
                    rVar5.t(false);
                    W.q((AbstractC6216a) K11, a10, b10, z10, false, Jd.b.f9086b, rVar5, 196656, 16);
                    AbstractC4326r a11 = AbstractC4194d.a(x10, androidx.compose.foundation.layout.e.d(c4323o, 1.0f));
                    C1572k0 h10 = AbstractC1577l0.h(AbstractC5102d.f42765b, rVar5);
                    rVar5.W(-935960072);
                    boolean g12 = rVar5.g(iVar2);
                    Object K12 = rVar5.K();
                    if (g12 || K12 == iVar) {
                        K12 = new Jd.g(iVar2, 1);
                        rVar5.h0(K12);
                    }
                    rVar5.t(false);
                    W.p((AbstractC6216a) K12, a11, h10, hVar.f9096b, false, Jd.b.f9087c, rVar5, 196656, 16);
                    AbstractC6463a.v(rVar5, false, true, false, false);
                    return yVar;
                }
                R4.b.r1();
                throw null;
        }
    }
}

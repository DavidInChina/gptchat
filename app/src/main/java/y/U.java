package y;

import A.C0046u0;
import Df.AbstractC0408g;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import F.AbstractC0539m;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Uc.C1416a;
import Uc.C1422g;
import Uc.C1433s;
import Uc.C1435u;
import Uc.EnumC1421f;
import W.AbstractC1643y2;
import W.L1;
import W.S2;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import aa.C1939b;
import com.openai.chatgpt.R;
import d9.C2610e;
import h0.C3288a;
import id.AbstractC3557B;
import java.io.IOException;
import ji.AbstractC4137l;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4318j;
import l0.C4323o;
import m.AbstractActivityC4532l;
import pc.AbstractC5124c;
import qa.C5295e;
import r9.C5383F;
import s3.C5545H;
import w9.AbstractC6146c;
import wf.AbstractC6216a;
import z.AbstractC6652A0;
import z.AbstractC6659E;
import z.AbstractC6696f;
import z.C6677Q;
import z.C6684Y;
import z.C6686a;
import z.C6721r0;
import z.C6729v0;
import z.C6737z0;

/* loaded from: classes.dex */
public final class U extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50151Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f50152Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f50153h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f50154i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f50155j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(2);
        this.f50151Y = i10;
        this.f50152Z = obj;
        this.f50153h0 = obj2;
        this.f50154i0 = obj3;
        this.f50155j0 = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0271, code lost:
        if (id.AbstractC3557B.K(r13.K(), java.lang.Integer.valueOf(r9)) == false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AbstractC1725n abstractC1725n, int i10) {
        float f6;
        boolean z10;
        float f10;
        int i11;
        float f11;
        String o12;
        wf.k kVar;
        boolean z11;
        boolean z12;
        C4318j c4318j = C4310b.f37693Y;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i12 = this.f50151Y;
        Object obj = this.f50155j0;
        Object obj2 = this.f50154i0;
        Object obj3 = this.f50153h0;
        Object obj4 = this.f50152Z;
        switch (i12) {
            case 0:
                float f12 = 1.0f;
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C6729v0 c6729v0 = (C6729v0) obj4;
                C6471i c6471i = new C6471i(2, (AbstractC6659E) obj3);
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-1338768149);
                C6737z0 c6737z0 = AbstractC6652A0.f51116a;
                rVar2.W(-142660079);
                Object b10 = c6729v0.b();
                rVar2.W(-438678252);
                if (AbstractC3557B.K(b10, obj2)) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                rVar2.t(false);
                Float valueOf = Float.valueOf(f6);
                Object value = c6729v0.f51386c.getValue();
                rVar2.W(-438678252);
                if (!AbstractC3557B.K(value, obj2)) {
                    f12 = 0.0f;
                }
                rVar2.t(false);
                C6721r0 n10 = AbstractC6696f.n(c6729v0, valueOf, Float.valueOf(f12), (AbstractC6659E) c6471i.invoke(c6729v0.c(), rVar2, 0), c6737z0, rVar2);
                rVar2.t(false);
                rVar2.t(false);
                rVar2.W(317054099);
                boolean g10 = rVar2.g(n10);
                Object K10 = rVar2.K();
                if (!g10 && K10 != iVar) {
                    z10 = false;
                } else {
                    z10 = false;
                    K10 = new T(n10, 0);
                    rVar2.h0(K10);
                }
                rVar2.t(z10);
                AbstractC4326r l10 = androidx.compose.ui.graphics.a.l(c4323o, (wf.k) K10);
                wf.o oVar = (wf.o) obj;
                rVar2.W(733328855);
                E0.N c10 = AbstractC0434s.c(c4318j, z10, rVar2);
                rVar2.W(-1323940314);
                int i13 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i14 = androidx.compose.ui.layout.a.i(l10);
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
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                        AbstractC6463a.q(i13, rVar2, i13, c0581j);
                    }
                    AbstractC6463a.t(rVar2, i14, rVar2, 0, 2058660585);
                    oVar.invoke(obj2, rVar2, 0);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 1:
                if ((i10 & 3) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC4326r b11 = ((E.q0) obj4).b(c4323o, true);
                if (((wf.n) obj3) != null) {
                    f10 = L1.f19331b;
                    i11 = 0;
                } else {
                    i11 = 0;
                    f10 = 0;
                }
                if (((wf.n) obj2) != null) {
                    f11 = L1.f19331b;
                } else {
                    f11 = i11;
                }
                AbstractC4326r v10 = androidx.compose.foundation.layout.a.v(b11, f10, 0.0f, f11, 0.0f, 10);
                wf.n nVar = (wf.n) obj;
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(733328855);
                E0.N c11 = AbstractC0434s.c(c4318j, false, rVar4);
                rVar4.W(-1323940314);
                int i15 = rVar4.P;
                AbstractC1732q0 p11 = rVar4.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i16 = androidx.compose.ui.layout.a.i(v10);
                if (rVar4.f22696a instanceof AbstractC1707e) {
                    rVar4.Z();
                    if (rVar4.f22695O) {
                        rVar4.o(c0582k2);
                    } else {
                        rVar4.k0();
                    }
                    U3.f.n0(rVar4, c11, C0583l.f5808f);
                    U3.f.n0(rVar4, p11, C0583l.f5807e);
                    C0581j c0581j2 = C0583l.f5809g;
                    if (rVar4.f22695O || !AbstractC3557B.K(rVar4.K(), Integer.valueOf(i15))) {
                        AbstractC6463a.q(i15, rVar4, i15, c0581j2);
                    }
                    AbstractC6463a.t(rVar4, i16, rVar4, 0, 2058660585);
                    nVar.invoke(rVar4, 0);
                    rVar4.t(false);
                    rVar4.t(true);
                    rVar4.t(false);
                    rVar4.t(false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 2:
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                wi.s sVar = (wi.s) obj3;
                AbstractC3557B.c0("<this>", sVar);
                Z.r rVar6 = (Z.r) abstractC1725n;
                rVar6.W(2031949787);
                R8.s v02 = K8.d.v0(sVar, null, null);
                rVar6.t(false);
                Q8.m.c((S8.M) obj4, v02, (wf.p) obj2, (wf.p) obj, abstractC1725n, 0);
                return;
            case 3:
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                S8.O.a((S8.M) obj4, (S8.N) obj3, R4.b.X(abstractC1725n, -180782811, new C0046u0((AbstractC4326r) obj2, 5, (wf.o) obj)), abstractC1725n, 384);
                return;
            case 4:
                if ((i10 & 11) == 2) {
                    Z.r rVar8 = (Z.r) abstractC1725n;
                    if (rVar8.B()) {
                        rVar8.P();
                        return;
                    }
                }
                S8.Q.a((S8.M) obj4, abstractC1725n).h((N0.E) obj3, R4.b.X(abstractC1725n, 599927538, new S8.X((AbstractC4326r) obj2, (wf.o) obj, 0)), abstractC1725n, 48);
                return;
            case 5:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar9 = (Z.r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                Tc.f fVar = (Tc.f) obj4;
                C5545H c5545h = fVar.f17057b;
                pd.s sVar2 = (pd.s) obj3;
                AbstractC3557B.c0("<this>", sVar2);
                if (sVar2 instanceof pd.o) {
                    C1422g c1422g = C1422g.f17674i;
                    o12 = C1422g.r1(EnumC1421f.f17672j0);
                } else if (sVar2 instanceof pd.p) {
                    o12 = Uc.G.f17614k.o1();
                } else if (sVar2 instanceof pd.i) {
                    o12 = C1416a.f17635k.o1();
                } else if (sVar2 instanceof pd.m) {
                    o12 = Uc.D.f17611k.o1();
                } else if (sVar2 instanceof pd.n) {
                    o12 = Uc.E.f17612k.o1();
                } else if (sVar2 instanceof pd.q) {
                    o12 = Uc.L.f17619k.o1();
                } else if (sVar2 instanceof pd.r) {
                    o12 = Uc.T.f17629k.o1();
                } else if (sVar2 instanceof pd.k) {
                    o12 = C1435u.f17697k.o1();
                } else if (sVar2 instanceof pd.l) {
                    o12 = Uc.S.f17628k.o1();
                } else if (sVar2 instanceof pd.j) {
                    o12 = C1433s.f17695k.o1();
                } else {
                    throw new RuntimeException();
                }
                R4.b.p(c5545h, o12, (AbstractC4326r) obj2, null, null, C2610e.f28133Z, C2610e.f28134h0, null, null, new C6.a(sVar2, fVar, (pd.g) obj, 1), abstractC1725n, 1769480, 408);
                return;
            case 6:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar10 = (Z.r) abstractC1725n;
                    if (rVar10.B()) {
                        rVar10.P();
                        return;
                    }
                }
                AbstractC6146c.a((C6684Y) obj4, ((r0.P) ((AbstractC1710f0) obj3).getValue()).f44227a, (AbstractC4326r) obj2, (wf.o) obj, abstractC1725n, 0, 0);
                return;
            case 7:
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar11 = (Z.r) abstractC1725n;
                    if (rVar11.B()) {
                        rVar11.P();
                        return;
                    }
                }
                K8.d.p((Tc.f) obj4, (C5295e) obj3, (AbstractC6216a) obj2, (AbstractC4326r) obj, abstractC1725n, 72, 0);
                return;
            case 8:
                L0.u uVar4 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar12 = (Z.r) abstractC1725n;
                    if (rVar12.B()) {
                        rVar12.P();
                        return;
                    }
                }
                AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), p9.r.f42842f);
                C4316h c4316h = C4310b.f37707t0;
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj4;
                AbstractC6216a abstractC6216a = (AbstractC6216a) obj3;
                String str = (String) obj2;
                wf.k kVar2 = (wf.k) obj;
                Z.r rVar13 = (Z.r) abstractC1725n;
                rVar13.W(-483455358);
                E0.N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, c4316h, rVar13);
                rVar13.W(-1323940314);
                int i17 = rVar13.P;
                AbstractC1732q0 p12 = rVar13.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k3 = C0583l.f5804b;
                C3288a i18 = androidx.compose.ui.layout.a.i(r10);
                boolean z13 = rVar13.f22696a instanceof AbstractC1707e;
                if (z13) {
                    rVar13.Z();
                    if (rVar13.f22695O) {
                        rVar13.o(c0582k3);
                    } else {
                        rVar13.k0();
                    }
                    C0581j c0581j3 = C0583l.f5808f;
                    U3.f.n0(rVar13, a5, c0581j3);
                    C0581j c0581j4 = C0583l.f5807e;
                    U3.f.n0(rVar13, p12, c0581j4);
                    C0581j c0581j5 = C0583l.f5809g;
                    if (!rVar13.f22695O) {
                        kVar = kVar2;
                        break;
                    } else {
                        kVar = kVar2;
                    }
                    AbstractC6463a.q(i17, rVar13, i17, c0581j5);
                    AbstractC6463a.t(rVar13, i18, rVar13, 0, 2058660585);
                    rVar13.W(942964799);
                    Object K11 = rVar13.K();
                    if (K11 == iVar) {
                        K11 = new p0.l();
                        rVar13.h0(K11);
                    }
                    p0.l lVar = (p0.l) K11;
                    rVar13.t(false);
                    T0.z zVar = (T0.z) abstractC1710f0.getValue();
                    rVar13.W(942964939);
                    Object K12 = rVar13.K();
                    if (K12 == iVar) {
                        K12 = AbstractC6463a.h(abstractC1710f0, 8, rVar13);
                    }
                    rVar13.t(false);
                    AbstractC1643y2.a(zVar, (wf.k) K12, androidx.compose.ui.focus.a.j(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), lVar), false, false, null, ib.c.f32913a, null, null, null, null, null, null, false, null, null, null, false, 5, 0, null, null, null, rVar13, 1572912, 100663296, 0, 8126392);
                    jf.y yVar = jf.y.f36177a;
                    rVar13.W(942965456);
                    Object K13 = rVar13.K();
                    if (K13 == iVar) {
                        K13 = new ib.g(lVar, null);
                        rVar13.h0(K13);
                    }
                    rVar13.t(false);
                    AbstractC1734s.e(yVar, (wf.n) K13, rVar13);
                    rVar13.W(693286680);
                    E0.N a10 = E.p0.a(AbstractC0429m.f3907a, C4310b.f37702o0, rVar13);
                    rVar13.W(-1323940314);
                    int i19 = rVar13.P;
                    AbstractC1732q0 p13 = rVar13.p();
                    C3288a i20 = androidx.compose.ui.layout.a.i(c4323o);
                    if (z13) {
                        rVar13.Z();
                        if (rVar13.f22695O) {
                            rVar13.o(c0582k3);
                        } else {
                            rVar13.k0();
                        }
                        U3.f.n0(rVar13, a10, c0581j3);
                        U3.f.n0(rVar13, p13, c0581j4);
                        if (rVar13.f22695O || !AbstractC3557B.K(rVar13.K(), Integer.valueOf(i19))) {
                            AbstractC6463a.q(i19, rVar13, i19, c0581j5);
                        }
                        AbstractC6463a.t(rVar13, i20, rVar13, 0, 2058660585);
                        AbstractC4326r a11 = io.sentry.compose.b.a("ConversationRenameDialog");
                        Ng.H.f(abstractC6216a, a11, false, null, null, null, null, null, null, ib.c.f32914b, rVar13, 805306368, 510);
                        rVar13.W(300321853);
                        wf.k kVar3 = kVar;
                        boolean g11 = rVar13.g(str) | rVar13.g(kVar3) | rVar13.g(abstractC6216a);
                        Object K14 = rVar13.K();
                        if (g11 || K14 == iVar) {
                            K14 = new C6677Q(str, kVar3, abstractC6216a, abstractC1710f0, 6);
                            rVar13.h0(K14);
                        }
                        rVar13.t(false);
                        Ng.H.f((AbstractC6216a) K14, a11, false, null, null, null, null, null, null, ib.c.f32915c, rVar13, 805306368, 510);
                        AbstractC6463a.v(rVar13, false, true, false, false);
                        AbstractC6463a.v(rVar13, false, true, false, false);
                        return;
                    }
                    R4.b.r1();
                    throw null;
                }
                R4.b.r1();
                throw null;
            case 9:
                AbstractC4326r a12 = io.sentry.compose.b.a("CustomActionUserDetailsDialog");
                if ((i10 & 11) == 2) {
                    Z.r rVar14 = (Z.r) abstractC1725n;
                    if (rVar14.B()) {
                        rVar14.P();
                        return;
                    }
                }
                S2.b(a12, R4.b.X(abstractC1725n, 562360425, new C5383F((AbstractC6216a) obj4, 6)), null, null, null, 0, 0L, 0L, null, R4.b.X(abstractC1725n, 1538001214, new ub.j((C1939b) obj3, (wf.k) obj2, (wf.k) obj, 0)), abstractC1725n, 805306416, 509);
                return;
            default:
                L0.u uVar5 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar15 = (Z.r) abstractC1725n;
                    if (rVar15.B()) {
                        rVar15.P();
                        return;
                    }
                }
                pc.m0 m0Var = (pc.m0) obj4;
                AbstractC0408g abstractC0408g = (AbstractC0408g) obj3;
                pc.b0 b0Var = (pc.b0) obj2;
                AbstractActivityC4532l abstractActivityC4532l = (AbstractActivityC4532l) obj;
                Z.r rVar16 = (Z.r) abstractC1725n;
                rVar16.W(-483455358);
                E0.N a13 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar16);
                rVar16.W(-1323940314);
                int i21 = rVar16.P;
                AbstractC1732q0 p14 = rVar16.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k4 = C0583l.f5804b;
                C3288a i22 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar16.f22696a instanceof AbstractC1707e) {
                    rVar16.Z();
                    if (rVar16.f22695O) {
                        rVar16.o(c0582k4);
                    } else {
                        rVar16.k0();
                    }
                    U3.f.n0(rVar16, a13, C0583l.f5808f);
                    U3.f.n0(rVar16, p14, C0583l.f5807e);
                    C0581j c0581j6 = C0583l.f5809g;
                    if (rVar16.f22695O || !AbstractC3557B.K(rVar16.K(), Integer.valueOf(i21))) {
                        AbstractC6463a.q(i21, rVar16, i21, c0581j6);
                    }
                    AbstractC6463a.t(rVar16, i22, rVar16, 0, 2058660585);
                    AbstractC4326r a14 = io.sentry.compose.b.a("SubscriptionScreen");
                    rVar16.W(990658188);
                    AbstractC3557B.c0("<this>", m0Var);
                    boolean z14 = m0Var instanceof pc.l0;
                    if (z14) {
                        if (((pc.l0) m0Var).f43011d != pc.S.f42940Y) {
                            z11 = true;
                            if (!z11) {
                                rVar16.W(990658291);
                                boolean g12 = rVar16.g(abstractC0408g);
                                Object K15 = rVar16.K();
                                if (g12 || K15 == iVar) {
                                    K15 = AbstractC6463a.g(abstractC0408g, 21, rVar16);
                                }
                                rVar16.t(false);
                                Ng.H.f((AbstractC6216a) K15, androidx.compose.foundation.layout.e.d(c4323o, 1.0f), false, null, null, null, null, null, null, AbstractC5124c.f42966c, rVar16, 805306416, 508);
                            }
                            rVar16.t(false);
                            if (!(m0Var instanceof pc.k0)) {
                                rVar16.W(990658840);
                                K8.d.Z(null, R.string.subscriptions_loading, pc.O.f42929h0, false, true, a14, rVar16, 28038, 32);
                                rVar16.t(false);
                            } else if (m0Var instanceof pc.j0) {
                                rVar16.W(990659279);
                                K8.d.Z(null, ((pc.j0) m0Var).f43002a, pc.O.f42930i0, false, false, a14, rVar16, 28038, 32);
                                rVar16.t(false);
                            } else {
                                if (z14) {
                                    rVar16.W(990659698);
                                    AbstractC0539m.a(a14, null, null, false, null, null, null, false, new C6686a(m0Var, abstractC0408g, b0Var, abstractActivityC4532l, 15), rVar16, 0, 255);
                                    z12 = false;
                                    rVar16.t(false);
                                } else {
                                    z12 = false;
                                    rVar16.W(990661281);
                                    rVar16.t(false);
                                }
                                AbstractC6463a.v(rVar16, z12, true, z12, z12);
                                return;
                            }
                            z12 = false;
                            AbstractC6463a.v(rVar16, z12, true, z12, z12);
                            return;
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                    rVar16.t(false);
                    if (!(m0Var instanceof pc.k0)) {
                    }
                    z12 = false;
                    AbstractC6463a.v(rVar16, z12, true, z12, z12);
                    return;
                }
                R4.b.r1();
                throw null;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC4137l abstractC4137l;
        boolean z10;
        boolean z11;
        jf.y yVar = jf.y.f36177a;
        switch (this.f50151Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 6:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 7:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 8:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 9:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 10:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                int intValue = ((Number) obj).intValue();
                long longValue = ((Number) obj2).longValue();
                if (intValue == 21589) {
                    long j6 = 1;
                    if (longValue >= 1) {
                        byte readByte = ((AbstractC4137l) this.f50152Z).readByte();
                        boolean z12 = true;
                        if ((readByte & 1) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((readByte & 2) == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((readByte & 4) != 4) {
                            z12 = false;
                        }
                        if (z10) {
                            j6 = 5;
                        }
                        if (z11) {
                            j6 += 4;
                        }
                        if (z12) {
                            j6 += 4;
                        }
                        if (longValue >= j6) {
                            if (z10) {
                                ((kotlin.jvm.internal.B) this.f50153h0).f37622Y = Long.valueOf(abstractC4137l.v0() * 1000);
                            }
                            if (z11) {
                                ((kotlin.jvm.internal.B) this.f50154i0).f37622Y = Long.valueOf(abstractC4137l.v0() * 1000);
                            }
                            if (z12) {
                                ((kotlin.jvm.internal.B) this.f50155j0).f37622Y = Long.valueOf(abstractC4137l.v0() * 1000);
                            }
                        } else {
                            throw new IOException("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                }
                return yVar;
        }
    }
}

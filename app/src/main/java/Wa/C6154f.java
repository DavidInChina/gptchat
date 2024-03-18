package wa;

import E.AbstractC0429m;
import E.C0421f;
import E.C0426j;
import E.p0;
import E0.N;
import F.AbstractC0528b;
import F.s;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import H0.Z;
import L0.u;
import M3.H;
import Sc.n;
import W.AbstractC1617t1;
import W.K2;
import W.P0;
import W.R0;
import W.j4;
import Wa.m;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.m1;
import Z.r;
import android.content.Context;
import androidx.compose.material3.MinimumInteractiveModifier;
import bb.C2168h0;
import bb.l0;
import cb.C2334C;
import cb.C2350T;
import cb.C2378s;
import cb.C2379t;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import io.sentry.hints.i;
import java.util.List;
import java.util.Map;
import jf.y;
import k6.AbstractC4194d;
import kf.w;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4323o;
import lc.C4385I;
import m.AbstractActivityC4532l;
import p9.q;
import pc.C5129h;
import pc.S;
import pc.b0;
import pc.m0;
import r0.G;
import wf.AbstractC6216a;
import wf.k;
import wf.p;
import y.AbstractC6463a;

/* renamed from: wa.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6154f extends o implements p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48266Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f48267Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f48268h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f48269i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f48270j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6154f(List list, Object obj, Object obj2, Object obj3, int i10) {
        super(4);
        this.f48266Y = i10;
        this.f48267Z = list;
        this.f48269i0 = obj;
        this.f48270j0 = obj2;
        this.f48268h0 = obj3;
    }

    public final void a(AbstractC0528b abstractC0528b, int i10, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        String str;
        boolean K10;
        int i13;
        int i14;
        int i15;
        long j6;
        int i16;
        boolean z10;
        boolean z11;
        int i17;
        int i18;
        int i19;
        boolean z12;
        boolean z13;
        C4317i c4317i = C4310b.f37703p0;
        i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i20 = this.f48266Y;
        Object obj = this.f48268h0;
        Object obj2 = this.f48270j0;
        Object obj3 = this.f48269i0;
        List list = this.f48267Z;
        int i21 = 16;
        int i22 = 4;
        switch (i20) {
            case 0:
                if ((i11 & 14) == 0) {
                    if (!((r) abstractC1725n).g(abstractC0528b)) {
                        i22 = 2;
                    }
                    i12 = i11 | i22;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((r) abstractC1725n).e(i10)) {
                        i21 = 32;
                    }
                    i12 |= i21;
                }
                if ((i12 & 731) == 146) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                n nVar = (n) list.get(i10);
                AbstractC4326r a5 = io.sentry.compose.b.a("ModelsDialog");
                String str2 = nVar.f16534b;
                n nVar2 = (n) obj3;
                if (nVar2 != null) {
                    str = nVar2.f16534b;
                } else {
                    str = null;
                }
                if (str == null) {
                    K10 = false;
                } else {
                    K10 = AbstractC3557B.K(str2, str);
                }
                AbstractC4326r a10 = AbstractC4194d.a((X) a5, androidx.compose.foundation.layout.e.d(c4323o, 1.0f));
                L0.g gVar = new L0.g(3);
                r rVar2 = (r) abstractC1725n;
                rVar2.W(-428132528);
                AbstractC6216a abstractC6216a = (AbstractC6216a) obj2;
                k kVar = (k) obj;
                boolean g10 = rVar2.g(abstractC6216a) | rVar2.g(kVar) | rVar2.g(nVar);
                Object K11 = rVar2.K();
                if (g10 || K11 == iVar) {
                    K11 = new s(abstractC6216a, kVar, nVar, 15);
                    rVar2.h0(K11);
                }
                rVar2.t(false);
                AbstractC4326r q02 = H.q0(a10, K10, gVar, (AbstractC6216a) K11, 2);
                m1 m1Var = AbstractC1617t1.f20423a;
                AbstractC4326r t10 = androidx.compose.foundation.layout.a.t(q02.g(MinimumInteractiveModifier.f24779b), 0.0f, p9.r.f42840d, 1);
                C0421f c0421f = AbstractC0429m.f3907a;
                C0426j g11 = AbstractC0429m.g(p9.r.f42841e);
                rVar2.W(693286680);
                N a11 = p0.a(g11, c4317i, rVar2);
                rVar2.W(-1323940314);
                int i23 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i24 = androidx.compose.ui.layout.a.i(t10);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a11, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i23))) {
                        AbstractC6463a.q(i23, rVar2, i23, c0581j);
                    }
                    AbstractC6463a.t(rVar2, i24, rVar2, 0, 2058660585);
                    AbstractC4326r a12 = io.sentry.compose.b.a("ModelsDialog");
                    K2.a(K10, null, a12, false, null, null, rVar2, 48, 60);
                    j4.b(nVar.f16536d, a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 1:
                if ((i11 & 14) == 0) {
                    if (!((r) abstractC1725n).g(abstractC0528b)) {
                        i22 = 2;
                    }
                    i13 = i11 | i22;
                } else {
                    i13 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((r) abstractC1725n).e(i10)) {
                        i21 = 32;
                    }
                    i13 |= i21;
                }
                if ((i13 & 731) == 146) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Map.Entry entry = (Map.Entry) list.get(i10);
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                String str3 = (String) entry.getKey();
                Wa.d dVar = (Wa.d) entry.getValue();
                m mVar = (m) obj3;
                Map map = mVar.f20859c;
                if (map == null) {
                    map = w.f37484Y;
                }
                Wa.n nVar3 = (Wa.n) map.get(str3);
                C2378s c2378s = C2379t.Companion;
                K8.d.k0(mVar, (C2379t) obj2, dVar, str3, nVar3, (k) obj, a13, abstractC1725n, 0, 64);
                return;
            case 2:
                if ((i11 & 14) == 0) {
                    if (!((r) abstractC1725n).g(abstractC0528b)) {
                        i22 = 2;
                    }
                    i14 = i11 | i22;
                } else {
                    i14 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((r) abstractC1725n).e(i10)) {
                        i21 = 32;
                    }
                    i14 |= i21;
                }
                if ((i14 & 731) == 146) {
                    r rVar4 = (r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                C2334C c2334c = (C2334C) list.get(i10);
                AbstractC4326r a14 = io.sentry.compose.b.a("SearchList");
                AbstractC1734s.e(y.f36177a, new C2168h0(c2334c, (l0) obj2, null), abstractC1725n);
                L4.a.i(((C2350T) obj3).f26486a, c2334c, (k) obj, a14, q.f42833d, null, false, false, abstractC1725n, 12582912, 104);
                return;
            case 3:
                if ((i11 & 14) == 0) {
                    if (!((r) abstractC1725n).g(abstractC0528b)) {
                        i22 = 2;
                    }
                    i15 = i11 | i22;
                } else {
                    i15 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((r) abstractC1725n).e(i10)) {
                        i21 = 32;
                    }
                    i15 |= i21;
                }
                if ((i15 & 731) == 146) {
                    r rVar5 = (r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                Fb.f fVar = (Fb.f) list.get(i10);
                u uVar = io.sentry.compose.b.f34309a;
                boolean K12 = AbstractC3557B.K(fVar, (Fb.f) obj3);
                AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
                r rVar6 = (r) abstractC1725n;
                rVar6.W(-572131945);
                if (K12) {
                    j6 = ((P0) rVar6.m(R0.f19593a)).f19534r;
                } else {
                    j6 = r0.r.f44263k;
                }
                rVar6.t(false);
                AbstractC4326r d11 = androidx.compose.foundation.a.d(d10, j6, G.f44171a);
                rVar6.W(-572131666);
                k kVar2 = (k) obj;
                AbstractC6216a abstractC6216a2 = (AbstractC6216a) obj2;
                boolean g12 = rVar6.g(kVar2) | rVar6.g(fVar) | rVar6.g(abstractC6216a2);
                Object K13 = rVar6.K();
                if (g12 || K13 == iVar) {
                    K13 = new s(kVar2, fVar, abstractC6216a2, 28);
                    rVar6.h0(K13);
                }
                rVar6.t(false);
                Kb.q.b(fVar, H.q0(d11, K12, null, (AbstractC6216a) K13, 6), rVar6, 0, 0);
                return;
            case 4:
                if ((i11 & 14) == 0) {
                    if (!((r) abstractC1725n).g(abstractC0528b)) {
                        i22 = 2;
                    }
                    i16 = i11 | i22;
                } else {
                    i16 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((r) abstractC1725n).e(i10)) {
                        i21 = 32;
                    }
                    i16 |= i21;
                }
                if ((i16 & 731) == 146) {
                    r rVar7 = (r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                Ec.o oVar = (Ec.o) list.get(i10);
                AbstractC4326r a15 = AbstractC4194d.a((X) io.sentry.compose.b.a("SettingsLanguageItem"), androidx.compose.foundation.layout.e.d(c4323o, 1.0f));
                Ec.o oVar2 = (Ec.o) obj3;
                if (oVar2 == oVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                L0.g gVar2 = new L0.g(3);
                r rVar8 = (r) abstractC1725n;
                rVar8.W(1048391989);
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj2;
                k kVar3 = (k) obj;
                boolean g13 = rVar8.g(abstractC1710f0) | rVar8.g(kVar3) | rVar8.g(oVar);
                Object K14 = rVar8.K();
                if (g13 || K14 == iVar) {
                    K14 = new s(kVar3, oVar, abstractC1710f0, 29);
                    rVar8.h0(K14);
                }
                rVar8.t(false);
                AbstractC4326r q03 = H.q0(a15, z10, gVar2, (AbstractC6216a) K14, 2);
                m1 m1Var2 = AbstractC1617t1.f20423a;
                AbstractC4326r t11 = androidx.compose.foundation.layout.a.t(q03.g(MinimumInteractiveModifier.f24779b), 0.0f, p9.r.f42840d, 1);
                C0421f c0421f2 = AbstractC0429m.f3907a;
                C0426j g14 = AbstractC0429m.g(p9.r.f42841e);
                rVar8.W(693286680);
                N a16 = p0.a(g14, c4317i, rVar8);
                rVar8.W(-1323940314);
                int i25 = rVar8.P;
                AbstractC1732q0 p11 = rVar8.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i26 = androidx.compose.ui.layout.a.i(t11);
                if (rVar8.f22696a instanceof AbstractC1707e) {
                    rVar8.Z();
                    if (rVar8.f22695O) {
                        rVar8.o(c0582k2);
                    } else {
                        rVar8.k0();
                    }
                    U3.f.n0(rVar8, a16, C0583l.f5808f);
                    U3.f.n0(rVar8, p11, C0583l.f5807e);
                    C0581j c0581j2 = C0583l.f5809g;
                    if (rVar8.f22695O || !AbstractC3557B.K(rVar8.K(), Integer.valueOf(i25))) {
                        AbstractC6463a.q(i25, rVar8, i25, c0581j2);
                    }
                    AbstractC6463a.t(rVar8, i26, rVar8, 0, 2058660585);
                    AbstractC4326r a17 = io.sentry.compose.b.a("SettingsLanguageItem");
                    if (oVar2 == oVar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    K2.a(z11, null, a17, false, null, null, rVar8, 48, 60);
                    j4.b(Ng.H.v(oVar.f4632Z, rVar8), a17, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar8, 0, 0, 131070);
                    AbstractC6463a.v(rVar8, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                if ((i11 & 14) == 0) {
                    if (!((r) abstractC1725n).g(abstractC0528b)) {
                        i22 = 2;
                    }
                    i17 = i11 | i22;
                } else {
                    i17 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (((r) abstractC1725n).e(i10)) {
                        i21 = 32;
                    }
                    i17 |= i21;
                }
                if ((i17 & 731) == 146) {
                    r rVar9 = (r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                C5129h c5129h = (C5129h) list.get(i10);
                AbstractC4326r a18 = io.sentry.compose.b.a("SubscriptionScreen");
                pc.l0 l0Var = (pc.l0) ((m0) obj3);
                r rVar10 = (r) abstractC1725n;
                Context context = (Context) rVar10.m(Z.f6888b);
                AbstractC3557B.c0("<this>", l0Var);
                AbstractC3557B.c0("context", context);
                AbstractC3557B.c0("purchasePackage", c5129h);
                int ordinal = c5129h.f42993b.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                i18 = R.string.subscriptions_amount_per_week;
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            i18 = R.string.subscriptions_amount_per_month;
                        }
                    } else {
                        i18 = R.string.subscriptions_amount_per_year;
                    }
                } else {
                    i18 = R.string.subscriptions_amount_per_lifetime;
                }
                String string = context.getString(i18, c5129h.f42994c);
                AbstractC3557B.b0("getString(...)", string);
                String str4 = c5129h.f42992a;
                AbstractC3557B.c0("packageId", str4);
                S s10 = l0Var.f43011d;
                Integer num = l0Var.f43010c;
                String str5 = l0Var.f43009b;
                if (str5 != null && AbstractC3557B.K(str5, str4) && num != null) {
                    i19 = num.intValue();
                } else if (s10 != S.f42942h0 && s10 != S.f42941Z) {
                    i19 = R.string.subscriptions_subscribe_cta;
                } else {
                    i19 = R.string.subscriptions_already_subscribed_cta;
                }
                int i27 = i19;
                if (str5 != null && AbstractC3557B.K(str5, str4) && num != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((str5 == null || !AbstractC3557B.K(str5, str4)) && s10 == S.f42940Y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                K8.d.Z(string, i27, new C4385I((b0) obj2, (AbstractActivityC4532l) obj, c5129h, 2), z13, z12, a18, rVar10, 0, 32);
                return;
        }
    }

    @Override // wf.p
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        y yVar = y.f36177a;
        switch (this.f48266Y) {
            case 0:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 1:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 2:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 3:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 4:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            default:
                a((AbstractC0528b) obj, ((Number) obj2).intValue(), (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6154f(List list, Object obj, k kVar, Object obj2, int i10) {
        super(4);
        this.f48266Y = i10;
        this.f48267Z = list;
        this.f48269i0 = obj;
        this.f48268h0 = kVar;
        this.f48270j0 = obj2;
    }
}

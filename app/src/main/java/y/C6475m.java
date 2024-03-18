package y;

import E.AbstractC0434s;
import E.AbstractC0441z;
import E0.AbstractC0454m;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H9.C0719a;
import H9.C0720b;
import I9.AbstractC0747b;
import I9.AbstractC0753e;
import I9.C0769m;
import L.P0;
import L.z0;
import Mb.C0951e0;
import N.C1040y;
import W.C1565i3;
import W.C1575k3;
import W.C1578l1;
import W.C1580l3;
import W.C1585m3;
import W.G3;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.l1;
import android.gov.nist.core.Separators;
import cb.C2334C;
import cb.C2373n;
import com.openai.chatgpt.R;
import g4.C3188p;
import h.C3278d;
import h.C3281g;
import h0.C3288a;
import id.AbstractC3557B;
import id.C3556A;
import ja.C3931c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import l8.AbstractC4344b;
import na.D1;
import na.E0;
import nc.AbstractC4811c;
import nf.AbstractC4828h;
import r0.AbstractC5350n;
import va.AbstractC6003d;
import va.C6004e;
import wf.AbstractC6216a;
import z.AbstractC6657D;
import z.AbstractC6696f;
import z.C6694e;
import z.C6716p;
import z.C6735y0;

/* renamed from: y.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6475m extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50235Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f50236Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f50237h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f50238i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f50239j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6475m(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(3);
        this.f50235Y = i10;
        this.f50236Z = obj;
        this.f50237h0 = obj2;
        this.f50238i0 = obj3;
        this.f50239j0 = obj4;
    }

    public final void a(AbstractC0441z abstractC0441z, AbstractC1725n abstractC1725n, int i10) {
        Object obj = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f50235Y;
        Object obj2 = this.f50237h0;
        Object obj3 = this.f50239j0;
        Object obj4 = this.f50236Z;
        Object obj5 = this.f50238i0;
        switch (i11) {
            case 5:
                AbstractC3557B.c0("$this$PopupMenu", abstractC0441z);
                AbstractC4326r a5 = io.sentry.compose.b.a("GizmoContextMenu");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C2334C c2334c = (C2334C) obj4;
                if (!c2334c.f26455r) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    rVar2.W(1141840369);
                    Df.H.g(AbstractC0747b.f8296a, new C0769m((wf.k) obj2, c2334c, (w9.j) obj5, 0), a5, AbstractC0747b.f8297b, null, false, null, null, null, rVar2, 3078, 500);
                    rVar2.t(false);
                    return;
                }
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(1141840793);
                Df.H.g(AbstractC0747b.f8298c, new C0769m((wf.k) obj3, c2334c, (w9.j) obj5, 1), a5, AbstractC0747b.f8299d, null, false, null, null, null, rVar3, 3078, 500);
                rVar3.t(false);
                return;
            case 6:
                AbstractC3557B.c0("$this$PopupMenu", abstractC0441z);
                AbstractC4326r a10 = io.sentry.compose.b.a("HistoryContextMenu");
                if ((i10 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                w9.j jVar = (w9.j) obj4;
                Df.H.g(AbstractC0753e.f8326a, new C0720b(jVar, (AbstractC1710f0) obj2, 1), a10, AbstractC0753e.f8327b, null, false, null, null, null, abstractC1725n, 3078, 500);
                Df.H.g(AbstractC0753e.f8328c, new C0719a(jVar, (AbstractC6216a) obj5), a10, AbstractC0753e.f8329d, null, false, null, null, null, abstractC1725n, 3078, 500);
                Df.H.g(AbstractC0753e.f8330e, new C0720b(jVar, (AbstractC1710f0) obj3, 2), a10, AbstractC0753e.f8331f, null, false, null, null, null, abstractC1725n, 3078, 500);
                return;
            case 7:
            default:
                AbstractC3557B.c0("$this$DropdownMenu", abstractC0441z);
                AbstractC4326r a11 = io.sentry.compose.b.a("ShareSummaryMenuDetails");
                if ((i10 & 81) == 16) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                C3288a X10 = R4.b.X(abstractC1725n, 302982979, new Jb.c(10, (C3931c) obj5));
                Z.r rVar6 = (Z.r) abstractC1725n;
                rVar6.W(-474364963);
                wf.k kVar = (wf.k) obj4;
                boolean g10 = rVar6.g(kVar);
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj3;
                Object K10 = rVar6.K();
                if (g10 || K10 == obj) {
                    K10 = new r9.G(kVar, abstractC1710f0, 2);
                    rVar6.h0(K10);
                }
                rVar6.t(false);
                Df.H.g(X10, (AbstractC6216a) K10, a11, AbstractC4811c.f40214g, null, false, null, null, null, rVar6, 3078, 500);
                C3288a c3288a = AbstractC4811c.f40215h;
                rVar6.W(-474364116);
                AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) obj2;
                boolean g11 = rVar6.g(abstractC1710f02);
                Object K11 = rVar6.K();
                if (g11 || K11 == obj) {
                    K11 = new I9.B(abstractC1710f02, 27, abstractC1710f0);
                    rVar6.h0(K11);
                }
                rVar6.t(false);
                Df.H.g(c3288a, (AbstractC6216a) K11, a11, AbstractC4811c.f40216i, null, false, null, null, null, rVar6, 3078, 500);
                return;
            case 8:
                AbstractC3557B.c0("$this$DropdownMenu", abstractC0441z);
                AbstractC4326r a12 = io.sentry.compose.b.a("GizmoAuthor");
                if ((i10 & 81) == 16) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                AbstractC1710f0 abstractC1710f03 = (AbstractC1710f0) obj5;
                Boolean bool = (Boolean) abstractC1710f03.getValue();
                bool.booleanValue();
                Z.r rVar8 = (Z.r) abstractC1725n;
                rVar8.W(-946249021);
                C2334C c2334c2 = (C2334C) obj4;
                boolean g12 = rVar8.g(c2334c2);
                Object K12 = rVar8.K();
                if (g12 || K12 == obj) {
                    K12 = new Xa.a(c2334c2, abstractC1710f03, null);
                    rVar8.h0(K12);
                }
                rVar8.t(false);
                AbstractC1734s.e(bool, (wf.n) K12, rVar8);
                List<C2373n> list = c2334c2.f26444g;
                if (list.isEmpty()) {
                    list = AbstractC4344b.H0(c2334c2.f26443f);
                }
                rVar8.W(-946248749);
                Object obj6 = (wf.k) obj3;
                for (C2373n c2373n : list) {
                    C3288a X11 = R4.b.X(rVar8, -323692712, new Xa.b(c2373n, 0));
                    rVar8.W(-1773843458);
                    boolean g13 = rVar8.g(obj6) | rVar8.g(c2373n);
                    Object K13 = rVar8.K();
                    if (g13 || K13 == obj) {
                        K13 = new F.s(obj6, c2373n, abstractC1710f03, 18);
                        rVar8.h0(K13);
                    }
                    rVar8.t(false);
                    Df.H.g(X11, (AbstractC6216a) K13, null, R4.b.X(rVar8, -785011877, new Xa.b(c2373n, 1)), null, false, null, null, null, rVar8, 3078, 500);
                }
                rVar8.t(false);
                rVar8.W(-946248134);
                if (!list.isEmpty()) {
                    U3.f.c(a12, 0.0f, 0L, rVar8, 0, 7);
                    androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.j(c4323o, p9.r.f42840d), rVar8);
                }
                rVar8.t(false);
                j4.b(Ng.H.w(R.string.gizmo_privacy_label_menu, new Object[]{(String) obj2}, rVar8), androidx.compose.foundation.layout.a.t(c4323o, p9.r.f42841e, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar8.m(q4.f20361a)).f20311l, rVar8, 0, 0, 65532);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    @Override // wf.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        Z.r rVar;
        boolean g10;
        Object K10;
        Object K11;
        boolean i13;
        Object K12;
        Object K13;
        boolean i14;
        Object K14;
        boolean g11;
        Object K15;
        boolean z11;
        float f6;
        float f10;
        int i15;
        int i16;
        int i17;
        boolean z12;
        CharSequence charSequence;
        boolean z13;
        boolean z14;
        id.y yVar;
        int i18;
        AbstractC4326r abstractC4326r = C4323o.f37719b;
        Object obj4 = C1723m.f22654Y;
        jf.y yVar2 = jf.y.f36177a;
        int i19 = this.f50235Y;
        Object obj5 = this.f50239j0;
        Object obj6 = this.f50238i0;
        Object obj7 = this.f50237h0;
        Object obj8 = this.f50236Z;
        switch (i19) {
            case 0:
                L l10 = (L) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(l10)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 91) == 18) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar2;
                    }
                }
                C6460A c6460a = (C6460A) obj8;
                AbstractC1734s.b(l10, new C3281g((j0.u) obj6, obj7, c6460a, 1), abstractC1725n);
                LinkedHashMap linkedHashMap = c6460a.f50082e;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl", l10);
                linkedHashMap.put(obj7, ((M) l10).f50129a);
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(-492369756);
                Object K16 = rVar3.K();
                if (K16 == obj4) {
                    K16 = new Object();
                    rVar3.h0(K16);
                }
                rVar3.t(false);
                ((wf.p) obj5).h((C6480s) K16, obj7, rVar3, 0);
                return yVar2;
            case 1:
                i0.e eVar = (i0.e) obj;
                ((Number) obj3).intValue();
                l1 l1Var = (l1) obj5;
                Z.r rVar4 = (Z.r) ((AbstractC1725n) obj2);
                rVar4.W(-492369756);
                Object K17 = rVar4.K();
                if (K17 == obj4) {
                    K17 = new G.D(eVar, new F.r(l1Var, 1));
                    rVar4.h0(K17);
                }
                rVar4.t(false);
                G.D d10 = (G.D) K17;
                rVar4.W(-492369756);
                Object K18 = rVar4.K();
                if (K18 == obj4) {
                    K18 = new E0.n0(new G.G(d10));
                    rVar4.h0(K18);
                }
                rVar4.t(false);
                E0.n0 n0Var = (E0.n0) K18;
                G.Q q10 = (G.Q) obj8;
                rVar4.W(-1523807258);
                if (q10 != null) {
                    Gi.e.d(q10, d10, n0Var, rVar4, 576);
                }
                rVar4.t(false);
                AbstractC4326r abstractC4326r2 = (AbstractC4326r) obj7;
                Object obj9 = (wf.n) obj6;
                rVar4.W(511388516);
                boolean g12 = rVar4.g(d10) | rVar4.g(obj9);
                Object K19 = rVar4.K();
                if (g12 || K19 == obj4) {
                    K19 = new androidx.compose.foundation.layout.c(d10, 3, obj9);
                    rVar4.h0(K19);
                }
                rVar4.t(false);
                E0.k0.a(n0Var, abstractC4326r2, (wf.n) K19, rVar4, 8, 0);
                return yVar2;
            case 2:
                AbstractC4326r abstractC4326r3 = (AbstractC4326r) obj;
                ((Number) obj3).intValue();
                Z.r rVar5 = (Z.r) ((AbstractC1725n) obj2);
                Object i20 = AbstractC6463a.i(rVar5, 1634330012, -492369756);
                if (i20 == obj4) {
                    i20 = AbstractC6696f.a(1.0f);
                    rVar5.h0(i20);
                }
                rVar5.t(false);
                C6694e c6694e = (C6694e) i20;
                AbstractC5350n abstractC5350n = (AbstractC5350n) obj8;
                if ((abstractC5350n instanceof r0.N) && ((r0.N) abstractC5350n).f44223a == r0.r.f44263k) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                P0 p02 = (P0) obj7;
                if (p02.b()) {
                    T0.z zVar = (T0.z) obj6;
                    if (N0.D.b(zVar.f16831b) && z10) {
                        AbstractC1734s.d(zVar.f16830a, new N0.D(zVar.f16831b), new z0(c6694e, null), rVar5);
                        abstractC4326r = androidx.compose.ui.draw.a.f(abstractC4326r3, new C3278d(c6694e, (T0.s) obj5, zVar, p02, abstractC5350n, 1));
                    }
                }
                rVar5.t(false);
                return abstractC4326r;
            case 3:
                wf.n nVar = (wf.n) obj;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((Z.r) abstractC1725n2).i(nVar)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    intValue2 |= i15;
                }
                if ((intValue2 & 19) == 18) {
                    Z.r rVar6 = (Z.r) abstractC1725n2;
                    if (rVar6.B()) {
                        rVar6.P();
                        return yVar2;
                    }
                }
                C1585m3 c1585m3 = (C1585m3) obj8;
                boolean K20 = AbstractC3557B.K(c1585m3, (C1585m3) obj7);
                if (K20) {
                    i11 = 150;
                } else {
                    i11 = 75;
                }
                if (K20) {
                    List list = (List) obj6;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i21 = 0; i21 < size; i21++) {
                        Object obj10 = list.get(i21);
                        if (obj10 != null) {
                            arrayList.add(obj10);
                        }
                    }
                    if (arrayList.size() != 1) {
                        i12 = 75;
                        C6735y0 c6735y0 = new C6735y0(i11, i12, AbstractC6657D.f51128d);
                        rVar = (Z.r) abstractC1725n2;
                        rVar.W(870026295);
                        C1578l1 c1578l1 = (C1578l1) obj5;
                        g10 = rVar.g(c1585m3) | rVar.i(c1578l1);
                        K10 = rVar.K();
                        if (!g10 || K10 == obj4) {
                            K10 = new W.B(c1585m3, 3, c1578l1);
                            rVar.h0(K10);
                        }
                        AbstractC6216a abstractC6216a = (AbstractC6216a) K10;
                        rVar.t(false);
                        rVar.W(1431889134);
                        rVar.W(1730440772);
                        K11 = rVar.K();
                        if (K11 == obj4) {
                            if (!K20) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            K11 = AbstractC6696f.a(f10);
                            rVar.h0(K11);
                        }
                        C6694e c6694e2 = (C6694e) K11;
                        rVar.t(false);
                        Boolean valueOf = Boolean.valueOf(K20);
                        rVar.W(1730440850);
                        i13 = rVar.i(c6694e2) | rVar.h(K20) | rVar.i(c6735y0) | rVar.g(abstractC6216a);
                        K12 = rVar.K();
                        if (!i13 || K12 == obj4) {
                            K12 = new C1575k3(c6694e2, K20, c6735y0, abstractC6216a, null);
                            rVar.h0(K12);
                        }
                        rVar.t(false);
                        AbstractC1734s.e(valueOf, (wf.n) K12, rVar);
                        C6716p c6716p = c6694e2.f51230c;
                        rVar.t(false);
                        C6735y0 c6735y02 = new C6735y0(i11, i12, AbstractC6657D.f51125a);
                        rVar.W(1966809761);
                        rVar.W(-92311588);
                        K13 = rVar.K();
                        if (K13 == obj4) {
                            if (!K20) {
                                f6 = 1.0f;
                            } else {
                                f6 = 0.8f;
                            }
                            K13 = AbstractC6696f.a(f6);
                            rVar.h0(K13);
                        }
                        C6694e c6694e3 = (C6694e) K13;
                        rVar.t(false);
                        Boolean valueOf2 = Boolean.valueOf(K20);
                        rVar.W(-92311508);
                        i14 = rVar.i(c6694e3) | rVar.h(K20) | rVar.i(c6735y02);
                        K14 = rVar.K();
                        if (!i14 || K14 == obj4) {
                            K14 = new C1580l3(c6694e3, K20, c6735y02, null);
                            rVar.h0(K14);
                        }
                        rVar.t(false);
                        AbstractC1734s.e(valueOf2, (wf.n) K14, rVar);
                        C6716p c6716p2 = c6694e3.f51230c;
                        rVar.t(false);
                        AbstractC4326r m10 = androidx.compose.ui.graphics.a.m(abstractC4326r, ((Number) c6716p2.f51346Z.getValue()).floatValue(), ((Number) c6716p2.f51346Z.getValue()).floatValue(), ((Number) c6716p.f51346Z.getValue()).floatValue(), 0.0f, 0.0f, 0L, null, false, 131064);
                        rVar.W(870027225);
                        g11 = rVar.g(c1585m3);
                        K15 = rVar.K();
                        if (g11 && K15 != obj4) {
                            z11 = false;
                        } else {
                            z11 = false;
                            K15 = new C1565i3(c1585m3, 0);
                            rVar.h0(K15);
                        }
                        rVar.t(z11);
                        AbstractC4326r a5 = L0.l.a(m10, z11, (wf.k) K15);
                        rVar.W(733328855);
                        E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, z11, rVar);
                        rVar.W(-1323940314);
                        int i22 = rVar.P;
                        AbstractC1732q0 p10 = rVar.p();
                        AbstractC0584m.f5811i.getClass();
                        C0582k c0582k = C0583l.f5804b;
                        C3288a i23 = androidx.compose.ui.layout.a.i(a5);
                        if (!(rVar.f22696a instanceof AbstractC1707e)) {
                            rVar.Z();
                            if (rVar.f22695O) {
                                rVar.o(c0582k);
                            } else {
                                rVar.k0();
                            }
                            U3.f.n0(rVar, c10, C0583l.f5808f);
                            U3.f.n0(rVar, p10, C0583l.f5807e);
                            C0581j c0581j = C0583l.f5809g;
                            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i22))) {
                                AbstractC6463a.q(i22, rVar, i22, c0581j);
                            }
                            AbstractC6463a.t(rVar, i23, rVar, 0, 2058660585);
                            AbstractC6463a.s(intValue2 & 14, nVar, rVar, false, true);
                            rVar.t(false);
                            rVar.t(false);
                            return yVar2;
                        }
                        R4.b.r1();
                        throw null;
                    }
                }
                i12 = 0;
                C6735y0 c6735y03 = new C6735y0(i11, i12, AbstractC6657D.f51128d);
                rVar = (Z.r) abstractC1725n2;
                rVar.W(870026295);
                C1578l1 c1578l12 = (C1578l1) obj5;
                g10 = rVar.g(c1585m3) | rVar.i(c1578l12);
                K10 = rVar.K();
                if (!g10) {
                }
                K10 = new W.B(c1585m3, 3, c1578l12);
                rVar.h0(K10);
                AbstractC6216a abstractC6216a2 = (AbstractC6216a) K10;
                rVar.t(false);
                rVar.W(1431889134);
                rVar.W(1730440772);
                K11 = rVar.K();
                if (K11 == obj4) {
                }
                C6694e c6694e22 = (C6694e) K11;
                rVar.t(false);
                Boolean valueOf3 = Boolean.valueOf(K20);
                rVar.W(1730440850);
                i13 = rVar.i(c6694e22) | rVar.h(K20) | rVar.i(c6735y03) | rVar.g(abstractC6216a2);
                K12 = rVar.K();
                if (!i13) {
                }
                K12 = new C1575k3(c6694e22, K20, c6735y03, abstractC6216a2, null);
                rVar.h0(K12);
                rVar.t(false);
                AbstractC1734s.e(valueOf3, (wf.n) K12, rVar);
                C6716p c6716p3 = c6694e22.f51230c;
                rVar.t(false);
                C6735y0 c6735y022 = new C6735y0(i11, i12, AbstractC6657D.f51125a);
                rVar.W(1966809761);
                rVar.W(-92311588);
                K13 = rVar.K();
                if (K13 == obj4) {
                }
                C6694e c6694e32 = (C6694e) K13;
                rVar.t(false);
                Boolean valueOf22 = Boolean.valueOf(K20);
                rVar.W(-92311508);
                i14 = rVar.i(c6694e32) | rVar.h(K20) | rVar.i(c6735y022);
                K14 = rVar.K();
                if (!i14) {
                }
                K14 = new C1580l3(c6694e32, K20, c6735y022, null);
                rVar.h0(K14);
                rVar.t(false);
                AbstractC1734s.e(valueOf22, (wf.n) K14, rVar);
                C6716p c6716p22 = c6694e32.f51230c;
                rVar.t(false);
                AbstractC4326r m102 = androidx.compose.ui.graphics.a.m(abstractC4326r, ((Number) c6716p22.f51346Z.getValue()).floatValue(), ((Number) c6716p22.f51346Z.getValue()).floatValue(), ((Number) c6716p3.f51346Z.getValue()).floatValue(), 0.0f, 0.0f, 0L, null, false, 131064);
                rVar.W(870027225);
                g11 = rVar.g(c1585m3);
                K15 = rVar.K();
                if (g11) {
                }
                z11 = false;
                K15 = new C1565i3(c1585m3, 0);
                rVar.h0(K15);
                rVar.t(z11);
                AbstractC4326r a52 = L0.l.a(m102, z11, (wf.k) K15);
                rVar.W(733328855);
                E0.N c102 = AbstractC0434s.c(C4310b.f37693Y, z11, rVar);
                rVar.W(-1323940314);
                int i222 = rVar.P;
                AbstractC1732q0 p102 = rVar.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i232 = androidx.compose.ui.layout.a.i(a52);
                if (!(rVar.f22696a instanceof AbstractC1707e)) {
                }
                break;
            case 4:
                androidx.compose.foundation.layout.d dVar = (androidx.compose.foundation.layout.d) obj;
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj2;
                int intValue3 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$BoxWithConstraints", dVar);
                if ((intValue3 & 14) == 0) {
                    if (((Z.r) abstractC1725n3).g(dVar)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    intValue3 |= i16;
                }
                if ((intValue3 & 91) == 18) {
                    Z.r rVar7 = (Z.r) abstractC1725n3;
                    if (rVar7.B()) {
                        rVar7.P();
                        return yVar2;
                    }
                }
                Z0.b bVar = (Z0.b) obj8;
                C3188p c3188p = (C3188p) obj7;
                Z.r rVar8 = (Z.r) abstractC1725n3;
                rVar8.W(511388516);
                boolean g13 = rVar8.g(bVar) | rVar8.g(c3188p);
                Object K21 = rVar8.K();
                if (g13 || K21 == obj4) {
                    K21 = AbstractC4828h.E(new F.s(c3188p, dVar, bVar, 9));
                    rVar8.h0(K21);
                }
                rVar8.t(false);
                androidx.compose.foundation.a.b(c3188p, (String) obj6, (AbstractC4326r) ((l1) K21).getValue(), null, (AbstractC0454m) obj5, 0.0f, null, rVar8, 0, 104);
                return yVar2;
            case 5:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar2;
            case 6:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar2;
            case 7:
                AbstractC1725n abstractC1725n4 = (AbstractC1725n) obj2;
                int intValue4 = ((Number) obj3).intValue();
                AbstractC3557B.c0("it", (E.g0) obj);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue4 & 81) == 16) {
                    Z.r rVar9 = (Z.r) abstractC1725n4;
                    if (rVar9.B()) {
                        rVar9.P();
                        return yVar2;
                    }
                }
                C6004e c6004e = (C6004e) obj8;
                AbstractC6003d.a(c6004e, ((D1) AbstractC4828h.z(((E0) obj7).f808e, abstractC1725n4).getValue()).S, (wf.n) obj6, abstractC4326r, R4.b.X(abstractC1725n4, 1206344889, new d9.j((Tc.f) obj5, c6004e, 1)), abstractC1725n4, 27648, 0);
                return yVar2;
            case 8:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar2;
            case 9:
                Hb.a aVar = (Hb.a) obj;
                AbstractC1725n abstractC1725n5 = (AbstractC1725n) obj2;
                int intValue5 = ((Number) obj3).intValue();
                AbstractC3557B.c0("heroAnimationState", aVar);
                AbstractC4326r a10 = io.sentry.compose.b.a("LoginScreenContent");
                if ((intValue5 & 14) == 0) {
                    if (((Z.r) abstractC1725n5).g(aVar)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    intValue5 |= i17;
                }
                if ((intValue5 & 91) == 18) {
                    Z.r rVar10 = (Z.r) abstractC1725n5;
                    if (rVar10.B()) {
                        rVar10.P();
                        return yVar2;
                    }
                }
                Mg.d dVar2 = Mg.d.f12133h0;
                Mg.a aVar2 = Mg.b.f12127Z;
                AbstractC3557B.c0("unit", dVar2);
                C6735y0 v10 = AbstractC6696f.v((int) com.google.android.gms.internal.play_billing.N.q(Mg.b.l(aVar.f7593d, dVar2), -2147483648L, 2147483647L), 0, AbstractC6657D.f51128d, 2);
                G3.a(AbstractC4194d.a((G0.X) a10, androidx.compose.foundation.layout.e.f24739c), null, ((r0.r) l0.a(aVar.f7592c, v10, "OnboardingHeroBackgroundColorAnimation", abstractC1725n5, 384, 8).getValue()).f44265a, 0L, 0.0f, 0.0f, null, R4.b.X(abstractC1725n5, -2025779674, new C6476n((E.g0) obj8, (Tc.f) obj7, (wf.k) obj6, l0.a(aVar.f7591b, v10, "OnboardingHeroTextColorAnimation", abstractC1725n5, 384, 8), aVar, (C0951e0) obj5, 1)), abstractC1725n5, 12582918, 122);
                return yVar2;
            case 10:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar2;
            default:
                int intValue6 = ((Number) obj).intValue();
                AbstractC1725n abstractC1725n6 = (AbstractC1725n) obj2;
                int intValue7 = ((Number) obj3).intValue();
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((intValue7 & 14) == 0) {
                    if (((Z.r) abstractC1725n6).e(intValue6)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    intValue7 |= i18;
                }
                if ((intValue7 & 91) == 18) {
                    Z.r rVar11 = (Z.r) abstractC1725n6;
                    if (rVar11.B()) {
                        rVar11.P();
                        return yVar2;
                    }
                }
                int i24 = intValue6 - 1;
                id.x xVar = (id.x) obj8;
                String a11 = xVar.a(i24);
                C3556A c3556a = (C3556A) obj7;
                if (c3556a != null) {
                    if (c3556a.f33075a.contains(Integer.valueOf(i24))) {
                        z12 = true;
                        id.u uVar3 = xVar.f33133b;
                        charSequence = (CharSequence) uVar3.f33128a.get(a11);
                        if (charSequence == null && !Lg.n.n2(charSequence)) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        z14 = !z13;
                        if (!z14 && z12) {
                            yVar = id.y.f33142n0;
                        } else if (!z12) {
                            yVar = id.y.f33140l0;
                        } else if (z14) {
                            yVar = id.y.f33139k0;
                        } else {
                            yVar = id.y.f33138j0;
                        }
                        id.y yVar3 = yVar;
                        if (intValue6 != 0) {
                            Z.r rVar12 = (Z.r) abstractC1725n6;
                            rVar12.W(91912587);
                            Bi.c.H(Separators.POUND, null, yVar3, null, id.p.f33115Y, rVar12, 27702);
                            rVar12.t(false);
                        } else {
                            Z.r rVar13 = (Z.r) abstractC1725n6;
                            rVar13.W(91912712);
                            String str = (String) uVar3.f33128a.get(a11);
                            rVar13.W(91912867);
                            wf.k kVar = (wf.k) obj6;
                            boolean g14 = rVar13.g(c3556a) | rVar13.g(kVar) | rVar13.e(i24);
                            Object K22 = rVar13.K();
                            if (g14 || K22 == obj4) {
                                K22 = new id.q(c3556a, kVar, i24, 0);
                                rVar13.h0(K22);
                            }
                            AbstractC6216a abstractC6216a3 = (AbstractC6216a) K22;
                            rVar13.t(false);
                            rVar13.W(91913128);
                            boolean e10 = rVar13.e(i24);
                            AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj5;
                            Object K23 = rVar13.K();
                            if (e10 || K23 == obj4) {
                                K23 = new C1040y(abstractC1710f0, i24, 5);
                                rVar13.h0(K23);
                            }
                            rVar13.t(false);
                            Bi.c.H(a11, str, yVar3, abstractC6216a3, (AbstractC6216a) K23, rVar13, 0);
                            rVar13.t(false);
                        }
                        return yVar2;
                    }
                }
                z12 = false;
                id.u uVar32 = xVar.f33133b;
                charSequence = (CharSequence) uVar32.f33128a.get(a11);
                if (charSequence == null) {
                }
                z13 = true;
                z14 = !z13;
                if (!z14) {
                }
                if (!z12) {
                }
                id.y yVar32 = yVar;
                if (intValue6 != 0) {
                }
                return yVar2;
        }
    }
}

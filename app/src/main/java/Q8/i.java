package Q8;

import A.AbstractC0044t0;
import A.C0033n0;
import Df.AbstractC0408g;
import Df.H;
import E.A;
import E.AbstractC0429m;
import E.AbstractC0440y;
import E.AbstractC0441z;
import E.g0;
import E0.N;
import F.AbstractC0528b;
import F.AbstractC0539m;
import F.J;
import F.s;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import H9.C0719a;
import H9.C0720b;
import H9.z;
import I9.B;
import I9.C0766k0;
import I9.j1;
import L0.u;
import Mb.C0951e0;
import Mb.C0986w0;
import S8.M;
import W.AbstractC1521a;
import W.E1;
import W.I2;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1708e0;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.L0;
import Z.o1;
import Z.r;
import cb.C2334C;
import cb.C2353W;
import com.openai.chatgpt.R;
import gb.AbstractC3230g;
import gb.AbstractC3237n;
import gb.C3235l;
import gb.C3239p;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;
import kf.t;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import l8.AbstractC4344b;
import lc.AbstractC4407f;
import lc.C4393Q;
import na.D1;
import nf.AbstractC4828h;
import q9.AbstractC5285b;
import q9.AbstractC5288e;
import qf.C5323a;
import r9.C5388e;
import r9.G;
import r9.x;
import r9.y;
import sb.AbstractC5604d;
import sb.AbstractC5608h;
import sb.C5602b;
import sb.C5606f;
import sb.C5607g;
import ta.AbstractC5690F;
import ta.C5717p;
import v0.C5953f;
import v9.C5999a;
import wd.m0;
import wd.n0;
import wd.o0;
import wd.q0;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import y.C6461B;
import y.C6471i;
import y.C6475m;
import yf.AbstractC6583a;
import za.C6783B;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14503Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f14504Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f14505h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f14506i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        super(3);
        this.f14503Y = i10;
        this.f14506i0 = obj;
        this.f14504Z = obj2;
        this.f14505h0 = obj3;
    }

    public final void a(AbstractC0441z abstractC0441z, AbstractC1725n abstractC1725n, int i10) {
        Object obj = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f14503Y;
        Object obj2 = this.f14505h0;
        Object obj3 = this.f14504Z;
        Object obj4 = this.f14506i0;
        switch (i11) {
            case 2:
                AbstractC3557B.c0("$this$PopupMenu", abstractC0441z);
                AbstractC4326r a5 = io.sentry.compose.b.a("ArchiveContextMenu");
                if ((i10 & 81) == 16) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                w9.j jVar = (w9.j) obj3;
                H.g(z.f7565a, new C0719a((AbstractC6216a) obj4, jVar), a5, z.f7566b, null, false, null, null, null, abstractC1725n, 3078, 500);
                H.g(z.f7567c, new C0720b(jVar, (AbstractC1710f0) obj2, 0), a5, z.f7568d, null, false, null, null, null, abstractC1725n, 3078, 500);
                return;
            case 3:
            case 4:
            case 9:
            case 12:
            case 13:
            default:
                AbstractC3557B.c0("$this$BottomSheet", abstractC0441z);
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                List list = (List) obj4;
                J j6 = (J) obj3;
                AbstractC1734s.e(Integer.valueOf(list.size()), new Hd.a(j6, list, null), abstractC1725n);
                float f6 = p9.r.f42841e;
                AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(c4323o, f6);
                String str = (String) obj2;
                r rVar3 = (r) abstractC1725n;
                rVar3.W(-483455358);
                N a10 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar3);
                rVar3.W(-1323940314);
                int i12 = rVar3.P;
                AbstractC1732q0 p10 = rVar3.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(r10);
                if (rVar3.f22696a instanceof AbstractC1707e) {
                    rVar3.Z();
                    if (rVar3.f22695O) {
                        rVar3.o(c0582k);
                    } else {
                        rVar3.k0();
                    }
                    U3.f.n0(rVar3, a10, C0583l.f5808f);
                    U3.f.n0(rVar3, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar3, i12, c0581j);
                    }
                    AbstractC6463a.r(0, i13, new L0(rVar3), rVar3, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("DebugMessagesBottomSheet");
                    j4.b(str, AbstractC4194d.a((X) a11, androidx.compose.foundation.layout.e.d(androidx.compose.foundation.layout.a.r(c4323o, f6), 1.0f)), 0L, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 0, 0, null, ((p4) rVar3.m(q4.f20361a)).f20310k, rVar3, 0, 0, 65020);
                    AbstractC0539m.a(a11, j6, null, true, null, null, null, false, new C6461B(18, list), rVar3, 3072, 245);
                    AbstractC6463a.v(rVar3, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 5:
                AbstractC3557B.c0("$this$DropdownMenu", abstractC0441z);
                AbstractC4326r a12 = io.sentry.compose.b.a("GizmoPicker");
                if ((i10 & 81) == 16) {
                    r rVar4 = (r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                r rVar5 = (r) abstractC1725n;
                rVar5.W(2118560270);
                wf.k kVar = (wf.k) obj4;
                boolean g10 = rVar5.g(kVar);
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj2;
                Object K10 = rVar5.K();
                if (g10 || K10 == obj) {
                    K10 = new G(kVar, abstractC1710f0, 1);
                    rVar5.h0(K10);
                }
                rVar5.t(false);
                y.N(null, (AbstractC6216a) K10, a12, rVar5, 6, 4);
                for (C2334C c2334c : (List) obj3) {
                    rVar5.W(2118560526);
                    boolean g11 = rVar5.g(kVar) | rVar5.g(c2334c);
                    Object K11 = rVar5.K();
                    if (g11 || K11 == obj) {
                        K11 = new s(kVar, c2334c, abstractC1710f0, 17);
                        rVar5.h0(K11);
                    }
                    rVar5.t(false);
                    y.N(c2334c, (AbstractC6216a) K11, a12, rVar5, 0, 4);
                }
                return;
            case 6:
                AbstractC3557B.c0("$this$Card", abstractC0441z);
                u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    r rVar6 = (r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                L4.a.i((C2353W) obj4, (C2334C) obj3, (wf.k) obj2, androidx.compose.foundation.layout.a.t(c4323o, 0.0f, p9.r.f42840d, 1), 0.0f, null, false, false, abstractC1725n, 0, 240);
                return;
            case 7:
                AbstractC3557B.c0("$this$PopupMenu", abstractC0441z);
                AbstractC4326r a13 = io.sentry.compose.b.a("MessageImageContextMenu");
                if ((i10 & 81) == 16) {
                    r rVar7 = (r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                r rVar8 = (r) abstractC1725n;
                rVar8.W(-2069962462);
                AbstractC3237n abstractC3237n = (AbstractC3237n) obj4;
                if (abstractC3237n.c() != null) {
                    C3288a c3288a = AbstractC3230g.f31429a;
                    rVar8.W(-2069962294);
                    AbstractC6216a abstractC6216a = (AbstractC6216a) obj3;
                    boolean g12 = rVar8.g(abstractC6216a);
                    Object K12 = rVar8.K();
                    if (g12 || K12 == obj) {
                        K12 = new C0033n0(abstractC6216a, 27);
                        rVar8.h0(K12);
                    }
                    rVar8.t(false);
                    H.g(c3288a, (AbstractC6216a) K12, a13, AbstractC3230g.f31430b, null, false, null, null, null, rVar8, 3078, 500);
                }
                rVar8.t(false);
                if (!(abstractC3237n instanceof C3235l)) {
                    return;
                }
                C3288a c3288a2 = AbstractC3230g.f31431c;
                rVar8.W(-2069961962);
                wf.k kVar2 = (wf.k) obj2;
                boolean g13 = rVar8.g(kVar2) | rVar8.g(abstractC3237n);
                Object K13 = rVar8.K();
                if (g13 || K13 == obj) {
                    K13 = new C3239p(kVar2, abstractC3237n, 1);
                    rVar8.h0(K13);
                }
                rVar8.t(false);
                H.g(c3288a2, (AbstractC6216a) K13, a13, AbstractC3230g.f31432d, null, false, null, null, null, rVar8, 3078, 500);
                C3288a c3288a3 = AbstractC3230g.f31433e;
                rVar8.W(-2069961647);
                boolean g14 = rVar8.g(kVar2) | rVar8.g(abstractC3237n);
                Object K14 = rVar8.K();
                if (g14 || K14 == obj) {
                    K14 = new C3239p(kVar2, abstractC3237n, 2);
                    rVar8.h0(K14);
                }
                rVar8.t(false);
                H.g(c3288a3, (AbstractC6216a) K14, a13, AbstractC3230g.f31434f, null, false, null, null, null, rVar8, 3078, 500);
                return;
            case 8:
                AbstractC3557B.c0("$this$FormDialog", abstractC0441z);
                AbstractC4326r a14 = io.sentry.compose.b.a("MessageFeedbackDetailsDialog");
                if ((i10 & 81) == 16) {
                    r rVar9 = (r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                r rVar10 = (r) abstractC1725n;
                j4.b(Ng.H.v(R.string.message_feedback_title, abstractC1725n), a14, AbstractC1521a.c(abstractC1725n), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar10.m(q4.f20361a)).f20305f, abstractC1725n, 0, 0, 65530);
                rVar10.W(1288624844);
                Object K15 = rVar10.K();
                if (K15 == obj) {
                    K15 = new p0.l();
                    rVar10.h0(K15);
                }
                p0.l lVar = (p0.l) K15;
                rVar10.t(false);
                jf.y yVar = jf.y.f36177a;
                rVar10.W(1288624903);
                Object K16 = rVar10.K();
                if (K16 == obj) {
                    K16 = new C5606f(lVar, null);
                    rVar10.h0(K16);
                }
                rVar10.t(false);
                AbstractC1734s.e(yVar, (wf.n) K16, rVar10);
                AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) obj4;
                i0.r rVar11 = sb.l.f45515a;
                String str2 = (String) abstractC1710f02.getValue();
                AbstractC4326r a15 = AbstractC4194d.a((X) a14, androidx.compose.ui.focus.a.j(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), lVar));
                A9.a aVar = T0.H.f16758a;
                rVar10.W(1288625029);
                boolean g15 = rVar10.g(abstractC1710f02);
                Object K17 = rVar10.K();
                if (g15 || K17 == obj) {
                    K17 = AbstractC6463a.h(abstractC1710f02, 10, rVar10);
                }
                rVar10.t(false);
                A7.b.P(str2, (wf.k) K17, a15, false, false, null, null, null, false, 0, 0, aVar, null, null, null, R4.b.X(rVar10, 1329130781, new C6471i(16, abstractC1710f02)), rVar10, 100663296, 196656, 30456);
                C5323a c5323a = AbstractC5608h.f45508a;
                C5602b c5602b = C5602b.f45496h0;
                j0.u uVar3 = (j0.u) obj3;
                rVar10.W(1288626074);
                boolean g16 = rVar10.g(uVar3);
                Object K18 = rVar10.K();
                if (g16 || K18 == obj) {
                    K18 = new C5607g(0, uVar3);
                    rVar10.h0(K18);
                }
                rVar10.t(false);
                wf.k kVar3 = (wf.k) ((AbstractC0408g) K18);
                rVar10.W(1288626122);
                boolean g17 = rVar10.g(uVar3);
                Object K19 = rVar10.K();
                if (g17 || K19 == obj) {
                    K19 = new C5607g(1, uVar3);
                    rVar10.h0(K19);
                }
                rVar10.t(false);
                y.i(c5323a, c5602b, kVar3, (wf.k) ((AbstractC0408g) K19), androidx.compose.foundation.layout.e.d(c4323o, 1.0f), rVar10, 24584, 0);
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42839c), rVar10);
                rVar10.W(1288626302);
                wf.n nVar = (wf.n) obj2;
                boolean g18 = rVar10.g(nVar) | rVar10.g(abstractC1710f02) | rVar10.g(uVar3);
                Object K20 = rVar10.K();
                if (g18 || K20 == obj) {
                    K20 = new s(nVar, uVar3, abstractC1710f02, 24);
                    rVar10.h0(K20);
                }
                rVar10.t(false);
                Ng.H.a((AbstractC6216a) K20, a14, false, null, null, null, null, null, null, AbstractC5604d.f45503b, rVar10, 805306368, 510);
                return;
            case 10:
                AbstractC3557B.c0("$this$BaseOnboardingScreen", abstractC0441z);
                AbstractC4326r a16 = io.sentry.compose.b.a("VerifyEmailContent");
                if ((i10 & 81) == 16) {
                    r rVar12 = (r) abstractC1725n;
                    if (rVar12.B()) {
                        rVar12.P();
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                C0986w0 c0986w0 = (C0986w0) obj4;
                String str3 = c0986w0.f11995a;
                if (str3 == null) {
                    str3 = "";
                }
                objArr[0] = str3;
                j4.b(Ng.H.w(R.string.onboarding_verify_email_subtitle, objArr, abstractC1725n), a16, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42842f), abstractC1725n);
                Ng.H.f((AbstractC6216a) obj3, a16, false, null, null, null, null, androidx.compose.foundation.layout.a.b(0.0f, 3), null, Jb.i.f8997b, abstractC1725n, 817889280, 382);
                o0 o0Var = c0986w0.f11997c;
                if (o0Var instanceof m0) {
                    r rVar13 = (r) abstractC1725n;
                    rVar13.W(2022248260);
                    I2.b(AbstractC4194d.a((X) a16, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b)), 0L, p9.u.f42856a, 0L, 0, rVar13, 0, 26);
                    rVar13.t(false);
                    return;
                } else if (o0Var instanceof n0) {
                    r rVar14 = (r) abstractC1725n;
                    rVar14.W(2022248401);
                    j4.b(Ng.H.v(R.string.onboarding_email_resent, rVar14), a16, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar14.m(q4.f20361a)).f20312m, rVar14, 0, 0, 65534);
                    rVar14.t(false);
                    return;
                } else {
                    r rVar15 = (r) abstractC1725n;
                    rVar15.W(2022248621);
                    Ng.H.f((AbstractC6216a) obj2, a16, false, null, null, null, null, androidx.compose.foundation.layout.a.b(0.0f, 3), null, Jb.i.f8998c, rVar15, 817889280, 382);
                    rVar15.t(false);
                    return;
                }
            case 11:
                AbstractC3557B.c0("$this$BottomSheet", abstractC0441z);
                AbstractC4326r a17 = io.sentry.compose.b.a("BirthdayPicker");
                if ((((i10 & 14) == 0 ? i10 | (((r) abstractC1725n).g(abstractC0441z) ? 4 : 2) : i10) & 91) == 18) {
                    r rVar16 = (r) abstractC1725n;
                    if (rVar16.B()) {
                        rVar16.P();
                        return;
                    }
                }
                X x10 = (X) a17;
                r rVar17 = (r) abstractC1725n;
                j4.b(Ng.H.v(R.string.onboarding_birthday_title, abstractC1725n), AbstractC4194d.a(x10, androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), 0.0f, 0.0f, 0.0f, p9.r.f42840d, 7)), 0L, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 0, 0, null, ((p4) rVar17.m(q4.f20361a)).f20306g, abstractC1725n, 0, 0, 65020);
                j4.b(Ng.H.v(R.string.onboarding_birthday_subtitle, abstractC1725n), AbstractC4194d.a(x10, androidx.compose.foundation.layout.e.d(c4323o, 1.0f)), 0L, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 0, 0, null, null, abstractC1725n, 48, 0, 130556);
                rVar17.W(1538670653);
                Yg.r rVar18 = (Yg.r) obj2;
                Object K21 = rVar17.K();
                if (K21 == obj) {
                    K21 = AbstractC4828h.Z(rVar18, o1.f22665a);
                    rVar17.h0(K21);
                }
                AbstractC1710f0 abstractC1710f03 = (AbstractC1710f0) K21;
                rVar17.t(false);
                Yg.r rVar19 = (Yg.r) abstractC1710f03.getValue();
                rVar17.W(1538670787);
                Object K22 = rVar17.K();
                if (K22 == obj) {
                    K22 = AbstractC6463a.h(abstractC1710f03, 14, rVar17);
                }
                rVar17.t(false);
                x.a(rVar19, (wf.k) K22, androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.a.t(c4323o, 0.0f, p9.r.f42843g, 1), Kb.b.f9590a), rVar17, 56, 0);
                AbstractC4326r a18 = AbstractC4194d.a(x10, ((A) abstractC0441z).a(androidx.compose.foundation.layout.a.v(c4323o, 0.0f, 0.0f, 0.0f, p9.r.f42846j, 7), C4310b.f37706s0));
                rVar17.W(1538671127);
                wf.k kVar4 = (wf.k) obj4;
                AbstractC6216a abstractC6216a2 = (AbstractC6216a) obj3;
                boolean g19 = rVar17.g(kVar4) | rVar17.g(abstractC6216a2);
                Object K23 = rVar17.K();
                if (g19 || K23 == obj) {
                    K23 = new s(kVar4, abstractC6216a2, abstractC1710f03, 27);
                    rVar17.h0(K23);
                }
                rVar17.t(false);
                Ng.H.f((AbstractC6216a) K23, a18, false, null, null, null, null, null, null, Kb.g.f9603c, rVar17, 805306368, 508);
                return;
            case 14:
                AbstractC3557B.c0("$this$DropdownMenu", abstractC0441z);
                AbstractC4326r a19 = io.sentry.compose.b.a("ViewSharedConversationScreen");
                if ((i10 & 81) == 16) {
                    r rVar20 = (r) abstractC1725n;
                    if (rVar20.B()) {
                        rVar20.P();
                        return;
                    }
                }
                C3288a c3288a4 = nc.d.f40220d;
                r rVar21 = (r) abstractC1725n;
                rVar21.W(248160456);
                wf.k kVar5 = (wf.k) obj4;
                boolean g20 = rVar21.g(kVar5);
                AbstractC6216a abstractC6216a3 = (AbstractC6216a) obj3;
                Object K24 = rVar21.K();
                if (g20 || K24 == obj) {
                    K24 = new C5717p(abstractC6216a3, kVar5);
                    rVar21.h0(K24);
                }
                rVar21.t(false);
                H.g(c3288a4, (AbstractC6216a) K24, a19, nc.d.f40221e, null, false, null, null, null, rVar21, 3078, 500);
                C3288a c3288a5 = nc.d.f40222f;
                rVar21.W(248161190);
                AbstractC1710f0 abstractC1710f04 = (AbstractC1710f0) obj2;
                Object K25 = rVar21.K();
                if (K25 == obj) {
                    K25 = new C5388e(abstractC6216a3, abstractC1710f04, 3);
                    rVar21.h0(K25);
                }
                rVar21.t(false);
                H.g(c3288a5, (AbstractC6216a) K25, a19, nc.d.f40223g, null, false, null, null, null, rVar21, 3126, 500);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(g0 g0Var, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13;
        pd.n nVar;
        String str;
        q0 q0Var;
        int i14;
        C4323o c4323o = C4323o.f37719b;
        int i15 = this.f14503Y;
        Object obj = this.f14505h0;
        Object obj2 = this.f14504Z;
        Object obj3 = this.f14506i0;
        int i16 = 4;
        switch (i15) {
            case 3:
                AbstractC3557B.c0("paddings", g0Var);
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (!((r) abstractC1725n).g(g0Var)) {
                        i16 = 2;
                    }
                    i11 = i10 | i16;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                L4.a.k((Tc.f) obj3, (j1) obj2, (wf.k) ((AbstractC0408g) obj), androidx.compose.foundation.layout.a.q(c4323o, g0Var).g(androidx.compose.foundation.layout.e.f24739c), false, 0.0f, abstractC1725n, 24584, 32);
                return;
            case 9:
                AbstractC3557B.c0("paddings", g0Var);
                u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (!((r) abstractC1725n).g(g0Var)) {
                        i16 = 2;
                    }
                    i12 = i10 | i16;
                } else {
                    i12 = i10;
                }
                if ((i12 & 91) == 18) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                r rVar3 = (r) abstractC1725n;
                Af.d dVar = (Af.d) rVar3.m(p9.n.f42798a);
                AbstractC3557B.c0("random", dVar);
                rVar3.W(1522464867);
                List list = v9.b.f47405q;
                AbstractC3557B.c0("<this>", list);
                List N22 = t.N2(list);
                t.z2(N22, dVar);
                List G02 = AbstractC4344b.G0("", Ng.H.v(R.string.login_greeting1, rVar3), "", Ng.H.v(R.string.login_greeting2, rVar3), "", Ng.H.v(R.string.login_greeting3, rVar3), "", Ng.H.v(R.string.app_title, rVar3), "", Ng.H.v(R.string.login_greeting4, rVar3), "", Ng.H.v(R.string.login_greeting5, rVar3), "", Ng.H.v(R.string.login_greeting6, rVar3), "", Ng.H.v(R.string.app_title, rVar3), "", Ng.H.v(R.string.login_greeting7, rVar3), "", Ng.H.v(R.string.login_greeting8, rVar3), "", Ng.H.v(R.string.login_greeting9, rVar3), "", Ng.H.v(R.string.app_title, rVar3));
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(G02, 10));
                int i17 = 0;
                for (Object obj4 : G02) {
                    int i18 = i17 + 1;
                    if (i17 >= 0) {
                        String str2 = (String) obj4;
                        ArrayList arrayList2 = (ArrayList) N22;
                        Object obj5 = arrayList2.get((i17 / 2) % arrayList2.size());
                        String str3 = (String) t.i2(i17 - 1, G02);
                        if (str3 == null) {
                            str3 = "";
                        }
                        C5999a c5999a = (C5999a) obj5;
                        arrayList.add(new Hb.a(str2, c5999a.f47388b, c5999a.f47387a, Mg.b.j(str3.length(), AbstractC5285b.f43981a)));
                        G02 = G02;
                        i17 = i18;
                    } else {
                        AbstractC4344b.d1();
                        throw null;
                    }
                }
                Object w10 = AbstractC0044t0.w(rVar3, false, 974263977);
                if (w10 == C1723m.f22654Y) {
                    rVar3.h0(arrayList);
                } else {
                    arrayList = w10;
                }
                rVar3.t(false);
                AbstractC5288e.a(arrayList, true, 0L, 0L, R4.b.X(rVar3, 915390817, new C6475m(g0Var, (Tc.f) obj3, (wf.k) obj2, (C0951e0) obj, 9)), rVar3, 24632, 12);
                return;
            case 12:
                AbstractC3557B.c0("paddings", g0Var);
                AbstractC4326r a5 = io.sentry.compose.b.a("InitializationFailedScreen");
                if ((i10 & 14) == 0) {
                    if (!((r) abstractC1725n).g(g0Var)) {
                        i16 = 2;
                    }
                    i13 = i10 | i16;
                } else {
                    i13 = i10;
                }
                if ((i13 & 91) == 18) {
                    r rVar4 = (r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                C5953f X10 = com.google.android.gms.internal.play_billing.N.X();
                pd.s sVar = (pd.s) obj3;
                if (sVar instanceof pd.n) {
                    nVar = (pd.n) sVar;
                } else {
                    nVar = null;
                }
                if (nVar != null && (q0Var = nVar.f43065a) != null) {
                    Tc.f fVar = (Tc.f) obj2;
                    str = A7.b.G1(q0Var, fVar.f17059d, fVar.f17056a);
                } else {
                    str = null;
                }
                r rVar5 = (r) abstractC1725n;
                rVar5.W(-1785438499);
                if (str == null) {
                    str = Ng.H.v(R.string.design_error_network, rVar5);
                }
                rVar5.t(false);
                y.l(AbstractC4194d.a((X) a5, androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.e.f24739c, g0Var)), X10, null, str, R4.b.X(rVar5, -1113189618, new C0766k0((AbstractC6216a) obj, 2)), rVar5, 24576, 4);
                return;
            default:
                AbstractC3557B.c0("it", g0Var);
                u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (!((r) abstractC1725n).g(g0Var)) {
                        i16 = 2;
                    }
                    i14 = i10 | i16;
                } else {
                    i14 = i10;
                }
                if ((i14 & 91) == 18) {
                    r rVar6 = (r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                ((wf.q) obj3).n(g0Var, (Ad.s) obj2, (AbstractC0408g) obj, abstractC1725n, Integer.valueOf(i14 & 14));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = C1723m.f22654Y;
        AbstractC4326r abstractC4326r = C4323o.f37719b;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f14503Y;
        int i11 = 4;
        Object obj5 = this.f14505h0;
        Object obj6 = this.f14504Z;
        Object obj7 = this.f14506i0;
        switch (i10) {
            case 0:
                R8.s sVar = (R8.s) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("it", sVar);
                if ((intValue & 14) == 0) {
                    if (!((r) abstractC1725n).g(sVar)) {
                        i11 = 2;
                    }
                    intValue |= i11;
                }
                if ((intValue & 91) == 18) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                m.d((M) obj7, sVar, (wf.p) obj6, (wf.p) obj5, abstractC1725n, (intValue << 3) & 112);
                return yVar;
            case 1:
                M m10 = (M) obj;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$BlockQuote", m10);
                if ((intValue2 & 14) == 0) {
                    if (!((r) abstractC1725n2).g(m10)) {
                        i11 = 2;
                    }
                    intValue2 |= i11;
                }
                if ((intValue2 & 91) == 18) {
                    r rVar2 = (r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                m.d(m10, (R8.s) obj7, (wf.p) obj6, (wf.p) obj5, abstractC1725n2, intValue2 & 14);
                return yVar;
            case 2:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 3:
                c((g0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 4:
                wf.n nVar = (wf.n) obj;
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj2;
                int intValue3 = ((Number) obj3).intValue();
                AbstractC3557B.c0("innerTextField", nVar);
                AbstractC4326r a5 = io.sentry.compose.b.a("InputPanel");
                if ((intValue3 & 14) == 0) {
                    if (!((r) abstractC1725n3).i(nVar)) {
                        i11 = 2;
                    }
                    intValue3 |= i11;
                }
                if ((intValue3 & 91) == 18) {
                    r rVar3 = (r) abstractC1725n3;
                    if (rVar3.B()) {
                        rVar3.P();
                        return yVar;
                    }
                }
                AbstractC5690F.c((C6783B) obj7, (D1) obj6, (wf.k) ((AbstractC0408g) obj5), nVar, a5, abstractC1725n3, (intValue3 << 9) & 7168, 16);
                return yVar;
            case 5:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 6:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 7:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 8:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 9:
                c((g0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 10:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 11:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 12:
                c((g0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 13:
                AbstractC1725n abstractC1725n4 = (AbstractC1725n) obj2;
                int intValue4 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$item", (AbstractC0528b) obj);
                AbstractC4326r a10 = io.sentry.compose.b.a("SettingsScreen");
                if ((intValue4 & 81) == 16) {
                    r rVar4 = (r) abstractC1725n4;
                    if (rVar4.B()) {
                        rVar4.P();
                        return yVar;
                    }
                }
                r rVar5 = (r) abstractC1725n4;
                rVar5.W(-1712146059);
                Object K10 = rVar5.K();
                if (K10 == obj4) {
                    K10 = U3.f.h0(0);
                    rVar5.h0(K10);
                }
                AbstractC1708e0 abstractC1708e0 = (AbstractC1708e0) K10;
                rVar5.t(false);
                C3288a c3288a = AbstractC4407f.f38232N;
                rVar5.W(-1712145843);
                Tc.f fVar = (Tc.f) obj6;
                if (!((C4393Q) obj7).f38116e) {
                    rVar5.W(-908408668);
                    Object K11 = rVar5.K();
                    if (K11 == obj4) {
                        K11 = kotlin.jvm.internal.m.d();
                        rVar5.h0(K11);
                    }
                    rVar5.t(false);
                    abstractC4326r = androidx.compose.foundation.a.g(abstractC4326r, (D.m) K11, null, false, null, new B(fVar, 25, abstractC1708e0), 28);
                }
                AbstractC4326r a11 = AbstractC4194d.a((X) a10, abstractC4326r);
                rVar5.t(false);
                E1.a(c3288a, a11, null, R4.b.X(rVar5, 1507770962, new r9.r((String) obj5, 10)), AbstractC4407f.f38233O, null, null, 0.0f, 0.0f, rVar5, 27654, 484);
                return yVar;
            case 14:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 15:
                AbstractC1725n abstractC1725n5 = (AbstractC1725n) obj2;
                int intValue5 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$TopAppBar", (E.q0) obj);
                AbstractC4326r a12 = io.sentry.compose.b.a("ViewSharedConversationScreen");
                if ((intValue5 & 81) == 16) {
                    r rVar6 = (r) abstractC1725n5;
                    if (rVar6.B()) {
                        rVar6.P();
                        return yVar;
                    }
                }
                if (((nc.z) obj7).f40273k) {
                    r rVar7 = (r) abstractC1725n5;
                    Object i12 = AbstractC6463a.i(rVar7, 1145709406, 1145709422);
                    if (i12 == obj4) {
                        i12 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
                        rVar7.h0(i12);
                    }
                    AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) i12;
                    Object w10 = AbstractC0044t0.w(rVar7, false, 1145709496);
                    if (w10 == obj4) {
                        w10 = E9.f.x(abstractC1710f0, 28, rVar7);
                    }
                    AbstractC6216a abstractC6216a = (AbstractC6216a) w10;
                    Object w11 = AbstractC0044t0.w(rVar7, false, 1145709562);
                    if (w11 == obj4) {
                        w11 = E9.f.x(abstractC1710f0, 26, rVar7);
                    }
                    rVar7.t(false);
                    R4.b.o((AbstractC6216a) w11, a12, false, null, null, nc.d.f40219c, rVar7, 196614, 30);
                    boolean booleanValue = ((Boolean) abstractC1710f0.getValue()).booleanValue();
                    rVar7.W(1145709996);
                    Object K12 = rVar7.K();
                    if (K12 == obj4) {
                        K12 = E9.f.x(abstractC1710f0, 27, rVar7);
                    }
                    rVar7.t(false);
                    H.f(booleanValue, (AbstractC6216a) K12, a12, 0L, null, null, R4.b.X(rVar7, 692009574, new i((wf.k) obj6, abstractC6216a, (AbstractC1710f0) obj5, 14)), rVar7, 1572912, 60);
                    rVar7.t(false);
                } else {
                    r rVar8 = (r) abstractC1725n5;
                    rVar8.W(1145711338);
                    rVar8.W(1145711359);
                    wf.k kVar = (wf.k) obj6;
                    boolean g10 = rVar8.g(kVar);
                    Object K13 = rVar8.K();
                    if (g10 || K13 == obj4) {
                        K13 = AbstractC0044t0.z(12, kVar, rVar8);
                    }
                    rVar8.t(false);
                    R4.b.o(K13, a12, false, null, null, nc.d.f40224h, rVar8, 196608, 30);
                    rVar8.t(false);
                }
                return yVar;
            case 16:
                c((g0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}

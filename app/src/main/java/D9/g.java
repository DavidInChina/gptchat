package d9;

import A.AbstractC0044t0;
import A.C0046u0;
import Df.H;
import E.C0412a0;
import E.D0;
import L0.u;
import W.AbstractC1522a0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.r;
import ab.AbstractC1951e;
import ab.AbstractC1953g;
import ab.C1965s;
import bb.AbstractC2163f;
import bb.AbstractC2169i;
import bb.C2152D;
import bb.C2170j;
import bb.C2177q;
import bb.m0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import hc.AbstractC3394i;
import hc.F;
import ic.AbstractC3534d;
import ic.AbstractC3539i;
import ic.C3551v;
import ic.P;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;
import nc.AbstractC4811c;
import nc.s;
import r9.y;
import ra.AbstractC5399d;
import s3.C5562l;
import va.C6004e;
import x8.W;
import y.C6473k;
import y.L;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28139Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f28140Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Tc.f fVar, int i10) {
        super(4);
        this.f28139Y = i10;
        this.f28140Z = fVar;
    }

    public final void a(C1965s c1965s, wf.k kVar, AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f28139Y;
        Tc.f fVar = this.f28140Z;
        switch (i11) {
            case 16:
                AbstractC3557B.c0("$anonymous$parameter$0$", c1965s);
                AbstractC3557B.c0("$anonymous$parameter$1$", kVar);
                AbstractC4326r a5 = io.sentry.compose.b.a("GizmoAccountsScreen");
                if ((i10 & 641) == 128) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                y.z(AbstractC1951e.f24083a, a5, AbstractC2469q0.g(fVar, 5, abstractC1725n, -1580001867), null, false, abstractC1725n, 390, 26);
                return;
            default:
                AbstractC3557B.c0("$anonymous$parameter$0$", c1965s);
                AbstractC3557B.c0("$anonymous$parameter$1$", kVar);
                AbstractC4326r a10 = io.sentry.compose.b.a("GizmoActionsScreen");
                if ((i10 & 641) == 128) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                y.z(AbstractC1953g.f24092a, a10, AbstractC2469q0.g(fVar, 6, abstractC1725n, -2111188829), null, false, abstractC1725n, 390, 26);
                return;
        }
    }

    public final void c(L l10, C5562l c5562l, AbstractC1725n abstractC1725n) {
        int i10 = this.f28139Y;
        Tc.f fVar = this.f28140Z;
        switch (i10) {
            case 0:
                y.k(this.f28140Z, AbstractC2469q0.m("$this$conversationComposable", l10, "it", c5562l, "AppNavHost"), null, abstractC1725n, 8, 6);
                return;
            case 1:
                AbstractC5399d.a(fVar, AbstractC2469q0.m("$this$composable", l10, "it", c5562l, "AppNavHost"), abstractC1725n, 8, 2);
                return;
            case 2:
                K8.d.I(fVar, AbstractC2469q0.m("$this$composable", l10, "it", c5562l, "AppNavHost"), abstractC1725n, 8, 2);
                return;
            case 3:
                Bi.c.C(this.f28140Z, AbstractC2469q0.m("$this$composable", l10, "it", c5562l, "AppNavHost"), null, abstractC1725n, 8, 6);
                return;
            case 4:
                AbstractC3557B.c0("$this$composable", l10);
                AbstractC3557B.c0("it", c5562l);
                u uVar = io.sentry.compose.b.f34309a;
                K8.d.u(fVar, null, abstractC1725n, 8, 2);
                return;
            case 5:
                AbstractC3557B.c0("$this$composable", l10);
                AbstractC3557B.c0("it", c5562l);
                u uVar2 = io.sentry.compose.b.f34309a;
                y.q(fVar, null, abstractC1725n, 8, 2);
                return;
            case 6:
                AbstractC3557B.c0("$this$composable", l10);
                AbstractC3557B.c0("it", c5562l);
                u uVar3 = io.sentry.compose.b.f34309a;
                W.v(fVar, null, abstractC1725n, 8, 2);
                return;
            case 7:
                A7.b.u(this.f28140Z, AbstractC2469q0.m("$this$composable", l10, "it", c5562l, "AppNavHost"), null, abstractC1725n, 8, 6);
                return;
            case 8:
                K8.d.b(this.f28140Z, AbstractC2469q0.m("$this$composable", l10, "it", c5562l, "AppNavHost"), null, abstractC1725n, 8, 6);
                return;
            case 9:
                AbstractC4326r m10 = AbstractC2469q0.m("$this$conversationComposable", l10, "it", c5562l, "AppNavHost");
                r rVar = (r) abstractC1725n;
                rVar.W(-1455078922);
                Object K10 = rVar.K();
                if (K10 == C1723m.f22654Y) {
                    K10 = new C6004e();
                    rVar.h0(K10);
                }
                C6004e c6004e = (C6004e) K10;
                rVar.t(false);
                Tc.f fVar2 = this.f28140Z;
                K8.d.M(fVar2, c6004e, R4.b.X(rVar, -859244830, new j(fVar2, c6004e, 0)), m10, null, rVar, 392, 24);
                return;
            case 10:
                K8.d.c(this.f28140Z, AbstractC2469q0.m("$this$composable", l10, "it", c5562l, "AppNavHost"), null, abstractC1725n, 8, 6);
                return;
            case 11:
                K8.d.E(this.f28140Z, AbstractC2469q0.m("$this$composable", l10, "it", c5562l, "AppNavHost"), null, abstractC1725n, 8, 6);
                return;
            default:
                W.s(this.f28140Z, "1.2024.066", AbstractC2469q0.m("$this$composable", l10, "it", c5562l, "AppNavHost"), null, abstractC1725n, 56, 12);
                return;
        }
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        boolean z10;
        wf.k kVar;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C4323o c4323o = C4323o.f37719b;
        jf.y yVar = jf.y.f36177a;
        int i17 = this.f28139Y;
        int i18 = 16;
        int i19 = 32;
        Tc.f fVar = this.f28140Z;
        switch (i17) {
            case 0:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 1:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 2:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 3:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 4:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 5:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 6:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 7:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 8:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 9:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 10:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 11:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 12:
                ((Number) obj4).intValue();
                c((L) obj, (C5562l) obj2, (AbstractC1725n) obj3);
                return yVar;
            case 13:
                F9.i iVar = (F9.i) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
                int intValue = ((Number) obj4).intValue();
                AbstractC3557B.c0("state", iVar);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a5 = io.sentry.compose.b.a("ConversationCsvAttachmentScreen");
                if ((intValue & 14) == 0) {
                    if (((r) abstractC1725n).g(iVar)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 651) == 130) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                y.z(R4.b.X(abstractC1725n, -1311789056, new C6473k(17, iVar)), a5, AbstractC2469q0.g(fVar, 0, abstractC1725n, 1139542530), R4.b.X(abstractC1725n, -288949589, new C0046u0(fVar, 7, iVar)), false, abstractC1725n, 3462, 18);
                return yVar;
            case 14:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj3;
                int intValue2 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (G9.q) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a10 = io.sentry.compose.b.a("ConversationDetailsScreen");
                if ((intValue2 & 641) == 128) {
                    r rVar2 = (r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.d(G9.d.f6115a, a10, AbstractC2469q0.g(fVar, 1, abstractC1725n2, 32871643), null, null, null, null, abstractC1725n2, 390, 122);
                return yVar;
            case 15:
                Ra.k kVar2 = (Ra.k) obj;
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj3;
                int intValue3 = ((Number) obj4).intValue();
                AbstractC3557B.c0("state", kVar2);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a11 = io.sentry.compose.b.a("ConversationSpreadsheetScreen");
                if ((intValue3 & 14) == 0) {
                    if (((r) abstractC1725n3).g(kVar2)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    intValue3 |= i11;
                }
                if ((intValue3 & 651) == 130) {
                    r rVar3 = (r) abstractC1725n3;
                    if (rVar3.B()) {
                        rVar3.P();
                        return yVar;
                    }
                }
                y.z(R4.b.X(abstractC1725n3, 2042867351, new C6473k(24, kVar2)), a11, AbstractC2469q0.g(fVar, 4, abstractC1725n3, -1159314663), R4.b.X(abstractC1725n3, -1962065150, new C0046u0(fVar, 11, kVar2)), false, abstractC1725n3, 3462, 18);
                return yVar;
            case 16:
                a((C1965s) obj, (wf.k) obj2, (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 17:
                a((C1965s) obj, (wf.k) obj2, (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 18:
                AbstractC1725n abstractC1725n4 = (AbstractC1725n) obj3;
                int intValue4 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (C2177q) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a12 = io.sentry.compose.b.a("GizmoPreviewScreen");
                if ((intValue4 & 641) == 128) {
                    r rVar4 = (r) abstractC1725n4;
                    if (rVar4.B()) {
                        rVar4.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.d(AbstractC2163f.f25810a, a12, AbstractC2469q0.g(fVar, 7, abstractC1725n4, -567030849), null, null, null, null, abstractC1725n4, 390, 122);
                return yVar;
            case 19:
                AbstractC1725n abstractC1725n5 = (AbstractC1725n) obj3;
                int intValue5 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (C2152D) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a13 = io.sentry.compose.b.a("GizmoRatingScreen");
                if ((intValue5 & 641) == 128) {
                    r rVar5 = (r) abstractC1725n5;
                    if (rVar5.B()) {
                        rVar5.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.d(AbstractC2169i.f25830a, a13, AbstractC2469q0.g(fVar, 8, abstractC1725n5, 794489467), null, null, null, null, abstractC1725n5, 390, 122);
                return yVar;
            case 20:
                wf.k kVar3 = (wf.k) obj2;
                AbstractC1725n abstractC1725n6 = (AbstractC1725n) obj3;
                int intValue6 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (m0) obj);
                AbstractC3557B.c0("onIntent", kVar3);
                u uVar = io.sentry.compose.b.f34309a;
                if ((intValue6 & 112) == 0) {
                    if (((r) abstractC1725n6).i(kVar3)) {
                        i12 = 32;
                    } else {
                        i12 = 16;
                    }
                    intValue6 |= i12;
                }
                if ((intValue6 & 721) == 144) {
                    r rVar6 = (r) abstractC1725n6;
                    if (rVar6.B()) {
                        rVar6.P();
                        return yVar;
                    }
                }
                r rVar7 = (r) abstractC1725n6;
                rVar7.W(989011647);
                if ((intValue6 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object K10 = rVar7.K();
                if (z10 || K10 == C1723m.f22654Y) {
                    z11 = false;
                    kVar = AbstractC0044t0.v(0, kVar3, rVar7);
                } else {
                    kVar = K10;
                    z11 = false;
                }
                rVar7.t(z11);
                rVar7.W(2143182847);
                C0412a0 c0412a0 = new C0412a0(H.U(rVar7), y.f44625e | 16);
                rVar7.t(false);
                K8.d.S(kVar, D0.a(c4323o, c0412a0), new F9.e(fVar, 14), Ng.H.v(R.string.gizmos_store_title, rVar7), false, null, C2170j.f25844n0, rVar7, 1572864, 48);
                return yVar;
            case 21:
                AbstractC1725n abstractC1725n7 = (AbstractC1725n) obj3;
                int intValue7 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (Ab.l) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a14 = io.sentry.compose.b.a("AipOauthScreen");
                if ((intValue7 & 641) == 128) {
                    r rVar8 = (r) abstractC1725n7;
                    if (rVar8.B()) {
                        rVar8.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.d(Ab.u.f782a, a14, AbstractC2469q0.g(fVar, 10, abstractC1725n7, -24182474), null, null, null, null, abstractC1725n7, 390, 122);
                return yVar;
            case 22:
                AbstractC1725n abstractC1725n8 = (AbstractC1725n) obj3;
                int intValue8 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (F) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a15 = io.sentry.compose.b.a("CustomInstructionsIntroductionScreen");
                if ((intValue8 & 641) == 128) {
                    r rVar9 = (r) abstractC1725n8;
                    if (rVar9.B()) {
                        rVar9.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.d(AbstractC3394i.f32206a, a15, AbstractC2469q0.g(fVar, 15, abstractC1725n8, 1421213475), null, null, null, null, abstractC1725n8, 390, 122);
                return yVar;
            case 23:
                hc.L l10 = (hc.L) obj;
                wf.k kVar4 = (wf.k) obj2;
                AbstractC1725n abstractC1725n9 = (AbstractC1725n) obj3;
                int intValue9 = ((Number) obj4).intValue();
                AbstractC3557B.c0("state", l10);
                AbstractC3557B.c0("onIntent", kVar4);
                AbstractC4326r a16 = io.sentry.compose.b.a("CustomInstructionsScreen");
                if ((intValue9 & 14) == 0) {
                    if (((r) abstractC1725n9).g(l10)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = intValue9 | i14;
                } else {
                    i13 = intValue9;
                }
                if ((intValue9 & 112) == 0) {
                    if (!((r) abstractC1725n9).i(kVar4)) {
                        i19 = 16;
                    }
                    i13 |= i19;
                }
                if ((i13 & 731) == 146) {
                    r rVar10 = (r) abstractC1725n9;
                    if (rVar10.B()) {
                        rVar10.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.d(R4.b.X(abstractC1725n9, -206217447, new Jb.c(4, l10)), a16, AbstractC2469q0.g(fVar, 16, abstractC1725n9, 1110548311), R4.b.X(abstractC1725n9, 1937504462, new C0046u0(l10, 25, kVar4)), null, null, null, abstractC1725n9, 3462, 114);
                return yVar;
            case 24:
                AbstractC1725n abstractC1725n10 = (AbstractC1725n) obj3;
                int intValue10 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (C3551v) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a17 = io.sentry.compose.b.a("MemorySettingsScreen");
                if ((intValue10 & 641) == 128) {
                    r rVar11 = (r) abstractC1725n10;
                    if (rVar11.B()) {
                        rVar11.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.d(AbstractC3534d.f33009a, a17, AbstractC2469q0.g(fVar, 17, abstractC1725n10, 1711925087), null, null, null, null, abstractC1725n10, 390, 122);
                return yVar;
            case 25:
                P p10 = (P) obj;
                wf.k kVar5 = (wf.k) obj2;
                AbstractC1725n abstractC1725n11 = (AbstractC1725n) obj3;
                int intValue11 = ((Number) obj4).intValue();
                AbstractC3557B.c0("state", p10);
                AbstractC3557B.c0("onIntent", kVar5);
                AbstractC4326r a18 = io.sentry.compose.b.a("ViewMemoryScreen");
                if ((intValue11 & 14) == 0) {
                    if (((r) abstractC1725n11).g(p10)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = intValue11 | i16;
                } else {
                    i15 = intValue11;
                }
                if ((intValue11 & 112) == 0) {
                    if (((r) abstractC1725n11).i(kVar5)) {
                        i18 = 32;
                    }
                    i15 |= i18;
                }
                if ((i15 & 731) == 146) {
                    r rVar12 = (r) abstractC1725n11;
                    if (rVar12.B()) {
                        rVar12.P();
                        return yVar;
                    }
                }
                y.z(AbstractC3539i.f33048a, a18, AbstractC2469q0.g(fVar, 18, abstractC1725n11, -1225667685), R4.b.X(abstractC1725n11, -1255217582, new C0046u0(p10, 27, kVar5)), false, abstractC1725n11, 3462, 18);
                return yVar;
            default:
                wf.k kVar6 = (wf.k) obj2;
                AbstractC1725n abstractC1725n12 = (AbstractC1725n) obj3;
                int intValue12 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (s) obj);
                AbstractC3557B.c0("onIntent", kVar6);
                AbstractC4326r a19 = io.sentry.compose.b.a("ShareConversationScreen");
                if ((intValue12 & 112) == 0) {
                    if (((r) abstractC1725n12).i(kVar6)) {
                        i18 = 32;
                    }
                    intValue12 |= i18;
                }
                if ((intValue12 & 721) == 144) {
                    r rVar13 = (r) abstractC1725n12;
                    if (rVar13.B()) {
                        rVar13.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.d(AbstractC4811c.f40208a, a19, AbstractC2469q0.g(fVar, 20, abstractC1725n12, -299193593), R4.b.X(abstractC1725n12, -1134463042, new androidx.compose.foundation.layout.f(22, kVar6)), null, null, null, abstractC1725n12, 3462, 114);
                return yVar;
        }
    }
}

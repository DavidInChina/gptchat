package fb;

import A.C0046u0;
import Ad.s;
import E.AbstractC0441z;
import E.g0;
import F.AbstractC0539m;
import G0.X;
import H0.W0;
import L0.u;
import Ng.H;
import Xb.p;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.r;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import jf.y;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import p9.AbstractC5102d;
import p9.AbstractC5103e;
import u0.AbstractC5824b;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import wf.q;
import y.C6471i;

/* renamed from: fb.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2991j extends kotlin.jvm.internal.o implements q {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30098Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f30099Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2991j(int i10, Object obj) {
        super(5);
        this.f30098Y = i10;
        this.f30099Z = obj;
    }

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        y yVar = y.f36177a;
        C4323o c4323o = C4323o.f37719b;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        int i16 = this.f30098Y;
        int i17 = 2;
        boolean z10 = true;
        Object obj5 = this.f30099Z;
        switch (i16) {
            case 0:
                g0 g0Var = (g0) obj;
                C2996o c2996o = (C2996o) obj2;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
                int intValue = num.intValue();
                AbstractC3557B.c0("paddings", g0Var);
                AbstractC3557B.c0("state", c2996o);
                AbstractC3557B.c0("$anonymous$parameter$2$", (wf.k) obj3);
                u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 14) == 0) {
                    if (((r) abstractC1725n).g(g0Var)) {
                        i17 = 4;
                    }
                    i10 = intValue | i17;
                } else {
                    i10 = intValue;
                }
                if ((intValue & 112) == 0) {
                    if (((r) abstractC1725n).g(c2996o)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i10 |= i11;
                }
                if ((i10 & 5211) == 1042) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.e.f24739c, g0Var);
                r rVar2 = (r) abstractC1725n;
                rVar2.W(-1792580921);
                if ((i10 & 112) != 32) {
                    z10 = false;
                }
                AbstractC2992k abstractC2992k = (AbstractC2992k) obj5;
                boolean g10 = z10 | rVar2.g(abstractC2992k);
                Object K10 = rVar2.K();
                if (g10 || K10 == iVar) {
                    K10 = new Ra.l(c2996o, 4, abstractC2992k);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                AbstractC0539m.a(q10, null, null, false, null, null, null, false, (wf.k) K10, rVar2, 0, 254);
                return yVar;
            case 1:
                g0 g0Var2 = (g0) obj;
                p pVar = (p) obj2;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj4;
                AbstractC3557B.c0("paddings", g0Var2);
                AbstractC3557B.c0("state", pVar);
                AbstractC3557B.c0("$anonymous$parameter$2$", (wf.k) obj3);
                AbstractC4326r a5 = io.sentry.compose.b.a("FailwhaleScreen");
                r9.y.l(AbstractC4194d.a((X) a5, androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.e.f24739c, g0Var2)), N.X(), pVar.f21838a, null, R4.b.X(abstractC1725n2, 1753810065, new C0046u0((Xb.j) obj5, 20, pVar)), abstractC1725n2, 24576, 8);
                return yVar;
            case 2:
                g0 g0Var3 = (g0) obj;
                Yb.m mVar = (Yb.m) obj2;
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj4;
                int intValue2 = num.intValue();
                AbstractC3557B.c0("paddings", g0Var3);
                AbstractC3557B.c0("state", mVar);
                AbstractC3557B.c0("$anonymous$parameter$2$", (wf.k) obj3);
                AbstractC4326r a10 = io.sentry.compose.b.a("SunsetScreen");
                if ((intValue2 & 14) == 0) {
                    if (((r) abstractC1725n3).g(g0Var3)) {
                        i17 = 4;
                    }
                    i12 = i17 | intValue2;
                } else {
                    i12 = intValue2;
                }
                if ((intValue2 & 112) == 0) {
                    if (((r) abstractC1725n3).g(mVar)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 5211) == 1042) {
                    r rVar3 = (r) abstractC1725n3;
                    if (rVar3.B()) {
                        rVar3.P();
                        return yVar;
                    }
                }
                C5953f Y02 = A7.b.Y0();
                String v10 = H.v(R.string.sunset_screen_title, abstractC1725n3);
                r rVar4 = (r) abstractC1725n3;
                rVar4.W(-1132906546);
                String str = mVar.f22226a;
                if (str == null) {
                    str = H.v(R.string.sunset_screen_description, rVar4);
                }
                rVar4.t(false);
                r9.y.l(AbstractC4194d.a((X) a10, androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.e.f24739c, g0Var3)), Y02, v10, str, R4.b.X(rVar4, -312500614, new C0046u0(mVar, 21, (Yb.h) obj5)), rVar4, 24576, 0);
                return yVar;
            case 3:
                g0 g0Var4 = (g0) obj;
                AbstractC1725n abstractC1725n4 = (AbstractC1725n) obj4;
                int intValue3 = num.intValue();
                AbstractC3557B.c0("paddings", g0Var4);
                AbstractC3557B.c0("$anonymous$parameter$1$", (ac.j) obj2);
                AbstractC3557B.c0("$anonymous$parameter$2$", (wf.k) obj3);
                AbstractC4326r a11 = io.sentry.compose.b.a("UnsupportedCountryScreen");
                if ((intValue3 & 14) == 0) {
                    if (((r) abstractC1725n4).g(g0Var4)) {
                        i17 = 4;
                    }
                    intValue3 |= i17;
                }
                if ((intValue3 & 5131) == 1026) {
                    r rVar5 = (r) abstractC1725n4;
                    if (rVar5.B()) {
                        rVar5.P();
                        return yVar;
                    }
                }
                C5953f c5953f = Ad.l.f819e;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Outlined.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i18 = AbstractC5944H.f46870a;
                    r0.N n10 = new r0.N(r0.r.f44254b);
                    Wh.p p10 = R.a.p(0, 11.99f, 2.0f);
                    p10.g(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    p10.u(4.47f, 10.0f, 9.99f, 10.0f);
                    p10.g(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                    p10.t(17.52f, 2.0f, 11.99f, 2.0f);
                    p10.f();
                    p10.p(18.92f, 8.0f);
                    p10.m(-2.95f);
                    p10.h(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
                    p10.h(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
                    p10.f();
                    p10.p(12.0f, 4.04f);
                    p10.h(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
                    p10.m(-3.82f);
                    p10.h(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
                    p10.f();
                    p10.p(4.26f, 14.0f);
                    p10.g(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
                    p10.u(0.1f, -1.36f, 0.26f, -2.0f);
                    p10.m(3.38f);
                    p10.h(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
                    p10.u(0.06f, 1.34f, 0.14f, 2.0f);
                    p10.n(4.26f, 14.0f);
                    p10.f();
                    p10.p(5.08f, 16.0f);
                    p10.m(2.95f);
                    p10.h(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
                    p10.h(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
                    p10.f();
                    p10.p(8.03f, 8.0f);
                    p10.n(5.08f, 8.0f);
                    p10.h(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
                    p10.g(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
                    p10.f();
                    p10.p(12.0f, 19.96f);
                    p10.h(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
                    p10.m(3.82f);
                    p10.h(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
                    p10.f();
                    p10.p(14.34f, 14.0f);
                    p10.n(9.66f, 14.0f);
                    p10.h(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
                    p10.u(0.07f, -1.35f, 0.16f, -2.0f);
                    p10.m(4.68f);
                    p10.h(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
                    p10.u(-0.07f, 1.34f, -0.16f, 2.0f);
                    p10.f();
                    p10.p(14.59f, 19.56f);
                    p10.h(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
                    p10.m(2.95f);
                    p10.h(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
                    p10.f();
                    p10.p(16.36f, 14.0f);
                    p10.h(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
                    p10.u(-0.06f, -1.34f, -0.14f, -2.0f);
                    p10.m(3.38f);
                    p10.h(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
                    p10.u(-0.1f, 1.36f, -0.26f, 2.0f);
                    p10.m(-3.38f);
                    p10.f();
                    C5952e.b(c5952e, p10.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    Ad.l.f819e = c5953f;
                }
                r9.y.l(AbstractC4194d.a((X) a11, androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.e.f24739c, g0Var4)), c5953f, H.v(R.string.unsupported_country_title, abstractC1725n4), H.v(R.string.unsupported_country_message, abstractC1725n4), R4.b.X(abstractC1725n4, 803010105, new C6471i(19, (ac.g) obj5)), abstractC1725n4, 24576, 0);
                return yVar;
            case 4:
                g0 g0Var5 = (g0) obj;
                dc.g gVar = (dc.g) obj2;
                AbstractC1725n abstractC1725n5 = (AbstractC1725n) obj4;
                int intValue4 = num.intValue();
                AbstractC3557B.c0("paddings", g0Var5);
                AbstractC3557B.c0("state", gVar);
                AbstractC3557B.c0("$anonymous$parameter$2$", (wf.k) obj3);
                u uVar2 = io.sentry.compose.b.f34309a;
                if ((intValue4 & 14) == 0) {
                    if (((r) abstractC1725n5).g(g0Var5)) {
                        i17 = 4;
                    }
                    i14 = intValue4 | i17;
                } else {
                    i14 = intValue4;
                }
                if ((intValue4 & 112) == 0) {
                    if (((r) abstractC1725n5).g(gVar)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i14 |= i15;
                }
                if ((i14 & 5211) == 1042) {
                    r rVar6 = (r) abstractC1725n5;
                    if (rVar6.B()) {
                        rVar6.P();
                        return yVar;
                    }
                }
                AbstractC4326r g11 = androidx.compose.foundation.layout.a.q(c4323o, g0Var5).g(androidx.compose.foundation.layout.e.f24739c);
                r rVar7 = (r) abstractC1725n5;
                rVar7.W(1785751041);
                if ((i14 & 112) != 32) {
                    z10 = false;
                }
                dc.h hVar = (dc.h) obj5;
                boolean g12 = z10 | rVar7.g(hVar);
                Object K11 = rVar7.K();
                if (g12 || K11 == iVar) {
                    K11 = new Ra.l(gVar, 18, hVar);
                    rVar7.h0(K11);
                }
                rVar7.t(false);
                AbstractC0539m.a(g11, null, null, false, null, null, null, false, (wf.k) K11, rVar7, 0, 254);
                return yVar;
            case 5:
                AbstractC0441z abstractC0441z = (AbstractC0441z) obj;
                int intValue5 = num.intValue();
                AbstractC3557B.c0("$this$ScrollableContentScreenContent", abstractC0441z);
                AbstractC3557B.c0("$anonymous$parameter$0$", (s) obj2);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj3);
                u uVar3 = io.sentry.compose.b.f34309a;
                ((wf.o) obj5).invoke(abstractC0441z, (AbstractC1725n) obj4, Integer.valueOf(intValue5 & 14));
                return yVar;
            default:
                AbstractC1725n abstractC1725n6 = (AbstractC1725n) obj4;
                int intValue6 = num.intValue();
                AbstractC3557B.c0("$this$ScrollableContentScreen", (AbstractC0441z) obj);
                AbstractC3557B.c0("$anonymous$parameter$0$", (Jd.h) obj2);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj3);
                AbstractC4326r a12 = io.sentry.compose.b.a("VoiceTrainingScreen");
                if ((intValue6 & 5121) == 1024) {
                    r rVar8 = (r) abstractC1725n6;
                    if (rVar8.B()) {
                        rVar8.P();
                        return yVar;
                    }
                }
                String v11 = H.v(R.string.voice_training_item_1_title, abstractC1725n6);
                C3288a c3288a = Jd.b.f9088d;
                AbstractC5824b F10 = kotlin.jvm.internal.m.F(R.drawable.lab, abstractC1725n6);
                long j6 = AbstractC5103e.f42774e;
                long j10 = AbstractC5102d.f42765b;
                L4.a.l(v11, c3288a, F10, j6, a12, j10, abstractC1725n6, 560, 16);
                L4.a.l(H.v(R.string.voice_training_item_2_title, abstractC1725n6), Jd.b.f9089e, kotlin.jvm.internal.m.F(R.drawable.voice, abstractC1725n6), AbstractC5103e.f42770a, a12, j10, abstractC1725n6, 560, 16);
                L4.a.l(H.v(R.string.voice_training_item_3_title, abstractC1725n6), R4.b.X(abstractC1725n6, 1851714179, new Jb.c(13, (W0) obj5)), kotlin.jvm.internal.m.F(R.drawable.logout, abstractC1725n6), AbstractC5103e.f42771b, a12, j10, abstractC1725n6, 560, 16);
                return yVar;
        }
    }
}

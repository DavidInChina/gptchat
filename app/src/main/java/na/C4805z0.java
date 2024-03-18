package na;

import E.AbstractC0434s;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.AbstractC1547f0;
import W.AbstractC1607r1;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4323o;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import y.AbstractC6463a;

/* renamed from: na.z0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4805z0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40159Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f40160Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4805z0(int i10, boolean z10) {
        super(2);
        this.f40159Y = i10;
        this.f40160Z = z10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C5953f c5953f;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f40159Y;
        boolean z10 = this.f40160Z;
        switch (i11) {
            case 0:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C4318j c4318j = C4310b.f37697j0;
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(733328855);
                E0.N c10 = AbstractC0434s.c(c4318j, false, rVar2);
                rVar2.W(-1323940314);
                int i12 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(c4323o);
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
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar2, i12, c0581j);
                    }
                    AbstractC6463a.r(0, i13, new Z.L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a5 = io.sentry.compose.b.a("MenuIcon");
                    C5953f c5953f2 = Bi.c.f2430f;
                    if (c5953f2 == null) {
                        float f6 = (float) 24.0d;
                        C5952e c5952e = new C5952e("Menu", f6, f6, 24.0f, 24.0f, 0L, 0, false, 224);
                        r0.N n10 = new r0.N(androidx.compose.ui.graphics.a.b(0));
                        r0.N n11 = new r0.N(androidx.compose.ui.graphics.a.c(4278190080L));
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new v0.n(4.0f, 8.0f));
                        arrayList.add(new v0.m(20.0f, 8.0f));
                        C5952e.b(c5952e, arrayList, 0, n10, n11, 2.0f, 1, 0, 4.0f);
                        r0.N n12 = new r0.N(androidx.compose.ui.graphics.a.b(0));
                        r0.N n13 = new r0.N(androidx.compose.ui.graphics.a.c(4278190080L));
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new v0.n(4.0f, 16.0f));
                        arrayList2.add(new v0.m(14.0f, 16.0f));
                        C5952e.b(c5952e, arrayList2, 0, n12, n13, 2.0f, 1, 0, 4.0f);
                        c5953f2 = c5952e.c();
                        Bi.c.f2430f = c5953f2;
                    }
                    AbstractC1607r1.b(c5953f2, Ng.H.v(R.string.conversation_menu_button, rVar2), a5, 0L, rVar2, 0, 12);
                    rVar2.W(1314311617);
                    if (z10) {
                        AbstractC1547f0.b(AbstractC4768l.f40017A, a5, AbstractC4768l.f40018B, rVar2, 390, 2);
                    }
                    AbstractC6463a.v(rVar2, false, false, true, false);
                    rVar2.t(false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("NewChatSwitcherMenuOption");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                if (z10) {
                    AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.check, abstractC1725n), null, a10, 0L, abstractC1725n, 56, 12);
                    return;
                }
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("NewChatSwitcherMenuOption");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                if (!z10) {
                    AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.check, abstractC1725n), null, a11, 0L, abstractC1725n, 56, 12);
                    return;
                }
                return;
            case 3:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                Z.r rVar6 = (Z.r) abstractC1725n;
                rVar6.W(2081674353);
                if (z10) {
                    j4.b("Some long subtitle text that might be two lines", Bi.c.I1(c4323o, true, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar6.m(q4.f20361a)).f20310k, rVar6, 6, 0, 65532);
                }
                rVar6.t(false);
                j4.b("By some author", Bi.c.I1(c4323o, true, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar6.m(q4.f20361a)).f20310k, rVar6, 6, 0, 65532);
                return;
            default:
                AbstractC4326r a12 = io.sentry.compose.b.a("SettingsTopBar");
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                if (z10) {
                    C5953f c5953f3 = A7.b.f718c;
                    if (c5953f3 == null) {
                        C5952e c5952e2 = new C5952e("AutoMirrored.Filled.VolumeOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i14 = AbstractC5944H.f46870a;
                        r0.N n14 = new r0.N(r0.r.f44254b);
                        Wh.p p11 = R.a.p(0, 16.5f, 12.0f);
                        p11.h(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
                        p11.x(2.21f);
                        p11.o(2.45f, 2.45f);
                        p11.h(0.03f, -0.2f, 0.05f, -0.41f, 0.05f, -0.63f);
                        p11.f();
                        p11.p(19.0f, 12.0f);
                        p11.h(0.0f, 0.94f, -0.2f, 1.82f, -0.54f, 2.64f);
                        p11.o(1.51f, 1.51f);
                        p11.g(20.63f, 14.91f, 21.0f, 13.5f, 21.0f, 12.0f);
                        p11.h(0.0f, -4.28f, -2.99f, -7.86f, -7.0f, -8.77f);
                        p11.x(2.06f);
                        p11.h(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
                        p11.f();
                        p11.p(4.27f, 3.0f);
                        p11.n(3.0f, 4.27f);
                        p11.n(7.73f, 9.0f);
                        p11.n(3.0f, 9.0f);
                        p11.x(6.0f);
                        p11.m(4.0f);
                        p11.o(5.0f, 5.0f);
                        p11.x(-6.73f);
                        p11.o(4.25f, 4.25f);
                        p11.h(-0.67f, 0.52f, -1.42f, 0.93f, -2.25f, 1.18f);
                        p11.x(2.06f);
                        p11.h(1.38f, -0.31f, 2.63f, -0.95f, 3.69f, -1.81f);
                        p11.n(19.73f, 21.0f);
                        p11.n(21.0f, 19.73f);
                        p11.o(-9.0f, -9.0f);
                        p11.n(4.27f, 3.0f);
                        p11.f();
                        p11.p(12.0f, 4.0f);
                        p11.n(9.91f, 6.09f);
                        E9.f.C(p11, 12.0f, 8.18f, 12.0f, 4.0f);
                        C5952e.b(c5952e2, p11.f21239a, 0, n14, null, 1.0f, 0, 2, 1.0f);
                        c5953f3 = c5952e2.c();
                        A7.b.f718c = c5953f3;
                    }
                    c5953f = c5953f3;
                } else if (!z10) {
                    c5953f = Ad.l.f816b;
                    if (c5953f == null) {
                        C5952e c5952e3 = new C5952e("AutoMirrored.Outlined.VolumeUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i15 = AbstractC5944H.f46870a;
                        r0.N n15 = new r0.N(r0.r.f44254b);
                        Wh.p pVar = new Wh.p(0);
                        pVar.p(3.0f, 9.0f);
                        pVar.x(6.0f);
                        pVar.m(4.0f);
                        pVar.o(5.0f, 5.0f);
                        pVar.n(12.0f, 4.0f);
                        E9.f.C(pVar, 7.0f, 9.0f, 3.0f, 9.0f);
                        pVar.p(10.0f, 8.83f);
                        pVar.x(6.34f);
                        pVar.n(7.83f, 13.0f);
                        pVar.n(5.0f, 13.0f);
                        pVar.x(-2.0f);
                        pVar.m(2.83f);
                        pVar.n(10.0f, 8.83f);
                        pVar.f();
                        pVar.p(16.5f, 12.0f);
                        pVar.h(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
                        pVar.x(8.05f);
                        pVar.h(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
                        pVar.f();
                        pVar.p(14.0f, 3.23f);
                        pVar.x(2.06f);
                        pVar.h(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
                        pVar.u(-2.11f, 5.85f, -5.0f, 6.71f);
                        pVar.x(2.06f);
                        pVar.h(4.01f, -0.91f, 7.0f, -4.49f, 7.0f, -8.77f);
                        pVar.h(0.0f, -4.28f, -2.99f, -7.86f, -7.0f, -8.77f);
                        pVar.f();
                        C5952e.b(c5952e3, pVar.f21239a, 0, n15, null, 1.0f, 0, 2, 1.0f);
                        c5953f = c5952e3.c();
                        Ad.l.f816b = c5953f;
                    }
                } else {
                    throw new RuntimeException();
                }
                AbstractC1607r1.b(c5953f, Ng.H.v(R.string.voice_settings_mute_description, abstractC1725n), a12, 0L, abstractC1725n, 0, 12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40159Y) {
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
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}

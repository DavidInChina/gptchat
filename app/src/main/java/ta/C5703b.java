package ta;

import W.AbstractC1607r1;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import cb.C2362c0;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l0.AbstractC4326r;
import pf.AbstractC5163j;
import v0.AbstractC5944H;
import v0.C5937A;
import v0.C5952e;
import v0.C5953f;
import z.AbstractC6696f;
import za.C6783B;

/* renamed from: ta.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5703b extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5703b f45887Z = new C5703b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5703b f45888h0 = new C5703b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C5703b f45889i0 = new C5703b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C5703b f45890j0 = new C5703b(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C5703b f45891k0 = new C5703b(5);

    /* renamed from: l0  reason: collision with root package name */
    public static final C5703b f45892l0 = new C5703b(6);

    /* renamed from: m0  reason: collision with root package name */
    public static final C5703b f45893m0 = new C5703b(7);

    /* renamed from: n0  reason: collision with root package name */
    public static final C5703b f45894n0 = new C5703b(8);

    /* renamed from: o0  reason: collision with root package name */
    public static final C5703b f45895o0 = new C5703b(11);

    /* renamed from: p0  reason: collision with root package name */
    public static final C5703b f45896p0 = new C5703b(12);

    /* renamed from: q0  reason: collision with root package name */
    public static final C5703b f45897q0 = new C5703b(14);

    /* renamed from: r0  reason: collision with root package name */
    public static final C5703b f45898r0 = new C5703b(15);

    /* renamed from: s0  reason: collision with root package name */
    public static final C5703b f45899s0 = new C5703b(16);

    /* renamed from: t0  reason: collision with root package name */
    public static final C5703b f45900t0 = new C5703b(17);

    /* renamed from: u0  reason: collision with root package name */
    public static final C5703b f45901u0 = new C5703b(18);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45902Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5703b(int i10) {
        super(2);
        this.f45902Y = i10;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [pf.j, wf.n] */
    /* JADX WARN: Type inference failed for: r1v8, types: [pf.j, wf.n] */
    public final void a(AbstractC1725n abstractC1725n, int i10) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f45902Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC1734s.e(yVar, new AbstractC5163j(2, null), abstractC1725n);
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.camera, abstractC1725n), Ng.H.v(R.string.conversations_take_photo, abstractC1725n), a5, 0L, abstractC1725n, 8, 12);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC1734s.e(yVar, new AbstractC5163j(2, null), abstractC1725n);
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.image_square, abstractC1725n), Ng.H.v(R.string.conversations_image_button, abstractC1725n), a10, 0L, abstractC1725n, 8, 12);
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.folder, abstractC1725n), Ng.H.v(R.string.conversations_file_button, abstractC1725n), a11, 0L, abstractC1725n, 8, 12);
                return;
            case 3:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.plus_lg, abstractC1725n), Ng.H.v(R.string.conversations_pick_image, abstractC1725n), a12, 0L, abstractC1725n, 8, 12);
                return;
            case 4:
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                AbstractC5719s.a(true, true, true, C5705d.f45908Z, C5706e.f45932Y, C5706e.f45933Z, C5706e.f45934h0, a13, abstractC1725n, 1797558, 128);
                return;
            case 5:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AbstractC4326r a14 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                AbstractC1607r1.b(com.google.android.gms.internal.play_billing.N.a0(), Ng.H.v(R.string.conversation_attachment_retry, abstractC1725n), a14, 0L, abstractC1725n, 0, 12);
                return;
            case 7:
                AbstractC4326r a15 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar8 = (Z.r) abstractC1725n;
                    if (rVar8.B()) {
                        rVar8.P();
                        return;
                    }
                }
                AbstractC1607r1.b(Gi.e.z(), Ng.H.v(R.string.conversation_attachment_remove, abstractC1725n), a15, 0L, abstractC1725n, 0, 12);
                return;
            case 8:
                AbstractC4326r a16 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar9 = (Z.r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                C5953f c5953f = P4.a.f13813d;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Outlined.OpenInFull", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = AbstractC5944H.f46870a;
                    r0.N n10 = new r0.N(r0.r.f44254b);
                    Wh.p pVar = new Wh.p(0);
                    pVar.p(21.0f, 11.0f);
                    pVar.o(0.0f, -8.0f);
                    pVar.o(-8.0f, 0.0f);
                    pVar.o(3.29f, 3.29f);
                    pVar.o(-10.0f, 10.0f);
                    pVar.o(-3.29f, -3.29f);
                    pVar.o(0.0f, 8.0f);
                    pVar.o(8.0f, 0.0f);
                    pVar.o(-3.29f, -3.29f);
                    pVar.o(10.0f, -10.0f);
                    pVar.f();
                    C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    P4.a.f13813d = c5953f;
                }
                AbstractC1607r1.b(c5953f, Ng.H.v(R.string.conversations_conversation_fullscreen, abstractC1725n), a16, 0L, abstractC1725n, 0, 12);
                return;
            case 9:
                AbstractC4326r a17 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar10 = (Z.r) abstractC1725n;
                    if (rVar10.B()) {
                        rVar10.P();
                        return;
                    }
                }
                AbstractC5690F.a(Ad.l.W0(null, abstractC1725n, 31), a17, null, null, null, null, abstractC1725n, 8, 62);
                return;
            case 10:
                AbstractC4326r a18 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar11 = (Z.r) abstractC1725n;
                    if (rVar11.B()) {
                        rVar11.P();
                        return;
                    }
                }
                AbstractC5690F.a(Ad.l.W0(null, abstractC1725n, 31), a18, null, null, null, null, abstractC1725n, 8, 62);
                return;
            case 11:
                AbstractC4326r a19 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar12 = (Z.r) abstractC1725n;
                    if (rVar12.B()) {
                        rVar12.P();
                        return;
                    }
                }
                C5953f c5953f2 = Df.H.f3635b;
                if (c5953f2 == null) {
                    C5952e c5952e2 = new C5952e("Outlined.CloseFullscreen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = AbstractC5944H.f46870a;
                    r0.N n11 = new r0.N(r0.r.f44254b);
                    Wh.p pVar2 = new Wh.p(0);
                    pVar2.p(22.0f, 3.41f);
                    pVar2.o(-5.29f, 5.29f);
                    pVar2.n(20.0f, 12.0f);
                    pVar2.m(-8.0f);
                    pVar2.w(4.0f);
                    pVar2.o(3.29f, 3.29f);
                    E9.f.C(pVar2, 20.59f, 2.0f, 22.0f, 3.41f);
                    pVar2.p(3.41f, 22.0f);
                    pVar2.o(5.29f, -5.29f);
                    pVar2.n(12.0f, 20.0f);
                    pVar2.x(-8.0f);
                    pVar2.l(4.0f);
                    pVar2.o(3.29f, 3.29f);
                    E9.f.C(pVar2, 2.0f, 20.59f, 3.41f, 22.0f);
                    C5952e.b(c5952e2, pVar2.f21239a, 0, n11, null, 1.0f, 0, 2, 1.0f);
                    c5953f2 = c5952e2.c();
                    Df.H.f3635b = c5953f2;
                }
                AbstractC1607r1.b(c5953f2, Ng.H.v(R.string.conversations_conversation_fullscreen, abstractC1725n), a19, 0L, abstractC1725n, 0, 12);
                return;
            case 12:
                AbstractC4326r a20 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar13 = (Z.r) abstractC1725n;
                    if (rVar13.B()) {
                        rVar13.P();
                        return;
                    }
                }
                C5953f c5953f3 = R4.b.f15046g;
                if (c5953f3 == null) {
                    float f6 = (float) 24.0d;
                    C5952e c5952e3 = new C5952e("ArrowUp", f6, f6, 24.0f, 24.0f, 0L, 0, false, 224);
                    r0.N n12 = new r0.N(androidx.compose.ui.graphics.a.b(0));
                    r0.N n13 = new r0.N(androidx.compose.ui.graphics.a.c(4278190080L));
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new v0.n(5.0f, 11.0f));
                    arrayList.add(new v0.m(12.0f, 4.0f));
                    arrayList.add(new v0.m(19.0f, 11.0f));
                    arrayList.add(new v0.n(12.0f, 20.0f));
                    arrayList.add(new C5937A(5.0f));
                    C5952e.b(c5952e3, arrayList, 0, n12, n13, 2.0f, 1, 1, 4.0f);
                    c5953f3 = c5952e3.c();
                    R4.b.f15046g = c5953f3;
                }
                AbstractC1607r1.b(c5953f3, Ng.H.v(R.string.conversations_conversation_send, abstractC1725n), a20, 0L, abstractC1725n, 0, 12);
                return;
            default:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar14 = (Z.r) abstractC1725n;
                    if (rVar14.B()) {
                        rVar14.P();
                        return;
                    }
                }
                Bi.c.A(new T0.z("Hello World", 0L, 6), C5705d.f45909h0, true, C5706e.f45935i0, C5706e.f45936j0, abstractC1725n, 28086);
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f45902Y) {
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
            case 11:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 12:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 13:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 14:
                long j6 = ((Z0.k) obj).f22804a;
                long j10 = ((Z0.k) obj2).f22804a;
                return AbstractC6696f.u(0.0f, 0.0f, null, 7);
            case 15:
                C6783B c6783b = (C6783B) obj;
                J9.d dVar = (J9.d) obj2;
                AbstractC3557B.c0("$this$setOnEach", c6783b);
                AbstractC3557B.c0("it", dVar);
                return C6783B.e(c6783b, null, dVar, null, null, null, null, null, null, null, null, null, 131069);
            case 16:
                C6783B c6783b2 = (C6783B) obj;
                J9.b bVar = (J9.b) obj2;
                AbstractC3557B.c0("$this$setOnEach", c6783b2);
                AbstractC3557B.c0("it", bVar);
                return C6783B.e(c6783b2, null, null, bVar, null, null, null, null, null, null, null, null, 131067);
            case 17:
                C6783B c6783b3 = (C6783B) obj;
                C2362c0 c2362c0 = (C2362c0) obj2;
                AbstractC3557B.c0("$this$setOnEach", c6783b3);
                AbstractC3557B.c0("it", c2362c0);
                return C6783B.e(c6783b3, null, null, null, null, null, null, null, c2362c0.f26510a, null, null, null, 130815);
            default:
                C6783B c6783b4 = (C6783B) obj;
                List list = (List) obj2;
                AbstractC3557B.c0("$this$setOnEach", c6783b4);
                AbstractC3557B.c0("it", list);
                return C6783B.e(c6783b4, null, null, null, null, null, list, null, null, null, null, null, 131039);
        }
    }
}

package fc;

import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.Map;
import l0.AbstractC4326r;
import mc.C4616c;
import r0.N;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;

/* renamed from: fc.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3008c extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3008c f30162Z = new C3008c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3008c f30163h0 = new C3008c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3008c f30164i0 = new C3008c(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C3008c f30165j0 = new C3008c(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C3008c f30166k0 = new C3008c(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C3008c f30167l0 = new C3008c(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C3008c f30168m0 = new C3008c(6);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30169Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3008c(int i10) {
        super(2);
        this.f30169Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f30169Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.settings_developer_disclosure, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
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
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.file_document, abstractC1725n), null, a10, 0L, abstractC1725n, 56, 12);
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
                j4.b(Ng.H.v(R.string.settings_developer_custom_instructions_introduction, abstractC1725n), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
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
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.file_document, abstractC1725n), null, a12, 0L, abstractC1725n, 56, 12);
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
                j4.b(Ng.H.v(R.string.settings_developer_upsell, abstractC1725n), a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC4326r a14 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                C5953f c5953f = R4.b.f15044e;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Outlined.Paid", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = AbstractC5944H.f46870a;
                    N n10 = new N(r0.r.f44254b);
                    Wh.p p10 = R.a.p(0, 12.0f, 2.0f);
                    p10.g(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    p10.u(4.48f, 10.0f, 10.0f, 10.0f);
                    p10.u(10.0f, -4.48f, 10.0f, -10.0f);
                    p10.t(17.52f, 2.0f, 12.0f, 2.0f);
                    p10.f();
                    p10.p(12.0f, 20.0f);
                    p10.h(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
                    p10.h(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
                    p10.u(8.0f, 3.59f, 8.0f, 8.0f);
                    p10.g(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f);
                    p10.f();
                    p10.p(12.89f, 11.1f);
                    p10.h(-1.78f, -0.59f, -2.64f, -0.96f, -2.64f, -1.9f);
                    p10.h(0.0f, -1.02f, 1.11f, -1.39f, 1.81f, -1.39f);
                    p10.h(1.31f, 0.0f, 1.79f, 0.99f, 1.9f, 1.34f);
                    p10.o(1.58f, -0.67f);
                    p10.h(-0.15f, -0.44f, -0.82f, -1.91f, -2.66f, -2.23f);
                    p10.w(5.0f);
                    p10.m(-1.75f);
                    p10.x(1.26f);
                    p10.h(-2.6f, 0.56f, -2.62f, 2.85f, -2.62f, 2.96f);
                    p10.h(0.0f, 2.27f, 2.25f, 2.91f, 3.35f, 3.31f);
                    p10.h(1.58f, 0.56f, 2.28f, 1.07f, 2.28f, 2.03f);
                    p10.h(0.0f, 1.13f, -1.05f, 1.61f, -1.98f, 1.61f);
                    p10.h(-1.82f, 0.0f, -2.34f, -1.87f, -2.4f, -2.09f);
                    p10.n(8.1f, 14.75f);
                    p10.h(0.63f, 2.19f, 2.28f, 2.78f, 3.02f, 2.96f);
                    p10.w(19.0f);
                    p10.m(1.75f);
                    p10.x(-1.24f);
                    p10.h(0.52f, -0.09f, 3.02f, -0.59f, 3.02f, -3.22f);
                    p10.g(15.9f, 13.15f, 15.29f, 11.93f, 12.89f, 11.1f);
                    p10.f();
                    C5952e.b(c5952e, p10.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    R4.b.f15044e = c5953f;
                }
                AbstractC1607r1.b(c5953f, null, a14, 0L, abstractC1725n, 48, 12);
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f30169Y) {
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
            default:
                y yVar2 = (y) obj;
                C4616c c4616c = (C4616c) obj2;
                AbstractC3557B.c0("$this$setOnEach", yVar2);
                AbstractC3557B.c0("it", c4616c);
                Map map = yVar2.f30239c;
                AbstractC3557B.c0("hapticEffectsSupported", map);
                return new y(c4616c, yVar2.f30238b, map);
        }
    }
}

package pc;

import E.AbstractC0441z;
import E.q0;
import W.P0;
import W.R0;
import W.j4;
import Z.AbstractC1725n;
import Z.m1;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;

/* renamed from: pc.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5123b extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5123b f42960Z = new C5123b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5123b f42961h0 = new C5123b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C5123b f42962i0 = new C5123b(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f42963Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5123b(int i10) {
        super(3);
        this.f42963Y = i10;
    }

    public final void a(q0 q0Var, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f42963Y) {
            case 0:
                AbstractC3557B.c0("$this$TextButton", q0Var);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.subscriptions_restore_subscription_cta, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 130558);
                return;
            default:
                AbstractC3557B.c0("$this$TextButton", q0Var);
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.subscriptions_manage_subscription_cta, abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 130558);
                return;
        }
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f42963Y) {
            case 0:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$ScrollableContentScreen", (AbstractC0441z) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                C3288a c3288a = AbstractC5124c.f42968e;
                C5953f c5953f = U3.f.f17403b;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Outlined.ElectricBolt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i10 = AbstractC5944H.f46870a;
                    r0.N n10 = new r0.N(r0.r.f44254b);
                    Wh.p pVar = new Wh.p(0);
                    pVar.p(14.69f, 2.21f);
                    pVar.n(4.33f, 11.49f);
                    pVar.h(-0.64f, 0.58f, -0.28f, 1.65f, 0.58f, 1.73f);
                    pVar.n(13.0f, 14.0f);
                    pVar.o(-4.85f, 6.76f);
                    pVar.h(-0.22f, 0.31f, -0.19f, 0.74f, 0.08f, 1.01f);
                    pVar.m(0.0f);
                    pVar.h(0.3f, 0.3f, 0.77f, 0.31f, 1.08f, 0.02f);
                    pVar.o(10.36f, -9.28f);
                    pVar.h(0.64f, -0.58f, 0.28f, -1.65f, -0.58f, -1.73f);
                    pVar.n(11.0f, 10.0f);
                    pVar.o(4.85f, -6.76f);
                    pVar.h(0.22f, -0.31f, 0.19f, -0.74f, -0.08f, -1.01f);
                    pVar.o(0.0f, 0.0f);
                    pVar.g(15.47f, 1.93f, 15.0f, 1.92f, 14.69f, 2.21f);
                    pVar.f();
                    C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    U3.f.f17403b = c5953f;
                }
                C5953f c5953f2 = c5953f;
                m1 m1Var = R0.f19593a;
                Z.r rVar2 = (Z.r) abstractC1725n;
                L4.a.n(R.string.subscriptions_premium_title, c3288a, c5953f2, ((P0) rVar2.m(m1Var)).f19515a, a5, abstractC1725n, 48, 16);
                C3288a c3288a2 = AbstractC5124c.f42969f;
                C5953f c5953f3 = Ad.l.f820f;
                if (c5953f3 == null) {
                    C5952e c5952e2 = new C5952e("Outlined.Whatshot", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = AbstractC5944H.f46870a;
                    r0.N n11 = new r0.N(r0.r.f44254b);
                    Wh.p p10 = R.a.p(0, 11.57f, 13.16f);
                    p10.h(-1.36f, 0.28f, -2.17f, 1.16f, -2.17f, 2.41f);
                    p10.h(0.0f, 1.34f, 1.11f, 2.42f, 2.49f, 2.42f);
                    p10.h(2.05f, 0.0f, 3.71f, -1.66f, 3.71f, -3.71f);
                    p10.h(0.0f, -1.07f, -0.15f, -2.12f, -0.46f, -3.12f);
                    p10.h(-0.79f, 1.07f, -2.2f, 1.72f, -3.57f, 2.0f);
                    p10.f();
                    p10.p(13.5f, 0.67f);
                    p10.u(0.74f, 2.65f, 0.74f, 4.8f);
                    p10.h(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f);
                    p10.h(-2.07f, 0.0f, -3.63f, -1.67f, -3.63f, -3.73f);
                    p10.o(0.03f, -0.36f);
                    p10.g(5.21f, 7.51f, 4.0f, 10.62f, 4.0f, 14.0f);
                    p10.h(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
                    p10.u(8.0f, -3.58f, 8.0f, -8.0f);
                    p10.g(20.0f, 8.61f, 17.41f, 3.8f, 13.5f, 0.67f);
                    p10.f();
                    p10.p(12.0f, 20.0f);
                    p10.h(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
                    p10.h(0.0f, -1.53f, 0.3f, -3.04f, 0.86f, -4.43f);
                    p10.h(1.01f, 1.01f, 2.41f, 1.63f, 3.97f, 1.63f);
                    p10.h(2.66f, 0.0f, 4.75f, -1.83f, 5.28f, -4.43f);
                    p10.g(17.34f, 8.97f, 18.0f, 11.44f, 18.0f, 14.0f);
                    p10.h(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
                    p10.f();
                    C5952e.b(c5952e2, p10.f21239a, 0, n11, null, 1.0f, 0, 2, 1.0f);
                    c5953f3 = c5952e2.c();
                    Ad.l.f820f = c5953f3;
                }
                L4.a.n(R.string.subscriptions_priority_title, c3288a2, c5953f3, ((P0) rVar2.m(m1Var)).f19522f, a5, abstractC1725n, 48, 16);
                C3288a c3288a3 = AbstractC5124c.f42970g;
                C5953f c5953f4 = L4.a.f10740f;
                if (c5953f4 == null) {
                    C5952e c5952e3 = new C5952e("Filled.Speed", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = AbstractC5944H.f46870a;
                    r0.N n12 = new r0.N(r0.r.f44254b);
                    Wh.p pVar2 = new Wh.p(0);
                    pVar2.p(20.38f, 8.57f);
                    pVar2.o(-1.23f, 1.85f);
                    pVar2.d(8.0f, 8.0f, true, -0.22f, 7.58f);
                    pVar2.n(5.07f, 18.0f);
                    pVar2.c(8.0f, 8.0f, true, 15.58f, 6.85f);
                    pVar2.o(1.85f, -1.23f);
                    pVar2.c(10.0f, 10.0f, false, 3.35f, 19.0f);
                    pVar2.d(2.0f, 2.0f, false, 1.72f, 1.0f);
                    pVar2.m(13.85f);
                    pVar2.d(2.0f, 2.0f, false, 1.74f, -1.0f);
                    pVar2.d(10.0f, 10.0f, false, -0.27f, -10.44f);
                    pVar2.f();
                    pVar2.p(10.59f, 15.41f);
                    pVar2.d(2.0f, 2.0f, false, 2.83f, 0.0f);
                    pVar2.o(5.66f, -8.49f);
                    pVar2.o(-8.49f, 5.66f);
                    pVar2.d(2.0f, 2.0f, false, 0.0f, 2.83f);
                    pVar2.f();
                    C5952e.b(c5952e3, pVar2.f21239a, 0, n12, null, 1.0f, 0, 2, 1.0f);
                    c5953f4 = c5952e3.c();
                    L4.a.f10740f = c5953f4;
                }
                L4.a.n(R.string.subscriptions_fast_title, c3288a3, c5953f4, ((P0) rVar2.m(m1Var)).f19515a, a5, abstractC1725n, 48, 16);
                return yVar;
        }
    }
}

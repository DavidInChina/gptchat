package hc;

import E.q0;
import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;

/* renamed from: hc.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3387b extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3387b f32186Z = new C3387b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3387b f32187h0 = new C3387b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3387b f32188i0 = new C3387b(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32189Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3387b(int i10) {
        super(3);
        this.f32189Y = i10;
    }

    public final void a(q0 q0Var, AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f32189Y) {
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
                j4.b(Ng.H.v(R.string.custom_instructions_save, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 1:
                AbstractC3557B.c0("$this$TextButton", q0Var);
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                C5953f c5953f = AbstractC3557B.f33080c;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Outlined.RemoveRedEye", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = AbstractC5944H.f46870a;
                    r0.N n10 = new r0.N(r0.r.f44254b);
                    Wh.p p10 = R.a.p(0, 12.0f, 6.5f);
                    p10.h(3.79f, 0.0f, 7.17f, 2.13f, 8.82f, 5.5f);
                    p10.h(-1.65f, 3.37f, -5.02f, 5.5f, -8.82f, 5.5f);
                    p10.t(4.83f, 15.37f, 3.18f, 12.0f);
                    p10.g(4.83f, 8.63f, 8.21f, 6.5f, 12.0f, 6.5f);
                    p10.q(0.0f, -2.0f);
                    p10.g(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f);
                    p10.h(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
                    p10.u(9.27f, -3.11f, 11.0f, -7.5f);
                    p10.h(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
                    p10.f();
                    p10.p(12.0f, 9.5f);
                    p10.h(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
                    p10.u(-1.12f, 2.5f, -2.5f, 2.5f);
                    p10.u(-2.5f, -1.12f, -2.5f, -2.5f);
                    p10.u(1.12f, -2.5f, 2.5f, -2.5f);
                    p10.q(0.0f, -2.0f);
                    p10.h(-2.48f, 0.0f, -4.5f, 2.02f, -4.5f, 4.5f);
                    p10.u(2.02f, 4.5f, 4.5f, 4.5f);
                    p10.u(4.5f, -2.02f, 4.5f, -4.5f);
                    p10.u(-2.02f, -4.5f, -4.5f, -4.5f);
                    p10.f();
                    C5952e.b(c5952e, p10.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    AbstractC3557B.f33080c = c5953f;
                }
                AbstractC1607r1.b(c5953f, null, a10, 0L, abstractC1725n, 48, 12);
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, p9.r.f42840d), abstractC1725n);
                j4.b(Ng.H.v(R.string.custom_instructions_show_tips, abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC3557B.c0("$this$TextButton", q0Var);
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(17039370, abstractC1725n), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f32189Y) {
            case 0:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}

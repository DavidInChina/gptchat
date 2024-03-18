package Jb;

import E.AbstractC0441z;
import E.q0;
import Ng.H;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final e f8978Z = new e(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final e f8979h0 = new e(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final e f8980i0 = new e(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final e f8981j0 = new e(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final e f8982k0 = new e(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final e f8983l0 = new e(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final e f8984m0 = new e(6);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8985Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(3);
        this.f8985Y = i10;
    }

    public final void a(AbstractC0441z abstractC0441z, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f8985Y) {
            case 0:
                AbstractC3557B.c0("$this$null", abstractC0441z);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                    return;
                }
                return;
            default:
                AbstractC3557B.c0("$this$BaseOnboardingScreen", abstractC0441z);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                j4.b("More Onboarding Content", a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 6, 0, 131070);
                return;
        }
    }

    public final void c(q0 q0Var, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f8985Y) {
            case 1:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b("Footer Button", a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 6, 0, 131070);
                return;
            case 2:
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
                j4.b(H.v(R.string.onboarding_verify_phone_resend_code, abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 3:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.onboarding_button_continue, abstractC1725n), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 4:
                AbstractC3557B.c0("$this$TextButton", q0Var);
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.onboarding_open_mail, abstractC1725n), a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 5:
                AbstractC3557B.c0("$this$TextButton", q0Var);
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.onboarding_resend_email, abstractC1725n), a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8985Y) {
            case 0:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                c((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 2:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 3:
                c((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 4:
                c((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 5:
                c((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                c((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}

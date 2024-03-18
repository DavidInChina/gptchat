package ab;

import E.q0;
import F.AbstractC0528b;
import Ng.H;
import W.P0;
import W.R0;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import l0.AbstractC4326r;

/* renamed from: ab.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1949c extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1949c f24078Z = new C1949c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1949c f24079h0 = new C1949c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C1949c f24080i0 = new C1949c(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24081Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1949c(int i10) {
        super(3);
        this.f24081Y = i10;
    }

    public final void a(q0 q0Var, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f24081Y) {
            case 0:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.gizmos_accounts_logged_out, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
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
                j4.b(H.v(R.string.gizmo_privacy_policy_link, abstractC1725n), a10, ((P0) ((Z.r) abstractC1725n).m(R0.f19593a)).f19526j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131066);
                return;
        }
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f24081Y) {
            case 0:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$item", (AbstractC0528b) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                K8.d.l0(a5, abstractC1725n, 0, 1);
                return yVar;
            default:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}

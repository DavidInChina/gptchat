package fc;

import F.AbstractC0528b;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import l0.AbstractC4326r;

/* renamed from: fc.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3007b extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3007b f30158Z = new C3007b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3007b f30159h0 = new C3007b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3007b f30160i0 = new C3007b(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30161Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3007b(int i10) {
        super(3);
        this.f30161Y = i10;
    }

    public final void a(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f30161Y) {
            case 0:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Bi.c.o(Ng.H.v(R.string.settings_developer_server_status, abstractC1725n), a5, 0L, abstractC1725n, 0, 6);
                return;
            case 1:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                Bi.c.o(Ng.H.v(R.string.settings_developer_simulate_errors, abstractC1725n), a10, 0L, abstractC1725n, 0, 6);
                return;
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Bi.c.o(Ng.H.v(R.string.settings_haptic_feedback, abstractC1725n), a11, 0L, abstractC1725n, 0, 6);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f30161Y) {
            case 0:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}

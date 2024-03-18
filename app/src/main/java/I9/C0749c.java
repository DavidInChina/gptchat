package I9;

import F.AbstractC0528b;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: I9.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749c extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0749c f8304Z = new C0749c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0749c f8305h0 = new C0749c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0749c f8306i0 = new C0749c(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C0749c f8307j0 = new C0749c(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C0749c f8308k0 = new C0749c(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C0749c f8309l0 = new C0749c(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C0749c f8310m0 = new C0749c(6);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8311Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0749c(int i10) {
        super(3);
        this.f8311Y = i10;
    }

    public final void a(E.q0 q0Var, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f8311Y) {
            case 5:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.conversations_history_enable, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.conversations_start_new_chat, abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    public final void c(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f8311Y) {
            case 0:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42840d), abstractC1725n);
                return;
            case 1:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42840d), abstractC1725n);
                return;
            case 2:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42843g), abstractC1725n);
                return;
            case 3:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                A7.b.C(a5, abstractC1725n, 0, 1);
                return;
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar4 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42843g), abstractC1725n);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8311Y) {
            case 0:
                c((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                c((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 2:
                c((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 3:
                c((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 4:
                c((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 5:
                a((E.q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((E.q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}

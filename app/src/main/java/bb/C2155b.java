package bb;

import E.AbstractC0441z;
import F.AbstractC0528b;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: bb.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2155b extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2155b f25778Z = new C2155b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2155b f25779h0 = new C2155b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2155b f25780i0 = new C2155b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C2155b f25781j0 = new C2155b(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C2155b f25782k0 = new C2155b(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C2155b f25783l0 = new C2155b(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C2155b f25784m0 = new C2155b(6);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25785Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2155b(int i10) {
        super(3);
        this.f25785Y = i10;
    }

    public final void a(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f25785Y) {
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
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42840d), abstractC1725n);
                Bi.c.o(Ng.H.v(R.string.gizmo_starter_prompts, abstractC1725n), a5, 0L, abstractC1725n, 0, 6);
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
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42840d), abstractC1725n);
                Bi.c.o(Ng.H.v(R.string.gizmo_details_ratings, abstractC1725n), a10, 0L, abstractC1725n, 0, 6);
                return;
            case 2:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42840d), abstractC1725n);
                Bi.c.o(Ng.H.v(R.string.conversation_details_capabilities, abstractC1725n), a11, 0L, abstractC1725n, 0, 6);
                return;
            case 3:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42843g), abstractC1725n);
                return;
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                L4.a.u(androidx.compose.foundation.layout.a.v(c4323o, p9.r.f42843g, 0.0f, 0.0f, 0.0f, 14), 0.0f, false, abstractC1725n, 0, 6);
                return;
        }
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4323o c4323o = C4323o.f37719b;
        jf.y yVar = jf.y.f36177a;
        switch (this.f25785Y) {
            case 0:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 2:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 3:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 4:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$Button", (E.q0) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                j4.b(Ng.H.v(R.string.gizmo_start_conversation, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return yVar;
            case 5:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$Card", (AbstractC0441z) obj);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue2 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                L4.a.u(androidx.compose.foundation.layout.a.r(c4323o, p9.r.f42840d), 0.0f, false, abstractC1725n2, 0, 6);
                return yVar;
        }
    }
}

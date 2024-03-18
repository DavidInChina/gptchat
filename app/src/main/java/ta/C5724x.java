package ta;

import E.AbstractC0441z;
import F.AbstractC0539m;
import Z.AbstractC1725n;
import id.AbstractC3557B;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4323o;
import na.C4751f0;

/* renamed from: ta.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5724x extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46021Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f46022Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f46023h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5724x(List list, wf.k kVar, int i10) {
        super(3);
        this.f46021Y = i10;
        this.f46022Z = list;
        this.f46023h0 = kVar;
    }

    public final void a(AbstractC0441z abstractC0441z, AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f46021Y;
        List list = this.f46022Z;
        wf.k kVar = this.f46023h0;
        switch (i11) {
            case 0:
                AbstractC3557B.c0("$this$Card", abstractC0441z);
                AbstractC4326r a5 = io.sentry.compose.b.a("InputGizmoActionsView");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC0539m.a(a5, null, null, false, null, null, null, false, new C4751f0(list, kVar, 5), abstractC1725n, 0, 255);
                return;
            default:
                AbstractC3557B.c0("$this$Card", abstractC0441z);
                AbstractC4326r a10 = io.sentry.compose.b.a("InputGizmoMentionsView");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC0539m.a(a10, null, null, false, null, null, null, false, new C4751f0(list, kVar, 7), abstractC1725n, 0, 255);
                return;
        }
    }

    public final void c(y.L l10, AbstractC1725n abstractC1725n) {
        C4323o c4323o = C4323o.f37719b;
        int i10 = this.f46021Y;
        wf.k kVar = this.f46023h0;
        List list = this.f46022Z;
        switch (i10) {
            case 1:
                AbstractC3557B.c0("$this$AnimatedVisibility", l10);
                L0.u uVar = io.sentry.compose.b.f34309a;
                M3.H.b(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(androidx.compose.foundation.layout.e.g(c4323o, 0.0f, AbstractC5685A.f45802a, 1), 1.0f), p9.r.f42841e, 0.0f, 2), null, null, null, null, R4.b.X(abstractC1725n, 91659576, new C5724x(list, kVar, 0)), abstractC1725n, 196608, 30);
                return;
            default:
                AbstractC3557B.c0("$this$AnimatedVisibility", l10);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                M3.H.b(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(androidx.compose.foundation.layout.e.g(c4323o, 0.0f, AbstractC5685A.f45802a, 1), 1.0f), p9.r.f42841e, 0.0f, 2), null, null, null, null, R4.b.X(abstractC1725n, -1823534420, new C5724x(list, kVar, 2)), abstractC1725n, 196608, 30);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f46021Y) {
            case 0:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                ((Number) obj3).intValue();
                c((y.L) obj, (AbstractC1725n) obj2);
                return yVar;
            case 2:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                ((Number) obj3).intValue();
                c((y.L) obj, (AbstractC1725n) obj2);
                return yVar;
        }
    }
}

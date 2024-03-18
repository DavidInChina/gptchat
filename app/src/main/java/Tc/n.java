package Tc;

import E.AbstractC0441z;
import Z.AbstractC1725n;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Z  reason: collision with root package name */
    public static final n f17095Z = new n(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final n f17096h0 = new n(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17097Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10) {
        super(5);
        this.f17097Y = i10;
    }

    public final void a(AbstractC0441z abstractC0441z, Ad.s sVar, wf.k kVar, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f17097Y) {
            case 0:
                AbstractC3557B.c0("$this$null", abstractC0441z);
                AbstractC3557B.c0("$anonymous$parameter$0$", sVar);
                AbstractC3557B.c0("$anonymous$parameter$1$", kVar);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 5121) == 1024) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                    return;
                }
                return;
            default:
                AbstractC3557B.c0("$this$null", abstractC0441z);
                AbstractC3557B.c0("$anonymous$parameter$0$", sVar);
                AbstractC3557B.c0("$anonymous$parameter$1$", kVar);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 5121) == 1024) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // wf.q
    public final /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f17097Y) {
            case 0:
                a((AbstractC0441z) obj, (Ad.s) obj2, (wf.k) obj3, (AbstractC1725n) obj4, num.intValue());
                return yVar;
            default:
                a((AbstractC0441z) obj, (Ad.s) obj2, (wf.k) obj3, (AbstractC1725n) obj4, num.intValue());
                return yVar;
        }
    }
}

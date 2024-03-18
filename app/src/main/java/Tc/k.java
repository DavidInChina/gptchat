package Tc;

import Z.AbstractC1725n;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Z  reason: collision with root package name */
    public static final k f17081Z = new k(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final k f17082h0 = new k(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final k f17083i0 = new k(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final k f17084j0 = new k(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17085Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10) {
        super(4);
        this.f17085Y = i10;
    }

    public final void a(Ad.s sVar, wf.k kVar, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f17085Y) {
            case 0:
                AbstractC3557B.c0("$anonymous$parameter$0$", sVar);
                AbstractC3557B.c0("$anonymous$parameter$1$", kVar);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 641) == 128) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AbstractC3557B.c0("$anonymous$parameter$0$", sVar);
                AbstractC3557B.c0("$anonymous$parameter$1$", kVar);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 641) == 128) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AbstractC3557B.c0("$anonymous$parameter$0$", sVar);
                AbstractC3557B.c0("$anonymous$parameter$1$", kVar);
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 641) == 128) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                    return;
                }
                return;
            default:
                AbstractC3557B.c0("$anonymous$parameter$0$", sVar);
                AbstractC3557B.c0("$anonymous$parameter$1$", kVar);
                L0.u uVar4 = io.sentry.compose.b.f34309a;
                if ((i10 & 641) == 128) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // wf.p
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f17085Y) {
            case 0:
                a((Ad.s) obj, (wf.k) obj2, (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 1:
                a((Ad.s) obj, (wf.k) obj2, (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            case 2:
                a((Ad.s) obj, (wf.k) obj2, (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            default:
                a((Ad.s) obj, (wf.k) obj2, (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
        }
    }
}

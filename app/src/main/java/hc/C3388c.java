package hc;

import A.AbstractC0044t0;
import Z.AbstractC1725n;
import Z.C1723m;
import l0.AbstractC4326r;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: hc.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3388c extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32190Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f32191Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3388c(int i10, wf.k kVar) {
        super(2);
        this.f32190Y = i10;
        this.f32191Z = kVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        io.sentry.hints.i iVar = C1723m.f22654Y;
        int i11 = this.f32190Y;
        wf.k kVar = this.f32191Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(2076927636);
                boolean g10 = rVar2.g(kVar);
                Object K10 = rVar2.K();
                if (g10 || K10 == iVar) {
                    K10 = AbstractC6463a.o(19, kVar, rVar2);
                }
                rVar2.t(false);
                R4.b.o((AbstractC6216a) K10, a5, false, null, null, AbstractC3392g.f32196b, rVar2, 196608, 30);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("AssistantNotificationDialog");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(-520336981);
                boolean g11 = rVar4.g(kVar);
                Object K11 = rVar4.K();
                if (g11 || K11 == iVar) {
                    K11 = AbstractC0044t0.z(18, kVar, rVar4);
                }
                rVar4.t(false);
                Ng.H.f((AbstractC6216a) K11, a10, false, null, null, null, null, null, null, Fd.y.f5293a, rVar4, 805306368, 510);
                return;
            default:
                AbstractC4326r a11 = io.sentry.compose.b.a("AssistantNotificationDialog");
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                Z.r rVar6 = (Z.r) abstractC1725n;
                rVar6.W(-520336577);
                boolean g12 = rVar6.g(kVar);
                Object K12 = rVar6.K();
                if (g12 || K12 == iVar) {
                    K12 = AbstractC0044t0.z(19, kVar, rVar6);
                }
                rVar6.t(false);
                Ng.H.f((AbstractC6216a) K12, a11, false, null, null, null, null, null, null, Fd.y.f5294b, rVar6, 805306368, 510);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f32190Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}

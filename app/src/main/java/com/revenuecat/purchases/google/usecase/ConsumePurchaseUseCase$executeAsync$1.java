package com.revenuecat.purchases.google.usecase;

import K4.AbstractC0815c;
import K4.C0813a;
import K4.C0816d;
import K4.C0822j;
import K4.F;
import K4.G;
import K4.H;
import K4.y;
import U3.u;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;
import z1.RunnableC6742a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LK4/c;", "Ljf/y;", "invoke", "(LK4/c;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ConsumePurchaseUseCase$executeAsync$1 extends o implements k {
    final /* synthetic */ ConsumePurchaseUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumePurchaseUseCase$executeAsync$1(ConsumePurchaseUseCase consumePurchaseUseCase) {
        super(1);
        this.this$0 = consumePurchaseUseCase;
    }

    public final void invoke(AbstractC0815c abstractC0815c) {
        ConsumePurchaseUseCaseParams consumePurchaseUseCaseParams;
        AbstractC3557B.c0("$this$invoke", abstractC0815c);
        consumePurchaseUseCaseParams = this.this$0.useCaseParams;
        String purchaseToken = consumePurchaseUseCaseParams.getPurchaseToken();
        if (purchaseToken != null) {
            C0813a c0813a = new C0813a(1);
            c0813a.f9398Z = purchaseToken;
            a aVar = new a(this.this$0);
            C0816d c0816d = (C0816d) abstractC0815c;
            if (!c0816d.c()) {
                G g10 = c0816d.f9404f;
                C0822j c0822j = H.f9361j;
                ((u) g10).S(F.b(2, 4, c0822j));
                aVar.d(c0822j, c0813a.c());
                return;
            } else if (c0816d.j(new y(c0816d, c0813a, aVar, 0), 30000L, new RunnableC6742a(c0816d, aVar, c0813a), c0816d.f()) != null) {
                return;
            } else {
                C0822j h10 = c0816d.h();
                ((u) c0816d.f9404f).S(F.b(25, 4, h10));
                aVar.d(h10, c0813a.c());
                return;
            }
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC0815c) obj);
        return jf.y.f36177a;
    }
}

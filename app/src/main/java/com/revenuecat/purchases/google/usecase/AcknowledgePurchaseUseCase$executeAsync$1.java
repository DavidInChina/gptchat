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
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import q.RunnableC5216j;
import wf.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LK4/c;", "Ljf/y;", "invoke", "(LK4/c;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AcknowledgePurchaseUseCase$executeAsync$1 extends o implements k {
    final /* synthetic */ AcknowledgePurchaseUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcknowledgePurchaseUseCase$executeAsync$1(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase) {
        super(1);
        this.this$0 = acknowledgePurchaseUseCase;
    }

    public static final void invoke$lambda$0(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase, C0822j c0822j) {
        AcknowledgePurchaseUseCaseParams acknowledgePurchaseUseCaseParams;
        AbstractC3557B.c0("this$0", acknowledgePurchaseUseCase);
        AbstractC3557B.c0("billingResult", c0822j);
        acknowledgePurchaseUseCaseParams = acknowledgePurchaseUseCase.useCaseParams;
        BillingClientUseCase.processResult$default(acknowledgePurchaseUseCase, c0822j, acknowledgePurchaseUseCaseParams.getPurchaseToken(), null, null, 12, null);
    }

    public final void invoke(AbstractC0815c abstractC0815c) {
        AcknowledgePurchaseUseCaseParams acknowledgePurchaseUseCaseParams;
        AbstractC3557B.c0("$this$invoke", abstractC0815c);
        acknowledgePurchaseUseCaseParams = this.this$0.useCaseParams;
        String purchaseToken = acknowledgePurchaseUseCaseParams.getPurchaseToken();
        if (purchaseToken != null) {
            C0813a c0813a = new C0813a(0);
            c0813a.f9398Z = purchaseToken;
            a aVar = new a(this.this$0);
            C0816d c0816d = (C0816d) abstractC0815c;
            if (!c0816d.c()) {
                G g10 = c0816d.f9404f;
                C0822j c0822j = H.f9361j;
                ((u) g10).S(F.b(2, 3, c0822j));
                aVar.c(c0822j);
                return;
            } else if (TextUtils.isEmpty(c0813a.c())) {
                AbstractC2468q.e("BillingClient", "Please provide a valid purchase token.");
                G g11 = c0816d.f9404f;
                C0822j c0822j2 = H.f9358g;
                ((u) g11).S(F.b(26, 3, c0822j2));
                aVar.c(c0822j2);
                return;
            } else if (!c0816d.f9412n) {
                G g12 = c0816d.f9404f;
                C0822j c0822j3 = H.f9353b;
                ((u) g12).S(F.b(27, 3, c0822j3));
                aVar.c(c0822j3);
                return;
            } else if (c0816d.j(new y(c0816d, c0813a, aVar, 5), 30000L, new RunnableC5216j(c0816d, aVar, 18), c0816d.f()) != null) {
                return;
            } else {
                C0822j h10 = c0816d.h();
                ((u) c0816d.f9404f).S(F.b(25, 3, h10));
                aVar.c(h10);
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

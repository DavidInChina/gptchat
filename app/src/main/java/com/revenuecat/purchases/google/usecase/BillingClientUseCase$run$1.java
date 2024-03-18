package com.revenuecat.purchases.google.usecase;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.PurchasesError;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, "Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BillingClientUseCase$run$1 extends o implements k {
    final /* synthetic */ BillingClientUseCase<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingClientUseCase$run$1(BillingClientUseCase<T> billingClientUseCase) {
        super(1);
        this.this$0 = billingClientUseCase;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        k kVar;
        if (purchasesError != null) {
            kVar = ((BillingClientUseCase) this.this$0).onError;
            kVar.invoke(purchasesError);
            return;
        }
        this.this$0.executeAsync();
    }
}

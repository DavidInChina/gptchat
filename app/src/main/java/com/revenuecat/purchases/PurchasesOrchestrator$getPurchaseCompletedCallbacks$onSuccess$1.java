package com.revenuecat.purchases;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lcom/revenuecat/purchases/CustomerInfo;", ParameterNames.INFO, "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1 extends o implements n {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
        this.this$0 = purchasesOrchestrator;
    }

    @Override // wf.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return y.f36177a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        PurchaseCallback purchaseCallback;
        AbstractC3557B.c0("storeTransaction", storeTransaction);
        AbstractC3557B.c0(ParameterNames.INFO, customerInfo);
        purchaseCallback = this.this$0.getPurchaseCallback(storeTransaction.getProductIds().get(0));
        if (purchaseCallback != null) {
            this.this$0.dispatch(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1$1$1(purchaseCallback, storeTransaction, customerInfo));
        }
    }
}

package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import org.json.JSONObject;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "Ljf/y;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AmazonBilling$handleReceipt$1 extends o implements k {
    final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ UserData $userData;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$handleReceipt$1(Receipt receipt, PresentedOfferingContext presentedOfferingContext, UserData userData, AmazonBilling amazonBilling) {
        super(1);
        this.$receipt = receipt;
        this.$presentedOfferingContext = presentedOfferingContext;
        this.$userData = userData;
        this.this$0 = amazonBilling;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return y.f36177a;
    }

    public final void invoke(JSONObject jSONObject) {
        AbstractC3557B.c0("response", jSONObject);
        Object obj = jSONObject.get("termSku");
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", obj);
        StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(this.$receipt, (String) obj, this.$presentedOfferingContext, PurchaseState.PURCHASED, this.$userData);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesUpdated(AbstractC4344b.F0(storeTransaction));
        }
    }
}

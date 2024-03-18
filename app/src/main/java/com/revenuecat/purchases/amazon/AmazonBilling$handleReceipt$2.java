package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PurchasesError;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import r9.y;

@Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public /* synthetic */ class AmazonBilling$handleReceipt$2 extends k implements wf.k {
    public AmazonBilling$handleReceipt$2(Object obj) {
        super(1, obj, AmazonBilling.class, "onPurchaseError", "onPurchaseError(Lcom/revenuecat/purchases/PurchasesError;)V", 0);
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return jf.y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        AbstractC3557B.c0("p0", purchasesError);
        ((AmazonBilling) this.receiver).onPurchaseError(purchasesError);
    }
}

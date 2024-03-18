package com.revenuecat.purchases;

import android.app.Activity;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "purchaseRecord", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$2 extends o implements k {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
    final /* synthetic */ Boolean $isPersonalizedPrice;
    final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
    final /* synthetic */ B $previousProductId;
    final /* synthetic */ PurchasingData $purchasingData;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$2(B b10, PurchasesOrchestrator purchasesOrchestrator, Activity activity, String str, PurchasingData purchasingData, GoogleReplacementMode googleReplacementMode, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        super(1);
        this.$previousProductId = b10;
        this.this$0 = purchasesOrchestrator;
        this.$activity = activity;
        this.$appUserID = str;
        this.$purchasingData = purchasingData;
        this.$googleReplacementMode = googleReplacementMode;
        this.$presentedOfferingContext = presentedOfferingContext;
        this.$isPersonalizedPrice = bool;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((StoreTransaction) obj);
        return y.f36177a;
    }

    public final void invoke(StoreTransaction storeTransaction) {
        AbstractC3557B.c0("purchaseRecord", storeTransaction);
        AbstractC2469q0.t(new Object[]{this.$previousProductId.f37622Y}, 1, PurchaseStrings.FOUND_EXISTING_PURCHASE, LogIntent.PURCHASE);
        this.this$0.billing.makePurchaseAsync(this.$activity, this.$appUserID, this.$purchasingData, new ReplaceProductInfo(storeTransaction, this.$googleReplacementMode), this.$presentedOfferingContext, this.$isPersonalizedPrice);
    }
}

package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.PurchasesError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;", "", "Lcom/revenuecat/purchases/PurchasesError;", "error", "", "userCancelled", "Ljf/y;", "onError", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface PurchaseErrorCallback {
    void onError(PurchasesError purchasesError, boolean z10);
}

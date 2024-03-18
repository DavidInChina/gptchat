package com.revenuecat.purchases.google;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import java.util.ArrayList;
import kotlin.Metadata;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0005\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0012"}, d2 = {"originalGooglePurchase", "Lcom/android/billingclient/api/Purchase;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "getOriginalGooglePurchase", "(Lcom/revenuecat/purchases/models/StoreTransaction;)Lcom/android/billingclient/api/Purchase;", "toStoreTransaction", "productType", "Lcom/revenuecat/purchases/ProductType;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "subscriptionOptionId", "", "replacementMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "purchaseContext", "Lcom/revenuecat/purchases/google/PurchaseContext;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "type", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class StoreTransactionConversionsKt {
    public static final Purchase getOriginalGooglePurchase(StoreTransaction storeTransaction) {
        AbstractC3557B.c0("<this>", storeTransaction);
        String signature = storeTransaction.getSignature();
        if (signature == null) {
            return null;
        }
        if (storeTransaction.getPurchaseType() != PurchaseType.GOOGLE_PURCHASE) {
            signature = null;
        }
        if (signature == null) {
            return null;
        }
        return new Purchase(storeTransaction.getOriginalJson().toString(), signature);
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode) {
        AbstractC3557B.c0("<this>", purchase);
        AbstractC3557B.c0("productType", productType);
        JSONObject jSONObject = purchase.f26705c;
        String optString = jSONObject.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            optString = null;
        }
        ArrayList a5 = purchase.a();
        long optLong = jSONObject.optLong("purchaseTime");
        String b10 = purchase.b();
        AbstractC3557B.b0("this.purchaseToken", b10);
        int i10 = 1;
        if (jSONObject.optInt("purchaseState", 1) == 4) {
            i10 = 2;
        }
        return new StoreTransaction(optString, a5, productType, optLong, b10, PurchaseStateConversionsKt.toRevenueCatPurchaseState(i10), Boolean.valueOf(jSONObject.optBoolean("autoRenewing")), purchase.f26704b, new JSONObject(purchase.f26703a), presentedOfferingContext, (String) null, PurchaseType.GOOGLE_PURCHASE, (String) null, str, googleReplacementMode);
    }

    public static /* synthetic */ StoreTransaction toStoreTransaction$default(Purchase purchase, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            presentedOfferingContext = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            googleReplacementMode = null;
        }
        return toStoreTransaction(purchase, productType, presentedOfferingContext, str, googleReplacementMode);
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, PurchaseContext purchaseContext) {
        AbstractC3557B.c0("<this>", purchase);
        AbstractC3557B.c0("purchaseContext", purchaseContext);
        return toStoreTransaction(purchase, purchaseContext.getProductType(), purchaseContext.getPresentedOfferingContext(), purchaseContext.getSelectedSubscriptionOptionId(), purchaseContext.getReplacementMode());
    }

    public static final StoreTransaction toStoreTransaction(PurchaseHistoryRecord purchaseHistoryRecord, ProductType productType) {
        AbstractC3557B.c0("<this>", purchaseHistoryRecord);
        AbstractC3557B.c0("type", productType);
        ArrayList a5 = purchaseHistoryRecord.a();
        JSONObject jSONObject = purchaseHistoryRecord.f26708c;
        long optLong = jSONObject.optLong("purchaseTime");
        String optString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        AbstractC3557B.b0("this.purchaseToken", optString);
        return new StoreTransaction((String) null, a5, productType, optLong, optString, PurchaseState.UNSPECIFIED_STATE, (Boolean) null, purchaseHistoryRecord.f26707b, new JSONObject(purchaseHistoryRecord.f26706a), (PresentedOfferingContext) null, (String) null, PurchaseType.GOOGLE_RESTORED_PURCHASE, (String) null, (String) null, (ReplacementMode) null);
    }
}

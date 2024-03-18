package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import java.util.List;
import kotlin.Metadata;
import l8.AbstractC4344b;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u00a8\u0006\u000b"}, d2 = {"toStoreTransaction", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/amazon/device/iap/model/Receipt;", "productId", "", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "purchaseState", "Lcom/revenuecat/purchases/models/PurchaseState;", "userData", "Lcom/amazon/device/iap/model/UserData;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class StoreTransactionConversionsKt {
    public static final StoreTransaction toStoreTransaction(Receipt receipt, String str, PresentedOfferingContext presentedOfferingContext, PurchaseState purchaseState, UserData userData) {
        AbstractC3557B.c0("<this>", receipt);
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("purchaseState", purchaseState);
        AbstractC3557B.c0("userData", userData);
        ProductType productType = receipt.getProductType();
        AbstractC3557B.b0("this.productType", productType);
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        List F02 = AbstractC4344b.F0(str);
        long time = receipt.getPurchaseDate().getTime();
        String receiptId = receipt.getReceiptId();
        AbstractC3557B.b0("this.receiptId", receiptId);
        boolean z10 = false;
        if (revenueCatProductType == com.revenuecat.purchases.ProductType.SUBS && !receipt.isCanceled()) {
            z10 = true;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        JSONObject json = receipt.toJSON();
        AbstractC3557B.b0("this.toJSON()", json);
        return new StoreTransaction((String) null, F02, revenueCatProductType, time, receiptId, purchaseState, valueOf, (String) null, json, presentedOfferingContext, userData.getUserId(), PurchaseType.AMAZON_PURCHASE, userData.getMarketplace(), (String) null, (ReplacementMode) null);
    }
}

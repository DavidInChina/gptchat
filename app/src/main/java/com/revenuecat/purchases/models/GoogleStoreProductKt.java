package com.revenuecat.purchases.models;

import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"googleProduct", "Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", "getGoogleProduct", "(Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class GoogleStoreProductKt {
    public static final GoogleStoreProduct getGoogleProduct(StoreProduct storeProduct) {
        AbstractC3557B.c0("<this>", storeProduct);
        if (storeProduct instanceof GoogleStoreProduct) {
            return (GoogleStoreProduct) storeProduct;
        }
        return null;
    }
}

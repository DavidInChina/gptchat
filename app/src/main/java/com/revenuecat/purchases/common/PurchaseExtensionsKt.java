package com.revenuecat.purchases.common;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import id.AbstractC3557B;
import kf.t;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"firstProductId", "", "Lcom/android/billingclient/api/Purchase;", "getFirstProductId", "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;", "toHumanReadableDescription", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(Purchase purchase) {
        AbstractC3557B.c0("<this>", purchase);
        Object obj = purchase.a().get(0);
        String str = (String) obj;
        if (purchase.a().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        AbstractC3557B.b0("products[0].also {\n     \u2026_ONE_SKU)\n        }\n    }", obj);
        return (String) obj;
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        AbstractC3557B.c0("<this>", purchase);
        StringBuilder sb2 = new StringBuilder("productIds: ");
        sb2.append(t.m2(purchase.a(), null, "[", "]", null, 57));
        sb2.append(", orderId: ");
        String optString = purchase.f26705c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            optString = null;
        }
        sb2.append(optString);
        sb2.append(", purchaseToken: ");
        sb2.append(purchase.b());
        return sb2.toString();
    }
}

package com.revenuecat.purchases.amazon;

import android.content.Context;
import android.os.Parcelable;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH&\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH&\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H&\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H&\u00a2\u0006\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/os/Parcelable;", "Landroid/content/Context;", "context", "Lcom/amazon/device/iap/PurchasingListener;", "listener", "Ljf/y;", "registerListener", "(Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V", "", "", "skus", "Lcom/amazon/device/iap/model/RequestId;", "getProductData", "(Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;", "getUserData", "()Lcom/amazon/device/iap/model/RequestId;", ProxyAmazonBillingActivity.EXTRAS_SKU, "purchase", "(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;", "", "reset", "getPurchaseUpdates", "(Z)Lcom/amazon/device/iap/model/RequestId;", "receiptId", "Lcom/amazon/device/iap/model/FulfillmentResult;", "fulfillmentResult", "notifyFulfillment", "(Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface PurchasingServiceProvider extends Parcelable {
    RequestId getProductData(Set<String> set);

    RequestId getPurchaseUpdates(boolean z10);

    RequestId getUserData();

    void notifyFulfillment(String str, FulfillmentResult fulfillmentResult);

    RequestId purchase(String str);

    void registerListener(Context context, PurchasingListener purchasingListener);
}

package com.revenuecat.purchases.amazon;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import id.AbstractC3557B;
import java.util.Set;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b%\u0010&J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\b\u001e\u0010\u001fJ \u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\b#\u0010$\u00a8\u0006'"}, d2 = {"Lcom/revenuecat/purchases/amazon/DefaultPurchasingServiceProvider;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/content/Context;", "context", "Lcom/amazon/device/iap/PurchasingListener;", "listener", "Ljf/y;", "registerListener", "(Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V", "Lcom/amazon/device/iap/model/RequestId;", "getUserData", "()Lcom/amazon/device/iap/model/RequestId;", "", ProxyAmazonBillingActivity.EXTRAS_SKU, "purchase", "(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;", "", "skus", "getProductData", "(Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;", "", "reset", "getPurchaseUpdates", "(Z)Lcom/amazon/device/iap/model/RequestId;", "receiptId", "Lcom/amazon/device/iap/model/FulfillmentResult;", "fulfillmentResult", "notifyFulfillment", "(Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DefaultPurchasingServiceProvider implements PurchasingServiceProvider {
    public static final Parcelable.Creator<DefaultPurchasingServiceProvider> CREATOR = new Creator();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<DefaultPurchasingServiceProvider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultPurchasingServiceProvider createFromParcel(Parcel parcel) {
            AbstractC3557B.c0("parcel", parcel);
            parcel.readInt();
            return new DefaultPurchasingServiceProvider();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultPurchasingServiceProvider[] newArray(int i10) {
            return new DefaultPurchasingServiceProvider[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId getProductData(Set<String> set) {
        AbstractC3557B.c0("skus", set);
        RequestId productData = PurchasingService.getProductData(set);
        AbstractC3557B.b0("getProductData(skus)", productData);
        return productData;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId getPurchaseUpdates(boolean z10) {
        RequestId purchaseUpdates = PurchasingService.getPurchaseUpdates(z10);
        AbstractC3557B.b0("getPurchaseUpdates(reset)", purchaseUpdates);
        return purchaseUpdates;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId getUserData() {
        RequestId userData = PurchasingService.getUserData();
        AbstractC3557B.b0("getUserData()", userData);
        return userData;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public void notifyFulfillment(String str, FulfillmentResult fulfillmentResult) {
        AbstractC3557B.c0("receiptId", str);
        AbstractC3557B.c0("fulfillmentResult", fulfillmentResult);
        PurchasingService.notifyFulfillment(str, fulfillmentResult);
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId purchase(String str) {
        AbstractC3557B.c0(ProxyAmazonBillingActivity.EXTRAS_SKU, str);
        RequestId purchase = PurchasingService.purchase(str);
        AbstractC3557B.b0("purchase(sku)", purchase);
        return purchase;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public void registerListener(Context context, PurchasingListener purchasingListener) {
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("listener", purchasingListener);
        PurchasingService.registerListener(context, purchasingListener);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        parcel.writeInt(1);
    }
}

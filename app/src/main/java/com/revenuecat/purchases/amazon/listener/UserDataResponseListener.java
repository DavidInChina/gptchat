package com.revenuecat.purchases.amazon.listener;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;
import wf.k;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\rH&\u00a2\u0006\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/amazon/device/iap/PurchasingListener;", "Lcom/amazon/device/iap/model/ProductDataResponse;", "response", "Ljf/y;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "Lkotlin/Function1;", "Lcom/amazon/device/iap/model/UserData;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getUserData", "(Lwf/k;Lwf/k;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface UserDataResponseListener extends PurchasingListener {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onProductDataResponse(UserDataResponseListener userDataResponseListener, ProductDataResponse productDataResponse) {
            AbstractC3557B.c0("response", productDataResponse);
        }

        public static void onPurchaseResponse(UserDataResponseListener userDataResponseListener, PurchaseResponse purchaseResponse) {
            AbstractC3557B.c0("response", purchaseResponse);
        }

        public static void onPurchaseUpdatesResponse(UserDataResponseListener userDataResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
            AbstractC3557B.c0("response", purchaseUpdatesResponse);
        }
    }

    void getUserData(k kVar, k kVar2);

    void onProductDataResponse(ProductDataResponse productDataResponse);

    void onPurchaseResponse(PurchaseResponse purchaseResponse);

    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse);
}

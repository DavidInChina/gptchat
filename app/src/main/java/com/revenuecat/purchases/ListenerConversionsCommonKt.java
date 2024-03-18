package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import kotlin.Metadata;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001aC\u0010\t\u001a\u00020\b2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0000H\u0000\u00a2\u0006\u0004\b\t\u0010\n\u001a=\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bH\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001a\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001aQ\u0010\u001e\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001aO\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0004\b#\u0010$\u001aY\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\b\u0010&\u001a\u0004\u0018\u00010%2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0004\b#\u0010'\u001a;\u0010(\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0004\b(\u0010\u001b\"&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\",\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\u00a8\u00061"}, d2 = {"Lkotlin/Function2;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "Ljf/y;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "", "onError", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchaseCompletedCallback", "(Lwf/n;Lwf/n;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "onReceived", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "getStoreProductsCallback", "(Lwf/k;Lwf/k;)Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "Lcom/revenuecat/purchases/Offerings;", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "receiveOfferingsCallback", "(Lwf/k;Lwf/k;)Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "receiveCustomerInfoCallback", "(Lwf/k;Lwf/k;)Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "Lcom/revenuecat/purchases/Purchases;", "getOfferingsWith", "(Lcom/revenuecat/purchases/Purchases;Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "purchaseWith", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lwf/n;Lwf/n;)V", "", "productIds", "onGetStoreProducts", "getProductsWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/ProductType;", "type", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lwf/k;Lwf/k;)V", "restorePurchasesWith", "ON_ERROR_STUB", "Lwf/k;", "getON_ERROR_STUB", "()Lwf/k;", "ON_PURCHASE_ERROR_STUB", "Lwf/n;", "getON_PURCHASE_ERROR_STUB", "()Lwf/n;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ListenerConversionsCommonKt {
    private static final k ON_ERROR_STUB = ListenerConversionsCommonKt$ON_ERROR_STUB$1.INSTANCE;
    private static final n ON_PURCHASE_ERROR_STUB = ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1.INSTANCE;

    public static final k getON_ERROR_STUB() {
        return ON_ERROR_STUB;
    }

    public static final n getON_PURCHASE_ERROR_STUB() {
        return ON_PURCHASE_ERROR_STUB;
    }

    public static final void getOfferingsWith(Purchases purchases, k kVar, k kVar2) {
        AbstractC3557B.c0("<this>", purchases);
        AbstractC3557B.c0("onError", kVar);
        AbstractC3557B.c0("onSuccess", kVar2);
        purchases.getOfferings(receiveOfferingsCallback(kVar2, kVar));
    }

    public static /* synthetic */ void getOfferingsWith$default(Purchases purchases, k kVar, k kVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = ON_ERROR_STUB;
        }
        getOfferingsWith(purchases, kVar, kVar2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> list, ProductType productType, k kVar, k kVar2) {
        AbstractC3557B.c0("<this>", purchases);
        AbstractC3557B.c0("productIds", list);
        AbstractC3557B.c0("onError", kVar);
        AbstractC3557B.c0("onGetStoreProducts", kVar2);
        purchases.getProducts(list, productType, getStoreProductsCallback(kVar2, kVar));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, ProductType productType, k kVar, k kVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            kVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, productType, kVar, kVar2);
    }

    public static final GetStoreProductsCallback getStoreProductsCallback(final k kVar, final k kVar2) {
        AbstractC3557B.c0("onReceived", kVar);
        AbstractC3557B.c0("onError", kVar2);
        return new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt$getStoreProductsCallback$1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC3557B.c0("error", purchasesError);
                kVar2.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> list) {
                AbstractC3557B.c0("storeProducts", list);
                k.this.invoke(list);
            }
        };
    }

    public static final PurchaseCallback purchaseCompletedCallback(final n nVar, final n nVar2) {
        AbstractC3557B.c0("onSuccess", nVar);
        AbstractC3557B.c0("onError", nVar2);
        return new PurchaseCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt$purchaseCompletedCallback$1
            @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                AbstractC3557B.c0("storeTransaction", storeTransaction);
                AbstractC3557B.c0("customerInfo", customerInfo);
                n.this.invoke(storeTransaction, customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError purchasesError, boolean z10) {
                AbstractC3557B.c0("error", purchasesError);
                nVar2.invoke(purchasesError, Boolean.valueOf(z10));
            }
        };
    }

    public static final void purchaseWith(Purchases purchases, PurchaseParams purchaseParams, n nVar, n nVar2) {
        AbstractC3557B.c0("<this>", purchases);
        AbstractC3557B.c0("purchaseParams", purchaseParams);
        AbstractC3557B.c0("onError", nVar);
        AbstractC3557B.c0("onSuccess", nVar2);
        purchases.purchase(purchaseParams, purchaseCompletedCallback(nVar2, nVar));
    }

    public static /* synthetic */ void purchaseWith$default(Purchases purchases, PurchaseParams purchaseParams, n nVar, n nVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            nVar = ON_PURCHASE_ERROR_STUB;
        }
        purchaseWith(purchases, purchaseParams, nVar, nVar2);
    }

    public static final ReceiveCustomerInfoCallback receiveCustomerInfoCallback(final k kVar, final k kVar2) {
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        return new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt$receiveCustomerInfoCallback$1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC3557B.c0("error", purchasesError);
                k kVar3 = kVar2;
                if (kVar3 != null) {
                    y yVar = (y) kVar3.invoke(purchasesError);
                }
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                AbstractC3557B.c0("customerInfo", customerInfo);
                k kVar3 = k.this;
                if (kVar3 != null) {
                    y yVar = (y) kVar3.invoke(customerInfo);
                }
            }
        };
    }

    public static final ReceiveOfferingsCallback receiveOfferingsCallback(final k kVar, final k kVar2) {
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        return new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt$receiveOfferingsCallback$1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC3557B.c0("error", purchasesError);
                kVar2.invoke(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                AbstractC3557B.c0("offerings", offerings);
                k.this.invoke(offerings);
            }
        };
    }

    public static final void restorePurchasesWith(Purchases purchases, k kVar, k kVar2) {
        AbstractC3557B.c0("<this>", purchases);
        AbstractC3557B.c0("onError", kVar);
        AbstractC3557B.c0("onSuccess", kVar2);
        purchases.restorePurchases(receiveCustomerInfoCallback(kVar2, kVar));
    }

    public static /* synthetic */ void restorePurchasesWith$default(Purchases purchases, k kVar, k kVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = ON_ERROR_STUB;
        }
        restorePurchasesWith(purchases, kVar, kVar2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> list, k kVar, k kVar2) {
        AbstractC3557B.c0("<this>", purchases);
        AbstractC3557B.c0("productIds", list);
        AbstractC3557B.c0("onError", kVar);
        AbstractC3557B.c0("onGetStoreProducts", kVar2);
        purchases.getProducts(list, getStoreProductsCallback(kVar2, kVar));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, k kVar, k kVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, kVar, kVar2);
    }
}

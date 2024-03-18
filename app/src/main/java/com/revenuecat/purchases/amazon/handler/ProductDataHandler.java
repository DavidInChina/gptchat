package com.revenuecat.purchases.amazon.handler;

import E9.f;
import android.os.Handler;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.StoreProductConversionsKt;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kf.AbstractC4268D;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import wf.k;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\n\b\u0000\u0018\u0000 12\u00020\u0001:\u000212B\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&\u00a2\u0006\u0004\b/\u00100JI\u0010\r\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u001c\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007j\u0002`\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0007j\u0002`\u0012H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJS\u0010\u001f\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010\u0006\u001a\u00020\u00032\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0007H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a0)8BX\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010+R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040)8@X\u0080\u0004\u00a2\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b-\u0010.\u00a8\u00063"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "", "", "Lcom/amazon/device/iap/model/Product;", "productData", "marketplace", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Ljf/y;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "handleSuccessfulProductDataResponse", "(Ljava/util/Map;Ljava/lang/String;Lwf/k;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "response", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "handleUnsuccessfulProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;Lwf/k;)V", "Lcom/amazon/device/iap/model/RequestId;", "requestId", "addTimeoutToProductDataRequest", "(Lcom/amazon/device/iap/model/RequestId;)V", "Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "getRequest", "(Lcom/amazon/device/iap/model/RequestId;)Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "", "skus", "getProductData", "(Ljava/util/Set;Ljava/lang/String;Lwf/k;Lwf/k;)V", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "", "productDataRequests", "Ljava/util/Map;", "productDataCache", "getProductDataCache$purchases_customEntitlementComputationRelease", "()Ljava/util/Map;", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Landroid/os/Handler;)V", "Companion", "Request", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ProductDataHandler implements ProductDataResponseListener {
    public static final Companion Companion = new Companion(null);
    private static final long GET_PRODUCT_DATA_TIMEOUT_MILLIS = 10000;
    private final Handler mainHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final Map<RequestId, Request> productDataRequests = new LinkedHashMap();
    private final Map<String, Product> productDataCache = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Companion;", "", "()V", "GET_PRODUCT_DATA_TIMEOUT_MILLIS", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u001c\u0010\u0013\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000f\u00a2\u0006\u0004\b&\u0010'J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bH\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000fH\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\rJd\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b2\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000fH\u00c6\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0005R\u0017\u0010\u0012\u001a\u00020\u00038\u0006\u00a2\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010\u0007R-\u0010\u0013\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b8\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010\rR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000f8\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b%\u0010\r\u00a8\u0006("}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "", "", "", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/models/StoreProduct;", "Ljf/y;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "component3", "()Lwf/k;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "component4", "skuList", "marketplace", "onReceive", "onError", "copy", "(Ljava/util/List;Ljava/lang/String;Lwf/k;Lwf/k;)Lcom/revenuecat/purchases/amazon/handler/ProductDataHandler$Request;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSkuList", "Ljava/lang/String;", "getMarketplace", "Lwf/k;", "getOnReceive", "getOnError", "<init>", "(Ljava/util/List;Ljava/lang/String;Lwf/k;Lwf/k;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class Request {
        private final String marketplace;
        private final k onError;
        private final k onReceive;
        private final List<String> skuList;

        public Request(List<String> list, String str, k kVar, k kVar2) {
            AbstractC3557B.c0("skuList", list);
            AbstractC3557B.c0("marketplace", str);
            AbstractC3557B.c0("onReceive", kVar);
            AbstractC3557B.c0("onError", kVar2);
            this.skuList = list;
            this.marketplace = str;
            this.onReceive = kVar;
            this.onError = kVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Request copy$default(Request request, List list, String str, k kVar, k kVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = request.skuList;
            }
            if ((i10 & 2) != 0) {
                str = request.marketplace;
            }
            if ((i10 & 4) != 0) {
                kVar = request.onReceive;
            }
            if ((i10 & 8) != 0) {
                kVar2 = request.onError;
            }
            return request.copy(list, str, kVar, kVar2);
        }

        public final List<String> component1() {
            return this.skuList;
        }

        public final String component2() {
            return this.marketplace;
        }

        public final k component3() {
            return this.onReceive;
        }

        public final k component4() {
            return this.onError;
        }

        public final Request copy(List<String> list, String str, k kVar, k kVar2) {
            AbstractC3557B.c0("skuList", list);
            AbstractC3557B.c0("marketplace", str);
            AbstractC3557B.c0("onReceive", kVar);
            AbstractC3557B.c0("onError", kVar2);
            return new Request(list, str, kVar, kVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return AbstractC3557B.K(this.skuList, request.skuList) && AbstractC3557B.K(this.marketplace, request.marketplace) && AbstractC3557B.K(this.onReceive, request.onReceive) && AbstractC3557B.K(this.onError, request.onError);
        }

        public final String getMarketplace() {
            return this.marketplace;
        }

        public final k getOnError() {
            return this.onError;
        }

        public final k getOnReceive() {
            return this.onReceive;
        }

        public final List<String> getSkuList() {
            return this.skuList;
        }

        public int hashCode() {
            int v10 = f.v(this.marketplace, this.skuList.hashCode() * 31, 31);
            return this.onError.hashCode() + ((this.onReceive.hashCode() + v10) * 31);
        }

        public String toString() {
            return "Request(skuList=" + this.skuList + ", marketplace=" + this.marketplace + ", onReceive=" + this.onReceive + ", onError=" + this.onError + ')';
        }
    }

    public ProductDataHandler(PurchasingServiceProvider purchasingServiceProvider, Handler handler) {
        AbstractC3557B.c0("purchasingServiceProvider", purchasingServiceProvider);
        AbstractC3557B.c0("mainHandler", handler);
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.mainHandler = handler;
    }

    private final void addTimeoutToProductDataRequest(RequestId requestId) {
        this.mainHandler.postDelayed(new a(this, requestId, 0), GET_PRODUCT_DATA_TIMEOUT_MILLIS);
    }

    public static final void addTimeoutToProductDataRequest$lambda$6(ProductDataHandler productDataHandler, RequestId requestId) {
        AbstractC3557B.c0("this$0", productDataHandler);
        AbstractC3557B.c0("$requestId", requestId);
        Request request = productDataHandler.getRequest(requestId);
        if (request == null) {
            return;
        }
        request.getOnError().invoke(new PurchasesError(PurchasesErrorCode.UnknownError, String.format(AmazonStrings.ERROR_TIMEOUT_GETTING_PRODUCT_DATA, Arrays.copyOf(new Object[]{request.getSkuList().toString()}, 1))));
    }

    private final synchronized Request getRequest(RequestId requestId) {
        return this.productDataRequests.remove(requestId);
    }

    private final void handleSuccessfulProductDataResponse(Map<String, Product> map, String str, k kVar) {
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, String.format(AmazonStrings.RETRIEVED_PRODUCT_DATA, Arrays.copyOf(new Object[]{map}, 1)));
        if (map.isEmpty()) {
            LogWrapperKt.log(logIntent, AmazonStrings.RETRIEVED_PRODUCT_DATA_EMPTY);
        }
        ArrayList arrayList = new ArrayList();
        for (Product product : map.values()) {
            StoreProduct storeProduct = StoreProductConversionsKt.toStoreProduct(product, str);
            if (storeProduct != null) {
                arrayList.add(storeProduct);
            }
        }
        kVar.invoke(arrayList);
    }

    private final void handleUnsuccessfulProductDataResponse(ProductDataResponse productDataResponse, k kVar) {
        String str;
        if (productDataResponse.getRequestStatus() == ProductDataResponse.RequestStatus.NOT_SUPPORTED) {
            str = "Couldn't fetch product data, since it's not supported.";
        } else {
            str = "Error when fetching product data.";
        }
        kVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, str));
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener
    public void getProductData(Set<String> set, String str, k kVar, k kVar2) {
        Map l12;
        AbstractC3557B.c0("skus", set);
        AbstractC3557B.c0("marketplace", str);
        AbstractC3557B.c0("onReceive", kVar);
        AbstractC3557B.c0("onError", kVar2);
        Set<String> set2 = set;
        AbstractC2469q0.t(new Object[]{t.m2(set2, null, null, null, null, 63)}, 1, AmazonStrings.REQUESTING_PRODUCTS, LogIntent.DEBUG);
        synchronized (this) {
            l12 = AbstractC4268D.l1(this.productDataCache);
        }
        if (l12.keySet().containsAll(set)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : l12.entrySet()) {
                if (set.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            handleSuccessfulProductDataResponse(linkedHashMap, str, kVar);
            return;
        }
        RequestId productData = this.purchasingServiceProvider.getProductData(set);
        Request request = new Request(t.K2(set2), str, kVar, kVar2);
        synchronized (this) {
            this.productDataRequests.put(productData, request);
            addTimeoutToProductDataRequest(productData);
        }
    }

    public final synchronized Map<String, Product> getProductDataCache$purchases_customEntitlementComputationRelease() {
        return this.productDataCache;
    }

    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        AbstractC3557B.c0("response", productDataResponse);
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            LogWrapperKt.log(logIntent, String.format(AmazonStrings.PRODUCTS_REQUEST_FINISHED, Arrays.copyOf(new Object[]{productDataResponse.getRequestStatus().name()}, 1)));
            Set unavailableSkus = productDataResponse.getUnavailableSkus();
            AbstractC3557B.b0("response.unavailableSkus", unavailableSkus);
            if (!unavailableSkus.isEmpty()) {
                LogWrapperKt.log(logIntent, String.format(AmazonStrings.PRODUCTS_REQUEST_UNAVAILABLE, Arrays.copyOf(new Object[]{productDataResponse.getUnavailableSkus()}, 1)));
            }
            RequestId requestId = productDataResponse.getRequestId();
            AbstractC3557B.b0("requestId", requestId);
            Request request = getRequest(requestId);
            if (request == null) {
                return;
            }
            if (productDataResponse.getRequestStatus() == ProductDataResponse.RequestStatus.SUCCESSFUL) {
                synchronized (this) {
                    Map<String, Product> map = this.productDataCache;
                    Map<? extends String, ? extends Product> productData = productDataResponse.getProductData();
                    AbstractC3557B.b0("response.productData", productData);
                    map.putAll(productData);
                }
                Map<String, Product> productData2 = productDataResponse.getProductData();
                AbstractC3557B.b0("response.productData", productData2);
                handleSuccessfulProductDataResponse(productData2, request.getMarketplace(), request.getOnReceive());
                return;
            }
            handleUnsuccessfulProductDataResponse(productDataResponse, request.getOnError());
        } catch (Exception e10) {
            LogUtilsKt.errorLog("Exception in onProductDataResponse", e10);
            throw e10;
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        ProductDataResponseListener.DefaultImpls.onPurchaseResponse(this, purchaseResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        ProductDataResponseListener.DefaultImpls.onPurchaseUpdatesResponse(this, purchaseUpdatesResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse userDataResponse) {
        ProductDataResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }
}

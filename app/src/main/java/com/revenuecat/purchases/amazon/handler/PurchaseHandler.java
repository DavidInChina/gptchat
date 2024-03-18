package com.revenuecat.purchases.amazon.handler;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.PurchaseStrings;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.C3959i;
import kotlin.Metadata;
import r9.y;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*\u00a2\u0006\u0004\b4\u00105JU\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001aJ#\u0010\u001c\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001aJ#\u0010\u001d\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001aJ#\u0010\u001e\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001aJ]\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH\u0016\u00a2\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u0016\u00a2\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100RJ\u00103\u001a8\u0012\u0004\u0012\u000201\u0012.\u0012,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00100\u00a8\u00066"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/PurchaseHandler;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Landroid/os/Handler;", "mainHandler", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lkotlin/Function2;", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "Ljf/y;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "startProxyActivity", "(Landroid/os/Handler;Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lwf/n;Lwf/k;)V", "com/revenuecat/purchases/amazon/handler/PurchaseHandler$createRequestIdResultReceiver$1", "createRequestIdResultReceiver", "(Landroid/os/Handler;Lcom/revenuecat/purchases/models/StoreProduct;Lwf/n;Lwf/k;)Lcom/revenuecat/purchases/amazon/handler/PurchaseHandler$createRequestIdResultReceiver$1;", "receipt", "userData", "onSuccessfulPurchase", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;Lwf/n;)V", "onUnknownError", "(Lwf/k;)V", "onNotSupported", "onAlreadyPurchased", "onInvalidSku", "onFailed", "", "appUserID", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Lwf/n;Lwf/k;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "response", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", "", "Lcom/revenuecat/purchases/ProductType;", "productTypes", "Ljava/util/Map;", "Lcom/amazon/device/iap/model/RequestId;", "Ljf/i;", "purchaseCallbacks", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Landroid/content/Context;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchaseHandler implements PurchaseResponseListener {
    private final Context applicationContext;
    private final Map<String, ProductType> productTypes = new LinkedHashMap();
    private final Map<RequestId, C3959i> purchaseCallbacks = new LinkedHashMap();
    private final PurchasingServiceProvider purchasingServiceProvider;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseResponse.RequestStatus.values().length];
            try {
                iArr[PurchaseResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.INVALID_SKU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.ALREADY_PURCHASED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchaseHandler(PurchasingServiceProvider purchasingServiceProvider, Context context) {
        AbstractC3557B.c0("purchasingServiceProvider", purchasingServiceProvider);
        AbstractC3557B.c0("applicationContext", context);
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.applicationContext = context;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.revenuecat.purchases.amazon.handler.PurchaseHandler$createRequestIdResultReceiver$1] */
    private final PurchaseHandler$createRequestIdResultReceiver$1 createRequestIdResultReceiver(final Handler handler, final StoreProduct storeProduct, final n nVar, final k kVar) {
        return new ResultReceiver(handler) { // from class: com.revenuecat.purchases.amazon.handler.PurchaseHandler$createRequestIdResultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle bundle) {
                Object obj;
                RequestId requestId;
                Map map;
                Map map2;
                PurchaseHandler purchaseHandler = this;
                n nVar2 = nVar;
                k kVar2 = kVar;
                StoreProduct storeProduct2 = storeProduct;
                synchronized (purchaseHandler) {
                    if (bundle != null) {
                        try {
                            obj = bundle.get(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        obj = null;
                    }
                    if (obj instanceof RequestId) {
                        requestId = (RequestId) obj;
                    } else {
                        requestId = null;
                    }
                    if (requestId != null) {
                        map = purchaseHandler.purchaseCallbacks;
                        map.put(requestId, AbstractC3557B.D2(nVar2, kVar2));
                        map2 = purchaseHandler.productTypes;
                        map2.put(storeProduct2.getId(), storeProduct2.getType());
                    } else {
                        LogUtilsKt.errorLog$default("No RequestId coming from ProxyAmazonBillingActivity", null, 2, null);
                    }
                }
            }
        };
    }

    private final void onAlreadyPurchased(k kVar) {
        kVar.invoke(new PurchasesError(PurchasesErrorCode.ProductAlreadyPurchasedError, AmazonStrings.ERROR_PURCHASE_ALREADY_OWNED));
    }

    private final void onFailed(k kVar) {
        kVar.invoke(new PurchasesError(PurchasesErrorCode.PurchaseCancelledError, AmazonStrings.ERROR_PURCHASE_FAILED));
    }

    private final void onInvalidSku(k kVar) {
        kVar.invoke(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, AmazonStrings.ERROR_PURCHASE_INVALID_SKU));
    }

    private final void onNotSupported(k kVar) {
        kVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_PURCHASE_NOT_SUPPORTED));
    }

    private final void onSuccessfulPurchase(Receipt receipt, UserData userData, n nVar) {
        nVar.invoke(receipt, userData);
    }

    private final void onUnknownError(k kVar) {
        kVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_PURCHASE_UNKNOWN));
    }

    private final void startProxyActivity(Handler handler, Activity activity, StoreProduct storeProduct, n nVar, k kVar) {
        activity.startActivity(ProxyAmazonBillingActivity.Companion.newStartIntent(activity, createRequestIdResultReceiver(handler, storeProduct, nVar, kVar), storeProduct.getId(), this.purchasingServiceProvider));
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        PurchaseResponseListener.DefaultImpls.onProductDataResponse(this, productDataResponse);
    }

    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        C3959i remove;
        int i10;
        AbstractC3557B.c0("response", purchaseResponse);
        try {
            LogWrapperKt.log(LogIntent.DEBUG, String.format(AmazonStrings.PURCHASE_REQUEST_FINISHED, Arrays.copyOf(new Object[]{purchaseResponse.toJSON().toString(1)}, 1)));
            ProxyAmazonBillingActivityBroadcastReceiver.Companion companion = ProxyAmazonBillingActivityBroadcastReceiver.Companion;
            String packageName = this.applicationContext.getPackageName();
            AbstractC3557B.b0("applicationContext.packageName", packageName);
            this.applicationContext.sendBroadcast(companion.newPurchaseFinishedIntent(packageName));
            RequestId requestId = purchaseResponse.getRequestId();
            synchronized (this) {
                remove = this.purchaseCallbacks.remove(requestId);
            }
            if (remove != null) {
                n nVar = (n) remove.a();
                k kVar = (k) remove.b();
                PurchaseResponse.RequestStatus requestStatus = purchaseResponse.getRequestStatus();
                if (requestStatus == null) {
                    i10 = -1;
                } else {
                    i10 = WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    onUnknownError(kVar);
                                    return;
                                } else {
                                    onNotSupported(kVar);
                                    return;
                                }
                            }
                            onAlreadyPurchased(kVar);
                            return;
                        }
                        onInvalidSku(kVar);
                        return;
                    }
                    onFailed(kVar);
                    return;
                }
                Receipt receipt = purchaseResponse.getReceipt();
                AbstractC3557B.b0("response.receipt", receipt);
                UserData userData = purchaseResponse.getUserData();
                AbstractC3557B.b0("response.userData", userData);
                onSuccessfulPurchase(receipt, userData, nVar);
            }
        } catch (Exception e10) {
            LogUtilsKt.errorLog("Exception in onPurchaseResponse", e10);
            throw e10;
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        PurchaseResponseListener.DefaultImpls.onPurchaseUpdatesResponse(this, purchaseUpdatesResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse userDataResponse) {
        PurchaseResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener
    public void purchase(Handler handler, Activity activity, String str, StoreProduct storeProduct, n nVar, k kVar) {
        AbstractC3557B.c0("mainHandler", handler);
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("storeProduct", storeProduct);
        AbstractC3557B.c0("onSuccess", nVar);
        AbstractC3557B.c0("onError", kVar);
        AbstractC2469q0.t(new Object[]{storeProduct.getId()}, 1, PurchaseStrings.PURCHASING_PRODUCT, LogIntent.PURCHASE);
        startProxyActivity(handler, activity, storeProduct, nVar, kVar);
    }
}

package com.revenuecat.purchases.amazon.handler;

import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kotlin.Metadata;
import r9.y;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\b \u0010!J+\u0010\b\u001a\u00020\u0004*\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\b\u0010\tJK\u0010\u0011\u001a\u00020\u00042\"\u0010\u000f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\nj\u0002`\u000e2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\\\u0010\u001e\u001aJ\u0012\u0004\u0012\u00020\u001b\u0012@\u0012>\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\nj\u0002`\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00050\u001cj\u0002`\u001d0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u00a8\u0006\""}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/PurchaseUpdatesHandler;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Ljf/y;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "", "message", "invokeWithStoreProblem", "(Lwf/k;Ljava/lang/String;)V", "Lkotlin/Function2;", "", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "Lcom/revenuecat/purchases/amazon/handler/QueryPurchasesSuccessCallback;", "onSuccess", "onError", "queryPurchases", "(Lwf/n;Lwf/k;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "response", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "", "Lcom/amazon/device/iap/model/RequestId;", "Ljf/i;", "Lcom/revenuecat/purchases/amazon/handler/QueryPurchasesCallbacks;", "requests", "Ljava/util/Map;", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PurchaseUpdatesHandler implements PurchaseUpdatesResponseListener {
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final Map<RequestId, C3959i> requests = new LinkedHashMap();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseUpdatesResponse.RequestStatus.values().length];
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchaseUpdatesHandler(PurchasingServiceProvider purchasingServiceProvider) {
        AbstractC3557B.c0("purchasingServiceProvider", purchasingServiceProvider);
        this.purchasingServiceProvider = purchasingServiceProvider;
    }

    private final void invokeWithStoreProblem(k kVar, String str) {
        kVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, str));
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onProductDataResponse(this, productDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onPurchaseResponse(this, purchaseResponse);
    }

    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        C3959i remove;
        int i10;
        AbstractC3557B.c0("response", purchaseUpdatesResponse);
        try {
            LogWrapperKt.log(LogIntent.DEBUG, String.format(AmazonStrings.RETRIEVED_PRODUCT_DATA, Arrays.copyOf(new Object[]{purchaseUpdatesResponse}, 1)));
            RequestId requestId = purchaseUpdatesResponse.getRequestId();
            synchronized (this) {
                remove = this.requests.remove(requestId);
            }
            if (remove != null) {
                n nVar = (n) remove.a();
                k kVar = (k) remove.b();
                PurchaseUpdatesResponse.RequestStatus requestStatus = purchaseUpdatesResponse.getRequestStatus();
                if (requestStatus == null) {
                    i10 = -1;
                } else {
                    i10 = WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
                }
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                invokeWithStoreProblem(kVar, AmazonStrings.ERROR_UNSUPPORTED_PURCHASES_UPDATES);
                                return;
                            }
                            return;
                        }
                        invokeWithStoreProblem(kVar, AmazonStrings.ERROR_FAILED_PURCHASES_UPDATES);
                        return;
                    }
                    List receipts = purchaseUpdatesResponse.getReceipts();
                    AbstractC3557B.b0("response.receipts", receipts);
                    UserData userData = purchaseUpdatesResponse.getUserData();
                    AbstractC3557B.b0("response.userData", userData);
                    nVar.invoke(receipts, userData);
                    return;
                }
                invokeWithStoreProblem(kVar, AmazonStrings.ERROR_PURCHASES_UPDATES_STORE_PROBLEM);
            }
        } catch (Exception e10) {
            LogUtilsKt.errorLog("Exception in onPurchaseUpdatesResponse", e10);
            throw e10;
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse userDataResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void queryPurchases(n nVar, k kVar) {
        AbstractC3557B.c0("onSuccess", nVar);
        AbstractC3557B.c0("onError", kVar);
        RequestId purchaseUpdates = this.purchasingServiceProvider.getPurchaseUpdates(true);
        synchronized (this) {
            this.requests.put(purchaseUpdates, new C3959i(nVar, kVar));
        }
    }
}

package com.revenuecat.purchases;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import id.AbstractC3557B;
import kotlin.Metadata;
import wf.AbstractC6216a;
import wf.k;
import wf.n;
import wf.o;

@Metadata(d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010@\u001a\u00020?\u00a2\u0006\u0004\bE\u0010FJ\u0085\u0001\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2$\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u000f0\u0011j\u0002`\u0015H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ?\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\rH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJq\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0004\b\u001f\u0010 J\u007f\u0010(\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\"\b\u0002\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010%j\u0004\u0018\u0001`&2\"\b\u0002\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f\u0018\u00010%j\u0004\u0018\u0001`'\u00a2\u0006\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bB\u0010C\u00a8\u0006G"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptHelper;", "", "", "appUserID", "purchaseToken", "", "isRestore", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "storeUserID", "marketplace", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "Ljf/y;", "onSuccess", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "onError", "postReceiptAndSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/common/ReceiptInfo;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lwf/k;Lwf/o;)V", "errorHandlingBehavior", "Lkotlin/Function0;", "useOfflineEntitlementsCustomerInfoIfNeeded", "(Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Ljava/lang/String;Lwf/k;Lwf/a;)V", "calculateOfflineCustomerInfo", "(Ljava/lang/String;Lwf/k;Lwf/k;)V", "postTokenWithoutConsuming", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;ZLjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchase", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "postTransactionAndConsumeIfNeeded", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/models/StoreProduct;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lwf/n;Lwf/n;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "paywallPresentedCache", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "getFinishTransactions", "()Z", "finishTransactions", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PostReceiptHelper {
    private final AppConfig appConfig;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    public PostReceiptHelper(AppConfig appConfig, Backend backend, BillingAbstract billingAbstract, CustomerInfoUpdateHandler customerInfoUpdateHandler, DeviceCache deviceCache, SubscriberAttributesManager subscriberAttributesManager, OfflineEntitlementsManager offlineEntitlementsManager, PaywallPresentedCache paywallPresentedCache) {
        AbstractC3557B.c0("appConfig", appConfig);
        AbstractC3557B.c0("backend", backend);
        AbstractC3557B.c0("billing", billingAbstract);
        AbstractC3557B.c0("customerInfoUpdateHandler", customerInfoUpdateHandler);
        AbstractC3557B.c0("deviceCache", deviceCache);
        AbstractC3557B.c0("subscriberAttributesManager", subscriberAttributesManager);
        AbstractC3557B.c0("offlineEntitlementsManager", offlineEntitlementsManager);
        AbstractC3557B.c0("paywallPresentedCache", paywallPresentedCache);
        this.appConfig = appConfig;
        this.backend = backend;
        this.billing = billingAbstract;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.deviceCache = deviceCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.paywallPresentedCache = paywallPresentedCache;
    }

    private final void calculateOfflineCustomerInfo(String str, k kVar, k kVar2) {
        this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(str, new PostReceiptHelper$calculateOfflineCustomerInfo$1(this, kVar), new PostReceiptHelper$calculateOfflineCustomerInfo$2(kVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    private final void postReceiptAndSubscriberAttributes(String str, String str2, boolean z10, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, k kVar, o oVar) {
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(str, new PostReceiptHelper$postReceiptAndSubscriberAttributes$1(this, str2, str, z10, receiptInfo, str3, str4, postReceiptInitiationSource, this.paywallPresentedCache.getAndRemovePresentedEvent(), kVar, oVar));
    }

    public static /* synthetic */ void postTransactionAndConsumeIfNeeded$default(PostReceiptHelper postReceiptHelper, StoreTransaction storeTransaction, StoreProduct storeProduct, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, n nVar, n nVar2, int i10, Object obj) {
        n nVar3;
        n nVar4;
        if ((i10 & 32) != 0) {
            nVar3 = null;
        } else {
            nVar3 = nVar;
        }
        if ((i10 & 64) != 0) {
            nVar4 = null;
        } else {
            nVar4 = nVar2;
        }
        postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, storeProduct, z10, str, postReceiptInitiationSource, nVar3, nVar4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, String str, k kVar, AbstractC6216a abstractC6216a) {
        boolean z10;
        if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInPostReceipt(z10)) {
            calculateOfflineCustomerInfo(str, kVar, new PostReceiptHelper$useOfflineEntitlementsCustomerInfoIfNeeded$1(abstractC6216a));
        } else {
            abstractC6216a.mo122invoke();
        }
    }

    public final void postTokenWithoutConsuming(String str, String str2, ReceiptInfo receiptInfo, boolean z10, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, k kVar, k kVar2) {
        AbstractC3557B.c0("purchaseToken", str);
        AbstractC3557B.c0("receiptInfo", receiptInfo);
        AbstractC3557B.c0("appUserID", str3);
        AbstractC3557B.c0("initiationSource", postReceiptInitiationSource);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        postReceiptAndSubscriberAttributes(str3, str, z10, receiptInfo, str2, str4, postReceiptInitiationSource, new PostReceiptHelper$postTokenWithoutConsuming$1(this, str, kVar), new PostReceiptHelper$postTokenWithoutConsuming$2(this, str, str3, kVar, kVar2));
    }

    public final void postTransactionAndConsumeIfNeeded(StoreTransaction storeTransaction, StoreProduct storeProduct, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, n nVar, n nVar2) {
        AbstractC3557B.c0("purchase", storeTransaction);
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("initiationSource", postReceiptInitiationSource);
        postReceiptAndSubscriberAttributes(str, storeTransaction.getPurchaseToken(), z10, new ReceiptInfo(storeTransaction.getProductIds(), storeTransaction.getPresentedOfferingContext(), storeTransaction.getSubscriptionOptionId(), storeProduct, null, null, storeTransaction.getReplacementMode(), 48, null), storeTransaction.getStoreUserID(), storeTransaction.getMarketplace(), postReceiptInitiationSource, new PostReceiptHelper$postTransactionAndConsumeIfNeeded$1(this, storeTransaction, postReceiptInitiationSource, nVar), new PostReceiptHelper$postTransactionAndConsumeIfNeeded$2(this, storeTransaction, postReceiptInitiationSource, str, nVar, nVar2));
    }
}

package com.revenuecat.purchases;

import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import id.AbstractC3557B;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n\u00a2\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "unsyncedSubscriberAttributesByKey", "Ljf/y;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PostReceiptHelper$postReceiptAndSubscriberAttributes$1 extends o implements k {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ boolean $isRestore;
    final /* synthetic */ String $marketplace;
    final /* synthetic */ wf.o $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ PaywallEvent $presentedPaywall;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ ReceiptInfo $receiptInfo;
    final /* synthetic */ String $storeUserID;
    final /* synthetic */ PostReceiptHelper this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lorg/json/JSONObject;", "responseBody", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements n {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ k $onSuccess;
        final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
        final /* synthetic */ PostReceiptHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PostReceiptHelper postReceiptHelper, String str, Map<String, SubscriberAttribute> map, k kVar) {
            super(2);
            this.this$0 = postReceiptHelper;
            this.$appUserID = str;
            this.$unsyncedSubscriberAttributesByKey = map;
            this.$onSuccess = kVar;
        }

        @Override // wf.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((CustomerInfo) obj, (JSONObject) obj2);
            return y.f36177a;
        }

        public final void invoke(CustomerInfo customerInfo, JSONObject jSONObject) {
            OfflineEntitlementsManager offlineEntitlementsManager;
            SubscriberAttributesManager subscriberAttributesManager;
            CustomerInfoUpdateHandler customerInfoUpdateHandler;
            AbstractC3557B.c0("customerInfo", customerInfo);
            AbstractC3557B.c0("responseBody", jSONObject);
            offlineEntitlementsManager = this.this$0.offlineEntitlementsManager;
            offlineEntitlementsManager.resetOfflineCustomerInfoCache();
            subscriberAttributesManager = this.this$0.subscriberAttributesManager;
            subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
            customerInfoUpdateHandler = this.this$0.customerInfoUpdateHandler;
            customerInfoUpdateHandler.cacheAndNotifyListeners(customerInfo);
            this.$onSuccess.invoke(customerInfo);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n\u00a2\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "responseBody", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends o implements wf.o {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ wf.o $onError;
        final /* synthetic */ PaywallEvent $presentedPaywall;
        final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
        final /* synthetic */ PostReceiptHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PaywallEvent paywallEvent, PostReceiptHelper postReceiptHelper, String str, Map<String, SubscriberAttribute> map, wf.o oVar) {
            super(3);
            this.$presentedPaywall = paywallEvent;
            this.this$0 = postReceiptHelper;
            this.$appUserID = str;
            this.$unsyncedSubscriberAttributesByKey = map;
            this.$onError = oVar;
        }

        @Override // wf.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
            return y.f36177a;
        }

        public final void invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
            SubscriberAttributesManager subscriberAttributesManager;
            PaywallPresentedCache paywallPresentedCache;
            AbstractC3557B.c0("error", purchasesError);
            AbstractC3557B.c0("errorHandlingBehavior", postReceiptErrorHandlingBehavior);
            PaywallEvent paywallEvent = this.$presentedPaywall;
            if (paywallEvent != null) {
                paywallPresentedCache = this.this$0.paywallPresentedCache;
                paywallPresentedCache.cachePresentedPaywall(paywallEvent);
            }
            if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_CONSUMED) {
                subscriberAttributesManager = this.this$0.subscriberAttributesManager;
                subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
            }
            this.$onError.invoke(purchasesError, postReceiptErrorHandlingBehavior, jSONObject);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostReceiptHelper$postReceiptAndSubscriberAttributes$1(PostReceiptHelper postReceiptHelper, String str, String str2, boolean z10, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, PaywallEvent paywallEvent, k kVar, wf.o oVar) {
        super(1);
        this.this$0 = postReceiptHelper;
        this.$purchaseToken = str;
        this.$appUserID = str2;
        this.$isRestore = z10;
        this.$receiptInfo = receiptInfo;
        this.$storeUserID = str3;
        this.$marketplace = str4;
        this.$initiationSource = postReceiptInitiationSource;
        this.$presentedPaywall = paywallEvent;
        this.$onSuccess = kVar;
        this.$onError = oVar;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map) obj);
        return y.f36177a;
    }

    public final void invoke(Map<String, SubscriberAttribute> map) {
        Backend backend;
        boolean finishTransactions;
        AbstractC3557B.c0("unsyncedSubscriberAttributesByKey", map);
        backend = this.this$0.backend;
        String str = this.$purchaseToken;
        String str2 = this.$appUserID;
        boolean z10 = this.$isRestore;
        finishTransactions = this.this$0.getFinishTransactions();
        boolean z11 = !finishTransactions;
        Map<String, Map<String, Object>> backendMap = BackendHelpersKt.toBackendMap(map);
        ReceiptInfo receiptInfo = this.$receiptInfo;
        String str3 = this.$storeUserID;
        String str4 = this.$marketplace;
        PostReceiptInitiationSource postReceiptInitiationSource = this.$initiationSource;
        PaywallEvent paywallEvent = this.$presentedPaywall;
        backend.postReceiptData(str, str2, z10, z11, backendMap, receiptInfo, str3, str4, postReceiptInitiationSource, paywallEvent != null ? paywallEvent.toPaywallPostReceiptData$purchases_customEntitlementComputationRelease() : null, new AnonymousClass1(this.this$0, this.$appUserID, map, this.$onSuccess), new AnonymousClass2(this.$presentedPaywall, this.this$0, this.$appUserID, map, this.$onError));
    }
}

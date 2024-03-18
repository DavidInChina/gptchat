package com.revenuecat.purchases;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.Result;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import l8.AbstractC4344b;
import wf.k;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&\u00a2\u0006\u0004\b)\u0010*J_\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010Ji\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u00110\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(\u00a8\u0006+"}, d2 = {"Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transactionsToSync", "", "allowSharingPlayStoreAccount", "", "appUserID", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Ljf/y;", "onError", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "postTransactionsWithCompletion", "(Ljava/util/List;ZLjava/lang/String;Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/utils/Result;", "results", "callCompletionFromResults", "(Ljava/util/List;Ljava/util/List;Lwf/k;Lwf/k;)V", "syncPendingPurchaseQueue", "(ZLwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "postTransactionWithProductDetailsHelper", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PostPendingTransactionsHelper {
    private final AppConfig appConfig;
    private final BillingAbstract billing;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final IdentityManager identityManager;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;

    public PostPendingTransactionsHelper(AppConfig appConfig, DeviceCache deviceCache, BillingAbstract billingAbstract, Dispatcher dispatcher, IdentityManager identityManager, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper) {
        AbstractC3557B.c0("appConfig", appConfig);
        AbstractC3557B.c0("deviceCache", deviceCache);
        AbstractC3557B.c0("billing", billingAbstract);
        AbstractC3557B.c0("dispatcher", dispatcher);
        AbstractC3557B.c0("identityManager", identityManager);
        AbstractC3557B.c0("postTransactionWithProductDetailsHelper", postTransactionWithProductDetailsHelper);
        this.appConfig = appConfig;
        this.deviceCache = deviceCache;
        this.billing = billingAbstract;
        this.dispatcher = dispatcher;
        this.identityManager = identityManager;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
    }

    public final void callCompletionFromResults(List<StoreTransaction> list, List<? extends Result<CustomerInfo, PurchasesError>> list2, k kVar, k kVar2) {
        if (list.size() == list2.size()) {
            int i10 = 0;
            for (Object obj : list2) {
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    Result result = (Result) obj;
                    if (result instanceof Result.Error) {
                        if (kVar != null) {
                            kVar.invoke(((Result.Error) result).getValue());
                            return;
                        }
                        return;
                    }
                    if (i10 == list2.size() - 1 && kVar2 != null) {
                        AbstractC3557B.a0("null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>", result);
                        kVar2.invoke(((Result.Success) result).getValue());
                    }
                    i10 = i11;
                } else {
                    AbstractC4344b.d1();
                    throw null;
                }
            }
        }
    }

    public static /* synthetic */ void callCompletionFromResults$default(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, List list2, k kVar, k kVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            kVar = null;
        }
        if ((i10 & 8) != 0) {
            kVar2 = null;
        }
        postPendingTransactionsHelper.callCompletionFromResults(list, list2, kVar, kVar2);
    }

    public final void postTransactionsWithCompletion(List<StoreTransaction> list, boolean z10, String str, k kVar, k kVar2) {
        if (list.isEmpty()) {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.NO_PENDING_PURCHASES_TO_SYNC);
            if (kVar2 != null) {
                kVar2.invoke(null);
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.postTransactionWithProductDetailsHelper.postTransactions(list, z10, str, PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, new PostPendingTransactionsHelper$postTransactionsWithCompletion$1(arrayList, this, list, kVar, kVar2), new PostPendingTransactionsHelper$postTransactionsWithCompletion$2(arrayList, this, list, kVar, kVar2));
    }

    public static /* synthetic */ void postTransactionsWithCompletion$default(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, boolean z10, String str, k kVar, k kVar2, int i10, Object obj) {
        k kVar3;
        k kVar4;
        if ((i10 & 8) != 0) {
            kVar3 = null;
        } else {
            kVar3 = kVar;
        }
        if ((i10 & 16) != 0) {
            kVar4 = null;
        } else {
            kVar4 = kVar2;
        }
        postPendingTransactionsHelper.postTransactionsWithCompletion(list, z10, str, kVar3, kVar4);
    }

    public static /* synthetic */ void syncPendingPurchaseQueue$default(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z10, k kVar, k kVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kVar = null;
        }
        if ((i10 & 4) != 0) {
            kVar2 = null;
        }
        postPendingTransactionsHelper.syncPendingPurchaseQueue(z10, kVar, kVar2);
    }

    public static final void syncPendingPurchaseQueue$lambda$0(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z10, k kVar, k kVar2) {
        AbstractC3557B.c0("this$0", postPendingTransactionsHelper);
        AbstractC3557B.c0("$appUserID", str);
        postPendingTransactionsHelper.billing.queryPurchases(str, new PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1(postPendingTransactionsHelper, z10, str, kVar, kVar2), new PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$2(kVar));
    }

    public final void syncPendingPurchaseQueue(final boolean z10, final k kVar, final k kVar2) {
        if (!this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SKIPPING_AUTOMATIC_SYNC);
            if (kVar2 != null) {
                kVar2.invoke(null);
                return;
            }
            return;
        }
        LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.UPDATING_PENDING_PURCHASE_QUEUE);
        final String currentAppUserID = this.identityManager.getCurrentAppUserID();
        Dispatcher.enqueue$default(this.dispatcher, new Runnable() { // from class: com.revenuecat.purchases.b
            {
                PostPendingTransactionsHelper.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PostPendingTransactionsHelper.syncPendingPurchaseQueue$lambda$0(PostPendingTransactionsHelper.this, currentAppUserID, z10, kVar, kVar2);
            }
        }, null, 2, null);
    }
}

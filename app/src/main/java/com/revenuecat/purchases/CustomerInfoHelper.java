package com.revenuecat.purchases;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import id.AbstractC3557B;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010/\u001a\u00020.\u00a2\u0006\u0004\b1\u00102J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\b\u0010\u0010\rJ3\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\b\u0011\u0010\rJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100\u00a8\u00063"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoHelper;", "", "", "appUserID", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "callback", "Ljf/y;", "getCustomerInfoCacheOnly", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "", "appInBackground", "allowSharingPlayStoreAccount", "postPendingPurchasesAndFetchCustomerInfo", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "getCustomerInfoFetchOnly", "(Ljava/lang/String;ZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "getCustomerInfoCachedOrFetched", "getCustomerInfoNotStaledCachedOrFetched", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "updateCachedCustomerInfoIfStale", "(Ljava/lang/String;ZZ)V", "Lkotlin/Function0;", "action", "dispatch", "(Lwf/a;)V", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "retrieveCustomerInfo", "(Ljava/lang/String;Lcom/revenuecat/purchases/CacheFetchPolicy;ZZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Landroid/os/Handler;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CustomerInfoHelper {
    private final Backend backend;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final Handler handler;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheFetchPolicy.values().length];
            try {
                iArr[CacheFetchPolicy.CACHE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheFetchPolicy.FETCH_CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheFetchPolicy.CACHED_OR_FETCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, Handler handler) {
        AbstractC3557B.c0("deviceCache", deviceCache);
        AbstractC3557B.c0("backend", backend);
        AbstractC3557B.c0("offlineEntitlementsManager", offlineEntitlementsManager);
        AbstractC3557B.c0("customerInfoUpdateHandler", customerInfoUpdateHandler);
        AbstractC3557B.c0("postPendingTransactionsHelper", postPendingTransactionsHelper);
        AbstractC3557B.c0("handler", handler);
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.handler = handler;
    }

    public final void dispatch(AbstractC6216a abstractC6216a) {
        if (!AbstractC3557B.K(Thread.currentThread(), this.handler.getLooper().getThread())) {
            this.handler.post(new a(0, abstractC6216a));
        } else {
            abstractC6216a.mo122invoke();
        }
    }

    public static final void dispatch$lambda$0(AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("$tmp0", abstractC6216a);
        abstractC6216a.mo122invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String str) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.getOfflineCustomerInfo();
        if (offlineCustomerInfo == null) {
            return this.deviceCache.getCachedCustomerInfo(str);
        }
        return offlineCustomerInfo;
    }

    private final void getCustomerInfoCacheOnly(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        if (receiveCustomerInfoCallback == null) {
            return;
        }
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(str);
        if (cachedCustomerInfo != null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            dispatch(new CustomerInfoHelper$getCustomerInfoCacheOnly$1(receiveCustomerInfoCallback, cachedCustomerInfo));
            return;
        }
        PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.CustomerInfoError, CustomerInfoStrings.MISSING_CACHED_CUSTOMER_INFO);
        LogUtilsKt.errorLog(purchasesError);
        dispatch(new CustomerInfoHelper$getCustomerInfoCacheOnly$2(receiveCustomerInfoCallback, purchasesError));
    }

    public static /* synthetic */ void getCustomerInfoCacheOnly$default(CustomerInfoHelper customerInfoHelper, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCacheOnly(str, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoCachedOrFetched(String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(str);
        if (cachedCustomerInfo != null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            dispatch(new CustomerInfoHelper$getCustomerInfoCachedOrFetched$1(receiveCustomerInfoCallback, cachedCustomerInfo));
            updateCachedCustomerInfoIfStale(str, z10, z11);
            return;
        }
        LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.NO_CACHED_CUSTOMERINFO);
        postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
    }

    public static /* synthetic */ void getCustomerInfoCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
    }

    public final void getCustomerInfoFetchOnly(String str, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.deviceCache.setCustomerInfoCacheTimestampToNow(str);
        this.backend.getCustomerInfo(str, z10, new CustomerInfoHelper$getCustomerInfoFetchOnly$1(this, receiveCustomerInfoCallback), new CustomerInfoHelper$getCustomerInfoFetchOnly$2(this, str, receiveCustomerInfoCallback));
    }

    public static /* synthetic */ void getCustomerInfoFetchOnly$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoFetchOnly(str, z10, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoNotStaledCachedOrFetched(String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        if (this.deviceCache.isCustomerInfoCacheStale(str, z10)) {
            postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
        } else {
            getCustomerInfoCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
        }
    }

    public static /* synthetic */ void getCustomerInfoNotStaledCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoNotStaledCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
    }

    private final void postPendingPurchasesAndFetchCustomerInfo(String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.postPendingTransactionsHelper.syncPendingPurchaseQueue(z11, new CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1(this, str, z10, receiveCustomerInfoCallback), new CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2(this, str, z10, receiveCustomerInfoCallback));
    }

    public static /* synthetic */ void postPendingPurchasesAndFetchCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
    }

    public static /* synthetic */ void retrieveCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, CacheFetchPolicy cacheFetchPolicy, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.retrieveCustomerInfo(str, cacheFetchPolicy, z10, z11, receiveCustomerInfoCallback);
    }

    private final void updateCachedCustomerInfoIfStale(String str, boolean z10, boolean z11) {
        String str2;
        if (this.deviceCache.isCustomerInfoCacheStale(str, z10)) {
            LogIntent logIntent = LogIntent.DEBUG;
            if (z10) {
                str2 = CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_BACKGROUND;
            } else {
                str2 = CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND;
            }
            LogWrapperKt.log(logIntent, str2);
            postPendingPurchasesAndFetchCustomerInfo$default(this, str, z10, z11, null, 8, null);
        }
    }

    public final void retrieveCustomerInfo(String str, CacheFetchPolicy cacheFetchPolicy, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("fetchPolicy", cacheFetchPolicy);
        LogUtilsKt.debugLog(String.format(CustomerInfoStrings.RETRIEVING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{cacheFetchPolicy}, 1)));
        int i10 = WhenMappings.$EnumSwitchMapping$0[cacheFetchPolicy.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        getCustomerInfoNotStaledCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
                        return;
                    }
                    return;
                }
                getCustomerInfoCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
                return;
            }
            postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
            return;
        }
        getCustomerInfoCacheOnly(str, receiveCustomerInfoCallback);
    }

    public /* synthetic */ CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, Handler handler, int i10, g gVar) {
        this(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, (i10 & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}

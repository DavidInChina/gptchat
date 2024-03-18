package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.t;
import kf.v;
import kotlin.Metadata;
import l8.AbstractC4344b;
import wf.k;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\b1\u00102J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0014\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u000f\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00052\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\"\u0010&\u001a\u0004\u0018\u00010\u00102\b\u0010%\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010'RN\u0010,\u001a<\u0012\u0004\u0012\u00020\t\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u000f0*j\u0002`+0)0(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0013\u00100\u001a\u0004\u0018\u00010\u00108F\u00a2\u0006\u0006\u001a\u0004\b.\u0010/\u00a8\u00063"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "", "", "isOfflineEntitlementsEnabled", "()Z", "Ljf/y;", "resetOfflineCustomerInfoCache", "()V", "isServerError", "", "appUserId", "shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest", "(ZLjava/lang/String;)Z", "shouldCalculateOfflineCustomerInfoInPostReceipt", "(Z)Z", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "calculateAndCacheOfflineCustomerInfo", "(Ljava/lang/String;Lwf/k;Lwf/k;)V", "completion", "updateProductEntitlementMappingCacheIfStale", "(Lwf/k;)V", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "offlineCustomerInfoCalculator", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "<set-?>", "_offlineCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "", "", "Ljf/i;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCallback;", "offlineCustomerInfoCallbackCache", "Ljava/util/Map;", "getOfflineCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "offlineCustomerInfo", "<init>", "(Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/AppConfig;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OfflineEntitlementsManager {
    private CustomerInfo _offlineCustomerInfo;
    private final AppConfig appConfig;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final OfflineCustomerInfoCalculator offlineCustomerInfoCalculator;
    private final Map<String, List<C3959i>> offlineCustomerInfoCallbackCache = new LinkedHashMap();

    public OfflineEntitlementsManager(Backend backend, OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, DeviceCache deviceCache, AppConfig appConfig) {
        AbstractC3557B.c0("backend", backend);
        AbstractC3557B.c0("offlineCustomerInfoCalculator", offlineCustomerInfoCalculator);
        AbstractC3557B.c0("deviceCache", deviceCache);
        AbstractC3557B.c0("appConfig", appConfig);
        this.backend = backend;
        this.offlineCustomerInfoCalculator = offlineCustomerInfoCalculator;
        this.deviceCache = deviceCache;
        this.appConfig = appConfig;
    }

    private final boolean isOfflineEntitlementsEnabled() {
        if (this.appConfig.getFinishTransactions() && this.appConfig.getEnableOfflineEntitlements() && !this.appConfig.getCustomEntitlementComputation()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void updateProductEntitlementMappingCacheIfStale$default(OfflineEntitlementsManager offlineEntitlementsManager, k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = null;
        }
        offlineEntitlementsManager.updateProductEntitlementMappingCacheIfStale(kVar);
    }

    public final void calculateAndCacheOfflineCustomerInfo(String str, k kVar, k kVar2) {
        AbstractC3557B.c0("appUserId", str);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        if (!this.appConfig.getEnableOfflineEntitlements()) {
            kVar2.invoke(new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_NOT_ENABLED));
            return;
        }
        synchronized (this) {
            boolean containsKey = this.offlineCustomerInfoCallbackCache.containsKey(str);
            List<C3959i> list = this.offlineCustomerInfoCallbackCache.get(str);
            if (list == null) {
                list = v.f37483Y;
            }
            this.offlineCustomerInfoCallbackCache.put(str, t.w2(AbstractC4344b.F0(new C3959i(kVar, kVar2)), list));
            if (containsKey) {
                LogUtilsKt.debugLog(String.format(OfflineEntitlementsStrings.ALREADY_CALCULATING_OFFLINE_CUSTOMER_INFO, Arrays.copyOf(new Object[]{str}, 1)));
            } else {
                this.offlineCustomerInfoCalculator.computeOfflineCustomerInfo(str, new OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$2(this, str), new OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$3(this, str));
            }
        }
    }

    public final CustomerInfo getOfflineCustomerInfo() {
        return this._offlineCustomerInfo;
    }

    public final synchronized void resetOfflineCustomerInfoCache() {
        if (this._offlineCustomerInfo != null) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.RESETTING_OFFLINE_CUSTOMER_INFO_CACHE);
            this._offlineCustomerInfo = null;
        }
    }

    public final boolean shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(boolean z10, String str) {
        AbstractC3557B.c0("appUserId", str);
        if (z10 && isOfflineEntitlementsEnabled() && this.deviceCache.getCachedCustomerInfo(str) == null) {
            return true;
        }
        return false;
    }

    public final boolean shouldCalculateOfflineCustomerInfoInPostReceipt(boolean z10) {
        if (z10 && isOfflineEntitlementsEnabled()) {
            return true;
        }
        return false;
    }

    public final void updateProductEntitlementMappingCacheIfStale(k kVar) {
        if (isOfflineEntitlementsEnabled() && this.deviceCache.isProductEntitlementMappingCacheStale()) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.UPDATING_PRODUCT_ENTITLEMENT_MAPPING);
            this.backend.getProductEntitlementMapping(new OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$1(this, kVar), new OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$2(kVar));
        } else if (kVar != null) {
            kVar.invoke(null);
        }
    }
}

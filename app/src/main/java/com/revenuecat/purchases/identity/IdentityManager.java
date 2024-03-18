package com.revenuecat.purchases.identity;

import Lg.i;
import Lg.n;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import wf.k;
import y.AbstractC6463a;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00105\u001a\u000204\u00a2\u0006\u0004\b<\u0010=J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0016\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0016\u0010\nJC\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u001a\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001f\u0010\nJ#\u0010!\u001a\u00020\u00052\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u00050\u001a\u00a2\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\r\u00a2\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00109R\u0011\u0010;\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b:\u0010\u0013\u00a8\u0006>"}, d2 = {"Lcom/revenuecat/purchases/identity/IdentityManager;", "", "", "oldAppUserId", "newAppUserId", "Ljf/y;", "copySubscriberAttributesToNewUserIfOldIsAnonymous", "(Ljava/lang/String;Ljava/lang/String;)V", "appUserID", "invalidateCustomerInfoAndETagCacheIfNeeded", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "shouldInvalidateCustomerInfoAndETagCache", "(Lcom/revenuecat/purchases/CustomerInfo;)Z", "isUserIDAnonymous", "(Ljava/lang/String;)Z", "generateRandomID", "()Ljava/lang/String;", "newUserID", "resetAndSaveUserID", "configure", "newAppUserID", "Lkotlin/Function2;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "logIn", "(Ljava/lang/String;Lwf/n;Lwf/k;)V", "switchUser", "completion", "logOut", "(Lwf/k;)V", "currentUserIsAnonymous", "()Z", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "subscriberAttributesCache", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "LLg/i;", "anonymousIdRegex", "LLg/i;", "getCurrentAppUserID", "currentAppUserID", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class IdentityManager {
    private final i anonymousIdRegex = new i("^\\$RCAnonymousID:([a-f0-9]{32})$");
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final OfferingsCache offeringsCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final SubscriberAttributesCache subscriberAttributesCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    public IdentityManager(DeviceCache deviceCache, SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesManager subscriberAttributesManager, OfferingsCache offeringsCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager) {
        AbstractC3557B.c0("deviceCache", deviceCache);
        AbstractC3557B.c0("subscriberAttributesCache", subscriberAttributesCache);
        AbstractC3557B.c0("subscriberAttributesManager", subscriberAttributesManager);
        AbstractC3557B.c0("offeringsCache", offeringsCache);
        AbstractC3557B.c0("backend", backend);
        AbstractC3557B.c0("offlineEntitlementsManager", offlineEntitlementsManager);
        this.deviceCache = deviceCache;
        this.subscriberAttributesCache = subscriberAttributesCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copySubscriberAttributesToNewUserIfOldIsAnonymous(String str, String str2) {
        if (isUserIDAnonymous(str)) {
            this.subscriberAttributesManager.copyUnsyncedSubscriberAttributes(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateRandomID() {
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("randomUUID().toString()", uuid);
        Locale locale = Locale.ROOT;
        String A22 = n.A2(AbstractC6463a.j("ROOT", locale, uuid, locale, "this as java.lang.String).toLowerCase(locale)"), "-", "");
        LogWrapperKt.log(LogIntent.USER, IdentityStrings.SETTING_NEW_ANON_ID);
        return "$RCAnonymousID:".concat(A22);
    }

    private final void invalidateCustomerInfoAndETagCacheIfNeeded(String str) {
        if (shouldInvalidateCustomerInfoAndETagCache(this.deviceCache.getCachedCustomerInfo(str))) {
            LogUtilsKt.infoLog(IdentityStrings.INVALIDATING_CACHED_CUSTOMER_INFO);
            this.deviceCache.clearCustomerInfoCache(str);
            this.backend.clearCaches();
        }
    }

    private final boolean isUserIDAnonymous(String str) {
        return this.anonymousIdRegex.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void resetAndSaveUserID(String str) {
        this.deviceCache.clearCachesForAppUserID(getCurrentAppUserID());
        this.offeringsCache.clearCache();
        this.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(getCurrentAppUserID());
        this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
        this.deviceCache.cacheAppUserID(str);
        this.backend.clearCaches();
    }

    private final boolean shouldInvalidateCustomerInfoAndETagCache(CustomerInfo customerInfo) {
        if (customerInfo != null && customerInfo.getEntitlements().getVerification() == VerificationResult.NOT_REQUESTED && !AbstractC3557B.K(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE)) {
            return true;
        }
        return false;
    }

    public final synchronized void configure(String str) {
        if (str != null) {
            try {
                if (n.n2(str)) {
                    LogWrapperKt.log(LogIntent.WARNING, IdentityStrings.EMPTY_APP_USER_ID_WILL_BECOME_ANONYMOUS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str != null) {
            if (n.n2(str)) {
                str = null;
            }
            if (str != null) {
                LogWrapperKt.log(LogIntent.USER, String.format(IdentityStrings.IDENTIFYING_APP_USER_ID, Arrays.copyOf(new Object[]{str}, 1)));
                this.deviceCache.cacheAppUserID(str);
                this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(str);
                this.deviceCache.cleanupOldAttributionData();
                invalidateCustomerInfoAndETagCacheIfNeeded(str);
            }
        }
        str = this.deviceCache.getCachedAppUserID();
        if (str == null && (str = this.deviceCache.getLegacyCachedAppUserID()) == null) {
            str = generateRandomID();
        }
        LogWrapperKt.log(LogIntent.USER, String.format(IdentityStrings.IDENTIFYING_APP_USER_ID, Arrays.copyOf(new Object[]{str}, 1)));
        this.deviceCache.cacheAppUserID(str);
        this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(str);
        this.deviceCache.cleanupOldAttributionData();
        invalidateCustomerInfoAndETagCacheIfNeeded(str);
    }

    public final synchronized boolean currentUserIsAnonymous() {
        boolean z10;
        try {
            String cachedAppUserID = this.deviceCache.getCachedAppUserID();
            if (cachedAppUserID == null) {
                cachedAppUserID = "";
            }
            boolean isUserIDAnonymous = isUserIDAnonymous(cachedAppUserID);
            boolean K10 = AbstractC3557B.K(this.deviceCache.getCachedAppUserID(), this.deviceCache.getLegacyCachedAppUserID());
            if (!isUserIDAnonymous && !K10) {
                z10 = false;
            } else {
                z10 = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    public final String getCurrentAppUserID() {
        String cachedAppUserID = this.deviceCache.getCachedAppUserID();
        if (cachedAppUserID == null) {
            return "";
        }
        return cachedAppUserID;
    }

    public final void logIn(String str, wf.n nVar, k kVar) {
        AbstractC3557B.c0("newAppUserID", str);
        AbstractC3557B.c0("onSuccess", nVar);
        AbstractC3557B.c0("onError", kVar);
        if (n.n2(str)) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.InvalidAppUserIdError, IdentityStrings.LOG_IN_ERROR_MISSING_APP_USER_ID);
            LogUtilsKt.errorLog(purchasesError);
            kVar.invoke(purchasesError);
            return;
        }
        LogWrapperKt.log(LogIntent.USER, String.format(IdentityStrings.LOGGING_IN, Arrays.copyOf(new Object[]{getCurrentAppUserID(), str}, 2)));
        this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, new IdentityManager$logIn$2(this, getCurrentAppUserID(), str, kVar, nVar));
    }

    public final synchronized void logOut(k kVar) {
        AbstractC3557B.c0("completion", kVar);
        if (currentUserIsAnonymous()) {
            LogWrapperKt.log(LogIntent.RC_ERROR, IdentityStrings.LOG_OUT_CALLED_ON_ANONYMOUS_USER);
            kVar.invoke(new PurchasesError(PurchasesErrorCode.LogOutWithAnonymousUserError, null, 2, null));
            return;
        }
        this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getCurrentAppUserID(), new IdentityManager$logOut$1(this, kVar));
    }

    public final void switchUser(String str) {
        AbstractC3557B.c0("newAppUserID", str);
        LogUtilsKt.debugLog(String.format(IdentityStrings.SWITCHING_USER, Arrays.copyOf(new Object[]{str}, 1)));
        resetAndSaveUserID(str);
    }
}

package com.revenuecat.purchases.common.caching;

import Lg.n;
import R4.b;
import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.strings.ReceiptStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.AbstractC3957g;
import kf.AbstractC4268D;
import kf.s;
import kf.t;
import kf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.json.JSONException;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\b\u0010\u0018\u0000 \u0081\u00012\u00020\u0001:\u0002\u0081\u0001B\"\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u0010\\\u001a\u00020\u0002\u0012\b\b\u0002\u0010_\u001a\u00020^\u00a2\u0006\u0005\b\u007f\u0010\u0080\u0001J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0018\u0010\tJ\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0019\u0010\tJ\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001a\u0010\tJ\u001d\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0002\u00a2\u0006\u0004\b \u0010\tJ\u0011\u0010!\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b!\u0010\u0004J\r\u0010\"\u001a\u00020\u0007\u00a2\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$\u00a2\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0002\u00a2\u0006\u0004\b(\u0010\tJ\u001b\u0010*\u001a\u00020\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020$\u00a2\u0006\u0004\b*\u0010+J'\u0010/\u001a\b\u0012\u0004\u0012\u00020-0.2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0,\u00a2\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u0004\u0018\u000101\u00a2\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000201\u00a2\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0007\u00a2\u0006\u0004\b7\u0010#J\u0015\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u000208\u00a2\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0007\u00a2\u0006\u0004\b<\u0010#J\r\u0010=\u001a\u00020\u0014\u00a2\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u0004\u0018\u000108\u00a2\u0006\u0004\b?\u0010@J\u0019\u0010B\u001a\u0004\u0018\u0001012\u0006\u0010A\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\bF\u0010GJ\u0015\u0010H\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0002\u00a2\u0006\u0004\bH\u0010\tJ\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010D\u001a\u00020\u0002\u00a2\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u0002\u00a2\u0006\u0004\bK\u0010\fJ\u0013\u0010M\u001a\u00020L*\u00020LH\u0002\u00a2\u0006\u0004\bM\u0010NJ\u0013\u0010O\u001a\u00020L*\u00020LH\u0002\u00a2\u0006\u0004\bO\u0010NJ\u001b\u0010\u0018\u001a\u00020L*\u00020L2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0018\u0010PJ\u0017\u0010Q\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\bQ\u0010RJ\u001d\u0010T\u001a\u00020\u00072\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0002\u00a2\u0006\u0004\bT\u0010+J\u0017\u0010U\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\bU\u0010VJ\u0011\u0010W\u001a\u0004\u0018\u00010\u001bH\u0002\u00a2\u0006\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b_\u0010`R\u001b\u0010d\u001a\u00020\u00028BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010\u0004R\u001b\u0010g\u001a\u00020\u00028FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\be\u0010b\u001a\u0004\bf\u0010\u0004R\u001b\u0010j\u001a\u00020\u00028FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bh\u0010b\u001a\u0004\bi\u0010\u0004R\u001a\u0010k\u001a\u00020\u00028\u0000X\u0080D\u00a2\u0006\f\n\u0004\bk\u0010]\u001a\u0004\bl\u0010\u0004R\u001b\u0010o\u001a\u00020\u00028FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bm\u0010b\u001a\u0004\bn\u0010\u0004R\u001b\u0010r\u001a\u00020\u00028FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bp\u0010b\u001a\u0004\bq\u0010\u0004R\u001b\u0010u\u001a\u00020\u00028BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bs\u0010b\u001a\u0004\bt\u0010\u0004R\u001b\u0010x\u001a\u00020\u00028BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bv\u0010b\u001a\u0004\bw\u0010\u0004R\u001b\u0010{\u001a\u00020\u00028BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\by\u0010b\u001a\u0004\bz\u0010\u0004R\u001b\u0010~\u001a\u00020\u00028BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b|\u0010b\u001a\u0004\b}\u0010\u0004\u00a8\u0006\u0082\u0001"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "", "getLegacyCachedAppUserID", "()Ljava/lang/String;", "getCachedAppUserID", "appUserID", "Ljf/y;", "cacheAppUserID", "(Ljava/lang/String;)V", "clearCachesForAppUserID", "customerInfoCacheKey", "(Ljava/lang/String;)Ljava/lang/String;", "customerInfoLastUpdatedCacheKey", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", ParameterNames.INFO, "cacheCustomerInfo", "(Ljava/lang/String;Lcom/revenuecat/purchases/CustomerInfo;)V", "", "appInBackground", "isCustomerInfoCacheStale", "(Ljava/lang/String;Z)Z", "clearCustomerInfoCacheTimestamp", "clearCustomerInfoCache", "setCustomerInfoCacheTimestampToNow", "Ljava/util/Date;", "date", "setCustomerInfoCacheTimestamp", "(Ljava/lang/String;Ljava/util/Date;)V", "countryCode", "setStorefront", "getStorefront", "cleanupOldAttributionData", "()V", "", "getPreviouslySentHashedTokens", "()Ljava/util/Set;", "token", "addSuccessfullyPostedToken", "hashedTokens", "cleanPreviouslySentTokens", "(Ljava/util/Set;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "", "getActivePurchasesNotInCache", "(Ljava/util/Map;)Ljava/util/List;", "Lorg/json/JSONObject;", "getOfferingsResponseCache", "()Lorg/json/JSONObject;", "offeringsResponse", "cacheOfferingsResponse", "(Lorg/json/JSONObject;)V", "clearOfferingsResponseCache", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "cacheProductEntitlementMapping", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "setProductEntitlementMappingCacheTimestampToNow", "isProductEntitlementMappingCacheStale", "()Z", "getProductEntitlementMapping", "()Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", SubscriberAttributeKt.JSON_NAME_KEY, "getJSONObjectOrNull", "(Ljava/lang/String;)Lorg/json/JSONObject;", "cacheKey", "value", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "remove", "findKeysThatStartWith", "(Ljava/lang/String;)Ljava/util/Set;", "newKey", "Landroid/content/SharedPreferences$Editor;", "clearCustomerInfo", "(Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearAppUserID", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "getCustomerInfoCachesLastUpdated", "(Ljava/lang/String;)Ljava/util/Date;", "newSet", "setSavedTokenHashes", "setProductEntitlementMappingCacheTimestamp", "(Ljava/util/Date;)V", "getProductEntitlementMappingLastUpdated", "()Ljava/util/Date;", "Landroid/content/SharedPreferences;", "preferences", "Landroid/content/SharedPreferences;", "apiKey", "Ljava/lang/String;", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "apiKeyPrefix$delegate", "Ljf/g;", "getApiKeyPrefix", "apiKeyPrefix", "legacyAppUserIDCacheKey$delegate", "getLegacyAppUserIDCacheKey", "legacyAppUserIDCacheKey", "appUserIDCacheKey$delegate", "getAppUserIDCacheKey", "appUserIDCacheKey", "attributionCacheKey", "getAttributionCacheKey$purchases_customEntitlementComputationRelease", "tokensCacheKey$delegate", "getTokensCacheKey", "tokensCacheKey", "storefrontCacheKey$delegate", "getStorefrontCacheKey", "storefrontCacheKey", "productEntitlementMappingCacheKey$delegate", "getProductEntitlementMappingCacheKey", "productEntitlementMappingCacheKey", "productEntitlementMappingLastUpdatedCacheKey$delegate", "getProductEntitlementMappingLastUpdatedCacheKey", "productEntitlementMappingLastUpdatedCacheKey", "customerInfoCachesLastUpdatedCacheBaseKey$delegate", "getCustomerInfoCachesLastUpdatedCacheBaseKey", "customerInfoCachesLastUpdatedCacheBaseKey", "offeringsResponseCacheKey$delegate", "getOfferingsResponseCacheKey", "offeringsResponseCacheKey", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;)V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class DeviceCache implements StorefrontProvider {
    private static final String CUSTOMER_INFO_REQUEST_DATE_KEY = "customer_info_request_date";
    private static final String CUSTOMER_INFO_SCHEMA_VERSION_KEY = "schema_version";
    private static final String CUSTOMER_INFO_VERIFICATION_RESULT_KEY = "verification_result";
    public static final Companion Companion = new Companion(null);
    private final String apiKey;
    private final AbstractC3957g apiKeyPrefix$delegate;
    private final AbstractC3957g appUserIDCacheKey$delegate;
    private final String attributionCacheKey;
    private final AbstractC3957g customerInfoCachesLastUpdatedCacheBaseKey$delegate;
    private final DateProvider dateProvider;
    private final AbstractC3957g legacyAppUserIDCacheKey$delegate;
    private final AbstractC3957g offeringsResponseCacheKey$delegate;
    private final SharedPreferences preferences;
    private final AbstractC3957g productEntitlementMappingCacheKey$delegate;
    private final AbstractC3957g productEntitlementMappingLastUpdatedCacheKey$delegate;
    private final AbstractC3957g storefrontCacheKey$delegate;
    private final AbstractC3957g tokensCacheKey$delegate;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache$Companion;", "", "()V", "CUSTOMER_INFO_REQUEST_DATE_KEY", "", "CUSTOMER_INFO_SCHEMA_VERSION_KEY", "CUSTOMER_INFO_VERIFICATION_RESULT_KEY", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider) {
        AbstractC3557B.c0("preferences", sharedPreferences);
        AbstractC3557B.c0("apiKey", str);
        AbstractC3557B.c0("dateProvider", dateProvider);
        this.preferences = sharedPreferences;
        this.apiKey = str;
        this.dateProvider = dateProvider;
        this.apiKeyPrefix$delegate = b.D1(new DeviceCache$apiKeyPrefix$2(this));
        this.legacyAppUserIDCacheKey$delegate = b.D1(new DeviceCache$legacyAppUserIDCacheKey$2(this));
        this.appUserIDCacheKey$delegate = b.D1(new DeviceCache$appUserIDCacheKey$2(this));
        this.attributionCacheKey = "com.revenuecat.purchases..attribution";
        this.tokensCacheKey$delegate = b.D1(new DeviceCache$tokensCacheKey$2(this));
        this.storefrontCacheKey$delegate = b.D1(DeviceCache$storefrontCacheKey$2.INSTANCE);
        this.productEntitlementMappingCacheKey$delegate = b.D1(new DeviceCache$productEntitlementMappingCacheKey$2(this));
        this.productEntitlementMappingLastUpdatedCacheKey$delegate = b.D1(new DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2(this));
        this.customerInfoCachesLastUpdatedCacheBaseKey$delegate = b.D1(new DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2(this));
        this.offeringsResponseCacheKey$delegate = b.D1(new DeviceCache$offeringsResponseCacheKey$2(this));
    }

    private final SharedPreferences.Editor clearAppUserID(SharedPreferences.Editor editor) {
        editor.remove(getAppUserIDCacheKey());
        editor.remove(getLegacyAppUserIDCacheKey());
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfo(SharedPreferences.Editor editor) {
        String cachedAppUserID = getCachedAppUserID();
        if (cachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(cachedAppUserID));
        }
        String legacyCachedAppUserID = getLegacyCachedAppUserID();
        if (legacyCachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(legacyCachedAppUserID));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfoCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(customerInfoLastUpdatedCacheKey(str));
        return editor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getApiKeyPrefix() {
        return (String) this.apiKeyPrefix$delegate.getValue();
    }

    private final synchronized Date getCustomerInfoCachesLastUpdated(String str) {
        return new Date(this.preferences.getLong(customerInfoLastUpdatedCacheKey(str), 0L));
    }

    private final String getCustomerInfoCachesLastUpdatedCacheBaseKey() {
        return (String) this.customerInfoCachesLastUpdatedCacheBaseKey$delegate.getValue();
    }

    private final String getOfferingsResponseCacheKey() {
        return (String) this.offeringsResponseCacheKey$delegate.getValue();
    }

    private final String getProductEntitlementMappingCacheKey() {
        return (String) this.productEntitlementMappingCacheKey$delegate.getValue();
    }

    private final Date getProductEntitlementMappingLastUpdated() {
        if (this.preferences.contains(getProductEntitlementMappingLastUpdatedCacheKey())) {
            return new Date(this.preferences.getLong(getProductEntitlementMappingLastUpdatedCacheKey(), -1L));
        }
        return null;
    }

    private final String getProductEntitlementMappingLastUpdatedCacheKey() {
        return (String) this.productEntitlementMappingLastUpdatedCacheKey$delegate.getValue();
    }

    private final void setProductEntitlementMappingCacheTimestamp(Date date) {
        this.preferences.edit().putLong(getProductEntitlementMappingLastUpdatedCacheKey(), date.getTime()).apply();
    }

    private final synchronized void setSavedTokenHashes(Set<String> set) {
        LogWrapperKt.log(LogIntent.DEBUG, String.format(ReceiptStrings.SAVING_TOKENS, Arrays.copyOf(new Object[]{set}, 1)));
        this.preferences.edit().putStringSet(getTokensCacheKey(), set).apply();
    }

    public final synchronized void addSuccessfullyPostedToken(String str) {
        AbstractC3557B.c0("token", str);
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, String.format(ReceiptStrings.SAVING_TOKENS_WITH_HASH, Arrays.copyOf(new Object[]{str, UtilsKt.sha1(str)}, 2)));
        Set<String> previouslySentHashedTokens = getPreviouslySentHashedTokens();
        LogWrapperKt.log(logIntent, String.format(ReceiptStrings.TOKENS_IN_CACHE, Arrays.copyOf(new Object[]{previouslySentHashedTokens}, 1)));
        Set<String> O22 = t.O2(previouslySentHashedTokens);
        O22.add(UtilsKt.sha1(str));
        setSavedTokenHashes(O22);
    }

    public final synchronized void cacheAppUserID(String str) {
        AbstractC3557B.c0("appUserID", str);
        this.preferences.edit().putString(getAppUserIDCacheKey(), str).apply();
    }

    public final synchronized void cacheCustomerInfo(String str, CustomerInfo customerInfo) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0(ParameterNames.INFO, customerInfo);
        JSONObject rawData = customerInfo.getRawData();
        rawData.put(CUSTOMER_INFO_SCHEMA_VERSION_KEY, 3);
        rawData.put("verification_result", customerInfo.getEntitlements().getVerification().name());
        rawData.put(CUSTOMER_INFO_REQUEST_DATE_KEY, customerInfo.getRequestDate().getTime());
        this.preferences.edit().putString(customerInfoCacheKey(str), rawData.toString()).apply();
        setCustomerInfoCacheTimestampToNow(str);
    }

    public final synchronized void cacheOfferingsResponse(JSONObject jSONObject) {
        AbstractC3557B.c0("offeringsResponse", jSONObject);
        this.preferences.edit().putString(getOfferingsResponseCacheKey(), jSONObject.toString()).apply();
    }

    public final synchronized void cacheProductEntitlementMapping(ProductEntitlementMapping productEntitlementMapping) {
        AbstractC3557B.c0("productEntitlementMapping", productEntitlementMapping);
        this.preferences.edit().putString(getProductEntitlementMappingCacheKey(), productEntitlementMapping.toJson().toString()).apply();
        setProductEntitlementMappingCacheTimestampToNow();
    }

    public final synchronized void cleanPreviouslySentTokens(Set<String> set) {
        AbstractC3557B.c0("hashedTokens", set);
        LogWrapperKt.log(LogIntent.DEBUG, ReceiptStrings.CLEANING_PREV_SENT_HASHED_TOKEN);
        Set<String> previouslySentHashedTokens = getPreviouslySentHashedTokens();
        AbstractC3557B.c0("other", previouslySentHashedTokens);
        Set<String> O22 = t.O2(set);
        O22.retainAll(s.P1(previouslySentHashedTokens));
        setSavedTokenHashes(O22);
    }

    public final synchronized void cleanupOldAttributionData() {
        try {
            SharedPreferences.Editor edit = this.preferences.edit();
            for (String str : this.preferences.getAll().keySet()) {
                if (str != null && n.I2(str, this.attributionCacheKey, false)) {
                    edit.remove(str);
                }
            }
            edit.apply();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void clearCachesForAppUserID(String str) {
        AbstractC3557B.c0("appUserID", str);
        SharedPreferences.Editor edit = this.preferences.edit();
        AbstractC3557B.b0("preferences.edit()", edit);
        clearCustomerInfoCacheTimestamp(clearAppUserID(clearCustomerInfo(edit)), str).apply();
    }

    public final synchronized void clearCustomerInfoCache(String str) {
        AbstractC3557B.c0("appUserID", str);
        SharedPreferences.Editor edit = this.preferences.edit();
        AbstractC3557B.b0("editor", edit);
        clearCustomerInfoCacheTimestamp(edit, str);
        edit.remove(customerInfoCacheKey(str));
        edit.apply();
    }

    public final synchronized void clearOfferingsResponseCache() {
        this.preferences.edit().remove(getOfferingsResponseCacheKey()).apply();
    }

    public final String customerInfoCacheKey(String str) {
        AbstractC3557B.c0("appUserID", str);
        return getLegacyAppUserIDCacheKey() + '.' + str;
    }

    public final String customerInfoLastUpdatedCacheKey(String str) {
        AbstractC3557B.c0("appUserID", str);
        return getCustomerInfoCachesLastUpdatedCacheBaseKey() + '.' + str;
    }

    public final Set<String> findKeysThatStartWith(String str) {
        x xVar = x.f37485Y;
        AbstractC3557B.c0("cacheKey", str);
        try {
            Map<String, ?> all = this.preferences.getAll();
            if (all != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    AbstractC3557B.b0("it", key);
                    if (n.I2(key, str, false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set<String> keySet = linkedHashMap.keySet();
                if (keySet != null) {
                    return keySet;
                }
                return xVar;
            }
            return xVar;
        } catch (NullPointerException unused) {
            return xVar;
        }
    }

    public final synchronized List<StoreTransaction> getActivePurchasesNotInCache(Map<String, StoreTransaction> map) {
        AbstractC3557B.c0("hashedTokens", map);
        return t.K2(AbstractC4268D.b1(getPreviouslySentHashedTokens(), map).values());
    }

    public final String getAppUserIDCacheKey() {
        return (String) this.appUserIDCacheKey$delegate.getValue();
    }

    public final String getAttributionCacheKey$purchases_customEntitlementComputationRelease() {
        return this.attributionCacheKey;
    }

    public final synchronized String getCachedAppUserID() {
        return this.preferences.getString(getAppUserIDCacheKey(), null);
    }

    public final CustomerInfo getCachedCustomerInfo(String str) {
        String str2;
        Date date;
        AbstractC3557B.c0("appUserID", str);
        String string = this.preferences.getString(customerInfoCacheKey(str), null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            int optInt = jSONObject.optInt(CUSTOMER_INFO_SCHEMA_VERSION_KEY);
            if (jSONObject.has("verification_result")) {
                str2 = jSONObject.getString("verification_result");
            } else {
                str2 = "NOT_REQUESTED";
            }
            Long valueOf = Long.valueOf(jSONObject.optLong(CUSTOMER_INFO_REQUEST_DATE_KEY));
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                date = new Date(valueOf.longValue());
            } else {
                date = null;
            }
            jSONObject.remove("verification_result");
            jSONObject.remove(CUSTOMER_INFO_REQUEST_DATE_KEY);
            AbstractC3557B.b0("verificationResultString", str2);
            VerificationResult valueOf2 = VerificationResult.valueOf(str2);
            if (optInt != 3) {
                return null;
            }
            return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, date, valueOf2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONObject getJSONObjectOrNull(String str) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        String string = this.preferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String getLegacyAppUserIDCacheKey() {
        return (String) this.legacyAppUserIDCacheKey$delegate.getValue();
    }

    public final synchronized String getLegacyCachedAppUserID() {
        return this.preferences.getString(getLegacyAppUserIDCacheKey(), null);
    }

    public final synchronized JSONObject getOfferingsResponseCache() {
        return getJSONObjectOrNull(getOfferingsResponseCacheKey());
    }

    public final synchronized Set<String> getPreviouslySentHashedTokens() {
        Set<String> set;
        try {
            try {
                SharedPreferences sharedPreferences = this.preferences;
                String tokensCacheKey = getTokensCacheKey();
                set = x.f37485Y;
                Set<String> stringSet = sharedPreferences.getStringSet(tokensCacheKey, set);
                if (stringSet != null) {
                    set = t.P2(stringSet);
                }
                LogWrapperKt.log(LogIntent.DEBUG, String.format(ReceiptStrings.TOKENS_ALREADY_POSTED, Arrays.copyOf(new Object[]{set}, 1)));
            } catch (ClassCastException unused) {
                set = x.f37485Y;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return set;
    }

    public final synchronized ProductEntitlementMapping getProductEntitlementMapping() {
        ProductEntitlementMapping productEntitlementMapping = null;
        String string = this.preferences.getString(getProductEntitlementMappingCacheKey(), null);
        if (string == null) {
            return null;
        }
        try {
            productEntitlementMapping = ProductEntitlementMapping.Companion.fromJson(new JSONObject(string));
        } catch (JSONException e10) {
            LogUtilsKt.errorLog(String.format(OfflineEntitlementsStrings.ERROR_PARSING_PRODUCT_ENTITLEMENT_MAPPING, Arrays.copyOf(new Object[]{string}, 1)), e10);
            this.preferences.edit().remove(getProductEntitlementMappingCacheKey()).apply();
        }
        return productEntitlementMapping;
    }

    @Override // com.revenuecat.purchases.interfaces.StorefrontProvider
    public synchronized String getStorefront() {
        String string;
        string = this.preferences.getString(getStorefrontCacheKey(), null);
        if (string == null) {
            LogUtilsKt.debugLog(BillingStrings.BILLING_STOREFRONT_NULL_FROM_CACHE);
        }
        return string;
    }

    public final String getStorefrontCacheKey() {
        return (String) this.storefrontCacheKey$delegate.getValue();
    }

    public final String getTokensCacheKey() {
        return (String) this.tokensCacheKey$delegate.getValue();
    }

    public final synchronized boolean isCustomerInfoCacheStale(String str, boolean z10) {
        AbstractC3557B.c0("appUserID", str);
        return DateExtensionsKt.isCacheStale(getCustomerInfoCachesLastUpdated(str), z10, this.dateProvider);
    }

    public final synchronized boolean isProductEntitlementMappingCacheStale() {
        return DateExtensionsKt.m60isCacheStale8Mi8wO0(getProductEntitlementMappingLastUpdated(), DeviceCacheKt.access$getPRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD$p(), this.dateProvider);
    }

    public final String newKey(String str) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        return getApiKeyPrefix() + '.' + str;
    }

    public void putString(String str, String str2) {
        AbstractC3557B.c0("cacheKey", str);
        AbstractC3557B.c0("value", str2);
        this.preferences.edit().putString(str, str2).apply();
    }

    public final void remove(String str) {
        AbstractC3557B.c0("cacheKey", str);
        this.preferences.edit().remove(str).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestamp(String str, Date date) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("date", date);
        this.preferences.edit().putLong(customerInfoLastUpdatedCacheKey(str), date.getTime()).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestampToNow(String str) {
        AbstractC3557B.c0("appUserID", str);
        setCustomerInfoCacheTimestamp(str, this.dateProvider.getNow());
    }

    public final synchronized void setProductEntitlementMappingCacheTimestampToNow() {
        setProductEntitlementMappingCacheTimestamp(this.dateProvider.getNow());
    }

    public final synchronized void setStorefront(String str) {
        AbstractC3557B.c0("countryCode", str);
        LogUtilsKt.verboseLog(String.format(BillingStrings.BILLING_STOREFRONT_CACHING, Arrays.copyOf(new Object[]{str}, 1)));
        this.preferences.edit().putString(getStorefrontCacheKey(), str).apply();
    }

    public final synchronized void clearCustomerInfoCacheTimestamp(String str) {
        AbstractC3557B.c0("appUserID", str);
        SharedPreferences.Editor edit = this.preferences.edit();
        AbstractC3557B.b0("preferences.edit()", edit);
        clearCustomerInfoCacheTimestamp(edit, str).apply();
    }

    public /* synthetic */ DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider, int i10, g gVar) {
        this(sharedPreferences, str, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}

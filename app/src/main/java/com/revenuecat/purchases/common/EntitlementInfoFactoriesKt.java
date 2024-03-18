package com.revenuecat.purchases.common;

import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.responses.EntitlementsResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.DateActive;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\"\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u001a,\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a,\u0010\u0012\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0000\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0000\u00a8\u0006\u001c"}, d2 = {"getWillRenew", "", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "expirationDate", "Ljava/util/Date;", "unsubscribeDetectedAt", "billingIssueDetectedAt", "isDateActive", "identifier", "", "requestDate", "buildEntitlementInfo", "Lcom/revenuecat/purchases/EntitlementInfo;", "Lorg/json/JSONObject;", "productData", "verificationResult", "Lcom/revenuecat/purchases/VerificationResult;", "buildEntitlementInfos", "Lcom/revenuecat/purchases/EntitlementInfos;", CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, "nonSubscriptionsLatestPurchases", "getStore", "name", "optOwnershipType", "Lcom/revenuecat/purchases/OwnershipType;", "optPeriodType", "Lcom/revenuecat/purchases/PeriodType;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class EntitlementInfoFactoriesKt {
    public static final EntitlementInfo buildEntitlementInfo(JSONObject jSONObject, String str, JSONObject jSONObject2, Date date, VerificationResult verificationResult) {
        AbstractC3557B.c0("<this>", jSONObject);
        AbstractC3557B.c0("identifier", str);
        AbstractC3557B.c0("productData", jSONObject2);
        AbstractC3557B.c0("requestDate", date);
        AbstractC3557B.c0("verificationResult", verificationResult);
        Date optDate = JSONObjectExtensionsKt.optDate(jSONObject, "expires_date");
        Date optDate2 = JSONObjectExtensionsKt.optDate(jSONObject2, ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT);
        Date optDate3 = JSONObjectExtensionsKt.optDate(jSONObject2, ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT);
        Store store = getStore(jSONObject2, ProductResponseJsonKeys.STORE);
        boolean isDateActive = isDateActive(str, optDate, date);
        boolean willRenew = getWillRenew(store, optDate, optDate2, optDate3);
        PeriodType optPeriodType = optPeriodType(jSONObject2, ProductResponseJsonKeys.PERIOD_TYPE);
        Date date2 = JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date");
        Date date3 = JSONObjectExtensionsKt.getDate(jSONObject2, "original_purchase_date");
        String string = jSONObject.getString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
        AbstractC3557B.b0("getString(EntitlementsRe\u2026nKeys.PRODUCT_IDENTIFIER)", string);
        return new EntitlementInfo(str, isDateActive, willRenew, optPeriodType, date2, date3, optDate, store, string, JSONObjectExtensionsKt.optNullableString(jSONObject, "product_plan_identifier"), jSONObject2.getBoolean(ProductResponseJsonKeys.IS_SANDBOX), optDate2, optDate3, optOwnershipType(jSONObject2, ProductResponseJsonKeys.OWNERSHIP_TYPE), jSONObject, verificationResult);
    }

    public static final EntitlementInfos buildEntitlementInfos(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Date date, VerificationResult verificationResult) {
        AbstractC3557B.c0("<this>", jSONObject);
        AbstractC3557B.c0(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, jSONObject2);
        AbstractC3557B.c0("nonSubscriptionsLatestPurchases", jSONObject3);
        AbstractC3557B.c0("requestDate", date);
        AbstractC3557B.c0("verificationResult", verificationResult);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        AbstractC3557B.b0("keys()", keys);
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject4 = jSONObject.getJSONObject(next);
            String optString = jSONObject4.optString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
            AbstractC3557B.b0("it", optString);
            if (optString.length() <= 0) {
                optString = null;
            }
            if (optString != null) {
                if (jSONObject2.has(optString)) {
                    AbstractC3557B.b0("entitlementId", next);
                    JSONObject jSONObject5 = jSONObject2.getJSONObject(optString);
                    AbstractC3557B.b0("subscriptions.getJSONObject(productIdentifier)", jSONObject5);
                    linkedHashMap.put(next, buildEntitlementInfo(jSONObject4, next, jSONObject5, date, verificationResult));
                } else if (jSONObject3.has(optString)) {
                    AbstractC3557B.b0("entitlementId", next);
                    JSONObject jSONObject6 = jSONObject3.getJSONObject(optString);
                    AbstractC3557B.b0("nonSubscriptionsLatestPu\u2026Object(productIdentifier)", jSONObject6);
                    linkedHashMap.put(next, buildEntitlementInfo(jSONObject4, next, jSONObject6, date, verificationResult));
                }
            }
        }
        return new EntitlementInfos(linkedHashMap, verificationResult);
    }

    public static final Store getStore(JSONObject jSONObject, String str) {
        AbstractC3557B.c0("<this>", jSONObject);
        AbstractC3557B.c0("name", str);
        String string = jSONObject.getString(str);
        if (string != null) {
            switch (string.hashCode()) {
                case -1414265340:
                    if (string.equals("amazon")) {
                        return Store.AMAZON;
                    }
                    break;
                case -891985843:
                    if (string.equals("stripe")) {
                        return Store.STRIPE;
                    }
                    break;
                case 564036179:
                    if (string.equals("mac_app_store")) {
                        return Store.MAC_APP_STORE;
                    }
                    break;
                case 756050958:
                    if (string.equals("promotional")) {
                        return Store.PROMOTIONAL;
                    }
                    break;
                case 1842542915:
                    if (string.equals("app_store")) {
                        return Store.APP_STORE;
                    }
                    break;
                case 1925951510:
                    if (string.equals("play_store")) {
                        return Store.PLAY_STORE;
                    }
                    break;
            }
        }
        return Store.UNKNOWN_STORE;
    }

    private static final boolean getWillRenew(Store store, Date date, Date date2, Date date3) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (store == Store.PROMOTIONAL) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (date == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (date2 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (date3 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z10 || z11 || z12 || z13) {
            return false;
        }
        return true;
    }

    private static final boolean isDateActive(String str, Date date, Date date2) {
        DateActive m66isDateActiveSxA4cEA$default = DateHelper.Companion.m66isDateActiveSxA4cEA$default(DateHelper.Companion, date, date2, 0L, 4, null);
        if (!m66isDateActiveSxA4cEA$default.isActive() && !m66isDateActiveSxA4cEA$default.getInGracePeriod()) {
            LogUtilsKt.warnLog(String.format(PurchaseStrings.ENTITLEMENT_EXPIRED_OUTSIDE_GRACE_PERIOD, Arrays.copyOf(new Object[]{str, date, date2}, 3)));
        }
        return m66isDateActiveSxA4cEA$default.isActive();
    }

    public static final OwnershipType optOwnershipType(JSONObject jSONObject, String str) {
        AbstractC3557B.c0("<this>", jSONObject);
        AbstractC3557B.c0("name", str);
        String optString = jSONObject.optString(str);
        if (AbstractC3557B.K(optString, "PURCHASED")) {
            return OwnershipType.PURCHASED;
        }
        if (AbstractC3557B.K(optString, "FAMILY_SHARED")) {
            return OwnershipType.FAMILY_SHARED;
        }
        return OwnershipType.UNKNOWN;
    }

    public static final PeriodType optPeriodType(JSONObject jSONObject, String str) {
        AbstractC3557B.c0("<this>", jSONObject);
        AbstractC3557B.c0("name", str);
        String optString = jSONObject.optString(str);
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1039745817) {
                if (hashCode != 100361836) {
                    if (hashCode == 110628630 && optString.equals("trial")) {
                        return PeriodType.TRIAL;
                    }
                } else if (optString.equals("intro")) {
                    return PeriodType.INTRO;
                }
            } else if (optString.equals("normal")) {
                return PeriodType.NORMAL;
            }
        }
        return PeriodType.NORMAL;
    }
}

package com.revenuecat.purchases.common;

import android.net.Uri;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.utils.Iso8601Utils;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import id.AbstractC3557B;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.AbstractC4268D;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ4\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000ej\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n`\u0010*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u001a\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0013*\u00020\bH\u0002J\u001a\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0013*\u00020\bH\u0002\u00a8\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/CustomerInfoFactory;", "", "()V", "buildCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "httpResult", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "body", "Lorg/json/JSONObject;", "overrideRequestDate", "Ljava/util/Date;", "verificationResult", "Lcom/revenuecat/purchases/VerificationResult;", "parseDates", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "jsonKey", "parseExpirations", "", "parsePurchaseDates", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class CustomerInfoFactory {
    public static final CustomerInfoFactory INSTANCE = new CustomerInfoFactory();

    private CustomerInfoFactory() {
    }

    private final HashMap<String, Date> parseDates(JSONObject jSONObject, String str) {
        HashMap<String, Date> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.getJSONObject(next).optString("product_plan_identifier");
            AbstractC3557B.b0("it", optString);
            if (optString.length() <= 0) {
                optString = null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            if (optString != null) {
                String str2 = next + ':' + optString;
                if (str2 != null) {
                    next = str2;
                }
            }
            AbstractC3557B.b0(SubscriberAttributeKt.JSON_NAME_KEY, next);
            AbstractC3557B.b0("expirationObject", jSONObject2);
            hashMap.put(next, JSONObjectExtensionsKt.optDate(jSONObject2, str));
        }
        return hashMap;
    }

    private final Map<String, Date> parseExpirations(JSONObject jSONObject) {
        return parseDates(jSONObject, "expires_date");
    }

    private final Map<String, Date> parsePurchaseDates(JSONObject jSONObject) {
        return parseDates(jSONObject, "purchase_date");
    }

    public final CustomerInfo buildCustomerInfo(HTTPResult hTTPResult) {
        AbstractC3557B.c0("httpResult", hTTPResult);
        return buildCustomerInfo(hTTPResult.getBody(), hTTPResult.getRequestDate(), hTTPResult.getVerificationResult());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
        if (r4 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CustomerInfo buildCustomerInfo(JSONObject jSONObject, Date date, VerificationResult verificationResult) {
        EntitlementInfos entitlementInfos;
        Date date2;
        AbstractC3557B.c0("body", jSONObject);
        AbstractC3557B.c0("verificationResult", verificationResult);
        JSONObject jSONObject2 = jSONObject.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIBER);
        JSONObject jSONObject3 = jSONObject2.getJSONObject(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS);
        JSONObject jSONObject4 = new JSONObject();
        Iterator<String> keys = jSONObject3.keys();
        AbstractC3557B.b0("nonSubscriptions.keys()", keys);
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray jSONArray = jSONObject3.getJSONArray(next);
            int length = jSONArray.length();
            if (length > 0) {
                jSONObject4.put(next, jSONArray.getJSONObject(length - 1));
            }
        }
        JSONObject jSONObject5 = jSONObject2.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS);
        AbstractC3557B.b0(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, jSONObject5);
        Map<String, Date> parseExpirations = parseExpirations(jSONObject5);
        LinkedHashMap e12 = AbstractC4268D.e1(parsePurchaseDates(jSONObject5), parsePurchaseDates(jSONObject4));
        JSONObject optJSONObject = jSONObject2.optJSONObject(CustomerInfoResponseJsonKeys.ENTITLEMENTS);
        Date parse = date == null ? Iso8601Utils.parse(jSONObject.getString(CustomerInfoResponseJsonKeys.REQUEST_DATE)) : date;
        Date parse2 = Iso8601Utils.parse(jSONObject2.getString(CustomerInfoResponseJsonKeys.FIRST_SEEN));
        if (optJSONObject != null) {
            AbstractC3557B.b0("requestDate", parse);
            entitlementInfos = EntitlementInfoFactoriesKt.buildEntitlementInfos(optJSONObject, jSONObject5, jSONObject4, parse, verificationResult);
        }
        Map emptyMap = Collections.emptyMap();
        AbstractC3557B.b0("emptyMap()", emptyMap);
        entitlementInfos = new EntitlementInfos(emptyMap, verificationResult);
        String optNullableString = JSONObjectExtensionsKt.optNullableString(jSONObject2, CustomerInfoResponseJsonKeys.MANAGEMENT_URL);
        String optNullableString2 = JSONObjectExtensionsKt.optNullableString(jSONObject2, "original_purchase_date");
        if (optNullableString2 != null) {
            Date parse3 = Iso8601Utils.parse(optNullableString2);
            if (parse3 == null) {
                parse3 = null;
            }
            date2 = parse3;
        } else {
            date2 = null;
        }
        int optInt = jSONObject.optInt("schema_version", 3);
        String optString = jSONObject2.optString(CustomerInfoResponseJsonKeys.ORIGINAL_APP_USER_ID);
        Uri parse4 = optNullableString != null ? Uri.parse(optNullableString) : null;
        AbstractC3557B.b0("requestDate", parse);
        AbstractC3557B.b0("firstSeen", parse2);
        AbstractC3557B.b0("optString(CustomerInfoRe\u2026eys.ORIGINAL_APP_USER_ID)", optString);
        return new CustomerInfo(entitlementInfos, parseExpirations, e12, parse, optInt, parse2, optString, parse4, date2, jSONObject);
    }
}

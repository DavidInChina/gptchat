package com.revenuecat.purchases.common.offlineentitlements;

import M8.a;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.responses.EntitlementsResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.utils.Iso8601Utils;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import jf.C3959i;
import kf.s;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import wf.k;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010!\u001a\u00020 \u00a2\u0006\u0004\b#\u0010$J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\u00010\u0001H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0011J=\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"\u00a8\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "", "", "appUserID", "", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "purchasedProducts", "Lcom/revenuecat/purchases/CustomerInfo;", "buildCustomerInfoUsingListOfPurchases", "(Ljava/lang/String;Ljava/util/List;)Lcom/revenuecat/purchases/CustomerInfo;", "kotlin.jvm.PlatformType", "determineManagementURL", "()Ljava/lang/Object;", "calculateOriginalPurchaseDate", "(Ljava/util/List;)Ljava/lang/String;", "Lorg/json/JSONObject;", "generateSubscriptions", "(Ljava/util/List;)Lorg/json/JSONObject;", "generateEntitlementsResponse", "Lkotlin/Function1;", "Ljf/y;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "computeOfflineCustomerInfo", "(Ljava/lang/String;Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;", "purchasedProductsFetcher", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "<init>", "(Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/DateProvider;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class OfflineCustomerInfoCalculator {
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final PurchasedProductsFetcher purchasedProductsFetcher;

    public OfflineCustomerInfoCalculator(PurchasedProductsFetcher purchasedProductsFetcher, AppConfig appConfig, DateProvider dateProvider) {
        AbstractC3557B.c0("purchasedProductsFetcher", purchasedProductsFetcher);
        AbstractC3557B.c0("appConfig", appConfig);
        AbstractC3557B.c0("dateProvider", dateProvider);
        this.purchasedProductsFetcher = purchasedProductsFetcher;
        this.appConfig = appConfig;
        this.dateProvider = dateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerInfo buildCustomerInfoUsingListOfPurchases(String str, List<PurchasedProduct> list) {
        JSONObject jSONObject = new JSONObject();
        Date now = this.dateProvider.getNow();
        String format = Iso8601Utils.format(now);
        jSONObject.put(CustomerInfoResponseJsonKeys.REQUEST_DATE, format);
        jSONObject.put(CustomerInfoResponseJsonKeys.REQUEST_DATE_MS, now.getTime());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(CustomerInfoResponseJsonKeys.ORIGINAL_APP_USER_ID, str);
        jSONObject2.put(CustomerInfoResponseJsonKeys.ORIGINAL_APPLICATION_VERSION, "1.0");
        jSONObject2.put(CustomerInfoResponseJsonKeys.ENTITLEMENTS, generateEntitlementsResponse(list));
        jSONObject2.put(CustomerInfoResponseJsonKeys.FIRST_SEEN, format);
        jSONObject2.put("original_purchase_date", calculateOriginalPurchaseDate(list));
        jSONObject2.put(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS, new JSONObject());
        jSONObject2.put(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, generateSubscriptions(list));
        jSONObject2.put(CustomerInfoResponseJsonKeys.MANAGEMENT_URL, determineManagementURL());
        jSONObject.put(CustomerInfoResponseJsonKeys.SUBSCRIBER, jSONObject2);
        return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, now, VerificationResult.VERIFIED_ON_DEVICE);
    }

    private final String calculateOriginalPurchaseDate(List<PurchasedProduct> list) {
        Long l10;
        int i10;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            l10 = null;
        } else {
            l10 = Long.valueOf(((PurchasedProduct) it.next()).getStoreTransaction().getPurchaseTime());
            while (it.hasNext()) {
                Long valueOf = Long.valueOf(((PurchasedProduct) it.next()).getStoreTransaction().getPurchaseTime());
                if (l10.compareTo(valueOf) > 0) {
                    l10 = valueOf;
                }
            }
        }
        if (l10 == null) {
            return null;
        }
        Date date = new Date(l10.longValue());
        TimeZone timeZone = a.f11723a;
        Locale locale = Locale.US;
        TimeZone timeZone2 = a.f11723a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone2, locale);
        gregorianCalendar.setTime(date);
        if (timeZone2.getRawOffset() == 0) {
            i10 = 1;
        } else {
            i10 = 6;
        }
        StringBuilder sb2 = new StringBuilder(19 + i10);
        a.b(sb2, gregorianCalendar.get(1), 4);
        char c10 = '-';
        sb2.append('-');
        a.b(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        a.b(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        a.b(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        a.b(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        a.b(sb2, gregorianCalendar.get(13), 2);
        int offset = timeZone2.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i11 = offset / 60000;
            int abs = Math.abs(i11 / 60);
            int abs2 = Math.abs(i11 % 60);
            if (offset >= 0) {
                c10 = '+';
            }
            sb2.append(c10);
            a.b(sb2, abs, 2);
            sb2.append(':');
            a.b(sb2, abs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    private final Object determineManagementURL() {
        if (this.appConfig.getStore() == Store.PLAY_STORE) {
            return Constants.GOOGLE_PLAY_MANAGEMENT_URL;
        }
        return JSONObject.NULL;
    }

    private final JSONObject generateEntitlementsResponse(List<PurchasedProduct> list) {
        String str;
        long j6;
        long j10;
        ArrayList arrayList = new ArrayList();
        for (PurchasedProduct purchasedProduct : list) {
            List<String> entitlements = purchasedProduct.getEntitlements();
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(entitlements, 10));
            for (String str2 : entitlements) {
                arrayList2.add(new C3959i(str2, purchasedProduct));
            }
            s.N1(arrayList2, arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3959i c3959i = (C3959i) it.next();
            String str3 = (String) c3959i.f36155Y;
            Object obj = linkedHashMap.get(str3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str3, obj);
            }
            ((List) obj).add((PurchasedProduct) c3959i.f36156Z);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P4.a.n0(linkedHashMap.size()));
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            Object obj2 = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            List list2 = (List) entry.getValue();
            Iterator it3 = list2.iterator();
            if (it3.hasNext()) {
                obj2 = it3.next();
                if (it3.hasNext()) {
                    Date expiresDate = ((PurchasedProduct) obj2).getExpiresDate();
                    if (expiresDate != null) {
                        j6 = expiresDate.getTime();
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    do {
                        Object next = it3.next();
                        Date expiresDate2 = ((PurchasedProduct) next).getExpiresDate();
                        if (expiresDate2 != null) {
                            j10 = expiresDate2.getTime();
                        } else {
                            j10 = Long.MAX_VALUE;
                        }
                        if (j6 < j10) {
                            obj2 = next;
                            j6 = j10;
                        }
                    } while (it3.hasNext());
                }
            }
            PurchasedProduct purchasedProduct2 = (PurchasedProduct) obj2;
            if (purchasedProduct2 == null) {
                purchasedProduct2 = (PurchasedProduct) t.f2(list2);
            }
            linkedHashMap2.put(key, purchasedProduct2);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str4 = (String) entry2.getKey();
            PurchasedProduct purchasedProduct3 = (PurchasedProduct) entry2.getValue();
            JSONObject jSONObject2 = new JSONObject();
            Date expiresDate3 = purchasedProduct3.getExpiresDate();
            if (expiresDate3 != null) {
                str = Iso8601Utils.format(expiresDate3);
            } else {
                str = null;
            }
            jSONObject2.put("expires_date", str);
            jSONObject2.put(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER, purchasedProduct3.getProductIdentifier());
            jSONObject2.put("purchase_date", Iso8601Utils.format(new Date(purchasedProduct3.getStoreTransaction().getPurchaseTime())));
            String basePlanId = purchasedProduct3.getBasePlanId();
            if (basePlanId != null) {
                jSONObject2.put("product_plan_identifier", basePlanId);
            }
            jSONObject.put(str4, jSONObject2);
        }
        return jSONObject;
    }

    private final JSONObject generateSubscriptions(List<PurchasedProduct> list) {
        String format;
        JSONObject jSONObject = new JSONObject();
        for (PurchasedProduct purchasedProduct : list) {
            String productIdentifier = purchasedProduct.getProductIdentifier();
            JSONObject jSONObject2 = new JSONObject();
            Object obj = JSONObject.NULL;
            jSONObject2.put(ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT, obj);
            jSONObject2.put(ProductResponseJsonKeys.IS_SANDBOX, false);
            Date date = new Date(purchasedProduct.getStoreTransaction().getPurchaseTime());
            jSONObject2.put("original_purchase_date", Iso8601Utils.format(date));
            jSONObject2.put("purchase_date", Iso8601Utils.format(date));
            String name = this.appConfig.getStore().name();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
            jSONObject2.put(ProductResponseJsonKeys.STORE, lowerCase);
            jSONObject2.put(ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT, obj);
            jSONObject2.put("product_plan_identifier", purchasedProduct.getBasePlanId());
            Date expiresDate = purchasedProduct.getExpiresDate();
            if (expiresDate != null && (format = Iso8601Utils.format(expiresDate)) != null) {
                obj = format;
            }
            jSONObject2.put("expires_date", obj);
            String lowerCase2 = "NORMAL".toLowerCase(locale);
            AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase2);
            jSONObject2.put(ProductResponseJsonKeys.PERIOD_TYPE, lowerCase2);
            jSONObject.put(productIdentifier, jSONObject2);
        }
        return jSONObject;
    }

    public final void computeOfflineCustomerInfo(String str, k kVar, k kVar2) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        this.purchasedProductsFetcher.queryActiveProducts(str, new OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$1(kVar2, this, str, kVar), new OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$2(kVar2));
    }

    public /* synthetic */ OfflineCustomerInfoCalculator(PurchasedProductsFetcher purchasedProductsFetcher, AppConfig appConfig, DateProvider dateProvider, int i10, g gVar) {
        this(purchasedProductsFetcher, appConfig, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}

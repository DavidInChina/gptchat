package com.revenuecat.purchases.google;

import K4.n;
import K4.p;
import K4.q;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.strings.PurchaseStrings;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kf.v;
import kf.w;
import kotlin.Metadata;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u00a2\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000\u00a2\u0006\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"LK4/q;", "Lcom/revenuecat/purchases/models/StoreProduct;", "toInAppStoreProduct", "(LK4/q;)Lcom/revenuecat/purchases/models/StoreProduct;", "", "LK4/p;", "offerDetails", "Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "toStoreProduct", "(LK4/q;Ljava/util/List;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/Price;", "createOneTimeProductPrice", "(LK4/q;)Lcom/revenuecat/purchases/models/Price;", "toStoreProducts", "(Ljava/util/List;)Ljava/util/List;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class StoreProductConversionsKt {
    private static final Price createOneTimeProductPrice(q qVar) {
        n a5;
        if (ProductTypeConversionsKt.toRevenueCatProductType(qVar.f9462d) != ProductType.INAPP || (a5 = qVar.a()) == null) {
            return null;
        }
        String str = a5.f9444a;
        AbstractC3557B.b0("it.formattedPrice", str);
        String str2 = a5.f9446c;
        AbstractC3557B.b0("it.priceCurrencyCode", str2);
        return new Price(str, a5.f9445b, str2);
    }

    public static final StoreProduct toInAppStoreProduct(q qVar) {
        AbstractC3557B.c0("<this>", qVar);
        return toStoreProduct(qVar, v.f37483Y);
    }

    public static final GoogleStoreProduct toStoreProduct(q qVar, List<p> list) {
        SubscriptionOptions subscriptionOptions;
        SubscriptionOption subscriptionOption;
        Price price;
        Price price2;
        String str;
        Period period;
        SubscriptionOption subscriptionOption2;
        PricingPhase fullPricePhase;
        AbstractC3557B.c0("<this>", qVar);
        AbstractC3557B.c0("offerDetails", list);
        String str2 = qVar.f9462d;
        ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(str2);
        ProductType productType = ProductType.SUBS;
        String str3 = qVar.f9461c;
        if (revenueCatProductType == productType) {
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
            for (p pVar : list) {
                AbstractC3557B.b0("productId", str3);
                arrayList.add(SubscriptionOptionConversionsKt.toSubscriptionOption(pVar, str3, qVar));
            }
            subscriptionOptions = new SubscriptionOptions(arrayList);
        } else {
            subscriptionOptions = null;
        }
        if (subscriptionOptions != null) {
            subscriptionOption = subscriptionOptions.getBasePlan();
        } else {
            subscriptionOption = null;
        }
        if (subscriptionOption != null && (fullPricePhase = subscriptionOption.getFullPricePhase()) != null) {
            price = fullPricePhase.getPrice();
        } else {
            price = null;
        }
        Price createOneTimeProductPrice = createOneTimeProductPrice(qVar);
        if (createOneTimeProductPrice == null) {
            if (price == null) {
                return null;
            }
            price2 = price;
        } else {
            price2 = createOneTimeProductPrice;
        }
        AbstractC3557B.b0("productId", str3);
        if (subscriptionOption != null) {
            str = subscriptionOption.getId();
        } else {
            str = null;
        }
        ProductType revenueCatProductType2 = ProductTypeConversionsKt.toRevenueCatProductType(str2);
        String str4 = qVar.f9464f;
        AbstractC3557B.b0("name", str4);
        String str5 = qVar.f9463e;
        AbstractC3557B.b0("title", str5);
        String str6 = qVar.f9465g;
        AbstractC3557B.b0("description", str6);
        if (subscriptionOption != null) {
            period = subscriptionOption.getBillingPeriod();
        } else {
            period = null;
        }
        if (subscriptionOptions != null) {
            subscriptionOption2 = subscriptionOptions.getDefaultOffer();
        } else {
            subscriptionOption2 = null;
        }
        return new GoogleStoreProduct(str3, str, revenueCatProductType2, price2, str4, str5, str6, period, subscriptionOptions, subscriptionOption2, qVar, (PresentedOfferingContext) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kf.w] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.LinkedHashMap, java.util.Map] */
    public static final List<StoreProduct> toStoreProducts(List<q> list) {
        ?? r62;
        ?? r72;
        AbstractC3557B.c0("<this>", list);
        ArrayList arrayList = new ArrayList();
        for (q qVar : list) {
            ArrayList arrayList2 = qVar.f9468j;
            v vVar = v.f37483Y;
            if (arrayList2 != null) {
                r62 = new ArrayList();
                for (Object obj : arrayList2) {
                    p pVar = (p) obj;
                    AbstractC3557B.b0("it", pVar);
                    if (SubscriptionOptionConversionsKt.isBasePlan(pVar)) {
                        r62.add(obj);
                    }
                }
            } else {
                r62 = vVar;
            }
            ArrayList arrayList3 = qVar.f9468j;
            if (arrayList3 != null) {
                r72 = new LinkedHashMap();
                for (Object obj2 : arrayList3) {
                    String str = ((p) obj2).f9454a;
                    Object obj3 = r72.get(str);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        r72.put(str, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
            } else {
                r72 = w.f37484Y;
            }
            boolean isEmpty = r62.isEmpty();
            Iterable<p> iterable = r62;
            if (isEmpty) {
                iterable = null;
            }
            String str2 = qVar.f9461c;
            if (iterable != null) {
                for (p pVar2 : iterable) {
                    List list2 = (List) r72.get(pVar2.f9454a);
                    if (list2 == null) {
                        list2 = vVar;
                    }
                    GoogleStoreProduct storeProduct = toStoreProduct(qVar, list2);
                    if (storeProduct != null) {
                        arrayList.add(storeProduct);
                    } else {
                        AbstractC2469q0.t(new Object[]{str2}, 1, PurchaseStrings.INVALID_PRODUCT_NO_PRICE, LogIntent.RC_ERROR);
                    }
                }
            } else {
                StoreProduct inAppStoreProduct = toInAppStoreProduct(qVar);
                if (inAppStoreProduct != null) {
                    arrayList.add(inAppStoreProduct);
                } else {
                    AbstractC2469q0.t(new Object[]{str2}, 1, PurchaseStrings.INVALID_PRODUCT_NO_PRICE, LogIntent.RC_ERROR);
                }
            }
        }
        return arrayList;
    }
}

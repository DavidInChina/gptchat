package com.revenuecat.purchases.common;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kf.t;
import kotlin.Metadata;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00062\u0006\u0010\t\u001a\u00020\nH\u0014\u00a8\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/GoogleOfferingParser;", "Lcom/revenuecat/purchases/common/OfferingParser;", "()V", "findMatchingProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "productsById", "", "", "", "packageJson", "Lorg/json/JSONObject;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class GoogleOfferingParser extends OfferingParser {
    @Override // com.revenuecat.purchases.common.OfferingParser
    public StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> map, JSONObject jSONObject) {
        String str;
        SubscriptionOption basePlan;
        AbstractC3557B.c0("productsById", map);
        AbstractC3557B.c0("packageJson", jSONObject);
        String string = jSONObject.getString("platform_product_identifier");
        String optString = jSONObject.optString("platform_product_plan_identifier");
        AbstractC3557B.b0("it", optString);
        Object obj = null;
        if (optString.length() <= 0) {
            optString = null;
        }
        List<? extends StoreProduct> list = map.get(string);
        if (optString == null) {
            if (list == null || list.size() != 1) {
                list = null;
            }
            if (list == null) {
                return null;
            }
            if (list.get(0).getType() != ProductType.INAPP) {
                list = null;
            }
            if (list == null) {
                return null;
            }
            return (StoreProduct) t.h2(list);
        } else if (list == null) {
            return null;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                SubscriptionOptions subscriptionOptions = ((StoreProduct) next).getSubscriptionOptions();
                if (subscriptionOptions != null && (basePlan = subscriptionOptions.getBasePlan()) != null) {
                    str = basePlan.getId();
                } else {
                    str = null;
                }
                if (AbstractC3557B.K(str, optString)) {
                    obj = next;
                    break;
                }
            }
            return (StoreProduct) obj;
        }
    }
}

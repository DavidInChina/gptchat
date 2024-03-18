package com.revenuecat.purchases.google;

import K4.o;
import K4.p;
import K4.q;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kf.t;
import kotlin.Metadata;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"LK4/p;", "", "productId", "LK4/q;", "productDetails", "Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "toSubscriptionOption", "(LK4/p;Ljava/lang/String;LK4/q;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "getSubscriptionBillingPeriod", "(LK4/p;)Ljava/lang/String;", "subscriptionBillingPeriod", "", "isBasePlan", "(LK4/p;)Z", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriptionOptionConversionsKt {
    public static final String getSubscriptionBillingPeriod(p pVar) {
        AbstractC3557B.c0("<this>", pVar);
        List list = pVar.f9457d.f14418b;
        AbstractC3557B.b0("this.pricingPhases.pricingPhaseList", list);
        o oVar = (o) t.p2(list);
        if (oVar != null) {
            return oVar.f9451d;
        }
        return null;
    }

    public static final boolean isBasePlan(p pVar) {
        AbstractC3557B.c0("<this>", pVar);
        if (pVar.f9457d.f14418b.size() == 1) {
            return true;
        }
        return false;
    }

    public static final GoogleSubscriptionOption toSubscriptionOption(p pVar, String str, q qVar) {
        AbstractC3557B.c0("<this>", pVar);
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("productDetails", qVar);
        List<o> list = pVar.f9457d.f14418b;
        AbstractC3557B.b0("pricingPhases.pricingPhaseList", list);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (o oVar : list) {
            AbstractC3557B.b0("it", oVar);
            arrayList.add(PricingPhaseConversionsKt.toRevenueCatPricingPhase(oVar));
        }
        String str2 = pVar.f9454a;
        AbstractC3557B.b0("basePlanId", str2);
        ArrayList arrayList2 = pVar.f9458e;
        AbstractC3557B.b0("offerTags", arrayList2);
        String str3 = pVar.f9456c;
        AbstractC3557B.b0("offerToken", str3);
        return new GoogleSubscriptionOption(str, str2, pVar.f9455b, arrayList, arrayList2, qVar, str3, null, 128, null);
    }
}

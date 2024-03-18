package com.revenuecat.purchases.google;

import K4.o;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import id.AbstractC3557B;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"LK4/o;", "Lcom/revenuecat/purchases/models/PricingPhase;", "toRevenueCatPricingPhase", "(LK4/o;)Lcom/revenuecat/purchases/models/PricingPhase;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PricingPhaseConversionsKt {
    public static final PricingPhase toRevenueCatPricingPhase(o oVar) {
        AbstractC3557B.c0("<this>", oVar);
        Period.Factory factory = Period.Factory;
        String str = oVar.f9451d;
        AbstractC3557B.b0("billingPeriod", str);
        Period create = factory.create(str);
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(oVar.f9453f));
        Integer valueOf = Integer.valueOf(oVar.f9452e);
        String str2 = oVar.f9448a;
        AbstractC3557B.b0("formattedPrice", str2);
        String str3 = oVar.f9450c;
        AbstractC3557B.b0("priceCurrencyCode", str3);
        return new PricingPhase(create, recurrenceMode, valueOf, new Price(str2, oVar.f9449b, str3));
    }
}

package com.revenuecat.purchases;

import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PresentedOfferingContext;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import r9.y;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u00a8\u0006\u0006"}, d2 = {"withPresentedContext", "Lcom/revenuecat/purchases/Offering;", "placementId", "", "targeting", "Lcom/revenuecat/purchases/Offerings$Targeting;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class OfferingsKt {
    public static final Offering withPresentedContext(Offering offering, String str, Offerings.Targeting targeting) {
        String str2;
        PresentedOfferingContext.TargetingContext targetingContext;
        AbstractC3557B.c0("<this>", offering);
        List<Package> availablePackages = offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(availablePackages, 10));
        for (Package r12 : availablePackages) {
            PresentedOfferingContext presentedOfferingContext = r12.getPresentedOfferingContext();
            if (str == null) {
                str2 = presentedOfferingContext.getPlacementIdentifier();
            } else {
                str2 = str;
            }
            if (targeting != null) {
                targetingContext = new PresentedOfferingContext.TargetingContext(targeting.getRevision(), targeting.getRuleId());
            } else {
                targetingContext = presentedOfferingContext.getTargetingContext();
            }
            PresentedOfferingContext copy$default = PresentedOfferingContext.copy$default(presentedOfferingContext, null, str2, targetingContext, 1, null);
            arrayList.add(new Package(r12.getIdentifier(), r12.getPackageType(), r12.getProduct().copyWithPresentedOfferingContext(copy$default), copy$default));
        }
        return new Offering(offering.getIdentifier(), offering.getServerDescription(), offering.getMetadata(), arrayList, offering.getPaywall());
    }
}

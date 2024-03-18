package com.revenuecat.purchases.models;

import E9.f;
import K4.q;
import Lg.n;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.SubscriptionOption;
import id.AbstractC3557B;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B[\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b<\u0010=BW\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020\u0002\u00a2\u0006\u0004\b<\u0010?B\u001b\b\u0010\u0012\u0006\u0010@\u001a\u00020\u0000\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b<\u0010AJ\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012Jp\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u001d\u0010\u0004J\u0010\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u00d6\u0003\u00a2\u0006\u0004\b$\u0010%R\u0017\u0010\u0013\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010\u0004R\u0017\u0010\u0014\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b(\u0010\u0004R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b)\u0010\u0004R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010\nR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b,\u0010\nR\u0017\u0010\u0018\u001a\u00020\f8\u0006\u00a2\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010\u000eR\u0017\u0010\u0019\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b/\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b1\u0010\u0012R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u00010\u00028VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0004R\u0014\u0010;\u001a\u0002088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b9\u0010:\u00a8\u0006B"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "component4", "()Ljava/util/List;", "component5", "LK4/q;", "component6", "()LK4/q;", "component7", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "component8", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "productId", "basePlanId", "offerId", "pricingPhases", "tags", "productDetails", "offerToken", "presentedOfferingContext", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LK4/q;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getBasePlanId", "getOfferId", "Ljava/util/List;", "getPricingPhases", "getTags", "LK4/q;", "getProductDetails", "getOfferToken", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "getId", ParameterNames.ID, "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "presentedOfferingIdentifier", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LK4/q;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "presentedOfferingId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LK4/q;Ljava/lang/String;Ljava/lang/String;)V", "subscriptionOption", "(Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class GoogleSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final String offerId;
    private final String offerToken;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<PricingPhase> pricingPhases;
    private final q productDetails;
    private final String productId;
    private final List<String> tags;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, q qVar, String str4) {
        this(str, str2, str3, list, list2, qVar, str4, null, 128, null);
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("basePlanId", str2);
        AbstractC3557B.c0("pricingPhases", list);
        AbstractC3557B.c0("tags", list2);
        AbstractC3557B.c0("productDetails", qVar);
        AbstractC3557B.c0("offerToken", str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoogleSubscriptionOption copy$default(GoogleSubscriptionOption googleSubscriptionOption, String str, String str2, String str3, List list, List list2, q qVar, String str4, PresentedOfferingContext presentedOfferingContext, int i10, Object obj) {
        String str5;
        String str6;
        String str7;
        List<PricingPhase> list3;
        List<String> list4;
        q qVar2;
        String str8;
        PresentedOfferingContext presentedOfferingContext2;
        if ((i10 & 1) != 0) {
            str5 = googleSubscriptionOption.productId;
        } else {
            str5 = str;
        }
        if ((i10 & 2) != 0) {
            str6 = googleSubscriptionOption.basePlanId;
        } else {
            str6 = str2;
        }
        if ((i10 & 4) != 0) {
            str7 = googleSubscriptionOption.offerId;
        } else {
            str7 = str3;
        }
        if ((i10 & 8) != 0) {
            list3 = googleSubscriptionOption.getPricingPhases();
        } else {
            list3 = list;
        }
        if ((i10 & 16) != 0) {
            list4 = googleSubscriptionOption.getTags();
        } else {
            list4 = list2;
        }
        if ((i10 & 32) != 0) {
            qVar2 = googleSubscriptionOption.productDetails;
        } else {
            qVar2 = qVar;
        }
        if ((i10 & 64) != 0) {
            str8 = googleSubscriptionOption.offerToken;
        } else {
            str8 = str4;
        }
        if ((i10 & 128) != 0) {
            presentedOfferingContext2 = googleSubscriptionOption.getPresentedOfferingContext();
        } else {
            presentedOfferingContext2 = presentedOfferingContext;
        }
        return googleSubscriptionOption.copy(str5, str6, str7, list3, list4, qVar2, str8, presentedOfferingContext2);
    }

    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final String component3() {
        return this.offerId;
    }

    public final List<PricingPhase> component4() {
        return getPricingPhases();
    }

    public final List<String> component5() {
        return getTags();
    }

    public final q component6() {
        return this.productDetails;
    }

    public final String component7() {
        return this.offerToken;
    }

    public final PresentedOfferingContext component8() {
        return getPresentedOfferingContext();
    }

    public final GoogleSubscriptionOption copy(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, q qVar, String str4, PresentedOfferingContext presentedOfferingContext) {
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("basePlanId", str2);
        AbstractC3557B.c0("pricingPhases", list);
        AbstractC3557B.c0("tags", list2);
        AbstractC3557B.c0("productDetails", qVar);
        AbstractC3557B.c0("offerToken", str4);
        return new GoogleSubscriptionOption(str, str2, str3, list, list2, qVar, str4, presentedOfferingContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleSubscriptionOption)) {
            return false;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) obj;
        return AbstractC3557B.K(this.productId, googleSubscriptionOption.productId) && AbstractC3557B.K(this.basePlanId, googleSubscriptionOption.basePlanId) && AbstractC3557B.K(this.offerId, googleSubscriptionOption.offerId) && AbstractC3557B.K(getPricingPhases(), googleSubscriptionOption.getPricingPhases()) && AbstractC3557B.K(getTags(), googleSubscriptionOption.getTags()) && AbstractC3557B.K(this.productDetails, googleSubscriptionOption.productDetails) && AbstractC3557B.K(this.offerToken, googleSubscriptionOption.offerToken) && AbstractC3557B.K(getPresentedOfferingContext(), googleSubscriptionOption.getPresentedOfferingContext());
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public Period getBillingPeriod() {
        return SubscriptionOption.DefaultImpls.getBillingPeriod(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFreePhase() {
        return SubscriptionOption.DefaultImpls.getFreePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFullPricePhase() {
        return SubscriptionOption.DefaultImpls.getFullPricePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getId() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.basePlanId);
        String str2 = this.offerId;
        if (str2 != null && !n.n2(str2)) {
            str = ":" + this.offerId;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getIntroPhase() {
        return SubscriptionOption.DefaultImpls.getIntroPhase(this);
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final q getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PurchasingData getPurchasingData() {
        return new GooglePurchasingData.Subscription(this.productId, getId(), this.productDetails, this.offerToken);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int i10;
        int v10 = f.v(this.basePlanId, this.productId.hashCode() * 31, 31);
        String str = this.offerId;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode = getPricingPhases().hashCode();
        int v11 = f.v(this.offerToken, f.v(this.productDetails.f9459a, (getTags().hashCode() + ((hashCode + ((v10 + i10) * 31)) * 31)) * 31, 31), 31);
        if (getPresentedOfferingContext() != null) {
            i11 = getPresentedOfferingContext().hashCode();
        }
        return v11 + i11;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isBasePlan() {
        return SubscriptionOption.DefaultImpls.isBasePlan(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isPrepaid() {
        return SubscriptionOption.DefaultImpls.isPrepaid(this);
    }

    public String toString() {
        return "GoogleSubscriptionOption(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", pricingPhases=" + getPricingPhases() + ", tags=" + getTags() + ", productDetails=" + this.productDetails + ", offerToken=" + this.offerToken + ", presentedOfferingContext=" + getPresentedOfferingContext() + ')';
    }

    public GoogleSubscriptionOption(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, q qVar, String str4, PresentedOfferingContext presentedOfferingContext) {
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("basePlanId", str2);
        AbstractC3557B.c0("pricingPhases", list);
        AbstractC3557B.c0("tags", list2);
        AbstractC3557B.c0("productDetails", qVar);
        AbstractC3557B.c0("offerToken", str4);
        this.productId = str;
        this.basePlanId = str2;
        this.offerId = str3;
        this.pricingPhases = list;
        this.tags = list2;
        this.productDetails = qVar;
        this.offerToken = str4;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public /* synthetic */ GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, q qVar, String str4, PresentedOfferingContext presentedOfferingContext, int i10, g gVar) {
        this(str, str2, str3, list, list2, qVar, str4, (i10 & 128) != 0 ? null : presentedOfferingContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, q qVar, String str4, String str5) {
        this(str, str2, str3, list, list2, qVar, str4, new PresentedOfferingContext(str5));
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("basePlanId", str2);
        AbstractC3557B.c0("pricingPhases", list);
        AbstractC3557B.c0("tags", list2);
        AbstractC3557B.c0("productDetails", qVar);
        AbstractC3557B.c0("offerToken", str4);
        AbstractC3557B.c0("presentedOfferingId", str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(GoogleSubscriptionOption googleSubscriptionOption, PresentedOfferingContext presentedOfferingContext) {
        this(googleSubscriptionOption.productId, googleSubscriptionOption.basePlanId, googleSubscriptionOption.offerId, googleSubscriptionOption.getPricingPhases(), googleSubscriptionOption.getTags(), googleSubscriptionOption.productDetails, googleSubscriptionOption.offerToken, presentedOfferingContext);
        AbstractC3557B.c0("subscriptionOption", googleSubscriptionOption);
    }
}

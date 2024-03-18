package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import l8.AbstractC4344b;
import r9.y;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0004H\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00038@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0011\u00a8\u0006."}, d2 = {"Lcom/revenuecat/purchases/common/ReceiptInfo;", "", "productIDs", "", "", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "subscriptionOptionId", "storeProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "price", "", "currency", "replacementMode", "Lcom/revenuecat/purchases/ReplacementMode;", "(Ljava/util/List;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/lang/Double;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)V", "getCurrency", "()Ljava/lang/String;", "duration", "getDuration", "platformProductIds", "Lcom/revenuecat/purchases/common/PlatformProductId;", "getPlatformProductIds$purchases_customEntitlementComputationRelease", "()Ljava/util/List;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "pricingPhases", "Lcom/revenuecat/purchases/models/PricingPhase;", "getPricingPhases", "getProductIDs", "getReplacementMode", "()Lcom/revenuecat/purchases/ReplacementMode;", "getStoreProduct", "()Lcom/revenuecat/purchases/models/StoreProduct;", "subscriptionOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getSubscriptionOptionId", "equals", "", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class ReceiptInfo {
    private final String currency;
    private final String duration;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Double price;
    private final List<PricingPhase> pricingPhases;
    private final List<String> productIDs;
    private final ReplacementMode replacementMode;
    private final StoreProduct storeProduct;
    private final SubscriptionOption subscriptionOption;
    private final String subscriptionOptionId;

    public ReceiptInfo(List<String> list, PresentedOfferingContext presentedOfferingContext, String str, StoreProduct storeProduct, Double d10, String str2, ReplacementMode replacementMode) {
        SubscriptionOption subscriptionOption;
        SubscriptionOptions subscriptionOptions;
        SubscriptionOption subscriptionOption2;
        String str3;
        Period period;
        AbstractC3557B.c0("productIDs", list);
        this.productIDs = list;
        this.presentedOfferingContext = presentedOfferingContext;
        this.subscriptionOptionId = str;
        this.storeProduct = storeProduct;
        this.price = d10;
        this.currency = str2;
        this.replacementMode = replacementMode;
        List<PricingPhase> list2 = null;
        this.duration = (storeProduct == null || (period = storeProduct.getPeriod()) == null || (str3 = period.getIso8601()) == null || str3.length() == 0) ? null : str3;
        if (storeProduct == null || (subscriptionOptions = storeProduct.getSubscriptionOptions()) == null) {
            subscriptionOption = null;
        } else {
            Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    subscriptionOption2 = null;
                    break;
                }
                subscriptionOption2 = it.next();
                if (AbstractC3557B.K(subscriptionOption2.getId(), this.subscriptionOptionId)) {
                    break;
                }
            }
            subscriptionOption = subscriptionOption2;
        }
        this.subscriptionOption = subscriptionOption;
        this.pricingPhases = subscriptionOption != null ? subscriptionOption.getPricingPhases() : list2;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(ReceiptInfo.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.revenuecat.purchases.common.ReceiptInfo", obj);
        ReceiptInfo receiptInfo = (ReceiptInfo) obj;
        if (!AbstractC3557B.K(this.productIDs, receiptInfo.productIDs) || !AbstractC3557B.K(this.presentedOfferingContext, receiptInfo.presentedOfferingContext) || !AbstractC3557B.K(this.storeProduct, receiptInfo.storeProduct)) {
            return false;
        }
        Double d10 = this.price;
        Double d11 = receiptInfo.price;
        if (d10 != null ? d11 == null || d10.doubleValue() != d11.doubleValue() : d11 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.currency, receiptInfo.currency) && AbstractC3557B.K(this.subscriptionOptionId, receiptInfo.subscriptionOptionId)) {
            return true;
        }
        return false;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final List<PlatformProductId> getPlatformProductIds$purchases_customEntitlementComputationRelease() {
        PlatformProductId platformProductId;
        String str;
        SubscriptionOption subscriptionOption = this.subscriptionOption;
        if (subscriptionOption == null || (platformProductId = ReceiptInfoKt.platformProductId(subscriptionOption)) == null) {
            StoreProduct storeProduct = this.storeProduct;
            if (storeProduct != null) {
                platformProductId = ReceiptInfoKt.platformProductId(storeProduct);
            } else {
                platformProductId = null;
            }
        }
        List<String> list = this.productIDs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str2 = (String) obj;
            if (platformProductId != null) {
                str = platformProductId.getProductId();
            } else {
                str = null;
            }
            if (!AbstractC3557B.K(str2, str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new PlatformProductId((String) it.next()));
        }
        return t.w2(AbstractC4344b.H0(platformProductId), arrayList2);
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final List<String> getProductIDs() {
        return this.productIDs;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final StoreProduct getStoreProduct() {
        return this.storeProduct;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public int hashCode() {
        int i10;
        int i11;
        int hashCode = this.productIDs.hashCode() * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int i12 = 0;
        if (presentedOfferingContext != null) {
            i10 = presentedOfferingContext.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        StoreProduct storeProduct = this.storeProduct;
        if (storeProduct != null) {
            i11 = storeProduct.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str = this.subscriptionOptionId;
        if (str != null) {
            i12 = str.hashCode();
        }
        return i14 + i12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReceiptInfo(productIDs='");
        sb2.append(t.m2(this.productIDs, null, null, null, null, 63));
        sb2.append("', presentedOfferingContext=");
        sb2.append(this.presentedOfferingContext);
        sb2.append(", storeProduct=");
        sb2.append(this.storeProduct);
        sb2.append(", subscriptionOptionId=");
        sb2.append(this.subscriptionOptionId);
        sb2.append(", pricingPhases=");
        sb2.append(this.pricingPhases);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", currency=");
        sb2.append(this.currency);
        sb2.append(", duration=");
        return android.gov.nist.core.a.n(sb2, this.duration, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ReceiptInfo(List list, PresentedOfferingContext presentedOfferingContext, String str, StoreProduct storeProduct, Double d10, String str2, ReplacementMode replacementMode, int i10, g gVar) {
        this(list, r0, r2, r3, (i10 & 16) != 0 ? (r3 == null || (r4 = r3.getPrice()) == null) ? null : Double.valueOf(r4.getAmountMicros() / 1000000.0d) : d10, (i10 & 32) != 0 ? (r3 == null || (r5 = r3.getPrice()) == null) ? null : r5.getCurrencyCode() : str2, (i10 & 64) == 0 ? replacementMode : r1);
        Price price;
        Price price2;
        ReplacementMode replacementMode2 = null;
        PresentedOfferingContext presentedOfferingContext2 = (i10 & 2) != 0 ? null : presentedOfferingContext;
        String str3 = (i10 & 4) != 0 ? null : str;
        StoreProduct storeProduct2 = (i10 & 8) != 0 ? null : storeProduct;
    }
}

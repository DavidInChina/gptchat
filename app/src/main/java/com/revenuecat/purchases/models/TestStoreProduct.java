package com.revenuecat.purchases.models;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.StoreProduct;
import id.AbstractC3557B;
import java.util.Locale;
import kf.q;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import l8.AbstractC4344b;
import r9.y;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\fBO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000eJ\n\u00102\u001a\u0004\u0018\u00010*H\u0002J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tH\u00c2\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007H\u00c2\u0003J_\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0010\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u0003H\u0017J\u0012\u0010>\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u00d6\u0003J\t\u0010C\u001a\u00020DH\u00d6\u0001J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0016\u0010)\u001a\u0004\u0018\u00010*8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0014R\u0014\u0010.\u001a\u00020/8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u00101\u00a8\u0006F"}, d2 = {"Lcom/revenuecat/purchases/models/TestStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", ParameterNames.ID, "", "title", "description", "price", "Lcom/revenuecat/purchases/models/Price;", "period", "Lcom/revenuecat/purchases/models/Period;", "freeTrialPeriod", "introPrice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;)V", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;)V", "defaultOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDefaultOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDescription", "()Ljava/lang/String;", "getId", "getName", "getPeriod", "()Lcom/revenuecat/purchases/models/Period;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "getPresentedOfferingIdentifier", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", ProxyAmazonBillingActivity.EXTRAS_SKU, "getSku", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getSubscriptionOptions", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getTitle", "type", "Lcom/revenuecat/purchases/ProductType;", "getType", "()Lcom/revenuecat/purchases/ProductType;", "buildSubscriptionOptions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copyWithOfferingId", "offeringId", "copyWithPresentedOfferingContext", "equals", "", "other", "", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class TestStoreProduct implements StoreProduct {
    private final String description;
    private final Period freeTrialPeriod;

    /* renamed from: id  reason: collision with root package name */
    private final String f27748id;
    private final Price introPrice;
    private final String name;
    private final Period period;
    private final Price price;
    private final String title;

    public TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("name", str2);
        AbstractC3557B.c0("title", str3);
        AbstractC3557B.c0("description", str4);
        AbstractC3557B.c0("price", price);
        this.f27748id = str;
        this.name = str2;
        this.title = str3;
        this.description = str4;
        this.price = price;
        this.period = period;
        this.freeTrialPeriod = period2;
        this.introPrice = price2;
    }

    private final SubscriptionOptions buildSubscriptionOptions() {
        PricingPhase pricingPhase;
        PricingPhase pricingPhase2;
        TestSubscriptionOption testSubscriptionOption = null;
        if (getPeriod() == null) {
            return null;
        }
        Period period = this.freeTrialPeriod;
        if (period != null) {
            pricingPhase = new PricingPhase(period, RecurrenceMode.FINITE_RECURRING, 1, new Price("Free", 0L, getPrice().getCurrencyCode()));
        } else {
            pricingPhase = null;
        }
        Price price = this.introPrice;
        if (price != null) {
            pricingPhase2 = new PricingPhase(new Period(1, Period.Unit.MONTH, "P1M"), RecurrenceMode.FINITE_RECURRING, 1, price);
        } else {
            pricingPhase2 = null;
        }
        PricingPhase pricingPhase3 = new PricingPhase(getPeriod(), RecurrenceMode.INFINITE_RECURRING, null, getPrice());
        TestSubscriptionOption[] testSubscriptionOptionArr = new TestSubscriptionOption[2];
        TestSubscriptionOption testSubscriptionOption2 = new TestSubscriptionOption(getId(), q.h3(new PricingPhase[]{pricingPhase, pricingPhase2, pricingPhase3}), null, null, null, 28, null);
        if (this.freeTrialPeriod != null || pricingPhase2 != null) {
            testSubscriptionOption = testSubscriptionOption2;
        }
        testSubscriptionOptionArr[0] = testSubscriptionOption;
        testSubscriptionOptionArr[1] = new TestSubscriptionOption(getId(), AbstractC4344b.F0(pricingPhase3), null, null, null, 28, null);
        return new SubscriptionOptions(q.h3(testSubscriptionOptionArr));
    }

    private final Period component7() {
        return this.freeTrialPeriod;
    }

    private final Price component8() {
        return this.introPrice;
    }

    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public final String component1() {
        return getId();
    }

    public final String component2() {
        return getName();
    }

    public final String component3() {
        return getTitle();
    }

    public final String component4() {
        return getDescription();
    }

    public final Price component5() {
        return getPrice();
    }

    public final Period component6() {
        return getPeriod();
    }

    public final TestStoreProduct copy(String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("name", str2);
        AbstractC3557B.c0("title", str3);
        AbstractC3557B.c0("description", str4);
        AbstractC3557B.c0("price", price);
        return new TestStoreProduct(str, str2, str3, str4, price, period, period2, price2);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithOfferingId(String str) {
        AbstractC3557B.c0("offeringId", str);
        return copyWithPresentedOfferingContext(new PresentedOfferingContext(str));
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestStoreProduct)) {
            return false;
        }
        TestStoreProduct testStoreProduct = (TestStoreProduct) obj;
        return AbstractC3557B.K(getId(), testStoreProduct.getId()) && AbstractC3557B.K(getName(), testStoreProduct.getName()) && AbstractC3557B.K(getTitle(), testStoreProduct.getTitle()) && AbstractC3557B.K(getDescription(), testStoreProduct.getDescription()) && AbstractC3557B.K(getPrice(), testStoreProduct.getPrice()) && AbstractC3557B.K(getPeriod(), testStoreProduct.getPeriod()) && AbstractC3557B.K(this.freeTrialPeriod, testStoreProduct.freeTrialPeriod) && AbstractC3557B.K(this.introPrice, testStoreProduct.introPrice);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.formattedPricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            return subscriptionOptions.getDefaultOffer();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        return this.f27748id;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getName() {
        return this.name;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Period getPeriod() {
        return this.period;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PresentedOfferingContext getPresentedOfferingContext() {
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price getPrice() {
        return this.price;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PurchasingData getPurchasingData() {
        return new PurchasingData() { // from class: com.revenuecat.purchases.models.TestStoreProduct$purchasingData$1
            @Override // com.revenuecat.purchases.models.PurchasingData
            public String getProductId() {
                return TestStoreProduct.this.getId();
            }

            @Override // com.revenuecat.purchases.models.PurchasingData
            public ProductType getProductType() {
                return TestStoreProduct.this.getType();
            }
        };
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return getId();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOptions getSubscriptionOptions() {
        return buildSubscriptionOptions();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public ProductType getType() {
        if (getPeriod() == null) {
            return ProductType.INAPP;
        }
        return ProductType.SUBS;
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        int hashCode2 = getTitle().hashCode();
        int i10 = 0;
        int hashCode3 = (((getPrice().hashCode() + ((getDescription().hashCode() + ((hashCode2 + ((hashCode + (getId().hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (getPeriod() == null ? 0 : getPeriod().hashCode())) * 31;
        Period period = this.freeTrialPeriod;
        int hashCode4 = (hashCode3 + (period == null ? 0 : period.hashCode())) * 31;
        Price price = this.introPrice;
        if (price != null) {
            i10 = price.hashCode();
        }
        return hashCode4 + i10;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerWeek(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerWeek(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerYear(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerYear(this, locale);
    }

    public String toString() {
        return "TestStoreProduct(id=" + getId() + ", name=" + getName() + ", title=" + getTitle() + ", description=" + getDescription() + ", price=" + getPrice() + ", period=" + getPeriod() + ", freeTrialPeriod=" + this.freeTrialPeriod + ", introPrice=" + this.introPrice + ')';
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2, int i10, g gVar) {
        this(str, str2, str3, str4, price, period, (i10 & 64) != 0 ? null : period2, (i10 & 128) != 0 ? null : price2);
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, Price price, Period period, Period period2, Price price2, int i10, g gVar) {
        this(str, str2, str3, price, period, (i10 & 32) != 0 ? null : period2, (i10 & 64) != 0 ? null : price2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TestStoreProduct(String str, String str2, String str3, Price price, Period period, Period period2, Price price2) {
        this(str, str2, str2, str3, price, period, period2, price2);
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("title", str2);
        AbstractC3557B.c0("description", str3);
        AbstractC3557B.c0("price", price);
    }
}

package com.revenuecat.purchases.models;

import E9.f;
import K4.q;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.g;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0007\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010+\u001a\u00020\u0011\u0012\u0006\u0010,\u001a\u00020\u0014\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u001a\u0012\b\u00101\u001a\u0004\u0018\u00010\u001d\u0012\b\u00102\u001a\u0004\u0018\u00010 \u0012\u0006\u00103\u001a\u00020#\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b`\u0010aBu\b\u0010\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010+\u001a\u00020\u0011\u0012\u0006\u0010,\u001a\u00020\u0014\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u001a\u0012\b\u00101\u001a\u0004\u0018\u00010\u001d\u0012\b\u00102\u001a\u0004\u0018\u00010 \u0012\u0006\u00103\u001a\u00020#\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b`\u0010bBm\b\u0017\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010+\u001a\u00020\u0011\u0012\u0006\u0010,\u001a\u00020\u0014\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u001a\u0012\b\u00101\u001a\u0004\u0018\u00010\u001d\u0012\b\u00102\u001a\u0004\u0018\u00010 \u0012\u0006\u00103\u001a\u00020#\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b`\u0010cB/\b\u0012\u0012\u0006\u0010d\u001a\u00020\u0000\u0012\b\u00102\u001a\u0004\u0018\u00010 \u0012\b\u0010e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b`\u0010fJ\u0017\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0019\u0010\u000fJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010 H\u00c6\u0003\u00a2\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#H\u00c6\u0003\u00a2\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b&\u0010\u000fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\b'\u0010(J\u009e\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010+\u001a\u00020\u00112\b\b\u0002\u0010,\u001a\u00020\u00142\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u00102\u001a\u0004\u0018\u00010 2\b\b\u0002\u00103\u001a\u00020#2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b7\u0010\u000fJ\u0010\u00109\u001a\u000208H\u00d6\u0001\u00a2\u0006\u0004\b9\u0010:J\u001a\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;H\u00d6\u0003\u00a2\u0006\u0004\b>\u0010?R\u0017\u0010)\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b)\u0010@\u001a\u0004\bA\u0010\u000fR\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\f\n\u0004\b*\u0010@\u001a\u0004\bB\u0010\u000fR\u001a\u0010+\u001a\u00020\u00118\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b+\u0010C\u001a\u0004\bD\u0010\u0013R\u001a\u0010,\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b,\u0010E\u001a\u0004\bF\u0010\u0016R\u001a\u0010-\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b-\u0010@\u001a\u0004\bG\u0010\u000fR\u001a\u0010.\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b.\u0010@\u001a\u0004\bH\u0010\u000fR\u001a\u0010/\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b/\u0010@\u001a\u0004\bI\u0010\u000fR\u001c\u00100\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b0\u0010J\u001a\u0004\bK\u0010\u001cR\u001c\u00101\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b1\u0010L\u001a\u0004\bM\u0010\u001fR\u001c\u00102\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b2\u0010N\u001a\u0004\bO\u0010\"R\u0017\u00103\u001a\u00020#8\u0006\u00a2\u0006\f\n\u0004\b3\u0010P\u001a\u0004\bQ\u0010%R\"\u00104\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004\u00a2\u0006\u0012\n\u0004\b4\u0010@\u0012\u0004\bS\u0010T\u001a\u0004\bR\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\bV\u0010(R\u0014\u0010X\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bW\u0010\u000fR\u0014\u0010\\\u001a\u00020Y8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bZ\u0010[R\u001a\u0010_\u001a\u00020\u00028VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b^\u0010T\u001a\u0004\b]\u0010\u000f\u00a8\u0006g"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", "", "offeringId", "copyWithOfferingId", "(Ljava/lang/String;)Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "copyWithPresentedOfferingContext", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/models/StoreProduct;", "Ljava/util/Locale;", "locale", "formattedPricePerMonth", "(Ljava/util/Locale;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "Lcom/revenuecat/purchases/ProductType;", "component3", "()Lcom/revenuecat/purchases/ProductType;", "Lcom/revenuecat/purchases/models/Price;", "component4", "()Lcom/revenuecat/purchases/models/Price;", "component5", "component6", "component7", "Lcom/revenuecat/purchases/models/Period;", "component8", "()Lcom/revenuecat/purchases/models/Period;", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "component9", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "component10", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "LK4/q;", "component11", "()LK4/q;", "component12", "component13", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "productId", "basePlanId", "type", "price", "name", "title", "description", "period", "subscriptionOptions", "defaultOption", "productDetails", "presentedOfferingIdentifier", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;LK4/q;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getBasePlanId", "Lcom/revenuecat/purchases/ProductType;", "getType", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "getName", "getTitle", "getDescription", "Lcom/revenuecat/purchases/models/Period;", "getPeriod", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getSubscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDefaultOption", "LK4/q;", "getProductDetails", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "getId", ParameterNames.ID, "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "getSku", "getSku$annotations", ProxyAmazonBillingActivity.EXTRAS_SKU, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;LK4/q;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;LK4/q;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;LK4/q;Ljava/lang/String;)V", "otherProduct", "subscriptionOptionsWithOfferingId", "(Lcom/revenuecat/purchases/models/GoogleStoreProduct;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class GoogleStoreProduct implements StoreProduct {
    private final String basePlanId;
    private final SubscriptionOption defaultOption;
    private final String description;
    private final String name;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final String presentedOfferingIdentifier;
    private final Price price;
    private final q productDetails;
    private final String productId;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, q qVar, String str5) {
        this(str, str2, productType, price, str3, str3, str4, period, subscriptionOptions, subscriptionOption, qVar, str5 != null ? new PresentedOfferingContext(str5) : null);
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("type", productType);
        AbstractC3557B.c0("price", price);
        AbstractC3557B.c0("title", str3);
        AbstractC3557B.c0("description", str4);
        AbstractC3557B.c0("productDetails", qVar);
    }

    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public static /* synthetic */ void getSku$annotations() {
    }

    public final String component1() {
        return this.productId;
    }

    public final SubscriptionOption component10() {
        return getDefaultOption();
    }

    public final q component11() {
        return this.productDetails;
    }

    public final String component12() {
        return getPresentedOfferingIdentifier();
    }

    public final PresentedOfferingContext component13() {
        return getPresentedOfferingContext();
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final ProductType component3() {
        return getType();
    }

    public final Price component4() {
        return getPrice();
    }

    public final String component5() {
        return getName();
    }

    public final String component6() {
        return getTitle();
    }

    public final String component7() {
        return getDescription();
    }

    public final Period component8() {
        return getPeriod();
    }

    public final SubscriptionOptions component9() {
        return getSubscriptionOptions();
    }

    public final GoogleStoreProduct copy(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, q qVar, String str6, PresentedOfferingContext presentedOfferingContext) {
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("type", productType);
        AbstractC3557B.c0("price", price);
        AbstractC3557B.c0("name", str3);
        AbstractC3557B.c0("title", str4);
        AbstractC3557B.c0("description", str5);
        AbstractC3557B.c0("productDetails", qVar);
        return new GoogleStoreProduct(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, qVar, str6, presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithOfferingId(String str) {
        PresentedOfferingContext presentedOfferingContext;
        AbstractC3557B.c0("offeringId", str);
        PresentedOfferingContext presentedOfferingContext2 = getPresentedOfferingContext();
        if (presentedOfferingContext2 == null || (presentedOfferingContext = PresentedOfferingContext.copy$default(presentedOfferingContext2, str, null, null, 6, null)) == null) {
            presentedOfferingContext = new PresentedOfferingContext(str);
        }
        return copyWithPresentedOfferingContext(presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
        ArrayList arrayList;
        GoogleSubscriptionOption googleSubscriptionOption;
        GoogleSubscriptionOption googleSubscriptionOption2;
        GoogleSubscriptionOption googleSubscriptionOption3;
        GoogleSubscriptionOption googleSubscriptionOption4;
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        SubscriptionOptions subscriptionOptions2 = null;
        if (subscriptionOptions != null) {
            arrayList = new ArrayList();
            for (SubscriptionOption subscriptionOption : subscriptionOptions) {
                if (subscriptionOption instanceof GoogleSubscriptionOption) {
                    googleSubscriptionOption3 = (GoogleSubscriptionOption) subscriptionOption;
                } else {
                    googleSubscriptionOption3 = null;
                }
                if (googleSubscriptionOption3 != null) {
                    googleSubscriptionOption4 = new GoogleSubscriptionOption(googleSubscriptionOption3, presentedOfferingContext);
                } else {
                    googleSubscriptionOption4 = null;
                }
                if (googleSubscriptionOption4 != null) {
                    arrayList.add(googleSubscriptionOption4);
                }
            }
        } else {
            arrayList = null;
        }
        SubscriptionOption defaultOption = getDefaultOption();
        if (defaultOption instanceof GoogleSubscriptionOption) {
            googleSubscriptionOption = (GoogleSubscriptionOption) defaultOption;
        } else {
            googleSubscriptionOption = null;
        }
        if (googleSubscriptionOption != null) {
            googleSubscriptionOption2 = new GoogleSubscriptionOption(googleSubscriptionOption, presentedOfferingContext);
        } else {
            googleSubscriptionOption2 = null;
        }
        if (arrayList != null) {
            subscriptionOptions2 = new SubscriptionOptions(arrayList);
        }
        return new GoogleStoreProduct(this, googleSubscriptionOption2, subscriptionOptions2, presentedOfferingContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleStoreProduct)) {
            return false;
        }
        GoogleStoreProduct googleStoreProduct = (GoogleStoreProduct) obj;
        return AbstractC3557B.K(this.productId, googleStoreProduct.productId) && AbstractC3557B.K(this.basePlanId, googleStoreProduct.basePlanId) && getType() == googleStoreProduct.getType() && AbstractC3557B.K(getPrice(), googleStoreProduct.getPrice()) && AbstractC3557B.K(getName(), googleStoreProduct.getName()) && AbstractC3557B.K(getTitle(), googleStoreProduct.getTitle()) && AbstractC3557B.K(getDescription(), googleStoreProduct.getDescription()) && AbstractC3557B.K(getPeriod(), googleStoreProduct.getPeriod()) && AbstractC3557B.K(getSubscriptionOptions(), googleStoreProduct.getSubscriptionOptions()) && AbstractC3557B.K(getDefaultOption(), googleStoreProduct.getDefaultOption()) && AbstractC3557B.K(this.productDetails, googleStoreProduct.productDetails) && AbstractC3557B.K(getPresentedOfferingIdentifier(), googleStoreProduct.getPresentedOfferingIdentifier()) && AbstractC3557B.K(getPresentedOfferingContext(), googleStoreProduct.getPresentedOfferingContext());
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        SubscriptionOption basePlan;
        List<PricingPhase> pricingPhases;
        PricingPhase pricingPhase;
        AbstractC3557B.c0("locale", locale);
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null && (basePlan = subscriptionOptions.getBasePlan()) != null && (pricingPhases = basePlan.getPricingPhases()) != null && (pricingPhase = (PricingPhase) t.o2(pricingPhases)) != null) {
            return pricingPhase.formattedPriceInMonths(locale);
        }
        return null;
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        if (this.basePlanId != null) {
            String str = this.productId + ':' + this.basePlanId;
            if (str != null) {
                return str;
            }
        }
        return this.productId;
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
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price getPrice() {
        return this.price;
    }

    public final q getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PurchasingData getPurchasingData() {
        if (getType() == ProductType.SUBS && getDefaultOption() != null) {
            return getDefaultOption().getPurchasingData();
        }
        return new GooglePurchasingData.InAppProduct(getId(), this.productDetails);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int hashCode = this.productId.hashCode() * 31;
        String str = this.basePlanId;
        int i15 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode2 = getType().hashCode();
        int hashCode3 = getPrice().hashCode();
        int hashCode4 = getName().hashCode();
        int hashCode5 = (getDescription().hashCode() + ((getTitle().hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (getPeriod() == null) {
            i11 = 0;
        } else {
            i11 = getPeriod().hashCode();
        }
        int i16 = (hashCode5 + i11) * 31;
        if (getSubscriptionOptions() == null) {
            i12 = 0;
        } else {
            i12 = getSubscriptionOptions().hashCode();
        }
        int i17 = (i16 + i12) * 31;
        if (getDefaultOption() == null) {
            i13 = 0;
        } else {
            i13 = getDefaultOption().hashCode();
        }
        int v10 = f.v(this.productDetails.f9459a, (i17 + i13) * 31, 31);
        if (getPresentedOfferingIdentifier() == null) {
            i14 = 0;
        } else {
            i14 = getPresentedOfferingIdentifier().hashCode();
        }
        int i18 = (v10 + i14) * 31;
        if (getPresentedOfferingContext() != null) {
            i15 = getPresentedOfferingContext().hashCode();
        }
        return i18 + i15;
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
        return "GoogleStoreProduct(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", type=" + getType() + ", price=" + getPrice() + ", name=" + getName() + ", title=" + getTitle() + ", description=" + getDescription() + ", period=" + getPeriod() + ", subscriptionOptions=" + getSubscriptionOptions() + ", defaultOption=" + getDefaultOption() + ", productDetails=" + this.productDetails + ", presentedOfferingIdentifier=" + getPresentedOfferingIdentifier() + ", presentedOfferingContext=" + getPresentedOfferingContext() + ')';
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, q qVar, String str5, int i10, g gVar) {
        this(str, str2, productType, price, str3, str4, period, subscriptionOptions, subscriptionOption, qVar, (i10 & 1024) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, q qVar) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, qVar, null, null, 6144, null);
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("type", productType);
        AbstractC3557B.c0("price", price);
        AbstractC3557B.c0("name", str3);
        AbstractC3557B.c0("title", str4);
        AbstractC3557B.c0("description", str5);
        AbstractC3557B.c0("productDetails", qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, q qVar, PresentedOfferingContext presentedOfferingContext) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, qVar, presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null, presentedOfferingContext);
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("type", productType);
        AbstractC3557B.c0("price", price);
        AbstractC3557B.c0("name", str3);
        AbstractC3557B.c0("title", str4);
        AbstractC3557B.c0("description", str5);
        AbstractC3557B.c0("productDetails", qVar);
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, q qVar, PresentedOfferingContext presentedOfferingContext, int i10, g gVar) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, qVar, (i10 & 2048) != 0 ? null : presentedOfferingContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, q qVar, String str6) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, qVar, str6, null, 4096, null);
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("type", productType);
        AbstractC3557B.c0("price", price);
        AbstractC3557B.c0("name", str3);
        AbstractC3557B.c0("title", str4);
        AbstractC3557B.c0("description", str5);
        AbstractC3557B.c0("productDetails", qVar);
    }

    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, q qVar, String str6, PresentedOfferingContext presentedOfferingContext) {
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("type", productType);
        AbstractC3557B.c0("price", price);
        AbstractC3557B.c0("name", str3);
        AbstractC3557B.c0("title", str4);
        AbstractC3557B.c0("description", str5);
        AbstractC3557B.c0("productDetails", qVar);
        this.productId = str;
        this.basePlanId = str2;
        this.type = productType;
        this.price = price;
        this.name = str3;
        this.title = str4;
        this.description = str5;
        this.period = period;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.productDetails = qVar;
        this.presentedOfferingIdentifier = str6;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, q qVar, String str6, PresentedOfferingContext presentedOfferingContext, int i10, g gVar) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, qVar, (i10 & 2048) != 0 ? null : str6, (i10 & 4096) != 0 ? null : presentedOfferingContext);
    }

    private GoogleStoreProduct(GoogleStoreProduct googleStoreProduct, SubscriptionOption subscriptionOption, SubscriptionOptions subscriptionOptions, PresentedOfferingContext presentedOfferingContext) {
        this(googleStoreProduct.productId, googleStoreProduct.basePlanId, googleStoreProduct.getType(), googleStoreProduct.getPrice(), googleStoreProduct.getName(), googleStoreProduct.getTitle(), googleStoreProduct.getDescription(), googleStoreProduct.getPeriod(), subscriptionOptions, subscriptionOption, googleStoreProduct.productDetails, presentedOfferingContext);
    }
}

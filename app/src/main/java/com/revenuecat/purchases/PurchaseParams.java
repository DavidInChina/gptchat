package com.revenuecat.purchases;

import android.app.Activity;
import com.revenuecat.purchases.models.GoogleProrationMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.TestStoreProduct;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010'\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00188@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001e8@X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006)"}, d2 = {"Lcom/revenuecat/purchases/PurchaseParams;", "", "builder", "Lcom/revenuecat/purchases/PurchaseParams$Builder;", "(Lcom/revenuecat/purchases/PurchaseParams$Builder;)V", "activity", "Landroid/app/Activity;", "getActivity$purchases_customEntitlementComputationRelease", "()Landroid/app/Activity;", "getBuilder", "()Lcom/revenuecat/purchases/PurchaseParams$Builder;", "googleReplacementMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getGoogleReplacementMode", "()Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "isPersonalizedPrice", "", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "oldProductId", "", "getOldProductId", "()Ljava/lang/String;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "setPresentedOfferingContext$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/models/PurchasingData;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "Builder", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class PurchaseParams {
    private final Activity activity;
    private final Builder builder;
    private final GoogleReplacementMode googleReplacementMode;
    private final Boolean isPersonalizedPrice;
    private final String oldProductId;
    private PresentedOfferingContext presentedOfferingContext;
    private final PurchasingData purchasingData;

    public PurchaseParams(Builder builder) {
        AbstractC3557B.c0("builder", builder);
        this.builder = builder;
        this.isPersonalizedPrice = builder.isPersonalizedPrice$purchases_customEntitlementComputationRelease();
        this.oldProductId = builder.getOldProductId$purchases_customEntitlementComputationRelease();
        this.googleReplacementMode = builder.getGoogleReplacementMode$purchases_customEntitlementComputationRelease();
        this.purchasingData = builder.getPurchasingData$purchases_customEntitlementComputationRelease();
        this.activity = builder.getActivity$purchases_customEntitlementComputationRelease();
        this.presentedOfferingContext = builder.getPresentedOfferingContext$purchases_customEntitlementComputationRelease();
    }

    public static /* synthetic */ PurchaseParams copy$default(PurchaseParams purchaseParams, Builder builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            builder = purchaseParams.builder;
        }
        return purchaseParams.copy(builder);
    }

    public final Builder component1() {
        return this.builder;
    }

    public final PurchaseParams copy(Builder builder) {
        AbstractC3557B.c0("builder", builder);
        return new PurchaseParams(builder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchaseParams) && AbstractC3557B.K(this.builder, ((PurchaseParams) obj).builder);
    }

    public final /* synthetic */ Activity getActivity$purchases_customEntitlementComputationRelease() {
        return this.activity;
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    public final GoogleReplacementMode getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    public final String getOldProductId() {
        return this.oldProductId;
    }

    public final /* synthetic */ PresentedOfferingContext getPresentedOfferingContext$purchases_customEntitlementComputationRelease() {
        return this.presentedOfferingContext;
    }

    public final /* synthetic */ PurchasingData getPurchasingData$purchases_customEntitlementComputationRelease() {
        return this.purchasingData;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }

    public final Boolean isPersonalizedPrice() {
        return this.isPersonalizedPrice;
    }

    public final void setPresentedOfferingContext$purchases_customEntitlementComputationRelease(PresentedOfferingContext presentedOfferingContext) {
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public String toString() {
        return "PurchaseParams(builder=" + this.builder + ')';
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B-\b\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b<\u0010=B\u0019\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010?\u001a\u00020>\u00a2\u0006\u0004\b<\u0010@B\u0019\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b<\u0010AB\u0019\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010C\u001a\u00020B\u00a2\u0006\u0004\b<\u0010DJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R.\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010,\u001a\u0004\u0018\u00010\n8@@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R.\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010,\u001a\u0004\u0018\u00010\r8@@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010\u0014\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00138@@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;\u00a8\u0006E"}, d2 = {"Lcom/revenuecat/purchases/PurchaseParams$Builder;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Ljf/y;", "ensureNoTestProduct", "(Lcom/revenuecat/purchases/models/StoreProduct;)V", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "", "isPersonalizedPrice", "(Z)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "", "oldProductId", "(Ljava/lang/String;)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "Lcom/revenuecat/purchases/models/GoogleProrationMode;", "googleProrationMode", "(Lcom/revenuecat/purchases/models/GoogleProrationMode;)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "googleReplacementMode", "(Lcom/revenuecat/purchases/models/GoogleReplacementMode;)Lcom/revenuecat/purchases/PurchaseParams$Builder;", "Lcom/revenuecat/purchases/PurchaseParams;", "build", "()Lcom/revenuecat/purchases/PurchaseParams;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getActivity$purchases_customEntitlementComputationRelease", "()Landroid/app/Activity;", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/models/PurchasingData;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "setPresentedOfferingContext$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "product", "Lcom/revenuecat/purchases/models/StoreProduct;", "getProduct$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/models/StoreProduct;", "<set-?>", "Ljava/lang/Boolean;", "isPersonalizedPrice$purchases_customEntitlementComputationRelease", "()Ljava/lang/Boolean;", "setPersonalizedPrice$purchases_customEntitlementComputationRelease", "(Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getOldProductId$purchases_customEntitlementComputationRelease", "()Ljava/lang/String;", "setOldProductId$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getGoogleReplacementMode$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "setGoogleReplacementMode$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/models/GoogleReplacementMode;)V", "<init>", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/StoreProduct;)V", "Lcom/revenuecat/purchases/Package;", "packageToPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;)V", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;)V", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOption", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/SubscriptionOption;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static class Builder {
        private final Activity activity;
        private GoogleReplacementMode googleReplacementMode;
        private Boolean isPersonalizedPrice;
        private String oldProductId;
        private PresentedOfferingContext presentedOfferingContext;
        private final StoreProduct product;
        private final PurchasingData purchasingData;

        private Builder(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, StoreProduct storeProduct) {
            this.activity = activity;
            this.purchasingData = purchasingData;
            this.presentedOfferingContext = presentedOfferingContext;
            this.product = storeProduct;
            this.googleReplacementMode = GoogleReplacementMode.WITHOUT_PRORATION;
        }

        private final void ensureNoTestProduct(StoreProduct storeProduct) {
            if (!(storeProduct instanceof TestStoreProduct)) {
                return;
            }
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.ProductNotAvailableForPurchaseError;
            throw new PurchasesException(new PurchasesError(purchasesErrorCode, "Cannot purchase " + storeProduct));
        }

        public PurchaseParams build() {
            StoreProduct storeProduct = this.product;
            if (storeProduct != null) {
                ensureNoTestProduct(storeProduct);
            }
            return new PurchaseParams(this);
        }

        public final /* synthetic */ Activity getActivity$purchases_customEntitlementComputationRelease() {
            return this.activity;
        }

        public final /* synthetic */ GoogleReplacementMode getGoogleReplacementMode$purchases_customEntitlementComputationRelease() {
            return this.googleReplacementMode;
        }

        public final /* synthetic */ String getOldProductId$purchases_customEntitlementComputationRelease() {
            return this.oldProductId;
        }

        public final /* synthetic */ PresentedOfferingContext getPresentedOfferingContext$purchases_customEntitlementComputationRelease() {
            return this.presentedOfferingContext;
        }

        public final /* synthetic */ StoreProduct getProduct$purchases_customEntitlementComputationRelease() {
            return this.product;
        }

        public final /* synthetic */ PurchasingData getPurchasingData$purchases_customEntitlementComputationRelease() {
            return this.purchasingData;
        }

        public final Builder googleProrationMode(GoogleProrationMode googleProrationMode) {
            AbstractC3557B.c0("googleProrationMode", googleProrationMode);
            this.googleReplacementMode = googleProrationMode.getAsGoogleReplacementMode$purchases_customEntitlementComputationRelease();
            return this;
        }

        public final Builder googleReplacementMode(GoogleReplacementMode googleReplacementMode) {
            AbstractC3557B.c0("googleReplacementMode", googleReplacementMode);
            this.googleReplacementMode = googleReplacementMode;
            return this;
        }

        public final Builder isPersonalizedPrice(boolean z10) {
            this.isPersonalizedPrice = Boolean.valueOf(z10);
            return this;
        }

        public final /* synthetic */ Boolean isPersonalizedPrice$purchases_customEntitlementComputationRelease() {
            return this.isPersonalizedPrice;
        }

        public final Builder oldProductId(String str) {
            AbstractC3557B.c0("oldProductId", str);
            this.oldProductId = str;
            return this;
        }

        public final Builder presentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
            AbstractC3557B.c0("presentedOfferingContext", presentedOfferingContext);
            this.presentedOfferingContext = presentedOfferingContext;
            return this;
        }

        public final /* synthetic */ void setGoogleReplacementMode$purchases_customEntitlementComputationRelease(GoogleReplacementMode googleReplacementMode) {
            AbstractC3557B.c0("<set-?>", googleReplacementMode);
            this.googleReplacementMode = googleReplacementMode;
        }

        public final /* synthetic */ void setOldProductId$purchases_customEntitlementComputationRelease(String str) {
            this.oldProductId = str;
        }

        public final /* synthetic */ void setPersonalizedPrice$purchases_customEntitlementComputationRelease(Boolean bool) {
            this.isPersonalizedPrice = bool;
        }

        public final void setPresentedOfferingContext$purchases_customEntitlementComputationRelease(PresentedOfferingContext presentedOfferingContext) {
            this.presentedOfferingContext = presentedOfferingContext;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, Package r42) {
            this(activity, r42.getProduct().getPurchasingData(), r42.getPresentedOfferingContext(), r42.getProduct());
            AbstractC3557B.c0("activity", activity);
            AbstractC3557B.c0("packageToPurchase", r42);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, StoreProduct storeProduct) {
            this(activity, storeProduct.getPurchasingData(), storeProduct.getPresentedOfferingContext(), storeProduct);
            AbstractC3557B.c0("activity", activity);
            AbstractC3557B.c0("storeProduct", storeProduct);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, SubscriptionOption subscriptionOption) {
            this(activity, subscriptionOption.getPurchasingData(), subscriptionOption.getPresentedOfferingContext(), null);
            AbstractC3557B.c0("activity", activity);
            AbstractC3557B.c0("subscriptionOption", subscriptionOption);
        }
    }
}

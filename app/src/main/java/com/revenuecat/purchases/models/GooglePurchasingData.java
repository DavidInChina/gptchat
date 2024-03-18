package com.revenuecat.purchases.models;

import E9.f;
import K4.q;
import android.gov.nist.core.a;
import com.revenuecat.purchases.ProductType;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData;", "Lcom/revenuecat/purchases/models/PurchasingData;", "()V", "productType", "Lcom/revenuecat/purchases/ProductType;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "InAppProduct", "Subscription", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public abstract class GooglePurchasingData implements PurchasingData {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "component1", "()Ljava/lang/String;", "LK4/q;", "component2", "()LK4/q;", "productId", "productDetails", "copy", "(Ljava/lang/String;LK4/q;)Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "LK4/q;", "getProductDetails", "<init>", "(Ljava/lang/String;LK4/q;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class InAppProduct extends GooglePurchasingData {
        private final q productDetails;
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppProduct(String str, q qVar) {
            super(null);
            AbstractC3557B.c0("productId", str);
            AbstractC3557B.c0("productDetails", qVar);
            this.productId = str;
            this.productDetails = qVar;
        }

        public static /* synthetic */ InAppProduct copy$default(InAppProduct inAppProduct, String str, q qVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inAppProduct.getProductId();
            }
            if ((i10 & 2) != 0) {
                qVar = inAppProduct.productDetails;
            }
            return inAppProduct.copy(str, qVar);
        }

        public final String component1() {
            return getProductId();
        }

        public final q component2() {
            return this.productDetails;
        }

        public final InAppProduct copy(String str, q qVar) {
            AbstractC3557B.c0("productId", str);
            AbstractC3557B.c0("productDetails", qVar);
            return new InAppProduct(str, qVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppProduct)) {
                return false;
            }
            InAppProduct inAppProduct = (InAppProduct) obj;
            return AbstractC3557B.K(getProductId(), inAppProduct.getProductId()) && AbstractC3557B.K(this.productDetails, inAppProduct.productDetails);
        }

        public final q getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.productDetails.f9459a.hashCode() + (getProductId().hashCode() * 31);
        }

        public String toString() {
            return "InAppProduct(productId=" + getProductId() + ", productDetails=" + this.productDetails + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\u0004J8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001b\u0010\u0004R\u0017\u0010\f\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001e\u0010\u0004\u00a8\u0006!"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "component1", "()Ljava/lang/String;", "component2", "LK4/q;", "component3", "()LK4/q;", "component4", "productId", "optionId", "productDetails", "token", "copy", "(Ljava/lang/String;Ljava/lang/String;LK4/q;Ljava/lang/String;)Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getOptionId", "LK4/q;", "getProductDetails", "getToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;LK4/q;Ljava/lang/String;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class Subscription extends GooglePurchasingData {
        private final String optionId;
        private final q productDetails;
        private final String productId;
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(String str, String str2, q qVar, String str3) {
            super(null);
            AbstractC3557B.c0("productId", str);
            AbstractC3557B.c0("optionId", str2);
            AbstractC3557B.c0("productDetails", qVar);
            AbstractC3557B.c0("token", str3);
            this.productId = str;
            this.optionId = str2;
            this.productDetails = qVar;
            this.token = str3;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, q qVar, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = subscription.getProductId();
            }
            if ((i10 & 2) != 0) {
                str2 = subscription.optionId;
            }
            if ((i10 & 4) != 0) {
                qVar = subscription.productDetails;
            }
            if ((i10 & 8) != 0) {
                str3 = subscription.token;
            }
            return subscription.copy(str, str2, qVar, str3);
        }

        public final String component1() {
            return getProductId();
        }

        public final String component2() {
            return this.optionId;
        }

        public final q component3() {
            return this.productDetails;
        }

        public final String component4() {
            return this.token;
        }

        public final Subscription copy(String str, String str2, q qVar, String str3) {
            AbstractC3557B.c0("productId", str);
            AbstractC3557B.c0("optionId", str2);
            AbstractC3557B.c0("productDetails", qVar);
            AbstractC3557B.c0("token", str3);
            return new Subscription(str, str2, qVar, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return AbstractC3557B.K(getProductId(), subscription.getProductId()) && AbstractC3557B.K(this.optionId, subscription.optionId) && AbstractC3557B.K(this.productDetails, subscription.productDetails) && AbstractC3557B.K(this.token, subscription.token);
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final q getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return this.token.hashCode() + f.v(this.productDetails.f9459a, f.v(this.optionId, getProductId().hashCode() * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Subscription(productId=");
            sb2.append(getProductId());
            sb2.append(", optionId=");
            sb2.append(this.optionId);
            sb2.append(", productDetails=");
            sb2.append(this.productDetails);
            sb2.append(", token=");
            return a.n(sb2, this.token, ')');
        }
    }

    private GooglePurchasingData() {
    }

    public /* synthetic */ GooglePurchasingData(g gVar) {
        this();
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public ProductType getProductType() {
        if (this instanceof InAppProduct) {
            return ProductType.INAPP;
        }
        if (this instanceof Subscription) {
            return ProductType.SUBS;
        }
        throw new RuntimeException();
    }
}

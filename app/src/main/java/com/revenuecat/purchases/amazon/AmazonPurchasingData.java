package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.PurchasingData;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonPurchasingData;", "Lcom/revenuecat/purchases/models/PurchasingData;", "()V", "Product", "Lcom/revenuecat/purchases/amazon/AmazonPurchasingData$Product;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public abstract class AmazonPurchasingData implements PurchasingData {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonPurchasingData$Product;", "Lcom/revenuecat/purchases/amazon/AmazonPurchasingData;", "storeProduct", "Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;", "(Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;)V", "productId", "", "getProductId", "()Ljava/lang/String;", "productType", "Lcom/revenuecat/purchases/ProductType;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "getStoreProduct", "()Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Product extends AmazonPurchasingData {
        private final AmazonStoreProduct storeProduct;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Product(AmazonStoreProduct amazonStoreProduct) {
            super(null);
            AbstractC3557B.c0("storeProduct", amazonStoreProduct);
            this.storeProduct = amazonStoreProduct;
        }

        public static /* synthetic */ Product copy$default(Product product, AmazonStoreProduct amazonStoreProduct, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                amazonStoreProduct = product.storeProduct;
            }
            return product.copy(amazonStoreProduct);
        }

        public final AmazonStoreProduct component1() {
            return this.storeProduct;
        }

        public final Product copy(AmazonStoreProduct amazonStoreProduct) {
            AbstractC3557B.c0("storeProduct", amazonStoreProduct);
            return new Product(amazonStoreProduct);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Product) && AbstractC3557B.K(this.storeProduct, ((Product) obj).storeProduct);
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.storeProduct.getId();
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public ProductType getProductType() {
            return this.storeProduct.getType();
        }

        public final AmazonStoreProduct getStoreProduct() {
            return this.storeProduct;
        }

        public int hashCode() {
            return this.storeProduct.hashCode();
        }

        public String toString() {
            return "Product(storeProduct=" + this.storeProduct + ')';
        }
    }

    private AmazonPurchasingData() {
    }

    public /* synthetic */ AmazonPurchasingData(g gVar) {
        this();
    }
}

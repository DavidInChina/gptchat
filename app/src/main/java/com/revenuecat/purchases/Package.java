package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00038FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/revenuecat/purchases/Package;", "", "identifier", "", "packageType", "Lcom/revenuecat/purchases/PackageType;", "product", "Lcom/revenuecat/purchases/models/StoreProduct;", "offering", "(Ljava/lang/String;Lcom/revenuecat/purchases/PackageType;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/lang/String;)V", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "(Ljava/lang/String;Lcom/revenuecat/purchases/PackageType;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "getIdentifier", "()Ljava/lang/String;", "getOffering$annotations", "()V", "getOffering", "getPackageType", "()Lcom/revenuecat/purchases/PackageType;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getProduct", "()Lcom/revenuecat/purchases/models/StoreProduct;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class Package {
    private final String identifier;
    private final PackageType packageType;
    private final PresentedOfferingContext presentedOfferingContext;
    private final StoreProduct product;

    public Package(String str, PackageType packageType, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        AbstractC3557B.c0("identifier", str);
        AbstractC3557B.c0("packageType", packageType);
        AbstractC3557B.c0("product", storeProduct);
        AbstractC3557B.c0("presentedOfferingContext", presentedOfferingContext);
        this.identifier = str;
        this.packageType = packageType;
        this.product = storeProduct;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public static /* synthetic */ Package copy$default(Package r02, String str, PackageType packageType, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = r02.identifier;
        }
        if ((i10 & 2) != 0) {
            packageType = r02.packageType;
        }
        if ((i10 & 4) != 0) {
            storeProduct = r02.product;
        }
        if ((i10 & 8) != 0) {
            presentedOfferingContext = r02.presentedOfferingContext;
        }
        return r02.copy(str, packageType, storeProduct, presentedOfferingContext);
    }

    public static /* synthetic */ void getOffering$annotations() {
    }

    public final String component1() {
        return this.identifier;
    }

    public final PackageType component2() {
        return this.packageType;
    }

    public final StoreProduct component3() {
        return this.product;
    }

    public final PresentedOfferingContext component4() {
        return this.presentedOfferingContext;
    }

    public final Package copy(String str, PackageType packageType, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        AbstractC3557B.c0("identifier", str);
        AbstractC3557B.c0("packageType", packageType);
        AbstractC3557B.c0("product", storeProduct);
        AbstractC3557B.c0("presentedOfferingContext", presentedOfferingContext);
        return new Package(str, packageType, storeProduct, presentedOfferingContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Package)) {
            return false;
        }
        Package r52 = (Package) obj;
        return AbstractC3557B.K(this.identifier, r52.identifier) && this.packageType == r52.packageType && AbstractC3557B.K(this.product, r52.product) && AbstractC3557B.K(this.presentedOfferingContext, r52.presentedOfferingContext);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getOffering() {
        String offeringIdentifier = this.presentedOfferingContext.getOfferingIdentifier();
        if (offeringIdentifier == null) {
            return "";
        }
        return offeringIdentifier;
    }

    public final PackageType getPackageType() {
        return this.packageType;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        int hashCode = this.packageType.hashCode();
        int hashCode2 = this.product.hashCode();
        return this.presentedOfferingContext.hashCode() + ((hashCode2 + ((hashCode + (this.identifier.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Package(identifier=" + this.identifier + ", packageType=" + this.packageType + ", product=" + this.product + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Package(String str, PackageType packageType, StoreProduct storeProduct, String str2) {
        this(str, packageType, storeProduct, new PresentedOfferingContext(str2));
        AbstractC3557B.c0("identifier", str);
        AbstractC3557B.c0("packageType", packageType);
        AbstractC3557B.c0("product", storeProduct);
        AbstractC3557B.c0("offering", str2);
    }
}

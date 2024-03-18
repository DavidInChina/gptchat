package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import java.util.Date;
import java.util.List;
import k6.AbstractC4194d;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "", "productIdentifier", "", "basePlanId", "storeTransaction", "Lcom/revenuecat/purchases/models/StoreTransaction;", CustomerInfoResponseJsonKeys.ENTITLEMENTS, "", "expiresDate", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreTransaction;Ljava/util/List;Ljava/util/Date;)V", "getBasePlanId", "()Ljava/lang/String;", "getEntitlements", "()Ljava/util/List;", "getExpiresDate", "()Ljava/util/Date;", "getProductIdentifier", "getStoreTransaction", "()Lcom/revenuecat/purchases/models/StoreTransaction;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class PurchasedProduct {
    private final String basePlanId;
    private final List<String> entitlements;
    private final Date expiresDate;
    private final String productIdentifier;
    private final StoreTransaction storeTransaction;

    public PurchasedProduct(String str, String str2, StoreTransaction storeTransaction, List<String> list, Date date) {
        AbstractC3557B.c0("productIdentifier", str);
        AbstractC3557B.c0("storeTransaction", storeTransaction);
        AbstractC3557B.c0(CustomerInfoResponseJsonKeys.ENTITLEMENTS, list);
        this.productIdentifier = str;
        this.basePlanId = str2;
        this.storeTransaction = storeTransaction;
        this.entitlements = list;
        this.expiresDate = date;
    }

    public static /* synthetic */ PurchasedProduct copy$default(PurchasedProduct purchasedProduct, String str, String str2, StoreTransaction storeTransaction, List list, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = purchasedProduct.productIdentifier;
        }
        if ((i10 & 2) != 0) {
            str2 = purchasedProduct.basePlanId;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            storeTransaction = purchasedProduct.storeTransaction;
        }
        StoreTransaction storeTransaction2 = storeTransaction;
        List<String> list2 = list;
        if ((i10 & 8) != 0) {
            list2 = purchasedProduct.entitlements;
        }
        List list3 = list2;
        if ((i10 & 16) != 0) {
            date = purchasedProduct.expiresDate;
        }
        return purchasedProduct.copy(str, str3, storeTransaction2, list3, date);
    }

    public final String component1() {
        return this.productIdentifier;
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final StoreTransaction component3() {
        return this.storeTransaction;
    }

    public final List<String> component4() {
        return this.entitlements;
    }

    public final Date component5() {
        return this.expiresDate;
    }

    public final PurchasedProduct copy(String str, String str2, StoreTransaction storeTransaction, List<String> list, Date date) {
        AbstractC3557B.c0("productIdentifier", str);
        AbstractC3557B.c0("storeTransaction", storeTransaction);
        AbstractC3557B.c0(CustomerInfoResponseJsonKeys.ENTITLEMENTS, list);
        return new PurchasedProduct(str, str2, storeTransaction, list, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasedProduct)) {
            return false;
        }
        PurchasedProduct purchasedProduct = (PurchasedProduct) obj;
        return AbstractC3557B.K(this.productIdentifier, purchasedProduct.productIdentifier) && AbstractC3557B.K(this.basePlanId, purchasedProduct.basePlanId) && AbstractC3557B.K(this.storeTransaction, purchasedProduct.storeTransaction) && AbstractC3557B.K(this.entitlements, purchasedProduct.entitlements) && AbstractC3557B.K(this.expiresDate, purchasedProduct.expiresDate);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final List<String> getEntitlements() {
        return this.entitlements;
    }

    public final Date getExpiresDate() {
        return this.expiresDate;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final StoreTransaction getStoreTransaction() {
        return this.storeTransaction;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.productIdentifier.hashCode() * 31;
        String str = this.basePlanId;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int s10 = AbstractC4194d.s(this.entitlements, (this.storeTransaction.hashCode() + ((hashCode + i10) * 31)) * 31, 31);
        Date date = this.expiresDate;
        if (date != null) {
            i11 = date.hashCode();
        }
        return s10 + i11;
    }

    public String toString() {
        return "PurchasedProduct(productIdentifier=" + this.productIdentifier + ", basePlanId=" + this.basePlanId + ", storeTransaction=" + this.storeTransaction + ", entitlements=" + this.entitlements + ", expiresDate=" + this.expiresDate + ')';
    }
}

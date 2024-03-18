package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/PurchaseResult;", "", "storeTransaction", "Lcom/revenuecat/purchases/models/StoreTransaction;", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "getStoreTransaction", "()Lcom/revenuecat/purchases/models/StoreTransaction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class PurchaseResult {
    private final CustomerInfo customerInfo;
    private final StoreTransaction storeTransaction;

    public PurchaseResult(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        AbstractC3557B.c0("storeTransaction", storeTransaction);
        AbstractC3557B.c0("customerInfo", customerInfo);
        this.storeTransaction = storeTransaction;
        this.customerInfo = customerInfo;
    }

    public static /* synthetic */ PurchaseResult copy$default(PurchaseResult purchaseResult, StoreTransaction storeTransaction, CustomerInfo customerInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            storeTransaction = purchaseResult.storeTransaction;
        }
        if ((i10 & 2) != 0) {
            customerInfo = purchaseResult.customerInfo;
        }
        return purchaseResult.copy(storeTransaction, customerInfo);
    }

    public final StoreTransaction component1() {
        return this.storeTransaction;
    }

    public final CustomerInfo component2() {
        return this.customerInfo;
    }

    public final PurchaseResult copy(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        AbstractC3557B.c0("storeTransaction", storeTransaction);
        AbstractC3557B.c0("customerInfo", customerInfo);
        return new PurchaseResult(storeTransaction, customerInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseResult)) {
            return false;
        }
        PurchaseResult purchaseResult = (PurchaseResult) obj;
        return AbstractC3557B.K(this.storeTransaction, purchaseResult.storeTransaction) && AbstractC3557B.K(this.customerInfo, purchaseResult.customerInfo);
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final StoreTransaction getStoreTransaction() {
        return this.storeTransaction;
    }

    public int hashCode() {
        return this.customerInfo.hashCode() + (this.storeTransaction.hashCode() * 31);
    }

    public String toString() {
        return "PurchaseResult(storeTransaction=" + this.storeTransaction + ", customerInfo=" + this.customerInfo + ')';
    }
}

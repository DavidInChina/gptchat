package com.revenuecat.purchases;

import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/PurchasesStateCache;", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "purchasesState", "Lcom/revenuecat/purchases/PurchasesState;", "(Lcom/revenuecat/purchases/PurchasesState;)V", "getPurchasesState", "()Lcom/revenuecat/purchases/PurchasesState;", "setPurchasesState", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class PurchasesStateCache implements PurchasesStateProvider {
    private PurchasesState purchasesState;

    public PurchasesStateCache(PurchasesState purchasesState) {
        AbstractC3557B.c0("purchasesState", purchasesState);
        this.purchasesState = purchasesState;
    }

    public static /* synthetic */ PurchasesStateCache copy$default(PurchasesStateCache purchasesStateCache, PurchasesState purchasesState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            purchasesState = purchasesStateCache.getPurchasesState();
        }
        return purchasesStateCache.copy(purchasesState);
    }

    public final PurchasesState component1() {
        return getPurchasesState();
    }

    public final PurchasesStateCache copy(PurchasesState purchasesState) {
        AbstractC3557B.c0("purchasesState", purchasesState);
        return new PurchasesStateCache(purchasesState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchasesStateCache) && AbstractC3557B.K(getPurchasesState(), ((PurchasesStateCache) obj).getPurchasesState());
    }

    @Override // com.revenuecat.purchases.PurchasesStateProvider
    public synchronized PurchasesState getPurchasesState() {
        return this.purchasesState;
    }

    public int hashCode() {
        return getPurchasesState().hashCode();
    }

    public synchronized void setPurchasesState(PurchasesState purchasesState) {
        AbstractC3557B.c0("<set-?>", purchasesState);
        this.purchasesState = purchasesState;
    }

    public String toString() {
        return "PurchasesStateCache(purchasesState=" + getPurchasesState() + ')';
    }
}

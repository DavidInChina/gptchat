package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import id.AbstractC3557B;
import java.util.Map;
import kf.w;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import y.AbstractC6463a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006#"}, d2 = {"Lcom/revenuecat/purchases/PurchasesState;", "", "allowSharingPlayStoreAccount", "", "purchaseCallbacksByProductId", "", "", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "deprecatedProductChangeCallback", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "appInBackground", "firstTimeInForeground", "(Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;ZZ)V", "getAllowSharingPlayStoreAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAppInBackground", "()Z", "getDeprecatedProductChangeCallback", "()Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "getFirstTimeInForeground", "getPurchaseCallbacksByProductId", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;ZZ)Lcom/revenuecat/purchases/PurchasesState;", "equals", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class PurchasesState {
    private final Boolean allowSharingPlayStoreAccount;
    private final boolean appInBackground;
    private final ProductChangeCallback deprecatedProductChangeCallback;
    private final boolean firstTimeInForeground;
    private final Map<String, PurchaseCallback> purchaseCallbacksByProductId;

    public PurchasesState() {
        this(null, null, null, false, false, 31, null);
    }

    public static /* synthetic */ PurchasesState copy$default(PurchasesState purchasesState, Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = purchasesState.allowSharingPlayStoreAccount;
        }
        Map<String, PurchaseCallback> map2 = map;
        if ((i10 & 2) != 0) {
            map2 = purchasesState.purchaseCallbacksByProductId;
        }
        Map map3 = map2;
        if ((i10 & 4) != 0) {
            productChangeCallback = purchasesState.deprecatedProductChangeCallback;
        }
        ProductChangeCallback productChangeCallback2 = productChangeCallback;
        if ((i10 & 8) != 0) {
            z10 = purchasesState.appInBackground;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = purchasesState.firstTimeInForeground;
        }
        return purchasesState.copy(bool, map3, productChangeCallback2, z12, z11);
    }

    public final Boolean component1() {
        return this.allowSharingPlayStoreAccount;
    }

    public final Map<String, PurchaseCallback> component2() {
        return this.purchaseCallbacksByProductId;
    }

    public final ProductChangeCallback component3() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean component4() {
        return this.appInBackground;
    }

    public final boolean component5() {
        return this.firstTimeInForeground;
    }

    public final PurchasesState copy(Boolean bool, Map<String, ? extends PurchaseCallback> map, ProductChangeCallback productChangeCallback, boolean z10, boolean z11) {
        AbstractC3557B.c0("purchaseCallbacksByProductId", map);
        return new PurchasesState(bool, map, productChangeCallback, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasesState)) {
            return false;
        }
        PurchasesState purchasesState = (PurchasesState) obj;
        return AbstractC3557B.K(this.allowSharingPlayStoreAccount, purchasesState.allowSharingPlayStoreAccount) && AbstractC3557B.K(this.purchaseCallbacksByProductId, purchasesState.purchaseCallbacksByProductId) && AbstractC3557B.K(this.deprecatedProductChangeCallback, purchasesState.deprecatedProductChangeCallback) && this.appInBackground == purchasesState.appInBackground && this.firstTimeInForeground == purchasesState.firstTimeInForeground;
    }

    public final Boolean getAllowSharingPlayStoreAccount() {
        return this.allowSharingPlayStoreAccount;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final ProductChangeCallback getDeprecatedProductChangeCallback() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean getFirstTimeInForeground() {
        return this.firstTimeInForeground;
    }

    public final Map<String, PurchaseCallback> getPurchaseCallbacksByProductId() {
        return this.purchaseCallbacksByProductId;
    }

    public int hashCode() {
        int i10;
        Boolean bool = this.allowSharingPlayStoreAccount;
        int i11 = 0;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        int f6 = AbstractC6463a.f(this.purchaseCallbacksByProductId, i10 * 31, 31);
        ProductChangeCallback productChangeCallback = this.deprecatedProductChangeCallback;
        if (productChangeCallback != null) {
            i11 = productChangeCallback.hashCode();
        }
        int i12 = (f6 + i11) * 31;
        boolean z10 = this.appInBackground;
        int i13 = 1;
        if (z10) {
            z10 = true;
        }
        int i14 = z10 ? 1 : 0;
        int i15 = z10 ? 1 : 0;
        int i16 = (i12 + i14) * 31;
        boolean z11 = this.firstTimeInForeground;
        if (!z11) {
            i13 = z11 ? 1 : 0;
        }
        return i16 + i13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PurchasesState(allowSharingPlayStoreAccount=");
        sb2.append(this.allowSharingPlayStoreAccount);
        sb2.append(", purchaseCallbacksByProductId=");
        sb2.append(this.purchaseCallbacksByProductId);
        sb2.append(", deprecatedProductChangeCallback=");
        sb2.append(this.deprecatedProductChangeCallback);
        sb2.append(", appInBackground=");
        sb2.append(this.appInBackground);
        sb2.append(", firstTimeInForeground=");
        return AbstractC6463a.l(sb2, this.firstTimeInForeground, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesState(Boolean bool, Map<String, ? extends PurchaseCallback> map, ProductChangeCallback productChangeCallback, boolean z10, boolean z11) {
        AbstractC3557B.c0("purchaseCallbacksByProductId", map);
        this.allowSharingPlayStoreAccount = bool;
        this.purchaseCallbacksByProductId = map;
        this.deprecatedProductChangeCallback = productChangeCallback;
        this.appInBackground = z10;
        this.firstTimeInForeground = z11;
    }

    public /* synthetic */ PurchasesState(Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z10, boolean z11, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? w.f37484Y : map, (i10 & 4) == 0 ? productChangeCallback : null, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? true : z11);
    }
}

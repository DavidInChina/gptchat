package com.revenuecat.purchases;

import com.revenuecat.purchases.api.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import y.AbstractC6463a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u000b\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/DangerousSettings;", "", "autoSyncPurchases", "", "(Z)V", BuildConfig.FLAVOR, "(ZZ)V", "getAutoSyncPurchases", "()Z", "getCustomEntitlementComputation$purchases_customEntitlementComputationRelease", "component1", "component2", "component2$purchases_customEntitlementComputationRelease", "copy", "equals", "other", "hashCode", "", "toString", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class DangerousSettings {
    private final boolean autoSyncPurchases;
    private final boolean customEntitlementComputation;

    public DangerousSettings() {
        this(false, false, 3, null);
    }

    public static /* synthetic */ DangerousSettings copy$default(DangerousSettings dangerousSettings, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = dangerousSettings.autoSyncPurchases;
        }
        if ((i10 & 2) != 0) {
            z11 = dangerousSettings.customEntitlementComputation;
        }
        return dangerousSettings.copy(z10, z11);
    }

    public final boolean component1() {
        return this.autoSyncPurchases;
    }

    public final boolean component2$purchases_customEntitlementComputationRelease() {
        return this.customEntitlementComputation;
    }

    public final DangerousSettings copy(boolean z10, boolean z11) {
        return new DangerousSettings(z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DangerousSettings)) {
            return false;
        }
        DangerousSettings dangerousSettings = (DangerousSettings) obj;
        return this.autoSyncPurchases == dangerousSettings.autoSyncPurchases && this.customEntitlementComputation == dangerousSettings.customEntitlementComputation;
    }

    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    public final boolean getCustomEntitlementComputation$purchases_customEntitlementComputationRelease() {
        return this.customEntitlementComputation;
    }

    public int hashCode() {
        boolean z10 = this.autoSyncPurchases;
        int i10 = 1;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = i11 * 31;
        boolean z11 = this.customEntitlementComputation;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return i13 + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DangerousSettings(autoSyncPurchases=");
        sb2.append(this.autoSyncPurchases);
        sb2.append(", customEntitlementComputation=");
        return AbstractC6463a.l(sb2, this.customEntitlementComputation, ')');
    }

    public DangerousSettings(boolean z10, boolean z11) {
        this.autoSyncPurchases = z10;
        this.customEntitlementComputation = z11;
    }

    public /* synthetic */ DangerousSettings(boolean z10, boolean z11, int i10, g gVar) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11);
    }

    public DangerousSettings(boolean z10) {
        this(z10, false);
    }

    public /* synthetic */ DangerousSettings(boolean z10, int i10, g gVar) {
        this((i10 & 1) != 0 ? true : z10);
    }
}

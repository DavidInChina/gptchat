package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import id.AbstractC3557B;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\fH\u00c6\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\bH\u00d6\u0001R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "productIds", "", "", "productType", "Lcom/revenuecat/purchases/ProductType;", "appInBackground", "", "(Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Ljava/util/Set;Lcom/revenuecat/purchases/ProductType;Z)V", "getAppInBackground", "()Z", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDiagnosticsTrackerIfEnabled", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "getProductIds", "()Ljava/util/Set;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class QueryProductDetailsUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Set<String> productIds;
    private final ProductType productType;

    public QueryProductDetailsUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set<String> set, ProductType productType, boolean z10) {
        AbstractC3557B.c0("dateProvider", dateProvider);
        AbstractC3557B.c0("productIds", set);
        AbstractC3557B.c0("productType", productType);
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.productIds = set;
        this.productType = productType;
        this.appInBackground = z10;
    }

    public static /* synthetic */ QueryProductDetailsUseCaseParams copy$default(QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams, DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set set, ProductType productType, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dateProvider = queryProductDetailsUseCaseParams.dateProvider;
        }
        if ((i10 & 2) != 0) {
            diagnosticsTracker = queryProductDetailsUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        DiagnosticsTracker diagnosticsTracker2 = diagnosticsTracker;
        Set<String> set2 = set;
        if ((i10 & 4) != 0) {
            set2 = queryProductDetailsUseCaseParams.productIds;
        }
        Set set3 = set2;
        if ((i10 & 8) != 0) {
            productType = queryProductDetailsUseCaseParams.productType;
        }
        ProductType productType2 = productType;
        if ((i10 & 16) != 0) {
            z10 = queryProductDetailsUseCaseParams.getAppInBackground();
        }
        return queryProductDetailsUseCaseParams.copy(dateProvider, diagnosticsTracker2, set3, productType2, z10);
    }

    public final DateProvider component1() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker component2() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final Set<String> component3() {
        return this.productIds;
    }

    public final ProductType component4() {
        return this.productType;
    }

    public final boolean component5() {
        return getAppInBackground();
    }

    public final QueryProductDetailsUseCaseParams copy(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set<String> set, ProductType productType, boolean z10) {
        AbstractC3557B.c0("dateProvider", dateProvider);
        AbstractC3557B.c0("productIds", set);
        AbstractC3557B.c0("productType", productType);
        return new QueryProductDetailsUseCaseParams(dateProvider, diagnosticsTracker, set, productType, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryProductDetailsUseCaseParams)) {
            return false;
        }
        QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams = (QueryProductDetailsUseCaseParams) obj;
        return AbstractC3557B.K(this.dateProvider, queryProductDetailsUseCaseParams.dateProvider) && AbstractC3557B.K(this.diagnosticsTrackerIfEnabled, queryProductDetailsUseCaseParams.diagnosticsTrackerIfEnabled) && AbstractC3557B.K(this.productIds, queryProductDetailsUseCaseParams.productIds) && this.productType == queryProductDetailsUseCaseParams.productType && getAppInBackground() == queryProductDetailsUseCaseParams.getAppInBackground();
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker getDiagnosticsTrackerIfEnabled() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final Set<String> getProductIds() {
        return this.productIds;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    public int hashCode() {
        int hashCode = this.dateProvider.hashCode() * 31;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        int hashCode2 = diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode();
        int hashCode3 = (this.productType.hashCode() + ((this.productIds.hashCode() + ((hashCode + hashCode2) * 31)) * 31)) * 31;
        boolean appInBackground = getAppInBackground();
        if (appInBackground) {
            appInBackground = true;
        }
        int i10 = appInBackground ? 1 : 0;
        int i11 = appInBackground ? 1 : 0;
        return hashCode3 + i10;
    }

    public String toString() {
        return "QueryProductDetailsUseCaseParams(dateProvider=" + this.dateProvider + ", diagnosticsTrackerIfEnabled=" + this.diagnosticsTrackerIfEnabled + ", productIds=" + this.productIds + ", productType=" + this.productType + ", appInBackground=" + getAppInBackground() + ')';
    }

    public /* synthetic */ QueryProductDetailsUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set set, ProductType productType, boolean z10, int i10, g gVar) {
        this((i10 & 1) != 0 ? new DefaultDateProvider() : dateProvider, diagnosticsTracker, set, productType, z10);
    }
}

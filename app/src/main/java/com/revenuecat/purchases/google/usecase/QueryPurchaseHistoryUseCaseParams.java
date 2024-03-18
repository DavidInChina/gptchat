package com.revenuecat.purchases.google.usecase;

import E9.f;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "productType", "", "appInBackground", "", "(Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Ljava/lang/String;Z)V", "getAppInBackground", "()Z", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDiagnosticsTrackerIfEnabled", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "getProductType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class QueryPurchaseHistoryUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final String productType;

    public QueryPurchaseHistoryUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, String str, boolean z10) {
        AbstractC3557B.c0("dateProvider", dateProvider);
        AbstractC3557B.c0("productType", str);
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.productType = str;
        this.appInBackground = z10;
    }

    public static /* synthetic */ QueryPurchaseHistoryUseCaseParams copy$default(QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams, DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dateProvider = queryPurchaseHistoryUseCaseParams.dateProvider;
        }
        if ((i10 & 2) != 0) {
            diagnosticsTracker = queryPurchaseHistoryUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        if ((i10 & 4) != 0) {
            str = queryPurchaseHistoryUseCaseParams.productType;
        }
        if ((i10 & 8) != 0) {
            z10 = queryPurchaseHistoryUseCaseParams.getAppInBackground();
        }
        return queryPurchaseHistoryUseCaseParams.copy(dateProvider, diagnosticsTracker, str, z10);
    }

    public final DateProvider component1() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker component2() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final String component3() {
        return this.productType;
    }

    public final boolean component4() {
        return getAppInBackground();
    }

    public final QueryPurchaseHistoryUseCaseParams copy(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, String str, boolean z10) {
        AbstractC3557B.c0("dateProvider", dateProvider);
        AbstractC3557B.c0("productType", str);
        return new QueryPurchaseHistoryUseCaseParams(dateProvider, diagnosticsTracker, str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryPurchaseHistoryUseCaseParams)) {
            return false;
        }
        QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams = (QueryPurchaseHistoryUseCaseParams) obj;
        return AbstractC3557B.K(this.dateProvider, queryPurchaseHistoryUseCaseParams.dateProvider) && AbstractC3557B.K(this.diagnosticsTrackerIfEnabled, queryPurchaseHistoryUseCaseParams.diagnosticsTrackerIfEnabled) && AbstractC3557B.K(this.productType, queryPurchaseHistoryUseCaseParams.productType) && getAppInBackground() == queryPurchaseHistoryUseCaseParams.getAppInBackground();
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

    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.dateProvider.hashCode() * 31;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker == null) {
            i10 = 0;
        } else {
            i10 = diagnosticsTracker.hashCode();
        }
        int v10 = f.v(this.productType, (hashCode + i10) * 31, 31);
        boolean appInBackground = getAppInBackground();
        if (appInBackground) {
            appInBackground = true;
        }
        int i11 = appInBackground ? 1 : 0;
        int i12 = appInBackground ? 1 : 0;
        return v10 + i11;
    }

    public String toString() {
        return "QueryPurchaseHistoryUseCaseParams(dateProvider=" + this.dateProvider + ", diagnosticsTrackerIfEnabled=" + this.diagnosticsTrackerIfEnabled + ", productType=" + this.productType + ", appInBackground=" + getAppInBackground() + ')';
    }

    public /* synthetic */ QueryPurchaseHistoryUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, String str, boolean z10, int i10, g gVar) {
        this((i10 & 1) != 0 ? new DefaultDateProvider() : dateProvider, diagnosticsTracker, str, z10);
    }
}

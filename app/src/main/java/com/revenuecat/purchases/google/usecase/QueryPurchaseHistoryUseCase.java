package com.revenuecat.purchases.google.usecase;

import K4.C0822j;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseHistoryRecordExtensionsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.strings.RestoreStrings;
import id.AbstractC3557B;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import jf.y;
import kf.v;
import kotlin.Metadata;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\n0\u0015\u0012\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u0015j\u0002`\u001b\u0012\u001e\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u0015\u0012\u0004\u0012\u00020\n0\u0015\u0012*\u0010'\u001a&\u0012\u0004\u0012\u00020%\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\n0\u0015\u0012\u0004\u0012\u00020\n0$j\u0002`&\u00a2\u0006\u0004\b(\u0010)J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R)\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\n0\u00158\u0006\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R'\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u0015j\u0002`\u001b8\u0006\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R/\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u0015\u0012\u0004\u0012\u00020\n0\u00158\u0006\u00a2\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0014\u0010#\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"\u00a8\u0006*"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "", "productType", "LK4/j;", "billingResult", "Ljava/util/Date;", "requestStartTime", "Ljf/y;", "trackGoogleQueryPurchaseHistoryRequestIfNeeded", "(Ljava/lang/String;LK4/j;Ljava/util/Date;)V", "executeAsync", "()V", "received", "onOk", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;", "useCaseParams", "Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;", "Lkotlin/Function1;", "onReceive", "Lwf/k;", "getOnReceive", "()Lwf/k;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "getOnError", "LK4/c;", "withConnectedClient", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryPurchaseHistoryUseCaseParams;Lwf/k;Lwf/k;Lwf/k;Lwf/n;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class QueryPurchaseHistoryUseCase extends BillingClientUseCase<List<? extends PurchaseHistoryRecord>> {
    private final k onError;
    private final k onReceive;
    private final QueryPurchaseHistoryUseCaseParams useCaseParams;
    private final k withConnectedClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchaseHistoryUseCase(QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams, k kVar, k kVar2, k kVar3, n nVar) {
        super(queryPurchaseHistoryUseCaseParams, kVar2, nVar);
        AbstractC3557B.c0("useCaseParams", queryPurchaseHistoryUseCaseParams);
        AbstractC3557B.c0("onReceive", kVar);
        AbstractC3557B.c0("onError", kVar2);
        AbstractC3557B.c0("withConnectedClient", kVar3);
        AbstractC3557B.c0("executeRequestOnUIThread", nVar);
        this.useCaseParams = queryPurchaseHistoryUseCaseParams;
        this.onReceive = kVar;
        this.onError = kVar2;
        this.withConnectedClient = kVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackGoogleQueryPurchaseHistoryRequestIfNeeded(String str, C0822j c0822j, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int i10 = c0822j.f9439a;
            String str2 = c0822j.f9440b;
            AbstractC3557B.b0("billingResult.debugMessage", str2);
            diagnosticsTrackerIfEnabled.m63trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(str, i10, str2, DurationExtensionsKt.between(Mg.b.f12127Z, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new QueryPurchaseHistoryUseCase$executeAsync$1(this));
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error receiving purchase history";
    }

    public final k getOnError() {
        return this.onError;
    }

    public final k getOnReceive() {
        return this.onReceive;
    }

    public final k getWithConnectedClient() {
        return this.withConnectedClient;
    }

    public void onOk(List<? extends PurchaseHistoryRecord> list) {
        y yVar = null;
        List<? extends PurchaseHistoryRecord> list2 = (list == null || list.isEmpty()) ? null : list;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                AbstractC2469q0.t(new Object[]{PurchaseHistoryRecordExtensionsKt.toHumanReadableDescription((PurchaseHistoryRecord) it.next())}, 1, RestoreStrings.PURCHASE_HISTORY_RETRIEVED, LogIntent.RC_PURCHASE_SUCCESS);
            }
            yVar = y.f36177a;
        }
        if (yVar == null) {
            LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.PURCHASE_HISTORY_EMPTY);
        }
        k kVar = this.onReceive;
        if (list == null) {
            list = v.f37483Y;
        }
        kVar.invoke(list);
    }
}

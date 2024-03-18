package com.revenuecat.purchases.google.usecase;

import K4.AbstractC0815c;
import K4.C0816d;
import K4.C0822j;
import K4.F;
import K4.G;
import K4.H;
import K4.s;
import K4.x;
import K4.y;
import U3.u;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.AbstractC2446f;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.C2442d;
import com.google.android.gms.internal.play_billing.C2454j;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreTransactionConversionsKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfferingStrings;
import id.AbstractC3557B;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import q.RunnableC5216j;
import wf.k;
import wf.n;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u001e\u0010\"\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\f0!\u0012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f0!\u0012\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0!\u0012\u0004\u0012\u00020\f0!\u0012*\u00101\u001a&\u0012\u0004\u0012\u00020/\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\f0!\u0012\u0004\u0012\u00020\f0.j\u0002`0\u00a2\u0006\u0004\b2\u00103J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R/\u0010\"\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\f0!8\u0006\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f0!8\u0006\u00a2\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R/\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0!\u0012\u0004\u0012\u00020\f0!8\u0006\u00a2\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u0014\u0010-\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010,\u00a8\u00064"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "LK4/c;", "billingClient", "productType", "LK4/x;", "queryParams", "LK4/s;", "listener", "Ljf/y;", "queryPurchasesAsyncWithTrackingEnsuringOneResponse", "(LK4/c;Ljava/lang/String;LK4/x;LK4/s;)V", "LK4/j;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryPurchasesRequestIfNeeded", "(Ljava/lang/String;LK4/j;Ljava/util/Date;)V", "", "Lcom/android/billingclient/api/Purchase;", "toMapOfGooglePurchaseWrapper", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;", "executeAsync", "()V", "received", "onOk", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;", "useCaseParams", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;", "Lkotlin/Function1;", "onSuccess", "Lwf/k;", "getOnSuccess", "()Lwf/k;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getOnError", "withConnectedClient", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;Lwf/k;Lwf/k;Lwf/k;Lwf/n;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class QueryPurchasesByTypeUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final k onError;
    private final k onSuccess;
    private final QueryPurchasesByTypeUseCaseParams useCaseParams;
    private final k withConnectedClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesByTypeUseCase(QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams, k kVar, k kVar2, k kVar3, n nVar) {
        super(queryPurchasesByTypeUseCaseParams, kVar2, nVar);
        AbstractC3557B.c0("useCaseParams", queryPurchasesByTypeUseCaseParams);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        AbstractC3557B.c0("withConnectedClient", kVar3);
        AbstractC3557B.c0("executeRequestOnUIThread", nVar);
        this.useCaseParams = queryPurchasesByTypeUseCaseParams;
        this.onSuccess = kVar;
        this.onError = kVar2;
        this.withConnectedClient = kVar3;
    }

    public final void queryPurchasesAsyncWithTrackingEnsuringOneResponse(AbstractC0815c abstractC0815c, String str, x xVar, s sVar) {
        c cVar = new c(new AtomicBoolean(false), this, str, this.useCaseParams.getDateProvider().getNow(), sVar);
        C0816d c0816d = (C0816d) abstractC0815c;
        c0816d.getClass();
        String str2 = xVar.f9474a;
        if (!c0816d.c()) {
            G g10 = c0816d.f9404f;
            C0822j c0822j = H.f9361j;
            ((u) g10).S(F.b(2, 9, c0822j));
            C2442d c2442d = AbstractC2446f.f26919Z;
            cVar.b(c0822j, C2454j.f26930j0);
        } else if (TextUtils.isEmpty(str2)) {
            AbstractC2468q.e("BillingClient", "Please provide a valid product type.");
            G g11 = c0816d.f9404f;
            C0822j c0822j2 = H.f9356e;
            ((u) g11).S(F.b(50, 9, c0822j2));
            C2442d c2442d2 = AbstractC2446f.f26919Z;
            cVar.b(c0822j2, C2454j.f26930j0);
        } else if (c0816d.j(new y(c0816d, str2, cVar, 2), 30000L, new RunnableC5216j(c0816d, cVar, 14), c0816d.f()) == null) {
            C0822j h10 = c0816d.h();
            ((u) c0816d.f9404f).S(F.b(25, 9, h10));
            C2442d c2442d3 = AbstractC2446f.f26919Z;
            cVar.b(h10, C2454j.f26930j0);
        }
    }

    public static final void queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$0(AtomicBoolean atomicBoolean, QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, String str, Date date, s sVar, C0822j c0822j, List list) {
        AbstractC3557B.c0("$hasResponded", atomicBoolean);
        AbstractC3557B.c0("this$0", queryPurchasesByTypeUseCase);
        AbstractC3557B.c0("$productType", str);
        AbstractC3557B.c0("$requestStartTime", date);
        AbstractC3557B.c0("$listener", sVar);
        AbstractC3557B.c0("billingResult", c0822j);
        AbstractC3557B.c0("purchases", list);
        if (atomicBoolean.getAndSet(true)) {
            AbstractC2469q0.t(new Object[]{Integer.valueOf(c0822j.f9439a)}, 1, OfferingStrings.EXTRA_QUERY_PURCHASES_RESPONSE, LogIntent.GOOGLE_ERROR);
            return;
        }
        queryPurchasesByTypeUseCase.trackGoogleQueryPurchasesRequestIfNeeded(str, c0822j, date);
        sVar.b(c0822j, list);
    }

    public final Map<String, StoreTransaction> toMapOfGooglePurchaseWrapper(List<? extends Purchase> list, String str) {
        int n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        for (Purchase purchase : list) {
            String b10 = purchase.b();
            AbstractC3557B.b0("purchase.purchaseToken", b10);
            linkedHashMap.put(UtilsKt.sha1(b10), StoreTransactionConversionsKt.toStoreTransaction$default(purchase, ProductTypeConversionsKt.toRevenueCatProductType(str), null, null, null, 14, null));
        }
        return linkedHashMap;
    }

    private final void trackGoogleQueryPurchasesRequestIfNeeded(String str, C0822j c0822j, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int i10 = c0822j.f9439a;
            String str2 = c0822j.f9440b;
            AbstractC3557B.b0("billingResult.debugMessage", str2);
            diagnosticsTrackerIfEnabled.m64trackGoogleQueryPurchasesRequestWn2Vu4Y(str, i10, str2, DurationExtensionsKt.between(Mg.b.f12127Z, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new QueryPurchasesByTypeUseCase$executeAsync$1(this));
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when querying purchases of type " + this.useCaseParams.getProductType();
    }

    public final k getOnError() {
        return this.onError;
    }

    public final k getOnSuccess() {
        return this.onSuccess;
    }

    public final k getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(Map<String, ? extends StoreTransaction> map) {
        onOk2((Map<String, StoreTransaction>) map);
    }

    /* renamed from: onOk */
    public void onOk2(Map<String, StoreTransaction> map) {
        AbstractC3557B.c0("received", map);
        this.onSuccess.invoke(map);
    }
}

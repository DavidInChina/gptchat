package com.revenuecat.purchases.google.usecase;

import K4.AbstractC0815c;
import K4.C0822j;
import K4.q;
import K4.r;
import K4.v;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.StoreProductConversionsKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kf.t;
import kotlin.Metadata;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u001c\u0010 \u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0002\u0012\u0004\u0012\u00020\f0\u001dj\u0002`\u001f\u0012\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u001dj\u0002`%\u0012\u001e\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001d\u0012\u0004\u0012\u00020\f0\u001d\u0012*\u00100\u001a&\u0012\u0004\u0012\u00020.\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\f0\u001d\u0012\u0004\u0012\u00020\f0-j\u0002`/\u00a2\u0006\u0004\b1\u00102J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR-\u0010 \u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0002\u0012\u0004\u0012\u00020\f0\u001dj\u0002`\u001f8\u0006\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R'\u0010&\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u001dj\u0002`%8\u0006\u00a2\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R/\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001d\u0012\u0004\u0012\u00020\f0\u001d8\u0006\u00a2\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u0014\u0010,\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+\u00a8\u00063"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "LK4/q;", "LK4/c;", "billingClient", "", "productType", "LK4/v;", "params", "LK4/r;", "listener", "Ljf/y;", "queryProductDetailsAsyncEnsuringOneResponse", "(LK4/c;Ljava/lang/String;LK4/v;LK4/r;)V", "LK4/j;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryProductDetailsRequestIfNeeded", "(Ljava/lang/String;LK4/j;Ljava/util/Date;)V", "executeAsync", "()V", "received", "onOk", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "useCaseParams", "Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lwf/k;", "getOnReceive", "()Lwf/k;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "getOnError", "withConnectedClient", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;Lwf/k;Lwf/k;Lwf/k;Lwf/n;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class QueryProductDetailsUseCase extends BillingClientUseCase<List<? extends q>> {
    private final k onError;
    private final k onReceive;
    private final QueryProductDetailsUseCaseParams useCaseParams;
    private final k withConnectedClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase(QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams, k kVar, k kVar2, k kVar3, n nVar) {
        super(queryProductDetailsUseCaseParams, kVar2, nVar);
        AbstractC3557B.c0("useCaseParams", queryProductDetailsUseCaseParams);
        AbstractC3557B.c0("onReceive", kVar);
        AbstractC3557B.c0("onError", kVar2);
        AbstractC3557B.c0("withConnectedClient", kVar3);
        AbstractC3557B.c0("executeRequestOnUIThread", nVar);
        this.useCaseParams = queryProductDetailsUseCaseParams;
        this.onReceive = kVar;
        this.onError = kVar2;
        this.withConnectedClient = kVar3;
    }

    public final synchronized void queryProductDetailsAsyncEnsuringOneResponse(AbstractC0815c abstractC0815c, String str, v vVar, r rVar) {
        abstractC0815c.d(vVar, new c(new AtomicBoolean(false), this, str, this.useCaseParams.getDateProvider().getNow(), rVar));
    }

    public static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$3(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, String str, Date date, r rVar, C0822j c0822j, List list) {
        AbstractC3557B.c0("$hasResponded", atomicBoolean);
        AbstractC3557B.c0("this$0", queryProductDetailsUseCase);
        AbstractC3557B.c0("$productType", str);
        AbstractC3557B.c0("$requestStartTime", date);
        AbstractC3557B.c0("$listener", rVar);
        AbstractC3557B.c0("billingResult", c0822j);
        AbstractC3557B.c0("productDetailsList", list);
        if (atomicBoolean.getAndSet(true)) {
            AbstractC2469q0.t(new Object[]{Integer.valueOf(c0822j.f9439a)}, 1, OfferingStrings.EXTRA_QUERY_PRODUCT_DETAILS_RESPONSE, LogIntent.GOOGLE_ERROR);
            return;
        }
        queryProductDetailsUseCase.trackGoogleQueryProductDetailsRequestIfNeeded(str, c0822j, date);
        rVar.a(c0822j, list);
    }

    private final void trackGoogleQueryProductDetailsRequestIfNeeded(String str, C0822j c0822j, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int i10 = c0822j.f9439a;
            String str2 = c0822j.f9440b;
            AbstractC3557B.b0("billingResult.debugMessage", str2);
            diagnosticsTrackerIfEnabled.m62trackGoogleQueryProductDetailsRequestWn2Vu4Y(str, i10, str2, DurationExtensionsKt.between(Mg.b.f12127Z, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.useCaseParams.getProductIds()) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Set P22 = t.P2(arrayList);
        if (P22.isEmpty()) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.EMPTY_PRODUCT_ID_LIST);
            this.onReceive.invoke(kf.v.f37483Y);
            return;
        }
        this.withConnectedClient.invoke(new QueryProductDetailsUseCase$executeAsync$1(this, P22));
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when fetching products";
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

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(List<? extends q> list) {
        onOk2((List<q>) list);
    }

    /* renamed from: onOk */
    public void onOk2(List<q> list) {
        AbstractC3557B.c0("received", list);
        AbstractC2469q0.t(new Object[]{t.m2(this.useCaseParams.getProductIds(), null, null, null, null, 63)}, 1, OfferingStrings.FETCHING_PRODUCTS_FINISHED, LogIntent.DEBUG);
        LogWrapperKt.log(LogIntent.PURCHASE, String.format(OfferingStrings.RETRIEVED_PRODUCTS, Arrays.copyOf(new Object[]{t.m2(list, null, null, null, QueryProductDetailsUseCase$onOk$1.INSTANCE, 31)}, 1)));
        List<q> list2 = !list.isEmpty() ? list : null;
        if (list2 != null) {
            for (q qVar : list2) {
                AbstractC2469q0.t(new Object[]{qVar.f9461c, qVar}, 2, OfferingStrings.LIST_PRODUCTS, LogIntent.PURCHASE);
            }
        }
        this.onReceive.invoke(StoreProductConversionsKt.toStoreProducts(list));
    }
}

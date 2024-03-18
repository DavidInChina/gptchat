package com.revenuecat.purchases.google.usecase;

import K4.AbstractC0815c;
import K4.C0822j;
import K4.x;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import jf.y;
import kf.w;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LK4/c;", "Ljf/y;", "invoke", "(LK4/c;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class QueryPurchasesByTypeUseCase$executeAsync$1 extends o implements k {
    final /* synthetic */ QueryPurchasesByTypeUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesByTypeUseCase$executeAsync$1(QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase) {
        super(1);
        this.this$0 = queryPurchasesByTypeUseCase;
    }

    public static final void invoke$lambda$1$lambda$0(QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, C0822j c0822j, List list) {
        QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams;
        Map mapOfGooglePurchaseWrapper;
        AbstractC3557B.c0("this$0", queryPurchasesByTypeUseCase);
        AbstractC3557B.c0("result", c0822j);
        AbstractC3557B.c0("purchases", list);
        queryPurchasesByTypeUseCaseParams = queryPurchasesByTypeUseCase.useCaseParams;
        mapOfGooglePurchaseWrapper = queryPurchasesByTypeUseCase.toMapOfGooglePurchaseWrapper(list, queryPurchasesByTypeUseCaseParams.getProductType());
        BillingClientUseCase.processResult$default(queryPurchasesByTypeUseCase, c0822j, mapOfGooglePurchaseWrapper, null, null, 12, null);
    }

    public final void invoke(AbstractC0815c abstractC0815c) {
        QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams;
        y yVar;
        QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams2;
        AbstractC3557B.c0("$this$invoke", abstractC0815c);
        queryPurchasesByTypeUseCaseParams = this.this$0.useCaseParams;
        x buildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams(queryPurchasesByTypeUseCaseParams.getProductType());
        if (buildQueryPurchasesParams != null) {
            QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase = this.this$0;
            queryPurchasesByTypeUseCaseParams2 = queryPurchasesByTypeUseCase.useCaseParams;
            queryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse(abstractC0815c, queryPurchasesByTypeUseCaseParams2.getProductType(), buildQueryPurchasesParams, new a(queryPurchasesByTypeUseCase));
            yVar = y.f36177a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase2 = this.this$0;
            LogUtilsKt.errorLog$default(String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchasesByType"}, 1)), null, 2, null);
            r2.d a5 = C0822j.a();
            a5.f44376a = 5;
            BillingClientUseCase.processResult$default(queryPurchasesByTypeUseCase2, a5.c(), w.f37484Y, null, null, 12, null);
        }
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC0815c) obj);
        return y.f36177a;
    }
}

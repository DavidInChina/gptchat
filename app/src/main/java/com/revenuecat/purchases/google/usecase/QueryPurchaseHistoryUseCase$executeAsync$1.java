package com.revenuecat.purchases.google.usecase;

import K4.AbstractC0815c;
import K4.C0816d;
import K4.C0822j;
import K4.F;
import K4.G;
import K4.H;
import K4.w;
import U3.u;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import q.RunnableC5216j;
import wf.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LK4/c;", "Ljf/y;", "invoke", "(LK4/c;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class QueryPurchaseHistoryUseCase$executeAsync$1 extends o implements k {
    final /* synthetic */ QueryPurchaseHistoryUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchaseHistoryUseCase$executeAsync$1(QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase) {
        super(1);
        this.this$0 = queryPurchaseHistoryUseCase;
    }

    public static final void invoke$lambda$1$lambda$0(AtomicBoolean atomicBoolean, QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, Date date, C0822j c0822j, List list) {
        QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams;
        AbstractC3557B.c0("$hasResponded", atomicBoolean);
        AbstractC3557B.c0("this$0", queryPurchaseHistoryUseCase);
        AbstractC3557B.c0("$requestStartTime", date);
        AbstractC3557B.c0("billingResult", c0822j);
        if (!atomicBoolean.getAndSet(true)) {
            queryPurchaseHistoryUseCaseParams = queryPurchaseHistoryUseCase.useCaseParams;
            queryPurchaseHistoryUseCase.trackGoogleQueryPurchaseHistoryRequestIfNeeded(queryPurchaseHistoryUseCaseParams.getProductType(), c0822j, date);
            BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase, c0822j, list, null, null, 12, null);
            return;
        }
        AbstractC2469q0.t(new Object[]{Integer.valueOf(c0822j.f9439a)}, 1, RestoreStrings.EXTRA_QUERY_PURCHASE_HISTORY_RESPONSE, LogIntent.GOOGLE_ERROR);
    }

    public final void invoke(AbstractC0815c abstractC0815c) {
        QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams;
        QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams2;
        y yVar;
        AbstractC3557B.c0("$this$invoke", abstractC0815c);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        queryPurchaseHistoryUseCaseParams = this.this$0.useCaseParams;
        Date now = queryPurchaseHistoryUseCaseParams.getDateProvider().getNow();
        queryPurchaseHistoryUseCaseParams2 = this.this$0.useCaseParams;
        w buildQueryPurchaseHistoryParams = BillingClientParamBuildersKt.buildQueryPurchaseHistoryParams(queryPurchaseHistoryUseCaseParams2.getProductType());
        if (buildQueryPurchaseHistoryParams != null) {
            d dVar = new d(atomicBoolean, this.this$0, now);
            C0816d c0816d = (C0816d) abstractC0815c;
            if (!c0816d.c()) {
                G g10 = c0816d.f9404f;
                C0822j c0822j = H.f9361j;
                ((u) g10).S(F.b(2, 11, c0822j));
                dVar.a(c0822j, null);
            } else if (c0816d.j(new K4.y(c0816d, buildQueryPurchaseHistoryParams.f9473a, dVar, 3), 30000L, new RunnableC5216j(c0816d, dVar, 15), c0816d.f()) == null) {
                C0822j h10 = c0816d.h();
                ((u) c0816d.f9404f).S(F.b(25, 11, h10));
                dVar.a(h10, null);
            }
            yVar = y.f36177a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase = this.this$0;
            LogUtilsKt.errorLog$default(String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchaseHistory"}, 1)), null, 2, null);
            r2.d a5 = C0822j.a();
            a5.f44376a = 5;
            BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase, a5.c(), null, null, null, 12, null);
        }
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC0815c) obj);
        return y.f36177a;
    }
}

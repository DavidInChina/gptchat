package com.revenuecat.purchases.google.usecase;

import K4.AbstractC0815c;
import K4.v;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import id.AbstractC3557B;
import java.util.Set;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LK4/c;", "Ljf/y;", "invoke", "(LK4/c;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class QueryProductDetailsUseCase$executeAsync$1 extends o implements k {
    final /* synthetic */ Set<String> $nonEmptyProductIds;
    final /* synthetic */ QueryProductDetailsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase$executeAsync$1(QueryProductDetailsUseCase queryProductDetailsUseCase, Set<String> set) {
        super(1);
        this.this$0 = queryProductDetailsUseCase;
        this.$nonEmptyProductIds = set;
    }

    public final void invoke(AbstractC0815c abstractC0815c) {
        QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams;
        AbstractC3557B.c0("$this$invoke", abstractC0815c);
        queryProductDetailsUseCaseParams = this.this$0.useCaseParams;
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(queryProductDetailsUseCaseParams.getProductType());
        if (googleProductType == null) {
            googleProductType = "inapp";
        }
        v buildQueryProductDetailsParams = BillingClientParamBuildersKt.buildQueryProductDetailsParams(googleProductType, this.$nonEmptyProductIds);
        QueryProductDetailsUseCase queryProductDetailsUseCase = this.this$0;
        queryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse(abstractC0815c, googleProductType, buildQueryProductDetailsParams, new a(queryProductDetailsUseCase));
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC0815c) obj);
        return y.f36177a;
    }
}

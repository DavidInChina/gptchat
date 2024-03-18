package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.PurchasesError;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class OfferingsManager$handleErrorFetchingOfferings$1 extends o implements AbstractC6216a {
    final /* synthetic */ PurchasesError $error;
    final /* synthetic */ k $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsManager$handleErrorFetchingOfferings$1(k kVar, PurchasesError purchasesError) {
        super(0);
        this.$onError = kVar;
        this.$error = purchasesError;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        k kVar = this.$onError;
        if (kVar != null) {
            kVar.invoke(this.$error);
        }
    }
}

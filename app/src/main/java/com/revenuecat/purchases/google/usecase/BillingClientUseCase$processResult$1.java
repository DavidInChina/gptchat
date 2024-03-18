package com.revenuecat.purchases.google.usecase;

import kotlin.Metadata;
import kotlin.jvm.internal.k;
import r9.y;

@Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public /* synthetic */ class BillingClientUseCase$processResult$1 extends k implements wf.k {
    public BillingClientUseCase$processResult$1(Object obj) {
        super(1, obj, BillingClientUseCase.class, "onOk", "onOk(Ljava/lang/Object;)V", 0);
    }

    @Override // wf.k
    public final void invoke(T t10) {
        ((BillingClientUseCase) this.receiver).onOk(t10);
    }
}

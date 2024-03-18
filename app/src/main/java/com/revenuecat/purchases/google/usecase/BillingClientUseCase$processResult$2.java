package com.revenuecat.purchases.google.usecase;

import K4.C0822j;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import r9.y;

@Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public /* synthetic */ class BillingClientUseCase$processResult$2 extends k implements wf.k {
    public BillingClientUseCase$processResult$2(Object obj) {
        super(1, obj, BillingClientUseCase.class, "forwardError", "forwardError(Lcom/android/billingclient/api/BillingResult;)V", 0);
    }

    public final void invoke(C0822j c0822j) {
        AbstractC3557B.c0("p0", c0822j);
        ((BillingClientUseCase) this.receiver).forwardError(c0822j);
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0822j) obj);
        return jf.y.f36177a;
    }
}

package com.revenuecat.purchases.google;

import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import r9.y;
import wf.n;

@Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public /* synthetic */ class BillingWrapper$queryProductDetailsAsync$useCase$2 extends k implements n {
    public BillingWrapper$queryProductDetailsAsync$useCase$2(Object obj) {
        super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public final void invoke(Long l10, wf.k kVar) {
        AbstractC3557B.c0("p1", kVar);
        ((BillingWrapper) this.receiver).executeRequestOnUIThread(l10, kVar);
    }

    @Override // wf.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Long) obj, (wf.k) obj2);
        return jf.y.f36177a;
    }
}

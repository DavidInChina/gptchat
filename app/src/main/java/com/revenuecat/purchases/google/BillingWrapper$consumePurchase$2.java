package com.revenuecat.purchases.google;

import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import r9.y;

@Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public /* synthetic */ class BillingWrapper$consumePurchase$2 extends k implements wf.k {
    public BillingWrapper$consumePurchase$2(Object obj) {
        super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public final void invoke(wf.k kVar) {
        AbstractC3557B.c0("p0", kVar);
        ((BillingWrapper) this.receiver).withConnectedClient(kVar);
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((wf.k) obj);
        return jf.y.f36177a;
    }
}

package com.revenuecat.purchases.google;

import K4.C0818f;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LK4/f;", "billingConfig", "Ljf/y;", "invoke", "(LK4/f;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class BillingWrapper$getStorefront$1 extends o implements k {
    final /* synthetic */ k $onSuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$getStorefront$1(k kVar) {
        super(1);
        this.$onSuccess = kVar;
    }

    public final void invoke(C0818f c0818f) {
        AbstractC3557B.c0("billingConfig", c0818f);
        k kVar = this.$onSuccess;
        String str = c0818f.f9425a;
        AbstractC3557B.b0("billingConfig.countryCode", str);
        kVar.invoke(str);
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0818f) obj);
        return y.f36177a;
    }
}

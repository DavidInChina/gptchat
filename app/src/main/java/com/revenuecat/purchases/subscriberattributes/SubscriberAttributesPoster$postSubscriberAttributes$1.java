package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.PurchasesError;
import id.AbstractC3557B;
import jf.y;
import kf.v;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriberAttributesPoster$postSubscriberAttributes$1 extends o implements k {
    final /* synthetic */ wf.o $onErrorHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesPoster$postSubscriberAttributes$1(wf.o oVar) {
        super(1);
        this.$onErrorHandler = oVar;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        AbstractC3557B.c0("error", purchasesError);
        this.$onErrorHandler.invoke(purchasesError, Boolean.FALSE, v.f37483Y);
    }
}

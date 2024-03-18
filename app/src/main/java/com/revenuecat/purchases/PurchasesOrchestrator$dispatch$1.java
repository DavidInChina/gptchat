package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$dispatch$1 extends o implements AbstractC6216a {
    final /* synthetic */ PurchasesError $error;
    final /* synthetic */ PurchaseErrorCallback $this_dispatch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$dispatch$1(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        super(0);
        this.$this_dispatch = purchaseErrorCallback;
        this.$error = purchasesError;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        PurchaseErrorCallback purchaseErrorCallback = this.$this_dispatch;
        PurchasesError purchasesError = this.$error;
        purchaseErrorCallback.onError(purchasesError, purchasesError.getCode() == PurchasesErrorCode.PurchaseCancelledError);
    }
}

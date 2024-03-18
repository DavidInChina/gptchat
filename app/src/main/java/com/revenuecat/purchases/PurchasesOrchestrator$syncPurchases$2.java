package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$syncPurchases$2 extends o implements k {
    final /* synthetic */ SyncPurchasesCallback $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$syncPurchases$2(SyncPurchasesCallback syncPurchasesCallback) {
        super(1);
        this.$listener = syncPurchasesCallback;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        AbstractC3557B.c0("it", purchasesError);
        SyncPurchasesCallback syncPurchasesCallback = this.$listener;
        if (syncPurchasesCallback != null) {
            syncPurchasesCallback.onError(purchasesError);
        }
    }
}

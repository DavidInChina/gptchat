package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3 extends o implements k {
    final /* synthetic */ PurchaseErrorCallback $listener;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3(PurchasesOrchestrator purchasesOrchestrator, PurchaseErrorCallback purchaseErrorCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$listener = purchaseErrorCallback;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        AbstractC3557B.c0("error", purchasesError);
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, purchasesError.toString());
        this.this$0.getAndClearProductChangeCallback();
        this.this$0.getAndClearAllPurchaseCallbacks();
        this.this$0.dispatch(this.$listener, purchasesError);
    }
}

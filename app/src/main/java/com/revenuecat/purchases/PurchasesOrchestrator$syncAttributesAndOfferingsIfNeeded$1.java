package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$1 extends o implements AbstractC6216a {
    final /* synthetic */ PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 $receiveOfferingsCallback;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$1(PurchasesOrchestrator purchasesOrchestrator, PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1 purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1) {
        super(0);
        this.this$0 = purchasesOrchestrator;
        this.$receiveOfferingsCallback = purchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        this.this$0.getOfferings(this.$receiveOfferingsCallback, true);
    }
}

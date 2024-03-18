package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.o;
import r9.y;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/AppLifecycleHandler;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$lifecycleHandler$2 extends o implements AbstractC6216a {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$lifecycleHandler$2(PurchasesOrchestrator purchasesOrchestrator) {
        super(0);
        this.this$0 = purchasesOrchestrator;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final AppLifecycleHandler mo122invoke() {
        return new AppLifecycleHandler(this.this$0);
    }
}

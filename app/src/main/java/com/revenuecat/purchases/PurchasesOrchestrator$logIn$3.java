package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.LogInCallback;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$logIn$3 extends o implements k {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ PurchasesOrchestrator this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements AbstractC6216a {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ CustomerInfo $customerInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LogInCallback logInCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = logInCallback;
            this.$customerInfo = customerInfo;
        }

        @Override // wf.AbstractC6216a
        /* renamed from: invoke */
        public final void mo122invoke() {
            LogInCallback logInCallback = this.$callback;
            if (logInCallback != null) {
                logInCallback.onReceived(this.$customerInfo, false);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$logIn$3(PurchasesOrchestrator purchasesOrchestrator, LogInCallback logInCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$callback = logInCallback;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return y.f36177a;
    }

    public final void invoke(CustomerInfo customerInfo) {
        AbstractC3557B.c0("customerInfo", customerInfo);
        this.this$0.dispatch(new AnonymousClass1(this.$callback, customerInfo));
    }
}

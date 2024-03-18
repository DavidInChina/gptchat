package com.revenuecat.purchases;

import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.interfaces.LogInCallback;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$logIn$2$1 extends o implements n {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ PurchasesOrchestrator this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$2$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements AbstractC6216a {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ boolean $created;
        final /* synthetic */ CustomerInfo $customerInfo;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LogInCallback logInCallback, CustomerInfo customerInfo, boolean z10, PurchasesOrchestrator purchasesOrchestrator) {
            super(0);
            this.$callback = logInCallback;
            this.$customerInfo = customerInfo;
            this.$created = z10;
            this.this$0 = purchasesOrchestrator;
        }

        @Override // wf.AbstractC6216a
        /* renamed from: invoke */
        public final void mo122invoke() {
            CustomerInfoUpdateHandler customerInfoUpdateHandler;
            LogInCallback logInCallback = this.$callback;
            if (logInCallback != null) {
                logInCallback.onReceived(this.$customerInfo, this.$created);
            }
            customerInfoUpdateHandler = this.this$0.customerInfoUpdateHandler;
            customerInfoUpdateHandler.notifyListeners(this.$customerInfo);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$logIn$2$1(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback) {
        super(2);
        this.this$0 = purchasesOrchestrator;
        this.$newAppUserID = str;
        this.$callback = logInCallback;
    }

    @Override // wf.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
        return y.f36177a;
    }

    public final void invoke(CustomerInfo customerInfo, boolean z10) {
        OfferingsManager offeringsManager;
        AbstractC3557B.c0("customerInfo", customerInfo);
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        purchasesOrchestrator.dispatch(new AnonymousClass1(this.$callback, customerInfo, z10, purchasesOrchestrator));
        offeringsManager = this.this$0.offeringsManager;
        OfferingsManager.fetchAndCacheOfferings$default(offeringsManager, this.$newAppUserID, this.this$0.getState$purchases_customEntitlementComputationRelease().getAppInBackground(), null, null, 12, null);
    }
}

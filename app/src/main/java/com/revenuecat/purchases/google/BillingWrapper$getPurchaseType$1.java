package com.revenuecat.purchases.google;

import com.revenuecat.purchases.ProductType;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "subFound", "Ljf/y;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BillingWrapper$getPurchaseType$1 extends o implements k {
    final /* synthetic */ k $listener;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ BillingWrapper this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "inAppFound", "Ljf/y;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.google.BillingWrapper$getPurchaseType$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements k {
        final /* synthetic */ k $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar) {
            super(1);
            this.$listener = kVar;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return y.f36177a;
        }

        public final void invoke(boolean z10) {
            if (z10) {
                this.$listener.invoke(ProductType.INAPP);
            } else {
                this.$listener.invoke(ProductType.UNKNOWN);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$getPurchaseType$1(k kVar, BillingWrapper billingWrapper, String str) {
        super(1);
        this.$listener = kVar;
        this.this$0 = billingWrapper;
        this.$purchaseToken = str;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return y.f36177a;
    }

    public final void invoke(boolean z10) {
        if (z10) {
            this.$listener.invoke(ProductType.SUBS);
            return;
        }
        BillingWrapper billingWrapper = this.this$0;
        String str = this.$purchaseToken;
        k kVar = this.$listener;
        billingWrapper.queryPurchaseType("inapp", str, kVar, new AnonymousClass1(kVar));
    }
}

package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CustomerInfoHelper$getCustomerInfoCachedOrFetched$1 extends o implements AbstractC6216a {
    final /* synthetic */ CustomerInfo $cachedCustomerInfo;
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoHelper$getCustomerInfoCachedOrFetched$1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
        super(0);
        this.$callback = receiveCustomerInfoCallback;
        this.$cachedCustomerInfo = customerInfo;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
        if (receiveCustomerInfoCallback != null) {
            receiveCustomerInfoCallback.onReceived(this.$cachedCustomerInfo);
        }
    }
}

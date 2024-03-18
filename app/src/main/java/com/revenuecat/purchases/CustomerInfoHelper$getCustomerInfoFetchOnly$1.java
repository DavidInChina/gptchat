package com.revenuecat.purchases;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", ParameterNames.INFO, "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CustomerInfoHelper$getCustomerInfoFetchOnly$1 extends o implements k {
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ CustomerInfoHelper this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements AbstractC6216a {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ CustomerInfo $info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$info = customerInfo;
        }

        @Override // wf.AbstractC6216a
        /* renamed from: invoke */
        public final void mo122invoke() {
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            if (receiveCustomerInfoCallback != null) {
                receiveCustomerInfoCallback.onReceived(this.$info);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoHelper$getCustomerInfoFetchOnly$1(CustomerInfoHelper customerInfoHelper, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(1);
        this.this$0 = customerInfoHelper;
        this.$callback = receiveCustomerInfoCallback;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return y.f36177a;
    }

    public final void invoke(CustomerInfo customerInfo) {
        OfflineEntitlementsManager offlineEntitlementsManager;
        CustomerInfoUpdateHandler customerInfoUpdateHandler;
        AbstractC3557B.c0(ParameterNames.INFO, customerInfo);
        LogWrapperKt.log(LogIntent.RC_SUCCESS, CustomerInfoStrings.CUSTOMERINFO_UPDATED_FROM_NETWORK);
        offlineEntitlementsManager = this.this$0.offlineEntitlementsManager;
        offlineEntitlementsManager.resetOfflineCustomerInfoCache();
        customerInfoUpdateHandler = this.this$0.customerInfoUpdateHandler;
        customerInfoUpdateHandler.cacheAndNotifyListeners(customerInfo);
        this.this$0.dispatch(new AnonymousClass1(this.$callback, customerInfo));
    }
}

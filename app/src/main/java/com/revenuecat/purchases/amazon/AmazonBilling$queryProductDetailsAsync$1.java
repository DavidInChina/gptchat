package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import id.AbstractC3557B;
import java.util.Set;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AmazonBilling$queryProductDetailsAsync$1 extends o implements k {
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onReceive;
    final /* synthetic */ Set<String> $productIds;
    final /* synthetic */ AmazonBilling this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "Ljf/y;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements k {
        final /* synthetic */ k $onError;
        final /* synthetic */ k $onReceive;
        final /* synthetic */ Set<String> $productIds;
        final /* synthetic */ AmazonBilling this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AmazonBilling amazonBilling, Set<String> set, k kVar, k kVar2) {
            super(1);
            this.this$0 = amazonBilling;
            this.$productIds = set;
            this.$onReceive = kVar;
            this.$onError = kVar2;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((UserData) obj);
            return y.f36177a;
        }

        public final void invoke(UserData userData) {
            ProductDataResponseListener productDataResponseListener;
            AbstractC3557B.c0("userData", userData);
            productDataResponseListener = this.this$0.productDataHandler;
            Set<String> set = this.$productIds;
            String marketplace = userData.getMarketplace();
            AbstractC3557B.b0("userData.marketplace", marketplace);
            productDataResponseListener.getProductData(set, marketplace, this.$onReceive, this.$onError);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$queryProductDetailsAsync$1(AmazonBilling amazonBilling, k kVar, Set<String> set, k kVar2) {
        super(1);
        this.this$0 = amazonBilling;
        this.$onError = kVar;
        this.$productIds = set;
        this.$onReceive = kVar2;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        UserDataResponseListener userDataResponseListener;
        if (purchasesError == null) {
            userDataResponseListener = this.this$0.userDataHandler;
            userDataResponseListener.getUserData(new AnonymousClass1(this.this$0, this.$productIds, this.$onReceive, this.$onError), this.$onError);
            return;
        }
        this.$onError.invoke(purchasesError);
    }
}

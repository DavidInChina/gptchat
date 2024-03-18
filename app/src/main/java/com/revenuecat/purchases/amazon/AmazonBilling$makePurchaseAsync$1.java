package com.revenuecat.purchases.amazon;

import android.app.Activity;
import android.os.Handler;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AmazonBilling$makePurchaseAsync$1 extends o implements k {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
    final /* synthetic */ AmazonStoreProduct $storeProduct;
    final /* synthetic */ AmazonBilling this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/amazon/device/iap/model/Receipt;", "receipt", "Lcom/amazon/device/iap/model/UserData;", "userData", "Ljf/y;", "invoke", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements n {
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ AmazonStoreProduct $storeProduct;
        final /* synthetic */ AmazonBilling this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AmazonBilling amazonBilling, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
            super(2);
            this.this$0 = amazonBilling;
            this.$storeProduct = amazonStoreProduct;
            this.$presentedOfferingContext = presentedOfferingContext;
        }

        @Override // wf.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Receipt) obj, (UserData) obj2);
            return y.f36177a;
        }

        public final void invoke(Receipt receipt, UserData userData) {
            AbstractC3557B.c0("receipt", receipt);
            AbstractC3557B.c0("userData", userData);
            this.this$0.handleReceipt(receipt, userData, this.$storeProduct, this.$presentedOfferingContext);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends o implements k {
        final /* synthetic */ AmazonBilling this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AmazonBilling amazonBilling) {
            super(1);
            this.this$0 = amazonBilling;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return y.f36177a;
        }

        public final void invoke(PurchasesError purchasesError) {
            AbstractC3557B.c0("it", purchasesError);
            this.this$0.onPurchaseError(purchasesError);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$makePurchaseAsync$1(AmazonBilling amazonBilling, Activity activity, String str, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
        super(1);
        this.this$0 = amazonBilling;
        this.$activity = activity;
        this.$appUserID = str;
        this.$storeProduct = amazonStoreProduct;
        this.$presentedOfferingContext = presentedOfferingContext;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        PurchaseResponseListener purchaseResponseListener;
        Handler handler;
        if (purchasesError == null) {
            purchaseResponseListener = this.this$0.purchaseHandler;
            handler = this.this$0.mainHandler;
            Activity activity = this.$activity;
            String str = this.$appUserID;
            AmazonStoreProduct amazonStoreProduct = this.$storeProduct;
            purchaseResponseListener.purchase(handler, activity, str, amazonStoreProduct, new AnonymousClass1(this.this$0, amazonStoreProduct, this.$presentedOfferingContext), new AnonymousClass2(this.this$0));
            return;
        }
        this.this$0.onPurchaseError(purchasesError);
    }
}

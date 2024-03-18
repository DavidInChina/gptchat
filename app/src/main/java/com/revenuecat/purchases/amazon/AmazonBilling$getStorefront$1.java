package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import id.AbstractC3557B;
import java.util.Arrays;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class AmazonBilling$getStorefront$1 extends o implements k {
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ AmazonBilling this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "Ljf/y;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements k {
        final /* synthetic */ k $onError;
        final /* synthetic */ k $onSuccess;
        final /* synthetic */ AmazonBilling this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AmazonBilling amazonBilling, k kVar, k kVar2) {
            super(1);
            this.this$0 = amazonBilling;
            this.$onSuccess = kVar;
            this.$onError = kVar2;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((UserData) obj);
            return y.f36177a;
        }

        public final void invoke(UserData userData) {
            AbstractC3557B.c0("userData", userData);
            String marketplace = userData.getMarketplace();
            if (marketplace == null) {
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_MARKETPLACE_NULL_STORE_PROBLEM));
            } else {
                this.$onSuccess.invoke(marketplace);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends o implements k {
        final /* synthetic */ k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar) {
            super(1);
            this.$onError = kVar;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return y.f36177a;
        }

        public final void invoke(PurchasesError purchasesError) {
            AbstractC3557B.c0("error", purchasesError);
            LogUtilsKt.errorLog$default(String.format(BillingStrings.BILLING_AMAZON_ERROR_STOREFRONT, Arrays.copyOf(new Object[]{purchasesError}, 1)), null, 2, null);
            this.$onError.invoke(purchasesError);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$getStorefront$1(AmazonBilling amazonBilling, k kVar, k kVar2) {
        super(1);
        this.this$0 = amazonBilling;
        this.$onError = kVar;
        this.$onSuccess = kVar2;
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
            userDataResponseListener.getUserData(new AnonymousClass1(this.this$0, this.$onSuccess, this.$onError), new AnonymousClass2(this.$onError));
            return;
        }
        LogUtilsKt.errorLog$default(String.format(BillingStrings.BILLING_CONNECTION_ERROR_STORE_COUNTRY, Arrays.copyOf(new Object[]{purchasesError}, 1)), null, 2, null);
        this.$onError.invoke(purchasesError);
    }
}

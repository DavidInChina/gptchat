package com.revenuecat.purchases;

import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.caching.DeviceCache;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n\u00a2\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PostReceiptHelper$postTokenWithoutConsuming$2 extends o implements wf.o {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ PostReceiptHelper this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements k {
        final /* synthetic */ k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar) {
            super(1);
            this.$onSuccess = kVar;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return y.f36177a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC3557B.c0("it", customerInfo);
            this.$onSuccess.invoke(customerInfo);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends o implements AbstractC6216a {
        final /* synthetic */ PurchasesError $backendError;
        final /* synthetic */ k $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar, PurchasesError purchasesError) {
            super(0);
            this.$onError = kVar;
            this.$backendError = purchasesError;
        }

        @Override // wf.AbstractC6216a
        /* renamed from: invoke */
        public final void mo122invoke() {
            this.$onError.invoke(this.$backendError);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostReceiptHelper$postTokenWithoutConsuming$2(PostReceiptHelper postReceiptHelper, String str, String str2, k kVar, k kVar2) {
        super(3);
        this.this$0 = postReceiptHelper;
        this.$purchaseToken = str;
        this.$appUserID = str2;
        this.$onSuccess = kVar;
        this.$onError = kVar2;
    }

    @Override // wf.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
        DeviceCache deviceCache;
        AbstractC3557B.c0("backendError", purchasesError);
        AbstractC3557B.c0("errorHandlingBehavior", postReceiptErrorHandlingBehavior);
        if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_CONSUMED) {
            deviceCache = this.this$0.deviceCache;
            deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
        }
        this.this$0.useOfflineEntitlementsCustomerInfoIfNeeded(postReceiptErrorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess), new AnonymousClass2(this.$onError, purchasesError));
    }
}

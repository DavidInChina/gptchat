package com.revenuecat.purchases;

import Lg.n;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.strings.PurchaseStrings;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.List;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "normalizedProductID", "Ljf/y;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$syncObserverModeAmazonPurchase$3 extends o implements k {
    final /* synthetic */ String $amazonUserID;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ String $isoCurrencyCode;
    final /* synthetic */ Double $price;
    final /* synthetic */ String $receiptID;
    final /* synthetic */ PurchasesOrchestrator this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements k {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $receiptID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2) {
            super(1);
            this.$receiptID = str;
            this.$amazonUserID = str2;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return y.f36177a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            AbstractC3557B.c0("it", customerInfo);
            LogWrapperKt.log(LogIntent.PURCHASE, String.format(PurchaseStrings.PURCHASE_SYNCED_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID}, 2)));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends o implements k {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $receiptID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2) {
            super(1);
            this.$receiptID = str;
            this.$amazonUserID = str2;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return y.f36177a;
        }

        public final void invoke(PurchasesError purchasesError) {
            AbstractC3557B.c0("error", purchasesError);
            LogWrapperKt.log(LogIntent.RC_ERROR, String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, purchasesError}, 3)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$syncObserverModeAmazonPurchase$3(Double d10, String str, PurchasesOrchestrator purchasesOrchestrator, String str2, String str3, String str4) {
        super(1);
        this.$price = d10;
        this.$isoCurrencyCode = str;
        this.this$0 = purchasesOrchestrator;
        this.$receiptID = str2;
        this.$amazonUserID = str3;
        this.$appUserID = str4;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return y.f36177a;
    }

    public final void invoke(String str) {
        PostReceiptHelper postReceiptHelper;
        AbstractC3557B.c0("normalizedProductID", str);
        List F02 = AbstractC4344b.F0(str);
        Double d10 = this.$price;
        Double d11 = (d10 == null || d10.doubleValue() == 0.0d) ? null : d10;
        String str2 = this.$isoCurrencyCode;
        ReceiptInfo receiptInfo = new ReceiptInfo(F02, null, null, null, d11, (str2 == null || n.n2(str2)) ? null : str2, null, 78, null);
        postReceiptHelper = this.this$0.postReceiptHelper;
        postReceiptHelper.postTokenWithoutConsuming(this.$receiptID, this.$amazonUserID, receiptInfo, this.this$0.getAllowSharingPlayStoreAccount(), this.$appUserID, null, PostReceiptInitiationSource.RESTORE, new AnonymousClass1(this.$receiptID, this.$amazonUserID), new AnonymousClass2(this.$receiptID, this.$amazonUserID));
    }
}

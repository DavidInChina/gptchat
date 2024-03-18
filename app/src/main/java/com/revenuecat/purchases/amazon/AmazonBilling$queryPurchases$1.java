package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.common.DateProvider;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jf.y;
import kf.w;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class AmazonBilling$queryPurchases$1 extends o implements k {
    final /* synthetic */ boolean $filterOnlyActivePurchases;
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ AmazonBilling this$0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/amazon/device/iap/model/Receipt;", "receipts", "Lcom/amazon/device/iap/model/UserData;", "userData", "Ljf/y;", "invoke", "(Ljava/util/List;Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements n {
        final /* synthetic */ boolean $filterOnlyActivePurchases;
        final /* synthetic */ k $onError;
        final /* synthetic */ k $onSuccess;
        final /* synthetic */ AmazonBilling this$0;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n\u00a2\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "tokensToSkusMap", "Lcom/revenuecat/purchases/PurchasesError;", "errors", "Ljf/y;", "invoke", "(Ljava/util/Map;Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00021 extends o implements n {
            final /* synthetic */ List<Receipt> $filteredReceipts;
            final /* synthetic */ k $onError;
            final /* synthetic */ k $onSuccess;
            final /* synthetic */ UserData $userData;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00021(AmazonBilling amazonBilling, k kVar, List<Receipt> list, UserData userData, k kVar2) {
                super(2);
                this.this$0 = amazonBilling;
                this.$onError = kVar;
                this.$filteredReceipts = list;
                this.$userData = userData;
                this.$onSuccess = kVar2;
            }

            @Override // wf.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Map) obj, (Map) obj2);
                return y.f36177a;
            }

            public final void invoke(Map<String, String> map, Map<String, PurchasesError> map2) {
                Map mapOfReceiptHashesToRestoredPurchases;
                AbstractC3557B.c0("tokensToSkusMap", map);
                AbstractC3557B.c0("errors", map2);
                this.this$0.logErrorsIfAny(map2);
                if (!map.isEmpty()) {
                    mapOfReceiptHashesToRestoredPurchases = this.this$0.toMapOfReceiptHashesToRestoredPurchases(this.$filteredReceipts, map, this.$userData);
                    this.$onSuccess.invoke(mapOfReceiptHashesToRestoredPurchases);
                    return;
                }
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.InvalidReceiptError, AmazonStrings.ERROR_FETCHING_PURCHASE_HISTORY_ALL_RECEIPTS_INVALID));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, k kVar, AmazonBilling amazonBilling, k kVar2) {
            super(2);
            this.$filterOnlyActivePurchases = z10;
            this.$onSuccess = kVar;
            this.this$0 = amazonBilling;
            this.$onError = kVar2;
        }

        @Override // wf.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((List) obj, (UserData) obj2);
            return y.f36177a;
        }

        public final void invoke(List<Receipt> list, UserData userData) {
            DateProvider dateProvider;
            AbstractC3557B.c0("receipts", list);
            AbstractC3557B.c0("userData", userData);
            if (this.$filterOnlyActivePurchases) {
                AmazonBilling amazonBilling = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    Receipt receipt = (Receipt) obj;
                    if (receipt.getCancelDate() != null) {
                        Date cancelDate = receipt.getCancelDate();
                        dateProvider = amazonBilling.dateProvider;
                        if (cancelDate.compareTo(dateProvider.getNow()) > 0) {
                        }
                    }
                    arrayList.add(obj);
                }
                list = arrayList;
            }
            if (list.isEmpty()) {
                this.$onSuccess.invoke(w.f37484Y);
                return;
            }
            AmazonBilling amazonBilling2 = this.this$0;
            String userId = userData.getUserId();
            AbstractC3557B.b0("userData.userId", userId);
            amazonBilling2.getMissingSkusForReceipts(userId, list, new C00021(this.this$0, this.$onError, list, userData, this.$onSuccess));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$queryPurchases$1(AmazonBilling amazonBilling, k kVar, boolean z10, k kVar2) {
        super(1);
        this.this$0 = amazonBilling;
        this.$onError = kVar;
        this.$filterOnlyActivePurchases = z10;
        this.$onSuccess = kVar2;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        PurchaseUpdatesResponseListener purchaseUpdatesResponseListener;
        if (purchasesError == null) {
            purchaseUpdatesResponseListener = this.this$0.purchaseUpdatesHandler;
            purchaseUpdatesResponseListener.queryPurchases(new AnonymousClass1(this.$filterOnlyActivePurchases, this.$onSuccess, this.this$0, this.$onError), this.$onError);
            return;
        }
        this.$onError.invoke(purchasesError);
    }
}

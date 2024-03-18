package com.revenuecat.purchases.google;

import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.ProductType;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.y;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "subsPurchasesList", "Ljf/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class BillingWrapper$queryAllPurchases$1 extends o implements k {
    final /* synthetic */ k $onReceivePurchaseHistory;
    final /* synthetic */ k $onReceivePurchaseHistoryError;
    final /* synthetic */ BillingWrapper this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "inAppPurchasesList", "Ljf/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements k {
        final /* synthetic */ k $onReceivePurchaseHistory;
        final /* synthetic */ List<PurchaseHistoryRecord> $subsPurchasesList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(k kVar, List<? extends PurchaseHistoryRecord> list) {
            super(1);
            this.$onReceivePurchaseHistory = kVar;
            this.$subsPurchasesList = list;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return y.f36177a;
        }

        public final void invoke(List<? extends PurchaseHistoryRecord> list) {
            AbstractC3557B.c0("inAppPurchasesList", list);
            k kVar = this.$onReceivePurchaseHistory;
            List<PurchaseHistoryRecord> list2 = this.$subsPurchasesList;
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list2, 10));
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                arrayList.add(StoreTransactionConversionsKt.toStoreTransaction(purchaseHistoryRecord, ProductType.SUBS));
            }
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
            for (PurchaseHistoryRecord purchaseHistoryRecord2 : list) {
                arrayList2.add(StoreTransactionConversionsKt.toStoreTransaction(purchaseHistoryRecord2, ProductType.INAPP));
            }
            kVar.invoke(t.w2(arrayList2, arrayList));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$queryAllPurchases$1(BillingWrapper billingWrapper, k kVar, k kVar2) {
        super(1);
        this.this$0 = billingWrapper;
        this.$onReceivePurchaseHistoryError = kVar;
        this.$onReceivePurchaseHistory = kVar2;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return y.f36177a;
    }

    public final void invoke(List<? extends PurchaseHistoryRecord> list) {
        AbstractC3557B.c0("subsPurchasesList", list);
        this.this$0.queryPurchaseHistoryAsync("inapp", new AnonymousClass1(this.$onReceivePurchaseHistory, list), this.$onReceivePurchaseHistoryError);
    }
}

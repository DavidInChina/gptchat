package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import java.util.Comparator;
import java.util.List;
import jf.y;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import r.f;
import wf.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allPurchases", "Ljf/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator$restorePurchases$1 extends o implements k {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$restorePurchases$1(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, String str) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$callback = receiveCustomerInfoCallback;
        this.$appUserID = str;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return y.f36177a;
    }

    public final void invoke(List<StoreTransaction> list) {
        PostReceiptHelper postReceiptHelper;
        AbstractC3557B.c0("allPurchases", list);
        if (list.isEmpty()) {
            this.this$0.getCustomerInfo(this.$callback);
            return;
        }
        List<StoreTransaction> F22 = t.F2(list, new Comparator() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1$invoke$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return f.n(Long.valueOf(((StoreTransaction) t10).getPurchaseTime()), Long.valueOf(((StoreTransaction) t11).getPurchaseTime()));
            }
        });
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        String str = this.$appUserID;
        ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
        for (StoreTransaction storeTransaction : F22) {
            postReceiptHelper = purchasesOrchestrator.postReceiptHelper;
            postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, null, true, str, PostReceiptInitiationSource.RESTORE, new PurchasesOrchestrator$restorePurchases$1$2$1$1(storeTransaction, F22, purchasesOrchestrator, receiveCustomerInfoCallback), new PurchasesOrchestrator$restorePurchases$1$2$1$2(storeTransaction, F22, purchasesOrchestrator, receiveCustomerInfoCallback));
        }
    }
}

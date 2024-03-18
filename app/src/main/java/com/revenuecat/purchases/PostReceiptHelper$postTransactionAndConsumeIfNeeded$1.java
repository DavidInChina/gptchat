package com.revenuecat.purchases;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", ParameterNames.INFO, "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PostReceiptHelper$postTransactionAndConsumeIfNeeded$1 extends o implements k {
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ n $onSuccess;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ PostReceiptHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostReceiptHelper$postTransactionAndConsumeIfNeeded$1(PostReceiptHelper postReceiptHelper, StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, n nVar) {
        super(1);
        this.this$0 = postReceiptHelper;
        this.$purchase = storeTransaction;
        this.$initiationSource = postReceiptInitiationSource;
        this.$onSuccess = nVar;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return y.f36177a;
    }

    public final void invoke(CustomerInfo customerInfo) {
        BillingAbstract billingAbstract;
        boolean finishTransactions;
        AbstractC3557B.c0(ParameterNames.INFO, customerInfo);
        billingAbstract = this.this$0.billing;
        finishTransactions = this.this$0.getFinishTransactions();
        billingAbstract.consumeAndSave(finishTransactions, this.$purchase, this.$initiationSource);
        n nVar = this.$onSuccess;
        if (nVar != null) {
            nVar.invoke(this.$purchase, customerInfo);
        }
    }
}

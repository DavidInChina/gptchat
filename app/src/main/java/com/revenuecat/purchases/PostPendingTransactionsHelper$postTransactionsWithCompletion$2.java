package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.utils.Result;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PostPendingTransactionsHelper$postTransactionsWithCompletion$2 extends o implements n {
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ List<Result<CustomerInfo, PurchasesError>> $results;
    final /* synthetic */ List<StoreTransaction> $transactionsToSync;
    final /* synthetic */ PostPendingTransactionsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPendingTransactionsHelper$postTransactionsWithCompletion$2(List<Result<CustomerInfo, PurchasesError>> list, PostPendingTransactionsHelper postPendingTransactionsHelper, List<StoreTransaction> list2, k kVar, k kVar2) {
        super(2);
        this.$results = list;
        this.this$0 = postPendingTransactionsHelper;
        this.$transactionsToSync = list2;
        this.$onError = kVar;
        this.$onSuccess = kVar2;
    }

    @Override // wf.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (PurchasesError) obj2);
        return y.f36177a;
    }

    public final void invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
        AbstractC3557B.c0("<anonymous parameter 0>", storeTransaction);
        AbstractC3557B.c0("purchasesError", purchasesError);
        this.$results.add(new Result.Error(purchasesError));
        this.this$0.callCompletionFromResults(this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
    }
}

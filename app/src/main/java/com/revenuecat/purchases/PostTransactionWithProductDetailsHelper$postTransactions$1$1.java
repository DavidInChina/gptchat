package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import jf.y;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Ljf/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PostTransactionWithProductDetailsHelper$postTransactions$1$1 extends o implements k {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ n $transactionPostError;
    final /* synthetic */ n $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTransactionWithProductDetailsHelper$postTransactions$1$1(StoreTransaction storeTransaction, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, n nVar, n nVar2) {
        super(1);
        this.$transaction = storeTransaction;
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$allowSharingPlayStoreAccount = z10;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$transactionPostSuccess = nVar;
        this.$transactionPostError = nVar2;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return y.f36177a;
    }

    public final void invoke(List<? extends StoreProduct> list) {
        StoreProduct storeProduct;
        PostReceiptHelper postReceiptHelper;
        AbstractC3557B.c0("storeProducts", list);
        Object obj = null;
        if (this.$transaction.getType() == ProductType.SUBS) {
            StoreTransaction storeTransaction = this.$transaction;
            Iterator<T> it = list.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                SubscriptionOptions<SubscriptionOption> subscriptionOptions = ((StoreProduct) next).getSubscriptionOptions();
                if (subscriptionOptions != null && !subscriptionOptions.isEmpty()) {
                    for (SubscriptionOption subscriptionOption : subscriptionOptions) {
                        if (AbstractC3557B.K(subscriptionOption.getId(), storeTransaction.getSubscriptionOptionId())) {
                            obj = next;
                            break loop0;
                        }
                    }
                    continue;
                }
            }
            storeProduct = (StoreProduct) obj;
        } else {
            StoreTransaction storeTransaction2 = this.$transaction;
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (AbstractC3557B.K(((StoreProduct) next2).getId(), t.h2(storeTransaction2.getProductIds()))) {
                    obj = next2;
                    break;
                }
            }
            storeProduct = (StoreProduct) obj;
        }
        StoreProduct storeProduct2 = storeProduct;
        postReceiptHelper = this.this$0.postReceiptHelper;
        postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, storeProduct2, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$transactionPostSuccess, this.$transactionPostError);
    }
}

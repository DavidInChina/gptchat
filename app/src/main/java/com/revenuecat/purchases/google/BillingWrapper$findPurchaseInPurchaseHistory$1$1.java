package com.revenuecat.purchases.google;

import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchasesList", "Ljf/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class BillingWrapper$findPurchaseInPurchaseHistory$1$1 extends o implements k {
    final /* synthetic */ k $onCompletion;
    final /* synthetic */ k $onError;
    final /* synthetic */ String $productId;
    final /* synthetic */ ProductType $productType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$findPurchaseInPurchaseHistory$1$1(ProductType productType, k kVar, String str, k kVar2) {
        super(1);
        this.$productType = productType;
        this.$onCompletion = kVar;
        this.$productId = str;
        this.$onError = kVar2;
    }

    public final void invoke(List<? extends PurchaseHistoryRecord> list) {
        StoreTransaction storeTransaction;
        Object obj;
        AbstractC3557B.c0("purchasesList", list);
        String str = this.$productId;
        Iterator<T> it = list.iterator();
        while (true) {
            storeTransaction = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PurchaseHistoryRecord) obj).a().contains(str)) {
                break;
            }
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        if (purchaseHistoryRecord != null) {
            storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(purchaseHistoryRecord, this.$productType);
        }
        if (storeTransaction != null) {
            this.$onCompletion.invoke(storeTransaction);
        } else {
            this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1))));
        }
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return y.f36177a;
    }
}

package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jf.y;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allPurchases", "Ljf/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class SyncPurchasesHelper$syncPurchases$1 extends o implements k {
    final /* synthetic */ boolean $appInBackground;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ boolean $isRestore;
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ SyncPurchasesHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncPurchasesHelper$syncPurchases$1(SyncPurchasesHelper syncPurchasesHelper, String str, boolean z10, boolean z11, k kVar, k kVar2) {
        super(1);
        this.this$0 = syncPurchasesHelper;
        this.$appUserID = str;
        this.$appInBackground = z10;
        this.$isRestore = z11;
        this.$onSuccess = kVar;
        this.$onError = kVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$handleLastPurchase(List<PurchasesError> list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z10, boolean z11, k kVar, k kVar2, StoreTransaction storeTransaction, StoreTransaction storeTransaction2) {
        if (AbstractC3557B.K(storeTransaction, storeTransaction2)) {
            if (list.isEmpty()) {
                LogUtilsKt.debugLog(PurchaseStrings.SYNCED_PURCHASES_SUCCESSFULLY);
                syncPurchasesHelper.retrieveCustomerInfo(str, z10, z11, kVar, kVar2);
                return;
            }
            LogUtilsKt.errorLog$default(String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{list}, 1)), null, 2, null);
            kVar2.invoke(t.f2(list));
        }
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return y.f36177a;
    }

    public final void invoke(List<StoreTransaction> list) {
        PostReceiptHelper postReceiptHelper;
        AbstractC3557B.c0("allPurchases", list);
        if (!(!list.isEmpty())) {
            this.this$0.retrieveCustomerInfo(this.$appUserID, this.$appInBackground, this.$isRestore, this.$onSuccess, this.$onError);
            return;
        }
        StoreTransaction storeTransaction = (StoreTransaction) t.o2(list);
        ArrayList arrayList = new ArrayList();
        SyncPurchasesHelper syncPurchasesHelper = this.this$0;
        boolean z10 = this.$isRestore;
        String str = this.$appUserID;
        boolean z11 = this.$appInBackground;
        k kVar = this.$onSuccess;
        k kVar2 = this.$onError;
        for (StoreTransaction storeTransaction2 : list) {
            ReceiptInfo receiptInfo = new ReceiptInfo(storeTransaction2.getProductIds(), null, null, null, null, null, null, 126, null);
            postReceiptHelper = syncPurchasesHelper.postReceiptHelper;
            k kVar3 = kVar2;
            boolean z12 = z11;
            postReceiptHelper.postTokenWithoutConsuming(storeTransaction2.getPurchaseToken(), storeTransaction2.getStoreUserID(), receiptInfo, z10, str, storeTransaction2.getMarketplace(), PostReceiptInitiationSource.RESTORE, new SyncPurchasesHelper$syncPurchases$1$1$1(storeTransaction2, storeTransaction, arrayList, syncPurchasesHelper, str, z11, z10, kVar, kVar3), new SyncPurchasesHelper$syncPurchases$1$1$2(storeTransaction2, arrayList, storeTransaction, syncPurchasesHelper, str, z12, z10, kVar, kVar3));
            kVar2 = kVar3;
            kVar = kVar;
            z11 = z12;
        }
    }
}

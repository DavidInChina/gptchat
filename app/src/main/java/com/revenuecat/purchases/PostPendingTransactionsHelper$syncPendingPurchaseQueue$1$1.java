package com.revenuecat.purchases;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.RestoreStrings;
import id.AbstractC3557B;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchasesByHashedToken", "Ljf/y;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1 extends o implements k {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ PostPendingTransactionsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z10, String str, k kVar, k kVar2) {
        super(1);
        this.this$0 = postPendingTransactionsHelper;
        this.$allowSharingPlayStoreAccount = z10;
        this.$appUserID = str;
        this.$onError = kVar;
        this.$onSuccess = kVar2;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map) obj);
        return y.f36177a;
    }

    public final void invoke(Map<String, StoreTransaction> map) {
        DeviceCache deviceCache;
        DeviceCache deviceCache2;
        AbstractC3557B.c0("purchasesByHashedToken", map);
        for (Map.Entry<String, StoreTransaction> entry : map.entrySet()) {
            AbstractC2469q0.t(new Object[]{entry.getValue().getType(), entry.getKey()}, 2, RestoreStrings.QUERYING_PURCHASE_WITH_HASH, LogIntent.DEBUG);
        }
        deviceCache = this.this$0.deviceCache;
        deviceCache.cleanPreviouslySentTokens(map.keySet());
        deviceCache2 = this.this$0.deviceCache;
        this.this$0.postTransactionsWithCompletion(deviceCache2.getActivePurchasesNotInCache(map), this.$allowSharingPlayStoreAccount, this.$appUserID, this.$onError, this.$onSuccess);
    }
}

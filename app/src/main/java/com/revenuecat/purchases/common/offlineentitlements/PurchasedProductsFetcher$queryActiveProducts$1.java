package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jf.y;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "activePurchasesByHashedToken", "Ljf/y;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasedProductsFetcher$queryActiveProducts$1 extends o implements k {
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ ProductEntitlementMapping $productEntitlementMapping;
    final /* synthetic */ PurchasedProductsFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasedProductsFetcher$queryActiveProducts$1(k kVar, PurchasedProductsFetcher purchasedProductsFetcher, ProductEntitlementMapping productEntitlementMapping) {
        super(1);
        this.$onSuccess = kVar;
        this.this$0 = purchasedProductsFetcher;
        this.$productEntitlementMapping = productEntitlementMapping;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map) obj);
        return y.f36177a;
    }

    public final void invoke(Map<String, StoreTransaction> map) {
        PurchasedProduct createPurchasedProduct;
        AbstractC3557B.c0("activePurchasesByHashedToken", map);
        List<StoreTransaction> K22 = t.K2(map.values());
        PurchasedProductsFetcher purchasedProductsFetcher = this.this$0;
        ProductEntitlementMapping productEntitlementMapping = this.$productEntitlementMapping;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(K22, 10));
        for (StoreTransaction storeTransaction : K22) {
            createPurchasedProduct = purchasedProductsFetcher.createPurchasedProduct(storeTransaction, productEntitlementMapping);
            arrayList.add(createPurchasedProduct);
        }
        this.$onSuccess.invoke(arrayList);
    }
}

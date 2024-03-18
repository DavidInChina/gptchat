package com.revenuecat.purchases.google;

import com.revenuecat.purchases.models.StoreTransaction;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchases", "Ljf/y;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BillingWrapper$queryPurchaseType$1 extends o implements k {
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ k $resultHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$queryPurchaseType$1(k kVar, String str) {
        super(1);
        this.$resultHandler = kVar;
        this.$purchaseToken = str;
    }

    public final void invoke(Map<String, StoreTransaction> map) {
        AbstractC3557B.c0("purchases", map);
        k kVar = this.$resultHandler;
        Collection<StoreTransaction> values = map.values();
        String str = this.$purchaseToken;
        boolean z10 = false;
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AbstractC3557B.K(((StoreTransaction) it.next()).getPurchaseToken(), str)) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        kVar.invoke(Boolean.valueOf(z10));
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map) obj);
        return y.f36177a;
    }
}

package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.PurchasesError;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$3 extends o implements k {
    final /* synthetic */ String $appUserId;
    final /* synthetic */ OfflineEntitlementsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$3(OfflineEntitlementsManager offlineEntitlementsManager, String str) {
        super(1);
        this.this$0 = offlineEntitlementsManager;
        this.$appUserId = str;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        Map map;
        AbstractC3557B.c0("it", purchasesError);
        OfflineEntitlementsManager offlineEntitlementsManager = this.this$0;
        String str = this.$appUserId;
        synchronized (offlineEntitlementsManager) {
            map = offlineEntitlementsManager.offlineCustomerInfoCallbackCache;
            List<C3959i> list = (List) map.remove(str);
            if (list != null) {
                for (C3959i c3959i : list) {
                    ((k) c3959i.f36156Z).invoke(purchasesError);
                }
            }
        }
    }
}

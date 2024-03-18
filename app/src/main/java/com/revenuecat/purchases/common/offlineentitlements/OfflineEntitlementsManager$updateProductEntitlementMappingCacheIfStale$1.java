package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$1 extends o implements k {
    final /* synthetic */ k $completion;
    final /* synthetic */ OfflineEntitlementsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$1(OfflineEntitlementsManager offlineEntitlementsManager, k kVar) {
        super(1);
        this.this$0 = offlineEntitlementsManager;
        this.$completion = kVar;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProductEntitlementMapping) obj);
        return y.f36177a;
    }

    public final void invoke(ProductEntitlementMapping productEntitlementMapping) {
        DeviceCache deviceCache;
        AbstractC3557B.c0("productEntitlementMapping", productEntitlementMapping);
        deviceCache = this.this$0.deviceCache;
        deviceCache.cacheProductEntitlementMapping(productEntitlementMapping);
        LogUtilsKt.debugLog(OfflineEntitlementsStrings.SUCCESSFULLY_UPDATED_PRODUCT_ENTITLEMENTS);
        k kVar = this.$completion;
        if (kVar != null) {
            kVar.invoke(null);
        }
    }
}

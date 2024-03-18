package com.revenuecat.purchases.common;

import id.AbstractC3557B;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/common/GooglePlatformProductId;", "Lcom/revenuecat/purchases/common/PlatformProductId;", "productId", "", "basePlanId", "offerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "asMap", "", "getAsMap", "()Ljava/util/Map;", "getBasePlanId", "()Ljava/lang/String;", "getOfferId", "getProductId", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class GooglePlatformProductId extends PlatformProductId {
    private final String basePlanId;
    private final String offerId;
    private final String productId;

    public /* synthetic */ GooglePlatformProductId(String str, String str2, String str3, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }

    @Override // com.revenuecat.purchases.common.PlatformProductId
    public Map<String, String> getAsMap() {
        return AbstractC4268D.a1(new C3959i("product_id", getProductId()), new C3959i("base_plan_id", this.basePlanId), new C3959i("offer_id", this.offerId));
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    @Override // com.revenuecat.purchases.common.PlatformProductId
    public String getProductId() {
        return this.productId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePlatformProductId(String str, String str2, String str3) {
        super(str);
        AbstractC3557B.c0("productId", str);
        this.productId = str;
        this.basePlanId = str2;
        this.offerId = str3;
    }
}

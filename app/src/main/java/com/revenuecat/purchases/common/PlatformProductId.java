package com.revenuecat.purchases.common;

import id.AbstractC3557B;
import java.util.Map;
import jf.C3959i;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/PlatformProductId;", "", "productId", "", "(Ljava/lang/String;)V", "asMap", "", "getAsMap", "()Ljava/util/Map;", "getProductId", "()Ljava/lang/String;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public class PlatformProductId {
    private final String productId;

    public PlatformProductId(String str) {
        AbstractC3557B.c0("productId", str);
        this.productId = str;
    }

    public Map<String, String> getAsMap() {
        return P4.a.o0(new C3959i("product_id", getProductId()));
    }

    public String getProductId() {
        return this.productId;
    }
}

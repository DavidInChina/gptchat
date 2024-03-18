package com.revenuecat.purchases.google;

import com.revenuecat.purchases.common.caching.DeviceCache;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import r9.y;

@Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public /* synthetic */ class BillingWrapper$consumeAndSave$1 extends k implements wf.k {
    public BillingWrapper$consumeAndSave$1(Object obj) {
        super(1, obj, DeviceCache.class, "addSuccessfullyPostedToken", "addSuccessfullyPostedToken(Ljava/lang/String;)V", 0);
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return jf.y.f36177a;
    }

    public final void invoke(String str) {
        AbstractC3557B.c0("p0", str);
        ((DeviceCache) this.receiver).addSuccessfullyPostedToken(str);
    }
}

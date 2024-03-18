package com.revenuecat.purchases;

import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import r9.y;

@Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public /* synthetic */ class PurchasesFactory$createPaywallEventsManager$1 extends k implements wf.k {
    public PurchasesFactory$createPaywallEventsManager$1(Object obj) {
        super(1, obj, PaywallStoredEvent.Companion.class, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", 0);
    }

    public final PaywallStoredEvent invoke(String str) {
        AbstractC3557B.c0("p0", str);
        return ((PaywallStoredEvent.Companion) this.receiver).fromString(str);
    }
}

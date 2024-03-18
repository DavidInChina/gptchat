package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaywallEventsManager$track$1 extends o implements AbstractC6216a {
    final /* synthetic */ PaywallEvent $event;
    final /* synthetic */ PaywallEventsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallEventsManager$track$1(PaywallEvent paywallEvent, PaywallEventsManager paywallEventsManager) {
        super(0);
        this.$event = paywallEvent;
        this.this$0 = paywallEventsManager;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        EventsFileHelper eventsFileHelper;
        IdentityManager identityManager;
        LogUtilsKt.debugLog("Tracking paywall event: " + this.$event);
        eventsFileHelper = this.this$0.fileHelper;
        PaywallEvent paywallEvent = this.$event;
        identityManager = this.this$0.identityManager;
        eventsFileHelper.appendEvent(new PaywallStoredEvent(paywallEvent, identityManager.getCurrentAppUserID()));
    }
}

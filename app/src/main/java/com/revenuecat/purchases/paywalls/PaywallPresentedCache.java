package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEventType;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\n\u0010\bR\"\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "getAndRemovePresentedEvent", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "paywallEvent", "Ljf/y;", "cachePresentedPaywall", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;)V", "event", "receiveEvent", "<set-?>", "lastPaywallImpressionEvent", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaywallPresentedCache {
    private PaywallEvent lastPaywallImpressionEvent;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaywallEventType.values().length];
            try {
                iArr[PaywallEventType.IMPRESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaywallEventType.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final synchronized void cachePresentedPaywall(PaywallEvent paywallEvent) {
        AbstractC3557B.c0("paywallEvent", paywallEvent);
        this.lastPaywallImpressionEvent = paywallEvent;
    }

    public final synchronized PaywallEvent getAndRemovePresentedEvent() {
        PaywallEvent paywallEvent;
        paywallEvent = this.lastPaywallImpressionEvent;
        this.lastPaywallImpressionEvent = null;
        return paywallEvent;
    }

    public final synchronized void receiveEvent(PaywallEvent paywallEvent) {
        try {
            AbstractC3557B.c0("event", paywallEvent);
            int i10 = WhenMappings.$EnumSwitchMapping$0[paywallEvent.getType().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    LogUtilsKt.verboseLog("Clearing cached paywall impression event.");
                    this.lastPaywallImpressionEvent = null;
                }
            } else {
                LogUtilsKt.verboseLog("Caching paywall impression event.");
                this.lastPaywallImpressionEvent = paywallEvent;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

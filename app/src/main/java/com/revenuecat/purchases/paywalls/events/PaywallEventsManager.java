package com.revenuecat.purchases.paywalls.events;

import H0.RunnableC0712x;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import id.AbstractC3557B;
import java.util.List;
import kf.v;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B-\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8B@BX\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"\u00a8\u0006&"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;", "", "", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "getEventsToSync", "()Ljava/util/List;", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Lkotlin/Function0;", "Ljf/y;", "command", "enqueue", "(Lcom/revenuecat/purchases/common/Delay;Lwf/a;)V", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "event", "track", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;)V", "flushEvents", "()V", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "fileHelper", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/Dispatcher;", "paywallEventsDispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "", "<set-?>", "flushInProgress", "Z", "<init>", "(Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Backend;)V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaywallEventsManager {
    public static final Companion Companion = new Companion(null);
    private static final long FLUSH_COUNT = 50;
    public static final String PAYWALL_EVENTS_FILE_PATH = "RevenueCat/paywall_event_store/paywall_event_store.jsonl";
    private final Backend backend;
    private final EventsFileHelper<PaywallStoredEvent> fileHelper;
    private boolean flushInProgress;
    private final IdentityManager identityManager;
    private final Dispatcher paywallEventsDispatcher;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager$Companion;", "", "()V", "FLUSH_COUNT", "", "PAYWALL_EVENTS_FILE_PATH", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public PaywallEventsManager(EventsFileHelper<PaywallStoredEvent> eventsFileHelper, IdentityManager identityManager, Dispatcher dispatcher, Backend backend) {
        AbstractC3557B.c0("fileHelper", eventsFileHelper);
        AbstractC3557B.c0("identityManager", identityManager);
        AbstractC3557B.c0("paywallEventsDispatcher", dispatcher);
        AbstractC3557B.c0("backend", backend);
        this.fileHelper = eventsFileHelper;
        this.identityManager = identityManager;
        this.paywallEventsDispatcher = dispatcher;
        this.backend = backend;
    }

    public static /* synthetic */ void a(AbstractC6216a abstractC6216a) {
        enqueue$lambda$0(abstractC6216a);
    }

    private final void enqueue(Delay delay, AbstractC6216a abstractC6216a) {
        this.paywallEventsDispatcher.enqueue(new RunnableC0712x(abstractC6216a, 6), delay);
    }

    public static /* synthetic */ void enqueue$default(PaywallEventsManager paywallEventsManager, Delay delay, AbstractC6216a abstractC6216a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            delay = Delay.NONE;
        }
        paywallEventsManager.enqueue(delay, abstractC6216a);
    }

    public static final void enqueue$lambda$0(AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("$command", abstractC6216a);
        abstractC6216a.mo122invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final List<PaywallStoredEvent> getEventsToSync() {
        ?? obj = new Object();
        obj.f37622Y = v.f37483Y;
        this.fileHelper.readFile(new PaywallEventsManager$getEventsToSync$1(obj));
        return (List) obj.f37622Y;
    }

    public final synchronized void flushEvents() {
        enqueue$default(this, null, new PaywallEventsManager$flushEvents$1(this), 1, null);
    }

    public final synchronized void track(PaywallEvent paywallEvent) {
        AbstractC3557B.c0("event", paywallEvent);
        enqueue$default(this, null, new PaywallEventsManager$track$1(paywallEvent, this), 1, null);
    }
}

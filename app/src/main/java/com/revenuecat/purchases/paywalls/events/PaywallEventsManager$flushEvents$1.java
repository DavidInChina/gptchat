package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.utils.EventsFileHelper;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.y;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.n;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PaywallEventsManager$flushEvents$1 extends o implements AbstractC6216a {
    final /* synthetic */ PaywallEventsManager this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends o implements AbstractC6216a {
        final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
        final /* synthetic */ PaywallEventsManager this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$2$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends o implements AbstractC6216a {
            final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
            final /* synthetic */ PaywallEventsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                super(0);
                this.this$0 = paywallEventsManager;
                this.$eventsToSyncWithNullValues = list;
            }

            @Override // wf.AbstractC6216a
            /* renamed from: invoke */
            public final void mo122invoke() {
                EventsFileHelper eventsFileHelper;
                eventsFileHelper = this.this$0.fileHelper;
                eventsFileHelper.clear(this.$eventsToSyncWithNullValues.size());
                this.this$0.flushInProgress = false;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
            super(0);
            this.this$0 = paywallEventsManager;
            this.$eventsToSyncWithNullValues = list;
        }

        @Override // wf.AbstractC6216a
        /* renamed from: invoke */
        public final void mo122invoke() {
            LogUtilsKt.verboseLog("Paywall event flush: success.");
            PaywallEventsManager paywallEventsManager = this.this$0;
            PaywallEventsManager.enqueue$default(paywallEventsManager, null, new AnonymousClass1(paywallEventsManager, this.$eventsToSyncWithNullValues), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "shouldMarkAsSynced", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass3 extends o implements n {
        final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
        final /* synthetic */ PaywallEventsManager this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$3$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends o implements AbstractC6216a {
            final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
            final /* synthetic */ boolean $shouldMarkAsSynced;
            final /* synthetic */ PaywallEventsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(boolean z10, PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                super(0);
                this.$shouldMarkAsSynced = z10;
                this.this$0 = paywallEventsManager;
                this.$eventsToSyncWithNullValues = list;
            }

            @Override // wf.AbstractC6216a
            /* renamed from: invoke */
            public final void mo122invoke() {
                EventsFileHelper eventsFileHelper;
                if (this.$shouldMarkAsSynced) {
                    eventsFileHelper = this.this$0.fileHelper;
                    eventsFileHelper.clear(this.$eventsToSyncWithNullValues.size());
                }
                this.this$0.flushInProgress = false;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
            super(2);
            this.this$0 = paywallEventsManager;
            this.$eventsToSyncWithNullValues = list;
        }

        @Override // wf.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return y.f36177a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z10) {
            AbstractC3557B.c0("error", purchasesError);
            LogUtilsKt.errorLog$default("Paywall event flush error: " + purchasesError + '.', null, 2, null);
            PaywallEventsManager paywallEventsManager = this.this$0;
            PaywallEventsManager.enqueue$default(paywallEventsManager, null, new AnonymousClass1(z10, paywallEventsManager, this.$eventsToSyncWithNullValues), 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallEventsManager$flushEvents$1(PaywallEventsManager paywallEventsManager) {
        super(0);
        this.this$0 = paywallEventsManager;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        boolean z10;
        List eventsToSync;
        Backend backend;
        z10 = this.this$0.flushInProgress;
        if (!z10) {
            this.this$0.flushInProgress = true;
            eventsToSync = this.this$0.getEventsToSync();
            ArrayList d22 = t.d2(eventsToSync);
            int size = d22.size();
            if (d22.isEmpty()) {
                LogUtilsKt.verboseLog("No paywall events to sync.");
                this.this$0.flushInProgress = false;
                return;
            }
            LogUtilsKt.verboseLog("Paywall event flush: posting " + size + " events.");
            backend = this.this$0.backend;
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(d22, 10));
            Iterator it = d22.iterator();
            while (it.hasNext()) {
                arrayList.add(((PaywallStoredEvent) it.next()).toPaywallBackendEvent());
            }
            backend.postPaywallEvents(new PaywallEventRequest(arrayList), new AnonymousClass2(this.this$0, eventsToSync), new AnonymousClass3(this.this$0, eventsToSync));
            return;
        }
        LogUtilsKt.debugLog("Flush already in progress.");
    }
}

package com.revenuecat.purchases.paywalls.events;

import R4.b;
import ah.AbstractC1998i;
import ch.AbstractC2431b;
import dh.C2695d;
import dh.q0;
import eh.AbstractC2904d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import yf.AbstractC6583a;

@AbstractC1998i
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\b\u001f\u0010 B+\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\b\u001f\u0010$J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\r\u00a8\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;", "", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "component1", "()Ljava/util/List;", "events", "copy", "(Ljava/util/List;)Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEvents", "getCacheKey", "cacheKey", "<init>", "(Ljava/util/List;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILjava/util/List;Ldh/q0;)V", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaywallEventRequest {
    public static final Companion Companion = new Companion(null);
    private static final AbstractC2904d json = AbstractC2904d.f29415d;
    private final List<PaywallBackendEvent> events;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Leh/d;", "json", "Leh/d;", "getJson", "()Leh/d;", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AbstractC2904d getJson() {
            return PaywallEventRequest.json;
        }

        public final KSerializer serializer() {
            return PaywallEventRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallEventRequest(int i10, List list, q0 q0Var) {
        if (1 == (i10 & 1)) {
            this.events = list;
        } else {
            b.e2(i10, 1, PaywallEventRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallEventRequest copy$default(PaywallEventRequest paywallEventRequest, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = paywallEventRequest.events;
        }
        return paywallEventRequest.copy(list);
    }

    public static final void write$Self(PaywallEventRequest paywallEventRequest, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("self", paywallEventRequest);
        AbstractC3557B.c0("output", abstractC2431b);
        AbstractC3557B.c0("serialDesc", serialDescriptor);
        abstractC2431b.i(serialDescriptor, 0, new C2695d(PaywallBackendEvent$$serializer.INSTANCE, 0), paywallEventRequest.events);
    }

    public final List<PaywallBackendEvent> component1() {
        return this.events;
    }

    public final PaywallEventRequest copy(List<PaywallBackendEvent> list) {
        AbstractC3557B.c0("events", list);
        return new PaywallEventRequest(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaywallEventRequest) && AbstractC3557B.K(this.events, ((PaywallEventRequest) obj).events);
    }

    public final List<String> getCacheKey() {
        List<PaywallBackendEvent> list = this.events;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (PaywallBackendEvent paywallBackendEvent : list) {
            arrayList.add(String.valueOf(paywallBackendEvent.hashCode()));
        }
        return arrayList;
    }

    public final List<PaywallBackendEvent> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public String toString() {
        return "PaywallEventRequest(events=" + this.events + ')';
    }

    public PaywallEventRequest(List<PaywallBackendEvent> list) {
        AbstractC3557B.c0("events", list);
        this.events = list;
    }
}

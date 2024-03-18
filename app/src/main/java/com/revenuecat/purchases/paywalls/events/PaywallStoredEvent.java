package com.revenuecat.purchases.paywalls.events;

import Bi.c;
import R4.b;
import ah.AbstractC1998i;
import ch.AbstractC2431b;
import com.revenuecat.purchases.utils.Event;
import dh.q0;
import eh.AbstractC2904d;
import eh.C2903c;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@AbstractC1998i
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\r\u00a2\u0006\u0004\b$\u0010%B/\b\u0017\u0012\u0006\u0010&\u001a\u00020\u0018\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u00a2\u0006\u0004\b$\u0010)J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u000fJ$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0014\u001a\u00020\u00108\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010\u000f\u00a8\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "Lcom/revenuecat/purchases/utils/Event;", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "toPaywallBackendEvent", "()Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "", "toString", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "component1", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "component2", "event", "userID", "copy", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "getEvent", "Ljava/lang/String;", "getUserID", "<init>", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;Ldh/q0;)V", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PaywallStoredEvent implements Event {
    public static final Companion Companion = new Companion(null);
    private static final C2903c json = AbstractC2904d.f29415d;
    private final PaywallEvent event;
    private final String userID;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u00c6\u0001\u00a2\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent$Companion;", "", "", "string", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "fromString", "(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Leh/c;", "json", "Leh/c;", "getJson", "()Leh/c;", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final PaywallStoredEvent fromString(String str) {
            AbstractC3557B.c0("string", str);
            C2903c json = getJson();
            return (PaywallStoredEvent) json.b(c.F1(json.f29417b, C.a(PaywallStoredEvent.class)), str);
        }

        public final C2903c getJson() {
            return PaywallStoredEvent.json;
        }

        public final KSerializer serializer() {
            return PaywallStoredEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallStoredEvent(int i10, PaywallEvent paywallEvent, String str, q0 q0Var) {
        if (3 != (i10 & 3)) {
            b.e2(i10, 3, PaywallStoredEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.event = paywallEvent;
        this.userID = str;
    }

    public static /* synthetic */ PaywallStoredEvent copy$default(PaywallStoredEvent paywallStoredEvent, PaywallEvent paywallEvent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallEvent = paywallStoredEvent.event;
        }
        if ((i10 & 2) != 0) {
            str = paywallStoredEvent.userID;
        }
        return paywallStoredEvent.copy(paywallEvent, str);
    }

    public static final void write$Self(PaywallStoredEvent paywallStoredEvent, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("self", paywallStoredEvent);
        AbstractC3557B.c0("output", abstractC2431b);
        AbstractC3557B.c0("serialDesc", serialDescriptor);
        abstractC2431b.i(serialDescriptor, 0, PaywallEvent$$serializer.INSTANCE, paywallStoredEvent.event);
        abstractC2431b.z(1, paywallStoredEvent.userID, serialDescriptor);
    }

    public final PaywallEvent component1() {
        return this.event;
    }

    public final String component2() {
        return this.userID;
    }

    public final PaywallStoredEvent copy(PaywallEvent paywallEvent, String str) {
        AbstractC3557B.c0("event", paywallEvent);
        AbstractC3557B.c0("userID", str);
        return new PaywallStoredEvent(paywallEvent, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallStoredEvent)) {
            return false;
        }
        PaywallStoredEvent paywallStoredEvent = (PaywallStoredEvent) obj;
        return AbstractC3557B.K(this.event, paywallStoredEvent.event) && AbstractC3557B.K(this.userID, paywallStoredEvent.userID);
    }

    public final PaywallEvent getEvent() {
        return this.event;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return this.userID.hashCode() + (this.event.hashCode() * 31);
    }

    public final PaywallBackendEvent toPaywallBackendEvent() {
        String uuid = this.event.getCreationData().getId().toString();
        AbstractC3557B.b0("event.creationData.id.toString()", uuid);
        String value = this.event.getType().getValue();
        String str = this.userID;
        String uuid2 = this.event.getData().getSessionIdentifier().toString();
        AbstractC3557B.b0("event.data.sessionIdentifier.toString()", uuid2);
        return new PaywallBackendEvent(uuid, 1, value, str, uuid2, this.event.getData().getOfferingIdentifier(), this.event.getData().getPaywallRevision(), this.event.getCreationData().getDate().getTime(), this.event.getData().getDisplayMode(), this.event.getData().getDarkMode(), this.event.getData().getLocaleIdentifier());
    }

    @Override // com.revenuecat.purchases.utils.Event
    public String toString() {
        C2903c c2903c = json;
        return c2903c.d(c.F1(c2903c.f29417b, C.a(PaywallStoredEvent.class)), this);
    }

    public PaywallStoredEvent(PaywallEvent paywallEvent, String str) {
        AbstractC3557B.c0("event", paywallEvent);
        AbstractC3557B.c0("userID", str);
        this.event = paywallEvent;
        this.userID = str;
    }
}

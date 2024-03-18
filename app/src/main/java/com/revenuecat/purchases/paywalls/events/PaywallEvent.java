package com.revenuecat.purchases.paywalls.events;

import E9.f;
import P4.a;
import R4.b;
import ah.AbstractC1998i;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import ch.AbstractC2431b;
import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import dh.q0;
import id.AbstractC3557B;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import r9.y;
import y.AbstractC6463a;

@ExperimentalPreviewRevenueCatPurchasesAPI
@AbstractC1998i
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00043245B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u00a2\u0006\u0004\b,\u0010-B9\b\u0017\u0012\u0006\u0010.\u001a\u00020\u001f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\b\u00100\u001a\u0004\u0018\u00010/\u00a2\u0006\u0004\b,\u00101J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0014H\u00c6\u0001\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b$\u0010%R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006\u00a2\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010\u0010R\u0017\u0010\u0018\u001a\u00020\u00118\u0006\u00a2\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b)\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006\u00a2\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b+\u0010\u0016\u00a8\u00066"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toPaywallPostReceiptData$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toPaywallPostReceiptData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "component1", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "component2", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "component3", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "creationData", "data", "type", "copy", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "getCreationData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "getData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "getType", "<init>", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;Ldh/q0;)V", "Companion", "$serializer", "CreationData", "Data", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PaywallEvent {
    public static final Companion Companion = new Companion(null);
    private final CreationData creationData;
    private final Data data;
    private final PaywallEventType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final KSerializer serializer() {
            return PaywallEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallEvent(int i10, CreationData creationData, Data data, PaywallEventType paywallEventType, q0 q0Var) {
        if (7 != (i10 & 7)) {
            b.e2(i10, 7, PaywallEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.creationData = creationData;
        this.data = data;
        this.type = paywallEventType;
    }

    public static /* synthetic */ PaywallEvent copy$default(PaywallEvent paywallEvent, CreationData creationData, Data data, PaywallEventType paywallEventType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            creationData = paywallEvent.creationData;
        }
        if ((i10 & 2) != 0) {
            data = paywallEvent.data;
        }
        if ((i10 & 4) != 0) {
            paywallEventType = paywallEvent.type;
        }
        return paywallEvent.copy(creationData, data, paywallEventType);
    }

    public static final void write$Self(PaywallEvent paywallEvent, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("self", paywallEvent);
        AbstractC3557B.c0("output", abstractC2431b);
        AbstractC3557B.c0("serialDesc", serialDescriptor);
        abstractC2431b.i(serialDescriptor, 0, PaywallEvent$CreationData$$serializer.INSTANCE, paywallEvent.creationData);
        abstractC2431b.i(serialDescriptor, 1, PaywallEvent$Data$$serializer.INSTANCE, paywallEvent.data);
        abstractC2431b.i(serialDescriptor, 2, a.E("com.revenuecat.purchases.paywalls.events.PaywallEventType", PaywallEventType.values()), paywallEvent.type);
    }

    public final CreationData component1() {
        return this.creationData;
    }

    public final Data component2() {
        return this.data;
    }

    public final PaywallEventType component3() {
        return this.type;
    }

    public final PaywallEvent copy(CreationData creationData, Data data, PaywallEventType paywallEventType) {
        AbstractC3557B.c0("creationData", creationData);
        AbstractC3557B.c0("data", data);
        AbstractC3557B.c0("type", paywallEventType);
        return new PaywallEvent(creationData, data, paywallEventType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallEvent)) {
            return false;
        }
        PaywallEvent paywallEvent = (PaywallEvent) obj;
        return AbstractC3557B.K(this.creationData, paywallEvent.creationData) && AbstractC3557B.K(this.data, paywallEvent.data) && this.type == paywallEvent.type;
    }

    public final CreationData getCreationData() {
        return this.creationData;
    }

    public final Data getData() {
        return this.data;
    }

    public final PaywallEventType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.data.hashCode();
        return this.type.hashCode() + ((hashCode + (this.creationData.hashCode() * 31)) * 31);
    }

    public final PaywallPostReceiptData toPaywallPostReceiptData$purchases_customEntitlementComputationRelease() {
        String uuid = this.data.getSessionIdentifier().toString();
        AbstractC3557B.b0("data.sessionIdentifier.toString()", uuid);
        return new PaywallPostReceiptData(uuid, this.data.getPaywallRevision(), this.data.getDisplayMode(), this.data.getDarkMode(), this.data.getLocaleIdentifier(), this.data.getOfferingIdentifier());
    }

    public String toString() {
        return "PaywallEvent(creationData=" + this.creationData + ", data=" + this.data + ", type=" + this.type + ')';
    }

    @AbstractC1998i
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0004\b%\u0010&B3\b\u0017\u0012\u0006\u0010'\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u00a2\u0006\u0004\b%\u0010*J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\fR \u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\"\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u000f\u00a8\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/UUID;", "component1", "()Ljava/util/UUID;", "Ljava/util/Date;", "component2", "()Ljava/util/Date;", ParameterNames.ID, "date", "copy", "(Ljava/util/UUID;Ljava/util/Date;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "getId$annotations", "()V", "Ljava/util/Date;", "getDate", "getDate$annotations", "<init>", "(Ljava/util/UUID;Ljava/util/Date;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILjava/util/UUID;Ljava/util/Date;Ldh/q0;)V", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class CreationData {
        public static final Companion Companion = new Companion(null);
        private final Date date;

        /* renamed from: id  reason: collision with root package name */
        private final UUID f27750id;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final KSerializer serializer() {
                return PaywallEvent$CreationData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CreationData(int i10, @AbstractC1998i(with = UUIDSerializer.class) UUID uuid, @AbstractC1998i(with = DateSerializer.class) Date date, q0 q0Var) {
            if (3 != (i10 & 3)) {
                b.e2(i10, 3, PaywallEvent$CreationData$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.f27750id = uuid;
            this.date = date;
        }

        public static /* synthetic */ CreationData copy$default(CreationData creationData, UUID uuid, Date date, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uuid = creationData.f27750id;
            }
            if ((i10 & 2) != 0) {
                date = creationData.date;
            }
            return creationData.copy(uuid, date);
        }

        @AbstractC1998i(with = DateSerializer.class)
        public static /* synthetic */ void getDate$annotations() {
        }

        @AbstractC1998i(with = UUIDSerializer.class)
        public static /* synthetic */ void getId$annotations() {
        }

        public static final void write$Self(CreationData creationData, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
            AbstractC3557B.c0("self", creationData);
            AbstractC3557B.c0("output", abstractC2431b);
            AbstractC3557B.c0("serialDesc", serialDescriptor);
            abstractC2431b.i(serialDescriptor, 0, UUIDSerializer.INSTANCE, creationData.f27750id);
            abstractC2431b.i(serialDescriptor, 1, DateSerializer.INSTANCE, creationData.date);
        }

        public final UUID component1() {
            return this.f27750id;
        }

        public final Date component2() {
            return this.date;
        }

        public final CreationData copy(UUID uuid, Date date) {
            AbstractC3557B.c0(ParameterNames.ID, uuid);
            AbstractC3557B.c0("date", date);
            return new CreationData(uuid, date);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreationData)) {
                return false;
            }
            CreationData creationData = (CreationData) obj;
            return AbstractC3557B.K(this.f27750id, creationData.f27750id) && AbstractC3557B.K(this.date, creationData.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final UUID getId() {
            return this.f27750id;
        }

        public int hashCode() {
            return this.date.hashCode() + (this.f27750id.hashCode() * 31);
        }

        public String toString() {
            return "CreationData(id=" + this.f27750id + ", date=" + this.date + ')';
        }

        public CreationData(UUID uuid, Date date) {
            AbstractC3557B.c0(ParameterNames.ID, uuid);
            AbstractC3557B.c0("date", date);
            this.f27750id = uuid;
            this.date = date;
        }
    }

    @AbstractC1998i
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\u0015\u00a2\u0006\u0004\b1\u00102BU\b\u0017\u0012\u0006\u00103\u001a\u00020\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001d\u001a\u00020\u0015\u0012\b\u00105\u001a\u0004\u0018\u000104\u00a2\u0006\u0004\b1\u00106J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015H\u00c6\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u0015H\u00c6\u0001\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b \u0010\fJ\u0010\u0010!\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\b!\u0010\u000fJ\u001a\u0010#\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b#\u0010$R\u0017\u0010\u0018\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010\fR\u0017\u0010\u0019\u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010\u000fR \u0010\u001a\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001a\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0012R\u0017\u0010\u001b\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b-\u0010\fR\u0017\u0010\u001c\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b.\u0010\fR\u0017\u0010\u001d\u001a\u00020\u00158\u0006\u00a2\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u0010\u0017\u00a8\u00069"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "", "component2", "()I", "Ljava/util/UUID;", "component3", "()Ljava/util/UUID;", "component4", "component5", "", "component6", "()Z", "offeringIdentifier", "paywallRevision", "sessionIdentifier", "displayMode", "localeIdentifier", "darkMode", "copy", "(Ljava/lang/String;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Z)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOfferingIdentifier", TokenNames.f24313I, "getPaywallRevision", "Ljava/util/UUID;", "getSessionIdentifier", "getSessionIdentifier$annotations", "()V", "getDisplayMode", "getLocaleIdentifier", "Z", "getDarkMode", "<init>", "(Ljava/lang/String;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Z)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;ZLdh/q0;)V", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class Data {
        public static final Companion Companion = new Companion(null);
        private final boolean darkMode;
        private final String displayMode;
        private final String localeIdentifier;
        private final String offeringIdentifier;
        private final int paywallRevision;
        private final UUID sessionIdentifier;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final KSerializer serializer() {
                return PaywallEvent$Data$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Data(int i10, String str, int i11, @AbstractC1998i(with = UUIDSerializer.class) UUID uuid, String str2, String str3, boolean z10, q0 q0Var) {
            if (63 != (i10 & 63)) {
                b.e2(i10, 63, PaywallEvent$Data$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.offeringIdentifier = str;
            this.paywallRevision = i11;
            this.sessionIdentifier = uuid;
            this.displayMode = str2;
            this.localeIdentifier = str3;
            this.darkMode = z10;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i10, UUID uuid, String str2, String str3, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = data.offeringIdentifier;
            }
            if ((i11 & 2) != 0) {
                i10 = data.paywallRevision;
            }
            int i12 = i10;
            if ((i11 & 4) != 0) {
                uuid = data.sessionIdentifier;
            }
            UUID uuid2 = uuid;
            if ((i11 & 8) != 0) {
                str2 = data.displayMode;
            }
            String str4 = str2;
            if ((i11 & 16) != 0) {
                str3 = data.localeIdentifier;
            }
            String str5 = str3;
            if ((i11 & 32) != 0) {
                z10 = data.darkMode;
            }
            return data.copy(str, i12, uuid2, str4, str5, z10);
        }

        @AbstractC1998i(with = UUIDSerializer.class)
        public static /* synthetic */ void getSessionIdentifier$annotations() {
        }

        public static final void write$Self(Data data, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
            AbstractC3557B.c0("self", data);
            AbstractC3557B.c0("output", abstractC2431b);
            AbstractC3557B.c0("serialDesc", serialDescriptor);
            abstractC2431b.z(0, data.offeringIdentifier, serialDescriptor);
            abstractC2431b.m(1, data.paywallRevision, serialDescriptor);
            abstractC2431b.i(serialDescriptor, 2, UUIDSerializer.INSTANCE, data.sessionIdentifier);
            abstractC2431b.z(3, data.displayMode, serialDescriptor);
            abstractC2431b.z(4, data.localeIdentifier, serialDescriptor);
            abstractC2431b.p(serialDescriptor, 5, data.darkMode);
        }

        public final String component1() {
            return this.offeringIdentifier;
        }

        public final int component2() {
            return this.paywallRevision;
        }

        public final UUID component3() {
            return this.sessionIdentifier;
        }

        public final String component4() {
            return this.displayMode;
        }

        public final String component5() {
            return this.localeIdentifier;
        }

        public final boolean component6() {
            return this.darkMode;
        }

        public final Data copy(String str, int i10, UUID uuid, String str2, String str3, boolean z10) {
            AbstractC3557B.c0("offeringIdentifier", str);
            AbstractC3557B.c0("sessionIdentifier", uuid);
            AbstractC3557B.c0("displayMode", str2);
            AbstractC3557B.c0("localeIdentifier", str3);
            return new Data(str, i10, uuid, str2, str3, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return AbstractC3557B.K(this.offeringIdentifier, data.offeringIdentifier) && this.paywallRevision == data.paywallRevision && AbstractC3557B.K(this.sessionIdentifier, data.sessionIdentifier) && AbstractC3557B.K(this.displayMode, data.displayMode) && AbstractC3557B.K(this.localeIdentifier, data.localeIdentifier) && this.darkMode == data.darkMode;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final String getDisplayMode() {
            return this.displayMode;
        }

        public final String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        public final String getOfferingIdentifier() {
            return this.offeringIdentifier;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        public int hashCode() {
            int hashCode = this.sessionIdentifier.hashCode();
            int v10 = f.v(this.localeIdentifier, f.v(this.displayMode, (hashCode + (((this.offeringIdentifier.hashCode() * 31) + this.paywallRevision) * 31)) * 31, 31), 31);
            boolean z10 = this.darkMode;
            if (z10) {
                z10 = true;
            }
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            return v10 + i10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Data(offeringIdentifier=");
            sb2.append(this.offeringIdentifier);
            sb2.append(", paywallRevision=");
            sb2.append(this.paywallRevision);
            sb2.append(", sessionIdentifier=");
            sb2.append(this.sessionIdentifier);
            sb2.append(", displayMode=");
            sb2.append(this.displayMode);
            sb2.append(", localeIdentifier=");
            sb2.append(this.localeIdentifier);
            sb2.append(", darkMode=");
            return AbstractC6463a.l(sb2, this.darkMode, ')');
        }

        public Data(String str, int i10, UUID uuid, String str2, String str3, boolean z10) {
            AbstractC3557B.c0("offeringIdentifier", str);
            AbstractC3557B.c0("sessionIdentifier", uuid);
            AbstractC3557B.c0("displayMode", str2);
            AbstractC3557B.c0("localeIdentifier", str3);
            this.offeringIdentifier = str;
            this.paywallRevision = i10;
            this.sessionIdentifier = uuid;
            this.displayMode = str2;
            this.localeIdentifier = str3;
            this.darkMode = z10;
        }
    }

    public PaywallEvent(CreationData creationData, Data data, PaywallEventType paywallEventType) {
        AbstractC3557B.c0("creationData", creationData);
        AbstractC3557B.c0("data", data);
        AbstractC3557B.c0("type", paywallEventType);
        this.creationData = creationData;
        this.data = data;
        this.type = paywallEventType;
    }
}

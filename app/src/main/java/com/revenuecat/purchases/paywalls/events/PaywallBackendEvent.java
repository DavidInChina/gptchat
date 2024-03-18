package com.revenuecat.purchases.paywalls.events;

import E9.f;
import R4.b;
import ah.AbstractC1998i;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import ch.AbstractC2431b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import dh.q0;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import r9.y;

@AbstractC1998i
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 L2\u00020\u0001:\u0002MLB_\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u00a2\u0006\u0004\bF\u0010GB\u008f\u0001\b\u0017\u0012\u0006\u0010H\u001a\u00020\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010J\u001a\u0004\u0018\u00010I\u00a2\u0006\u0004\bF\u0010KJ\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0004J~\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\"\u0010\u0004J\u0010\u0010#\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\b#\u0010\u0007J\u001a\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b%\u0010&J(\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u00c7\u0001\u00a2\u0006\u0004\b-\u0010.R\u0017\u0010\u0015\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u0010\u0004R\u0017\u0010\u0016\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0016\u00101\u001a\u0004\b2\u0010\u0007R\u0017\u0010\u0017\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\b3\u0010\u0004R \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0018\u0010/\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0004R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0019\u0010/\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010\u0004R \u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001a\u0010/\u0012\u0004\b:\u00106\u001a\u0004\b9\u0010\u0004R \u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001b\u00101\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010\u0007R\u0017\u0010\u001c\u001a\u00020\r8\u0006\u00a2\u0006\f\n\u0004\b\u001c\u0010=\u001a\u0004\b>\u0010\u000fR \u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001d\u0010/\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010\u0004R \u0010\u001e\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001e\u0010A\u0012\u0004\bC\u00106\u001a\u0004\bB\u0010\u0013R \u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001f\u0010/\u0012\u0004\bE\u00106\u001a\u0004\bD\u0010\u0004\u00a8\u0006N"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "", "", "component1", "()Ljava/lang/String;", "", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "", "component8", "()J", "component9", "", "component10", "()Z", "component11", ParameterNames.ID, ParameterNames.VERSION, "type", "appUserID", "sessionID", "offeringID", "paywallRevision", DiagnosticsEntry.Event.TIMESTAMP_KEY, "displayMode", "darkMode", "localeIdentifier", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", TokenNames.f24313I, "getVersion", "getType", "getAppUserID", "getAppUserID$annotations", "()V", "getSessionID", "getSessionID$annotations", "getOfferingID", "getOfferingID$annotations", "getPaywallRevision", "getPaywallRevision$annotations", "J", "getTimestamp", "getDisplayMode", "getDisplayMode$annotations", "Z", "getDarkMode", "getDarkMode$annotations", "getLocaleIdentifier", "getLocaleIdentifier$annotations", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;Ldh/q0;)V", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaywallBackendEvent {
    public static final Companion Companion = new Companion(null);
    public static final int PAYWALL_EVENT_SCHEMA_VERSION = 1;
    private final String appUserID;
    private final boolean darkMode;
    private final String displayMode;

    /* renamed from: id  reason: collision with root package name */
    private final String f27749id;
    private final String localeIdentifier;
    private final String offeringID;
    private final int paywallRevision;
    private final String sessionID;
    private final long timestamp;
    private final String type;
    private final int version;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent$Companion;", "", "()V", "PAYWALL_EVENT_SCHEMA_VERSION", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final KSerializer serializer() {
            return PaywallBackendEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallBackendEvent(int i10, String str, int i11, String str2, String str3, String str4, String str5, int i12, long j6, String str6, boolean z10, String str7, q0 q0Var) {
        if (2047 != (i10 & 2047)) {
            b.e2(i10, 2047, PaywallBackendEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f27749id = str;
        this.version = i11;
        this.type = str2;
        this.appUserID = str3;
        this.sessionID = str4;
        this.offeringID = str5;
        this.paywallRevision = i12;
        this.timestamp = j6;
        this.displayMode = str6;
        this.darkMode = z10;
        this.localeIdentifier = str7;
    }

    public static /* synthetic */ void getAppUserID$annotations() {
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingID$annotations() {
    }

    public static /* synthetic */ void getPaywallRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }

    public static final void write$Self(PaywallBackendEvent paywallBackendEvent, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("self", paywallBackendEvent);
        AbstractC3557B.c0("output", abstractC2431b);
        AbstractC3557B.c0("serialDesc", serialDescriptor);
        abstractC2431b.z(0, paywallBackendEvent.f27749id, serialDescriptor);
        abstractC2431b.m(1, paywallBackendEvent.version, serialDescriptor);
        abstractC2431b.z(2, paywallBackendEvent.type, serialDescriptor);
        abstractC2431b.z(3, paywallBackendEvent.appUserID, serialDescriptor);
        abstractC2431b.z(4, paywallBackendEvent.sessionID, serialDescriptor);
        abstractC2431b.z(5, paywallBackendEvent.offeringID, serialDescriptor);
        abstractC2431b.m(6, paywallBackendEvent.paywallRevision, serialDescriptor);
        abstractC2431b.B(serialDescriptor, 7, paywallBackendEvent.timestamp);
        abstractC2431b.z(8, paywallBackendEvent.displayMode, serialDescriptor);
        abstractC2431b.p(serialDescriptor, 9, paywallBackendEvent.darkMode);
        abstractC2431b.z(10, paywallBackendEvent.localeIdentifier, serialDescriptor);
    }

    public final String component1() {
        return this.f27749id;
    }

    public final boolean component10() {
        return this.darkMode;
    }

    public final String component11() {
        return this.localeIdentifier;
    }

    public final int component2() {
        return this.version;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.appUserID;
    }

    public final String component5() {
        return this.sessionID;
    }

    public final String component6() {
        return this.offeringID;
    }

    public final int component7() {
        return this.paywallRevision;
    }

    public final long component8() {
        return this.timestamp;
    }

    public final String component9() {
        return this.displayMode;
    }

    public final PaywallBackendEvent copy(String str, int i10, String str2, String str3, String str4, String str5, int i11, long j6, String str6, boolean z10, String str7) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("type", str2);
        AbstractC3557B.c0("appUserID", str3);
        AbstractC3557B.c0("sessionID", str4);
        AbstractC3557B.c0("offeringID", str5);
        AbstractC3557B.c0("displayMode", str6);
        AbstractC3557B.c0("localeIdentifier", str7);
        return new PaywallBackendEvent(str, i10, str2, str3, str4, str5, i11, j6, str6, z10, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallBackendEvent)) {
            return false;
        }
        PaywallBackendEvent paywallBackendEvent = (PaywallBackendEvent) obj;
        return AbstractC3557B.K(this.f27749id, paywallBackendEvent.f27749id) && this.version == paywallBackendEvent.version && AbstractC3557B.K(this.type, paywallBackendEvent.type) && AbstractC3557B.K(this.appUserID, paywallBackendEvent.appUserID) && AbstractC3557B.K(this.sessionID, paywallBackendEvent.sessionID) && AbstractC3557B.K(this.offeringID, paywallBackendEvent.offeringID) && this.paywallRevision == paywallBackendEvent.paywallRevision && this.timestamp == paywallBackendEvent.timestamp && AbstractC3557B.K(this.displayMode, paywallBackendEvent.displayMode) && this.darkMode == paywallBackendEvent.darkMode && AbstractC3557B.K(this.localeIdentifier, paywallBackendEvent.localeIdentifier);
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getId() {
        return this.f27749id;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingID() {
        return this.offeringID;
    }

    public final int getPaywallRevision() {
        return this.paywallRevision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int v10 = f.v(this.sessionID, f.v(this.appUserID, f.v(this.type, ((this.f27749id.hashCode() * 31) + this.version) * 31, 31), 31), 31);
        long j6 = this.timestamp;
        int v11 = f.v(this.displayMode, (((f.v(this.offeringID, v10, 31) + this.paywallRevision) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31, 31);
        boolean z10 = this.darkMode;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        return this.localeIdentifier.hashCode() + ((v11 + i10) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaywallBackendEvent(id=");
        sb2.append(this.f27749id);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", appUserID=");
        sb2.append(this.appUserID);
        sb2.append(", sessionID=");
        sb2.append(this.sessionID);
        sb2.append(", offeringID=");
        sb2.append(this.offeringID);
        sb2.append(", paywallRevision=");
        sb2.append(this.paywallRevision);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", displayMode=");
        sb2.append(this.displayMode);
        sb2.append(", darkMode=");
        sb2.append(this.darkMode);
        sb2.append(", localeIdentifier=");
        return a.n(sb2, this.localeIdentifier, ')');
    }

    public PaywallBackendEvent(String str, int i10, String str2, String str3, String str4, String str5, int i11, long j6, String str6, boolean z10, String str7) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("type", str2);
        AbstractC3557B.c0("appUserID", str3);
        AbstractC3557B.c0("sessionID", str4);
        AbstractC3557B.c0("offeringID", str5);
        AbstractC3557B.c0("displayMode", str6);
        AbstractC3557B.c0("localeIdentifier", str7);
        this.f27749id = str;
        this.version = i10;
        this.type = str2;
        this.appUserID = str3;
        this.sessionID = str4;
        this.offeringID = str5;
        this.paywallRevision = i11;
        this.timestamp = j6;
        this.displayMode = str6;
        this.darkMode = z10;
        this.localeIdentifier = str7;
    }
}

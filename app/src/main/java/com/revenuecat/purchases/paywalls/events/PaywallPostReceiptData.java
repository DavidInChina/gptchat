package com.revenuecat.purchases.paywalls.events;

import Bi.c;
import E9.f;
import R4.b;
import ah.AbstractC1998i;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.parser.TokenNames;
import ch.AbstractC2431b;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import dh.q0;
import eh.AbstractC2904d;
import eh.C2903c;
import id.AbstractC3557B;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@AbstractC1998i
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=<B7\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u00a2\u0006\u0004\b6\u00107B_\b\u0017\u0012\u0006\u00108\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010:\u001a\u0004\u0018\u000109\u00a2\u0006\u0004\b6\u0010;J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0014H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\b\u0018\u0010\u000fJL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\b!\u0010\u000fJ\u0010\u0010\"\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\b\"\u0010\u0012J\u001a\u0010$\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b$\u0010%R \u0010\u0019\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0019\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u000fR \u0010\u001a\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001a\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u0012R \u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001b\u0010&\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u000fR \u0010\u001c\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001c\u0010/\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u0016R \u0010\u001d\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001d\u0010&\u0012\u0004\b3\u0010)\u001a\u0004\b2\u0010\u000fR \u0010\u001e\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001e\u0010&\u0012\u0004\b5\u0010)\u001a\u0004\b4\u0010\u000f\u00a8\u0006>"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "", "toMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "", "component2", "()I", "component3", "", "component4", "()Z", "component5", "component6", "sessionID", "revision", "displayMode", "darkMode", "localeIdentifier", "offeringId", "copy", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionID", "getSessionID$annotations", "()V", TokenNames.f24313I, "getRevision", "getRevision$annotations", "getDisplayMode", "getDisplayMode$annotations", "Z", "getDarkMode", "getDarkMode$annotations", "getLocaleIdentifier", "getLocaleIdentifier$annotations", "getOfferingId", "getOfferingId$annotations", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ldh/q0;)V", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaywallPostReceiptData {
    public static final Companion Companion = new Companion(null);
    private static final C2903c json = AbstractC2904d.f29415d;
    private final boolean darkMode;
    private final String displayMode;
    private final String localeIdentifier;
    private final String offeringId;
    private final int revision;
    private final String sessionID;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Leh/c;", "json", "Leh/c;", "getJson", "()Leh/c;", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final C2903c getJson() {
            return PaywallPostReceiptData.json;
        }

        public final KSerializer serializer() {
            return PaywallPostReceiptData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallPostReceiptData(int i10, String str, int i11, String str2, boolean z10, String str3, String str4, q0 q0Var) {
        if (63 != (i10 & 63)) {
            b.e2(i10, 63, PaywallPostReceiptData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.sessionID = str;
        this.revision = i11;
        this.displayMode = str2;
        this.darkMode = z10;
        this.localeIdentifier = str3;
        this.offeringId = str4;
    }

    public static /* synthetic */ PaywallPostReceiptData copy$default(PaywallPostReceiptData paywallPostReceiptData, String str, int i10, String str2, boolean z10, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paywallPostReceiptData.sessionID;
        }
        if ((i11 & 2) != 0) {
            i10 = paywallPostReceiptData.revision;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str2 = paywallPostReceiptData.displayMode;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            z10 = paywallPostReceiptData.darkMode;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            str3 = paywallPostReceiptData.localeIdentifier;
        }
        String str6 = str3;
        if ((i11 & 32) != 0) {
            str4 = paywallPostReceiptData.offeringId;
        }
        return paywallPostReceiptData.copy(str, i12, str5, z11, str6, str4);
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingId$annotations() {
    }

    public static /* synthetic */ void getRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }

    public static final void write$Self(PaywallPostReceiptData paywallPostReceiptData, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("self", paywallPostReceiptData);
        AbstractC3557B.c0("output", abstractC2431b);
        AbstractC3557B.c0("serialDesc", serialDescriptor);
        abstractC2431b.z(0, paywallPostReceiptData.sessionID, serialDescriptor);
        abstractC2431b.m(1, paywallPostReceiptData.revision, serialDescriptor);
        abstractC2431b.z(2, paywallPostReceiptData.displayMode, serialDescriptor);
        abstractC2431b.p(serialDescriptor, 3, paywallPostReceiptData.darkMode);
        abstractC2431b.z(4, paywallPostReceiptData.localeIdentifier, serialDescriptor);
        abstractC2431b.z(5, paywallPostReceiptData.offeringId, serialDescriptor);
    }

    public final String component1() {
        return this.sessionID;
    }

    public final int component2() {
        return this.revision;
    }

    public final String component3() {
        return this.displayMode;
    }

    public final boolean component4() {
        return this.darkMode;
    }

    public final String component5() {
        return this.localeIdentifier;
    }

    public final String component6() {
        return this.offeringId;
    }

    public final PaywallPostReceiptData copy(String str, int i10, String str2, boolean z10, String str3, String str4) {
        AbstractC3557B.c0("sessionID", str);
        AbstractC3557B.c0("displayMode", str2);
        AbstractC3557B.c0("localeIdentifier", str3);
        AbstractC3557B.c0("offeringId", str4);
        return new PaywallPostReceiptData(str, i10, str2, z10, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallPostReceiptData)) {
            return false;
        }
        PaywallPostReceiptData paywallPostReceiptData = (PaywallPostReceiptData) obj;
        return AbstractC3557B.K(this.sessionID, paywallPostReceiptData.sessionID) && this.revision == paywallPostReceiptData.revision && AbstractC3557B.K(this.displayMode, paywallPostReceiptData.displayMode) && this.darkMode == paywallPostReceiptData.darkMode && AbstractC3557B.K(this.localeIdentifier, paywallPostReceiptData.localeIdentifier) && AbstractC3557B.K(this.offeringId, paywallPostReceiptData.offeringId);
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

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public int hashCode() {
        int v10 = f.v(this.displayMode, ((this.sessionID.hashCode() * 31) + this.revision) * 31, 31);
        boolean z10 = this.darkMode;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        return this.offeringId.hashCode() + f.v(this.localeIdentifier, (v10 + i10) * 31, 31);
    }

    public final Map<String, Object> toMap() {
        C2903c c2903c = json;
        Map<String, Object> asMap = JsonElementExtensionsKt.asMap(c2903c.c(c.F1(c2903c.f29417b, C.a(PaywallPostReceiptData.class)), this));
        if (asMap == null) {
            return null;
        }
        return MapExtensionsKt.filterNotNullValues(asMap);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaywallPostReceiptData(sessionID=");
        sb2.append(this.sessionID);
        sb2.append(", revision=");
        sb2.append(this.revision);
        sb2.append(", displayMode=");
        sb2.append(this.displayMode);
        sb2.append(", darkMode=");
        sb2.append(this.darkMode);
        sb2.append(", localeIdentifier=");
        sb2.append(this.localeIdentifier);
        sb2.append(", offeringId=");
        return a.n(sb2, this.offeringId, ')');
    }

    public PaywallPostReceiptData(String str, int i10, String str2, boolean z10, String str3, String str4) {
        AbstractC3557B.c0("sessionID", str);
        AbstractC3557B.c0("displayMode", str2);
        AbstractC3557B.c0("localeIdentifier", str3);
        AbstractC3557B.c0("offeringId", str4);
        this.sessionID = str;
        this.revision = i10;
        this.displayMode = str2;
        this.darkMode = z10;
        this.localeIdentifier = str3;
        this.offeringId = str4;
    }
}

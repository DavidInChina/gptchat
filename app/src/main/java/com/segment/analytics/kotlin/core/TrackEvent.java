package com.segment.analytics.kotlin.core;

import Qd.o;
import ah.AbstractC1998i;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import y.AbstractC6463a;

@AbstractC1998i
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/segment/analytics/kotlin/core/TrackEvent;", "Lcom/segment/analytics/kotlin/core/a;", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TrackEvent extends a {
    public static final Companion Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public kotlinx.serialization.json.c f27800a;

    /* renamed from: b  reason: collision with root package name */
    public String f27801b;

    /* renamed from: d  reason: collision with root package name */
    public String f27803d;

    /* renamed from: e  reason: collision with root package name */
    public String f27804e;

    /* renamed from: f  reason: collision with root package name */
    public kotlinx.serialization.json.c f27805f;

    /* renamed from: g  reason: collision with root package name */
    public kotlinx.serialization.json.c f27806g;

    /* renamed from: j  reason: collision with root package name */
    public String f27809j;

    /* renamed from: c  reason: collision with root package name */
    public o f27802c = o.f14641Z;

    /* renamed from: h  reason: collision with root package name */
    public String f27807h = "";

    /* renamed from: i  reason: collision with root package name */
    public DestinationMetadata f27808i = new DestinationMetadata();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/TrackEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/TrackEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return TrackEvent$$serializer.INSTANCE;
        }
    }

    public TrackEvent(String str, kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0(DiagnosticsEntry.Event.PROPERTIES_KEY, cVar);
        AbstractC3557B.c0("event", str);
        this.f27800a = cVar;
        this.f27801b = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String c() {
        String str = this.f27804e;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2("anonymousId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final kotlinx.serialization.json.c d() {
        kotlinx.serialization.json.c cVar = this.f27806g;
        if (cVar != null) {
            return cVar;
        }
        AbstractC3557B.C2("context");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final kotlinx.serialization.json.c e() {
        kotlinx.serialization.json.c cVar = this.f27805f;
        if (cVar != null) {
            return cVar;
        }
        AbstractC3557B.C2("integrations");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(TrackEvent.class, cls) || !super.equals(obj)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.segment.analytics.kotlin.core.TrackEvent", obj);
        TrackEvent trackEvent = (TrackEvent) obj;
        if (AbstractC3557B.K(this.f27800a, trackEvent.f27800a) && AbstractC3557B.K(this.f27801b, trackEvent.f27801b)) {
            return true;
        }
        return false;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String f() {
        String str = this.f27803d;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2("messageId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String g() {
        String str = this.f27809j;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2(DiagnosticsEntry.Event.TIMESTAMP_KEY);
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final o h() {
        return this.f27802c;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final int hashCode() {
        return this.f27801b.hashCode() + AbstractC6463a.f(this.f27800a.f37662Y, super.hashCode() * 31, 31);
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String i() {
        return this.f27807h;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final DestinationMetadata j() {
        return this.f27808i;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void k(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27804e = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void l(kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("<set-?>", cVar);
        this.f27806g = cVar;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void m(kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("<set-?>", cVar);
        this.f27805f = cVar;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void n(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27803d = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void o(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27809j = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void p(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27807h = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void q(DestinationMetadata destinationMetadata) {
        AbstractC3557B.c0("<set-?>", destinationMetadata);
        this.f27808i = destinationMetadata;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrackEvent(properties=");
        sb2.append(this.f27800a);
        sb2.append(", event=");
        return android.gov.nist.core.a.n(sb2, this.f27801b, ')');
    }
}

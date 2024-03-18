package com.segment.analytics.kotlin.core;

import Qd.o;
import ah.AbstractC1998i;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/segment/analytics/kotlin/core/AliasEvent;", "Lcom/segment/analytics/kotlin/core/a;", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AliasEvent extends a {
    public static final Companion Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public String f27754a;

    /* renamed from: b  reason: collision with root package name */
    public String f27755b;

    /* renamed from: c  reason: collision with root package name */
    public o f27756c;

    /* renamed from: d  reason: collision with root package name */
    public String f27757d;

    /* renamed from: e  reason: collision with root package name */
    public String f27758e;

    /* renamed from: f  reason: collision with root package name */
    public kotlinx.serialization.json.c f27759f;

    /* renamed from: g  reason: collision with root package name */
    public kotlinx.serialization.json.c f27760g;

    /* renamed from: h  reason: collision with root package name */
    public String f27761h;

    /* renamed from: i  reason: collision with root package name */
    public DestinationMetadata f27762i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/AliasEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/AliasEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return AliasEvent$$serializer.INSTANCE;
        }
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String c() {
        String str = this.f27758e;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2("anonymousId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final kotlinx.serialization.json.c d() {
        kotlinx.serialization.json.c cVar = this.f27760g;
        if (cVar != null) {
            return cVar;
        }
        AbstractC3557B.C2("context");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final kotlinx.serialization.json.c e() {
        kotlinx.serialization.json.c cVar = this.f27759f;
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
        if (!AbstractC3557B.K(AliasEvent.class, cls) || !super.equals(obj)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.segment.analytics.kotlin.core.AliasEvent", obj);
        if (AbstractC3557B.K(this.f27755b, ((AliasEvent) obj).f27755b)) {
            return true;
        }
        return false;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String f() {
        String str = this.f27757d;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2("messageId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String g() {
        String str = this.f27761h;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2(DiagnosticsEntry.Event.TIMESTAMP_KEY);
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final o h() {
        return this.f27756c;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final int hashCode() {
        return this.f27755b.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String i() {
        return this.f27754a;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final DestinationMetadata j() {
        return this.f27762i;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void k(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27758e = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void l(kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("<set-?>", cVar);
        this.f27760g = cVar;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void m(kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("<set-?>", cVar);
        this.f27759f = cVar;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void n(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27757d = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void o(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27761h = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void p(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27754a = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void q(DestinationMetadata destinationMetadata) {
        AbstractC3557B.c0("<set-?>", destinationMetadata);
        this.f27762i = destinationMetadata;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AliasEvent(userId=");
        sb2.append(this.f27754a);
        sb2.append(", previousId=");
        return android.gov.nist.core.a.n(sb2, this.f27755b, ')');
    }
}

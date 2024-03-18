package com.segment.analytics.kotlin.core;

import E9.f;
import Qd.o;
import ah.AbstractC1998i;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/segment/analytics/kotlin/core/ScreenEvent;", "Lcom/segment/analytics/kotlin/core/a;", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScreenEvent extends a {
    public static final Companion Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public String f27785a;

    /* renamed from: b  reason: collision with root package name */
    public String f27786b;

    /* renamed from: c  reason: collision with root package name */
    public kotlinx.serialization.json.c f27787c;

    /* renamed from: e  reason: collision with root package name */
    public String f27789e;

    /* renamed from: f  reason: collision with root package name */
    public String f27790f;

    /* renamed from: g  reason: collision with root package name */
    public kotlinx.serialization.json.c f27791g;

    /* renamed from: h  reason: collision with root package name */
    public kotlinx.serialization.json.c f27792h;

    /* renamed from: j  reason: collision with root package name */
    public String f27794j;

    /* renamed from: d  reason: collision with root package name */
    public o f27788d = o.f14642h0;

    /* renamed from: i  reason: collision with root package name */
    public String f27793i = "";

    /* renamed from: k  reason: collision with root package name */
    public DestinationMetadata f27795k = new DestinationMetadata();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/ScreenEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/ScreenEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return ScreenEvent$$serializer.INSTANCE;
        }
    }

    public ScreenEvent(String str, String str2, kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("category", str2);
        AbstractC3557B.c0(DiagnosticsEntry.Event.PROPERTIES_KEY, cVar);
        this.f27785a = str;
        this.f27786b = str2;
        this.f27787c = cVar;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String c() {
        String str = this.f27790f;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2("anonymousId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final kotlinx.serialization.json.c d() {
        kotlinx.serialization.json.c cVar = this.f27791g;
        if (cVar != null) {
            return cVar;
        }
        AbstractC3557B.C2("context");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final kotlinx.serialization.json.c e() {
        kotlinx.serialization.json.c cVar = this.f27792h;
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
        if (!AbstractC3557B.K(ScreenEvent.class, cls) || !super.equals(obj)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.segment.analytics.kotlin.core.ScreenEvent", obj);
        ScreenEvent screenEvent = (ScreenEvent) obj;
        if (AbstractC3557B.K(this.f27785a, screenEvent.f27785a) && AbstractC3557B.K(this.f27786b, screenEvent.f27786b) && AbstractC3557B.K(this.f27787c, screenEvent.f27787c)) {
            return true;
        }
        return false;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String f() {
        String str = this.f27789e;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2("messageId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String g() {
        String str = this.f27794j;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2(DiagnosticsEntry.Event.TIMESTAMP_KEY);
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final o h() {
        return this.f27788d;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final int hashCode() {
        return this.f27787c.f37662Y.hashCode() + f.v(this.f27786b, f.v(this.f27785a, super.hashCode() * 31, 31), 31);
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String i() {
        return this.f27793i;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final DestinationMetadata j() {
        return this.f27795k;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void k(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27790f = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void l(kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("<set-?>", cVar);
        this.f27791g = cVar;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void m(kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("<set-?>", cVar);
        this.f27792h = cVar;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void n(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27789e = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void o(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27794j = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void p(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27793i = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void q(DestinationMetadata destinationMetadata) {
        AbstractC3557B.c0("<set-?>", destinationMetadata);
        this.f27795k = destinationMetadata;
    }

    public final String toString() {
        return "ScreenEvent(name=" + this.f27785a + ", category=" + this.f27786b + ", properties=" + this.f27787c + ')';
    }
}

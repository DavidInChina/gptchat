package com.segment.analytics.kotlin.core;

import Qd.o;
import ah.AbstractC1998i;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/segment/analytics/kotlin/core/IdentifyEvent;", "Lcom/segment/analytics/kotlin/core/a;", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IdentifyEvent extends a {
    public static final Companion Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public String f27776a;

    /* renamed from: b  reason: collision with root package name */
    public kotlinx.serialization.json.c f27777b;

    /* renamed from: d  reason: collision with root package name */
    public String f27779d;

    /* renamed from: e  reason: collision with root package name */
    public String f27780e;

    /* renamed from: f  reason: collision with root package name */
    public kotlinx.serialization.json.c f27781f;

    /* renamed from: g  reason: collision with root package name */
    public kotlinx.serialization.json.c f27782g;

    /* renamed from: h  reason: collision with root package name */
    public String f27783h;

    /* renamed from: c  reason: collision with root package name */
    public o f27778c = o.f14644j0;

    /* renamed from: i  reason: collision with root package name */
    public DestinationMetadata f27784i = new DestinationMetadata();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/IdentifyEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/IdentifyEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return IdentifyEvent$$serializer.INSTANCE;
        }
    }

    public IdentifyEvent(String str, kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("userId", str);
        AbstractC3557B.c0("traits", cVar);
        this.f27776a = str;
        this.f27777b = cVar;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String c() {
        String str = this.f27780e;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2("anonymousId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final kotlinx.serialization.json.c d() {
        kotlinx.serialization.json.c cVar = this.f27782g;
        if (cVar != null) {
            return cVar;
        }
        AbstractC3557B.C2("context");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final kotlinx.serialization.json.c e() {
        kotlinx.serialization.json.c cVar = this.f27781f;
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
        if (!AbstractC3557B.K(IdentifyEvent.class, cls) || !super.equals(obj)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.segment.analytics.kotlin.core.IdentifyEvent", obj);
        if (AbstractC3557B.K(this.f27777b, ((IdentifyEvent) obj).f27777b)) {
            return true;
        }
        return false;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String f() {
        String str = this.f27779d;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2("messageId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String g() {
        String str = this.f27783h;
        if (str != null) {
            return str;
        }
        AbstractC3557B.C2(DiagnosticsEntry.Event.TIMESTAMP_KEY);
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final o h() {
        return this.f27778c;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final int hashCode() {
        return this.f27777b.f37662Y.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final String i() {
        return this.f27776a;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final DestinationMetadata j() {
        return this.f27784i;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void k(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27780e = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void l(kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("<set-?>", cVar);
        this.f27782g = cVar;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void m(kotlinx.serialization.json.c cVar) {
        AbstractC3557B.c0("<set-?>", cVar);
        this.f27781f = cVar;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void n(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27779d = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void o(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27783h = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void p(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.f27776a = str;
    }

    @Override // com.segment.analytics.kotlin.core.a
    public final void q(DestinationMetadata destinationMetadata) {
        AbstractC3557B.c0("<set-?>", destinationMetadata);
        this.f27784i = destinationMetadata;
    }

    public final String toString() {
        return "IdentifyEvent(userId=" + this.f27776a + ", traits=" + this.f27777b + ')';
    }
}

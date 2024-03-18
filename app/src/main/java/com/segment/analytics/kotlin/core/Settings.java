package com.segment.analytics.kotlin.core;

import Qd.p;
import ah.AbstractC1998i;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import y.AbstractC6463a;

@AbstractC1998i
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/segment/analytics/kotlin/core/Settings;", "", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Settings {
    public static final Companion Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public kotlinx.serialization.json.c f27796a;

    /* renamed from: b  reason: collision with root package name */
    public kotlinx.serialization.json.c f27797b;

    /* renamed from: c  reason: collision with root package name */
    public kotlinx.serialization.json.c f27798c;

    /* renamed from: d  reason: collision with root package name */
    public kotlinx.serialization.json.c f27799d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/Settings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/Settings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return Settings$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Settings() {
        this(r0, r0, r0, r0);
        kotlinx.serialization.json.c cVar = p.f14647a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) obj;
        return AbstractC3557B.K(this.f27796a, settings.f27796a) && AbstractC3557B.K(this.f27797b, settings.f27797b) && AbstractC3557B.K(this.f27798c, settings.f27798c) && AbstractC3557B.K(this.f27799d, settings.f27799d);
    }

    public final int hashCode() {
        return this.f27799d.f37662Y.hashCode() + AbstractC6463a.f(this.f27798c.f37662Y, AbstractC6463a.f(this.f27797b.f37662Y, this.f27796a.f37662Y.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Settings(integrations=" + this.f27796a + ", plan=" + this.f27797b + ", edgeFunction=" + this.f27798c + ", middlewareSettings=" + this.f27799d + ')';
    }

    public Settings(kotlinx.serialization.json.c cVar, kotlinx.serialization.json.c cVar2, kotlinx.serialization.json.c cVar3, kotlinx.serialization.json.c cVar4) {
        AbstractC3557B.c0("integrations", cVar);
        AbstractC3557B.c0("plan", cVar2);
        AbstractC3557B.c0("edgeFunction", cVar3);
        AbstractC3557B.c0("middlewareSettings", cVar4);
        this.f27796a = cVar;
        this.f27797b = cVar2;
        this.f27798c = cVar3;
        this.f27799d = cVar4;
    }
}

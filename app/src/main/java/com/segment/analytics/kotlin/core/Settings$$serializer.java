package com.segment.analytics.kotlin.core;

import Qd.p;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import eh.C2899A;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"com/segment/analytics/kotlin/core/Settings.$serializer", "Ldh/F;", "Lcom/segment/analytics/kotlin/core/Settings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/Settings;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/Settings;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Settings$$serializer implements AbstractC2680F {
    public static final Settings$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Settings$$serializer settings$$serializer = new Settings$$serializer();
        INSTANCE = settings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.segment.analytics.kotlin.core.Settings", settings$$serializer, 4);
        pluginGeneratedSerialDescriptor.k("integrations", true);
        pluginGeneratedSerialDescriptor.k("plan", true);
        pluginGeneratedSerialDescriptor.k("edgeFunction", true);
        pluginGeneratedSerialDescriptor.k("middlewareSettings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Settings$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        C2899A c2899a = C2899A.f29405a;
        return new KSerializer[]{c2899a, c2899a, c2899a, c2899a};
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, com.segment.analytics.kotlin.core.Settings] */
    @Override // ah.AbstractC1991b
    public Settings deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        Object obj = null;
        boolean z10 = true;
        boolean z11 = false;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (z10) {
            int t10 = c10.t(descriptor2);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                obj = c10.n(descriptor2, 0, C2899A.f29405a, obj);
                z11 |= true;
            } else if (t10 == 1) {
                obj2 = c10.n(descriptor2, 1, C2899A.f29405a, obj2);
                z11 |= true;
            } else if (t10 == 2) {
                obj3 = c10.n(descriptor2, 2, C2899A.f29405a, obj3);
                z11 |= true;
            } else if (t10 != 3) {
                throw new C2004o(t10);
            } else {
                obj4 = c10.n(descriptor2, 3, C2899A.f29405a, obj4);
                z11 |= true;
            }
        }
        c10.b(descriptor2);
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj;
        kotlinx.serialization.json.c cVar2 = (kotlinx.serialization.json.c) obj2;
        kotlinx.serialization.json.c cVar3 = (kotlinx.serialization.json.c) obj3;
        kotlinx.serialization.json.c cVar4 = (kotlinx.serialization.json.c) obj4;
        ?? obj5 = new Object();
        if (!z11 || !true) {
            obj5.f27796a = p.f14647a;
        } else {
            obj5.f27796a = cVar;
        }
        if (!z11 || !true) {
            obj5.f27797b = p.f14647a;
        } else {
            obj5.f27797b = cVar2;
        }
        if (!z11 || !true) {
            obj5.f27798c = p.f14647a;
        } else {
            obj5.f27798c = cVar3;
        }
        if (!z11 || !true) {
            obj5.f27799d = p.f14647a;
        } else {
            obj5.f27799d = cVar4;
        }
        return obj5;
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Settings settings) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", settings);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        AbstractC3557B.c0("serialDesc", descriptor2);
        boolean C10 = c10.C(descriptor2);
        kotlinx.serialization.json.c cVar = settings.f27796a;
        if (C10 || !AbstractC3557B.K(cVar, p.f14647a)) {
            c10.i(descriptor2, 0, C2899A.f29405a, cVar);
        }
        boolean C11 = c10.C(descriptor2);
        kotlinx.serialization.json.c cVar2 = settings.f27797b;
        if (C11 || !AbstractC3557B.K(cVar2, p.f14647a)) {
            c10.i(descriptor2, 1, C2899A.f29405a, cVar2);
        }
        boolean C12 = c10.C(descriptor2);
        kotlinx.serialization.json.c cVar3 = settings.f27798c;
        if (C12 || !AbstractC3557B.K(cVar3, p.f14647a)) {
            c10.i(descriptor2, 2, C2899A.f29405a, cVar3);
        }
        boolean C13 = c10.C(descriptor2);
        kotlinx.serialization.json.c cVar4 = settings.f27799d;
        if (C13 || !AbstractC3557B.K(cVar4, p.f14647a)) {
            c10.i(descriptor2, 3, C2899A.f29405a, cVar4);
        }
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

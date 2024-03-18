package com.segment.analytics.kotlin.core;

import Qd.o;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import eh.C2899A;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"com/segment/analytics/kotlin/core/ScreenEvent.$serializer", "Ldh/F;", "Lcom/segment/analytics/kotlin/core/ScreenEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/ScreenEvent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/ScreenEvent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ScreenEvent$$serializer implements AbstractC2680F {
    public static final ScreenEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ScreenEvent$$serializer screenEvent$$serializer = new ScreenEvent$$serializer();
        INSTANCE = screenEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("screen", screenEvent$$serializer, 11);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("category", false);
        pluginGeneratedSerialDescriptor.k(DiagnosticsEntry.Event.PROPERTIES_KEY, false);
        pluginGeneratedSerialDescriptor.k("type", true);
        pluginGeneratedSerialDescriptor.k("messageId", false);
        pluginGeneratedSerialDescriptor.k("anonymousId", false);
        pluginGeneratedSerialDescriptor.k("context", false);
        pluginGeneratedSerialDescriptor.k("integrations", false);
        pluginGeneratedSerialDescriptor.k("userId", true);
        pluginGeneratedSerialDescriptor.k(DiagnosticsEntry.Event.TIMESTAMP_KEY, false);
        pluginGeneratedSerialDescriptor.k("_metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScreenEvent$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        KSerializer serializer = o.Companion.serializer();
        u0 u0Var = u0.f28491a;
        C2899A c2899a = C2899A.f29405a;
        return new KSerializer[]{u0Var, u0Var, c2899a, serializer, u0Var, u0Var, c2899a, c2899a, u0Var, u0Var, DestinationMetadata$$serializer.INSTANCE};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.segment.analytics.kotlin.core.ScreenEvent, java.lang.Object] */
    @Override // ah.AbstractC1991b
    public ScreenEvent deserialize(Decoder decoder) {
        boolean z10;
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        Object obj = null;
        String str = null;
        boolean z11 = true;
        int i10 = 0;
        String str2 = null;
        String str3 = null;
        Object obj2 = null;
        Object obj3 = null;
        String str4 = null;
        String str5 = null;
        Object obj4 = null;
        Object obj5 = null;
        String str6 = null;
        while (z11) {
            int t10 = c10.t(descriptor2);
            switch (t10) {
                case -1:
                    z11 = false;
                    continue;
                case 0:
                    z10 = z11;
                    str2 = c10.r(descriptor2, 0);
                    i10 |= 1;
                    break;
                case 1:
                    str3 = c10.r(descriptor2, 1);
                    i10 |= 2;
                    continue;
                case 2:
                    z10 = z11;
                    obj2 = c10.n(descriptor2, 2, C2899A.f29405a, obj2);
                    i10 |= 4;
                    break;
                case 3:
                    z10 = z11;
                    obj3 = c10.n(descriptor2, 3, o.Companion.serializer(), obj3);
                    i10 |= 8;
                    break;
                case 4:
                    str4 = c10.r(descriptor2, 4);
                    i10 |= 16;
                    continue;
                case 5:
                    str5 = c10.r(descriptor2, 5);
                    i10 |= 32;
                    continue;
                case 6:
                    z10 = z11;
                    obj4 = c10.n(descriptor2, 6, C2899A.f29405a, obj4);
                    i10 |= 64;
                    break;
                case 7:
                    z10 = z11;
                    obj5 = c10.n(descriptor2, 7, C2899A.f29405a, obj5);
                    i10 |= 128;
                    break;
                case 8:
                    str6 = c10.r(descriptor2, 8);
                    i10 |= 256;
                    continue;
                case 9:
                    str = c10.r(descriptor2, 9);
                    i10 |= 512;
                    continue;
                case 10:
                    z10 = z11;
                    obj = c10.n(descriptor2, 10, DestinationMetadata$$serializer.INSTANCE, obj);
                    i10 |= 1024;
                    break;
                default:
                    throw new C2004o(t10);
            }
            z11 = z10;
        }
        c10.b(descriptor2);
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj2;
        o oVar = (o) obj3;
        kotlinx.serialization.json.c cVar2 = (kotlinx.serialization.json.c) obj4;
        kotlinx.serialization.json.c cVar3 = (kotlinx.serialization.json.c) obj5;
        DestinationMetadata destinationMetadata = (DestinationMetadata) obj;
        if (759 != (i10 & 759)) {
            R4.b.e2(i10, 759, INSTANCE.getDescriptor());
            throw null;
        }
        ?? obj6 = new Object();
        obj6.f27785a = str2;
        obj6.f27786b = str3;
        obj6.f27787c = cVar;
        if ((i10 & 8) == 0) {
            obj6.f27788d = o.f14642h0;
        } else {
            obj6.f27788d = oVar;
        }
        obj6.f27789e = str4;
        obj6.f27790f = str5;
        obj6.f27791g = cVar2;
        obj6.f27792h = cVar3;
        if ((i10 & 256) == 0) {
            obj6.f27793i = "";
        } else {
            obj6.f27793i = str6;
        }
        obj6.f27794j = str;
        if ((i10 & 1024) == 0) {
            obj6.f27795k = new DestinationMetadata();
        } else {
            obj6.f27795k = destinationMetadata;
        }
        return obj6;
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ScreenEvent screenEvent) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", screenEvent);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        AbstractC3557B.c0("serialDesc", descriptor2);
        c10.z(0, screenEvent.f27785a, descriptor2);
        c10.z(1, screenEvent.f27786b, descriptor2);
        C2899A c2899a = C2899A.f29405a;
        c10.i(descriptor2, 2, c2899a, screenEvent.f27787c);
        boolean C10 = c10.C(descriptor2);
        o oVar = screenEvent.f27788d;
        if (C10 || oVar != o.f14642h0) {
            c10.i(descriptor2, 3, o.Companion.serializer(), oVar);
        }
        c10.z(4, screenEvent.f(), descriptor2);
        c10.z(5, screenEvent.c(), descriptor2);
        c10.i(descriptor2, 6, c2899a, screenEvent.d());
        c10.i(descriptor2, 7, c2899a, screenEvent.e());
        if (c10.C(descriptor2) || !AbstractC3557B.K(screenEvent.f27793i, "")) {
            c10.z(8, screenEvent.f27793i, descriptor2);
        }
        c10.z(9, screenEvent.g(), descriptor2);
        if (c10.C(descriptor2) || !AbstractC3557B.K(screenEvent.f27795k, new DestinationMetadata())) {
            c10.i(descriptor2, 10, DestinationMetadata$$serializer.INSTANCE, screenEvent.f27795k);
        }
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

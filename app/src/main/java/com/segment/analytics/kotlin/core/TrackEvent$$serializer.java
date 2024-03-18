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

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"com/segment/analytics/kotlin/core/TrackEvent.$serializer", "Ldh/F;", "Lcom/segment/analytics/kotlin/core/TrackEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/TrackEvent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/TrackEvent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TrackEvent$$serializer implements AbstractC2680F {
    public static final TrackEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TrackEvent$$serializer trackEvent$$serializer = new TrackEvent$$serializer();
        INSTANCE = trackEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("track", trackEvent$$serializer, 10);
        pluginGeneratedSerialDescriptor.k(DiagnosticsEntry.Event.PROPERTIES_KEY, false);
        pluginGeneratedSerialDescriptor.k("event", false);
        pluginGeneratedSerialDescriptor.k("type", true);
        pluginGeneratedSerialDescriptor.k("messageId", false);
        pluginGeneratedSerialDescriptor.k("anonymousId", false);
        pluginGeneratedSerialDescriptor.k("integrations", false);
        pluginGeneratedSerialDescriptor.k("context", false);
        pluginGeneratedSerialDescriptor.k("userId", true);
        pluginGeneratedSerialDescriptor.k("_metadata", true);
        pluginGeneratedSerialDescriptor.k(DiagnosticsEntry.Event.TIMESTAMP_KEY, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrackEvent$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        KSerializer serializer = o.Companion.serializer();
        C2899A c2899a = C2899A.f29405a;
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{c2899a, u0Var, serializer, u0Var, u0Var, c2899a, c2899a, u0Var, DestinationMetadata$$serializer.INSTANCE, u0Var};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.segment.analytics.kotlin.core.TrackEvent] */
    @Override // ah.AbstractC1991b
    public TrackEvent deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        String str = null;
        boolean z10 = true;
        int i10 = 0;
        Object obj = null;
        String str2 = null;
        Object obj2 = null;
        String str3 = null;
        String str4 = null;
        Object obj3 = null;
        Object obj4 = null;
        String str5 = null;
        Object obj5 = null;
        while (z10) {
            int t10 = c10.t(descriptor2);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    obj = c10.n(descriptor2, 0, C2899A.f29405a, obj);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = c10.r(descriptor2, 1);
                    i10 |= 2;
                    break;
                case 2:
                    obj2 = c10.n(descriptor2, 2, o.Companion.serializer(), obj2);
                    i10 |= 4;
                    break;
                case 3:
                    str3 = c10.r(descriptor2, 3);
                    i10 |= 8;
                    break;
                case 4:
                    str4 = c10.r(descriptor2, 4);
                    i10 |= 16;
                    break;
                case 5:
                    obj3 = c10.n(descriptor2, 5, C2899A.f29405a, obj3);
                    i10 |= 32;
                    break;
                case 6:
                    obj4 = c10.n(descriptor2, 6, C2899A.f29405a, obj4);
                    i10 |= 64;
                    break;
                case 7:
                    str5 = c10.r(descriptor2, 7);
                    i10 |= 128;
                    break;
                case 8:
                    obj5 = c10.n(descriptor2, 8, DestinationMetadata$$serializer.INSTANCE, obj5);
                    i10 |= 256;
                    break;
                case 9:
                    str = c10.r(descriptor2, 9);
                    i10 |= 512;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(descriptor2);
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj;
        o oVar = (o) obj2;
        kotlinx.serialization.json.c cVar2 = (kotlinx.serialization.json.c) obj3;
        kotlinx.serialization.json.c cVar3 = (kotlinx.serialization.json.c) obj4;
        DestinationMetadata destinationMetadata = (DestinationMetadata) obj5;
        if (635 != (i10 & 635)) {
            R4.b.e2(i10, 635, INSTANCE.getDescriptor());
            throw null;
        }
        ?? obj6 = new Object();
        obj6.f27800a = cVar;
        obj6.f27801b = str2;
        if ((i10 & 4) == 0) {
            obj6.f27802c = o.f14641Z;
        } else {
            obj6.f27802c = oVar;
        }
        obj6.f27803d = str3;
        obj6.f27804e = str4;
        obj6.f27805f = cVar2;
        obj6.f27806g = cVar3;
        if ((i10 & 128) == 0) {
            obj6.f27807h = "";
        } else {
            obj6.f27807h = str5;
        }
        if ((i10 & 256) == 0) {
            obj6.f27808i = new DestinationMetadata();
        } else {
            obj6.f27808i = destinationMetadata;
        }
        obj6.f27809j = str;
        return obj6;
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, TrackEvent trackEvent) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", trackEvent);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        AbstractC3557B.c0("serialDesc", descriptor2);
        C2899A c2899a = C2899A.f29405a;
        c10.i(descriptor2, 0, c2899a, trackEvent.f27800a);
        c10.z(1, trackEvent.f27801b, descriptor2);
        boolean C10 = c10.C(descriptor2);
        o oVar = trackEvent.f27802c;
        if (C10 || oVar != o.f14641Z) {
            c10.i(descriptor2, 2, o.Companion.serializer(), oVar);
        }
        c10.z(3, trackEvent.f(), descriptor2);
        c10.z(4, trackEvent.c(), descriptor2);
        c10.i(descriptor2, 5, c2899a, trackEvent.e());
        c10.i(descriptor2, 6, c2899a, trackEvent.d());
        if (c10.C(descriptor2) || !AbstractC3557B.K(trackEvent.f27807h, "")) {
            c10.z(7, trackEvent.f27807h, descriptor2);
        }
        if (c10.C(descriptor2) || !AbstractC3557B.K(trackEvent.f27808i, new DestinationMetadata())) {
            c10.i(descriptor2, 8, DestinationMetadata$$serializer.INSTANCE, trackEvent.f27808i);
        }
        c10.z(9, trackEvent.g(), descriptor2);
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

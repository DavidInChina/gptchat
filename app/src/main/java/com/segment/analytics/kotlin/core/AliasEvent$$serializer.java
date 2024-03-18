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

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"com/segment/analytics/kotlin/core/AliasEvent.$serializer", "Ldh/F;", "Lcom/segment/analytics/kotlin/core/AliasEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/AliasEvent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/AliasEvent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AliasEvent$$serializer implements AbstractC2680F {
    public static final AliasEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AliasEvent$$serializer aliasEvent$$serializer = new AliasEvent$$serializer();
        INSTANCE = aliasEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("alias", aliasEvent$$serializer, 9);
        pluginGeneratedSerialDescriptor.k("userId", false);
        pluginGeneratedSerialDescriptor.k("previousId", false);
        pluginGeneratedSerialDescriptor.k("type", true);
        pluginGeneratedSerialDescriptor.k("messageId", false);
        pluginGeneratedSerialDescriptor.k("anonymousId", false);
        pluginGeneratedSerialDescriptor.k("integrations", false);
        pluginGeneratedSerialDescriptor.k("context", false);
        pluginGeneratedSerialDescriptor.k(DiagnosticsEntry.Event.TIMESTAMP_KEY, false);
        pluginGeneratedSerialDescriptor.k("_metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AliasEvent$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        KSerializer serializer = o.Companion.serializer();
        u0 u0Var = u0.f28491a;
        C2899A c2899a = C2899A.f29405a;
        return new KSerializer[]{u0Var, u0Var, serializer, u0Var, u0Var, c2899a, c2899a, u0Var, DestinationMetadata$$serializer.INSTANCE};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.segment.analytics.kotlin.core.AliasEvent] */
    @Override // ah.AbstractC1991b
    public AliasEvent deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        Object obj = null;
        String str3 = null;
        String str4 = null;
        Object obj2 = null;
        Object obj3 = null;
        String str5 = null;
        Object obj4 = null;
        while (z10) {
            int t10 = c10.t(descriptor2);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    str = c10.r(descriptor2, 0);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = c10.r(descriptor2, 1);
                    i10 |= 2;
                    break;
                case 2:
                    obj = c10.n(descriptor2, 2, o.Companion.serializer(), obj);
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
                    obj2 = c10.n(descriptor2, 5, C2899A.f29405a, obj2);
                    i10 |= 32;
                    break;
                case 6:
                    obj3 = c10.n(descriptor2, 6, C2899A.f29405a, obj3);
                    i10 |= 64;
                    break;
                case 7:
                    str5 = c10.r(descriptor2, 7);
                    i10 |= 128;
                    break;
                case 8:
                    obj4 = c10.n(descriptor2, 8, DestinationMetadata$$serializer.INSTANCE, obj4);
                    i10 |= 256;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(descriptor2);
        o oVar = (o) obj;
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj2;
        kotlinx.serialization.json.c cVar2 = (kotlinx.serialization.json.c) obj3;
        DestinationMetadata destinationMetadata = (DestinationMetadata) obj4;
        if (251 != (i10 & 251)) {
            R4.b.e2(i10, 251, INSTANCE.getDescriptor());
            throw null;
        }
        ?? obj5 = new Object();
        obj5.f27754a = str;
        obj5.f27755b = str2;
        if ((i10 & 4) == 0) {
            obj5.f27756c = o.f14643i0;
        } else {
            obj5.f27756c = oVar;
        }
        obj5.f27757d = str3;
        obj5.f27758e = str4;
        obj5.f27759f = cVar;
        obj5.f27760g = cVar2;
        obj5.f27761h = str5;
        if ((i10 & 256) == 0) {
            obj5.f27762i = new DestinationMetadata();
        } else {
            obj5.f27762i = destinationMetadata;
        }
        return obj5;
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, AliasEvent aliasEvent) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", aliasEvent);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        AbstractC3557B.c0("serialDesc", descriptor2);
        c10.z(0, aliasEvent.f27754a, descriptor2);
        c10.z(1, aliasEvent.f27755b, descriptor2);
        boolean C10 = c10.C(descriptor2);
        o oVar = aliasEvent.f27756c;
        if (C10 || oVar != o.f14643i0) {
            c10.i(descriptor2, 2, o.Companion.serializer(), oVar);
        }
        c10.z(3, aliasEvent.f(), descriptor2);
        c10.z(4, aliasEvent.c(), descriptor2);
        C2899A c2899a = C2899A.f29405a;
        c10.i(descriptor2, 5, c2899a, aliasEvent.e());
        c10.i(descriptor2, 6, c2899a, aliasEvent.d());
        c10.z(7, aliasEvent.g(), descriptor2);
        if (c10.C(descriptor2) || !AbstractC3557B.K(aliasEvent.f27762i, new DestinationMetadata())) {
            c10.i(descriptor2, 8, DestinationMetadata$$serializer.INSTANCE, aliasEvent.f27762i);
        }
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

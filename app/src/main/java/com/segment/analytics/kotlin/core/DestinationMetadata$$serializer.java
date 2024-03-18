package com.segment.analytics.kotlin.core;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kf.v;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"com/segment/analytics/kotlin/core/DestinationMetadata.$serializer", "Ldh/F;", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/DestinationMetadata;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DestinationMetadata$$serializer implements AbstractC2680F {
    public static final DestinationMetadata$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DestinationMetadata$$serializer destinationMetadata$$serializer = new DestinationMetadata$$serializer();
        INSTANCE = destinationMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.segment.analytics.kotlin.core.DestinationMetadata", destinationMetadata$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("bundled", true);
        pluginGeneratedSerialDescriptor.k("unbundled", true);
        pluginGeneratedSerialDescriptor.k("bundledIds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DestinationMetadata$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{A7.b.U0(new C2695d(u0Var, 0)), A7.b.U0(new C2695d(u0Var, 0)), A7.b.U0(new C2695d(u0Var, 0))};
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [com.segment.analytics.kotlin.core.DestinationMetadata, java.lang.Object] */
    @Override // ah.AbstractC1991b
    public DestinationMetadata deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        Object obj = null;
        boolean z10 = true;
        boolean z11 = false;
        Object obj2 = null;
        Object obj3 = null;
        while (z10) {
            int t10 = c10.t(descriptor2);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                obj = c10.v(descriptor2, 0, new C2695d(u0.f28491a, 0), obj);
                z11 |= true;
            } else if (t10 == 1) {
                obj2 = c10.v(descriptor2, 1, new C2695d(u0.f28491a, 0), obj2);
                z11 |= true;
            } else if (t10 != 2) {
                throw new C2004o(t10);
            } else {
                obj3 = c10.v(descriptor2, 2, new C2695d(u0.f28491a, 0), obj3);
                z11 |= true;
            }
        }
        c10.b(descriptor2);
        List list = (List) obj;
        List list2 = (List) obj2;
        List list3 = (List) obj3;
        ?? obj4 = new Object();
        boolean z12 = z11 & true;
        v vVar = v.f37483Y;
        if (!z12) {
            obj4.f27763a = vVar;
        } else {
            obj4.f27763a = list;
        }
        if (!z11 || !true) {
            obj4.f27764b = vVar;
        } else {
            obj4.f27764b = list2;
        }
        if (!z11 || !true) {
            obj4.f27765c = vVar;
        } else {
            obj4.f27765c = list3;
        }
        return obj4;
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, DestinationMetadata destinationMetadata) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", destinationMetadata);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        AbstractC3557B.c0("serialDesc", descriptor2);
        boolean C10 = c10.C(descriptor2);
        v vVar = v.f37483Y;
        if (C10 || !AbstractC3557B.K(destinationMetadata.f27763a, vVar)) {
            c10.q(descriptor2, 0, new C2695d(u0.f28491a, 0), destinationMetadata.f27763a);
        }
        if (c10.C(descriptor2) || !AbstractC3557B.K(destinationMetadata.f27764b, vVar)) {
            c10.q(descriptor2, 1, new C2695d(u0.f28491a, 0), destinationMetadata.f27764b);
        }
        if (c10.C(descriptor2) || !AbstractC3557B.K(destinationMetadata.f27765c, vVar)) {
            c10.q(descriptor2, 2, new C2695d(u0.f28491a, 0), destinationMetadata.f27765c);
        }
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

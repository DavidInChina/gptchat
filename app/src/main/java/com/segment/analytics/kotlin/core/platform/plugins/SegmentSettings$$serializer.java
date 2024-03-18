package com.segment.analytics.kotlin.core.platform.plugins;

import A7.b;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"com/segment/analytics/kotlin/core/platform/plugins/SegmentSettings.$serializer", "Ldh/F;", "Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SegmentSettings$$serializer implements AbstractC2680F {
    public static final SegmentSettings$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SegmentSettings$$serializer segmentSettings$$serializer = new SegmentSettings$$serializer();
        INSTANCE = segmentSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.segment.analytics.kotlin.core.platform.plugins.SegmentSettings", segmentSettings$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("apiKey", false);
        pluginGeneratedSerialDescriptor.k("apiHost", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SegmentSettings$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, b.U0(u0Var)};
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [com.segment.analytics.kotlin.core.platform.plugins.SegmentSettings, java.lang.Object] */
    @Override // ah.AbstractC1991b
    public SegmentSettings deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        Object obj = null;
        while (z10) {
            int t10 = c10.t(descriptor2);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                str = c10.r(descriptor2, 0);
                i10 |= 1;
            } else if (t10 != 1) {
                throw new C2004o(t10);
            } else {
                obj = c10.v(descriptor2, 1, u0.f28491a, obj);
                i10 |= 2;
            }
        }
        c10.b(descriptor2);
        String str2 = (String) obj;
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, INSTANCE.getDescriptor());
            throw null;
        }
        ?? obj2 = new Object();
        obj2.f27811a = str;
        if ((i10 & 2) == 0) {
            obj2.f27812b = null;
        } else {
            obj2.f27812b = str2;
        }
        return obj2;
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, SegmentSettings segmentSettings) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", segmentSettings);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        AbstractC3557B.c0("serialDesc", descriptor2);
        c10.z(0, segmentSettings.f27811a, descriptor2);
        boolean C10 = c10.C(descriptor2);
        String str = segmentSettings.f27812b;
        if (C10 || str != null) {
            c10.q(descriptor2, 1, u0.f28491a, str);
        }
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

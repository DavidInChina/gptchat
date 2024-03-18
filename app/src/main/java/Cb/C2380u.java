package cb;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: cb.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2380u implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2380u f26552a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26553b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, cb.u, java.lang.Object] */
    static {
        ?? obj = new Object();
        f26552a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.Gizmo.ToolAuth", obj, 1);
        pluginGeneratedSerialDescriptor.k("type", false);
        f26553b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C2382w.f26554b[0]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26553b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2382w.f26554b;
        EnumC2383x enumC2383x = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    enumC2383x = (EnumC2383x) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC2383x);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C2382w(i10, enumC2383x);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26553b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2382w c2382w = (C2382w) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2382w);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26553b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C2382w.f26554b[0], c2382w.f26555a);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

package wd;

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

/* loaded from: classes2.dex */
public final class V implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final V f48369a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f48370b;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd.V, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f48369a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.ImageAssetPointer.Metadata", obj, 1);
        pluginGeneratedSerialDescriptor.k("dalle", true);
        f48370b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(S.f48365a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48370b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        U u10 = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    u10 = (U) c10.v(pluginGeneratedSerialDescriptor, 0, S.f48365a, u10);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new X(i10, u10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48370b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        X x10 = (X) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", x10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48370b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        U u10 = x10.f48371a;
        if (C10 || u10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, S.f48365a, u10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

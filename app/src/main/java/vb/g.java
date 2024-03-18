package Vb;

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
public final class g implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final g f18513a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f18514b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Vb.g] */
    static {
        ?? obj = new Object();
        f18513a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.serverstatus.impl.api.ServerStatusRequest", obj, 1);
        pluginGeneratedSerialDescriptor.k("override_status_for_testing", true);
        f18514b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(i.f18515b[0])};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18514b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = i.f18515b;
        c cVar = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    cVar = (c) c10.v(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], cVar);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new i(i10, cVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f18514b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", iVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18514b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        h hVar = i.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        c cVar = iVar.f18516a;
        if (C10 || cVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, i.f18515b[0], cVar);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

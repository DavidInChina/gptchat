package O9;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final class X0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final X0 f13508a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13509b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, O9.X0] */
    static {
        ?? obj = new Object();
        f13508a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiMultimodalTextContent", obj, 2);
        pluginGeneratedSerialDescriptor.k("parts", false);
        pluginGeneratedSerialDescriptor.k("contentType", false);
        f13509b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{Z0.f13514c[0], dh.u0.f28491a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13509b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = Z0.f13514c;
        List list = null;
        boolean z10 = true;
        String str = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        str = c10.r(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    list = (List) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], list);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new Z0(i10, str, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13509b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Z0 z02 = (Z0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", z02);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13509b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, Z0.f13514c[0], z02.f13515a);
        c10.z(1, z02.f13516b, pluginGeneratedSerialDescriptor);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

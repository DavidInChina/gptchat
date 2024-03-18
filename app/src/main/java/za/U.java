package Za;

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
public final class U implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final U f23521a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23522b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Za.U, java.lang.Object] */
    static {
        ?? obj = new Object();
        f23521a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmoListObject", obj, 2);
        pluginGeneratedSerialDescriptor.k("items", false);
        pluginGeneratedSerialDescriptor.k("cursor", false);
        f23522b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{W.f23525c[0], A7.b.U0(dh.u0.f28491a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23522b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = W.f23525c;
        List list = null;
        boolean z10 = true;
        String str = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        str = (String) c10.v(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str);
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
        return new W(i10, str, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23522b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        W w10 = (W) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", w10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23522b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, W.f23525c[0], w10.f23526a);
        c10.q(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, w10.f23527b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

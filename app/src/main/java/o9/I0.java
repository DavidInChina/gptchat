package O9;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class I0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final I0 f13467a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13468b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, O9.I0, java.lang.Object] */
    static {
        ?? obj = new Object();
        f13467a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiMessageCitationData", obj, 3);
        pluginGeneratedSerialDescriptor.k("startIx", false);
        pluginGeneratedSerialDescriptor.k("endIx", false);
        pluginGeneratedSerialDescriptor.k("metadata", false);
        f13468b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        C2686L c2686l = C2686L.f28406a;
        return new KSerializer[]{A7.b.U0(c2686l), A7.b.U0(c2686l), A7.b.U0(T0.f13499d)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13468b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        Integer num = null;
        boolean z10 = true;
        Integer num2 = null;
        S0 s02 = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            s02 = (S0) c10.v(pluginGeneratedSerialDescriptor, 2, T0.f13499d, s02);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        num2 = (Integer) c10.v(pluginGeneratedSerialDescriptor, 1, C2686L.f28406a, num2);
                        i10 |= 2;
                    }
                } else {
                    num = (Integer) c10.v(pluginGeneratedSerialDescriptor, 0, C2686L.f28406a, num);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new K0(i10, num, num2, s02);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13468b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        K0 k02 = (K0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", k02);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13468b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C2686L c2686l = C2686L.f28406a;
        c10.q(pluginGeneratedSerialDescriptor, 0, c2686l, k02.f13471a);
        c10.q(pluginGeneratedSerialDescriptor, 1, c2686l, k02.f13472b);
        c10.q(pluginGeneratedSerialDescriptor, 2, T0.f13499d, k02.f13473c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

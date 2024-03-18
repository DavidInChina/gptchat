package O9;

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

/* loaded from: classes.dex */
public final class S implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final S f13497a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13498b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, O9.S] */
    static {
        ?? obj = new Object();
        f13497a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiJitPluginData", obj, 2);
        pluginGeneratedSerialDescriptor.k("fromServer", true);
        pluginGeneratedSerialDescriptor.k("fromClient", true);
        f13498b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(C1099d0.f13528a), A7.b.U0(U.f13500a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13498b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        C1138x0 c1138x0 = null;
        boolean z10 = true;
        C1097c0 c1097c0 = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        c1097c0 = (C1097c0) c10.v(pluginGeneratedSerialDescriptor, 1, U.f13500a, c1097c0);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    c1138x0 = (C1138x0) c10.v(pluginGeneratedSerialDescriptor, 0, C1099d0.f13528a, c1138x0);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1140y0(i10, c1138x0, c1097c0);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13498b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1140y0 c1140y0 = (C1140y0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1140y0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13498b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        C1138x0 c1138x0 = c1140y0.f13647a;
        if (C10 || c1138x0 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, C1099d0.f13528a, c1138x0);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        C1097c0 c1097c0 = c1140y0.f13648b;
        if (C11 || c1097c0 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, U.f13500a, c1097c0);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

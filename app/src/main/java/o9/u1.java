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

/* loaded from: classes2.dex */
public final class u1 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final u1 f13604a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13605b;

    /* JADX WARN: Type inference failed for: r0v0, types: [O9.u1, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f13604a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.DalleAttachment.DalleClientAttachment.DalleOperationAttachement", obj, 4);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("originalGenId", false);
        pluginGeneratedSerialDescriptor.k("originalFileId", false);
        pluginGeneratedSerialDescriptor.k("maskFileId", false);
        f13605b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{u0Var, u0Var, u0Var, A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13605b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                str4 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, dh.u0.f28491a, str4);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            str3 = c10.r(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        }
                    } else {
                        str2 = c10.r(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    str = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new w1(i10, str, str2, str3, str4);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13605b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w1 w1Var = (w1) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", w1Var);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13605b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, w1Var.f13621a, pluginGeneratedSerialDescriptor);
        c10.z(1, w1Var.f13622b, pluginGeneratedSerialDescriptor);
        c10.z(2, w1Var.f13623c, pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 3, dh.u0.f28491a, w1Var.f13624d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

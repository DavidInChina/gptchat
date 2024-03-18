package Ed;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final class d implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final d f4667a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f4668b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Ed.d, java.lang.Object] */
    static {
        ?? obj = new Object();
        f4667a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.model.GetTokenResponse", obj, 4);
        pluginGeneratedSerialDescriptor.k("context", true);
        pluginGeneratedSerialDescriptor.k("url", false);
        pluginGeneratedSerialDescriptor.k("token", false);
        pluginGeneratedSerialDescriptor.k("e2eeKey", false);
        f4668b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), u0Var, u0Var, A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f4668b;
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
                                str4 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str4);
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
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new f(i10, str, str2, str3, str4);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f4668b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", fVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f4668b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = fVar.f4669a;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
        }
        c10.z(1, fVar.f4670b, pluginGeneratedSerialDescriptor);
        c10.z(2, fVar.f4671c, pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 3, u0.f28491a, fVar.f4672d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

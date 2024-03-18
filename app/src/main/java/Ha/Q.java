package ha;

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
import wd.C6178a0;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class Q implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final Q f32030a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f32031b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, ha.Q] */
    static {
        ?? obj = new Object();
        f32030a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.metadata.CustomActionResponse", obj, 3);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("targetMessageId", true);
        pluginGeneratedSerialDescriptor.k("operationHash", true);
        f32031b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), A7.b.U0(C6178a0.f48382a), A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6182c0 c6182c0;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32031b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        C6178a0 c6178a0 = C6178a0.f48382a;
                        if (str2 != null) {
                            c6182c0 = new C6182c0(str2);
                        } else {
                            c6182c0 = null;
                        }
                        C6182c0 c6182c02 = (C6182c0) c10.v(pluginGeneratedSerialDescriptor, 1, c6178a0, c6182c0);
                        if (c6182c02 != null) {
                            str2 = c6182c02.f48393Y;
                        } else {
                            str2 = null;
                        }
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
        return new T(i10, str, str2, str3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f32031b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6182c0 c6182c0;
        T t10 = (T) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", t10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32031b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 0, u0Var, t10.f32032a);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = t10.f32033b;
        if (C10 || str != null) {
            C6178a0 c6178a0 = C6178a0.f48382a;
            if (str != null) {
                c6182c0 = new C6182c0(str);
            } else {
                c6182c0 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 1, c6178a0, c6182c0);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = t10.f32034c;
        if (C11 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, str2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

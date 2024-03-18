package L9;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final class Y implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final Y f10899a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10900b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, L9.Y] */
    static {
        ?? obj = new Object();
        f10899a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.UpdateConversationResponse", obj, 2);
        pluginGeneratedSerialDescriptor.k("success", true);
        pluginGeneratedSerialDescriptor.k("detail", true);
        f10900b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(C2701g.f28450a), A7.b.U0(u0.f28491a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10900b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        Boolean bool = null;
        boolean z10 = true;
        String str = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        str = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    bool = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 0, C2701g.f28450a, bool);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new a0(i10, bool, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10900b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a0 a0Var = (a0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", a0Var);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10900b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool = a0Var.f10903a;
        if (C10 || bool != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, C2701g.f28450a, bool);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str = a0Var.f10904b;
        if (C11 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

package Q9;

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
public final class a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14524a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f14525b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Q9.a] */
    static {
        ?? obj = new Object();
        f14524a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.share.ApiCreateSharedConversationRequest", obj, 3);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        pluginGeneratedSerialDescriptor.k("currentNodeId", true);
        pluginGeneratedSerialDescriptor.k("isAnonymous", false);
        f14525b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, A7.b.U0(u0Var), C2701g.f28450a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f14525b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z10 = true;
        String str2 = null;
        int i10 = 0;
        boolean z11 = false;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            z11 = c10.q(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str2);
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
        return new c(i10, str, str2, z11);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f14525b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", cVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f14525b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, cVar.f14526a, pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = cVar.f14527b;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
        }
        c10.p(pluginGeneratedSerialDescriptor, 2, cVar.f14528c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

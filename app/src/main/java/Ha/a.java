package Ha;

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

/* loaded from: classes.dex */
public final class a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7569a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f7570b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Ha.a] */
    static {
        ?? obj = new Object();
        f7569a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.tangled.impl.api.share.ApiPublishSharedConversationRequest", obj, 3);
        pluginGeneratedSerialDescriptor.k("isAnonymous", false);
        pluginGeneratedSerialDescriptor.k("isPublic", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        f7570b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{A7.b.U0(c2701g), A7.b.U0(c2701g), A7.b.U0(u0.f28491a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f7570b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        Boolean bool = null;
        boolean z10 = true;
        Boolean bool2 = null;
        String str = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            str = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        bool2 = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 1, C2701g.f28450a, bool2);
                        i10 |= 2;
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
        return new c(i10, bool, bool2, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f7570b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", cVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f7570b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C2701g c2701g = C2701g.f28450a;
        c10.q(pluginGeneratedSerialDescriptor, 0, c2701g, cVar.f7571a);
        c10.q(pluginGeneratedSerialDescriptor, 1, c2701g, cVar.f7572b);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0.f28491a, cVar.f7573c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

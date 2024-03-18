package L9;

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
public final class b0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f10905a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10906b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, L9.b0, java.lang.Object] */
    static {
        ?? obj = new Object();
        f10905a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.UpdateConversationTitleRequest", obj, 1);
        pluginGeneratedSerialDescriptor.k("title", false);
        f10906b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u0.f28491a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10906b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    str = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new d0(i10, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10906b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d0 d0Var = (d0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", d0Var);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10906b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, d0Var.f10920a, pluginGeneratedSerialDescriptor);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

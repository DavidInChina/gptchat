package L9;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class e0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f10921a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10922b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, L9.e0, java.lang.Object] */
    static {
        ?? obj = new Object();
        f10921a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.UpdateConversationVisibilityRequest", obj, 1);
        pluginGeneratedSerialDescriptor.k("isVisible", false);
        f10922b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C2701g.f28450a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10922b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 0);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new g0(i10, z11);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10922b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g0 g0Var = (g0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", g0Var);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10922b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.p(pluginGeneratedSerialDescriptor, 0, g0Var.f10934a);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

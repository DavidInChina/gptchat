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
public final class s1 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final s1 f13591a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13592b;

    /* JADX WARN: Type inference failed for: r0v0, types: [O9.s1, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f13591a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.DalleAttachment.DalleClientAttachment", obj, 1);
        pluginGeneratedSerialDescriptor.k("operation", true);
        f13592b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(u1.f13604a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13592b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        w1 w1Var = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    w1Var = (w1) c10.v(pluginGeneratedSerialDescriptor, 0, u1.f13604a, w1Var);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new x1(i10, w1Var);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13592b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x1 x1Var = (x1) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", x1Var);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13592b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        w1 w1Var = x1Var.f13627a;
        if (C10 || w1Var != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, u1.f13604a, w1Var);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

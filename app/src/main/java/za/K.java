package Za;

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
public final class K implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final K f23477a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23478b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Za.K] */
    static {
        ?? obj = new Object();
        f23477a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmoDefinition", obj, 1);
        pluginGeneratedSerialDescriptor.k("resource", false);
        f23478b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{X.f23528a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23478b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        Z z10 = null;
        boolean z11 = true;
        int i10 = 0;
        while (z11) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    z10 = (Z) c10.n(pluginGeneratedSerialDescriptor, 0, X.f23528a, z10);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z11 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new M(i10, z10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23478b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        M m10 = (M) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", m10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23478b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, X.f23528a, m10.f23484a);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

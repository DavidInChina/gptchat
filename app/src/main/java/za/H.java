package Za;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final class H implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final H f23464a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23465b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Za.H] */
    static {
        ?? obj = new Object();
        f23464a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmoCuts", obj, 1);
        pluginGeneratedSerialDescriptor.k("cuts", false);
        f23465b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{J.f23473b[0]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23465b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = J.f23473b;
        List list = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    list = (List) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], list);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new J(i10, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23465b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        J j6 = (J) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", j6);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23465b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, J.f23473b[0], j6.f23474a);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

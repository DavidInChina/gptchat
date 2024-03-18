package E9;

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

/* loaded from: classes2.dex */
public final class p implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final p f4567a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f4568b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, E9.p, java.lang.Object] */
    static {
        ?? obj = new Object();
        f4567a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.compliance.impl.api.TermsOfUseResponse", obj, 2);
        pluginGeneratedSerialDescriptor.k("isRequired", true);
        pluginGeneratedSerialDescriptor.k("display", true);
        f4568b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C2701g.f28450a, A7.b.U0(m.f4562a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f4568b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        o oVar = null;
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        oVar = (o) c10.v(pluginGeneratedSerialDescriptor, 1, m.f4562a, oVar);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new r(i10, z11, oVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f4568b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r rVar = (r) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", rVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f4568b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = rVar.f4569a;
        if (C10 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 0, z10);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        o oVar = rVar.f4570b;
        if (C11 || oVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, m.f4562a, oVar);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

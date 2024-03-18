package Za;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
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
public final class N implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final N f23488a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23489b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Za.N] */
    static {
        ?? obj = new Object();
        f23488a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmoList", obj, 2);
        pluginGeneratedSerialDescriptor.k(ParameterNames.INFO, false);
        pluginGeneratedSerialDescriptor.k("list", false);
        f23489b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(Q.f23502a), U.f23521a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23489b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        T t10 = null;
        boolean z10 = true;
        W w10 = null;
        int i10 = 0;
        while (z10) {
            int t11 = c10.t(pluginGeneratedSerialDescriptor);
            if (t11 != -1) {
                if (t11 != 0) {
                    if (t11 == 1) {
                        w10 = (W) c10.n(pluginGeneratedSerialDescriptor, 1, U.f23521a, w10);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t11);
                    }
                } else {
                    t10 = (T) c10.v(pluginGeneratedSerialDescriptor, 0, Q.f23502a, t10);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new P(i10, t10, w10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23489b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        P p10 = (P) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", p10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23489b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 0, Q.f23502a, p10.f23496a);
        c10.i(pluginGeneratedSerialDescriptor, 1, U.f23521a, p10.f23497b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

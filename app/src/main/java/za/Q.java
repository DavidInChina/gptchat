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
public final class Q implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final Q f23502a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23503b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Za.Q, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f23502a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmoListDetails", obj, 4);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("description", false);
        pluginGeneratedSerialDescriptor.k("displayType", false);
        f23503b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23503b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                str4 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, dh.u0.f28491a, str4);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, dh.u0.f28491a, str3);
                            i10 |= 4;
                        }
                    } else {
                        str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str2);
                        i10 |= 2;
                    }
                } else {
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, dh.u0.f28491a, str);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new T(i10, str, str2, str3, str4);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23503b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        T t10 = (T) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", t10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23503b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        dh.u0 u0Var = dh.u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 0, u0Var, t10.f23515a);
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, t10.f23516b);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, t10.f23517c);
        c10.q(pluginGeneratedSerialDescriptor, 3, u0Var, t10.f23518d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

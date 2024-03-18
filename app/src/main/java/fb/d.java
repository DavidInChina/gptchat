package Fb;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
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

/* loaded from: classes.dex */
public final class d implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final d f5143a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5144b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Fb.d, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5143a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.api.model.response.Country", obj, 4);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("label", false);
        pluginGeneratedSerialDescriptor.k("dialCode", false);
        pluginGeneratedSerialDescriptor.k("labelLocal", false);
        f5144b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, u0Var, A7.b.U0(u0Var), A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5144b;
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
                                str4 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str4);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
                            i10 |= 4;
                        }
                    } else {
                        str2 = c10.r(pluginGeneratedSerialDescriptor, 1);
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
        return new f(i10, str, str2, str3, str4);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f5144b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", fVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5144b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, fVar.f5145a, pluginGeneratedSerialDescriptor);
        c10.z(1, fVar.f5146b, pluginGeneratedSerialDescriptor);
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, fVar.f5147c);
        c10.q(pluginGeneratedSerialDescriptor, 3, u0Var, fVar.f5148d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

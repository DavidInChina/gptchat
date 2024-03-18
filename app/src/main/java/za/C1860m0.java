package Za;

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

/* renamed from: Za.m0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1860m0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1860m0 f23579a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23580b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Za.m0] */
    static {
        ?? obj = new Object();
        f23579a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiSocial", obj, 4);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("displayName", false);
        pluginGeneratedSerialDescriptor.k("verified", false);
        pluginGeneratedSerialDescriptor.k("verifiedData", false);
        f23580b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{u0Var, u0Var, C2701g.f28450a, C1862n0.f23582a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23580b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        C1866p0 c1866p0 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        while (z11) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                c1866p0 = (C1866p0) c10.n(pluginGeneratedSerialDescriptor, 3, C1862n0.f23582a, c1866p0);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            z10 = c10.q(pluginGeneratedSerialDescriptor, 2);
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
                z11 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1869r0(i10, str, str2, z10, c1866p0);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23580b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1869r0 c1869r0 = (C1869r0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1869r0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23580b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c1869r0.f23605a, pluginGeneratedSerialDescriptor);
        c10.z(1, c1869r0.f23606b, pluginGeneratedSerialDescriptor);
        c10.p(pluginGeneratedSerialDescriptor, 2, c1869r0.f23607c);
        c10.i(pluginGeneratedSerialDescriptor, 3, C1862n0.f23582a, c1869r0.f23608d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

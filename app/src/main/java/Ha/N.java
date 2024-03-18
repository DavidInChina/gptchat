package ha;

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
import wd.C6207u;
import wd.C6209w;

/* loaded from: classes.dex */
public final class N implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final N f32024a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f32025b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, ha.N, java.lang.Object] */
    static {
        ?? obj = new Object();
        f32024a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.metadata.CustomActionFile", obj, 4);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("assetPointer", false);
        pluginGeneratedSerialDescriptor.k("mimeType", false);
        pluginGeneratedSerialDescriptor.k("downloadLink", false);
        f32025b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), C6207u.f48466a, A7.b.U0(u0Var), A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6209w c6209w;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32025b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                        C6207u c6207u = C6207u.f48466a;
                        if (str2 != null) {
                            c6209w = new C6209w(str2);
                        } else {
                            c6209w = null;
                        }
                        C6209w c6209w2 = (C6209w) c10.n(pluginGeneratedSerialDescriptor, 1, c6207u, c6209w);
                        if (c6209w2 != null) {
                            str2 = c6209w2.f48469a;
                        } else {
                            str2 = null;
                        }
                        i10 |= 2;
                    }
                } else {
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new P(i10, str, str2, str3, str4);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f32025b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        P p10 = (P) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", p10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32025b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 0, u0Var, p10.f32026a);
        c10.i(pluginGeneratedSerialDescriptor, 1, C6207u.f48466a, new C6209w(p10.f32027b));
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, p10.f32028c);
        c10.q(pluginGeneratedSerialDescriptor, 3, u0Var, p10.f32029d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

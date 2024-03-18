package O9;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class O implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final O f13483a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13484b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, O9.O] */
    static {
        ?? obj = new Object();
        f13483a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiInvokedPlugin", obj, 4);
        pluginGeneratedSerialDescriptor.k("type", true);
        pluginGeneratedSerialDescriptor.k("namespace", true);
        pluginGeneratedSerialDescriptor.k("pluginId", true);
        pluginGeneratedSerialDescriptor.k("httpResponseStatus", true);
        f13484b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(C2686L.f28406a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13484b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                num = (Integer) c10.v(pluginGeneratedSerialDescriptor, 3, C2686L.f28406a, num);
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
        return new Q(i10, str, str2, str3, num);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13484b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Q q10 = (Q) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", q10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13484b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = q10.f13491a;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, dh.u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = q10.f13492b;
        if (C11 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = q10.f13493c;
        if (C12 || str3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, dh.u0.f28491a, str3);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        Integer num = q10.f13494d;
        if (C13 || num != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, C2686L.f28406a, num);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

package Vb;

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

/* loaded from: classes2.dex */
public final class j implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final j f18517a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f18518b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Vb.j, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f18517a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.serverstatus.impl.api.ServerStatusResponse", obj, 4);
        pluginGeneratedSerialDescriptor.k("status", false);
        pluginGeneratedSerialDescriptor.k("message", false);
        pluginGeneratedSerialDescriptor.k("buttonUrl", false);
        pluginGeneratedSerialDescriptor.k("buttonTitle", false);
        f18518b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = l.f18519e[0];
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{kSerializer, A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18518b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = l.f18519e;
        c cVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str3);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str2);
                            i10 |= 4;
                        }
                    } else {
                        str = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
                        i10 |= 2;
                    }
                } else {
                    cVar = (c) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], cVar);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new l(i10, cVar, str, str2, str3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f18518b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l lVar = (l) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", lVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18518b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, l.f18519e[0], lVar.f18520a);
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, lVar.f18521b);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, lVar.f18522c);
        c10.q(pluginGeneratedSerialDescriptor, 3, u0Var, lVar.f18523d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

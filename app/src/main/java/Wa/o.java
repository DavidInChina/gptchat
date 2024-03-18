package Wa;

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
import wd.M;
import wd.O;

/* loaded from: classes.dex */
public final class o implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final o f20864a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f20865b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Wa.o, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f20864a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.api.GizmoOauthRequest", obj, 4);
        pluginGeneratedSerialDescriptor.k("gizmoId", false);
        pluginGeneratedSerialDescriptor.k("gizmoActionId", false);
        pluginGeneratedSerialDescriptor.k("domain", false);
        pluginGeneratedSerialDescriptor.k("redirectTo", false);
        f20865b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer U02 = A7.b.U0(M.f48360a);
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{U02, A7.b.U0(u0Var), A7.b.U0(u0Var), u0Var};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f20865b;
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
                                str4 = c10.r(pluginGeneratedSerialDescriptor, 3);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
                            i10 |= 4;
                        }
                    } else {
                        str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str2);
                        i10 |= 2;
                    }
                } else {
                    M m10 = M.f48360a;
                    if (str != null) {
                        o10 = new O(str);
                    } else {
                        o10 = null;
                    }
                    O o11 = (O) c10.v(pluginGeneratedSerialDescriptor, 0, m10, o10);
                    if (o11 != null) {
                        str = o11.f48362a;
                    } else {
                        str = null;
                    }
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new q(i10, str, str2, str3, str4);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f20865b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        O o10;
        q qVar = (q) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", qVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f20865b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        M m10 = M.f48360a;
        String str = qVar.f20866a;
        if (str != null) {
            o10 = new O(str);
        } else {
            o10 = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 0, m10, o10);
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, qVar.f20867b);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, qVar.f20868c);
        c10.z(3, qVar.f20869d, pluginGeneratedSerialDescriptor);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

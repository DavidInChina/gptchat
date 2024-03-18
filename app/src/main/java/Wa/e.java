package Wa;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class e implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final e f20844a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f20845b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Wa.e, java.lang.Object] */
    static {
        ?? obj = new Object();
        f20844a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.api.GizmoActionOperationUpdate", obj, 3);
        pluginGeneratedSerialDescriptor.k("gizmoActionId", false);
        pluginGeneratedSerialDescriptor.k("domain", false);
        pluginGeneratedSerialDescriptor.k("actionSettings", false);
        f20845b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = g.f20846d;
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, A7.b.U0(u0Var), kSerializerArr[2]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f20845b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = g.f20846d;
        String str = null;
        boolean z10 = true;
        String str2 = null;
        Map map = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            map = (Map) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], map);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str2);
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
        return new g(i10, str, str2, map);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f20845b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", gVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f20845b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, gVar.f20847a, pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, gVar.f20848b);
        c10.i(pluginGeneratedSerialDescriptor, 2, g.f20846d[2], gVar.f20849c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

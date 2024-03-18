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
public final class k implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final k f20854a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f20855b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Wa.k] */
    static {
        ?? obj = new Object();
        f20854a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.api.GizmoActionSettingsItem", obj, 4);
        pluginGeneratedSerialDescriptor.k("actionId", false);
        pluginGeneratedSerialDescriptor.k("oauthStatus", true);
        pluginGeneratedSerialDescriptor.k("actionSettings", false);
        pluginGeneratedSerialDescriptor.k("operations", false);
        f20855b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = m.f20856e;
        return new KSerializer[]{u0.f28491a, A7.b.U0(kSerializerArr[1]), A7.b.U0(kSerializerArr[2]), A7.b.U0(kSerializerArr[3])};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f20855b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = m.f20856e;
        String str = null;
        a aVar = null;
        Map map = null;
        Map map2 = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                map2 = (Map) c10.v(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], map2);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            map = (Map) c10.v(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], map);
                            i10 |= 4;
                        }
                    } else {
                        aVar = (a) c10.v(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], aVar);
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
        return new m(i10, str, aVar, map, map2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f20855b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m mVar = (m) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", mVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f20855b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, mVar.f20857a, pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = m.f20856e;
        a aVar = mVar.f20858b;
        if (C10 || aVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], aVar);
        }
        c10.q(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], mVar.f20859c);
        c10.q(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], mVar.f20860d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

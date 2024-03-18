package Za;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: Za.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1843e implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1843e f23551a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23552b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Za.e, java.lang.Object] */
    static {
        ?? obj = new Object();
        f23551a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmo.Command", obj, 3);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("description", false);
        pluginGeneratedSerialDescriptor.k("arguments", true);
        f23552b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1847g.f23556d;
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{u0Var, A7.b.U0(u0Var), kSerializerArr[2]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23552b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1847g.f23556d;
        String str = null;
        boolean z10 = true;
        String str2 = null;
        List list = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            list = (List) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str2);
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
        return new C1847g(i10, str, str2, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23552b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1847g c1847g = (C1847g) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1847g);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23552b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c1847g.f23557a, pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, c1847g.f23558b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = c1847g.f23559c;
        if (C10 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 2, C1847g.f23556d[2], list);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

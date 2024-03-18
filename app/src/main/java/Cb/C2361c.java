package cb;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: cb.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2361c implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2361c f26507a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26508b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, cb.c] */
    static {
        ?? obj = new Object();
        f26507a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.Gizmo.GizmoCommand", obj, 3);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("description", false);
        pluginGeneratedSerialDescriptor.k("arguments", true);
        f26508b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C2364e.f26512d;
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, A7.b.U0(u0Var), kSerializerArr[2]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26508b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2364e.f26512d;
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
        return new C2364e(i10, str, str2, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26508b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2364e c2364e = (C2364e) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2364e);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26508b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c2364e.f26513a, pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, c2364e.f26514b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = c2364e.f26515c;
        if (C10 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 2, C2364e.f26512d[2], list);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

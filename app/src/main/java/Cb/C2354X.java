package cb;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: cb.X  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2354X implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2354X f26498a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26499b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, cb.X, java.lang.Object] */
    static {
        ?? obj = new Object();
        f26498a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.GizmoReview", obj, 3);
        pluginGeneratedSerialDescriptor.k("rating", true);
        pluginGeneratedSerialDescriptor.k("message", true);
        pluginGeneratedSerialDescriptor.k("includeFrom", true);
        f26499b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(C2686L.f28406a), A7.b.U0(u0.f28491a), A7.b.U0(C2701g.f28450a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26499b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        Integer num = null;
        boolean z10 = true;
        String str = null;
        Boolean bool = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            bool = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        str = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
                        i10 |= 2;
                    }
                } else {
                    num = (Integer) c10.v(pluginGeneratedSerialDescriptor, 0, C2686L.f28406a, num);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C2356Z(i10, num, str, bool);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26499b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2356Z c2356z = (C2356Z) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2356z);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26499b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Integer num = c2356z.f26500a;
        if (C10 || num != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, C2686L.f28406a, num);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c2356z.f26501b;
        if (C11 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool = c2356z.f26502c;
        if (C12 || !AbstractC3557B.K(bool, Boolean.FALSE)) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

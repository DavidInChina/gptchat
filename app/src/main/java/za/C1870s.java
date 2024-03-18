package Za;

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

/* renamed from: Za.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1870s implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1870s f23609a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23610b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Za.s, java.lang.Object] */
    static {
        ?? obj = new Object();
        f23609a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmoAboutBlock.Category", obj, 4);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("category", false);
        pluginGeneratedSerialDescriptor.k("categoryStr", false);
        pluginGeneratedSerialDescriptor.k("categoryRanking", true);
        f23610b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer U02 = A7.b.U0(C2686L.f28406a);
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{u0Var, u0Var, u0Var, U02};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23610b;
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
                            str3 = c10.r(pluginGeneratedSerialDescriptor, 2);
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
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1874u(i10, str, str2, str3, num);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23610b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1874u c1874u = (C1874u) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1874u);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23610b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c1874u.f23613a, pluginGeneratedSerialDescriptor);
        c10.z(1, c1874u.f23614b, pluginGeneratedSerialDescriptor);
        c10.z(2, c1874u.f23615c, pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Integer num = c1874u.f23616d;
        if (C10 || num != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, C2686L.f28406a, num);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

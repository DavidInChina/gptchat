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

/* loaded from: classes2.dex */
public final class X implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final X f23528a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23529b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Za.X] */
    static {
        ?? obj = new Object();
        f23528a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmoResource", obj, 3);
        pluginGeneratedSerialDescriptor.k("gizmo", false);
        pluginGeneratedSerialDescriptor.k("tools", false);
        pluginGeneratedSerialDescriptor.k("productFeatures", true);
        f23529b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C1841d.f23547a, Z.f23530d[1], A7.b.U0(Rc.m.f15415a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23529b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = Z.f23530d;
        C1863o c1863o = null;
        boolean z10 = true;
        List list = null;
        Rc.o oVar = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            oVar = (Rc.o) c10.v(pluginGeneratedSerialDescriptor, 2, Rc.m.f15415a, oVar);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        list = (List) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                        i10 |= 2;
                    }
                } else {
                    c1863o = (C1863o) c10.n(pluginGeneratedSerialDescriptor, 0, C1841d.f23547a, c1863o);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new Z(i10, c1863o, list, oVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23529b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Z z10 = (Z) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", z10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23529b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        Y y10 = Z.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C1841d.f23547a, z10.f23531a);
        c10.i(pluginGeneratedSerialDescriptor, 1, Z.f23530d[1], z10.f23532b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Rc.o oVar = z10.f23533c;
        if (C10 || oVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, Rc.m.f15415a, oVar);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

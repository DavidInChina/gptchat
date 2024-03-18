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

/* renamed from: Za.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1865p implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1865p f23595a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23596b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Za.p, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f23595a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmoAbout", obj, 4);
        pluginGeneratedSerialDescriptor.k("gizmo", false);
        pluginGeneratedSerialDescriptor.k("tools", true);
        pluginGeneratedSerialDescriptor.k("aboutBlocks", true);
        pluginGeneratedSerialDescriptor.k("reviewStats", true);
        f23596b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = r.f23600e;
        return new KSerializer[]{C1841d.f23547a, kSerializerArr[1], A7.b.U0(kSerializerArr[2]), A7.b.U0(E.f23449a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23596b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = r.f23600e;
        C1863o c1863o = null;
        List list = null;
        List list2 = null;
        G g10 = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                g10 = (G) c10.v(pluginGeneratedSerialDescriptor, 3, E.f23449a, g10);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            list2 = (List) c10.v(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list2);
                            i10 |= 4;
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
        return new r(i10, c1863o, list, list2, g10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23596b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r rVar = (r) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", rVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23596b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C1867q c1867q = r.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C1841d.f23547a, rVar.f23601a);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = r.f23600e;
        List list = rVar.f23602b;
        if (C10 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = rVar.f23603c;
        if (C11 || list2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        G g10 = rVar.f23604d;
        if (C12 || g10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, E.f23449a, g10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

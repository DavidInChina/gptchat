package ud;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import r0.r;

/* loaded from: classes.dex */
public final class e implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final e f46684a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f46685b;

    /* JADX WARN: Type inference failed for: r0v0, types: [ud.e, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f46684a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.syntaxhighlighting.CodeBlockMetadata.Node", obj, 4);
        pluginGeneratedSerialDescriptor.k("value", false);
        pluginGeneratedSerialDescriptor.k("color", true);
        pluginGeneratedSerialDescriptor.k("fontWeight", true);
        pluginGeneratedSerialDescriptor.k("children", false);
        f46685b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u0.f28491a, A7.b.U0(i.f46694a), A7.b.U0(C2686L.f28406a), new C2695d(f46684a, 0)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46685b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        e eVar = f46684a;
        String str = null;
        r rVar = null;
        Integer num = null;
        List list = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                list = (List) c10.n(pluginGeneratedSerialDescriptor, 3, new C2695d(eVar, 0), list);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            num = (Integer) c10.v(pluginGeneratedSerialDescriptor, 2, C2686L.f28406a, num);
                            i10 |= 4;
                        }
                    } else {
                        rVar = (r) c10.v(pluginGeneratedSerialDescriptor, 1, i.f46694a, rVar);
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
        return new g(i10, str, rVar, num, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f46685b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", gVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46685b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, gVar.f46686a, pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        r rVar = gVar.f46687b;
        if (C10 || rVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, i.f46694a, rVar);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        Integer num = gVar.f46688c;
        if (C11 || num != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2686L.f28406a, num);
        }
        c10.i(pluginGeneratedSerialDescriptor, 3, new C2695d(f46684a, 0), gVar.f46689d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

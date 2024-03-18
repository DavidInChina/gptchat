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
public final class E implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final E f23449a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23450b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Za.E, java.lang.Object] */
    static {
        ?? obj = new Object();
        f23449a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmoAboutReviewStats", obj, 4);
        pluginGeneratedSerialDescriptor.k("avg", false);
        pluginGeneratedSerialDescriptor.k("total", false);
        pluginGeneratedSerialDescriptor.k("count", false);
        pluginGeneratedSerialDescriptor.k("byRating", false);
        f23450b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = G.f23457e[3];
        dh.S s10 = dh.S.f28417a;
        return new KSerializer[]{dh.u0.f28491a, s10, s10, kSerializer};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23450b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = G.f23457e;
        String str = null;
        List list = null;
        int i10 = 0;
        long j6 = 0;
        long j10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                list = (List) c10.n(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            j10 = c10.i(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        }
                    } else {
                        j6 = c10.i(pluginGeneratedSerialDescriptor, 1);
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
        return new G(i10, str, j6, j10, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23450b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        G g10 = (G) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", g10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23450b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, g10.f23458a, pluginGeneratedSerialDescriptor);
        c10.B(pluginGeneratedSerialDescriptor, 1, g10.f23459b);
        c10.B(pluginGeneratedSerialDescriptor, 2, g10.f23460c);
        c10.i(pluginGeneratedSerialDescriptor, 3, G.f23457e[3], g10.f23461d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

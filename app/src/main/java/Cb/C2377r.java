package cb;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: cb.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2377r implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2377r f26546a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26547b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, cb.r] */
    static {
        ?? obj = new Object();
        f26546a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.Gizmo.Tool", obj, 3);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("metadata", true);
        f26547b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u0.f28491a, C2379t.f26548d[1], A7.b.U0(C2384y.f26559a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26547b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2379t.f26548d;
        String str = null;
        boolean z10 = true;
        EnumC2333B enumC2333B = null;
        C2332A c2332a = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            c2332a = (C2332A) c10.v(pluginGeneratedSerialDescriptor, 2, C2384y.f26559a, c2332a);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        enumC2333B = (EnumC2333B) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC2333B);
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
        return new C2379t(i10, str, enumC2333B, c2332a);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26547b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2379t c2379t = (C2379t) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2379t);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26547b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c2379t.f26549a, pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 1, C2379t.f26548d[1], c2379t.f26550b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        C2332A c2332a = c2379t.f26551c;
        if (C10 || c2332a != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2384y.f26559a, c2332a);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

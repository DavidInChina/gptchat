package tc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: tc.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5747p implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C5747p f46099a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f46100b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, tc.p, java.lang.Object] */
    static {
        ?? obj = new Object();
        f46099a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.account.AccountStatusResponseAccountInfo", obj, 4);
        pluginGeneratedSerialDescriptor.k("account", false);
        pluginGeneratedSerialDescriptor.k("lastActiveSubscription", false);
        pluginGeneratedSerialDescriptor.k("entitlement", false);
        pluginGeneratedSerialDescriptor.k("features", false);
        f46100b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C5744m.f46090a, C5753v.f46111a, C5750s.f46106a, A7.b.U0(C5749r.f46101e[3])};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46100b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C5749r.f46101e;
        C5746o c5746o = null;
        C5755x c5755x = null;
        C5752u c5752u = null;
        Set set = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                set = (Set) c10.v(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], set);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            c5752u = (C5752u) c10.n(pluginGeneratedSerialDescriptor, 2, C5750s.f46106a, c5752u);
                            i10 |= 4;
                        }
                    } else {
                        c5755x = (C5755x) c10.n(pluginGeneratedSerialDescriptor, 1, C5753v.f46111a, c5755x);
                        i10 |= 2;
                    }
                } else {
                    c5746o = (C5746o) c10.n(pluginGeneratedSerialDescriptor, 0, C5744m.f46090a, c5746o);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C5749r(i10, c5746o, c5755x, c5752u, set);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f46100b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5749r c5749r = (C5749r) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c5749r);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46100b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C5748q c5748q = C5749r.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C5744m.f46090a, c5749r.f46102a);
        c10.i(pluginGeneratedSerialDescriptor, 1, C5753v.f46111a, c5749r.f46103b);
        c10.i(pluginGeneratedSerialDescriptor, 2, C5750s.f46106a, c5749r.f46104c);
        c10.q(pluginGeneratedSerialDescriptor, 3, C5749r.f46101e[3], c5749r.f46105d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

package Za;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: Za.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1854j0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1854j0 f23565a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23566b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Za.j0] */
    static {
        ?? obj = new Object();
        f23565a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmoToolMetadata", obj, 4);
        pluginGeneratedSerialDescriptor.k("actionId", false);
        pluginGeneratedSerialDescriptor.k("domain", false);
        pluginGeneratedSerialDescriptor.k("auth", true);
        pluginGeneratedSerialDescriptor.k("privacyPolicyUrl", true);
        f23566b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{u0Var, A7.b.U0(u0Var), A7.b.U0(C1848g0.f23560a), A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23566b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        C1852i0 c1852i0 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, dh.u0.f28491a, str3);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            c1852i0 = (C1852i0) c10.v(pluginGeneratedSerialDescriptor, 2, C1848g0.f23560a, c1852i0);
                            i10 |= 4;
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
        return new C1858l0(i10, str, str2, c1852i0, str3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23566b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1858l0 c1858l0 = (C1858l0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1858l0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23566b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c1858l0.f23575a, pluginGeneratedSerialDescriptor);
        dh.u0 u0Var = dh.u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, c1858l0.f23576b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        C1852i0 c1852i0 = c1858l0.f23577c;
        if (C10 || c1852i0 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C1848g0.f23560a, c1852i0);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c1858l0.f23578d;
        if (C11 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, u0Var, str);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

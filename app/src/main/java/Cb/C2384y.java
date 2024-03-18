package cb;

import ah.C2004o;
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

/* renamed from: cb.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2384y implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2384y f26559a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26560b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, cb.y, java.lang.Object] */
    static {
        ?? obj = new Object();
        f26559a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.Gizmo.ToolMetadata", obj, 4);
        pluginGeneratedSerialDescriptor.k("actionId", false);
        pluginGeneratedSerialDescriptor.k("domain", false);
        pluginGeneratedSerialDescriptor.k("auth", true);
        pluginGeneratedSerialDescriptor.k("privacyPolicyUrl", true);
        f26560b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, A7.b.U0(u0Var), A7.b.U0(C2380u.f26552a), A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26560b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        C2382w c2382w = null;
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
                                str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str3);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            c2382w = (C2382w) c10.v(pluginGeneratedSerialDescriptor, 2, C2380u.f26552a, c2382w);
                            i10 |= 4;
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
        return new C2332A(i10, str, str2, c2382w, str3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26560b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2332A c2332a = (C2332A) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2332a);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26560b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c2332a.f26424a, pluginGeneratedSerialDescriptor);
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, c2332a.f26425b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        C2382w c2382w = c2332a.f26426c;
        if (C10 || c2382w != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2380u.f26552a, c2382w);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c2332a.f26427d;
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

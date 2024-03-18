package cb;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: cb.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2371l implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2371l f26526a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26527b;

    /* JADX WARN: Type inference failed for: r0v0, types: [cb.l, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f26526a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.Gizmo.SocialDisplay", obj, 5);
        pluginGeneratedSerialDescriptor.k("userName", false);
        pluginGeneratedSerialDescriptor.k("siteName", false);
        pluginGeneratedSerialDescriptor.k("linkTo", false);
        pluginGeneratedSerialDescriptor.k("siteType", false);
        pluginGeneratedSerialDescriptor.k("verified", true);
        f26527b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C2373n.f26528f[3];
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, u0Var, u0Var, kSerializer, C2701g.f28450a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26527b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2373n.f26528f;
        String str = null;
        String str2 = null;
        String str3 = null;
        EnumC2376q enumC2376q = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        while (z11) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    z10 = c10.q(pluginGeneratedSerialDescriptor, 4);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                enumC2376q = (EnumC2376q) c10.n(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], enumC2376q);
                                i10 |= 8;
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
                z11 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C2373n(i10, str, str2, str3, enumC2376q, z10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26527b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2373n c2373n = (C2373n) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2373n);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26527b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c2373n.f26529a, pluginGeneratedSerialDescriptor);
        c10.z(1, c2373n.f26530b, pluginGeneratedSerialDescriptor);
        c10.z(2, c2373n.f26531c, pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 3, C2373n.f26528f[3], c2373n.f26532d);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = c2373n.f26533e;
        if (C10 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 4, z10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

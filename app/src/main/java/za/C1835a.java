package Za;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: Za.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1835a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1835a f23534a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23535b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Za.a, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f23534a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiAuthor", obj, 5);
        pluginGeneratedSerialDescriptor.k("displayName", false);
        pluginGeneratedSerialDescriptor.k("linkTo", false);
        pluginGeneratedSerialDescriptor.k("selectedDisplay", false);
        pluginGeneratedSerialDescriptor.k("willReceiveSupportEmails", false);
        pluginGeneratedSerialDescriptor.k("displayLinks", true);
        f23535b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1839c.f23538f;
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(C2701g.f28450a), kSerializerArr[4]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23535b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1839c.f23538f;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        List list = null;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    list = (List) c10.n(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                bool = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 3, C2701g.f28450a, bool);
                                i10 |= 8;
                            }
                        } else {
                            str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, dh.u0.f28491a, str3);
                            i10 |= 4;
                        }
                    } else {
                        str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str2);
                        i10 |= 2;
                    }
                } else {
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, dh.u0.f28491a, str);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1839c(i10, str, str2, str3, bool, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23535b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1839c c1839c = (C1839c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1839c);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23535b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C1837b c1837b = C1839c.Companion;
        dh.u0 u0Var = dh.u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 0, u0Var, c1839c.f23539a);
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, c1839c.f23540b);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, c1839c.f23541c);
        c10.q(pluginGeneratedSerialDescriptor, 3, C2701g.f28450a, c1839c.f23542d);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = c1839c.f23543e;
        if (C10 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 4, C1839c.f23538f[4], list);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

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

/* renamed from: Za.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1851i implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1851i f23562a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f23563b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Za.i, java.lang.Object] */
    static {
        ?? obj = new Object();
        f23562a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiGizmo.Display", obj, 5);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("description", false);
        pluginGeneratedSerialDescriptor.k("profilePictureUrl", false);
        pluginGeneratedSerialDescriptor.k("promptStarters", true);
        pluginGeneratedSerialDescriptor.k("commands", true);
        f23563b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1855k.f23567f;
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{u0Var, A7.b.U0(u0Var), A7.b.U0(u0Var), kSerializerArr[3], kSerializerArr[4]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23563b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1855k.f23567f;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    list2 = (List) c10.n(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list2);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                list = (List) c10.n(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list);
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
                    str = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1855k(i10, str, str2, str3, list, list2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f23563b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1855k c1855k = (C1855k) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1855k);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f23563b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c1855k.f23568a, pluginGeneratedSerialDescriptor);
        dh.u0 u0Var = dh.u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, c1855k.f23569b);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, c1855k.f23570c);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        kf.v vVar = kf.v.f37483Y;
        KSerializer[] kSerializerArr = C1855k.f23567f;
        List list = c1855k.f23571d;
        if (C10 || !AbstractC3557B.K(list, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = c1855k.f23572e;
        if (C11 || !AbstractC3557B.K(list2, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

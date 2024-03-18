package Sc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6186e0;
import wd.C6190g0;
import wd.EnumC6212z;

/* loaded from: classes.dex */
public final class l implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final l f16530a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f16531b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Sc.l, java.lang.Object] */
    static {
        ?? obj = new Object();
        f16530a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.model.Models.Model", obj, 8);
        pluginGeneratedSerialDescriptor.k("category", false);
        pluginGeneratedSerialDescriptor.k("slug", false);
        pluginGeneratedSerialDescriptor.k("maxTokens", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("description", false);
        pluginGeneratedSerialDescriptor.k("tags", false);
        pluginGeneratedSerialDescriptor.k("enabledTools", true);
        pluginGeneratedSerialDescriptor.k("productFeatures", true);
        f16531b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = n.f16532i;
        KSerializer kSerializer = kSerializerArr[0];
        KSerializer kSerializer2 = kSerializerArr[5];
        KSerializer U02 = A7.b.U0(kSerializerArr[6]);
        KSerializer U03 = A7.b.U0(o.f16541a);
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{kSerializer, C6186e0.f48396a, C2686L.f28406a, u0Var, u0Var, kSerializer2, U02, U03};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6190g0 c6190g0;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f16531b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = n.f16532i;
        boolean z10 = true;
        u uVar = null;
        int i10 = 0;
        EnumC6212z enumC6212z = null;
        String str = null;
        int i11 = 0;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    enumC6212z = (EnumC6212z) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC6212z);
                    i10 |= 1;
                    break;
                case 1:
                    C6186e0 c6186e0 = C6186e0.f48396a;
                    if (str != null) {
                        c6190g0 = new C6190g0(str);
                    } else {
                        c6190g0 = null;
                    }
                    C6190g0 c6190g02 = (C6190g0) c10.n(pluginGeneratedSerialDescriptor, 1, c6186e0, c6190g0);
                    if (c6190g02 != null) {
                        str = c6190g02.f48419a;
                    } else {
                        str = null;
                    }
                    i10 |= 2;
                    break;
                case 2:
                    i11 = c10.m(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    str2 = c10.r(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    str3 = c10.r(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    break;
                case 5:
                    list = (List) c10.n(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list);
                    i10 |= 32;
                    break;
                case 6:
                    list2 = (List) c10.v(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list2);
                    i10 |= 64;
                    break;
                case 7:
                    uVar = (u) c10.v(pluginGeneratedSerialDescriptor, 7, o.f16541a, uVar);
                    i10 |= 128;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new n(i10, enumC6212z, str, i11, str2, str3, list, list2, uVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f16531b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n nVar = (n) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", nVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f16531b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = n.f16532i;
        c10.i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], nVar.f16533a);
        c10.i(pluginGeneratedSerialDescriptor, 1, C6186e0.f48396a, new C6190g0(nVar.f16534b));
        c10.m(2, nVar.f16535c, pluginGeneratedSerialDescriptor);
        c10.z(3, nVar.f16536d, pluginGeneratedSerialDescriptor);
        c10.z(4, nVar.f16537e, pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], nVar.f16538f);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = nVar.f16539g;
        if (C10 || list != null) {
            c10.q(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        u uVar = nVar.f16540h;
        if (C11 || uVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 7, o.f16541a, uVar);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

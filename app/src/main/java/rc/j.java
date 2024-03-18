package Rc;

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

/* loaded from: classes.dex */
public final class j implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final j f15405a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f15406b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Rc.j] */
    static {
        ?? obj = new Object();
        f15405a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.api.ModelsResponseModel", obj, 7);
        pluginGeneratedSerialDescriptor.k("slug", false);
        pluginGeneratedSerialDescriptor.k("maxTokens", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("description", false);
        pluginGeneratedSerialDescriptor.k("tags", false);
        pluginGeneratedSerialDescriptor.k("enabledTools", true);
        pluginGeneratedSerialDescriptor.k("productFeatures", true);
        f15406b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = l.f15407h;
        KSerializer kSerializer = kSerializerArr[4];
        KSerializer U02 = A7.b.U0(kSerializerArr[5]);
        KSerializer U03 = A7.b.U0(m.f15415a);
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{C6186e0.f48396a, C2686L.f28406a, u0Var, u0Var, kSerializer, U02, U03};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6190g0 c6190g0;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15406b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = l.f15407h;
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        o oVar = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    C6186e0 c6186e0 = C6186e0.f48396a;
                    if (str != null) {
                        c6190g0 = new C6190g0(str);
                    } else {
                        c6190g0 = null;
                    }
                    C6190g0 c6190g02 = (C6190g0) c10.n(pluginGeneratedSerialDescriptor, 0, c6186e0, c6190g0);
                    if (c6190g02 != null) {
                        str = c6190g02.f48419a;
                    } else {
                        str = null;
                    }
                    i10 |= 1;
                    break;
                case 1:
                    i11 = c10.m(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    str2 = c10.r(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    str3 = c10.r(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    list = (List) c10.n(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
                    i10 |= 16;
                    break;
                case 5:
                    list2 = (List) c10.v(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list2);
                    i10 |= 32;
                    break;
                case 6:
                    oVar = (o) c10.v(pluginGeneratedSerialDescriptor, 6, m.f15415a, oVar);
                    i10 |= 64;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new l(i10, str, i11, str2, str3, list, list2, oVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f15406b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l lVar = (l) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", lVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15406b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        k kVar = l.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C6186e0.f48396a, new C6190g0(lVar.f15408a));
        c10.m(1, lVar.f15409b, pluginGeneratedSerialDescriptor);
        c10.z(2, lVar.f15410c, pluginGeneratedSerialDescriptor);
        c10.z(3, lVar.f15411d, pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = l.f15407h;
        c10.i(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], lVar.f15412e);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = lVar.f15413f;
        if (C10 || list != null) {
            c10.q(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        o oVar = lVar.f15414g;
        if (C11 || oVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 6, m.f15415a, oVar);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

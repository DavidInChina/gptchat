package Ga;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6166A;
import wd.C6168C;
import wd.C6178a0;
import wd.C6182c0;
import wd.M;
import wd.O;

/* loaded from: classes.dex */
public final class m implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final m f6222a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f6223b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Ga.m, java.lang.Object] */
    static {
        ?? obj = new Object();
        f6222a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.tangled.impl.api.conversation.ConversationListResponseItem", obj, 7);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("currentNode", false);
        pluginGeneratedSerialDescriptor.k("conversationTemplateId", true);
        pluginGeneratedSerialDescriptor.k("createTime", false);
        pluginGeneratedSerialDescriptor.k("updateTime", false);
        pluginGeneratedSerialDescriptor.k("mapping", false);
        f6223b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = o.f6224h;
        KSerializer U02 = A7.b.U0(C6178a0.f48382a);
        KSerializer U03 = A7.b.U0(M.f48360a);
        KSerializer U04 = A7.b.U0(kSerializerArr[6]);
        Zg.g gVar = Zg.g.f23747a;
        return new KSerializer[]{C6166A.f48310a, u0.f28491a, U02, U03, gVar, gVar, U04};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6168C c6168c;
        C6182c0 c6182c0;
        O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f6223b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = o.f6224h;
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Yg.p pVar = null;
        Yg.p pVar2 = null;
        Map map = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    C6166A c6166a = C6166A.f48310a;
                    if (str != null) {
                        c6168c = new C6168C(str);
                    } else {
                        c6168c = null;
                    }
                    C6168C c6168c2 = (C6168C) c10.n(pluginGeneratedSerialDescriptor, 0, c6166a, c6168c);
                    if (c6168c2 != null) {
                        str = c6168c2.f48321a;
                    } else {
                        str = null;
                    }
                    i10 |= 1;
                    break;
                case 1:
                    str2 = c10.r(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    C6178a0 c6178a0 = C6178a0.f48382a;
                    if (str3 != null) {
                        c6182c0 = new C6182c0(str3);
                    } else {
                        c6182c0 = null;
                    }
                    C6182c0 c6182c02 = (C6182c0) c10.v(pluginGeneratedSerialDescriptor, 2, c6178a0, c6182c0);
                    if (c6182c02 != null) {
                        str3 = c6182c02.f48393Y;
                    } else {
                        str3 = null;
                    }
                    i10 |= 4;
                    break;
                case 3:
                    M m10 = M.f48360a;
                    if (str4 != null) {
                        o10 = new O(str4);
                    } else {
                        o10 = null;
                    }
                    O o11 = (O) c10.v(pluginGeneratedSerialDescriptor, 3, m10, o10);
                    if (o11 != null) {
                        str4 = o11.f48362a;
                    } else {
                        str4 = null;
                    }
                    i10 |= 8;
                    break;
                case 4:
                    pVar = (Yg.p) c10.n(pluginGeneratedSerialDescriptor, 4, Zg.g.f23747a, pVar);
                    i10 |= 16;
                    break;
                case 5:
                    pVar2 = (Yg.p) c10.n(pluginGeneratedSerialDescriptor, 5, Zg.g.f23747a, pVar2);
                    i10 |= 32;
                    break;
                case 6:
                    map = (Map) c10.v(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], map);
                    i10 |= 64;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new o(i10, str, str2, str3, str4, pVar, pVar2, map);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f6223b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6182c0 c6182c0;
        o oVar = (o) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", oVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f6223b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        n nVar = o.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C6166A.f48310a, new C6168C(oVar.f6225a));
        c10.z(1, oVar.f6226b, pluginGeneratedSerialDescriptor);
        C6178a0 c6178a0 = C6178a0.f48382a;
        O o10 = null;
        String str = oVar.f6227c;
        if (str != null) {
            c6182c0 = new C6182c0(str);
        } else {
            c6182c0 = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 2, c6178a0, c6182c0);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = oVar.f6228d;
        if (C10 || str2 != null) {
            M m10 = M.f48360a;
            if (str2 != null) {
                o10 = new O(str2);
            }
            c10.q(pluginGeneratedSerialDescriptor, 3, m10, o10);
        }
        Zg.g gVar = Zg.g.f23747a;
        c10.i(pluginGeneratedSerialDescriptor, 4, gVar, oVar.f6229e);
        c10.i(pluginGeneratedSerialDescriptor, 5, gVar, oVar.f6230f);
        c10.q(pluginGeneratedSerialDescriptor, 6, o.f6224h[6], oVar.f6231g);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

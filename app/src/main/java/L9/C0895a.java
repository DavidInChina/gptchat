package L9;

import ad.C1973a;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6178a0;
import wd.C6182c0;

/* renamed from: L9.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0895a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0895a f10901a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10902b;

    /* JADX WARN: Type inference failed for: r0v0, types: [L9.a, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f10901a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ApiSharedConversationResponse", obj, 10);
        pluginGeneratedSerialDescriptor.k("authorName", false);
        pluginGeneratedSerialDescriptor.k("hasUserEditableContext", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("currentNode", false);
        pluginGeneratedSerialDescriptor.k("createTime", false);
        pluginGeneratedSerialDescriptor.k("updateTime", false);
        pluginGeneratedSerialDescriptor.k("mapping", false);
        pluginGeneratedSerialDescriptor.k("moderationResults", true);
        pluginGeneratedSerialDescriptor.k("pluginIds", true);
        pluginGeneratedSerialDescriptor.k("conversationTemplateId", true);
        f10902b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C0897c.f10907k;
        u0 u0Var = u0.f28491a;
        KSerializer U02 = A7.b.U0(u0Var);
        KSerializer U03 = A7.b.U0(C2701g.f28450a);
        KSerializer U04 = A7.b.U0(u0Var);
        KSerializer kSerializer = kSerializerArr[6];
        KSerializer kSerializer2 = kSerializerArr[7];
        KSerializer U05 = A7.b.U0(kSerializerArr[8]);
        KSerializer U06 = A7.b.U0(wd.M.f48360a);
        C1973a c1973a = C1973a.f24152a;
        return new KSerializer[]{U02, U03, U04, C6178a0.f48382a, c1973a, c1973a, kSerializer, kSerializer2, U05, U06};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        boolean z10;
        C6182c0 c6182c0;
        wd.O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10902b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C0897c.f10907k;
        String str = null;
        List list = null;
        boolean z11 = true;
        List list2 = null;
        int i10 = 0;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        String str4 = null;
        Yg.p pVar = null;
        Yg.p pVar2 = null;
        Map map = null;
        while (z11) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z11 = false;
                    continue;
                case 0:
                    z10 = z11;
                    str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str2);
                    i10 |= 1;
                    break;
                case 1:
                    z10 = z11;
                    bool = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 1, C2701g.f28450a, bool);
                    i10 |= 2;
                    break;
                case 2:
                    z10 = z11;
                    str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
                    i10 |= 4;
                    break;
                case 3:
                    z10 = z11;
                    C6178a0 c6178a0 = C6178a0.f48382a;
                    if (str4 != null) {
                        c6182c0 = new C6182c0(str4);
                    } else {
                        c6182c0 = null;
                    }
                    C6182c0 c6182c02 = (C6182c0) c10.n(pluginGeneratedSerialDescriptor, 3, c6178a0, c6182c0);
                    if (c6182c02 != null) {
                        str4 = c6182c02.f48393Y;
                    } else {
                        str4 = null;
                    }
                    i10 |= 8;
                    break;
                case 4:
                    z10 = z11;
                    pVar = (Yg.p) c10.n(pluginGeneratedSerialDescriptor, 4, C1973a.f24152a, pVar);
                    i10 |= 16;
                    break;
                case 5:
                    z10 = z11;
                    pVar2 = (Yg.p) c10.n(pluginGeneratedSerialDescriptor, 5, C1973a.f24152a, pVar2);
                    i10 |= 32;
                    break;
                case 6:
                    z10 = z11;
                    map = (Map) c10.n(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], map);
                    i10 |= 64;
                    break;
                case 7:
                    z10 = z11;
                    list2 = (List) c10.n(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], list2);
                    i10 |= 128;
                    break;
                case 8:
                    z10 = z11;
                    list = (List) c10.v(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list);
                    i10 |= 256;
                    break;
                case 9:
                    wd.M m10 = wd.M.f48360a;
                    z10 = z11;
                    if (str != null) {
                        o10 = new wd.O(str);
                    } else {
                        o10 = null;
                    }
                    wd.O o11 = (wd.O) c10.v(pluginGeneratedSerialDescriptor, 9, m10, o10);
                    if (o11 != null) {
                        str = o11.f48362a;
                    } else {
                        str = null;
                    }
                    i10 |= 512;
                    break;
                default:
                    throw new C2004o(t10);
            }
            z11 = z10;
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C0897c(i10, str2, bool, str3, str4, pVar, pVar2, map, list2, list, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10902b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wd.O o10;
        C0897c c0897c = (C0897c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0897c);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10902b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C0896b c0896b = C0897c.Companion;
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 0, u0Var, c0897c.f10908a);
        c10.q(pluginGeneratedSerialDescriptor, 1, C2701g.f28450a, c0897c.f10909b);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, c0897c.f10910c);
        c10.i(pluginGeneratedSerialDescriptor, 3, C6178a0.f48382a, new C6182c0(c0897c.f10911d));
        C1973a c1973a = C1973a.f24152a;
        c10.i(pluginGeneratedSerialDescriptor, 4, c1973a, c0897c.f10912e);
        c10.i(pluginGeneratedSerialDescriptor, 5, c1973a, c0897c.f10913f);
        KSerializer[] kSerializerArr = C0897c.f10907k;
        c10.i(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], c0897c.f10914g);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = c0897c.f10915h;
        if (C10 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], list);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = c0897c.f10916i;
        if (C11 || list2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c0897c.f10917j;
        if (C12 || str != null) {
            wd.M m10 = wd.M.f48360a;
            if (str != null) {
                o10 = new wd.O(str);
            } else {
                o10 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 9, m10, o10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

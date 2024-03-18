package L9;

import ad.C1973a;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
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

/* renamed from: L9.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0898d implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0898d f10918a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10919b;

    /* JADX WARN: Type inference failed for: r0v0, types: [L9.d, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f10918a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ConversationResponse", obj, 8);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("currentNode", false);
        pluginGeneratedSerialDescriptor.k("createTime", false);
        pluginGeneratedSerialDescriptor.k("updateTime", false);
        pluginGeneratedSerialDescriptor.k("mapping", false);
        pluginGeneratedSerialDescriptor.k("moderationResults", true);
        pluginGeneratedSerialDescriptor.k("pluginIds", true);
        pluginGeneratedSerialDescriptor.k("conversationTemplateId", true);
        f10919b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C0900f.f10923i;
        KSerializer U02 = A7.b.U0(u0.f28491a);
        KSerializer kSerializer = kSerializerArr[4];
        KSerializer kSerializer2 = kSerializerArr[5];
        KSerializer U03 = A7.b.U0(kSerializerArr[6]);
        KSerializer U04 = A7.b.U0(wd.M.f48360a);
        C1973a c1973a = C1973a.f24152a;
        return new KSerializer[]{U02, C6178a0.f48382a, c1973a, c1973a, kSerializer, kSerializer2, U03, U04};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        wd.O o10;
        C6182c0 c6182c0;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10919b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C0900f.f10923i;
        boolean z10 = true;
        String str = null;
        int i10 = 0;
        String str2 = null;
        String str3 = null;
        Yg.p pVar = null;
        Yg.p pVar2 = null;
        Map map = null;
        List list = null;
        List list2 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str2);
                    i10 |= 1;
                    break;
                case 1:
                    C6178a0 c6178a0 = C6178a0.f48382a;
                    if (str3 != null) {
                        c6182c0 = new C6182c0(str3);
                    } else {
                        c6182c0 = null;
                    }
                    C6182c0 c6182c02 = (C6182c0) c10.n(pluginGeneratedSerialDescriptor, 1, c6178a0, c6182c0);
                    if (c6182c02 != null) {
                        str3 = c6182c02.f48393Y;
                    } else {
                        str3 = null;
                    }
                    i10 |= 2;
                    break;
                case 2:
                    pVar = (Yg.p) c10.n(pluginGeneratedSerialDescriptor, 2, C1973a.f24152a, pVar);
                    i10 |= 4;
                    break;
                case 3:
                    pVar2 = (Yg.p) c10.n(pluginGeneratedSerialDescriptor, 3, C1973a.f24152a, pVar2);
                    i10 |= 8;
                    break;
                case 4:
                    map = (Map) c10.n(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], map);
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
                    wd.M m10 = wd.M.f48360a;
                    if (str != null) {
                        o10 = new wd.O(str);
                    } else {
                        o10 = null;
                    }
                    wd.O o11 = (wd.O) c10.v(pluginGeneratedSerialDescriptor, 7, m10, o10);
                    if (o11 != null) {
                        str = o11.f48362a;
                    } else {
                        str = null;
                    }
                    i10 |= 128;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C0900f(i10, str2, str3, pVar, pVar2, map, list, list2, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10919b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wd.O o10;
        C0900f c0900f = (C0900f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0900f);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10919b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C0899e c0899e = C0900f.Companion;
        c10.q(pluginGeneratedSerialDescriptor, 0, u0.f28491a, c0900f.f10924a);
        c10.i(pluginGeneratedSerialDescriptor, 1, C6178a0.f48382a, new C6182c0(c0900f.f10925b));
        C1973a c1973a = C1973a.f24152a;
        c10.i(pluginGeneratedSerialDescriptor, 2, c1973a, c0900f.f10926c);
        c10.i(pluginGeneratedSerialDescriptor, 3, c1973a, c0900f.f10927d);
        KSerializer[] kSerializerArr = C0900f.f10923i;
        c10.i(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], c0900f.f10928e);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = c0900f.f10929f;
        if (C10 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = c0900f.f10930g;
        if (C11 || list2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c0900f.f10931h;
        if (C12 || str != null) {
            wd.M m10 = wd.M.f48360a;
            if (str != null) {
                o10 = new wd.O(str);
            } else {
                o10 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 7, m10, o10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

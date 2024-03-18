package O9;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import eh.C2914n;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: O9.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1103f0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1103f0 f13534a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13535b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, O9.f0] */
    static {
        ?? obj = new Object();
        f13534a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiJitPluginData.FromServer.JitBody", obj, 6);
        pluginGeneratedSerialDescriptor.k("domain", true);
        pluginGeneratedSerialDescriptor.k("privacyPolicy", true);
        pluginGeneratedSerialDescriptor.k("operation", false);
        pluginGeneratedSerialDescriptor.k("params", true);
        pluginGeneratedSerialDescriptor.k("files", true);
        pluginGeneratedSerialDescriptor.k("actions", true);
        f13535b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1136w0.f13614g;
        dh.u0 u0Var = dh.u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(C2914n.f29467a), A7.b.U0(kSerializerArr[4]), kSerializerArr[5]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13535b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1136w0.f13614g;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        kotlinx.serialization.json.b bVar = null;
        List list = null;
        List list2 = null;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, dh.u0.f28491a, str);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str2);
                    i10 |= 2;
                    break;
                case 2:
                    str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, dh.u0.f28491a, str3);
                    i10 |= 4;
                    break;
                case 3:
                    bVar = (kotlinx.serialization.json.b) c10.v(pluginGeneratedSerialDescriptor, 3, C2914n.f29467a, bVar);
                    i10 |= 8;
                    break;
                case 4:
                    list = (List) c10.v(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
                    i10 |= 16;
                    break;
                case 5:
                    list2 = (List) c10.n(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list2);
                    i10 |= 32;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1136w0(i10, str, str2, str3, bVar, list, list2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13535b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1136w0 c1136w0 = (C1136w0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1136w0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13535b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C1134v0 c1134v0 = C1136w0.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c1136w0.f13615a;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, dh.u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c1136w0.f13616b;
        if (C11 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str2);
        }
        c10.q(pluginGeneratedSerialDescriptor, 2, dh.u0.f28491a, c1136w0.f13617c);
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        kotlinx.serialization.json.b bVar = c1136w0.f13618d;
        if (C12 || bVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, C2914n.f29467a, bVar);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1136w0.f13614g;
        List list = c1136w0.f13619e;
        if (C13 || list != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = c1136w0.f13620f;
        if (C14 || !AbstractC3557B.K(list2, Xh.b.l(new C1132u0[0]))) {
            c10.i(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

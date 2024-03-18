package ha;

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

/* renamed from: ha.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3377u implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C3377u f32079a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f32080b;

    /* JADX WARN: Type inference failed for: r0v0, types: [ha.u, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f32079a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.metadata.CustomActionCall", obj, 7);
        pluginGeneratedSerialDescriptor.k("type", true);
        pluginGeneratedSerialDescriptor.k("domain", true);
        pluginGeneratedSerialDescriptor.k("privacyPolicy", true);
        pluginGeneratedSerialDescriptor.k("operation", true);
        pluginGeneratedSerialDescriptor.k("files", true);
        pluginGeneratedSerialDescriptor.k("params", true);
        pluginGeneratedSerialDescriptor.k("actions", true);
        f32080b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = M.f32016h;
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(u0Var), kSerializerArr[4], kSerializerArr[5], kSerializerArr[6]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32080b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = M.f32016h;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        Map map = null;
        List list2 = null;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str2);
                    i10 |= 2;
                    break;
                case 2:
                    str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
                    i10 |= 4;
                    break;
                case 3:
                    str4 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str4);
                    i10 |= 8;
                    break;
                case 4:
                    list = (List) c10.n(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
                    i10 |= 16;
                    break;
                case 5:
                    map = (Map) c10.n(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], map);
                    i10 |= 32;
                    break;
                case 6:
                    list2 = (List) c10.n(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list2);
                    i10 |= 64;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new M(i10, str, str2, str3, str4, list, map, list2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f32080b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        M m10 = (M) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", m10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32080b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        L l10 = M.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = m10.f32017a;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = m10.f32018b;
        if (C11 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = m10.f32019c;
        if (C12 || str3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        String str4 = m10.f32020d;
        if (C13 || str4 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str4);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        kf.v vVar = kf.v.f37483Y;
        KSerializer[] kSerializerArr = M.f32016h;
        List list = m10.f32021e;
        if (C14 || !AbstractC3557B.K(list, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        Map map = m10.f32022f;
        if (C15 || !AbstractC3557B.K(map, kf.w.f37484Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], map);
        }
        boolean C16 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = m10.f32023g;
        if (C16 || !AbstractC3557B.K(list2, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

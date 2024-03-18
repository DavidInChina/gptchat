package Q9;

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

/* loaded from: classes2.dex */
public final class d implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final d f14529a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f14530b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Q9.d] */
    static {
        ?? obj = new Object();
        f14529a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.share.ApiCreateSharedConversationResponse", obj, 6);
        pluginGeneratedSerialDescriptor.k("shareId", false);
        pluginGeneratedSerialDescriptor.k("shareUrl", false);
        pluginGeneratedSerialDescriptor.k("isPublic", false);
        pluginGeneratedSerialDescriptor.k("isVisible", false);
        pluginGeneratedSerialDescriptor.k("currentNodeId", false);
        pluginGeneratedSerialDescriptor.k("alreadyExists", false);
        f14530b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        KSerializer U02 = A7.b.U0(u0Var);
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{u0Var, u0Var, c2701g, c2701g, U02, c2701g};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f14530b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        while (z13) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z13 = false;
                    break;
                case 0:
                    str = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = c10.r(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    z10 = c10.q(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 4, u0.f28491a, str3);
                    i10 |= 16;
                    break;
                case 5:
                    z12 = c10.q(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new f(i10, str, str2, z10, z11, str3, z12);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f14530b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", fVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f14530b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, fVar.f14531a, pluginGeneratedSerialDescriptor);
        c10.z(1, fVar.f14532b, pluginGeneratedSerialDescriptor);
        c10.p(pluginGeneratedSerialDescriptor, 2, fVar.f14533c);
        c10.p(pluginGeneratedSerialDescriptor, 3, fVar.f14534d);
        c10.q(pluginGeneratedSerialDescriptor, 4, u0.f28491a, fVar.f14535e);
        c10.p(pluginGeneratedSerialDescriptor, 5, fVar.f14536f);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

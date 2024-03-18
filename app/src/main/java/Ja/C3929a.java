package ja;

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

/* renamed from: ja.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3929a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C3929a f36090a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f36091b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, ja.a] */
    static {
        ?? obj = new Object();
        f36090a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.user.Contributor", obj, 5);
        pluginGeneratedSerialDescriptor.k("displayName", false);
        pluginGeneratedSerialDescriptor.k("isAnonymous", true);
        pluginGeneratedSerialDescriptor.k("isFromSharedConversation", true);
        pluginGeneratedSerialDescriptor.k("picture", true);
        pluginGeneratedSerialDescriptor.k("isGizmo", true);
        f36091b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        KSerializer U02 = A7.b.U0(u0Var);
        KSerializer U03 = A7.b.U0(u0Var);
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{U02, c2701g, c2701g, U03, c2701g};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f36091b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        while (z13) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    z12 = c10.q(pluginGeneratedSerialDescriptor, 4);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str2);
                                i10 |= 8;
                            }
                        } else {
                            z11 = c10.q(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        }
                    } else {
                        z10 = c10.q(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
                    i10 |= 1;
                }
            } else {
                z13 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C3931c(i10, str, z10, z11, str2, z12);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f36091b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C3931c c3931c = (C3931c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c3931c);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f36091b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 0, u0Var, c3931c.f36092a);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = c3931c.f36093b;
        if (C10 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 1, z10);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z11 = c3931c.f36094c;
        if (C11 || z11) {
            c10.p(pluginGeneratedSerialDescriptor, 2, z11);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c3931c.f36095d;
        if (C12 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, u0Var, str);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z12 = c3931c.f36096e;
        if (C13 || z12) {
            c10.p(pluginGeneratedSerialDescriptor, 4, z12);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

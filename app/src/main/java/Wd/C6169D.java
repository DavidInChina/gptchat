package wd;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: wd.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6169D implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6169D f48323a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f48324b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, wd.D, java.lang.Object] */
    static {
        ?? obj = new Object();
        f48323a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.ConversationMode", obj, 2);
        pluginGeneratedSerialDescriptor.k("kind", false);
        pluginGeneratedSerialDescriptor.k("gizmoId", false);
        f48324b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{dh.u0.f28491a, M.f48360a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48324b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        M m10 = M.f48360a;
                        if (str != null) {
                            o10 = new O(str);
                        } else {
                            o10 = null;
                        }
                        O o11 = (O) c10.n(pluginGeneratedSerialDescriptor, 1, m10, o10);
                        if (o11 != null) {
                            str = o11.f48362a;
                        } else {
                            str = null;
                        }
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    str2 = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C6171F(i10, str2, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48324b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6171F c6171f = (C6171F) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c6171f);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48324b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c6171f.f48332a, pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 1, M.f48360a, new O(c6171f.f48333b));
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

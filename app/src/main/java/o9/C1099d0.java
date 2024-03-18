package O9;

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

/* renamed from: O9.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1099d0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1099d0 f13528a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13529b;

    /* JADX WARN: Type inference failed for: r0v0, types: [O9.d0, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f13528a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiJitPluginData.FromServer", obj, 2);
        pluginGeneratedSerialDescriptor.k("type", true);
        pluginGeneratedSerialDescriptor.k("body", true);
        f13529b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(dh.u0.f28491a), A7.b.U0(C1103f0.f13534a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13529b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z10 = true;
        C1136w0 c1136w0 = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        c1136w0 = (C1136w0) c10.v(pluginGeneratedSerialDescriptor, 1, C1103f0.f13534a, c1136w0);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, dh.u0.f28491a, str);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1138x0(i10, str, c1136w0);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13529b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1138x0 c1138x0 = (C1138x0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1138x0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13529b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c1138x0.f13625a;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, dh.u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        C1136w0 c1136w0 = c1138x0.f13626b;
        if (C11 || c1136w0 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, C1103f0.f13534a, c1136w0);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

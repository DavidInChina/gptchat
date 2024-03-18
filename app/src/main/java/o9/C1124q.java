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

/* renamed from: O9.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1124q implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1124q f13581a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13582b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, O9.q, java.lang.Object] */
    static {
        ?? obj = new Object();
        f13581a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiConversationMessageAuthor", obj, 2);
        pluginGeneratedSerialDescriptor.k("role", false);
        pluginGeneratedSerialDescriptor.k("name", true);
        f13582b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C1127s.f13588c[0], A7.b.U0(dh.u0.f28491a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13582b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1127s.f13588c;
        EnumC1133v enumC1133v = null;
        boolean z10 = true;
        String str = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        str = (String) c10.v(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    enumC1133v = (EnumC1133v) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC1133v);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1127s(i10, enumC1133v, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13582b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1127s c1127s = (C1127s) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1127s);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13582b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C1127s.f13588c[0], c1127s.f13589a);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c1127s.f13590b;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

package O9;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: O9.z0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1142z0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1142z0 f13651a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13652b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, O9.z0, java.lang.Object] */
    static {
        ?? obj = new Object();
        f13651a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiMessageAggregateResult", obj, 2);
        pluginGeneratedSerialDescriptor.k("code", true);
        pluginGeneratedSerialDescriptor.k("messages", true);
        f13652b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(dh.u0.f28491a), A7.b.U0(B0.f13445c[1])};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13652b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = B0.f13445c;
        String str = null;
        boolean z10 = true;
        List list = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        list = (List) c10.v(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
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
        return new B0(i10, str, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13652b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        B0 b02 = (B0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", b02);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13652b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        A0 a02 = B0.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = b02.f13446a;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, dh.u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        List list = b02.f13447b;
        if (C11 || list != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, B0.f13445c[1], list);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

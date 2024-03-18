package O9;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class C0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0 f13450a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13451b;

    /* JADX WARN: Type inference failed for: r0v0, types: [O9.C0, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f13450a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiMessageAggregateResultMessage", obj, 3);
        pluginGeneratedSerialDescriptor.k("imageUrl", true);
        pluginGeneratedSerialDescriptor.k("width", true);
        pluginGeneratedSerialDescriptor.k("height", true);
        f13451b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer U02 = A7.b.U0(dh.u0.f28491a);
        C2686L c2686l = C2686L.f28406a;
        return new KSerializer[]{U02, A7.b.U0(c2686l), A7.b.U0(c2686l)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13451b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z10 = true;
        Integer num = null;
        Integer num2 = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            num2 = (Integer) c10.v(pluginGeneratedSerialDescriptor, 2, C2686L.f28406a, num2);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        num = (Integer) c10.v(pluginGeneratedSerialDescriptor, 1, C2686L.f28406a, num);
                        i10 |= 2;
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
        return new E0(i10, str, num, num2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13451b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        E0 e02 = (E0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", e02);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13451b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = e02.f13453a;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, dh.u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        Integer num = e02.f13454b;
        if (C11 || num != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, C2686L.f28406a, num);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        Integer num2 = e02.f13455c;
        if (C12 || num2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2686L.f28406a, num2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

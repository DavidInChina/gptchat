package ha;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: ha.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3358a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C3358a f32054a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f32055b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, ha.a] */
    static {
        ?? obj = new Object();
        f32054a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.metadata.AggregateResult", obj, 2);
        pluginGeneratedSerialDescriptor.k("code", true);
        pluginGeneratedSerialDescriptor.k("messages", true);
        f32055b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(u0.f28491a), A7.b.U0(C3360c.f32056c[1])};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32055b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C3360c.f32056c;
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
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C3360c(i10, str, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f32055b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C3360c c3360c = (C3360c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c3360c);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32055b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C3359b c3359b = C3360c.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c3360c.f32057a;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        List list = c3360c.f32058b;
        if (C11 || list != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, C3360c.f32056c[1], list);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

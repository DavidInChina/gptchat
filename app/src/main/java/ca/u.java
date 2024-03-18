package Ca;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final class u implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final u f2852a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f2853b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Ca.u] */
    static {
        ?? obj = new Object();
        f2852a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.instructions.api.CustomInstructionsUpdateErrorDetail", obj, 3);
        pluginGeneratedSerialDescriptor.k("description", false);
        pluginGeneratedSerialDescriptor.k("field", true);
        pluginGeneratedSerialDescriptor.k("reason", true);
        f2853b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C.f2809d;
        return new KSerializer[]{u0.f28491a, A7.b.U0(kSerializerArr[1]), A7.b.U0(kSerializerArr[2])};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2853b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C.f2809d;
        String str = null;
        boolean z10 = true;
        y yVar = null;
        B b10 = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            b10 = (B) c10.v(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], b10);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        yVar = (y) c10.v(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], yVar);
                        i10 |= 2;
                    }
                } else {
                    str = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C(i10, str, yVar, b10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f2853b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C c10 = (C) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2853b;
        AbstractC2431b c11 = encoder.c(pluginGeneratedSerialDescriptor);
        c11.z(0, c10.f2810a, pluginGeneratedSerialDescriptor);
        boolean C10 = c11.C(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C.f2809d;
        y yVar = c10.f2811b;
        if (C10 || yVar != null) {
            c11.q(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], yVar);
        }
        boolean C11 = c11.C(pluginGeneratedSerialDescriptor);
        B b10 = c10.f2812c;
        if (C11 || b10 != null) {
            c11.q(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], b10);
        }
        c11.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

package ha;

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

/* renamed from: ha.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3361d implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C3361d f32059a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f32060b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, ha.d] */
    static {
        ?? obj = new Object();
        f32059a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.metadata.Citation", obj, 3);
        pluginGeneratedSerialDescriptor.k("link", false);
        pluginGeneratedSerialDescriptor.k("startToken", true);
        pluginGeneratedSerialDescriptor.k("endToken", true);
        f32060b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer U02 = A7.b.U0(C3363f.f32061d[0]);
        C2686L c2686l = C2686L.f28406a;
        return new KSerializer[]{U02, A7.b.U0(c2686l), A7.b.U0(c2686l)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32060b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C3363f.f32061d;
        AbstractC3371n abstractC3371n = null;
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
                    abstractC3371n = (AbstractC3371n) c10.v(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], abstractC3371n);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C3363f(i10, abstractC3371n, num, num2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f32060b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C3363f c3363f = (C3363f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c3363f);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32060b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 0, C3363f.f32061d[0], c3363f.f32062a);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Integer num = c3363f.f32063b;
        if (C10 || num != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, C2686L.f28406a, num);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        Integer num2 = c3363f.f32064c;
        if (C11 || num2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2686L.f28406a, num2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

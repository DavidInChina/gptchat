package fa;

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

/* loaded from: classes.dex */
public final class o implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final o f30072a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f30073b;

    /* JADX WARN: Type inference failed for: r0v0, types: [fa.o, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f30072a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.message.Content.Multimodal", obj, 2);
        pluginGeneratedSerialDescriptor.k("parts", false);
        pluginGeneratedSerialDescriptor.k("content", true);
        f30073b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = q.f30074d;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f30073b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = q.f30074d;
        List list = null;
        boolean z10 = true;
        List list2 = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        list2 = (List) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list2);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    list = (List) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], list);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new q(i10, list, list2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f30073b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q qVar = (q) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", qVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f30073b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = q.f30074d;
        KSerializer kSerializer = kSerializerArr[0];
        List list = qVar.f30075b;
        c10.i(pluginGeneratedSerialDescriptor, 0, kSerializer, list);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = qVar.f30076c;
        if (C10 || !AbstractC3557B.K(list2, K8.d.n0(list))) {
            c10.i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

package Sc;

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
public final class a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16504a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f16505b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Sc.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        f16504a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.model.AvailableModelsAndCategories", obj, 2);
        pluginGeneratedSerialDescriptor.k("categories", false);
        pluginGeneratedSerialDescriptor.k("defaultModel", false);
        f16505b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{c.f16506c[0], l.f16530a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f16505b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = c.f16506c;
        List list = null;
        boolean z10 = true;
        n nVar = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        nVar = (n) c10.n(pluginGeneratedSerialDescriptor, 1, l.f16530a, nVar);
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
        return new c(i10, list, nVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f16505b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", cVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f16505b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, c.f16506c[0], cVar.f16507a);
        c10.i(pluginGeneratedSerialDescriptor, 1, l.f16530a, cVar.f16508b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

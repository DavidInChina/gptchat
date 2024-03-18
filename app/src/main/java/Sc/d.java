package Sc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class d implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final d f16509a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f16510b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.d, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f16509a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.model.CategoryAndModels", obj, 4);
        pluginGeneratedSerialDescriptor.k("category", false);
        pluginGeneratedSerialDescriptor.k("models", false);
        pluginGeneratedSerialDescriptor.k("defaultModel", false);
        pluginGeneratedSerialDescriptor.k("shouldExpand", false);
        f16510b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h.f16518a, f.f16511e[1], l.f16530a, C2701g.f28450a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f16510b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = f.f16511e;
        j jVar = null;
        List list = null;
        n nVar = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        while (z11) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                z10 = c10.q(pluginGeneratedSerialDescriptor, 3);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            nVar = (n) c10.n(pluginGeneratedSerialDescriptor, 2, l.f16530a, nVar);
                            i10 |= 4;
                        }
                    } else {
                        list = (List) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                        i10 |= 2;
                    }
                } else {
                    jVar = (j) c10.n(pluginGeneratedSerialDescriptor, 0, h.f16518a, jVar);
                    i10 |= 1;
                }
            } else {
                z11 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new f(i10, jVar, list, nVar, z10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f16510b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", fVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f16510b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        e eVar = f.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, h.f16518a, fVar.f16512a);
        c10.i(pluginGeneratedSerialDescriptor, 1, f.f16511e[1], fVar.f16513b);
        c10.i(pluginGeneratedSerialDescriptor, 2, l.f16530a, fVar.f16514c);
        c10.p(pluginGeneratedSerialDescriptor, 3, fVar.f16515d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

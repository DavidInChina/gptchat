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
public final class q implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final q f16548a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f16549b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Sc.q, java.lang.Object] */
    static {
        ?? obj = new Object();
        f16548a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.model.Models.ProductFeatures.Attachments", obj, 3);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("acceptedMimeTypes", true);
        pluginGeneratedSerialDescriptor.k("canAcceptAllMimeTypes", true);
        f16549b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = s.f16550d;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], C2701g.f28450a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f16549b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = s.f16550d;
        p pVar = null;
        boolean z10 = true;
        List list = null;
        int i10 = 0;
        boolean z11 = false;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            z11 = c10.q(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        list = (List) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                        i10 |= 2;
                    }
                } else {
                    pVar = (p) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], pVar);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new s(i10, pVar, list, z11);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f16549b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s sVar = (s) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", sVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f16549b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = s.f16550d;
        c10.i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], sVar.f16551a);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = sVar.f16552b;
        if (C10 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = sVar.f16553c;
        if (C11 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 2, z10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

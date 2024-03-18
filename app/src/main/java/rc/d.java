package Rc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import dh.u0;
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
    public static final d f15387a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f15388b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Rc.d, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f15387a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.api.ModelsResponseAttachments", obj, 4);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("acceptedMimeTypes", true);
        pluginGeneratedSerialDescriptor.k("imageMimeTypes", true);
        pluginGeneratedSerialDescriptor.k("canAcceptAllMimeTypes", true);
        f15388b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = f.f15389e;
        return new KSerializer[]{u0.f28491a, A7.b.U0(kSerializerArr[1]), A7.b.U0(kSerializerArr[2]), C2701g.f28450a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15388b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = f.f15389e;
        String str = null;
        List list = null;
        List list2 = null;
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
                            list2 = (List) c10.v(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list2);
                            i10 |= 4;
                        }
                    } else {
                        list = (List) c10.v(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                        i10 |= 2;
                    }
                } else {
                    str = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z11 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new f(i10, str, list, list2, z10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f15388b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", fVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15388b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, fVar.f15390a, pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = f.f15389e;
        List list = fVar.f15391b;
        if (C10 || list != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = fVar.f15392c;
        if (C11 || list2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = fVar.f15393d;
        if (C12 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 3, z10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

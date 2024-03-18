package cb;

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

/* renamed from: cb.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2358a0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2358a0 f26505a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26506b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, cb.a0] */
    static {
        ?? obj = new Object();
        f26505a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.Gizmos", obj, 2);
        pluginGeneratedSerialDescriptor.k("bootstrap", true);
        pluginGeneratedSerialDescriptor.k("fetched", true);
        f26506b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C2362c0.f26509c;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26506b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2362c0.f26509c;
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
        return new C2362c0(i10, list, list2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26506b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2362c0 c2362c0 = (C2362c0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2362c0);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26506b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C2360b0 c2360b0 = C2362c0.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        kf.v vVar = kf.v.f37483Y;
        KSerializer[] kSerializerArr = C2362c0.f26509c;
        List list = c2362c0.f26510a;
        if (C10 || !AbstractC3557B.K(list, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], list);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = c2362c0.f26511b;
        if (C11 || !AbstractC3557B.K(list2, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

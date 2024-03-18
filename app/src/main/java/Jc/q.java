package Jc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final class q implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final q f9062a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f9063b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Jc.q] */
    static {
        ?? obj = new Object();
        f9062a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.files.api.FileServiceFilesRequest", obj, 3);
        pluginGeneratedSerialDescriptor.k("fileName", false);
        pluginGeneratedSerialDescriptor.k("fileSize", false);
        pluginGeneratedSerialDescriptor.k("useCase", false);
        f9063b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u0.f28491a, A7.b.U0(C2686L.f28406a), s.f9064d[2]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9063b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = s.f9064d;
        String str = null;
        boolean z10 = true;
        Integer num = null;
        E e10 = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            e10 = (E) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], e10);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        num = (Integer) c10.v(pluginGeneratedSerialDescriptor, 1, C2686L.f28406a, num);
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
        return new s(i10, str, num, e10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f9063b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s sVar = (s) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", sVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9063b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, sVar.f9065a, pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 1, C2686L.f28406a, sVar.f9066b);
        c10.i(pluginGeneratedSerialDescriptor, 2, s.f9064d[2], sVar.f9067c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

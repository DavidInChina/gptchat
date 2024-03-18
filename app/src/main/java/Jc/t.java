package Jc;

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
public final class t implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final t f9068a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f9069b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Jc.t] */
    static {
        ?? obj = new Object();
        f9068a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.files.api.FileServiceFilesResponse", obj, 3);
        pluginGeneratedSerialDescriptor.k("status", false);
        pluginGeneratedSerialDescriptor.k("uploadUrl", false);
        pluginGeneratedSerialDescriptor.k("fileId", false);
        f9069b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{v.f9070d[0], u0Var, u0Var};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9069b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = v.f9070d;
        y yVar = null;
        boolean z10 = true;
        String str = null;
        String str2 = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            str2 = c10.r(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        str = c10.r(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    yVar = (y) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], yVar);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new v(i10, yVar, str, str2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f9069b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v vVar = (v) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", vVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9069b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, v.f9070d[0], vVar.f9071a);
        c10.z(1, vVar.f9072b, pluginGeneratedSerialDescriptor);
        c10.z(2, vVar.f9073c, pluginGeneratedSerialDescriptor);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

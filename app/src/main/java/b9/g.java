package B9;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class g implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final g f1999a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f2000b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, B9.g] */
    static {
        ?? obj = new Object();
        f1999a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.assistant.AssistStructureWindow", obj, 2);
        pluginGeneratedSerialDescriptor.k("nodes", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        f2000b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{i.f2001c[0], A7.b.U0(u0.f28491a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2000b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = i.f2001c;
        List list = null;
        boolean z10 = true;
        String str = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        str = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
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
        return new i(i10, str, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f2000b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", iVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2000b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, i.f2001c[0], iVar.f2002a);
        c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, iVar.f2003b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

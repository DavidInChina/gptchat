package tc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: tc.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5741j implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C5741j f46085a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f46086b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, tc.j] */
    static {
        ?? obj = new Object();
        f46085a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.account.AccountStatusResponse", obj, 2);
        pluginGeneratedSerialDescriptor.k("accounts", false);
        pluginGeneratedSerialDescriptor.k("accountOrdering", false);
        f46086b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C5743l.f46087c;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46086b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C5743l.f46087c;
        Map map = null;
        boolean z10 = true;
        List list = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        list = (List) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    map = (Map) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], map);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C5743l(i10, map, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f46086b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5743l c5743l = (C5743l) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c5743l);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46086b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C5743l.f46087c;
        c10.i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], c5743l.f46088a);
        c10.i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], c5743l.f46089b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

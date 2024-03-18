package wd;

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

/* renamed from: wd.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6197k implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6197k f48427a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f48428b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, wd.k] */
    static {
        ?? obj = new Object();
        f48427a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.AccountStatus", obj, 2);
        pluginGeneratedSerialDescriptor.k("accounts", false);
        pluginGeneratedSerialDescriptor.k("accountOrdering", false);
        f48428b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C6200m.f48439c;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48428b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6200m.f48439c;
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
        return new C6200m(i10, map, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48428b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6200m c6200m = (C6200m) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c6200m);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48428b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6200m.f48439c;
        c10.i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], c6200m.f48441a);
        c10.i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], c6200m.f48442b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

package xd;

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
import wd.C6191h;
import wd.C6195j;

/* loaded from: classes.dex */
public final class c implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final c f49806a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f49807b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, xd.c, java.lang.Object] */
    static {
        ?? obj = new Object();
        f49806a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.user.AccountUserState", obj, 2);
        pluginGeneratedSerialDescriptor.k("activeAccountId", false);
        pluginGeneratedSerialDescriptor.k("availableAccountUsers", false);
        f49807b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C6191h.f48420a, e.f49808c[1]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6195j c6195j;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f49807b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = e.f49808c;
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        List list = null;
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
                    C6191h c6191h = C6191h.f48420a;
                    if (str != null) {
                        c6195j = new C6195j(str);
                    } else {
                        c6195j = null;
                    }
                    C6195j c6195j2 = (C6195j) c10.n(pluginGeneratedSerialDescriptor, 0, c6191h, c6195j);
                    if (c6195j2 != null) {
                        str = c6195j2.f48426a;
                    } else {
                        str = null;
                    }
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new e(i10, str, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f49807b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e eVar = (e) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", eVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f49807b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        d dVar = e.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C6191h.f48420a, new C6195j(eVar.f49809a));
        c10.i(pluginGeneratedSerialDescriptor, 1, e.f49808c[1], eVar.f49810b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

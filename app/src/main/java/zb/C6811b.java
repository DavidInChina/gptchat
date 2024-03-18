package zb;

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

/* renamed from: zb.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6811b implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6811b f51812a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f51813b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, zb.b, java.lang.Object] */
    static {
        ?? obj = new Object();
        f51812a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.oauth.api.AipResponse", obj, 1);
        pluginGeneratedSerialDescriptor.k("redirectPath", false);
        f51813b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(u0.f28491a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f51813b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C6813d(i10, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f51813b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6813d c6813d = (C6813d) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c6813d);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f51813b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 0, u0.f28491a, c6813d.f51814a);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

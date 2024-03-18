package kd;

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

/* renamed from: kd.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4237a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C4237a f37295a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f37296b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, kd.a] */
    static {
        ?? obj = new Object();
        f37295a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.platform.websockets.impl.RegisterWebSocketResponse", obj, 2);
        pluginGeneratedSerialDescriptor.k("wssUrl", false);
        pluginGeneratedSerialDescriptor.k("expiresAt", false);
        f37296b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u0.f28491a, Zg.g.f23747a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f37296b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z10 = true;
        Yg.p pVar = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        pVar = (Yg.p) c10.n(pluginGeneratedSerialDescriptor, 1, Zg.g.f23747a, pVar);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
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
        return new C4239c(i10, str, pVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f37296b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C4239c c4239c = (C4239c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c4239c);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f37296b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c4239c.f37297a, pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 1, Zg.g.f23747a, c4239c.f37298b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

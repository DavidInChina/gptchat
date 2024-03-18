package tc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: tc.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5753v implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C5753v f46111a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f46112b;

    /* JADX WARN: Type inference failed for: r0v0, types: [tc.v, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f46111a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.account.AccountStatusResponseSubscription", obj, 2);
        pluginGeneratedSerialDescriptor.k("purchaseOriginPlatform", false);
        pluginGeneratedSerialDescriptor.k("willRenew", false);
        f46112b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u0.f28491a, C2701g.f28450a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46112b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        z11 = c10.q(pluginGeneratedSerialDescriptor, 1);
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
        return new C5755x(i10, str, z11);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f46112b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5755x c5755x = (C5755x) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c5755x);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46112b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c5755x.f46113a, pluginGeneratedSerialDescriptor);
        c10.p(pluginGeneratedSerialDescriptor, 1, c5755x.f46114b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

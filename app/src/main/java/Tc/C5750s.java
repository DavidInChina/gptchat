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

/* renamed from: tc.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5750s implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C5750s f46106a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f46107b;

    /* JADX WARN: Type inference failed for: r0v0, types: [tc.s, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f46106a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.account.AccountStatusResponseEntitlement", obj, 3);
        pluginGeneratedSerialDescriptor.k("hasActiveSubscription", false);
        pluginGeneratedSerialDescriptor.k("subscriptionPlan", false);
        pluginGeneratedSerialDescriptor.k("expiresAt", false);
        f46107b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C2701g.f28450a, u0.f28491a, A7.b.U0(Zg.g.f23747a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46107b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z10 = true;
        Yg.p pVar = null;
        int i10 = 0;
        boolean z11 = false;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            pVar = (Yg.p) c10.v(pluginGeneratedSerialDescriptor, 2, Zg.g.f23747a, pVar);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        str = c10.r(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C5752u(i10, z11, str, pVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f46107b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5752u c5752u = (C5752u) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c5752u);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46107b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.p(pluginGeneratedSerialDescriptor, 0, c5752u.f46108a);
        c10.z(1, c5752u.f46109b, pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 2, Zg.g.f23747a, c5752u.f46110c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

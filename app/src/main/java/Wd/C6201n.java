package wd;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: wd.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6201n implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6201n f48444a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f48445b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, wd.n] */
    static {
        ?? obj = new Object();
        f48444a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.AccountUser", obj, 2);
        pluginGeneratedSerialDescriptor.k("account", false);
        pluginGeneratedSerialDescriptor.k("user", false);
        f48445b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(C6177a.f48380a), I0.f48347a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48445b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        C6189g c6189g = null;
        boolean z10 = true;
        K0 k02 = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        k02 = (K0) c10.n(pluginGeneratedSerialDescriptor, 1, I0.f48347a, k02);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    c6189g = (C6189g) c10.v(pluginGeneratedSerialDescriptor, 0, C6177a.f48380a, c6189g);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C6205s(i10, c6189g, k02);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48445b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6205s c6205s = (C6205s) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c6205s);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48445b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C6202o c6202o = C6205s.Companion;
        c10.q(pluginGeneratedSerialDescriptor, 0, C6177a.f48380a, c6205s.f48457a);
        c10.i(pluginGeneratedSerialDescriptor, 1, I0.f48347a, c6205s.f48458b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

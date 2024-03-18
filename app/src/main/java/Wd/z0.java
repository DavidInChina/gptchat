package wd;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class z0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final z0 f48480a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f48481b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, wd.z0] */
    static {
        ?? obj = new Object();
        f48480a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.Subscription", obj, 5);
        pluginGeneratedSerialDescriptor.k("plan", false);
        pluginGeneratedSerialDescriptor.k("purchaseOrigin", false);
        pluginGeneratedSerialDescriptor.k("expirationDate", false);
        pluginGeneratedSerialDescriptor.k("willRenew", false);
        pluginGeneratedSerialDescriptor.k("isActive", false);
        f48481b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = B0.f48312f;
        KSerializer kSerializer = kSerializerArr[0];
        KSerializer kSerializer2 = kSerializerArr[1];
        KSerializer U02 = A7.b.U0(Zg.g.f23747a);
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{kSerializer, kSerializer2, U02, c2701g, c2701g};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48481b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = B0.f48312f;
        E0 e02 = null;
        H0 h02 = null;
        Yg.p pVar = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = true;
        while (z12) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    z11 = c10.q(pluginGeneratedSerialDescriptor, 4);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                z10 = c10.q(pluginGeneratedSerialDescriptor, 3);
                                i10 |= 8;
                            }
                        } else {
                            pVar = (Yg.p) c10.v(pluginGeneratedSerialDescriptor, 2, Zg.g.f23747a, pVar);
                            i10 |= 4;
                        }
                    } else {
                        h02 = (H0) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], h02);
                        i10 |= 2;
                    }
                } else {
                    e02 = (E0) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], e02);
                    i10 |= 1;
                }
            } else {
                z12 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new B0(i10, e02, h02, pVar, z10, z11);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48481b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        B0 b02 = (B0) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", b02);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f48481b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = B0.f48312f;
        c10.i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], b02.f48316a);
        c10.i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], b02.f48317b);
        c10.q(pluginGeneratedSerialDescriptor, 2, Zg.g.f23747a, b02.f48318c);
        c10.p(pluginGeneratedSerialDescriptor, 3, b02.f48319d);
        c10.p(pluginGeneratedSerialDescriptor, 4, b02.f48320e);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

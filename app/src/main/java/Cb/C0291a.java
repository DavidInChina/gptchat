package Cb;

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

/* renamed from: Cb.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0291a f2926a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f2927b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Cb.a] */
    static {
        ?? obj = new Object();
        f2926a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.AccountInfo", obj, 4);
        pluginGeneratedSerialDescriptor.k("firstName", false);
        pluginGeneratedSerialDescriptor.k("lastName", false);
        pluginGeneratedSerialDescriptor.k("phoneNumber", false);
        pluginGeneratedSerialDescriptor.k("country", false);
        f2927b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, u0Var, A7.b.U0(u0Var), Fb.d.f5143a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2927b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        Fb.f fVar = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                fVar = (Fb.f) c10.n(pluginGeneratedSerialDescriptor, 3, Fb.d.f5143a, fVar);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
                            i10 |= 4;
                        }
                    } else {
                        str2 = c10.r(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
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
        return new C0293c(i10, str, str2, str3, fVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f2927b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0293c c0293c = (C0293c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0293c);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2927b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, c0293c.f2931a, pluginGeneratedSerialDescriptor);
        c10.z(1, c0293c.f2932b, pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0.f28491a, c0293c.f2933c);
        c10.i(pluginGeneratedSerialDescriptor, 3, Fb.d.f5143a, c0293c.f2934d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

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

/* loaded from: classes.dex */
public final class W implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final W f2916a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f2917b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Cb.W, java.lang.Object] */
    static {
        ?? obj = new Object();
        f2916a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.OnboardingState", obj, 7);
        pluginGeneratedSerialDescriptor.k("stage", false);
        pluginGeneratedSerialDescriptor.k("email", true);
        pluginGeneratedSerialDescriptor.k("accountInfo", true);
        pluginGeneratedSerialDescriptor.k("arkoseToken", true);
        pluginGeneratedSerialDescriptor.k("phoneVerificationId", true);
        pluginGeneratedSerialDescriptor.k("againstTermsOfServiceSignUpTimestamp", true);
        pluginGeneratedSerialDescriptor.k("config", true);
        f2917b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{Y.f2918h[0], A7.b.U0(u0.f28491a), A7.b.U0(C0291a.f2926a), A7.b.U0(C0306p.f2957a), A7.b.U0(b0.f2929a), A7.b.U0(Zg.g.f23747a), A7.b.U0(D.f2866a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        r rVar;
        d0 d0Var;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2917b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = Y.f2918h;
        boolean z10 = true;
        int i10 = 0;
        g0 g0Var = null;
        String str = null;
        C0293c c0293c = null;
        String str2 = null;
        String str3 = null;
        Yg.p pVar = null;
        F f6 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    g0Var = (g0) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], g0Var);
                    i10 |= 1;
                    break;
                case 1:
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
                    i10 |= 2;
                    break;
                case 2:
                    c0293c = (C0293c) c10.v(pluginGeneratedSerialDescriptor, 2, C0291a.f2926a, c0293c);
                    i10 |= 4;
                    break;
                case 3:
                    C0306p c0306p = C0306p.f2957a;
                    if (str2 != null) {
                        rVar = new r(str2);
                    } else {
                        rVar = null;
                    }
                    r rVar2 = (r) c10.v(pluginGeneratedSerialDescriptor, 3, c0306p, rVar);
                    if (rVar2 != null) {
                        str2 = rVar2.f2959a;
                    } else {
                        str2 = null;
                    }
                    i10 |= 8;
                    break;
                case 4:
                    b0 b0Var = b0.f2929a;
                    if (str3 != null) {
                        d0Var = new d0(str3);
                    } else {
                        d0Var = null;
                    }
                    d0 d0Var2 = (d0) c10.v(pluginGeneratedSerialDescriptor, 4, b0Var, d0Var);
                    if (d0Var2 != null) {
                        str3 = d0Var2.f2936a;
                    } else {
                        str3 = null;
                    }
                    i10 |= 16;
                    break;
                case 5:
                    pVar = (Yg.p) c10.v(pluginGeneratedSerialDescriptor, 5, Zg.g.f23747a, pVar);
                    i10 |= 32;
                    break;
                case 6:
                    f6 = (F) c10.v(pluginGeneratedSerialDescriptor, 6, D.f2866a, f6);
                    i10 |= 64;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new Y(i10, g0Var, str, c0293c, str2, str3, pVar, f6);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f2917b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r rVar;
        Y y10 = (Y) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", y10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2917b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, Y.f2918h[0], y10.f2919a);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = y10.f2920b;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        C0293c c0293c = y10.f2921c;
        if (C11 || c0293c != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C0291a.f2926a, c0293c);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        d0 d0Var = null;
        String str2 = y10.f2922d;
        if (C12 || str2 != null) {
            C0306p c0306p = C0306p.f2957a;
            if (str2 != null) {
                rVar = new r(str2);
            } else {
                rVar = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 3, c0306p, rVar);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = y10.f2923e;
        if (C13 || str3 != null) {
            b0 b0Var = b0.f2929a;
            if (str3 != null) {
                d0Var = new d0(str3);
            }
            c10.q(pluginGeneratedSerialDescriptor, 4, b0Var, d0Var);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        Yg.p pVar = y10.f2924f;
        if (C14 || pVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 5, Zg.g.f23747a, pVar);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        F f6 = y10.f2925g;
        if (C15 || f6 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 6, D.f2866a, f6);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

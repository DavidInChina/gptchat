package Cb;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class D implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final D f2866a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f2867b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Cb.D] */
    static {
        ?? obj = new Object();
        f2866a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.OnboardingConfig", obj, 6);
        pluginGeneratedSerialDescriptor.k("phoneVerificationRequired", true);
        pluginGeneratedSerialDescriptor.k("arkoseRequired", true);
        pluginGeneratedSerialDescriptor.k("arkosePayload", true);
        pluginGeneratedSerialDescriptor.k("defaultCountry", true);
        pluginGeneratedSerialDescriptor.k("maxBirthDate", true);
        pluginGeneratedSerialDescriptor.k("countries", true);
        f2867b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = F.f2868g;
        u0 u0Var = u0.f28491a;
        KSerializer U02 = A7.b.U0(u0Var);
        KSerializer kSerializer = kSerializerArr[5];
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{c2701g, c2701g, U02, u0Var, Zg.h.f23749a, kSerializer};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2867b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = F.f2868g;
        String str = null;
        String str2 = null;
        Yg.r rVar = null;
        List list = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = true;
        while (z12) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z12 = false;
                    break;
                case 0:
                    z10 = c10.q(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str);
                    i10 |= 4;
                    break;
                case 3:
                    str2 = c10.r(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    rVar = (Yg.r) c10.n(pluginGeneratedSerialDescriptor, 4, Zg.h.f23749a, rVar);
                    i10 |= 16;
                    break;
                case 5:
                    list = (List) c10.n(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list);
                    i10 |= 32;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new F(i10, z10, z11, str, str2, rVar, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f2867b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (id.AbstractC3557B.K(r2, r1) == false) goto L18;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        F f6 = (F) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", f6);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2867b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        E e10 = F.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = f6.f2870a;
        if (C10 || !z10) {
            c10.p(pluginGeneratedSerialDescriptor, 0, z10);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z11 = f6.f2871b;
        if (C11 || !z11) {
            c10.p(pluginGeneratedSerialDescriptor, 1, z11);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str = f6.f2872c;
        if (C12 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = f6.f2873d;
        if (!C13) {
            String country = Locale.getDefault().getCountry();
            AbstractC3557B.b0("getCountry(...)", country);
        }
        c10.z(3, str2, pluginGeneratedSerialDescriptor);
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        Yg.r rVar = f6.f2874e;
        if (C14 || !AbstractC3557B.K(rVar, Bi.c.J0())) {
            c10.i(pluginGeneratedSerialDescriptor, 4, Zg.h.f23749a, rVar);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        List list = f6.f2875f;
        if (C15 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 5, F.f2868g[5], list);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

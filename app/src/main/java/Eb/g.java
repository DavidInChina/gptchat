package Eb;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final class g implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final g f4589a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f4590b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Eb.g, java.lang.Object] */
    static {
        ?? obj = new Object();
        f4589a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.api.model.request.PhoneSendVerifyRequest", obj, 6);
        pluginGeneratedSerialDescriptor.k("phoneNumber", false);
        pluginGeneratedSerialDescriptor.k("channel", true);
        pluginGeneratedSerialDescriptor.k("countryIso", false);
        pluginGeneratedSerialDescriptor.k("arkoseToken", false);
        pluginGeneratedSerialDescriptor.k(ParameterNames.VERSION, true);
        pluginGeneratedSerialDescriptor.k("isMobile", true);
        f4590b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, u0Var, u0Var, A7.b.U0(u0Var), C2686L.f28406a, C2701g.f28450a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f4590b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        while (z11) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    str = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = c10.r(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    str3 = c10.r(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    str4 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str4);
                    i10 |= 8;
                    break;
                case 4:
                    i11 = c10.m(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    break;
                case 5:
                    z10 = c10.q(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new i(i10, str, i11, str2, z10, str3, str4);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f4590b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", iVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f4590b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, iVar.f4591a, pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = iVar.f4592b;
        if (C10 || !AbstractC3557B.K(str, "sms")) {
            c10.z(1, str, pluginGeneratedSerialDescriptor);
        }
        c10.z(2, iVar.f4593c, pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 3, u0.f28491a, iVar.f4594d);
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        int i10 = iVar.f4595e;
        if (C11 || i10 != 1) {
            c10.m(4, i10, pluginGeneratedSerialDescriptor);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = iVar.f4596f;
        if (C12 || !z10) {
            c10.p(pluginGeneratedSerialDescriptor, 5, z10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

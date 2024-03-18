package Fb;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
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

/* loaded from: classes.dex */
public final class t implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final t f5174a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5175b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Fb.t, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5174a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.api.model.response.PhoneSendVerifyResponse", obj, 3);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("status", true);
        pluginGeneratedSerialDescriptor.k("hasAccount", true);
        f5175b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u0.f28491a, y.f5180d[1], A7.b.U0(C2701g.f28450a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5175b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = y.f5180d;
        String str = null;
        boolean z10 = true;
        x xVar = null;
        Boolean bool = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            bool = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        xVar = (x) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], xVar);
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
        return new y(i10, str, xVar, bool);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f5175b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y yVar = (y) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", yVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5175b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, yVar.f5181a, pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        x xVar = yVar.f5182b;
        if (C10 || xVar != x.f5178Z) {
            c10.i(pluginGeneratedSerialDescriptor, 1, y.f5180d[1], xVar);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool = yVar.f5183c;
        if (C11 || !AbstractC3557B.K(bool, Boolean.FALSE)) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

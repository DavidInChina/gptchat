package Fb;

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
public final class m implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final m f5161a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5162b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Fb.m] */
    static {
        ?? obj = new Object();
        f5161a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.api.model.response.OpenAIApiError", obj, 2);
        pluginGeneratedSerialDescriptor.k("error", false);
        pluginGeneratedSerialDescriptor.k("displayMessage", true);
        f5162b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{p.f5166a, u0.f28491a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5162b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        r rVar = null;
        boolean z10 = true;
        String str = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        str = c10.r(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    rVar = (r) c10.n(pluginGeneratedSerialDescriptor, 0, p.f5166a, rVar);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new s(i10, rVar, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f5162b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s sVar = (s) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", sVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5162b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        o oVar = s.Companion;
        p pVar = p.f5166a;
        r rVar = sVar.f5172Y;
        c10.i(pluginGeneratedSerialDescriptor, 0, pVar, rVar);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = sVar.f5173Z;
        if (C10 || !AbstractC3557B.K(str, rVar.f5168a)) {
            c10.z(1, str, pluginGeneratedSerialDescriptor);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

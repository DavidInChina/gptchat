package E9;

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

/* loaded from: classes2.dex */
public final class m implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final m f4562a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f4563b;

    /* JADX WARN: Type inference failed for: r0v0, types: [E9.m, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f4562a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.compliance.impl.api.TermsOfUseDisplayResponse", obj, 3);
        pluginGeneratedSerialDescriptor.k("messageMarkdown", false);
        pluginGeneratedSerialDescriptor.k("acceptCtaText", false);
        pluginGeneratedSerialDescriptor.k("secondaryCta", true);
        f4563b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(s.f4571a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f4563b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z10 = true;
        String str2 = null;
        u uVar = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            uVar = (u) c10.v(pluginGeneratedSerialDescriptor, 2, s.f4571a, uVar);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str2);
                        i10 |= 2;
                    }
                } else {
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new o(i10, str, str2, uVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f4563b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o oVar = (o) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", oVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f4563b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 0, u0Var, oVar.f4564a);
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, oVar.f4565b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        u uVar = oVar.f4566c;
        if (C10 || uVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, s.f4571a, uVar);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

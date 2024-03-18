package Rb;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class D implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final D f15259a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f15260b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Rb.D, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f15259a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.reporting.ReportContentReasonsResponse", obj, 3);
        pluginGeneratedSerialDescriptor.k("header", false);
        pluginGeneratedSerialDescriptor.k("headerExplanation", false);
        pluginGeneratedSerialDescriptor.k("reasons", false);
        f15260b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = F.f15261d[2];
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, u0Var, kSerializer};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15260b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = F.f15261d;
        String str = null;
        boolean z10 = true;
        String str2 = null;
        List list = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            list = (List) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
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
        return new F(i10, str, str2, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f15260b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        F f6 = (F) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", f6);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15260b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, f6.f15262a, pluginGeneratedSerialDescriptor);
        c10.z(1, f6.f15263b, pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 2, F.f15261d[2], f6.f15264c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

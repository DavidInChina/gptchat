package Rb;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
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
public final class J implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final J f15272a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f15273b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Rb.J] */
    static {
        ?? obj = new Object();
        f15272a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.reporting.ReportContentSentReason", obj, 2);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("details", false);
        f15273b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15273b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        boolean z10 = true;
        String str2 = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str2);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
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
        return new L(i10, str, str2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f15273b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        L l10 = (L) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", l10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15273b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, l10.f15274a, pluginGeneratedSerialDescriptor);
        c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, l10.f15275b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

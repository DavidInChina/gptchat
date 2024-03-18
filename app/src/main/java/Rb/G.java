package Rb;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class G implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final G f15265a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f15266b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Rb.G] */
    static {
        ?? obj = new Object();
        f15265a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.reporting.ReportContentRequest", obj, 4);
        pluginGeneratedSerialDescriptor.k("reason", false);
        pluginGeneratedSerialDescriptor.k("entityType", false);
        pluginGeneratedSerialDescriptor.k("entityId", false);
        pluginGeneratedSerialDescriptor.k("additionalFieldsValues", true);
        f15266b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = I.f15267e;
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{J.f15272a, A7.b.U0(u0Var), A7.b.U0(u0Var), kSerializerArr[3]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15266b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = I.f15267e;
        L l10 = null;
        String str = null;
        String str2 = null;
        Map map = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                map = (Map) c10.n(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], map);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str2);
                            i10 |= 4;
                        }
                    } else {
                        str = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
                        i10 |= 2;
                    }
                } else {
                    l10 = (L) c10.n(pluginGeneratedSerialDescriptor, 0, J.f15272a, l10);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new I(i10, l10, str, str2, map);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f15266b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        I i10 = (I) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", i10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15266b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        H h10 = I.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, J.f15272a, i10.f15268a);
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, i10.f15269b);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, i10.f15270c);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Map map = i10.f15271d;
        if (C10 || !AbstractC3557B.K(map, kf.w.f37484Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 3, I.f15267e[3], map);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

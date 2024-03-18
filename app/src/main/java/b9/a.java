package B9;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1988a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f1989b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, B9.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        f1988a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.assistant.AssistStructureNode", obj, 5);
        pluginGeneratedSerialDescriptor.k("className", false);
        pluginGeneratedSerialDescriptor.k(ParameterNames.TEXT, false);
        pluginGeneratedSerialDescriptor.k("contentDesc", false);
        pluginGeneratedSerialDescriptor.k("top", true);
        pluginGeneratedSerialDescriptor.k("left", true);
        f1989b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        KSerializer U02 = A7.b.U0(u0Var);
        KSerializer U03 = A7.b.U0(u0Var);
        KSerializer U04 = A7.b.U0(u0Var);
        C2686L c2686l = C2686L.f28406a;
        return new KSerializer[]{U02, U03, U04, c2686l, c2686l};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1989b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    i12 = c10.m(pluginGeneratedSerialDescriptor, 4);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                i11 = c10.m(pluginGeneratedSerialDescriptor, 3);
                                i10 |= 8;
                            }
                        } else {
                            str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
                            i10 |= 4;
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
        return new c(i10, str, str2, str3, i11, i12);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f1989b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", cVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1989b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 0, u0Var, cVar.f1990a);
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, cVar.f1991b);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, cVar.f1992c);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        int i10 = cVar.f1993d;
        if (C10 || i10 != 0) {
            c10.m(3, i10, pluginGeneratedSerialDescriptor);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        int i11 = cVar.f1994e;
        if (C11 || i11 != 0) {
            c10.m(4, i11, pluginGeneratedSerialDescriptor);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

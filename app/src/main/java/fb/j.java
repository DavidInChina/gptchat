package Fb;

import ah.C2004o;
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
public final class j implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final j f5154a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5155b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Fb.j, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5154a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.api.model.response.OnboardLoginResponse", obj, 5);
        pluginGeneratedSerialDescriptor.k("phoneException", true);
        pluginGeneratedSerialDescriptor.k("ipCountry", true);
        pluginGeneratedSerialDescriptor.k("arkoseEnabled", true);
        pluginGeneratedSerialDescriptor.k("arkoseDataPayload", true);
        pluginGeneratedSerialDescriptor.k("maxBirthDateUtc", true);
        f5155b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        C2701g c2701g = C2701g.f28450a;
        KSerializer U02 = A7.b.U0(c2701g);
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{U02, A7.b.U0(u0Var), A7.b.U0(c2701g), A7.b.U0(u0Var), A7.b.U0(Zg.g.f23747a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5155b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        int i10 = 0;
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        String str2 = null;
        Yg.p pVar = null;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    pVar = (Yg.p) c10.v(pluginGeneratedSerialDescriptor, 4, Zg.g.f23747a, pVar);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str2);
                                i10 |= 8;
                            }
                        } else {
                            bool2 = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool2);
                            i10 |= 4;
                        }
                    } else {
                        str = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
                        i10 |= 2;
                    }
                } else {
                    bool = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 0, C2701g.f28450a, bool);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new l(i10, bool, str, bool2, str2, pVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f5155b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l lVar = (l) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", lVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f5155b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool = lVar.f5156a;
        if (C10 || bool != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, C2701g.f28450a, bool);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str = lVar.f5157b;
        if (C11 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool2 = lVar.f5158c;
        if (C12 || bool2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool2);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = lVar.f5159d;
        if (C13 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str2);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        Yg.p pVar = lVar.f5160e;
        if (C14 || pVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, Zg.g.f23747a, pVar);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

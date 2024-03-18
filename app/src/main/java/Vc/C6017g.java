package vc;

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

/* renamed from: vc.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6017g implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6017g f47448a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f47449b;

    /* JADX WARN: Type inference failed for: r0v0, types: [vc.g, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f47448a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.settings.ApiUserSettingsSettings", obj, 5);
        pluginGeneratedSerialDescriptor.k("sunshine", true);
        pluginGeneratedSerialDescriptor.k("training_allowed", true);
        pluginGeneratedSerialDescriptor.k("voice_training_allowed", true);
        pluginGeneratedSerialDescriptor.k("voice_name", true);
        pluginGeneratedSerialDescriptor.k("voice_main_language", true);
        f47449b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        C2701g c2701g = C2701g.f28450a;
        KSerializer U02 = A7.b.U0(c2701g);
        KSerializer U03 = A7.b.U0(c2701g);
        KSerializer U04 = A7.b.U0(c2701g);
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{U02, U03, U04, A7.b.U0(u0Var), A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f47449b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        int i10 = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        String str2 = null;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 4, u0.f28491a, str2);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                str = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str);
                                i10 |= 8;
                            }
                        } else {
                            bool3 = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool3);
                            i10 |= 4;
                        }
                    } else {
                        bool2 = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 1, C2701g.f28450a, bool2);
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
        return new C6019i(i10, bool, bool2, bool3, str, str2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f47449b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6019i c6019i = (C6019i) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c6019i);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f47449b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool = c6019i.f47450a;
        if (C10 || bool != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, C2701g.f28450a, bool);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool2 = c6019i.f47451b;
        if (C11 || bool2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, C2701g.f28450a, bool2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool3 = c6019i.f47452c;
        if (C12 || bool3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool3);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c6019i.f47453d;
        if (C13 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c6019i.f47454e;
        if (C14 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, u0.f28491a, str2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

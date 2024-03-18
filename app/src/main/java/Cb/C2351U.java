package cb;

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

/* renamed from: cb.U  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2351U implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2351U f26491a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26492b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, cb.U, java.lang.Object] */
    static {
        ?? obj = new Object();
        f26491a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.GizmoCategoryInfo", obj, 5);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, true);
        pluginGeneratedSerialDescriptor.k("title", true);
        pluginGeneratedSerialDescriptor.k("description", true);
        pluginGeneratedSerialDescriptor.k("isFeatured", true);
        pluginGeneratedSerialDescriptor.k("isRanked", true);
        f26492b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        KSerializer U02 = A7.b.U0(u0Var);
        KSerializer U03 = A7.b.U0(u0Var);
        KSerializer U04 = A7.b.U0(u0Var);
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{U02, U03, U04, c2701g, c2701g};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26492b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = true;
        while (z12) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    z11 = c10.q(pluginGeneratedSerialDescriptor, 4);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                z10 = c10.q(pluginGeneratedSerialDescriptor, 3);
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
                z12 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C2353W(i10, str, str2, str3, z10, z11);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26492b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2353W c2353w = (C2353W) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2353w);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26492b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c2353w.f26493a;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c2353w.f26494b;
        if (C11 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = c2353w.f26495c;
        if (C12 || str3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str3);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = c2353w.f26496d;
        if (C13 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 3, z10);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z11 = c2353w.f26497e;
        if (C14 || z11) {
            c10.p(pluginGeneratedSerialDescriptor, 4, z11);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

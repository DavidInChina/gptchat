package mc;

import Vc.A;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: mc.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4614a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C4614a f39122a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f39123b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, mc.a] */
    static {
        ?? obj = new Object();
        f39122a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.settings.settings.DeveloperSettings", obj, 4);
        pluginGeneratedSerialDescriptor.k("useApiStaging", true);
        pluginGeneratedSerialDescriptor.k("useAuth0Staging", true);
        pluginGeneratedSerialDescriptor.k("voiceApiHost", true);
        pluginGeneratedSerialDescriptor.k("noNewChatTitle", true);
        f39123b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C4616c.f39124e[2];
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{c2701g, c2701g, kSerializer, c2701g};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f39123b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C4616c.f39124e;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        A a5 = null;
        boolean z13 = true;
        while (z13) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                z12 = c10.q(pluginGeneratedSerialDescriptor, 3);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            a5 = (A) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], a5);
                            i10 |= 4;
                        }
                    } else {
                        z11 = c10.q(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    z10 = c10.q(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z13 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C4616c(i10, z10, z11, a5, z12);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f39123b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C4616c c4616c = (C4616c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c4616c);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f39123b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C4615b c4615b = C4616c.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = c4616c.f39125a;
        if (C10 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 0, z10);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z11 = c4616c.f39126b;
        if (C11 || z11) {
            c10.p(pluginGeneratedSerialDescriptor, 1, z11);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        A a5 = c4616c.f39127c;
        if (C12 || a5 != A.f18524Z) {
            c10.i(pluginGeneratedSerialDescriptor, 2, C4616c.f39124e[2], a5);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z12 = c4616c.f39128d;
        if (C13 || z12) {
            c10.p(pluginGeneratedSerialDescriptor, 3, z12);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

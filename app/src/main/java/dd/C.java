package Dd;

import O9.C1118n;
import O9.C1122p;
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
import wd.C6166A;
import wd.C6168C;

/* loaded from: classes.dex */
public final class C implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C f3505a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f3506b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Dd.C, java.lang.Object] */
    static {
        ?? obj = new Object();
        f3505a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.VoiceConversationStreamMessageResponse", obj, 3);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        pluginGeneratedSerialDescriptor.k("message", false);
        pluginGeneratedSerialDescriptor.k("error", false);
        f3506b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(C6166A.f48310a), A7.b.U0(C1118n.f13562a), A7.b.U0(u0.f28491a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6168C c6168c;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3506b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        C1122p c1122p = null;
        String str2 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str2);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        c1122p = (C1122p) c10.v(pluginGeneratedSerialDescriptor, 1, C1118n.f13562a, c1122p);
                        i10 |= 2;
                    }
                } else {
                    C6166A c6166a = C6166A.f48310a;
                    if (str != null) {
                        c6168c = new C6168C(str);
                    } else {
                        c6168c = null;
                    }
                    C6168C c6168c2 = (C6168C) c10.v(pluginGeneratedSerialDescriptor, 0, c6166a, c6168c);
                    if (c6168c2 != null) {
                        str = c6168c2.f48321a;
                    } else {
                        str = null;
                    }
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new E(i10, str, c1122p, str2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f3506b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6168C c6168c;
        E e10 = (E) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", e10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3506b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        D d10 = E.Companion;
        C6166A c6166a = C6166A.f48310a;
        String str = e10.f3507a;
        if (str != null) {
            c6168c = new C6168C(str);
        } else {
            c6168c = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 0, c6166a, c6168c);
        c10.q(pluginGeneratedSerialDescriptor, 1, C1118n.f13562a, e10.f3508b);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0.f28491a, e10.f3509c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

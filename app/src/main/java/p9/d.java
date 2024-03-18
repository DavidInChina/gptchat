package P9;

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
import wd.C6178a0;
import wd.C6182c0;

/* loaded from: classes2.dex */
public final class d implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final d f13881a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13882b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, P9.d] */
    static {
        ?? obj = new Object();
        f13881a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.moderation.ModerationResult", obj, 3);
        pluginGeneratedSerialDescriptor.k("messageId", false);
        pluginGeneratedSerialDescriptor.k("flagged", false);
        pluginGeneratedSerialDescriptor.k("blocked", false);
        f13882b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{C6178a0.f48382a, c2701g, c2701g};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6182c0 c6182c0;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13882b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        String str = null;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            z12 = c10.q(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        z11 = c10.q(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    C6178a0 c6178a0 = C6178a0.f48382a;
                    if (str != null) {
                        c6182c0 = new C6182c0(str);
                    } else {
                        c6182c0 = null;
                    }
                    C6182c0 c6182c02 = (C6182c0) c10.n(pluginGeneratedSerialDescriptor, 0, c6178a0, c6182c0);
                    if (c6182c02 != null) {
                        str = c6182c02.f48393Y;
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
        return new f(i10, str, z11, z12);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13882b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", fVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13882b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C6178a0.f48382a, new C6182c0(fVar.f13883a));
        c10.p(pluginGeneratedSerialDescriptor, 1, fVar.f13884b);
        c10.p(pluginGeneratedSerialDescriptor, 2, fVar.f13885c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

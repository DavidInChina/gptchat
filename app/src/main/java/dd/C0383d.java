package Dd;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6166A;
import wd.C6168C;
import wd.C6178a0;
import wd.C6182c0;

/* renamed from: Dd.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383d implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0383d f3554a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f3555b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Dd.d, java.lang.Object] */
    static {
        ?? obj = new Object();
        f3554a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.ConversationUpdate", obj, 3);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        pluginGeneratedSerialDescriptor.k("parentMessageId", false);
        pluginGeneratedSerialDescriptor.k("response", false);
        f3555b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C6166A.f48310a, C6178a0.f48382a, C.f3505a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6182c0 c6182c0;
        C6168C c6168c;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3555b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        E e10 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            e10 = (E) c10.n(pluginGeneratedSerialDescriptor, 2, C.f3505a, e10);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        C6178a0 c6178a0 = C6178a0.f48382a;
                        if (str2 != null) {
                            c6182c0 = new C6182c0(str2);
                        } else {
                            c6182c0 = null;
                        }
                        C6182c0 c6182c02 = (C6182c0) c10.n(pluginGeneratedSerialDescriptor, 1, c6178a0, c6182c0);
                        if (c6182c02 != null) {
                            str2 = c6182c02.f48393Y;
                        } else {
                            str2 = null;
                        }
                        i10 |= 2;
                    }
                } else {
                    C6166A c6166a = C6166A.f48310a;
                    if (str != null) {
                        c6168c = new C6168C(str);
                    } else {
                        c6168c = null;
                    }
                    C6168C c6168c2 = (C6168C) c10.n(pluginGeneratedSerialDescriptor, 0, c6166a, c6168c);
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
        return new C0385f(i10, str, str2, e10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f3555b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0385f c0385f = (C0385f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0385f);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3555b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C0384e c0384e = C0385f.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C6166A.f48310a, new C6168C(c0385f.f3556a));
        c10.i(pluginGeneratedSerialDescriptor, 1, C6178a0.f48382a, new C6182c0(c0385f.f3557b));
        c10.i(pluginGeneratedSerialDescriptor, 2, C.f3505a, c0385f.f3558c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

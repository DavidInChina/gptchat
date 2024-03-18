package L9;

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

/* renamed from: L9.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0908n implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0908n f10942a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10943b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, L9.n] */
    static {
        ?? obj = new Object();
        f10942a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ConversationStreamErrorResponse", obj, 2);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        pluginGeneratedSerialDescriptor.k("error", false);
        f10943b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C6166A.f48310a, u0.f28491a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6168C c6168c;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10943b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        str2 = c10.r(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
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
        return new C0910p(i10, str, str2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10943b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0910p c0910p = (C0910p) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0910p);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10943b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C6166A.f48310a, new C6168C(c0910p.f10944a));
        c10.z(1, c0910p.f10945b, pluginGeneratedSerialDescriptor);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

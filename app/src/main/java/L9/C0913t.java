package L9;

import O9.C1118n;
import O9.C1122p;
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

/* renamed from: L9.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0913t implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0913t f10949a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10950b;

    /* JADX WARN: Type inference failed for: r0v0, types: [L9.t, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f10949a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ConversationStreamMessageResponse", obj, 2);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        pluginGeneratedSerialDescriptor.k("message", false);
        f10950b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C6166A.f48310a, C1118n.f13562a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6168C c6168c;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10950b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        C1122p c1122p = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        c1122p = (C1122p) c10.n(pluginGeneratedSerialDescriptor, 1, C1118n.f13562a, c1122p);
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
        return new C0915v(i10, str, c1122p);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10950b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0915v c0915v = (C0915v) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0915v);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10950b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C6166A.f48310a, new C6168C(c0915v.f10951a));
        c10.i(pluginGeneratedSerialDescriptor, 1, C1118n.f13562a, c0915v.f10952b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

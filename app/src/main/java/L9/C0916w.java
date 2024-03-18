package L9;

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
import wd.C6166A;
import wd.C6168C;
import wd.C6178a0;
import wd.C6182c0;

/* renamed from: L9.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0916w implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0916w f10953a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10954b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, L9.w, java.lang.Object] */
    static {
        ?? obj = new Object();
        f10953a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ConversationStreamModerationResponse", obj, 4);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        pluginGeneratedSerialDescriptor.k("messageId", false);
        pluginGeneratedSerialDescriptor.k("isCompletion", false);
        pluginGeneratedSerialDescriptor.k("moderationResponse", false);
        f10954b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C6166A.f48310a, C6178a0.f48382a, C2701g.f28450a, P9.a.f13877a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6182c0 c6182c0;
        C6168C c6168c;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10954b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        String str = null;
        String str2 = null;
        P9.c cVar = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                cVar = (P9.c) c10.n(pluginGeneratedSerialDescriptor, 3, P9.a.f13877a, cVar);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            z11 = c10.q(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
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
        return new C0918y(i10, str, str2, z11, cVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10954b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0918y c0918y = (C0918y) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0918y);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10954b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C6166A.f48310a, new C6168C(c0918y.f10955a));
        c10.i(pluginGeneratedSerialDescriptor, 1, C6178a0.f48382a, new C6182c0(c0918y.f10956b));
        c10.p(pluginGeneratedSerialDescriptor, 2, c0918y.f10957c);
        c10.i(pluginGeneratedSerialDescriptor, 3, P9.a.f13877a, c0918y.f10958d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

package L9;

import O9.C1118n;
import O9.C1122p;
import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6178a0;
import wd.C6182c0;

/* renamed from: L9.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0901g implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0901g f10932a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10933b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, L9.g, java.lang.Object] */
    static {
        ?? obj = new Object();
        f10932a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ConversationResponseNode", obj, 4);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("parent", true);
        pluginGeneratedSerialDescriptor.k("children", false);
        pluginGeneratedSerialDescriptor.k("message", true);
        f10933b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C0903i.f10935e;
        C6178a0 c6178a0 = C6178a0.f48382a;
        return new KSerializer[]{c6178a0, A7.b.U0(c6178a0), kSerializerArr[2], A7.b.U0(C1118n.f13562a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6182c0 c6182c0;
        C6182c0 c6182c02;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10933b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C0903i.f10935e;
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        List list = null;
        C1122p c1122p = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                c1122p = (C1122p) c10.v(pluginGeneratedSerialDescriptor, 3, C1118n.f13562a, c1122p);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            list = (List) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                            i10 |= 4;
                        }
                    } else {
                        C6178a0 c6178a0 = C6178a0.f48382a;
                        if (str2 != null) {
                            c6182c0 = new C6182c0(str2);
                        } else {
                            c6182c0 = null;
                        }
                        C6182c0 c6182c03 = (C6182c0) c10.v(pluginGeneratedSerialDescriptor, 1, c6178a0, c6182c0);
                        if (c6182c03 != null) {
                            str2 = c6182c03.f48393Y;
                        } else {
                            str2 = null;
                        }
                        i10 |= 2;
                    }
                } else {
                    C6178a0 c6178a02 = C6178a0.f48382a;
                    if (str != null) {
                        c6182c02 = new C6182c0(str);
                    } else {
                        c6182c02 = null;
                    }
                    C6182c0 c6182c04 = (C6182c0) c10.n(pluginGeneratedSerialDescriptor, 0, c6178a02, c6182c02);
                    if (c6182c04 != null) {
                        str = c6182c04.f48393Y;
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
        return new C0903i(i10, str, str2, list, c1122p);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10933b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6182c0 c6182c0;
        C0903i c0903i = (C0903i) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0903i);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10933b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C0902h c0902h = C0903i.Companion;
        C6178a0 c6178a0 = C6178a0.f48382a;
        c10.i(pluginGeneratedSerialDescriptor, 0, c6178a0, new C6182c0(c0903i.f10936a));
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c0903i.f10937b;
        if (C10 || str != null) {
            if (str != null) {
                c6182c0 = new C6182c0(str);
            } else {
                c6182c0 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 1, c6178a0, c6182c0);
        }
        c10.i(pluginGeneratedSerialDescriptor, 2, C0903i.f10935e[2], c0903i.f10938c);
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        C1122p c1122p = c0903i.f10939d;
        if (C11 || c1122p != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, C1118n.f13562a, c1122p);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

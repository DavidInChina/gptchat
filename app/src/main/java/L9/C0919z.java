package L9;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6166A;
import wd.C6168C;
import wd.C6169D;
import wd.C6171F;
import wd.C6178a0;
import wd.C6182c0;
import wd.C6186e0;
import wd.C6190g0;
import wd.w0;
import wd.y0;

/* renamed from: L9.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0919z implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0919z f10959a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10960b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, L9.z] */
    static {
        ?? obj = new Object();
        f10959a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ConversationStreamRequest", obj, 10);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        pluginGeneratedSerialDescriptor.k("action", false);
        pluginGeneratedSerialDescriptor.k("parentMessageId", false);
        pluginGeneratedSerialDescriptor.k("messages", false);
        pluginGeneratedSerialDescriptor.k("model", false);
        pluginGeneratedSerialDescriptor.k("historyAndTrainingDisabled", true);
        pluginGeneratedSerialDescriptor.k("continueFromSharedConversationId", true);
        pluginGeneratedSerialDescriptor.k("supportsModapi", true);
        pluginGeneratedSerialDescriptor.k("conversationMode", true);
        pluginGeneratedSerialDescriptor.k("suggestions", true);
        f10960b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = B.f10861k;
        KSerializer U02 = A7.b.U0(C6166A.f48310a);
        KSerializer kSerializer = kSerializerArr[1];
        KSerializer U03 = A7.b.U0(kSerializerArr[3]);
        KSerializer U04 = A7.b.U0(w0.f48470a);
        KSerializer U05 = A7.b.U0(C6169D.f48323a);
        KSerializer U06 = A7.b.U0(kSerializerArr[9]);
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{U02, kSerializer, C6178a0.f48382a, U03, C6186e0.f48396a, c2701g, U04, c2701g, U05, U06};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6168C c6168c;
        String str;
        C6182c0 c6182c0;
        C6190g0 c6190g0;
        y0 y0Var;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10960b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = B.f10861k;
        List list = null;
        boolean z10 = true;
        C6171F c6171f = null;
        int i10 = 0;
        String str2 = null;
        E e10 = null;
        String str3 = null;
        List list2 = null;
        String str4 = null;
        boolean z11 = false;
        String str5 = null;
        boolean z12 = false;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    C6166A c6166a = C6166A.f48310a;
                    if (str2 != null) {
                        c6168c = new C6168C(str2);
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
                    str2 = str;
                    break;
                case 1:
                    e10 = (E) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], e10);
                    i10 |= 2;
                    break;
                case 2:
                    C6178a0 c6178a0 = C6178a0.f48382a;
                    if (str3 != null) {
                        c6182c0 = new C6182c0(str3);
                    } else {
                        c6182c0 = null;
                    }
                    C6182c0 c6182c02 = (C6182c0) c10.n(pluginGeneratedSerialDescriptor, 2, c6178a0, c6182c0);
                    if (c6182c02 != null) {
                        str3 = c6182c02.f48393Y;
                    } else {
                        str3 = null;
                    }
                    i10 |= 4;
                    break;
                case 3:
                    list2 = (List) c10.v(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list2);
                    i10 |= 8;
                    break;
                case 4:
                    C6186e0 c6186e0 = C6186e0.f48396a;
                    if (str4 != null) {
                        c6190g0 = new C6190g0(str4);
                    } else {
                        c6190g0 = null;
                    }
                    C6190g0 c6190g02 = (C6190g0) c10.n(pluginGeneratedSerialDescriptor, 4, c6186e0, c6190g0);
                    if (c6190g02 != null) {
                        str4 = c6190g02.f48419a;
                    } else {
                        str4 = null;
                    }
                    i10 |= 16;
                    break;
                case 5:
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                case 6:
                    w0 w0Var = w0.f48470a;
                    if (str5 != null) {
                        y0Var = new y0(str5);
                    } else {
                        y0Var = null;
                    }
                    y0 y0Var2 = (y0) c10.v(pluginGeneratedSerialDescriptor, 6, w0Var, y0Var);
                    if (y0Var2 != null) {
                        str5 = y0Var2.f48473a;
                    } else {
                        str5 = null;
                    }
                    i10 |= 64;
                    break;
                case 7:
                    z12 = c10.q(pluginGeneratedSerialDescriptor, 7);
                    i10 |= 128;
                    break;
                case 8:
                    c6171f = (C6171F) c10.v(pluginGeneratedSerialDescriptor, 8, C6169D.f48323a, c6171f);
                    i10 |= 256;
                    break;
                case 9:
                    list = (List) c10.v(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list);
                    i10 |= 512;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new B(i10, str2, e10, str3, list2, str4, z11, str5, z12, c6171f, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10960b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6168C c6168c;
        B b10 = (B) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", b10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10960b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        A a5 = B.Companion;
        C6166A c6166a = C6166A.f48310a;
        String str = b10.f10862a;
        y0 y0Var = null;
        if (str != null) {
            c6168c = new C6168C(str);
        } else {
            c6168c = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 0, c6166a, c6168c);
        KSerializer[] kSerializerArr = B.f10861k;
        c10.i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], b10.f10863b);
        c10.i(pluginGeneratedSerialDescriptor, 2, C6178a0.f48382a, new C6182c0(b10.f10864c));
        c10.q(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], b10.f10865d);
        c10.i(pluginGeneratedSerialDescriptor, 4, C6186e0.f48396a, new C6190g0(b10.f10866e));
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = b10.f10867f;
        if (C10 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 5, z10);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = b10.f10868g;
        if (C11 || str2 != null) {
            w0 w0Var = w0.f48470a;
            if (str2 != null) {
                y0Var = new y0(str2);
            }
            c10.q(pluginGeneratedSerialDescriptor, 6, w0Var, y0Var);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z11 = b10.f10869h;
        if (C12 || !z11) {
            c10.p(pluginGeneratedSerialDescriptor, 7, z11);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        C6171F c6171f = b10.f10870i;
        if (C13 || c6171f != null) {
            c10.q(pluginGeneratedSerialDescriptor, 8, C6169D.f48323a, c6171f);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        List list = b10.f10871j;
        if (C14 || list != null) {
            c10.q(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

package Ed;

import ah.C2004o;
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
import wd.C6166A;
import wd.C6168C;
import wd.C6169D;
import wd.C6171F;
import wd.C6178a0;
import wd.C6182c0;
import wd.C6186e0;
import wd.C6190g0;

/* loaded from: classes2.dex */
public final class a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4655a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f4656b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ed.a, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f4655a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.model.GetTokenRequest", obj, 10);
        pluginGeneratedSerialDescriptor.k("voice", false);
        pluginGeneratedSerialDescriptor.k("modelSlug", false);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        pluginGeneratedSerialDescriptor.k("parentMessageId", false);
        pluginGeneratedSerialDescriptor.k("languageCode", false);
        pluginGeneratedSerialDescriptor.k("responseInterruptibility", false);
        pluginGeneratedSerialDescriptor.k("voiceSessionId", false);
        pluginGeneratedSerialDescriptor.k("conversationMode", false);
        pluginGeneratedSerialDescriptor.k("enableMessageStreaming", false);
        pluginGeneratedSerialDescriptor.k("voiceTrainingAllowed", false);
        f4656b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        KSerializer U02 = A7.b.U0(C6166A.f48310a);
        KSerializer U03 = A7.b.U0(C6178a0.f48382a);
        KSerializer U04 = A7.b.U0(u0Var);
        KSerializer U05 = A7.b.U0(j.f4685a);
        KSerializer U06 = A7.b.U0(C6169D.f48323a);
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{u0Var, C6186e0.f48396a, U02, U03, U04, c2701g, U05, U06, c2701g, c2701g};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6190g0 c6190g0;
        C6168C c6168c;
        C6182c0 c6182c0;
        l lVar;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f4656b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        C6171F c6171f = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    str = c10.r(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    C6186e0 c6186e0 = C6186e0.f48396a;
                    if (str2 != null) {
                        c6190g0 = new C6190g0(str2);
                    } else {
                        c6190g0 = null;
                    }
                    C6190g0 c6190g02 = (C6190g0) c10.n(pluginGeneratedSerialDescriptor, 1, c6186e0, c6190g0);
                    if (c6190g02 != null) {
                        str2 = c6190g02.f48419a;
                    } else {
                        str2 = null;
                    }
                    i10 |= 2;
                    break;
                case 2:
                    C6166A c6166a = C6166A.f48310a;
                    if (str3 != null) {
                        c6168c = new C6168C(str3);
                    } else {
                        c6168c = null;
                    }
                    C6168C c6168c2 = (C6168C) c10.v(pluginGeneratedSerialDescriptor, 2, c6166a, c6168c);
                    if (c6168c2 != null) {
                        str3 = c6168c2.f48321a;
                    } else {
                        str3 = null;
                    }
                    i10 |= 4;
                    break;
                case 3:
                    C6178a0 c6178a0 = C6178a0.f48382a;
                    if (str4 != null) {
                        c6182c0 = new C6182c0(str4);
                    } else {
                        c6182c0 = null;
                    }
                    C6182c0 c6182c02 = (C6182c0) c10.v(pluginGeneratedSerialDescriptor, 3, c6178a0, c6182c0);
                    if (c6182c02 != null) {
                        str4 = c6182c02.f48393Y;
                    } else {
                        str4 = null;
                    }
                    i10 |= 8;
                    break;
                case 4:
                    str5 = (String) c10.v(pluginGeneratedSerialDescriptor, 4, u0.f28491a, str5);
                    i10 |= 16;
                    break;
                case 5:
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                case 6:
                    j jVar = j.f4685a;
                    if (str6 != null) {
                        lVar = new l(str6);
                    } else {
                        lVar = null;
                    }
                    l lVar2 = (l) c10.v(pluginGeneratedSerialDescriptor, 6, jVar, lVar);
                    if (lVar2 != null) {
                        str6 = lVar2.f4687a;
                    } else {
                        str6 = null;
                    }
                    i10 |= 64;
                    break;
                case 7:
                    c6171f = (C6171F) c10.v(pluginGeneratedSerialDescriptor, 7, C6169D.f48323a, c6171f);
                    i10 |= 128;
                    break;
                case 8:
                    z12 = c10.q(pluginGeneratedSerialDescriptor, 8);
                    i10 |= 256;
                    break;
                case 9:
                    z13 = c10.q(pluginGeneratedSerialDescriptor, 9);
                    i10 |= 512;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new c(i10, str, str2, str3, str4, str5, z11, str6, c6171f, z12, z13);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f4656b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6168C c6168c;
        C6182c0 c6182c0;
        c cVar = (c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", cVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f4656b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.z(0, cVar.f4657a, pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 1, C6186e0.f48396a, new C6190g0(cVar.f4658b));
        C6166A c6166a = C6166A.f48310a;
        l lVar = null;
        String str = cVar.f4659c;
        if (str != null) {
            c6168c = new C6168C(str);
        } else {
            c6168c = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 2, c6166a, c6168c);
        C6178a0 c6178a0 = C6178a0.f48382a;
        String str2 = cVar.f4660d;
        if (str2 != null) {
            c6182c0 = new C6182c0(str2);
        } else {
            c6182c0 = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 3, c6178a0, c6182c0);
        c10.q(pluginGeneratedSerialDescriptor, 4, u0.f28491a, cVar.f4661e);
        c10.p(pluginGeneratedSerialDescriptor, 5, cVar.f4662f);
        j jVar = j.f4685a;
        String str3 = cVar.f4663g;
        if (str3 != null) {
            lVar = new l(str3);
        }
        c10.q(pluginGeneratedSerialDescriptor, 6, jVar, lVar);
        c10.q(pluginGeneratedSerialDescriptor, 7, C6169D.f48323a, cVar.f4664h);
        c10.p(pluginGeneratedSerialDescriptor, 8, cVar.f4665i);
        c10.p(pluginGeneratedSerialDescriptor, 9, cVar.f4666j);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

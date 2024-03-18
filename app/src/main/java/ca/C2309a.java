package ca;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6166A;
import wd.C6168C;
import wd.C6178a0;
import wd.C6182c0;
import wd.M;
import wd.O;
import wd.w0;
import wd.y0;

/* renamed from: ca.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2309a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2309a f26371a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26372b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, ca.a] */
    static {
        ?? obj = new Object();
        f26371a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.conversation.Conversation", obj, 11);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("remoteId", true);
        pluginGeneratedSerialDescriptor.k("creationDate", false);
        pluginGeneratedSerialDescriptor.k("modificationDate", false);
        pluginGeneratedSerialDescriptor.k("currentLeafNodeId", true);
        pluginGeneratedSerialDescriptor.k("title", true);
        pluginGeneratedSerialDescriptor.k("moderationResults", true);
        pluginGeneratedSerialDescriptor.k("sharedConversationId", true);
        pluginGeneratedSerialDescriptor.k("gizmoId", true);
        pluginGeneratedSerialDescriptor.k("suggestions", true);
        pluginGeneratedSerialDescriptor.k("hasTitle", true);
        f26372b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C2311c.f26373p;
        C6166A c6166a = C6166A.f48310a;
        KSerializer U02 = A7.b.U0(c6166a);
        Zg.g gVar = Zg.g.f23747a;
        return new KSerializer[]{c6166a, U02, A7.b.U0(gVar), gVar, A7.b.U0(C6178a0.f48382a), A7.b.U0(u0.f28491a), kSerializerArr[6], A7.b.U0(w0.f48470a), A7.b.U0(M.f48360a), A7.b.U0(kSerializerArr[9]), C2701g.f28450a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        boolean z10;
        C6168C c6168c;
        String str;
        C6168C c6168c2;
        String str2;
        C6182c0 c6182c0;
        y0 y0Var;
        O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26372b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2311c.f26373p;
        List list = null;
        String str3 = null;
        boolean z11 = true;
        String str4 = null;
        int i10 = 0;
        String str5 = null;
        String str6 = null;
        Yg.p pVar = null;
        Yg.p pVar2 = null;
        String str7 = null;
        String str8 = null;
        Map map = null;
        boolean z12 = false;
        while (z11) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z11 = false;
                    continue;
                case 0:
                    z10 = z11;
                    C6166A c6166a = C6166A.f48310a;
                    if (str5 != null) {
                        c6168c = new C6168C(str5);
                    } else {
                        c6168c = null;
                    }
                    C6168C c6168c3 = (C6168C) c10.n(pluginGeneratedSerialDescriptor, 0, c6166a, c6168c);
                    if (c6168c3 != null) {
                        str = c6168c3.f48321a;
                    } else {
                        str = null;
                    }
                    i10 |= 1;
                    str5 = str;
                    break;
                case 1:
                    z10 = z11;
                    C6166A c6166a2 = C6166A.f48310a;
                    if (str6 != null) {
                        c6168c2 = new C6168C(str6);
                    } else {
                        c6168c2 = null;
                    }
                    C6168C c6168c4 = (C6168C) c10.v(pluginGeneratedSerialDescriptor, 1, c6166a2, c6168c2);
                    if (c6168c4 != null) {
                        str2 = c6168c4.f48321a;
                    } else {
                        str2 = null;
                    }
                    i10 |= 2;
                    str6 = str2;
                    break;
                case 2:
                    z10 = z11;
                    pVar = (Yg.p) c10.v(pluginGeneratedSerialDescriptor, 2, Zg.g.f23747a, pVar);
                    i10 |= 4;
                    break;
                case 3:
                    z10 = z11;
                    pVar2 = (Yg.p) c10.n(pluginGeneratedSerialDescriptor, 3, Zg.g.f23747a, pVar2);
                    i10 |= 8;
                    break;
                case 4:
                    z10 = z11;
                    C6178a0 c6178a0 = C6178a0.f48382a;
                    if (str7 != null) {
                        c6182c0 = new C6182c0(str7);
                    } else {
                        c6182c0 = null;
                    }
                    C6182c0 c6182c02 = (C6182c0) c10.v(pluginGeneratedSerialDescriptor, 4, c6178a0, c6182c0);
                    if (c6182c02 != null) {
                        str7 = c6182c02.f48393Y;
                    } else {
                        str7 = null;
                    }
                    i10 |= 16;
                    break;
                case 5:
                    z10 = z11;
                    str8 = (String) c10.v(pluginGeneratedSerialDescriptor, 5, u0.f28491a, str8);
                    i10 |= 32;
                    break;
                case 6:
                    z10 = z11;
                    map = (Map) c10.n(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], map);
                    i10 |= 64;
                    break;
                case 7:
                    z10 = z11;
                    w0 w0Var = w0.f48470a;
                    if (str4 != null) {
                        y0Var = new y0(str4);
                    } else {
                        y0Var = null;
                    }
                    y0 y0Var2 = (y0) c10.v(pluginGeneratedSerialDescriptor, 7, w0Var, y0Var);
                    if (y0Var2 != null) {
                        str4 = y0Var2.f48473a;
                    } else {
                        str4 = null;
                    }
                    i10 |= 128;
                    break;
                case 8:
                    z10 = z11;
                    M m10 = M.f48360a;
                    if (str3 != null) {
                        o10 = new O(str3);
                    } else {
                        o10 = null;
                    }
                    O o11 = (O) c10.v(pluginGeneratedSerialDescriptor, 8, m10, o10);
                    if (o11 != null) {
                        str3 = o11.f48362a;
                    } else {
                        str3 = null;
                    }
                    i10 |= 256;
                    break;
                case 9:
                    z10 = z11;
                    list = (List) c10.v(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list);
                    i10 |= 512;
                    break;
                case 10:
                    z12 = c10.q(pluginGeneratedSerialDescriptor, 10);
                    i10 |= 1024;
                    continue;
                default:
                    throw new C2004o(t10);
            }
            z11 = z10;
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C2311c(i10, str5, str6, pVar, pVar2, str7, str8, map, str4, str3, list, z12);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26372b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
        if (r11 != r3) goto L54;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        y0 y0Var;
        C6182c0 c6182c0;
        C6168C c6168c;
        C2311c c2311c = (C2311c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2311c);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26372b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C2310b c2310b = C2311c.Companion;
        C6166A c6166a = C6166A.f48310a;
        boolean z10 = false;
        c10.i(pluginGeneratedSerialDescriptor, 0, c6166a, new C6168C(c2311c.f26374a));
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        O o10 = null;
        String str = c2311c.f26375b;
        if (C10 || str != null) {
            if (str != null) {
                c6168c = new C6168C(str);
            } else {
                c6168c = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 1, c6166a, c6168c);
        }
        Zg.g gVar = Zg.g.f23747a;
        c10.q(pluginGeneratedSerialDescriptor, 2, gVar, c2311c.f26376c);
        c10.i(pluginGeneratedSerialDescriptor, 3, gVar, c2311c.f26377d);
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c2311c.f26378e;
        if (C11 || str2 != null) {
            C6178a0 c6178a0 = C6178a0.f48382a;
            if (str2 != null) {
                c6182c0 = new C6182c0(str2);
            } else {
                c6182c0 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 4, c6178a0, c6182c0);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = c2311c.f26379f;
        if (C12 || str3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 5, u0.f28491a, str3);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2311c.f26373p;
        Map map = c2311c.f26380g;
        if (C13 || !AbstractC3557B.K(map, kf.w.f37484Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], map);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        String str4 = c2311c.f26381h;
        if (C14 || str4 != null) {
            w0 w0Var = w0.f48470a;
            if (str4 != null) {
                y0Var = new y0(str4);
            } else {
                y0Var = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 7, w0Var, y0Var);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        String str5 = c2311c.f26382i;
        if (C15 || str5 != null) {
            M m10 = M.f48360a;
            if (str5 != null) {
                o10 = new O(str5);
            }
            c10.q(pluginGeneratedSerialDescriptor, 8, m10, o10);
        }
        boolean C16 = c10.C(pluginGeneratedSerialDescriptor);
        List list = c2311c.f26383j;
        if (C16 || list != null) {
            c10.q(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list);
        }
        boolean C17 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z11 = c2311c.f26388o;
        if (!C17) {
            if (str3 != null && !Lg.n.n2(str3) && !AbstractC3557B.K(str3, "New chat")) {
                z10 = true;
            }
        }
        c10.p(pluginGeneratedSerialDescriptor, 10, z11);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

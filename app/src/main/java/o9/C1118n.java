package O9;

import ad.C1973a;
import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
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

/* renamed from: O9.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118n implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1118n f13562a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13563b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, O9.n] */
    static {
        ?? obj = new Object();
        f13562a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiConversationMessage", obj, 9);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("author", false);
        pluginGeneratedSerialDescriptor.k("user", true);
        pluginGeneratedSerialDescriptor.k("content", false);
        pluginGeneratedSerialDescriptor.k("createTime", true);
        pluginGeneratedSerialDescriptor.k("status", true);
        pluginGeneratedSerialDescriptor.k("endTurn", true);
        pluginGeneratedSerialDescriptor.k("recipient", true);
        pluginGeneratedSerialDescriptor.k("metadata", true);
        f13563b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C6178a0.f48382a, C1124q.f13581a, A7.b.U0(C.f13448a), C1104g.f13536d, A7.b.U0(C1973a.f24152a), C1122p.f13570j[5], A7.b.U0(C2701g.f28450a), A7.b.U0(dh.u0.f28491a), A7.b.U0(C1135w.f13612a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6182c0 c6182c0;
        String str;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13563b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1122p.f13570j;
        C1139y c1139y = null;
        boolean z10 = true;
        String str2 = null;
        int i10 = 0;
        String str3 = null;
        C1127s c1127s = null;
        E e10 = null;
        AbstractC1102f abstractC1102f = null;
        Yg.p pVar = null;
        B b10 = null;
        Boolean bool = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    C6178a0 c6178a0 = C6178a0.f48382a;
                    if (str3 != null) {
                        c6182c0 = new C6182c0(str3);
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
                    str3 = str;
                    break;
                case 1:
                    c1127s = (C1127s) c10.n(pluginGeneratedSerialDescriptor, 1, C1124q.f13581a, c1127s);
                    i10 |= 2;
                    break;
                case 2:
                    e10 = (E) c10.v(pluginGeneratedSerialDescriptor, 2, C.f13448a, e10);
                    i10 |= 4;
                    break;
                case 3:
                    abstractC1102f = (AbstractC1102f) c10.n(pluginGeneratedSerialDescriptor, 3, C1104g.f13536d, abstractC1102f);
                    i10 |= 8;
                    break;
                case 4:
                    pVar = (Yg.p) c10.v(pluginGeneratedSerialDescriptor, 4, C1973a.f24152a, pVar);
                    i10 |= 16;
                    break;
                case 5:
                    b10 = (B) c10.n(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], b10);
                    i10 |= 32;
                    break;
                case 6:
                    bool = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 6, C2701g.f28450a, bool);
                    i10 |= 64;
                    break;
                case 7:
                    str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 7, dh.u0.f28491a, str2);
                    i10 |= 128;
                    break;
                case 8:
                    c1139y = (C1139y) c10.v(pluginGeneratedSerialDescriptor, 8, C1135w.f13612a, c1139y);
                    i10 |= 256;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1122p(i10, str3, c1127s, e10, abstractC1102f, pVar, b10, bool, str2, c1139y);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13563b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1122p c1122p = (C1122p) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1122p);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13563b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C1120o c1120o = C1122p.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C6178a0.f48382a, new C6182c0(c1122p.f13571a));
        c10.i(pluginGeneratedSerialDescriptor, 1, C1124q.f13581a, c1122p.f13572b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        E e10 = c1122p.f13573c;
        if (C10 || e10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C.f13448a, e10);
        }
        c10.i(pluginGeneratedSerialDescriptor, 3, C1104g.f13536d, c1122p.f13574d);
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        Yg.p pVar = c1122p.f13575e;
        if (C11 || pVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, C1973a.f24152a, pVar);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        B b10 = c1122p.f13576f;
        if (C12 || b10 != B.f13443h0) {
            c10.i(pluginGeneratedSerialDescriptor, 5, C1122p.f13570j[5], b10);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool = c1122p.f13577g;
        if (C13 || bool != null) {
            c10.q(pluginGeneratedSerialDescriptor, 6, C2701g.f28450a, bool);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c1122p.f13578h;
        if (C14 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 7, dh.u0.f28491a, str);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        C1139y c1139y = c1122p.f13579i;
        if (C15 || !AbstractC3557B.K(c1139y, new C1139y(null, null, null, null, 262143))) {
            c10.q(pluginGeneratedSerialDescriptor, 8, C1135w.f13612a, c1139y);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

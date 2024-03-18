package O9;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import eh.C2906f;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: O9.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135w implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1135w f13612a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13613b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, O9.w, java.lang.Object] */
    static {
        ?? obj = new Object();
        f13612a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiConversationMessageMetadata", obj, 18);
        pluginGeneratedSerialDescriptor.k("finishDetails", true);
        pluginGeneratedSerialDescriptor.k("modelSlug", true);
        pluginGeneratedSerialDescriptor.k("isUserSystemMessage", true);
        pluginGeneratedSerialDescriptor.k("isVisuallyHiddenFromConversation", true);
        pluginGeneratedSerialDescriptor.k("excludeAfterNextUserMessage", true);
        pluginGeneratedSerialDescriptor.k("userContextMessageData", true);
        pluginGeneratedSerialDescriptor.k("citations", true);
        pluginGeneratedSerialDescriptor.k("command", true);
        pluginGeneratedSerialDescriptor.k("args", true);
        pluginGeneratedSerialDescriptor.k("status", true);
        pluginGeneratedSerialDescriptor.k("_cite_metadata", true);
        pluginGeneratedSerialDescriptor.k("sharedConversationId", true);
        pluginGeneratedSerialDescriptor.k("attachments", true);
        pluginGeneratedSerialDescriptor.k("dalle", true);
        pluginGeneratedSerialDescriptor.k("aggregateResult", true);
        pluginGeneratedSerialDescriptor.k("jitPluginData", true);
        pluginGeneratedSerialDescriptor.k("invokedPlugin", true);
        pluginGeneratedSerialDescriptor.k("gizmoId", true);
        f13613b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1139y.f13628s;
        KSerializer U02 = A7.b.U0(C1106h.f13540a);
        dh.u0 u0Var = dh.u0.f28491a;
        KSerializer U03 = A7.b.U0(u0Var);
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{U02, U03, A7.b.U0(c2701g), A7.b.U0(c2701g), A7.b.U0(c2701g), A7.b.U0(F.f13456a), A7.b.U0(kSerializerArr[6]), A7.b.U0(u0Var), A7.b.U0(C2906f.f29422a), A7.b.U0(u0Var), A7.b.U0(U0.f13502a), A7.b.U0(wd.w0.f48470a), A7.b.U0(kSerializerArr[12]), A7.b.U0(q1.f13584a), A7.b.U0(C1142z0.f13651a), A7.b.U0(S.f13497a), A7.b.U0(O.f13483a), A7.b.U0(wd.M.f48360a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        String str;
        wd.y0 y0Var;
        int i10;
        wd.O o10;
        KSerializer[] kSerializerArr;
        String str2;
        List list;
        Q q10;
        H h10;
        C1140y0 c1140y0;
        Boolean bool;
        B0 b02;
        Boolean bool2;
        List list2;
        y1 y1Var;
        String str3;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13613b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr2 = C1139y.f13628s;
        W0 w02 = null;
        String str4 = null;
        kotlinx.serialization.json.a aVar = null;
        boolean z10 = true;
        String str5 = null;
        int i11 = 0;
        String str6 = null;
        List list3 = null;
        y1 y1Var2 = null;
        B0 b03 = null;
        C1140y0 c1140y02 = null;
        Q q11 = null;
        String str7 = null;
        C1116m c1116m = null;
        String str8 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        H h11 = null;
        List list4 = null;
        while (z10) {
            boolean z11 = z10;
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    kSerializerArr = kSerializerArr2;
                    str2 = str6;
                    list = list4;
                    q10 = q11;
                    h10 = h11;
                    c1140y0 = c1140y02;
                    bool = bool5;
                    b02 = b03;
                    bool2 = bool4;
                    z10 = false;
                    str5 = str5;
                    list3 = list3;
                    y1Var2 = y1Var2;
                    str6 = str2;
                    bool4 = bool2;
                    b03 = b02;
                    bool5 = bool;
                    c1140y02 = c1140y0;
                    h11 = h10;
                    q11 = q10;
                    list4 = list;
                    kSerializerArr2 = kSerializerArr;
                case 0:
                    kSerializerArr = kSerializerArr2;
                    str2 = str6;
                    list2 = list3;
                    list = list4;
                    q10 = q11;
                    h10 = h11;
                    c1140y0 = c1140y02;
                    bool = bool5;
                    b02 = b03;
                    bool2 = bool4;
                    y1Var = y1Var2;
                    c1116m = (C1116m) c10.v(pluginGeneratedSerialDescriptor, 0, C1106h.f13540a, c1116m);
                    i11 |= 1;
                    str5 = str5;
                    list3 = list2;
                    y1Var2 = y1Var;
                    z10 = z11;
                    str6 = str2;
                    bool4 = bool2;
                    b03 = b02;
                    bool5 = bool;
                    c1140y02 = c1140y0;
                    h11 = h10;
                    q11 = q10;
                    list4 = list;
                    kSerializerArr2 = kSerializerArr;
                case 1:
                    kSerializerArr = kSerializerArr2;
                    str2 = str6;
                    list = list4;
                    q10 = q11;
                    h10 = h11;
                    c1140y0 = c1140y02;
                    bool = bool5;
                    b02 = b03;
                    bool2 = bool4;
                    y1Var = y1Var2;
                    list2 = list3;
                    str8 = (String) c10.v(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str8);
                    i11 |= 2;
                    str5 = str5;
                    list3 = list2;
                    y1Var2 = y1Var;
                    z10 = z11;
                    str6 = str2;
                    bool4 = bool2;
                    b03 = b02;
                    bool5 = bool;
                    c1140y02 = c1140y0;
                    h11 = h10;
                    q11 = q10;
                    list4 = list;
                    kSerializerArr2 = kSerializerArr;
                case 2:
                    kSerializerArr = kSerializerArr2;
                    str2 = str6;
                    list = list4;
                    q10 = q11;
                    h10 = h11;
                    c1140y0 = c1140y02;
                    bool = bool5;
                    b02 = b03;
                    bool2 = bool4;
                    y1Var = y1Var2;
                    bool3 = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool3);
                    i11 |= 4;
                    str5 = str5;
                    y1Var2 = y1Var;
                    z10 = z11;
                    str6 = str2;
                    bool4 = bool2;
                    b03 = b02;
                    bool5 = bool;
                    c1140y02 = c1140y0;
                    h11 = h10;
                    q11 = q10;
                    list4 = list;
                    kSerializerArr2 = kSerializerArr;
                case 3:
                    kSerializerArr = kSerializerArr2;
                    list = list4;
                    q10 = q11;
                    h10 = h11;
                    c1140y0 = c1140y02;
                    bool = bool5;
                    bool4 = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 3, C2701g.f28450a, bool4);
                    i11 |= 8;
                    str5 = str5;
                    b03 = b03;
                    z10 = z11;
                    str6 = str6;
                    bool5 = bool;
                    c1140y02 = c1140y0;
                    h11 = h10;
                    q11 = q10;
                    list4 = list;
                    kSerializerArr2 = kSerializerArr;
                case 4:
                    kSerializerArr = kSerializerArr2;
                    list = list4;
                    q10 = q11;
                    h10 = h11;
                    bool5 = (Boolean) c10.v(pluginGeneratedSerialDescriptor, 4, C2701g.f28450a, bool5);
                    i11 |= 16;
                    str5 = str5;
                    c1140y02 = c1140y02;
                    z10 = z11;
                    str6 = str6;
                    h11 = h10;
                    q11 = q10;
                    list4 = list;
                    kSerializerArr2 = kSerializerArr;
                case 5:
                    kSerializerArr = kSerializerArr2;
                    list = list4;
                    h11 = (H) c10.v(pluginGeneratedSerialDescriptor, 5, F.f13456a, h11);
                    i11 |= 32;
                    str5 = str5;
                    q11 = q11;
                    z10 = z11;
                    str6 = str6;
                    list4 = list;
                    kSerializerArr2 = kSerializerArr;
                case 6:
                    str3 = str6;
                    list4 = (List) c10.v(pluginGeneratedSerialDescriptor, 6, kSerializerArr2[6], list4);
                    i11 |= 64;
                    str5 = str5;
                    z10 = z11;
                    kSerializerArr2 = kSerializerArr2;
                    str6 = str3;
                case 7:
                    str3 = str6;
                    str5 = (String) c10.v(pluginGeneratedSerialDescriptor, 7, dh.u0.f28491a, str5);
                    i11 |= 128;
                    z10 = z11;
                    str6 = str3;
                case 8:
                    str = str5;
                    aVar = (kotlinx.serialization.json.a) c10.v(pluginGeneratedSerialDescriptor, 8, C2906f.f29422a, aVar);
                    i11 |= 256;
                    z10 = z11;
                    str5 = str;
                case 9:
                    str = str5;
                    str4 = (String) c10.v(pluginGeneratedSerialDescriptor, 9, dh.u0.f28491a, str4);
                    i11 |= 512;
                    z10 = z11;
                    str5 = str;
                case 10:
                    str = str5;
                    w02 = (W0) c10.v(pluginGeneratedSerialDescriptor, 10, U0.f13502a, w02);
                    i11 |= 1024;
                    z10 = z11;
                    str5 = str;
                case 11:
                    str = str5;
                    wd.w0 w0Var = wd.w0.f48470a;
                    if (str6 != null) {
                        y0Var = new wd.y0(str6);
                    } else {
                        y0Var = null;
                    }
                    wd.y0 y0Var2 = (wd.y0) c10.v(pluginGeneratedSerialDescriptor, 11, w0Var, y0Var);
                    if (y0Var2 != null) {
                        str6 = y0Var2.f48473a;
                    } else {
                        str6 = null;
                    }
                    i11 |= 2048;
                    z10 = z11;
                    str5 = str;
                case 12:
                    str = str5;
                    list3 = (List) c10.v(pluginGeneratedSerialDescriptor, 12, kSerializerArr2[12], list3);
                    i11 |= 4096;
                    z10 = z11;
                    str5 = str;
                case 13:
                    str = str5;
                    y1Var2 = (y1) c10.v(pluginGeneratedSerialDescriptor, 13, q1.f13584a, y1Var2);
                    i11 |= 8192;
                    z10 = z11;
                    str5 = str;
                case 14:
                    str = str5;
                    b03 = (B0) c10.v(pluginGeneratedSerialDescriptor, 14, C1142z0.f13651a, b03);
                    i11 |= 16384;
                    z10 = z11;
                    str5 = str;
                case 15:
                    str = str5;
                    c1140y02 = (C1140y0) c10.v(pluginGeneratedSerialDescriptor, 15, S.f13497a, c1140y02);
                    i10 = 32768;
                    i11 |= i10;
                    z10 = z11;
                    str5 = str;
                case 16:
                    str = str5;
                    q11 = (Q) c10.v(pluginGeneratedSerialDescriptor, 16, O.f13483a, q11);
                    i10 = 65536;
                    i11 |= i10;
                    z10 = z11;
                    str5 = str;
                case 17:
                    wd.M m10 = wd.M.f48360a;
                    str = str5;
                    if (str7 != null) {
                        o10 = new wd.O(str7);
                    } else {
                        o10 = null;
                    }
                    wd.O o11 = (wd.O) c10.v(pluginGeneratedSerialDescriptor, 17, m10, o10);
                    if (o11 != null) {
                        str7 = o11.f48362a;
                    } else {
                        str7 = null;
                    }
                    i10 = 131072;
                    i11 |= i10;
                    z10 = z11;
                    str5 = str;
                default:
                    throw new C2004o(t10);
            }
        }
        String str9 = str6;
        List list5 = list3;
        C1116m c1116m2 = c1116m;
        String str10 = str8;
        List list6 = list4;
        Q q12 = q11;
        H h12 = h11;
        C1140y0 c1140y03 = c1140y02;
        Boolean bool6 = bool5;
        B0 b04 = b03;
        Boolean bool7 = bool4;
        y1 y1Var3 = y1Var2;
        Boolean bool8 = bool3;
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1139y(i11, c1116m2, str10, bool8, bool7, bool6, h12, list6, str5, aVar, str4, w02, str9, list5, y1Var3, b04, c1140y03, q12, str7);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13613b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (id.AbstractC3557B.K(r2, new O9.C1116m()) == false) goto L6;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        wd.y0 y0Var;
        C1139y c1139y = (C1139y) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1139y);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13613b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C1137x c1137x = C1139y.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        C1116m c1116m = c1139y.f13629a;
        if (!C10) {
            C1112k c1112k = EnumC1114l.Companion;
        }
        c10.q(pluginGeneratedSerialDescriptor, 0, C1106h.f13540a, c1116m);
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c1139y.f13630b;
        if (C11 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, dh.u0.f28491a, str);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool = c1139y.f13631c;
        if (C12 || bool != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, C2701g.f28450a, bool);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool2 = c1139y.f13632d;
        if (C13 || bool2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, C2701g.f28450a, bool2);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        Boolean bool3 = c1139y.f13633e;
        if (C14 || bool3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, C2701g.f28450a, bool3);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        H h10 = c1139y.f13634f;
        if (C15 || h10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 5, F.f13456a, h10);
        }
        boolean C16 = c10.C(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1139y.f13628s;
        List list = c1139y.f13635g;
        if (C16 || !AbstractC3557B.K(list, kf.v.f37483Y)) {
            c10.q(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list);
        }
        boolean C17 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c1139y.f13636h;
        if (C17 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 7, dh.u0.f28491a, str2);
        }
        boolean C18 = c10.C(pluginGeneratedSerialDescriptor);
        kotlinx.serialization.json.a aVar = c1139y.f13637i;
        if (C18 || aVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 8, C2906f.f29422a, aVar);
        }
        boolean C19 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = c1139y.f13638j;
        if (C19 || str3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 9, dh.u0.f28491a, str3);
        }
        boolean C20 = c10.C(pluginGeneratedSerialDescriptor);
        W0 w02 = c1139y.f13639k;
        if (C20 || w02 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 10, U0.f13502a, w02);
        }
        boolean C21 = c10.C(pluginGeneratedSerialDescriptor);
        String str4 = c1139y.f13640l;
        wd.O o10 = null;
        if (C21 || str4 != null) {
            wd.w0 w0Var = wd.w0.f48470a;
            if (str4 != null) {
                y0Var = new wd.y0(str4);
            } else {
                y0Var = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 11, w0Var, y0Var);
        }
        boolean C22 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = c1139y.f13641m;
        if (C22 || list2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 12, kSerializerArr[12], list2);
        }
        boolean C23 = c10.C(pluginGeneratedSerialDescriptor);
        y1 y1Var = c1139y.f13642n;
        if (C23 || y1Var != null) {
            c10.q(pluginGeneratedSerialDescriptor, 13, q1.f13584a, y1Var);
        }
        boolean C24 = c10.C(pluginGeneratedSerialDescriptor);
        B0 b02 = c1139y.f13643o;
        if (C24 || b02 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 14, C1142z0.f13651a, b02);
        }
        boolean C25 = c10.C(pluginGeneratedSerialDescriptor);
        C1140y0 c1140y0 = c1139y.f13644p;
        if (C25 || c1140y0 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 15, S.f13497a, c1140y0);
        }
        boolean C26 = c10.C(pluginGeneratedSerialDescriptor);
        Q q10 = c1139y.f13645q;
        if (C26 || q10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 16, O.f13483a, q10);
        }
        boolean C27 = c10.C(pluginGeneratedSerialDescriptor);
        String str5 = c1139y.f13646r;
        if (C27 || str5 != null) {
            wd.M m10 = wd.M.f48360a;
            if (str5 != null) {
                o10 = new wd.O(str5);
            }
            c10.q(pluginGeneratedSerialDescriptor, 17, m10, o10);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

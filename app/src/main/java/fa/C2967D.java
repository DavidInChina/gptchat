package fa;

import aa.EnumC1942e;
import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import dh.u0;
import ha.AbstractC3376t;
import ha.C3358a;
import ha.C3360c;
import ha.V;
import ha.X;
import id.AbstractC3557B;
import ja.C3929a;
import ja.C3931c;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6166A;
import wd.C6168C;
import wd.C6178a0;
import wd.C6182c0;
import wd.C6186e0;
import wd.C6190g0;
import wd.M;
import wd.O;
import wd.w0;
import wd.y0;

/* renamed from: fa.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2967D implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2967D f30003a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f30004b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, fa.D] */
    static {
        ?? obj = new Object();
        f30003a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.message.Message", obj, 28);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        pluginGeneratedSerialDescriptor.k("groupId", false);
        pluginGeneratedSerialDescriptor.k("role", false);
        pluginGeneratedSerialDescriptor.k("roleName", true);
        pluginGeneratedSerialDescriptor.k("voiceAction", true);
        pluginGeneratedSerialDescriptor.k("contributor", true);
        pluginGeneratedSerialDescriptor.k("content", false);
        pluginGeneratedSerialDescriptor.k("date", false);
        pluginGeneratedSerialDescriptor.k("isComplete", false);
        pluginGeneratedSerialDescriptor.k("isBlocked", false);
        pluginGeneratedSerialDescriptor.k("isFlagged", false);
        pluginGeneratedSerialDescriptor.k("isInterrupted", false);
        pluginGeneratedSerialDescriptor.k("toolMetadata", true);
        pluginGeneratedSerialDescriptor.k("recipient", false);
        pluginGeneratedSerialDescriptor.k("model", false);
        pluginGeneratedSerialDescriptor.k("isUserSystemMessage", true);
        pluginGeneratedSerialDescriptor.k("isVisuallyHiddenInConversation", true);
        pluginGeneratedSerialDescriptor.k("excludeAfterNextUserMessage", true);
        pluginGeneratedSerialDescriptor.k("customInstructions", true);
        pluginGeneratedSerialDescriptor.k("originalSharedLinkId", false);
        pluginGeneratedSerialDescriptor.k("citations", true);
        pluginGeneratedSerialDescriptor.k("attachments", true);
        pluginGeneratedSerialDescriptor.k("dalleOperationAttachment", true);
        pluginGeneratedSerialDescriptor.k("aggregateResult", true);
        pluginGeneratedSerialDescriptor.k("remoteMessageId", true);
        pluginGeneratedSerialDescriptor.k("gizmoId", true);
        pluginGeneratedSerialDescriptor.k("isStream", true);
        f30004b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C2969F.f30005C;
        C6178a0 c6178a0 = C6178a0.f48382a;
        KSerializer U02 = A7.b.U0(C6166A.f48310a);
        KSerializer kSerializer = kSerializerArr[3];
        KSerializer U03 = A7.b.U0(u0.f28491a);
        KSerializer kSerializer2 = kSerializerArr[5];
        KSerializer U04 = A7.b.U0(C3929a.f36090a);
        KSerializer kSerializer3 = kSerializerArr[7];
        KSerializer U05 = A7.b.U0(Zg.g.f23747a);
        KSerializer U06 = A7.b.U0(V.f32041a);
        KSerializer kSerializer4 = kSerializerArr[14];
        KSerializer U07 = A7.b.U0(Ba.a.f2006a);
        KSerializer U08 = A7.b.U0(w0.f48470a);
        KSerializer U09 = A7.b.U0(kSerializerArr[21]);
        KSerializer kSerializer5 = kSerializerArr[22];
        KSerializer kSerializer6 = kSerializerArr[23];
        KSerializer U010 = A7.b.U0(C3358a.f32054a);
        KSerializer U011 = A7.b.U0(c6178a0);
        KSerializer U012 = A7.b.U0(M.f48360a);
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{c6178a0, U02, c6178a0, kSerializer, U03, kSerializer2, U04, kSerializer3, U05, c2701g, c2701g, c2701g, c2701g, U06, kSerializer4, C6186e0.f48396a, c2701g, c2701g, c2701g, U07, U08, U09, kSerializer5, kSerializer6, U010, U011, U012, c2701g};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        String str;
        KSerializer[] kSerializerArr;
        X x10;
        String str2;
        EnumC2970G enumC2970G;
        Yg.p pVar;
        String str3;
        AbstractC2965B abstractC2965B;
        C3360c c3360c;
        C3931c c3931c;
        List list;
        EnumC1942e enumC1942e;
        List list2;
        String str4;
        EnumC2971H enumC2971H;
        String str5;
        String str6;
        Ba.c cVar;
        String str7;
        String str8;
        C6182c0 c6182c0;
        String str9;
        Ba.c cVar2;
        C6168C c6168c;
        String str10;
        String str11;
        C6182c0 c6182c02;
        String str12;
        List list3;
        String str13;
        EnumC2970G enumC2970G2;
        Yg.p pVar2;
        String str14;
        AbstractC2965B abstractC2965B2;
        X x11;
        C6190g0 c6190g0;
        int i10;
        y0 y0Var;
        C6182c0 c6182c03;
        O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f30004b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr2 = C2969F.f30005C;
        EnumC2970G enumC2970G3 = null;
        X x12 = null;
        String str15 = null;
        boolean z10 = true;
        String str16 = null;
        int i11 = 0;
        String str17 = null;
        Ba.c cVar3 = null;
        String str18 = null;
        AbstractC3376t abstractC3376t = null;
        List list4 = null;
        List list5 = null;
        C3360c c3360c2 = null;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        EnumC2971H enumC2971H2 = null;
        String str22 = null;
        EnumC1942e enumC1942e2 = null;
        C3931c c3931c2 = null;
        AbstractC2965B abstractC2965B3 = null;
        Yg.p pVar3 = null;
        boolean z18 = false;
        while (z10) {
            boolean z19 = z10;
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    enumC2970G = enumC2970G3;
                    str = str15;
                    pVar = pVar3;
                    x10 = x12;
                    str3 = str16;
                    abstractC2965B = abstractC2965B3;
                    c3360c = c3360c2;
                    c3931c = c3931c2;
                    list = list5;
                    enumC1942e = enumC1942e2;
                    list2 = list4;
                    str4 = str22;
                    kSerializerArr = kSerializerArr2;
                    enumC2971H = enumC2971H2;
                    str5 = str18;
                    str6 = str21;
                    cVar = cVar3;
                    str7 = str20;
                    z10 = false;
                    str17 = str17;
                    str20 = str7;
                    cVar3 = cVar;
                    str21 = str6;
                    str18 = str5;
                    enumC2971H2 = enumC2971H;
                    str2 = str4;
                    list4 = list2;
                    enumC1942e2 = enumC1942e;
                    list5 = list;
                    c3931c2 = c3931c;
                    c3360c2 = c3360c;
                    abstractC2965B3 = abstractC2965B;
                    str16 = str3;
                    pVar3 = pVar;
                    enumC2970G3 = enumC2970G;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr3 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr3;
                case 0:
                    enumC2970G = enumC2970G3;
                    str = str15;
                    pVar = pVar3;
                    x10 = x12;
                    str3 = str16;
                    abstractC2965B = abstractC2965B3;
                    c3360c = c3360c2;
                    c3931c = c3931c2;
                    list = list5;
                    enumC1942e = enumC1942e2;
                    list2 = list4;
                    str4 = str22;
                    kSerializerArr = kSerializerArr2;
                    enumC2971H = enumC2971H2;
                    str5 = str18;
                    str6 = str21;
                    cVar = cVar3;
                    str7 = str20;
                    C6178a0 c6178a0 = C6178a0.f48382a;
                    if (str19 != null) {
                        str8 = str17;
                        c6182c0 = new C6182c0(str19);
                    } else {
                        str8 = str17;
                        c6182c0 = null;
                    }
                    C6182c0 c6182c04 = (C6182c0) c10.n(pluginGeneratedSerialDescriptor, 0, c6178a0, c6182c0);
                    if (c6182c04 != null) {
                        str9 = c6182c04.f48393Y;
                    } else {
                        str9 = null;
                    }
                    i11 |= 1;
                    str19 = str9;
                    str17 = str8;
                    z10 = z19;
                    str20 = str7;
                    cVar3 = cVar;
                    str21 = str6;
                    str18 = str5;
                    enumC2971H2 = enumC2971H;
                    str2 = str4;
                    list4 = list2;
                    enumC1942e2 = enumC1942e;
                    list5 = list;
                    c3931c2 = c3931c;
                    c3360c2 = c3360c;
                    abstractC2965B3 = abstractC2965B;
                    str16 = str3;
                    pVar3 = pVar;
                    enumC2970G3 = enumC2970G;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr32 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr32;
                case 1:
                    enumC2970G = enumC2970G3;
                    str = str15;
                    pVar = pVar3;
                    x10 = x12;
                    str3 = str16;
                    abstractC2965B = abstractC2965B3;
                    c3360c = c3360c2;
                    c3931c = c3931c2;
                    list = list5;
                    enumC1942e = enumC1942e2;
                    list2 = list4;
                    str4 = str22;
                    kSerializerArr = kSerializerArr2;
                    enumC2971H = enumC2971H2;
                    str5 = str18;
                    str6 = str21;
                    C6166A c6166a = C6166A.f48310a;
                    if (str20 != null) {
                        cVar2 = cVar3;
                        c6168c = new C6168C(str20);
                    } else {
                        cVar2 = cVar3;
                        c6168c = null;
                    }
                    C6168C c6168c2 = (C6168C) c10.v(pluginGeneratedSerialDescriptor, 1, c6166a, c6168c);
                    if (c6168c2 != null) {
                        str10 = c6168c2.f48321a;
                    } else {
                        str10 = null;
                    }
                    i11 |= 2;
                    str20 = str10;
                    cVar3 = cVar2;
                    z10 = z19;
                    str21 = str6;
                    str18 = str5;
                    enumC2971H2 = enumC2971H;
                    str2 = str4;
                    list4 = list2;
                    enumC1942e2 = enumC1942e;
                    list5 = list;
                    c3931c2 = c3931c;
                    c3360c2 = c3360c;
                    abstractC2965B3 = abstractC2965B;
                    str16 = str3;
                    pVar3 = pVar;
                    enumC2970G3 = enumC2970G;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr322 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr322;
                case 2:
                    enumC2970G = enumC2970G3;
                    str = str15;
                    pVar = pVar3;
                    x10 = x12;
                    str3 = str16;
                    abstractC2965B = abstractC2965B3;
                    c3360c = c3360c2;
                    c3931c = c3931c2;
                    list = list5;
                    enumC1942e = enumC1942e2;
                    list2 = list4;
                    str4 = str22;
                    kSerializerArr = kSerializerArr2;
                    enumC2971H = enumC2971H2;
                    C6178a0 c6178a02 = C6178a0.f48382a;
                    if (str21 != null) {
                        str11 = str18;
                        c6182c02 = new C6182c0(str21);
                    } else {
                        str11 = str18;
                        c6182c02 = null;
                    }
                    C6182c0 c6182c05 = (C6182c0) c10.n(pluginGeneratedSerialDescriptor, 2, c6178a02, c6182c02);
                    if (c6182c05 != null) {
                        str12 = c6182c05.f48393Y;
                    } else {
                        str12 = null;
                    }
                    i11 |= 4;
                    str21 = str12;
                    str18 = str11;
                    z10 = z19;
                    enumC2971H2 = enumC2971H;
                    str2 = str4;
                    list4 = list2;
                    enumC1942e2 = enumC1942e;
                    list5 = list;
                    c3931c2 = c3931c;
                    c3360c2 = c3360c;
                    abstractC2965B3 = abstractC2965B;
                    str16 = str3;
                    pVar3 = pVar;
                    enumC2970G3 = enumC2970G;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr3222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr3222;
                case 3:
                    enumC2970G = enumC2970G3;
                    str = str15;
                    pVar = pVar3;
                    x10 = x12;
                    str3 = str16;
                    abstractC2965B = abstractC2965B3;
                    c3360c = c3360c2;
                    c3931c = c3931c2;
                    list = list5;
                    enumC1942e = enumC1942e2;
                    list3 = list4;
                    str13 = str22;
                    kSerializerArr = kSerializerArr2;
                    i11 |= 8;
                    enumC2971H2 = (EnumC2971H) c10.n(pluginGeneratedSerialDescriptor, 3, kSerializerArr2[3], enumC2971H2);
                    str2 = str13;
                    list4 = list3;
                    z10 = z19;
                    enumC1942e2 = enumC1942e;
                    list5 = list;
                    c3931c2 = c3931c;
                    c3360c2 = c3360c;
                    abstractC2965B3 = abstractC2965B;
                    str16 = str3;
                    pVar3 = pVar;
                    enumC2970G3 = enumC2970G;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr32222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr32222;
                case 4:
                    enumC2970G = enumC2970G3;
                    str = str15;
                    pVar = pVar3;
                    x10 = x12;
                    str3 = str16;
                    abstractC2965B = abstractC2965B3;
                    c3360c = c3360c2;
                    c3931c = c3931c2;
                    list = list5;
                    enumC1942e = enumC1942e2;
                    list3 = list4;
                    str13 = (String) c10.v(pluginGeneratedSerialDescriptor, 4, u0.f28491a, str22);
                    i11 |= 16;
                    kSerializerArr = kSerializerArr2;
                    str2 = str13;
                    list4 = list3;
                    z10 = z19;
                    enumC1942e2 = enumC1942e;
                    list5 = list;
                    c3931c2 = c3931c;
                    c3360c2 = c3360c;
                    abstractC2965B3 = abstractC2965B;
                    str16 = str3;
                    pVar3 = pVar;
                    enumC2970G3 = enumC2970G;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr322222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr322222;
                case 5:
                    enumC2970G2 = enumC2970G3;
                    str = str15;
                    pVar2 = pVar3;
                    x10 = x12;
                    str14 = str16;
                    abstractC2965B2 = abstractC2965B3;
                    C3360c c3360c3 = c3360c2;
                    i11 |= 32;
                    enumC1942e2 = (EnumC1942e) c10.n(pluginGeneratedSerialDescriptor, 5, kSerializerArr2[5], enumC1942e2);
                    list5 = list5;
                    z10 = z19;
                    c3931c2 = c3931c2;
                    c3360c2 = c3360c3;
                    abstractC2965B3 = abstractC2965B2;
                    str16 = str14;
                    pVar3 = pVar2;
                    enumC2970G3 = enumC2970G2;
                    String str23 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str23;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr3222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr3222222;
                case 6:
                    enumC2970G2 = enumC2970G3;
                    str = str15;
                    pVar2 = pVar3;
                    x10 = x12;
                    str14 = str16;
                    abstractC2965B2 = abstractC2965B3;
                    i11 |= 64;
                    c3931c2 = (C3931c) c10.v(pluginGeneratedSerialDescriptor, 6, C3929a.f36090a, c3931c2);
                    c3360c2 = c3360c2;
                    z10 = z19;
                    abstractC2965B3 = abstractC2965B2;
                    str16 = str14;
                    pVar3 = pVar2;
                    enumC2970G3 = enumC2970G2;
                    String str232 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str232;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr32222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr32222222;
                case 7:
                    enumC2970G2 = enumC2970G3;
                    str = str15;
                    pVar2 = pVar3;
                    x10 = x12;
                    i11 |= 128;
                    abstractC2965B3 = (AbstractC2965B) c10.n(pluginGeneratedSerialDescriptor, 7, kSerializerArr2[7], abstractC2965B3);
                    str16 = str16;
                    z10 = z19;
                    pVar3 = pVar2;
                    enumC2970G3 = enumC2970G2;
                    String str2322 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str2322;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr322222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr322222222;
                case 8:
                    str = str15;
                    x10 = x12;
                    i11 |= 256;
                    pVar3 = (Yg.p) c10.v(pluginGeneratedSerialDescriptor, 8, Zg.g.f23747a, pVar3);
                    z10 = z19;
                    enumC2970G3 = enumC2970G3;
                    String str23222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str23222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr3222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr3222222222;
                case 9:
                    str = str15;
                    x10 = x12;
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 9);
                    i11 |= 512;
                    z10 = z19;
                    String str232222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str232222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr32222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr32222222222;
                case 10:
                    str = str15;
                    x10 = x12;
                    z12 = c10.q(pluginGeneratedSerialDescriptor, 10);
                    i11 |= 1024;
                    z10 = z19;
                    String str2322222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str2322222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr322222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr322222222222;
                case 11:
                    str = str15;
                    x10 = x12;
                    z13 = c10.q(pluginGeneratedSerialDescriptor, 11);
                    i11 |= 2048;
                    z10 = z19;
                    String str23222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str23222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr3222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr3222222222222;
                case 12:
                    str = str15;
                    x10 = x12;
                    z14 = c10.q(pluginGeneratedSerialDescriptor, 12);
                    i11 |= 4096;
                    z10 = z19;
                    String str232222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str232222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr32222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr32222222222222;
                case 13:
                    str = str15;
                    i11 |= 8192;
                    x10 = (X) c10.v(pluginGeneratedSerialDescriptor, 13, V.f32041a, x12);
                    z10 = z19;
                    String str2322222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str2322222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr322222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr322222222222222;
                case 14:
                    x11 = x12;
                    enumC2970G3 = (EnumC2970G) c10.n(pluginGeneratedSerialDescriptor, 14, kSerializerArr2[14], enumC2970G3);
                    i11 |= 16384;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str23222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str23222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr3222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr3222222222222222;
                case 15:
                    x11 = x12;
                    C6186e0 c6186e0 = C6186e0.f48396a;
                    if (str17 != null) {
                        c6190g0 = new C6190g0(str17);
                    } else {
                        c6190g0 = null;
                    }
                    C6190g0 c6190g02 = (C6190g0) c10.n(pluginGeneratedSerialDescriptor, 15, c6186e0, c6190g0);
                    if (c6190g02 != null) {
                        str17 = c6190g02.f48419a;
                    } else {
                        str17 = null;
                    }
                    i10 = 32768;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str232222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str232222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr32222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr32222222222222222;
                case 16:
                    x11 = x12;
                    z15 = c10.q(pluginGeneratedSerialDescriptor, 16);
                    i10 = 65536;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str2322222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str2322222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr322222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr322222222222222222;
                case 17:
                    x11 = x12;
                    z16 = c10.q(pluginGeneratedSerialDescriptor, 17);
                    i10 = 131072;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str23222222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str23222222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr3222222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr3222222222222222222;
                case 18:
                    x11 = x12;
                    z17 = c10.q(pluginGeneratedSerialDescriptor, 18);
                    i10 = 262144;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str232222222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str232222222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr32222222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr32222222222222222222;
                case 19:
                    x11 = x12;
                    cVar3 = (Ba.c) c10.v(pluginGeneratedSerialDescriptor, 19, Ba.a.f2006a, cVar3);
                    i10 = 524288;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str2322222222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str2322222222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr322222222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr322222222222222222222;
                case 20:
                    x11 = x12;
                    w0 w0Var = w0.f48470a;
                    if (str18 != null) {
                        y0Var = new y0(str18);
                    } else {
                        y0Var = null;
                    }
                    y0 y0Var2 = (y0) c10.v(pluginGeneratedSerialDescriptor, 20, w0Var, y0Var);
                    if (y0Var2 != null) {
                        str18 = y0Var2.f48473a;
                    } else {
                        str18 = null;
                    }
                    i10 = 1048576;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str23222222222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str23222222222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr3222222222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr3222222222222222222222;
                case 21:
                    x11 = x12;
                    abstractC3376t = (AbstractC3376t) c10.v(pluginGeneratedSerialDescriptor, 21, kSerializerArr2[21], abstractC3376t);
                    i10 = 2097152;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str232222222222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str232222222222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr32222222222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr32222222222222222222222;
                case 22:
                    x11 = x12;
                    list4 = (List) c10.n(pluginGeneratedSerialDescriptor, 22, kSerializerArr2[22], list4);
                    i10 = 4194304;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str2322222222222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str2322222222222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr322222222222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr322222222222222222222222;
                case 23:
                    x11 = x12;
                    list5 = (List) c10.n(pluginGeneratedSerialDescriptor, 23, kSerializerArr2[23], list5);
                    i10 = 8388608;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str23222222222222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str23222222222222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr3222222222222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr3222222222222222222222222;
                case 24:
                    x11 = x12;
                    c3360c2 = (C3360c) c10.v(pluginGeneratedSerialDescriptor, 24, C3358a.f32054a, c3360c2);
                    i10 = 16777216;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str232222222222222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str232222222222222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr32222222222222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr32222222222222222222222222;
                case 25:
                    x11 = x12;
                    C6178a0 c6178a03 = C6178a0.f48382a;
                    if (str16 != null) {
                        c6182c03 = new C6182c0(str16);
                    } else {
                        c6182c03 = null;
                    }
                    C6182c0 c6182c06 = (C6182c0) c10.v(pluginGeneratedSerialDescriptor, 25, c6178a03, c6182c03);
                    if (c6182c06 != null) {
                        str16 = c6182c06.f48393Y;
                    } else {
                        str16 = null;
                    }
                    i10 = 33554432;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str2322222222222222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str2322222222222222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr322222222222222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr322222222222222222222222222;
                case 26:
                    M m10 = M.f48360a;
                    x11 = x12;
                    if (str15 != null) {
                        o10 = new O(str15);
                    } else {
                        o10 = null;
                    }
                    O o11 = (O) c10.v(pluginGeneratedSerialDescriptor, 26, m10, o10);
                    if (o11 != null) {
                        str15 = o11.f48362a;
                    } else {
                        str15 = null;
                    }
                    i10 = 67108864;
                    i11 |= i10;
                    str = str15;
                    z10 = z19;
                    x10 = x11;
                    String str23222222222222222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str23222222222222222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr3222222222222222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr3222222222222222222222222222;
                case 27:
                    z18 = c10.q(pluginGeneratedSerialDescriptor, 27);
                    i11 |= 134217728;
                    str = str15;
                    z10 = z19;
                    x10 = x12;
                    String str232222222222222222222222 = str22;
                    kSerializerArr = kSerializerArr2;
                    str2 = str232222222222222222222222;
                    x12 = x10;
                    str15 = str;
                    KSerializer[] kSerializerArr32222222222222222222222222222 = kSerializerArr;
                    str22 = str2;
                    kSerializerArr2 = kSerializerArr32222222222222222222222222222;
                default:
                    throw new C2004o(t10);
            }
        }
        EnumC2970G enumC2970G4 = enumC2970G3;
        String str24 = str15;
        String str25 = str16;
        String str26 = str18;
        String str27 = str21;
        AbstractC2965B abstractC2965B4 = abstractC2965B3;
        Ba.c cVar4 = cVar3;
        C3360c c3360c4 = c3360c2;
        String str28 = str20;
        C3931c c3931c3 = c3931c2;
        String str29 = str17;
        List list6 = list5;
        String str30 = str19;
        EnumC1942e enumC1942e3 = enumC1942e2;
        List list7 = list4;
        String str31 = str22;
        c10.b(pluginGeneratedSerialDescriptor);
        return new C2969F(i11, str30, str28, str27, enumC2971H2, str31, enumC1942e3, c3931c3, abstractC2965B4, pVar3, z11, z12, z13, z14, x12, enumC2970G4, str29, z15, z16, z17, cVar4, str26, abstractC3376t, list7, list6, c3360c4, str25, str24, z18);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f30004b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6168C c6168c;
        y0 y0Var;
        C6182c0 c6182c0;
        C2969F c2969f = (C2969F) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2969f);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f30004b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C2968E c2968e = C2969F.Companion;
        C6178a0 c6178a0 = C6178a0.f48382a;
        c10.i(pluginGeneratedSerialDescriptor, 0, c6178a0, new C6182c0(c2969f.f30008a));
        C6166A c6166a = C6166A.f48310a;
        O o10 = null;
        String str = c2969f.f30009b;
        if (str != null) {
            c6168c = new C6168C(str);
        } else {
            c6168c = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 1, c6166a, c6168c);
        c10.i(pluginGeneratedSerialDescriptor, 2, c6178a0, new C6182c0(c2969f.f30010c));
        KSerializer[] kSerializerArr = C2969F.f30005C;
        c10.i(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], c2969f.f30011d);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c2969f.f30012e;
        if (C10 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, u0.f28491a, str2);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        EnumC1942e enumC1942e = c2969f.f30013f;
        if (C11 || enumC1942e != EnumC1942e.f24045h0) {
            c10.i(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], enumC1942e);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        C3931c c3931c = c2969f.f30014g;
        if (C12 || c3931c != null) {
            c10.q(pluginGeneratedSerialDescriptor, 6, C3929a.f36090a, c3931c);
        }
        c10.i(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], c2969f.f30015h);
        c10.q(pluginGeneratedSerialDescriptor, 8, Zg.g.f23747a, c2969f.f30016i);
        c10.p(pluginGeneratedSerialDescriptor, 9, c2969f.f30017j);
        c10.p(pluginGeneratedSerialDescriptor, 10, c2969f.f30018k);
        c10.p(pluginGeneratedSerialDescriptor, 11, c2969f.f30019l);
        c10.p(pluginGeneratedSerialDescriptor, 12, c2969f.f30020m);
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        X x10 = c2969f.f30021n;
        if (C13 || x10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 13, V.f32041a, x10);
        }
        c10.i(pluginGeneratedSerialDescriptor, 14, kSerializerArr[14], c2969f.f30022o);
        c10.i(pluginGeneratedSerialDescriptor, 15, C6186e0.f48396a, new C6190g0(c2969f.f30023p));
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = c2969f.f30024q;
        if (C14 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 16, z10);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z11 = c2969f.f30025r;
        if (C15 || z11) {
            c10.p(pluginGeneratedSerialDescriptor, 17, z11);
        }
        boolean C16 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z12 = c2969f.f30026s;
        if (C16 || z12) {
            c10.p(pluginGeneratedSerialDescriptor, 18, z12);
        }
        boolean C17 = c10.C(pluginGeneratedSerialDescriptor);
        Ba.c cVar = c2969f.f30027t;
        if (C17 || cVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 19, Ba.a.f2006a, cVar);
        }
        w0 w0Var = w0.f48470a;
        String str3 = c2969f.f30028u;
        if (str3 != null) {
            y0Var = new y0(str3);
        } else {
            y0Var = null;
        }
        c10.q(pluginGeneratedSerialDescriptor, 20, w0Var, y0Var);
        boolean C18 = c10.C(pluginGeneratedSerialDescriptor);
        AbstractC3376t abstractC3376t = c2969f.f30029v;
        if (C18 || abstractC3376t != null) {
            c10.q(pluginGeneratedSerialDescriptor, 21, kSerializerArr[21], abstractC3376t);
        }
        boolean C19 = c10.C(pluginGeneratedSerialDescriptor);
        kf.v vVar = kf.v.f37483Y;
        List list = c2969f.f30030w;
        if (C19 || !AbstractC3557B.K(list, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 22, kSerializerArr[22], list);
        }
        boolean C20 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = c2969f.f30031x;
        if (C20 || !AbstractC3557B.K(list2, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 23, kSerializerArr[23], list2);
        }
        boolean C21 = c10.C(pluginGeneratedSerialDescriptor);
        C3360c c3360c = c2969f.f30032y;
        if (C21 || c3360c != null) {
            c10.q(pluginGeneratedSerialDescriptor, 24, C3358a.f32054a, c3360c);
        }
        boolean C22 = c10.C(pluginGeneratedSerialDescriptor);
        String str4 = c2969f.f30033z;
        if (C22 || str4 != null) {
            if (str4 != null) {
                c6182c0 = new C6182c0(str4);
            } else {
                c6182c0 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 25, c6178a0, c6182c0);
        }
        boolean C23 = c10.C(pluginGeneratedSerialDescriptor);
        String str5 = c2969f.f30006A;
        if (C23 || str5 != null) {
            M m10 = M.f48360a;
            if (str5 != null) {
                o10 = new O(str5);
            }
            c10.q(pluginGeneratedSerialDescriptor, 26, m10, o10);
        }
        boolean C24 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z13 = c2969f.f30007B;
        if (C24 || z13) {
            c10.p(pluginGeneratedSerialDescriptor, 27, z13);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

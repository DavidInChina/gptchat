package cb;

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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6186e0;
import wd.C6190g0;

/* renamed from: cb.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2357a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2357a f26503a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26504b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, cb.a] */
    static {
        ?? obj = new Object();
        f26503a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.Gizmo", obj, 26);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("description", true);
        pluginGeneratedSerialDescriptor.k("author", true);
        pluginGeneratedSerialDescriptor.k("website", true);
        pluginGeneratedSerialDescriptor.k("primarySocial", true);
        pluginGeneratedSerialDescriptor.k("socials", true);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ICON, true);
        pluginGeneratedSerialDescriptor.k("model", true);
        pluginGeneratedSerialDescriptor.k("reportable", true);
        pluginGeneratedSerialDescriptor.k("reviewable", true);
        pluginGeneratedSerialDescriptor.k("acceptsFeedback", true);
        pluginGeneratedSerialDescriptor.k("lastInteractionTime", true);
        pluginGeneratedSerialDescriptor.k("usesFunctionCalls", true);
        pluginGeneratedSerialDescriptor.k("noLongerAvailable", true);
        pluginGeneratedSerialDescriptor.k("workspaceDisabled", true);
        pluginGeneratedSerialDescriptor.k("memoryDisabled", true);
        pluginGeneratedSerialDescriptor.k("pinned", true);
        pluginGeneratedSerialDescriptor.k("conversationCount", true);
        pluginGeneratedSerialDescriptor.k("thirdParty", true);
        pluginGeneratedSerialDescriptor.k("privacyLabel", true);
        pluginGeneratedSerialDescriptor.k("tools", true);
        pluginGeneratedSerialDescriptor.k("starterPrompts", true);
        pluginGeneratedSerialDescriptor.k("commands", true);
        pluginGeneratedSerialDescriptor.k("productFeatures", true);
        pluginGeneratedSerialDescriptor.k("shareRecipient", true);
        f26504b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C2334C.f26436A;
        u0 u0Var = u0.f28491a;
        KSerializer U02 = A7.b.U0(u0Var);
        KSerializer U03 = A7.b.U0(u0Var);
        KSerializer U04 = A7.b.U0(u0Var);
        KSerializer U05 = A7.b.U0(C2371l.f26526a);
        KSerializer kSerializer = kSerializerArr[6];
        KSerializer U06 = A7.b.U0(C6186e0.f48396a);
        KSerializer U07 = A7.b.U0(dh.S.f28417a);
        KSerializer U08 = A7.b.U0(u0Var);
        KSerializer U09 = A7.b.U0(u0Var);
        KSerializer kSerializer2 = kSerializerArr[21];
        KSerializer kSerializer3 = kSerializerArr[22];
        KSerializer kSerializer4 = kSerializerArr[23];
        KSerializer U010 = A7.b.U0(Sc.o.f16541a);
        KSerializer U011 = A7.b.U0(kSerializerArr[25]);
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{wd.M.f48360a, u0Var, U02, U03, U04, U05, kSerializer, C2365f.f26516a, U06, c2701g, c2701g, c2701g, U07, c2701g, c2701g, c2701g, c2701g, c2701g, U08, c2701g, U09, kSerializer2, kSerializer3, kSerializer4, U010, U011};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        List list;
        C6190g0 c6190g0;
        int i10;
        KSerializer[] kSerializerArr;
        EnumC2370k enumC2370k;
        C2373n c2373n;
        Sc.u uVar;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        wd.O o10;
        KSerializer[] kSerializerArr2;
        List list5;
        KSerializer[] kSerializerArr3;
        int i11;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26504b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr4 = C2334C.f26436A;
        String str4 = null;
        Long l10 = null;
        String str5 = null;
        boolean z10 = true;
        C2367h c2367h = null;
        int i12 = 0;
        List list6 = null;
        String str6 = null;
        List list7 = null;
        List list8 = null;
        Sc.u uVar2 = null;
        EnumC2370k enumC2370k2 = null;
        List list9 = null;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String str7 = null;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        String str8 = null;
        boolean z19 = false;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        C2373n c2373n2 = null;
        while (z10) {
            boolean z20 = z10;
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    kSerializerArr = kSerializerArr4;
                    enumC2370k = enumC2370k2;
                    c2373n = c2373n2;
                    z10 = false;
                    uVar = uVar2;
                    str = str11;
                    list2 = list8;
                    str2 = str10;
                    list3 = list7;
                    str3 = str9;
                    list6 = list6;
                    kSerializerArr4 = kSerializerArr;
                    str9 = str3;
                    list7 = list3;
                    str10 = str2;
                    list8 = list2;
                    str11 = str;
                    uVar2 = uVar;
                    c2373n2 = c2373n;
                    enumC2370k2 = enumC2370k;
                case 0:
                    kSerializerArr = kSerializerArr4;
                    enumC2370k = enumC2370k2;
                    List list10 = list9;
                    c2373n = c2373n2;
                    uVar = uVar2;
                    str = str11;
                    list2 = list8;
                    str2 = str10;
                    list3 = list7;
                    str3 = str9;
                    wd.M m10 = wd.M.f48360a;
                    if (str8 != null) {
                        list4 = list6;
                        o10 = new wd.O(str8);
                    } else {
                        list4 = list6;
                        o10 = null;
                    }
                    wd.O o11 = (wd.O) c10.n(pluginGeneratedSerialDescriptor, 0, m10, o10);
                    if (o11 != null) {
                        str8 = o11.f48362a;
                    } else {
                        str8 = null;
                    }
                    i12 |= 1;
                    list9 = list10;
                    list6 = list4;
                    z10 = z20;
                    kSerializerArr4 = kSerializerArr;
                    str9 = str3;
                    list7 = list3;
                    str10 = str2;
                    list8 = list2;
                    str11 = str;
                    uVar2 = uVar;
                    c2373n2 = c2373n;
                    enumC2370k2 = enumC2370k;
                case 1:
                    kSerializerArr2 = kSerializerArr4;
                    enumC2370k = enumC2370k2;
                    c2373n = c2373n2;
                    uVar = uVar2;
                    str = str11;
                    list2 = list8;
                    str2 = str10;
                    list5 = list7;
                    str7 = c10.r(pluginGeneratedSerialDescriptor, 1);
                    i12 |= 2;
                    list7 = list5;
                    z10 = z20;
                    kSerializerArr4 = kSerializerArr2;
                    str10 = str2;
                    list8 = list2;
                    str11 = str;
                    uVar2 = uVar;
                    c2373n2 = c2373n;
                    enumC2370k2 = enumC2370k;
                case 2:
                    kSerializerArr2 = kSerializerArr4;
                    enumC2370k = enumC2370k2;
                    c2373n = c2373n2;
                    uVar = uVar2;
                    str = str11;
                    list2 = list8;
                    str2 = str10;
                    list5 = list7;
                    str9 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str9);
                    i12 |= 4;
                    list9 = list9;
                    list7 = list5;
                    z10 = z20;
                    kSerializerArr4 = kSerializerArr2;
                    str10 = str2;
                    list8 = list2;
                    str11 = str;
                    uVar2 = uVar;
                    c2373n2 = c2373n;
                    enumC2370k2 = enumC2370k;
                case 3:
                    enumC2370k = enumC2370k2;
                    c2373n = c2373n2;
                    uVar = uVar2;
                    str = str11;
                    str10 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str10);
                    i12 |= 8;
                    list9 = list9;
                    list8 = list8;
                    z10 = z20;
                    kSerializerArr4 = kSerializerArr4;
                    str11 = str;
                    uVar2 = uVar;
                    c2373n2 = c2373n;
                    enumC2370k2 = enumC2370k;
                case 4:
                    enumC2370k = enumC2370k2;
                    c2373n = c2373n2;
                    str11 = (String) c10.v(pluginGeneratedSerialDescriptor, 4, u0.f28491a, str11);
                    i12 |= 16;
                    list9 = list9;
                    uVar2 = uVar2;
                    z10 = z20;
                    kSerializerArr4 = kSerializerArr4;
                    c2373n2 = c2373n;
                    enumC2370k2 = enumC2370k;
                case 5:
                    kSerializerArr3 = kSerializerArr4;
                    c2373n2 = (C2373n) c10.v(pluginGeneratedSerialDescriptor, 5, C2371l.f26526a, c2373n2);
                    i12 |= 32;
                    list9 = list9;
                    z10 = z20;
                    enumC2370k2 = enumC2370k2;
                    kSerializerArr4 = kSerializerArr3;
                case 6:
                    kSerializerArr3 = kSerializerArr4;
                    list9 = (List) c10.n(pluginGeneratedSerialDescriptor, 6, kSerializerArr4[6], list9);
                    i12 |= 64;
                    z10 = z20;
                    kSerializerArr4 = kSerializerArr3;
                case 7:
                    list = list9;
                    c2367h = (C2367h) c10.n(pluginGeneratedSerialDescriptor, 7, C2365f.f26516a, c2367h);
                    i12 |= 128;
                    z10 = z20;
                    list9 = list;
                case 8:
                    list = list9;
                    C6186e0 c6186e0 = C6186e0.f48396a;
                    if (str5 != null) {
                        c6190g0 = new C6190g0(str5);
                    } else {
                        c6190g0 = null;
                    }
                    C6190g0 c6190g02 = (C6190g0) c10.v(pluginGeneratedSerialDescriptor, 8, c6186e0, c6190g0);
                    if (c6190g02 != null) {
                        str5 = c6190g02.f48419a;
                    } else {
                        str5 = null;
                    }
                    i12 |= 256;
                    z10 = z20;
                    list9 = list;
                case 9:
                    z11 = c10.q(pluginGeneratedSerialDescriptor, 9);
                    i12 |= 512;
                    z10 = z20;
                case 10:
                    z12 = c10.q(pluginGeneratedSerialDescriptor, 10);
                    i12 |= 1024;
                    z10 = z20;
                case 11:
                    z13 = c10.q(pluginGeneratedSerialDescriptor, 11);
                    i12 |= 2048;
                    z10 = z20;
                case 12:
                    list = list9;
                    l10 = (Long) c10.v(pluginGeneratedSerialDescriptor, 12, dh.S.f28417a, l10);
                    i12 |= 4096;
                    z10 = z20;
                    list9 = list;
                case 13:
                    z14 = c10.q(pluginGeneratedSerialDescriptor, 13);
                    i12 |= 8192;
                    z10 = z20;
                case 14:
                    z15 = c10.q(pluginGeneratedSerialDescriptor, 14);
                    i12 |= 16384;
                    z10 = z20;
                case 15:
                    z16 = c10.q(pluginGeneratedSerialDescriptor, 15);
                    i11 = 32768;
                    i12 |= i11;
                    z10 = z20;
                case 16:
                    z17 = c10.q(pluginGeneratedSerialDescriptor, 16);
                    i11 = 65536;
                    i12 |= i11;
                    z10 = z20;
                case 17:
                    z18 = c10.q(pluginGeneratedSerialDescriptor, 17);
                    i11 = 131072;
                    i12 |= i11;
                    z10 = z20;
                case 18:
                    list = list9;
                    str4 = (String) c10.v(pluginGeneratedSerialDescriptor, 18, u0.f28491a, str4);
                    i10 = 262144;
                    i12 |= i10;
                    z10 = z20;
                    list9 = list;
                case 19:
                    z19 = c10.q(pluginGeneratedSerialDescriptor, 19);
                    i11 = 524288;
                    i12 |= i11;
                    z10 = z20;
                case 20:
                    list = list9;
                    str6 = (String) c10.v(pluginGeneratedSerialDescriptor, 20, u0.f28491a, str6);
                    i10 = 1048576;
                    i12 |= i10;
                    z10 = z20;
                    list9 = list;
                case 21:
                    list = list9;
                    list6 = (List) c10.n(pluginGeneratedSerialDescriptor, 21, kSerializerArr4[21], list6);
                    i10 = 2097152;
                    i12 |= i10;
                    z10 = z20;
                    list9 = list;
                case 22:
                    list = list9;
                    list7 = (List) c10.n(pluginGeneratedSerialDescriptor, 22, kSerializerArr4[22], list7);
                    i10 = 4194304;
                    i12 |= i10;
                    z10 = z20;
                    list9 = list;
                case 23:
                    list = list9;
                    list8 = (List) c10.n(pluginGeneratedSerialDescriptor, 23, kSerializerArr4[23], list8);
                    i10 = 8388608;
                    i12 |= i10;
                    z10 = z20;
                    list9 = list;
                case 24:
                    list = list9;
                    uVar2 = (Sc.u) c10.v(pluginGeneratedSerialDescriptor, 24, Sc.o.f16541a, uVar2);
                    i10 = 16777216;
                    i12 |= i10;
                    z10 = z20;
                    list9 = list;
                case 25:
                    list = list9;
                    enumC2370k2 = (EnumC2370k) c10.v(pluginGeneratedSerialDescriptor, 25, kSerializerArr4[25], enumC2370k2);
                    i10 = 33554432;
                    i12 |= i10;
                    z10 = z20;
                    list9 = list;
                default:
                    throw new C2004o(t10);
            }
        }
        EnumC2370k enumC2370k3 = enumC2370k2;
        C2373n c2373n3 = c2373n2;
        Sc.u uVar3 = uVar2;
        String str12 = str11;
        List list11 = list8;
        String str13 = str10;
        List list12 = list7;
        String str14 = str9;
        List list13 = list6;
        c10.b(pluginGeneratedSerialDescriptor);
        String str15 = str6;
        return new C2334C(i12, str8, str7, str14, str13, str12, c2373n3, list9, c2367h, str5, z11, z12, z13, l10, z14, z15, z16, z17, z18, str4, z19, str15, list13, list12, list11, uVar3, enumC2370k3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26504b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2334C c2334c = (C2334C) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2334c);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26504b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C2359b c2359b = C2334C.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, wd.M.f48360a, new wd.O(c2334c.f26438a));
        c10.z(1, c2334c.f26439b, pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c2334c.f26440c;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c2334c.f26441d;
        if (C11 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str3 = c2334c.f26442e;
        if (C12 || str3 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, u0.f28491a, str3);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        C2373n c2373n = c2334c.f26443f;
        if (C13 || c2373n != null) {
            c10.q(pluginGeneratedSerialDescriptor, 5, C2371l.f26526a, c2373n);
        }
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        kf.v vVar = kf.v.f37483Y;
        KSerializer[] kSerializerArr = C2334C.f26436A;
        List list = c2334c.f26444g;
        if (C14 || !AbstractC3557B.K(list, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list);
        }
        boolean C15 = c10.C(pluginGeneratedSerialDescriptor);
        C6190g0 c6190g0 = null;
        C2367h c2367h = c2334c.f26445h;
        if (C15 || !AbstractC3557B.K(c2367h, new C2367h(null))) {
            c10.i(pluginGeneratedSerialDescriptor, 7, C2365f.f26516a, c2367h);
        }
        boolean C16 = c10.C(pluginGeneratedSerialDescriptor);
        String str4 = c2334c.f26446i;
        if (C16 || str4 != null) {
            C6186e0 c6186e0 = C6186e0.f48396a;
            if (str4 != null) {
                c6190g0 = new C6190g0(str4);
            }
            c10.q(pluginGeneratedSerialDescriptor, 8, c6186e0, c6190g0);
        }
        boolean C17 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = c2334c.f26447j;
        if (C17 || z10) {
            c10.p(pluginGeneratedSerialDescriptor, 9, z10);
        }
        boolean C18 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z11 = c2334c.f26448k;
        if (C18 || z11) {
            c10.p(pluginGeneratedSerialDescriptor, 10, z11);
        }
        boolean C19 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z12 = c2334c.f26449l;
        if (C19 || z12) {
            c10.p(pluginGeneratedSerialDescriptor, 11, z12);
        }
        boolean C20 = c10.C(pluginGeneratedSerialDescriptor);
        Long l10 = c2334c.f26450m;
        if (C20 || l10 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 12, dh.S.f28417a, l10);
        }
        boolean C21 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z13 = c2334c.f26451n;
        if (C21 || z13) {
            c10.p(pluginGeneratedSerialDescriptor, 13, z13);
        }
        boolean C22 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z14 = c2334c.f26452o;
        if (C22 || z14) {
            c10.p(pluginGeneratedSerialDescriptor, 14, z14);
        }
        boolean C23 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z15 = c2334c.f26453p;
        if (C23 || z15) {
            c10.p(pluginGeneratedSerialDescriptor, 15, z15);
        }
        boolean C24 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z16 = c2334c.f26454q;
        if (C24 || z16) {
            c10.p(pluginGeneratedSerialDescriptor, 16, z16);
        }
        boolean C25 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z17 = c2334c.f26455r;
        if (C25 || z17) {
            c10.p(pluginGeneratedSerialDescriptor, 17, z17);
        }
        boolean C26 = c10.C(pluginGeneratedSerialDescriptor);
        String str5 = c2334c.f26456s;
        if (C26 || str5 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 18, u0.f28491a, str5);
        }
        boolean C27 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z18 = c2334c.f26457t;
        if (C27 || z18) {
            c10.p(pluginGeneratedSerialDescriptor, 19, z18);
        }
        boolean C28 = c10.C(pluginGeneratedSerialDescriptor);
        String str6 = c2334c.f26458u;
        if (C28 || str6 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 20, u0.f28491a, str6);
        }
        boolean C29 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = c2334c.f26459v;
        if (C29 || !AbstractC3557B.K(list2, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 21, kSerializerArr[21], list2);
        }
        boolean C30 = c10.C(pluginGeneratedSerialDescriptor);
        List list3 = c2334c.f26460w;
        if (C30 || !AbstractC3557B.K(list3, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 22, kSerializerArr[22], list3);
        }
        boolean C31 = c10.C(pluginGeneratedSerialDescriptor);
        List list4 = c2334c.f26461x;
        if (C31 || !AbstractC3557B.K(list4, vVar)) {
            c10.i(pluginGeneratedSerialDescriptor, 23, kSerializerArr[23], list4);
        }
        boolean C32 = c10.C(pluginGeneratedSerialDescriptor);
        Sc.u uVar = c2334c.f26462y;
        if (C32 || uVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 24, Sc.o.f16541a, uVar);
        }
        boolean C33 = c10.C(pluginGeneratedSerialDescriptor);
        EnumC2370k enumC2370k = c2334c.f26463z;
        if (C33 || enumC2370k != null) {
            c10.q(pluginGeneratedSerialDescriptor, 25, kSerializerArr[25], enumC2370k);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}

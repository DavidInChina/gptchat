package Uc;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;
import wd.C6167B;
import wd.C6168C;

/* renamed from: Uc.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1422g extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public static final C1422g f17674i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final List f17675j = AbstractC4344b.G0(r9.y.N0(ParameterNames.ID, C1417b.f17644h0), r9.y.N0("remoteId", C1417b.f17645i0), r9.y.N0("sharedId", C1417b.f17646j0), r9.y.N0("gizmoId", C1417b.f17647k0), r9.y.N0("model", C1417b.f17648l0), r9.y.N0("fromOauth", C1417b.f17649m0), r9.y.N0(SDPKeywords.PROMPT, C1417b.f17650n0), r9.y.N0("entryPoint", C1417b.f17651o0));

    /* renamed from: k  reason: collision with root package name */
    public static final String f17676k = "conversation?id={id}&remoteId={remoteId}&sharedId={sharedId}&gizmoId={gizmoId}&model={model}&fromOauth={fromOauth}&prompt={prompt}&entryPoint={entryPoint}";

    public static EnumC1421f o1(androidx.lifecycle.P p10) {
        EnumC1421f enumC1421f = (EnumC1421f) p10.b("entryPoint");
        if (enumC1421f == null) {
            return EnumC1421f.f17672j0;
        }
        return enumC1421f;
    }

    public static String q1(String str, String str2) {
        AbstractC3557B.c0("gizmoId", str);
        if (str2 == null) {
            String concat = "conversation?gizmoId=".concat(str);
            AbstractC3557B.c0("internalRoute", concat);
            return concat;
        }
        String str3 = "conversation?gizmoId=" + str + "&prompt=" + str2;
        AbstractC3557B.c0("internalRoute", str3);
        return str3;
    }

    public static String r1(EnumC1421f enumC1421f) {
        AbstractC3557B.c0("entryPoint", enumC1421f);
        C6168C.Companion.getClass();
        String str = "conversation?id=" + C6167B.a() + "&entryPoint=" + enumC1421f;
        AbstractC3557B.c0("internalRoute", str);
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1422g)) {
            return false;
        }
        C1422g c1422g = (C1422g) obj;
        return true;
    }

    public final int hashCode() {
        return 490330881;
    }

    @Override // Ad.l
    public final List n0() {
        return f17675j;
    }

    public final String p1(String str) {
        AbstractC3557B.c0("remoteId", str);
        String str2 = "conversation?id=" + str + "&remoteId=" + str;
        AbstractC3557B.c0("internalRoute", str2);
        return str2;
    }

    public final String toString() {
        return "Conversation";
    }

    @Override // Ad.l
    public final String x0() {
        return f17676k;
    }
}

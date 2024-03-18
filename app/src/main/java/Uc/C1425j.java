package Uc;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: Uc.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1425j extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public static final C1425j f17681i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final List f17682j = AbstractC4344b.G0(r9.y.N0(ParameterNames.ID, C1417b.f17656t0), r9.y.N0("messageId", C1417b.f17657u0), r9.y.N0("encodedSandboxUrl", C1417b.f17658v0));

    public static String o1(String str, String str2, String str3) {
        AbstractC3557B.c0("conversationId", str);
        AbstractC3557B.c0("messageId", str2);
        AbstractC3557B.c0("sandboxUrl", str3);
        String b10 = Fe.c.b(str3);
        StringBuilder t10 = android.gov.nist.core.a.t("conversation/spreadsheet?id=", str, "&messageId=", str2, "&encodedSandboxUrl=");
        t10.append(b10);
        String sb2 = t10.toString();
        AbstractC3557B.c0("internalRoute", sb2);
        return sb2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1425j)) {
            return false;
        }
        C1425j c1425j = (C1425j) obj;
        return true;
    }

    public final int hashCode() {
        return 2051993099;
    }

    @Override // Ad.l
    public final List n0() {
        return f17682j;
    }

    public final String toString() {
        return "ConversationSpreadsheet";
    }

    @Override // Ad.l
    public final String x0() {
        return "conversation/spreadsheet?id={id}&messageId={messageId}&encodedSandboxUrl={encodedSandboxUrl}";
    }
}

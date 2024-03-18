package tb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f46056a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46057b;

    /* renamed from: c  reason: collision with root package name */
    public final String f46058c;

    public g(String str, String str2, String str3) {
        AbstractC3557B.c0("conversationId", str);
        AbstractC3557B.c0("messageId", str2);
        AbstractC3557B.c0("sandboxUrl", str3);
        this.f46056a = str;
        this.f46057b = str2;
        this.f46058c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3557B.K(this.f46056a, gVar.f46056a) && AbstractC3557B.K(this.f46057b, gVar.f46057b) && AbstractC3557B.K(this.f46058c, gVar.f46058c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46058c.hashCode() + E9.f.v(this.f46057b, this.f46056a.hashCode() * 31, 31);
    }

    public final String toString() {
        return R.a.t(android.gov.nist.core.a.t("MessageSpreadsheetKey(conversationId=", C6168C.a(this.f46056a), ", messageId=", C6182c0.a(this.f46057b), ", sandboxUrl="), this.f46058c, Separators.RPAREN);
    }
}

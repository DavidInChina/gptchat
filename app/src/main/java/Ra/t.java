package Ra;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final String f15243a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15244b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15245c;

    public t(String str, String str2, String str3) {
        AbstractC3557B.c0("conversationId", str);
        AbstractC3557B.c0("messageId", str2);
        AbstractC3557B.c0("sandboxUrl", str3);
        this.f15243a = str;
        this.f15244b = str2;
        this.f15245c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (AbstractC3557B.K(this.f15243a, tVar.f15243a) && AbstractC3557B.K(this.f15244b, tVar.f15244b) && AbstractC3557B.K(this.f15245c, tVar.f15245c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15245c.hashCode() + E9.f.v(this.f15244b, this.f15243a.hashCode() * 31, 31);
    }

    public final String toString() {
        return R.a.t(android.gov.nist.core.a.t("SpreadsheetKey(conversationId=", C6168C.a(this.f15243a), ", messageId=", C6182c0.a(this.f15244b), ", sandboxUrl="), this.f15245c, Separators.RPAREN);
    }
}

package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;
import wd.C6182c0;

/* loaded from: classes2.dex */
public final class j0 implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31467a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31468b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31469c;

    public j0(String str, String str2, String str3) {
        AbstractC3557B.c0("conversationId", str);
        AbstractC3557B.c0("messageId", str2);
        AbstractC3557B.c0("sandboxUrl", str3);
        this.f31467a = str;
        this.f31468b = str2;
        this.f31469c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (AbstractC3557B.K(this.f31467a, j0Var.f31467a) && AbstractC3557B.K(this.f31468b, j0Var.f31468b) && AbstractC3557B.K(this.f31469c, j0Var.f31469c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31469c.hashCode() + E9.f.v(this.f31468b, this.f31467a.hashCode() * 31, 31);
    }

    public final String toString() {
        return R.a.t(android.gov.nist.core.a.t("ViewSpreadsheet(conversationId=", C6168C.a(this.f31467a), ", messageId=", C6182c0.a(this.f31468b), ", sandboxUrl="), this.f31469c, Separators.RPAREN);
    }
}

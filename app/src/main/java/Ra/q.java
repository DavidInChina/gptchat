package Ra;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class q extends Aa.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f15235a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15236b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15237c;

    public q(String str, String str2, String str3) {
        this.f15235a = str;
        this.f15236b = str2;
        this.f15237c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (AbstractC3557B.K(this.f15235a, qVar.f15235a) && AbstractC3557B.K(this.f15236b, qVar.f15236b) && AbstractC3557B.K(this.f15237c, qVar.f15237c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15237c.hashCode() + E9.f.v(this.f15236b, this.f15235a.hashCode() * 31, 31);
    }

    public final String toString() {
        return R.a.t(android.gov.nist.core.a.t("Click(conversationId=", C6168C.a(this.f15235a), ", messageId=", C6182c0.a(this.f15236b), ", sandboxUrl="), this.f15237c, Separators.RPAREN);
    }
}

package Ra;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class r extends Aa.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f15238a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15239b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15240c;

    public r(String str, String str2, String str3) {
        this.f15238a = str;
        this.f15239b = str2;
        this.f15240c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3557B.K(this.f15238a, rVar.f15238a) && AbstractC3557B.K(this.f15239b, rVar.f15239b) && AbstractC3557B.K(this.f15240c, rVar.f15240c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15240c.hashCode() + E9.f.v(this.f15239b, this.f15238a.hashCode() * 31, 31);
    }

    public final String toString() {
        return R.a.t(android.gov.nist.core.a.t("Close(conversationId=", C6168C.a(this.f15238a), ", messageId=", C6182c0.a(this.f15239b), ", sandboxUrl="), this.f15240c, Separators.RPAREN);
    }
}

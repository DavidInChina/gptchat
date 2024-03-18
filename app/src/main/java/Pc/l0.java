package pc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes.dex */
public final class l0 extends m0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f43008a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43009b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f43010c;

    /* renamed from: d  reason: collision with root package name */
    public final S f43011d;

    public l0(List list, String str, Integer num, S s10) {
        AbstractC3557B.c0("packages", list);
        AbstractC3557B.c0("subscriptionAction", s10);
        this.f43008a = list;
        this.f43009b = str;
        this.f43010c = num;
        this.f43011d = s10;
    }

    public static l0 e(l0 l0Var, String str, Integer num, int i10) {
        List list = l0Var.f43008a;
        if ((i10 & 2) != 0) {
            str = l0Var.f43009b;
        }
        if ((i10 & 4) != 0) {
            num = l0Var.f43010c;
        }
        S s10 = l0Var.f43011d;
        l0Var.getClass();
        AbstractC3557B.c0("packages", list);
        AbstractC3557B.c0("subscriptionAction", s10);
        return new l0(list, str, num, s10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (!AbstractC3557B.K(this.f43008a, l0Var.f43008a)) {
            return false;
        }
        String str = this.f43009b;
        String str2 = l0Var.f43009b;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f43010c, l0Var.f43010c) && this.f43011d == l0Var.f43011d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f43008a.hashCode() * 31;
        int i11 = 0;
        String str = this.f43009b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        Integer num = this.f43010c;
        if (num != null) {
            i11 = num.hashCode();
        }
        return this.f43011d.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        String str2 = this.f43009b;
        if (str2 == null) {
            str = "null";
        } else {
            str = C5128g.a(str2);
        }
        return "PackagesLoaded(packages=" + this.f43008a + ", currentlyPurchasingPackageId=" + str + ", errorTextForAttemptedPurchase=" + this.f43010c + ", subscriptionAction=" + this.f43011d + Separators.RPAREN;
    }
}

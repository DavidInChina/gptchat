package B6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f1951a;

    public m(String str) {
        this.f1951a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && AbstractC3557B.K(this.f1951a, ((m) obj).f1951a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1951a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("View(id="), this.f1951a, Separators.RPAREN);
    }
}

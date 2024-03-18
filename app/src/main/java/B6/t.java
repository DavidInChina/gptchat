package B6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final String f1973a;

    public t(String str) {
        this.f1973a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && AbstractC3557B.K(this.f1973a, ((t) obj).f1973a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1973a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("View(id="), this.f1973a, Separators.RPAREN);
    }
}

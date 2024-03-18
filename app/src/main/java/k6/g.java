package K6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f9507a;

    public g(String str) {
        this.f9507a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && AbstractC3557B.K(this.f9507a, ((g) obj).f9507a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9507a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Session(id="), this.f9507a, Separators.RPAREN);
    }
}

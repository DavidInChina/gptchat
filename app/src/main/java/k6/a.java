package K6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f9485a;

    public a(String str) {
        this.f9485a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && AbstractC3557B.K(this.f9485a, ((a) obj).f9485a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9485a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Application(id="), this.f9485a, Separators.RPAREN);
    }
}

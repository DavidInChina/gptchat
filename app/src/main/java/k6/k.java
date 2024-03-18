package K6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f9516a;

    public k(String str) {
        this.f9516a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && AbstractC3557B.K(this.f9516a, ((k) obj).f9516a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9516a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("View(id="), this.f9516a, Separators.RPAREN);
    }
}

package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class y extends o {

    /* renamed from: g  reason: collision with root package name */
    public final String f15176g;

    public y(String str) {
        this.f15176g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && AbstractC3557B.K(this.f15176g, ((y) obj).f15176g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15176g.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("AstStrongEmphasis(delimiter="), this.f15176g, Separators.RPAREN);
    }
}

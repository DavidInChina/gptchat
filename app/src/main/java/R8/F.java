package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class F extends o {

    /* renamed from: g  reason: collision with root package name */
    public final String f15139g;

    public F(String str) {
        this.f15139g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof F) && AbstractC3557B.K(this.f15139g, ((F) obj).f15139g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15139g.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("AstText(literal="), this.f15139g, Separators.RPAREN);
    }
}

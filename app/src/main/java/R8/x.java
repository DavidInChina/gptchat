package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class x extends o {

    /* renamed from: g  reason: collision with root package name */
    public final String f15175g = "~~";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && AbstractC3557B.K(this.f15175g, ((x) obj).f15175g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15175g.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("AstStrikethrough(delimiter="), this.f15175g, Separators.RPAREN);
    }
}

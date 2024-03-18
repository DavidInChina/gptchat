package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class l extends o {

    /* renamed from: g  reason: collision with root package name */
    public final String f15154g;

    public l(String str) {
        this.f15154g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && AbstractC3557B.K(this.f15154g, ((l) obj).f15154g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15154g.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("AstHtmlInline(literal="), this.f15154g, Separators.RPAREN);
    }
}

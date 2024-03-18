package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class k extends AbstractC1252e {

    /* renamed from: g  reason: collision with root package name */
    public final String f15153g;

    public k(String str) {
        this.f15153g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && AbstractC3557B.K(this.f15153g, ((k) obj).f15153g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15153g.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("AstHtmlBlock(literal="), this.f15153g, Separators.RPAREN);
    }
}

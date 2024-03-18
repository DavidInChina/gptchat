package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class n extends AbstractC1252e {

    /* renamed from: g  reason: collision with root package name */
    public final String f15157g;

    public n(String str) {
        this.f15157g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && AbstractC3557B.K(this.f15157g, ((n) obj).f15157g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15157g.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("AstIndentedCodeBlock(literal="), this.f15157g, Separators.RPAREN);
    }
}

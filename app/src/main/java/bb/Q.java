package bb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class Q implements T {

    /* renamed from: a  reason: collision with root package name */
    public final String f25740a;

    public Q(String str) {
        AbstractC3557B.c0("query", str);
        this.f25740a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Q) && AbstractC3557B.K(this.f25740a, ((Q) obj).f25740a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25740a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("QueryChange(query="), this.f25740a, Separators.RPAREN);
    }
}

package Ab;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f762a;

    public g(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f762a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && AbstractC3557B.K(this.f762a, ((g) obj).f762a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f762a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f762a, Separators.RPAREN);
    }
}

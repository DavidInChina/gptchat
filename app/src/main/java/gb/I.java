package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* loaded from: classes.dex */
public final class I implements L {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f31364a;

    public I(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f31364a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof I) && AbstractC3557B.K(this.f31364a, ((I) obj).f31364a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31364a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f31364a, Separators.RPAREN);
    }
}

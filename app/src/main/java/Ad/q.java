package Ad;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* loaded from: classes2.dex */
public final class q implements r {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f827a;

    public q(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f827a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && AbstractC3557B.K(this.f827a, ((q) obj).f827a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f827a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f827a, Separators.RPAREN);
    }
}

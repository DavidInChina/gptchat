package pd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* loaded from: classes2.dex */
public final class n extends s {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f43065a;

    public n(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f43065a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && AbstractC3557B.K(this.f43065a, ((n) obj).f43065a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43065a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("InitializationFailed(error="), this.f43065a, Separators.RPAREN);
    }
}

package T9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f16974a;

    public f(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f16974a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3557B.K(this.f16974a, ((f) obj).f16974a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16974a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("Error(error="), this.f16974a, Separators.RPAREN);
    }
}

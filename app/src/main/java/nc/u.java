package nc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* loaded from: classes.dex */
public final class u implements v {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f40260a;

    public u(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f40260a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u) && AbstractC3557B.K(this.f40260a, ((u) obj).f40260a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40260a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f40260a, Separators.RPAREN);
    }
}

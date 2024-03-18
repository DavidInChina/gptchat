package nc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f40243a;

    public k(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f40243a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && AbstractC3557B.K(this.f40243a, ((k) obj).f40243a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40243a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f40243a, Separators.RPAREN);
    }
}

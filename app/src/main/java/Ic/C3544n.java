package ic;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: ic.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3544n implements AbstractC3545o {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f33060a;

    public C3544n(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f33060a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3544n) && AbstractC3557B.K(this.f33060a, ((C3544n) obj).f33060a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33060a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f33060a, Separators.RPAREN);
    }
}

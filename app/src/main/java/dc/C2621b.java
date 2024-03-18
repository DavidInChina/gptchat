package dc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: dc.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2621b implements AbstractC2622c {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f28201a;

    public C2621b(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f28201a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2621b) && AbstractC3557B.K(this.f28201a, ((C2621b) obj).f28201a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28201a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f28201a, Separators.RPAREN);
    }
}

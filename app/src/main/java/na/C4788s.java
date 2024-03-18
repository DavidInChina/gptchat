package na;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: na.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4788s implements AbstractC4791t {

    /* renamed from: a  reason: collision with root package name */
    public final wd.q0 f40106a;

    public C4788s(wd.q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f40106a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4788s) && AbstractC3557B.K(this.f40106a, ((C4788s) obj).f40106a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40106a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f40106a, Separators.RPAREN);
    }
}

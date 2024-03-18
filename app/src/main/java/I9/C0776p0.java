package I9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: I9.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776p0 implements AbstractC0778q0 {

    /* renamed from: a  reason: collision with root package name */
    public final wd.q0 f8427a;

    public C0776p0(wd.q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f8427a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0776p0) && AbstractC3557B.K(this.f8427a, ((C0776p0) obj).f8427a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8427a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f8427a, Separators.RPAREN);
    }
}

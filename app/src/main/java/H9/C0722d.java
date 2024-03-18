package H9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: H9.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722d implements AbstractC0723e {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f7514a;

    public C0722d(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f7514a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0722d) && AbstractC3557B.K(this.f7514a, ((C0722d) obj).f7514a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7514a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f7514a, Separators.RPAREN);
    }
}

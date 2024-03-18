package Rb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: Rb.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1268n implements AbstractC1270p {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f15364a;

    public C1268n(q0 q0Var) {
        this.f15364a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1268n) && AbstractC3557B.K(this.f15364a, ((C1268n) obj).f15364a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15364a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f15364a, Separators.RPAREN);
    }
}

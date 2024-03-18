package ab;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: ab.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1959m implements AbstractC1960n {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f24117a;

    public C1959m(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f24117a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1959m) && AbstractC3557B.K(this.f24117a, ((C1959m) obj).f24117a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24117a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f24117a, Separators.RPAREN);
    }
}

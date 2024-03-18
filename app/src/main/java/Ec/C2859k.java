package ec;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: ec.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2859k implements AbstractC2860l {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f29238a;

    public C2859k(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f29238a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2859k) && AbstractC3557B.K(this.f29238a, ((C2859k) obj).f29238a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29238a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f29238a, Separators.RPAREN);
    }
}

package ic;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: ic.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3529G implements AbstractC3530H {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f32955a;

    public C3529G(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f32955a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3529G) && AbstractC3557B.K(this.f32955a, ((C3529G) obj).f32955a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32955a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f32955a, Separators.RPAREN);
    }
}

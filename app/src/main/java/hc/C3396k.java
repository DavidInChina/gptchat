package hc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: hc.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3396k implements AbstractC3397l {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f32211a;

    public C3396k(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f32211a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3396k) && AbstractC3557B.K(this.f32211a, ((C3396k) obj).f32211a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32211a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f32211a, Separators.RPAREN);
    }
}

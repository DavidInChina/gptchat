package hc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: hc.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3383A implements AbstractC3384B {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f32141a;

    public C3383A(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f32141a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3383A) && AbstractC3557B.K(this.f32141a, ((C3383A) obj).f32141a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32141a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f32141a, Separators.RPAREN);
    }
}

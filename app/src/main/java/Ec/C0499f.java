package Ec;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: Ec.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0499f implements AbstractC0501h {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f4620a;

    public C0499f(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f4620a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0499f) && AbstractC3557B.K(this.f4620a, ((C0499f) obj).f4620a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4620a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f4620a, Separators.RPAREN);
    }
}

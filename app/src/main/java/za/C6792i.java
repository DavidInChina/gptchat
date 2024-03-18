package za;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: za.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6792i implements AbstractC6794k {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f51789a;

    public C6792i(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f51789a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6792i) && AbstractC3557B.K(this.f51789a, ((C6792i) obj).f51789a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51789a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f51789a, Separators.RPAREN);
    }
}

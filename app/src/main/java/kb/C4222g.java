package kb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.q0;

/* renamed from: kb.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4222g implements AbstractC4224i {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f37256a;

    public C4222g(q0 q0Var) {
        AbstractC3557B.c0("error", q0Var);
        this.f37256a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4222g) && AbstractC3557B.K(this.f37256a, ((C4222g) obj).f37256a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37256a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("ShowError(error="), this.f37256a, Separators.RPAREN);
    }
}

package wd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class l0 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f48438a;

    public /* synthetic */ l0(q0 q0Var) {
        this.f48438a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f48438a, ((l0) obj).f48438a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f48438a.hashCode();
    }

    public final String toString() {
        return E9.f.z(new StringBuilder("Failure(error="), this.f48438a, Separators.RPAREN);
    }
}

package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class d0 implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31397a;

    public d0(String str) {
        this.f31397a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        if (AbstractC3557B.K(this.f31397a, ((d0) obj).f31397a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31397a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("RateGizmo(gizmoId=", wd.O.a(this.f31397a), Separators.RPAREN);
    }
}

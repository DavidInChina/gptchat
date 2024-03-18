package I9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class S0 implements T0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8232a;

    public S0(String str) {
        this.f8232a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0)) {
            return false;
        }
        if (AbstractC3557B.K(this.f8232a, ((S0) obj).f8232a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8232a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("NavigateTo(route=", AbstractC3557B.F2(this.f8232a), Separators.RPAREN);
    }
}

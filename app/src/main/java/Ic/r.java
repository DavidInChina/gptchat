package ic;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class r implements AbstractC3549t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f33063a;

    public r(boolean z10) {
        this.f33063a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && this.f33063a == ((r) obj).f33063a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f33063a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("SetEnabled(active="), this.f33063a, Separators.RPAREN);
    }
}

package bb;

import android.gov.nist.core.Separators;
import cb.C2350T;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class N implements T {

    /* renamed from: a  reason: collision with root package name */
    public final C2350T f25736a;

    public N(C2350T c2350t) {
        this.f25736a = c2350t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof N) && AbstractC3557B.K(this.f25736a, ((N) obj).f25736a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        C2350T c2350t = this.f25736a;
        if (c2350t == null) {
            return 0;
        }
        return c2350t.hashCode();
    }

    public final String toString() {
        return "CategoryChange(category=" + this.f25736a + Separators.RPAREN;
    }
}

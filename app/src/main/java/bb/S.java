package bb;

import android.gov.nist.core.Separators;
import cb.C2350T;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class S implements T {

    /* renamed from: a  reason: collision with root package name */
    public final C2350T f25741a;

    public S(C2350T c2350t) {
        AbstractC3557B.c0("category", c2350t);
        this.f25741a = c2350t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof S) && AbstractC3557B.K(this.f25741a, ((S) obj).f25741a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25741a.hashCode();
    }

    public final String toString() {
        return "SearchLoadMoreShown(category=" + this.f25741a + Separators.RPAREN;
    }
}

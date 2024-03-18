package bb;

import android.gov.nist.core.Separators;
import cb.C2350T;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class O implements T {

    /* renamed from: a  reason: collision with root package name */
    public final C2350T f25737a;

    public O(C2350T c2350t) {
        AbstractC3557B.c0("category", c2350t);
        this.f25737a = c2350t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof O) && AbstractC3557B.K(this.f25737a, ((O) obj).f25737a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25737a.hashCode();
    }

    public final String toString() {
        return "CategoryLoadMoreShown(category=" + this.f25737a + Separators.RPAREN;
    }
}

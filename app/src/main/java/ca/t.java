package Ca;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class t {
    public static final s Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final C f2851a;

    public t(int i10, C c10) {
        if (1 == (i10 & 1)) {
            this.f2851a = c10;
        } else {
            R4.b.e2(i10, 1, r.f2850b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && AbstractC3557B.K(this.f2851a, ((t) obj).f2851a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2851a.hashCode();
    }

    public final String toString() {
        return "CustomInstructionsUpdateError(detail=" + this.f2851a + Separators.RPAREN;
    }
}

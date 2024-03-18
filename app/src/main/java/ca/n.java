package Ca;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class n {
    public static final m Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2843a;

    public n(int i10, boolean z10) {
        if (1 == (i10 & 1)) {
            this.f2843a = z10;
        } else {
            R4.b.e2(i10, 1, l.f2842b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && this.f2843a == ((n) obj).f2843a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2843a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("CustomInstructionsEnabledUpdateRequest(enabled="), this.f2843a, Separators.RPAREN);
    }

    public n(boolean z10) {
        this.f2843a = z10;
    }
}

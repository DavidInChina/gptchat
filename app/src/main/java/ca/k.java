package Ca;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class k {
    public static final j Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2840a;

    public k(int i10, boolean z10) {
        if (1 == (i10 & 1)) {
            this.f2840a = z10;
        } else {
            R4.b.e2(i10, 1, i.f2839b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && this.f2840a == ((k) obj).f2840a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2840a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("CustomInstructionsEnabledResponse(enabled="), this.f2840a, Separators.RPAREN);
    }
}

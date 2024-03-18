package E9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class l {
    public static final k Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final r f4561a;

    public l(int i10, r rVar) {
        if ((i10 & 1) == 0) {
            this.f4561a = new r();
        } else {
            this.f4561a = rVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && AbstractC3557B.K(this.f4561a, ((l) obj).f4561a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4561a.hashCode();
    }

    public final String toString() {
        return "ComplianceResponse(termsOfUse=" + this.f4561a + Separators.RPAREN;
    }
}

package Jc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class n {
    public static final m Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f9059a;

    public n(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f9059a = str;
        } else {
            R4.b.e2(i10, 1, l.f9058b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && AbstractC3557B.K(this.f9059a, ((n) obj).f9059a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9059a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Retrieval(status="), this.f9059a, Separators.RPAREN);
    }
}

package Wc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class g {
    public static final f Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f20904a;

    public g(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f20904a = str;
        } else {
            R4.b.e2(i10, 1, e.f20903b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && AbstractC3557B.K(this.f20904a, ((g) obj).f20904a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20904a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Detail(cfDetails="), this.f20904a, Separators.RPAREN);
    }
}

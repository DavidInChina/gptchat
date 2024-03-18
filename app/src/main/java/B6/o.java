package B6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f1964a;

    public o(String str) {
        this.f1964a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && AbstractC3557B.K(this.f1964a, ((o) obj).f1964a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1964a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Action(id="), this.f1964a, Separators.RPAREN);
    }
}

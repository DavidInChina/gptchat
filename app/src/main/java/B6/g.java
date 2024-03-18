package B6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f1929a;

    public g(String str) {
        this.f1929a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && AbstractC3557B.K(this.f1929a, ((g) obj).f1929a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1929a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("View(id="), this.f1929a, Separators.RPAREN);
    }
}

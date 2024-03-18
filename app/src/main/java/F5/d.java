package F5;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f5037a;

    public d(String str) {
        this.f5037a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && AbstractC3557B.K(this.f5037a, ((d) obj).f5037a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5037a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("BatchId(id="), this.f5037a, Separators.RPAREN);
    }
}

package B6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f1942a;

    public i(String str) {
        this.f1942a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && AbstractC3557B.K(this.f1942a, ((i) obj).f1942a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1942a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Action(id="), this.f1942a, Separators.RPAREN);
    }
}

package B6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1872a;

    public a(String str) {
        this.f1872a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && AbstractC3557B.K(this.f1872a, ((a) obj).f1872a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1872a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Action(id="), this.f1872a, Separators.RPAREN);
    }
}

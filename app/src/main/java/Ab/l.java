package Ab;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class l implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f768a = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && AbstractC3557B.K(this.f768a, ((l) obj).f768a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f768a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("AipOauthState(url="), this.f768a, Separators.RPAREN);
    }
}

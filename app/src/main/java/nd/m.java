package nd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f40292a;

    public /* synthetic */ m(String str) {
        this.f40292a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f40292a, ((m) obj).f40292a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f40292a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("IntegrityCookie(value="), this.f40292a, Separators.RPAREN);
    }
}

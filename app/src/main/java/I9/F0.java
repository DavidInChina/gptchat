package I9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class F0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8168a;

    public F0(String str) {
        AbstractC3557B.c0("query", str);
        this.f8168a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof F0) && AbstractC3557B.K(this.f8168a, ((F0) obj).f8168a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8168a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Search(query="), this.f8168a, Separators.RPAREN);
    }
}

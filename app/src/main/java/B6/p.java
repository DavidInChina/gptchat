package B6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String f1965a;

    public p(String str) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f1965a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && AbstractC3557B.K(this.f1965a, ((p) obj).f1965a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1965a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Application(id="), this.f1965a, Separators.RPAREN);
    }
}

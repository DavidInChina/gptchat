package B6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f1944a;

    public k(String str) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f1944a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && AbstractC3557B.K(this.f1944a, ((k) obj).f1944a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1944a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Session(id="), this.f1944a, Separators.RPAREN);
    }
}

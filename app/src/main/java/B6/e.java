package B6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f1926a;

    public e(String str) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f1926a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && AbstractC3557B.K(this.f1926a, ((e) obj).f1926a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1926a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Session(id="), this.f1926a, Separators.RPAREN);
    }
}

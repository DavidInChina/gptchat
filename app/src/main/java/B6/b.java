package B6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f1873a;

    public b(String str) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f1873a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && AbstractC3557B.K(this.f1873a, ((b) obj).f1873a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1873a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Application(id="), this.f1873a, Separators.RPAREN);
    }
}

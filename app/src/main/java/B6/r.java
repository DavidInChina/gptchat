package B6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f1968a;

    public r(String str) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f1968a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && AbstractC3557B.K(this.f1968a, ((r) obj).f1968a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1968a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Session(id="), this.f1968a, Separators.RPAREN);
    }
}

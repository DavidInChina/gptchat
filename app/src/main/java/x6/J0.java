package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49021a;

    public J0(String str) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f49021a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof J0) && AbstractC3557B.K(this.f49021a, ((J0) obj).f49021a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49021a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Application(id="), this.f49021a, Separators.RPAREN);
    }
}

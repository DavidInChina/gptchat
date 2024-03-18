package K6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f9510a;

    public i(String str) {
        AbstractC3557B.c0(ParameterNames.VERSION, str);
        this.f9510a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && AbstractC3557B.K(this.f9510a, ((i) obj).f9510a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9510a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Tracer(version="), this.f9510a, Separators.RPAREN);
    }
}

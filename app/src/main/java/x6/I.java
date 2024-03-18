package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a  reason: collision with root package name */
    public final String f49005a;

    public I(String str) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f49005a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof I) && AbstractC3557B.K(this.f49005a, ((I) obj).f49005a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49005a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Application(id="), this.f49005a, Separators.RPAREN);
    }
}

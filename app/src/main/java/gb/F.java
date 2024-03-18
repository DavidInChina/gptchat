package gb;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class F implements L {

    /* renamed from: a  reason: collision with root package name */
    public final String f31361a;

    public F(String str) {
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        this.f31361a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof F) && AbstractC3557B.K(this.f31361a, ((F) obj).f31361a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31361a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("CopyToClipboard(text="), this.f31361a, Separators.RPAREN);
    }
}

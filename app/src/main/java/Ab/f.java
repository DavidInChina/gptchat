package Ab;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public final String f761a;

    public f(String str) {
        this.f761a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        if (AbstractC3557B.K(this.f761a, ((f) obj).f761a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f761a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("NavigateTo(route=", AbstractC3557B.F2(this.f761a), Separators.RPAREN);
    }
}

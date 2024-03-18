package Ad;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class p implements r {

    /* renamed from: a  reason: collision with root package name */
    public final String f826a;

    public p(String str) {
        this.f826a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        if (AbstractC3557B.K(this.f826a, ((p) obj).f826a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f826a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("NavigateTo(route=", AbstractC3557B.F2(this.f826a), Separators.RPAREN);
    }
}

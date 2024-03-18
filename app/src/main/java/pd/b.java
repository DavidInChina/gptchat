package pd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f43057a;

    public b(String str) {
        AbstractC3557B.c0("error", str);
        this.f43057a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && AbstractC3557B.K(this.f43057a, ((b) obj).f43057a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43057a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ShowError(error="), this.f43057a, Separators.RPAREN);
    }
}

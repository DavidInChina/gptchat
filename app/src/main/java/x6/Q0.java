package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49066a;

    public Q0(String str) {
        this.f49066a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Q0) && AbstractC3557B.K(this.f49066a, ((Q0) obj).f49066a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49066a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ContainerView(id="), this.f49066a, Separators.RPAREN);
    }
}

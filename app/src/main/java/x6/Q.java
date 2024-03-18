package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public final String f49065a;

    public Q(String str) {
        this.f49065a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Q) && AbstractC3557B.K(this.f49065a, ((Q) obj).f49065a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49065a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ContainerView(id="), this.f49065a, Separators.RPAREN);
    }
}

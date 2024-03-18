package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final List f48982a;

    public H(List list) {
        this.f48982a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof H) && AbstractC3557B.K(this.f48982a, ((H) obj).f48982a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48982a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("Action(id="), this.f48982a, Separators.RPAREN);
    }
}

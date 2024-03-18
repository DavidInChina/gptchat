package S8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f16308a;

    public b0(List list) {
        this.f16308a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b0) && AbstractC3557B.K(this.f16308a, ((b0) obj).f16308a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16308a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("TableRow(cells="), this.f16308a, Separators.RPAREN);
    }
}

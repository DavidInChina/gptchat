package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f49006a;

    public I0(List list) {
        this.f49006a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof I0) && AbstractC3557B.K(this.f49006a, ((I0) obj).f49006a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49006a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("Action(id="), this.f49006a, Separators.RPAREN);
    }
}

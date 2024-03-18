package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* renamed from: x6.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6312l0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f49371a;

    public C6312l0(List list) {
        this.f49371a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6312l0) && AbstractC3557B.K(this.f49371a, ((C6312l0) obj).f49371a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49371a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("Action(id="), this.f49371a, Separators.RPAREN);
    }
}

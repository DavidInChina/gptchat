package R9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f15185b = {new C2695d(u0.f28491a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f15186a;

    public f(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f15186a = list;
        } else {
            R4.b.e2(i10, 1, d.f15184b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3557B.K(this.f15186a, ((f) obj).f15186a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15186a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("ApiSuggestionsResponse(suggestions="), this.f15186a, Separators.RPAREN);
    }
}

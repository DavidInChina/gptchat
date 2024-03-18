package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class J {
    public static final I Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f23473b = {new C2695d(N.f23488a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f23474a;

    public J(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f23474a = list;
        } else {
            R4.b.e2(i10, 1, H.f23465b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof J) && AbstractC3557B.K(this.f23474a, ((J) obj).f23474a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23474a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("ApiGizmoCuts(cuts="), this.f23474a, Separators.RPAREN);
    }
}

package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class M {
    public static final L Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Z f23484a;

    public M(int i10, Z z10) {
        if (1 == (i10 & 1)) {
            this.f23484a = z10;
        } else {
            R4.b.e2(i10, 1, K.f23478b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof M) && AbstractC3557B.K(this.f23484a, ((M) obj).f23484a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23484a.hashCode();
    }

    public final String toString() {
        return "ApiGizmoDefinition(resource=" + this.f23484a + Separators.RPAREN;
    }
}

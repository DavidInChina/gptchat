package Vc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class i {
    public static final h Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final e f18545a;

    public i(int i10, e eVar) {
        if (1 == (i10 & 1)) {
            this.f18545a = eVar;
        } else {
            R4.b.e2(i10, 1, f.f18540b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && AbstractC3557B.K(this.f18545a, ((i) obj).f18545a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18545a.hashCode();
    }

    public final String toString() {
        return "ErrorResponse(detail=" + this.f18545a + Separators.RPAREN;
    }
}

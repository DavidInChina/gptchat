package Gc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f6268a;

    public f(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f6268a = str;
        } else {
            R4.b.e2(i10, 1, d.f6267b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3557B.K(this.f6268a, ((f) obj).f6268a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6268a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("WhisperResponse(text="), this.f6268a, Separators.RPAREN);
    }
}

package Jc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class p {
    public static final i Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final o f9061a;

    public p(int i10, o oVar) {
        if (1 == (i10 & 1)) {
            this.f9061a = oVar;
        } else {
            R4.b.e2(i10, 1, h.f9054b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && AbstractC3557B.K(this.f9061a, ((p) obj).f9061a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9061a.hashCode();
    }

    public final String toString() {
        return "FileServiceFileStatusResponse(metadata=" + this.f9061a + Separators.RPAREN;
    }
}

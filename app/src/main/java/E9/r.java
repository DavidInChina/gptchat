package E9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class r {
    public static final q Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4569a;

    /* renamed from: b  reason: collision with root package name */
    public final o f4570b;

    public r() {
        this.f4569a = false;
        this.f4570b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f4569a == rVar.f4569a && AbstractC3557B.K(this.f4570b, rVar.f4570b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        if (this.f4569a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = i10 * 31;
        o oVar = this.f4570b;
        if (oVar == null) {
            i11 = 0;
        } else {
            i11 = oVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "TermsOfUseResponse(isRequired=" + this.f4569a + ", display=" + this.f4570b + Separators.RPAREN;
    }

    public r(int i10, boolean z10, o oVar) {
        this.f4569a = (i10 & 1) == 0 ? false : z10;
        if ((i10 & 2) == 0) {
            this.f4570b = null;
        } else {
            this.f4570b = oVar;
        }
    }
}

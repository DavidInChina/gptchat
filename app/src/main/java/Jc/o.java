package Jc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class o {
    public static final k Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final n f9060a;

    public o(int i10, n nVar) {
        if ((i10 & 1) == 0) {
            this.f9060a = null;
        } else {
            this.f9060a = nVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && AbstractC3557B.K(this.f9060a, ((o) obj).f9060a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        n nVar = this.f9060a;
        if (nVar == null) {
            return 0;
        }
        return nVar.f9059a.hashCode();
    }

    public final String toString() {
        return "Metadata(retrieval=" + this.f9060a + Separators.RPAREN;
    }
}

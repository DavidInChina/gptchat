package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class x1 {
    public static final t1 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final w1 f13627a;

    public x1(int i10, w1 w1Var) {
        if ((i10 & 1) == 0) {
            this.f13627a = null;
        } else {
            this.f13627a = w1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x1) && AbstractC3557B.K(this.f13627a, ((x1) obj).f13627a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        w1 w1Var = this.f13627a;
        if (w1Var == null) {
            return 0;
        }
        return w1Var.hashCode();
    }

    public final String toString() {
        return "DalleClientAttachment(operation=" + this.f13627a + Separators.RPAREN;
    }

    public x1(w1 w1Var) {
        this.f13627a = w1Var;
    }
}

package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class y1 {
    public static final r1 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final x1 f13649a;

    public y1(int i10, x1 x1Var) {
        if ((i10 & 1) == 0) {
            this.f13649a = null;
        } else {
            this.f13649a = x1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y1) && AbstractC3557B.K(this.f13649a, ((y1) obj).f13649a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        x1 x1Var = this.f13649a;
        if (x1Var == null) {
            return 0;
        }
        return x1Var.hashCode();
    }

    public final String toString() {
        return "DalleAttachment(fromClient=" + this.f13649a + Separators.RPAREN;
    }

    public y1(x1 x1Var) {
        this.f13649a = x1Var;
    }
}

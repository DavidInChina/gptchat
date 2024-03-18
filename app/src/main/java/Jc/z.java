package Jc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class z implements B {

    /* renamed from: a  reason: collision with root package name */
    public final Vc.x f9078a;

    public z(Vc.x xVar) {
        this.f9078a = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z) && AbstractC3557B.K(this.f9078a, ((z) obj).f9078a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9078a.hashCode();
    }

    public final String toString() {
        return "Done(result=" + this.f9078a + Separators.RPAREN;
    }
}

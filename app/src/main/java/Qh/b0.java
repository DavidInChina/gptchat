package Qh;

import android.gov.nist.core.Separators;
import sh.AbstractC5632d;
import yh.l1;

/* loaded from: classes2.dex */
public final class b0 extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f14990a;

    public b0(l1 l1Var) {
        this.f14990a = l1Var;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return ((AbstractC5632d) obj).m0(this.f14990a);
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        if (!this.f14990a.equals(((b0) obj).f14990a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14990a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "isVisibleTo(" + this.f14990a + Separators.RPAREN;
    }
}

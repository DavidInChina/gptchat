package Qh;

import android.gov.nist.core.Separators;
import sh.AbstractC5637i;

/* loaded from: classes.dex */
public final class J extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1234l f14974a;

    public J(Y y10) {
        this.f14974a = y10;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f14974a.a(((AbstractC5637i) obj).f1());
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        if (!this.f14974a.equals(((J) obj).f14974a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14974a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "name(" + this.f14974a + Separators.RPAREN;
    }
}

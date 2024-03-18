package gb;

import aa.C1939b;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class U implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final C1939b f31375a;

    /* renamed from: b  reason: collision with root package name */
    public final ha.K f31376b;

    public U(C1939b c1939b, ha.K k10) {
        AbstractC3557B.c0("data", c1939b);
        AbstractC3557B.c0("action", k10);
        this.f31375a = c1939b;
        this.f31376b = k10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        if (AbstractC3557B.K(this.f31375a, u10.f31375a) && AbstractC3557B.K(this.f31376b, u10.f31376b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31376b.hashCode() + (this.f31375a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomActionClick(data=" + this.f31375a + ", action=" + this.f31376b + Separators.RPAREN;
    }
}

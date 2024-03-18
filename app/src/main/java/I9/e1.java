package I9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class e1 implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final xd.e f8336a;

    public e1(xd.e eVar) {
        this.f8336a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e1) && AbstractC3557B.K(this.f8336a, ((e1) obj).f8336a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        xd.e eVar = this.f8336a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "HistorySidebarState(accountUserState=" + this.f8336a + Separators.RPAREN;
    }
}

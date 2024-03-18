package K6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f9506a;

    public f(b bVar) {
        this.f9506a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3557B.K(this.f9506a, ((f) obj).f9506a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        b bVar = this.f9506a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Network(client=" + this.f9506a + Separators.RPAREN;
    }
}

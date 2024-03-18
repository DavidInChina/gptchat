package Li;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public b f11211a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c) || !AbstractC3557B.K(this.f11211a, ((c) obj).f11211a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        b bVar = this.f11211a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Container(state=" + this.f11211a + Separators.RPAREN;
    }
}

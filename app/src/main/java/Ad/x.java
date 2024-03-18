package Ad;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class x implements y {

    /* renamed from: a  reason: collision with root package name */
    public final r f829a;

    public /* synthetic */ x(r rVar) {
        this.f829a = rVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f829a, ((x) obj).f829a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f829a.hashCode();
    }

    public final String toString() {
        return "Standard(effect=" + this.f829a + Separators.RPAREN;
    }
}

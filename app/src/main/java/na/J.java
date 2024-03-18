package na;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class J implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final String f39810a;

    public J(String str) {
        this.f39810a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof J) && AbstractC3557B.K(this.f39810a, ((J) obj).f39810a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39810a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("PlusUpsell(uiLocation="), this.f39810a, Separators.RPAREN);
    }
}

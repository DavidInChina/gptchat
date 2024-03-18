package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a  reason: collision with root package name */
    public final C6306j0 f49121a;

    public W(C6306j0 c6306j0) {
        this.f49121a = c6306j0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof W) && AbstractC3557B.K(this.f49121a, ((W) obj).f49121a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        C6306j0 c6306j0 = this.f49121a;
        if (c6306j0 == null) {
            return 0;
        }
        return c6306j0.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.f49121a + Separators.RPAREN;
    }
}

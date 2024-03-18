package gb;

import android.gov.nist.core.Separators;
import fa.C2969F;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class Q implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final C2969F f31371a;

    public Q(C2969F c2969f) {
        AbstractC3557B.c0("message", c2969f);
        this.f31371a = c2969f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Q) && AbstractC3557B.K(this.f31371a, ((Q) obj).f31371a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31371a.hashCode();
    }

    public final String toString() {
        return "Copy(message=" + this.f31371a + Separators.RPAREN;
    }
}

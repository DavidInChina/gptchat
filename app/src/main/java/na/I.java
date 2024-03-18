package na;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class I implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final C2334C f39806a;

    public I(C2334C c2334c) {
        AbstractC3557B.c0("gizmo", c2334c);
        this.f39806a = c2334c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof I) && AbstractC3557B.K(this.f39806a, ((I) obj).f39806a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39806a.hashCode();
    }

    public final String toString() {
        return "PinGizmo(gizmo=" + this.f39806a + Separators.RPAREN;
    }
}

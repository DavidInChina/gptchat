package I9;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class H0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    public final C2334C f8179a;

    public H0(C2334C c2334c) {
        AbstractC3557B.c0("gizmo", c2334c);
        this.f8179a = c2334c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof H0) && AbstractC3557B.K(this.f8179a, ((H0) obj).f8179a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8179a.hashCode();
    }

    public final String toString() {
        return "UnpinGizmo(gizmo=" + this.f8179a + Separators.RPAREN;
    }
}

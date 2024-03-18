package na;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class N implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final C2334C f39837a;

    public N(C2334C c2334c) {
        AbstractC3557B.c0("gizmo", c2334c);
        this.f39837a = c2334c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof N) && AbstractC3557B.K(this.f39837a, ((N) obj).f39837a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39837a.hashCode();
    }

    public final String toString() {
        return "ReviewGizmo(gizmo=" + this.f39837a + Separators.RPAREN;
    }
}

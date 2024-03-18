package na;

import android.gov.nist.core.Separators;
import cb.C2334C;
import cb.C2372m;
import cb.C2373n;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class S implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final C2334C f39863a;

    /* renamed from: b  reason: collision with root package name */
    public final C2373n f39864b;

    static {
        C2372m c2372m = C2373n.Companion;
    }

    public S(C2334C c2334c, C2373n c2373n) {
        AbstractC3557B.c0("social", c2373n);
        this.f39863a = c2334c;
        this.f39864b = c2373n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        if (AbstractC3557B.K(this.f39863a, s10.f39863a) && AbstractC3557B.K(this.f39864b, s10.f39864b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39864b.hashCode() + (this.f39863a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowGizmoAuthor(gizmo=" + this.f39863a + ", social=" + this.f39864b + Separators.RPAREN;
    }
}

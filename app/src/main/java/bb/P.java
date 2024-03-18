package bb;

import android.gov.nist.core.Separators;
import cb.C2334C;
import cb.C2353W;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class P implements T {

    /* renamed from: a  reason: collision with root package name */
    public final C2353W f25738a;

    /* renamed from: b  reason: collision with root package name */
    public final C2334C f25739b;

    public P(C2353W c2353w, C2334C c2334c) {
        AbstractC3557B.c0("categoryInfo", c2353w);
        AbstractC3557B.c0("gizmo", c2334c);
        this.f25738a = c2353w;
        this.f25739b = c2334c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        if (AbstractC3557B.K(this.f25738a, p10.f25738a) && AbstractC3557B.K(this.f25739b, p10.f25739b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25739b.hashCode() + (this.f25738a.hashCode() * 31);
    }

    public final String toString() {
        return "GizmoClick(categoryInfo=" + this.f25738a + ", gizmo=" + this.f25739b + Separators.RPAREN;
    }
}

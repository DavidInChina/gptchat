package ic;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class M implements O {

    /* renamed from: a  reason: collision with root package name */
    public final C2334C f32960a;

    public M(C2334C c2334c) {
        this.f32960a = c2334c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof M) && AbstractC3557B.K(this.f32960a, ((M) obj).f32960a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        C2334C c2334c = this.f32960a;
        if (c2334c == null) {
            return 0;
        }
        return c2334c.hashCode();
    }

    public final String toString() {
        return "SelectGizmo(gizmo=" + this.f32960a + Separators.RPAREN;
    }
}

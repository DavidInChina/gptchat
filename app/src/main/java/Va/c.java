package Va;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f18499a;

    public c(int i10) {
        this.f18499a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f18499a == ((c) obj).f18499a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18499a;
    }

    public final String toString() {
        return android.gov.nist.core.a.l(new StringBuilder("GizmoCapabilityItem(title="), this.f18499a, Separators.RPAREN);
    }
}

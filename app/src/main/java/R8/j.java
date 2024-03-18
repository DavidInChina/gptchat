package R8;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class j extends AbstractC1252e {

    /* renamed from: g  reason: collision with root package name */
    public final int f15152g;

    public j(int i10) {
        this.f15152g = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.f15152g == ((j) obj).f15152g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15152g;
    }

    public final String toString() {
        return android.gov.nist.core.a.l(new StringBuilder("AstHeading(level="), this.f15152g, Separators.RPAREN);
    }
}

package pc;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class j0 extends m0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f43002a;

    public j0(int i10) {
        this.f43002a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j0) && this.f43002a == ((j0) obj).f43002a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43002a;
    }

    public final String toString() {
        return android.gov.nist.core.a.l(new StringBuilder("ErrorLoadingPackages(errorText="), this.f43002a, Separators.RPAREN);
    }
}

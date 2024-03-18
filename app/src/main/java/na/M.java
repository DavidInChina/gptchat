package na;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class M implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f39828a;

    public M(boolean z10) {
        this.f39828a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof M) && this.f39828a == ((M) obj).f39828a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f39828a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("ReportContentDialog(show="), this.f39828a, Separators.RPAREN);
    }
}

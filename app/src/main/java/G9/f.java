package G9;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6126a;

    public f(boolean z10) {
        this.f6126a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && this.f6126a == ((f) obj).f6126a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6126a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("ReportContentDialog(show="), this.f6126a, Separators.RPAREN);
    }
}

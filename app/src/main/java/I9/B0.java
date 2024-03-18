package I9;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class B0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8144a;

    public B0(boolean z10) {
        this.f8144a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof B0) && this.f8144a == ((B0) obj).f8144a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8144a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("HistoryVisible(historyVisible="), this.f8144a, Separators.RPAREN);
    }
}

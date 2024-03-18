package na;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class H implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f39803a;

    public H(boolean z10) {
        this.f39803a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof H) && this.f39803a == ((H) obj).f39803a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f39803a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("NewConversation(downgrade="), this.f39803a, Separators.RPAREN);
    }
}

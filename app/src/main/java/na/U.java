package na;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class U implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f39879a;

    public U(boolean z10) {
        this.f39879a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof U) && this.f39879a == ((U) obj).f39879a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f39879a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("TemporaryConversation(temporary="), this.f39879a, Separators.RPAREN);
    }
}

package na;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class L implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final String f39820a;

    public L(String str) {
        AbstractC3557B.c0("name", str);
        this.f39820a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof L) && AbstractC3557B.K(this.f39820a, ((L) obj).f39820a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39820a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("RenameConversation(name="), this.f39820a, Separators.RPAREN);
    }
}

package nc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class o implements r {

    /* renamed from: a  reason: collision with root package name */
    public final String f40246a;

    public o(String str) {
        AbstractC3557B.c0("name", str);
        this.f40246a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && AbstractC3557B.K(this.f40246a, ((o) obj).f40246a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40246a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("RenameConversation(name="), this.f40246a, Separators.RPAREN);
    }
}

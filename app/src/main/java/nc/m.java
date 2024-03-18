package nc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class m implements r {

    /* renamed from: a  reason: collision with root package name */
    public final String f40244a;

    public m(String str) {
        AbstractC3557B.c0("shareId", str);
        this.f40244a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && AbstractC3557B.K(this.f40244a, ((m) obj).f40244a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40244a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("DeleteLink(shareId="), this.f40244a, Separators.RPAREN);
    }
}

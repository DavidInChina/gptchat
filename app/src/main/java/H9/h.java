package H9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    public final String f7517a;

    public h(String str) {
        AbstractC3557B.c0("query", str);
        this.f7517a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && AbstractC3557B.K(this.f7517a, ((h) obj).f7517a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7517a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Search(query="), this.f7517a, Separators.RPAREN);
    }
}

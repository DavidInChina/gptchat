package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: R8.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1254g extends o {

    /* renamed from: g  reason: collision with root package name */
    public final String f15145g;

    public C1254g(String str) {
        this.f15145g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1254g) && AbstractC3557B.K(this.f15145g, ((C1254g) obj).f15145g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15145g.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("AstEmphasis(delimiter="), this.f15145g, Separators.RPAREN);
    }
}

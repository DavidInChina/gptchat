package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: R8.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1251d extends o {

    /* renamed from: g  reason: collision with root package name */
    public final String f15143g;

    public C1251d(String str) {
        this.f15143g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1251d) && AbstractC3557B.K(this.f15143g, ((C1251d) obj).f15143g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15143g.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("AstCode(literal="), this.f15143g, Separators.RPAREN);
    }
}

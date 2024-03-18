package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: g  reason: collision with root package name */
    public final String f15158g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15159h;

    public p(String str, String str2) {
        this.f15158g = str;
        this.f15159h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (AbstractC3557B.K(this.f15158g, pVar.f15158g) && AbstractC3557B.K(this.f15159h, pVar.f15159h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15159h.hashCode() + (this.f15158g.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AstLink(destination=");
        sb2.append(this.f15158g);
        sb2.append(", title=");
        return R.a.t(sb2, this.f15159h, Separators.RPAREN);
    }
}

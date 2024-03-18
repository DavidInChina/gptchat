package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: g  reason: collision with root package name */
    public final String f15155g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15156h;

    public m(String str, String str2) {
        this.f15155g = str;
        this.f15156h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC3557B.K(this.f15155g, mVar.f15155g) && AbstractC3557B.K(this.f15156h, mVar.f15156h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15156h.hashCode() + (this.f15155g.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AstImage(title=");
        sb2.append(this.f15155g);
        sb2.append(", destination=");
        return R.a.t(sb2, this.f15156h, Separators.RPAREN);
    }
}

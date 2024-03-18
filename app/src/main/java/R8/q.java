package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class q extends AbstractC1252e {

    /* renamed from: g  reason: collision with root package name */
    public final String f15160g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15161h;

    /* renamed from: i  reason: collision with root package name */
    public final String f15162i;

    public q(String str, String str2, String str3) {
        this.f15160g = str;
        this.f15161h = str2;
        this.f15162i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (AbstractC3557B.K(this.f15160g, qVar.f15160g) && AbstractC3557B.K(this.f15161h, qVar.f15161h) && AbstractC3557B.K(this.f15162i, qVar.f15162i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15162i.hashCode() + E9.f.v(this.f15161h, this.f15160g.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AstLinkReferenceDefinition(label=");
        sb2.append(this.f15160g);
        sb2.append(", destination=");
        sb2.append(this.f15161h);
        sb2.append(", title=");
        return R.a.t(sb2, this.f15162i, Separators.RPAREN);
    }
}

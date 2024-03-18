package R8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class h extends AbstractC1252e {

    /* renamed from: g  reason: collision with root package name */
    public final char f15146g;

    /* renamed from: h  reason: collision with root package name */
    public final int f15147h;

    /* renamed from: i  reason: collision with root package name */
    public final int f15148i;

    /* renamed from: j  reason: collision with root package name */
    public final String f15149j;

    /* renamed from: k  reason: collision with root package name */
    public final String f15150k;

    public h(char c10, int i10, int i11, String str, String str2) {
        this.f15146g = c10;
        this.f15147h = i10;
        this.f15148i = i11;
        this.f15149j = str;
        this.f15150k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f15146g == hVar.f15146g && this.f15147h == hVar.f15147h && this.f15148i == hVar.f15148i && AbstractC3557B.K(this.f15149j, hVar.f15149j) && AbstractC3557B.K(this.f15150k, hVar.f15150k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15150k.hashCode() + E9.f.v(this.f15149j, ((((this.f15146g * 31) + this.f15147h) * 31) + this.f15148i) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AstFencedCodeBlock(fenceChar=");
        sb2.append(this.f15146g);
        sb2.append(", fenceLength=");
        sb2.append(this.f15147h);
        sb2.append(", fenceIndent=");
        sb2.append(this.f15148i);
        sb2.append(", info=");
        sb2.append(this.f15149j);
        sb2.append(", literal=");
        return R.a.t(sb2, this.f15150k, Separators.RPAREN);
    }
}

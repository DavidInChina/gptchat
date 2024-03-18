package lh;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f38503a;

    /* renamed from: b  reason: collision with root package name */
    public final Z0.j f38504b;

    public r(int i10, Z0.j jVar) {
        this.f38503a = i10;
        this.f38504b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f38503a == rVar.f38503a && AbstractC3557B.K(this.f38504b, rVar.f38504b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38504b.hashCode() + (this.f38503a * 31);
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("BitmapRegionTile(sampleSize=", android.gov.nist.core.a.l(new StringBuilder("BitmapSampleSize(size="), this.f38503a, Separators.RPAREN), ", bounds=");
        s10.append(this.f38504b);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}

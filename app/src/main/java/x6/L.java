package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final String f49033a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49034b;

    public L(String str, String str2) {
        this.f49033a = str;
        this.f49034b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        if (AbstractC3557B.K(this.f49033a, l10.f49033a) && AbstractC3557B.K(this.f49034b, l10.f49034b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f49033a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f49034b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cellular(technology=");
        sb2.append(this.f49033a);
        sb2.append(", carrierName=");
        return R.a.t(sb2, this.f49034b, Separators.RPAREN);
    }
}

package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49027a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49028b;

    public K0(String str, String str2) {
        this.f49027a = str;
        this.f49028b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        if (AbstractC3557B.K(this.f49027a, k02.f49027a) && AbstractC3557B.K(this.f49028b, k02.f49028b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f49027a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f49028b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cellular(technology=");
        sb2.append(this.f49027a);
        sb2.append(", carrierName=");
        return R.a.t(sb2, this.f49028b, Separators.RPAREN);
    }
}

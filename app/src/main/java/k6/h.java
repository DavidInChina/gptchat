package K6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f9508a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9509b;

    public h(String str, String str2) {
        this.f9508a = str;
        this.f9509b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3557B.K(this.f9508a, hVar.f9508a) && AbstractC3557B.K(this.f9509b, hVar.f9509b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f9508a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f9509b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimCarrier(id=");
        sb2.append(this.f9508a);
        sb2.append(", name=");
        return R.a.t(sb2, this.f9509b, Separators.RPAREN);
    }
}

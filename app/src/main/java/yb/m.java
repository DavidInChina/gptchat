package Yb;

import Ad.s;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class m implements s {

    /* renamed from: a  reason: collision with root package name */
    public final String f22226a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22227b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22228c;

    public m(String str, String str2, String str3) {
        this.f22226a = str;
        this.f22227b = str2;
        this.f22228c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC3557B.K(this.f22226a, mVar.f22226a) && AbstractC3557B.K(this.f22227b, mVar.f22227b) && AbstractC3557B.K(this.f22228c, mVar.f22228c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f22226a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f22227b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f22228c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SunsetViewState(message=");
        sb2.append(this.f22226a);
        sb2.append(", buttonTitle=");
        sb2.append(this.f22227b);
        sb2.append(", buttonUrl=");
        return R.a.t(sb2, this.f22228c, Separators.RPAREN);
    }
}

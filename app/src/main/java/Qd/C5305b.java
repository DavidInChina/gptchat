package qd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: qd.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5305b implements AbstractC5308e {

    /* renamed from: a  reason: collision with root package name */
    public final String f44062a;

    /* renamed from: b  reason: collision with root package name */
    public final String f44063b;

    /* renamed from: c  reason: collision with root package name */
    public final String f44064c;

    public C5305b(String str, String str2, String str3) {
        this.f44062a = str;
        this.f44063b = str2;
        this.f44064c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5305b)) {
            return false;
        }
        C5305b c5305b = (C5305b) obj;
        if (AbstractC3557B.K(this.f44062a, c5305b.f44062a) && AbstractC3557B.K(this.f44063b, c5305b.f44063b) && AbstractC3557B.K(this.f44064c, c5305b.f44064c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f44062a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f44063b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f44064c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HardSunset(message=");
        sb2.append(this.f44062a);
        sb2.append(", buttonTitle=");
        sb2.append(this.f44063b);
        sb2.append(", buttonUrl=");
        return R.a.t(sb2, this.f44064c, Separators.RPAREN);
    }
}

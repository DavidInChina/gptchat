package Fb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class r {
    public static final q Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f5168a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5169b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5170c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5171d;

    public r(int i10, String str, String str2, String str3, String str4) {
        if (15 == (i10 & 15)) {
            this.f5168a = str;
            this.f5169b = str2;
            this.f5170c = str3;
            this.f5171d = str4;
            return;
        }
        R4.b.e2(i10, 15, p.f5167b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3557B.K(this.f5168a, rVar.f5168a) && AbstractC3557B.K(this.f5169b, rVar.f5169b) && AbstractC3557B.K(this.f5170c, rVar.f5170c) && AbstractC3557B.K(this.f5171d, rVar.f5171d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f5168a.hashCode() * 31;
        int i12 = 0;
        String str = this.f5169b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        String str2 = this.f5170c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f5171d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorContent(message=");
        sb2.append(this.f5168a);
        sb2.append(", type=");
        sb2.append(this.f5169b);
        sb2.append(", param=");
        sb2.append(this.f5170c);
        sb2.append(", code=");
        return R.a.t(sb2, this.f5171d, Separators.RPAREN);
    }
}

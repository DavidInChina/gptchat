package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class N {
    public static final M Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13479a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13480b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13481c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13482d;

    public N(int i10, String str, String str2, String str3, String str4) {
        if (15 == (i10 & 15)) {
            this.f13479a = str;
            this.f13480b = str2;
            this.f13481c = str3;
            this.f13482d = str4;
            return;
        }
        R4.b.e2(i10, 15, L.f13475b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        if (AbstractC3557B.K(this.f13479a, n10.f13479a) && AbstractC3557B.K(this.f13480b, n10.f13480b) && AbstractC3557B.K(this.f13481c, n10.f13481c) && AbstractC3557B.K(this.f13482d, n10.f13482d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f13479a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int v10 = E9.f.v(this.f13480b, i10 * 31, 31);
        String str2 = this.f13481c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i13 = (v10 + i11) * 31;
        String str3 = this.f13482d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiFileReference(name=");
        sb2.append(this.f13479a);
        sb2.append(", id=");
        sb2.append(this.f13480b);
        sb2.append(", mimeType=");
        sb2.append(this.f13481c);
        sb2.append(", downloadLink=");
        return R.a.t(sb2, this.f13482d, Separators.RPAREN);
    }
}

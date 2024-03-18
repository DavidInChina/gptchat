package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class T {
    public static final S Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23515a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23516b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23517c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23518d;

    public T(int i10, String str, String str2, String str3, String str4) {
        if (15 == (i10 & 15)) {
            this.f23515a = str;
            this.f23516b = str2;
            this.f23517c = str3;
            this.f23518d = str4;
            return;
        }
        R4.b.e2(i10, 15, Q.f23503b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        if (AbstractC3557B.K(this.f23515a, t10.f23515a) && AbstractC3557B.K(this.f23516b, t10.f23516b) && AbstractC3557B.K(this.f23517c, t10.f23517c) && AbstractC3557B.K(this.f23518d, t10.f23518d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f23515a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        String str2 = this.f23516b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f23517c;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.f23518d;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiGizmoListDetails(id=");
        sb2.append(this.f23515a);
        sb2.append(", title=");
        sb2.append(this.f23516b);
        sb2.append(", description=");
        sb2.append(this.f23517c);
        sb2.append(", displayType=");
        return R.a.t(sb2, this.f23518d, Separators.RPAREN);
    }
}

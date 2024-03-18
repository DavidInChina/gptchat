package ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6209w;

@AbstractC1998i
/* loaded from: classes.dex */
public final class P {
    public static final O Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f32026a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32027b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32028c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32029d;

    public P(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, N.f32025b);
            throw null;
        }
        this.f32026a = str;
        this.f32027b = str2;
        this.f32028c = str3;
        this.f32029d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        if (AbstractC3557B.K(this.f32026a, p10.f32026a) && AbstractC3557B.K(this.f32027b, p10.f32027b) && AbstractC3557B.K(this.f32028c, p10.f32028c) && AbstractC3557B.K(this.f32029d, p10.f32029d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f32026a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int v10 = E9.f.v(this.f32027b, i10 * 31, 31);
        String str2 = this.f32028c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i13 = (v10 + i11) * 31;
        String str3 = this.f32029d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        String a5 = C6209w.a(this.f32027b);
        StringBuilder sb2 = new StringBuilder("CustomActionFile(name=");
        android.gov.nist.core.a.y(sb2, this.f32026a, ", assetPointer=", a5, ", mimeType=");
        sb2.append(this.f32028c);
        sb2.append(", downloadLink=");
        return R.a.t(sb2, this.f32029d, Separators.RPAREN);
    }

    public P(String str, String str2, String str3, String str4) {
        this.f32026a = str;
        this.f32027b = str2;
        this.f32028c = str3;
        this.f32029d = str4;
    }
}

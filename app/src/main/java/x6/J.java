package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public final String f49015a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49016b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f49017c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49018d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49019e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49020f;

    public J(String str, String str2, String str3, String str4, String str5, boolean z10) {
        this.f49015a = str;
        this.f49016b = str2;
        this.f49017c = z10;
        this.f49018d = str3;
        this.f49019e = str4;
        this.f49020f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j6 = (J) obj;
        if (AbstractC3557B.K(this.f49015a, j6.f49015a) && AbstractC3557B.K(this.f49016b, j6.f49016b) && this.f49017c == j6.f49017c && AbstractC3557B.K(this.f49018d, j6.f49018d) && AbstractC3557B.K(this.f49019e, j6.f49019e) && AbstractC3557B.K(this.f49020f, j6.f49020f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int v10 = E9.f.v(this.f49016b, this.f49015a.hashCode() * 31, 31);
        boolean z10 = this.f49017c;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = (v10 + i12) * 31;
        int i15 = 0;
        String str = this.f49018d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i16 = (i14 + i10) * 31;
        String str2 = this.f49019e;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i17 = (i16 + i11) * 31;
        String str3 = this.f49020f;
        if (str3 != null) {
            i15 = str3.hashCode();
        }
        return i17 + i15;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage(uuid=");
        sb2.append(this.f49015a);
        sb2.append(", name=");
        sb2.append(this.f49016b);
        sb2.append(", isSystem=");
        sb2.append(this.f49017c);
        sb2.append(", loadAddress=");
        sb2.append(this.f49018d);
        sb2.append(", maxAddress=");
        sb2.append(this.f49019e);
        sb2.append(", arch=");
        return R.a.t(sb2, this.f49020f, Separators.RPAREN);
    }
}

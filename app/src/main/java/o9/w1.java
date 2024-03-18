package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class w1 {
    public static final v1 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13621a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13622b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13623c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13624d;

    public w1(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, u1.f13605b);
            throw null;
        }
        this.f13621a = str;
        this.f13622b = str2;
        this.f13623c = str3;
        this.f13624d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        if (AbstractC3557B.K(this.f13621a, w1Var.f13621a) && AbstractC3557B.K(this.f13622b, w1Var.f13622b) && AbstractC3557B.K(this.f13623c, w1Var.f13623c) && AbstractC3557B.K(this.f13624d, w1Var.f13624d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f13623c, E9.f.v(this.f13622b, this.f13621a.hashCode() * 31, 31), 31);
        String str = this.f13624d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DalleOperationAttachement(type=");
        sb2.append(this.f13621a);
        sb2.append(", originalGenId=");
        sb2.append(this.f13622b);
        sb2.append(", originalFileId=");
        sb2.append(this.f13623c);
        sb2.append(", maskFileId=");
        return R.a.t(sb2, this.f13624d, Separators.RPAREN);
    }

    public w1(String str, String str2, String str3, String str4) {
        this.f13621a = str;
        this.f13622b = str2;
        this.f13623c = str3;
        this.f13624d = str4;
    }
}

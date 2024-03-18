package Ed;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f4669a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4670b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4671c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4672d;

    public f(int i10, String str, String str2, String str3, String str4) {
        if (14 == (i10 & 14)) {
            if ((i10 & 1) == 0) {
                this.f4669a = null;
            } else {
                this.f4669a = str;
            }
            this.f4670b = str2;
            this.f4671c = str3;
            this.f4672d = str4;
            return;
        }
        R4.b.e2(i10, 14, d.f4668b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f4669a, fVar.f4669a) && AbstractC3557B.K(this.f4670b, fVar.f4670b) && AbstractC3557B.K(this.f4671c, fVar.f4671c) && AbstractC3557B.K(this.f4672d, fVar.f4672d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f4669a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int v10 = E9.f.v(this.f4671c, E9.f.v(this.f4670b, i10 * 31, 31), 31);
        String str2 = this.f4672d;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return v10 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetTokenResponse(context=");
        sb2.append(this.f4669a);
        sb2.append(", url=");
        sb2.append(this.f4670b);
        sb2.append(", token=");
        sb2.append(this.f4671c);
        sb2.append(", e2eeKey=");
        return R.a.t(sb2, this.f4672d, Separators.RPAREN);
    }
}

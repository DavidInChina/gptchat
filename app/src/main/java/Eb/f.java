package Eb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f4586a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4587b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4588c;

    public f(int i10, String str, String str2, String str3) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, d.f4585b);
            throw null;
        }
        this.f4586a = str;
        this.f4587b = str2;
        this.f4588c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f4586a, fVar.f4586a) && AbstractC3557B.K(this.f4587b, fVar.f4587b) && AbstractC3557B.K(this.f4588c, fVar.f4588c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f4587b, this.f4586a.hashCode() * 31, 31);
        String str = this.f4588c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneCheckRequest(verificationId=");
        sb2.append(this.f4586a);
        sb2.append(", verificationCode=");
        sb2.append(this.f4587b);
        sb2.append(", version=");
        return R.a.t(sb2, this.f4588c, Separators.RPAREN);
    }

    public f(String str, String str2) {
        AbstractC3557B.c0("verificationCode", str2);
        this.f4586a = str;
        this.f4587b = str2;
        this.f4588c = null;
    }
}

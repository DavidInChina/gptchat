package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class H0 {
    public static final G0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13462a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13463b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f13464c;

    public H0(int i10, String str, String str2, Integer num) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, F0.f13459b);
            throw null;
        }
        this.f13462a = str;
        this.f13463b = str2;
        if ((i10 & 4) == 0) {
            this.f13464c = null;
        } else {
            this.f13464c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        if (AbstractC3557B.K(this.f13462a, h02.f13462a) && AbstractC3557B.K(this.f13463b, h02.f13463b) && AbstractC3557B.K(this.f13464c, h02.f13464c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f13463b, this.f13462a.hashCode() * 31, 31);
        Integer num = this.f13464c;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        return "ApiMessageAttachment(name=" + this.f13462a + ", id=" + this.f13463b + ", size=" + this.f13464c + Separators.RPAREN;
    }

    public H0(String str, Integer num, String str2) {
        AbstractC3557B.c0("name", str);
        this.f13462a = str;
        this.f13463b = str2;
        this.f13464c = num;
    }
}

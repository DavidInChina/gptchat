package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class K0 {
    public static final J0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Integer f13471a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f13472b;

    /* renamed from: c  reason: collision with root package name */
    public final S0 f13473c;

    public K0(int i10, Integer num, Integer num2, S0 s02) {
        if (7 == (i10 & 7)) {
            this.f13471a = num;
            this.f13472b = num2;
            this.f13473c = s02;
            return;
        }
        R4.b.e2(i10, 7, I0.f13468b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        if (AbstractC3557B.K(this.f13471a, k02.f13471a) && AbstractC3557B.K(this.f13472b, k02.f13472b) && AbstractC3557B.K(this.f13473c, k02.f13473c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Integer num = this.f13471a;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        int i13 = i10 * 31;
        Integer num2 = this.f13472b;
        if (num2 == null) {
            i11 = 0;
        } else {
            i11 = num2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        S0 s02 = this.f13473c;
        if (s02 != null) {
            i12 = s02.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "ApiMessageCitationData(startIx=" + this.f13471a + ", endIx=" + this.f13472b + ", metadata=" + this.f13473c + Separators.RPAREN;
    }
}

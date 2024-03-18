package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Za.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1866p0 {
    public static final C1864o0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23597a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23598b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23599c;

    public C1866p0(int i10, String str, String str2, String str3) {
        if (7 == (i10 & 7)) {
            this.f23597a = str;
            this.f23598b = str2;
            this.f23599c = str3;
            return;
        }
        R4.b.e2(i10, 7, C1862n0.f23583b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1866p0)) {
            return false;
        }
        C1866p0 c1866p0 = (C1866p0) obj;
        if (AbstractC3557B.K(this.f23597a, c1866p0.f23597a) && AbstractC3557B.K(this.f23598b, c1866p0.f23598b) && AbstractC3557B.K(this.f23599c, c1866p0.f23599c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23599c.hashCode() + E9.f.v(this.f23598b, this.f23597a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiVerifiedData(username=");
        sb2.append(this.f23597a);
        sb2.append(", type=");
        sb2.append(this.f23598b);
        sb2.append(", linkTo=");
        return R.a.t(sb2, this.f23599c, Separators.RPAREN);
    }
}

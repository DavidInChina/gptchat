package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Za.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1869r0 {
    public static final C1868q0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23605a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23606b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23607c;

    /* renamed from: d  reason: collision with root package name */
    public final C1866p0 f23608d;

    public C1869r0(int i10, String str, String str2, boolean z10, C1866p0 c1866p0) {
        if (15 == (i10 & 15)) {
            this.f23605a = str;
            this.f23606b = str2;
            this.f23607c = z10;
            this.f23608d = c1866p0;
            return;
        }
        R4.b.e2(i10, 15, C1860m0.f23580b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869r0)) {
            return false;
        }
        C1869r0 c1869r0 = (C1869r0) obj;
        if (AbstractC3557B.K(this.f23605a, c1869r0.f23605a) && AbstractC3557B.K(this.f23606b, c1869r0.f23606b) && this.f23607c == c1869r0.f23607c && AbstractC3557B.K(this.f23608d, c1869r0.f23608d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f23606b, this.f23605a.hashCode() * 31, 31);
        if (this.f23607c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f23608d.hashCode() + ((v10 + i10) * 31);
    }

    public final String toString() {
        return "ApiSocial(type=" + this.f23605a + ", displayName=" + this.f23606b + ", verified=" + this.f23607c + ", verifiedData=" + this.f23608d + Separators.RPAREN;
    }
}

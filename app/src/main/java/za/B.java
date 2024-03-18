package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import cb.AbstractC2338G;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class B implements C {
    public static final A Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23434a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23435b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23436c;

    public B(int i10, String str, String str2, String str3) {
        if (7 == (i10 & 7)) {
            this.f23434a = str;
            this.f23435b = str2;
            this.f23436c = str3;
            return;
        }
        R4.b.e2(i10, 7, C1880z.f23638b);
        throw null;
    }

    @Override // Za.C
    public final AbstractC2338G a() {
        return K8.d.R0(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        if (AbstractC3557B.K(this.f23434a, b10.f23434a) && AbstractC3557B.K(this.f23435b, b10.f23435b) && AbstractC3557B.K(this.f23436c, b10.f23436c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23436c.hashCode() + E9.f.v(this.f23435b, this.f23434a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating(type=");
        sb2.append(this.f23434a);
        sb2.append(", avg=");
        sb2.append(this.f23435b);
        sb2.append(", count=");
        return R.a.t(sb2, this.f23436c, Separators.RPAREN);
    }
}

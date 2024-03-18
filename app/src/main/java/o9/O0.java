package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class O0 implements S0 {
    public static final N0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13485a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13486b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13487c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13488d;

    public O0(int i10, String str, String str2, String str3, String str4) {
        if (15 == (i10 & 15)) {
            this.f13485a = str;
            this.f13486b = str2;
            this.f13487c = str3;
            this.f13488d = str4;
            return;
        }
        R4.b.e2(i10, 15, M0.f13478b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        if (AbstractC3557B.K(this.f13485a, o02.f13485a) && AbstractC3557B.K(this.f13486b, o02.f13486b) && AbstractC3557B.K(this.f13487c, o02.f13487c) && AbstractC3557B.K(this.f13488d, o02.f13488d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13488d.hashCode() + E9.f.v(this.f13487c, E9.f.v(this.f13486b, this.f13485a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("File(id=");
        sb2.append(this.f13485a);
        sb2.append(", name=");
        sb2.append(this.f13486b);
        sb2.append(", source=");
        sb2.append(this.f13487c);
        sb2.append(", text=");
        return R.a.t(sb2, this.f13488d, Separators.RPAREN);
    }
}

package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class B1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f48919a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48920b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48921c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48922d;

    /* renamed from: e  reason: collision with root package name */
    public final String f48923e;

    public B1(int i10, String str, String str2, String str3, String str4) {
        AbstractC2469q0.q("type", i10);
        this.f48919a = i10;
        this.f48920b = str;
        this.f48921c = str2;
        this.f48922d = str3;
        this.f48923e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B1)) {
            return false;
        }
        B1 b1 = (B1) obj;
        if (this.f48919a == b1.f48919a && AbstractC3557B.K(this.f48920b, b1.f48920b) && AbstractC3557B.K(this.f48921c, b1.f48921c) && AbstractC3557B.K(this.f48922d, b1.f48922d) && AbstractC3557B.K(this.f48923e, b1.f48923e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int f6 = AbstractC6708l.f(this.f48919a) * 31;
        int i13 = 0;
        String str = this.f48920b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = (f6 + i10) * 31;
        String str2 = this.f48921c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f48922d;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.f48923e;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(type=");
        sb2.append(AbstractC6301h1.o(this.f48919a));
        sb2.append(", name=");
        sb2.append(this.f48920b);
        sb2.append(", model=");
        sb2.append(this.f48921c);
        sb2.append(", brand=");
        sb2.append(this.f48922d);
        sb2.append(", architecture=");
        return R.a.t(sb2, this.f48923e, Separators.RPAREN);
    }
}

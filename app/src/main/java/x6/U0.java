package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f49101a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49102b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49103c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49104d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49105e;

    public U0(int i10, String str, String str2, String str3, String str4) {
        AbstractC2469q0.q("type", i10);
        this.f49101a = i10;
        this.f49102b = str;
        this.f49103c = str2;
        this.f49104d = str3;
        this.f49105e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u02 = (U0) obj;
        if (this.f49101a == u02.f49101a && AbstractC3557B.K(this.f49102b, u02.f49102b) && AbstractC3557B.K(this.f49103c, u02.f49103c) && AbstractC3557B.K(this.f49104d, u02.f49104d) && AbstractC3557B.K(this.f49105e, u02.f49105e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int f6 = AbstractC6708l.f(this.f49101a) * 31;
        int i13 = 0;
        String str = this.f49102b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = (f6 + i10) * 31;
        String str2 = this.f49103c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f49104d;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.f49105e;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(type=");
        sb2.append(AbstractC6287d.V(this.f49101a));
        sb2.append(", name=");
        sb2.append(this.f49102b);
        sb2.append(", model=");
        sb2.append(this.f49103c);
        sb2.append(", brand=");
        sb2.append(this.f49104d);
        sb2.append(", architecture=");
        return R.a.t(sb2, this.f49105e, Separators.RPAREN);
    }
}

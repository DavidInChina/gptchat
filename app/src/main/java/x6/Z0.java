package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class Z0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f49202a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49203b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49204c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49205d;

    public Z0(int i10, String str, String str2, String str3) {
        AbstractC2469q0.q("operationType", i10);
        this.f49202a = i10;
        this.f49203b = str;
        this.f49204c = str2;
        this.f49205d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z0)) {
            return false;
        }
        Z0 z02 = (Z0) obj;
        if (this.f49202a == z02.f49202a && AbstractC3557B.K(this.f49203b, z02.f49203b) && AbstractC3557B.K(this.f49204c, z02.f49204c) && AbstractC3557B.K(this.f49205d, z02.f49205d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int f6 = AbstractC6708l.f(this.f49202a) * 31;
        int i12 = 0;
        String str = this.f49203b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (f6 + i10) * 31;
        String str2 = this.f49204c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f49205d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Graphql(operationType=");
        sb2.append(AbstractC6287d.Y(this.f49202a));
        sb2.append(", operationName=");
        sb2.append(this.f49203b);
        sb2.append(", payload=");
        sb2.append(this.f49204c);
        sb2.append(", variables=");
        return R.a.t(sb2, this.f49205d, Separators.RPAREN);
    }
}

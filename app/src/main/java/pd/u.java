package pd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class u implements x {

    /* renamed from: a  reason: collision with root package name */
    public final String f43070a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43071b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43072c;

    public u(String str, String str2, String str3) {
        this.f43070a = str;
        this.f43071b = str2;
        this.f43072c = str3;
    }

    @Override // pd.x
    public final String a() {
        return this.f43070a;
    }

    @Override // pd.x
    public final String b() {
        return this.f43072c;
    }

    @Override // pd.x
    public final String c() {
        return this.f43071b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3557B.K(this.f43070a, uVar.f43070a) && AbstractC3557B.K(this.f43071b, uVar.f43071b) && AbstractC3557B.K(this.f43072c, uVar.f43072c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f43070a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f43071b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f43072c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FullOutage(message=");
        sb2.append(this.f43070a);
        sb2.append(", buttonUrl=");
        sb2.append(this.f43071b);
        sb2.append(", buttonTitle=");
        return R.a.t(sb2, this.f43072c, Separators.RPAREN);
    }
}

package pd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class w implements x {

    /* renamed from: a  reason: collision with root package name */
    public final String f43076a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43077b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43078c;

    public w(String str, String str2, String str3) {
        this.f43076a = str;
        this.f43077b = str2;
        this.f43078c = str3;
    }

    @Override // pd.x
    public final String a() {
        return this.f43076a;
    }

    @Override // pd.x
    public final String b() {
        return this.f43078c;
    }

    @Override // pd.x
    public final String c() {
        return this.f43077b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (AbstractC3557B.K(this.f43076a, wVar.f43076a) && AbstractC3557B.K(this.f43077b, wVar.f43077b) && AbstractC3557B.K(this.f43078c, wVar.f43078c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f43076a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f43077b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f43078c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PartialOutage(message=");
        sb2.append(this.f43076a);
        sb2.append(", buttonUrl=");
        sb2.append(this.f43077b);
        sb2.append(", buttonTitle=");
        return R.a.t(sb2, this.f43078c, Separators.RPAREN);
    }
}

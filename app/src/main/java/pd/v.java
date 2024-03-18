package pd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class v implements x {

    /* renamed from: a  reason: collision with root package name */
    public final String f43073a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43074b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43075c;

    public v(String str, String str2, String str3) {
        this.f43073a = str;
        this.f43074b = str2;
        this.f43075c = str3;
    }

    @Override // pd.x
    public final String a() {
        return this.f43073a;
    }

    @Override // pd.x
    public final String b() {
        return this.f43075c;
    }

    @Override // pd.x
    public final String c() {
        return this.f43074b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (AbstractC3557B.K(this.f43073a, vVar.f43073a) && AbstractC3557B.K(this.f43074b, vVar.f43074b) && AbstractC3557B.K(this.f43075c, vVar.f43075c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f43073a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f43074b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f43075c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Normal(message=");
        sb2.append(this.f43073a);
        sb2.append(", buttonUrl=");
        sb2.append(this.f43074b);
        sb2.append(", buttonTitle=");
        return R.a.t(sb2, this.f43075c, Separators.RPAREN);
    }
}

package B6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f1966a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1967b;

    public q(String str, String str2) {
        this.f1966a = str;
        this.f1967b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (AbstractC3557B.K(this.f1966a, qVar.f1966a) && AbstractC3557B.K(this.f1967b, qVar.f1967b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f1966a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f1967b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Error(stack=");
        sb2.append(this.f1966a);
        sb2.append(", kind=");
        return R.a.t(sb2, this.f1967b, Separators.RPAREN);
    }
}

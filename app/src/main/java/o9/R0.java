package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class R0 implements S0 {
    public static final Q0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13495a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13496b;

    public R0(int i10, String str, String str2) {
        if (1 == (i10 & 1)) {
            this.f13495a = str;
            if ((i10 & 2) == 0) {
                this.f13496b = null;
                return;
            } else {
                this.f13496b = str2;
                return;
            }
        }
        R4.b.e2(i10, 1, P0.f13490b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R0)) {
            return false;
        }
        R0 r02 = (R0) obj;
        if (AbstractC3557B.K(this.f13495a, r02.f13495a) && AbstractC3557B.K(this.f13496b, r02.f13496b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f13495a.hashCode() * 31;
        String str = this.f13496b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Url(url=");
        sb2.append(this.f13495a);
        sb2.append(", title=");
        return R.a.t(sb2, this.f13496b, Separators.RPAREN);
    }
}

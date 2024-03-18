package L9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class S {
    public static final Q Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10893a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10894b;

    public S(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f10893a = null;
        } else {
            this.f10893a = str;
        }
        if ((i10 & 2) == 0) {
            this.f10894b = null;
        } else {
            this.f10894b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        if (AbstractC3557B.K(this.f10893a, s10.f10893a) && AbstractC3557B.K(this.f10894b, s10.f10894b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f10893a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f10894b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GenerateTitleResponse(title=");
        sb2.append(this.f10893a);
        sb2.append(", message=");
        return R.a.t(sb2, this.f10894b, Separators.RPAREN);
    }
}

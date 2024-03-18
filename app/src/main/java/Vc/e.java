package Vc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class e {
    public static final d Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f18537a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18538b;

    public e(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f18537a = null;
        } else {
            this.f18537a = str;
        }
        if ((i10 & 2) == 0) {
            this.f18538b = null;
        } else {
            this.f18538b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3557B.K(this.f18537a, eVar.f18537a) && AbstractC3557B.K(this.f18538b, eVar.f18538b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f18537a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f18538b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorDetail(message=");
        sb2.append(this.f18537a);
        sb2.append(", type=");
        return R.a.t(sb2, this.f18538b, Separators.RPAREN);
    }
}

package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class Y {
    public static final X Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13510a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13511b;

    public Y(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f13510a = null;
        } else {
            this.f13510a = str;
        }
        if ((i10 & 2) == 0) {
            this.f13511b = null;
        } else {
            this.f13511b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        if (AbstractC3557B.K(this.f13510a, y10.f13510a) && AbstractC3557B.K(this.f13511b, y10.f13511b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f13510a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f13511b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data(type=");
        sb2.append(this.f13510a);
        sb2.append(", operationHash=");
        return R.a.t(sb2, this.f13511b, Separators.RPAREN);
    }

    public Y(String str, String str2) {
        this.f13510a = str;
        this.f13511b = str2;
    }
}

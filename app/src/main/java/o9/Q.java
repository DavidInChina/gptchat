package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class Q {
    public static final P Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13491a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13492b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13493c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f13494d;

    public Q(int i10, String str, String str2, String str3, Integer num) {
        if ((i10 & 1) == 0) {
            this.f13491a = null;
        } else {
            this.f13491a = str;
        }
        if ((i10 & 2) == 0) {
            this.f13492b = null;
        } else {
            this.f13492b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f13493c = null;
        } else {
            this.f13493c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f13494d = null;
        } else {
            this.f13494d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        if (AbstractC3557B.K(this.f13491a, q10.f13491a) && AbstractC3557B.K(this.f13492b, q10.f13492b) && AbstractC3557B.K(this.f13493c, q10.f13493c) && AbstractC3557B.K(this.f13494d, q10.f13494d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f13491a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        String str2 = this.f13492b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f13493c;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        Integer num = this.f13494d;
        if (num != null) {
            i13 = num.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "ApiInvokedPlugin(type=" + this.f13491a + ", namespace=" + this.f13492b + ", pluginId=" + this.f13493c + ", httpResponseStatus=" + this.f13494d + Separators.RPAREN;
    }

    public Q(String str, Integer num) {
        this.f13491a = "client";
        this.f13492b = str;
        this.f13493c = null;
        this.f13494d = num;
    }
}

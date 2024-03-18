package ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6182c0;

@AbstractC1998i
/* loaded from: classes.dex */
public final class T {
    public static final S Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f32032a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32033b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32034c;

    public T(int i10, String str, String str2, String str3) {
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, Q.f32031b);
            throw null;
        }
        this.f32032a = str;
        if ((i10 & 2) == 0) {
            this.f32033b = null;
        } else {
            this.f32033b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f32034c = null;
        } else {
            this.f32034c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        if (!AbstractC3557B.K(this.f32032a, t10.f32032a)) {
            return false;
        }
        String str = this.f32033b;
        String str2 = t10.f32033b;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f32034c, t10.f32034c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f32032a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f32033b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f32034c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        String str;
        String str2 = this.f32033b;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6182c0.a(str2);
        }
        StringBuilder sb2 = new StringBuilder("CustomActionResponse(type=");
        android.gov.nist.core.a.y(sb2, this.f32032a, ", targetMessageId=", str, ", operationHash=");
        return R.a.t(sb2, this.f32034c, Separators.RPAREN);
    }

    public T(String str, String str2, String str3) {
        this.f32032a = str;
        this.f32033b = str2;
        this.f32034c = str3;
    }
}

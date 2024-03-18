package Ta;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f16980a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16981b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16982c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16983d;

    public c(int i10, String str, String str2, String str3, String str4) {
        if (1 == (i10 & 1)) {
            this.f16980a = str;
            if ((i10 & 2) == 0) {
                this.f16981b = null;
            } else {
                this.f16981b = str2;
            }
            if ((i10 & 4) == 0) {
                this.f16982c = null;
            } else {
                this.f16982c = str3;
            }
            if ((i10 & 8) == 0) {
                this.f16983d = null;
                return;
            } else {
                this.f16983d = str4;
                return;
            }
        }
        R4.b.e2(i10, 1, a.f16979b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f16980a, cVar.f16980a) && AbstractC3557B.K(this.f16981b, cVar.f16981b) && AbstractC3557B.K(this.f16982c, cVar.f16982c) && AbstractC3557B.K(this.f16983d, cVar.f16983d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f16980a.hashCode() * 31;
        int i12 = 0;
        String str = this.f16981b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        String str2 = this.f16982c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f16983d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiMessageDownloadResponse(status=");
        sb2.append(this.f16980a);
        sb2.append(", downloadUrl=");
        sb2.append(this.f16981b);
        sb2.append(", errorCode=");
        sb2.append(this.f16982c);
        sb2.append(", errorMessage=");
        return R.a.t(sb2, this.f16983d, Separators.RPAREN);
    }
}

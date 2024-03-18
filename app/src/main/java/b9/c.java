package B9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f1990a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1991b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1992c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1993d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1994e;

    public c(int i10, String str, String str2, String str3, int i11, int i12) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, a.f1989b);
            throw null;
        }
        this.f1990a = str;
        this.f1991b = str2;
        this.f1992c = str3;
        if ((i10 & 8) == 0) {
            this.f1993d = 0;
        } else {
            this.f1993d = i11;
        }
        if ((i10 & 16) == 0) {
            this.f1994e = 0;
        } else {
            this.f1994e = i12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f1990a, cVar.f1990a) && AbstractC3557B.K(this.f1991b, cVar.f1991b) && AbstractC3557B.K(this.f1992c, cVar.f1992c) && this.f1993d == cVar.f1993d && this.f1994e == cVar.f1994e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f1990a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f1991b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f1992c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return ((((i14 + i12) * 31) + this.f1993d) * 31) + this.f1994e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssistStructureNode(className=");
        sb2.append(this.f1990a);
        sb2.append(", text=");
        sb2.append(this.f1991b);
        sb2.append(", contentDesc=");
        sb2.append(this.f1992c);
        sb2.append(", top=");
        sb2.append(this.f1993d);
        sb2.append(", left=");
        return android.gov.nist.core.a.l(sb2, this.f1994e, Separators.RPAREN);
    }

    public c(String str, int i10, String str2, int i11, String str3) {
        this.f1990a = str;
        this.f1991b = str2;
        this.f1992c = str3;
        this.f1993d = i10;
        this.f1994e = i11;
    }
}

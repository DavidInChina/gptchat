package Ba;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2008a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2009b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2010c;

    public c(int i10, String str, String str2, boolean z10) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, a.f2007b);
            throw null;
        }
        this.f2008a = z10;
        this.f2009b = str;
        this.f2010c = str2;
    }

    public static c a(c cVar, boolean z10, String str, String str2, int i10) {
        if ((i10 & 1) != 0) {
            z10 = cVar.f2008a;
        }
        if ((i10 & 2) != 0) {
            str = cVar.f2009b;
        }
        if ((i10 & 4) != 0) {
            str2 = cVar.f2010c;
        }
        cVar.getClass();
        return new c(str, str2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2008a == cVar.f2008a && AbstractC3557B.K(this.f2009b, cVar.f2009b) && AbstractC3557B.K(this.f2010c, cVar.f2010c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        if (this.f2008a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = i10 * 31;
        int i13 = 0;
        String str = this.f2009b;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i14 = (i12 + i11) * 31;
        String str2 = this.f2010c;
        if (str2 != null) {
            i13 = str2.hashCode();
        }
        return i14 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomInstructions(enabled=");
        sb2.append(this.f2008a);
        sb2.append(", aboutUserMessage=");
        sb2.append(this.f2009b);
        sb2.append(", aboutModelMessage=");
        return R.a.t(sb2, this.f2010c, Separators.RPAREN);
    }

    public c(String str, String str2, boolean z10) {
        this.f2008a = z10;
        this.f2009b = str;
        this.f2010c = str2;
    }
}

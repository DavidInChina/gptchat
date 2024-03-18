package Rb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class L {
    public static final K Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f15274a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15275b;

    public L(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, J.f15273b);
            throw null;
        }
        this.f15274a = str;
        this.f15275b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        if (AbstractC3557B.K(this.f15274a, l10.f15274a) && AbstractC3557B.K(this.f15275b, l10.f15275b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15274a.hashCode() * 31;
        String str = this.f15275b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReportContentSentReason(id=");
        sb2.append(this.f15274a);
        sb2.append(", details=");
        return R.a.t(sb2, this.f15275b, Separators.RPAREN);
    }

    public L(String str, String str2) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f15274a = str;
        this.f15275b = str2;
    }
}

package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class W1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49124a;

    /* renamed from: b  reason: collision with root package name */
    public final X1 f49125b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f49126c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f49127d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f49128e;

    public W1(String str, X1 x12, Boolean bool, Boolean bool2, Boolean bool3) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        this.f49124a = str;
        this.f49125b = x12;
        this.f49126c = bool;
        this.f49127d = bool2;
        this.f49128e = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W1)) {
            return false;
        }
        W1 w12 = (W1) obj;
        if (AbstractC3557B.K(this.f49124a, w12.f49124a) && this.f49125b == w12.f49125b && AbstractC3557B.K(this.f49126c, w12.f49126c) && AbstractC3557B.K(this.f49127d, w12.f49127d) && AbstractC3557B.K(this.f49128e, w12.f49128e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (this.f49125b.hashCode() + (this.f49124a.hashCode() * 31)) * 31;
        int i12 = 0;
        Boolean bool = this.f49126c;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        Boolean bool2 = this.f49127d;
        if (bool2 == null) {
            i11 = 0;
        } else {
            i11 = bool2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Boolean bool3 = this.f49128e;
        if (bool3 != null) {
            i12 = bool3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "ViewEventSession(id=" + this.f49124a + ", type=" + this.f49125b + ", hasReplay=" + this.f49126c + ", isActive=" + this.f49127d + ", sampledForReplay=" + this.f49128e + Separators.RPAREN;
    }
}

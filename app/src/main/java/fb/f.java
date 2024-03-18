package Fb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f5145a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5146b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5147c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5148d;

    public f(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, d.f5144b);
            throw null;
        }
        this.f5145a = str;
        this.f5146b = str2;
        this.f5147c = str3;
        this.f5148d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f5145a, fVar.f5145a) && AbstractC3557B.K(this.f5146b, fVar.f5146b) && AbstractC3557B.K(this.f5147c, fVar.f5147c) && AbstractC3557B.K(this.f5148d, fVar.f5148d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f5146b, this.f5145a.hashCode() * 31, 31);
        int i11 = 0;
        String str = this.f5147c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (v10 + i10) * 31;
        String str2 = this.f5148d;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Country(id=");
        sb2.append(this.f5145a);
        sb2.append(", label=");
        sb2.append(this.f5146b);
        sb2.append(", dialCode=");
        sb2.append(this.f5147c);
        sb2.append(", labelLocal=");
        return R.a.t(sb2, this.f5148d, Separators.RPAREN);
    }

    public f() {
        this.f5145a = "US";
        this.f5146b = "US";
        this.f5147c = "1";
        this.f5148d = "US";
    }
}

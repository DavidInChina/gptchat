package Zb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23649a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23650b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23651c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23652d;

    /* renamed from: e  reason: collision with root package name */
    public final String f23653e;

    public f(int i10, int i11, String str, String str2, String str3, String str4) {
        if (31 != (i10 & 31)) {
            R4.b.e2(i10, 31, d.f23648b);
            throw null;
        }
        this.f23649a = str;
        this.f23650b = i11;
        this.f23651c = str2;
        this.f23652d = str3;
        this.f23653e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f23649a, fVar.f23649a) && this.f23650b == fVar.f23650b && AbstractC3557B.K(this.f23651c, fVar.f23651c) && AbstractC3557B.K(this.f23652d, fVar.f23652d) && AbstractC3557B.K(this.f23653e, fVar.f23653e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23653e.hashCode() + E9.f.v(this.f23652d, E9.f.v(this.f23651c, ((this.f23649a.hashCode() * 31) + this.f23650b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SunsetRequest(userAgent=");
        sb2.append(this.f23649a);
        sb2.append(", buildNumber=");
        sb2.append(this.f23650b);
        sb2.append(", deviceType=");
        sb2.append(this.f23651c);
        sb2.append(", appVersion=");
        sb2.append(this.f23652d);
        sb2.append(", systemVersion=");
        return R.a.t(sb2, this.f23653e, Separators.RPAREN);
    }

    public f(int i10, String str, String str2, String str3, String str4) {
        AbstractC3557B.c0("userAgent", str);
        AbstractC3557B.c0("deviceType", str2);
        AbstractC3557B.c0("appVersion", str3);
        AbstractC3557B.c0("systemVersion", str4);
        this.f23649a = str;
        this.f23650b = i10;
        this.f23651c = str2;
        this.f23652d = str3;
        this.f23653e = str4;
    }
}

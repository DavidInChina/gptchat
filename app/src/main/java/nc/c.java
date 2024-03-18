package Nc;

import E9.f;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f12780a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12781b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12782c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12783d;

    public c(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, a.f12779b);
            throw null;
        }
        this.f12780a = str;
        this.f12781b = str2;
        this.f12782c = str3;
        this.f12783d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f12780a, cVar.f12780a) && AbstractC3557B.K(this.f12781b, cVar.f12781b) && AbstractC3557B.K(this.f12782c, cVar.f12782c) && AbstractC3557B.K(this.f12783d, cVar.f12783d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12783d.hashCode() + f.v(this.f12782c, f.v(this.f12781b, this.f12780a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayIntegrityRequest(packageName=");
        sb2.append(this.f12780a);
        sb2.append(", nonce=");
        sb2.append(this.f12781b);
        sb2.append(", integrityToken=");
        sb2.append(this.f12782c);
        sb2.append(", deviceId=");
        return R.a.t(sb2, this.f12783d, Separators.RPAREN);
    }

    public c(String str, String str2, String str3, String str4) {
        AbstractC3557B.c0("packageName", str);
        AbstractC3557B.c0("nonce", str2);
        AbstractC3557B.c0("deviceId", str4);
        this.f12780a = str;
        this.f12781b = str2;
        this.f12782c = str3;
        this.f12783d = str4;
    }
}

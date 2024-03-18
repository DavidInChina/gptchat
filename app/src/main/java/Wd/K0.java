package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class K0 {
    public static final J0 Companion = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final K0 f48351f = new K0(0, "fake", "someone@openai.com", "John Doe", null);

    /* renamed from: a  reason: collision with root package name */
    public final String f48352a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48353b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48354c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48355d;

    /* renamed from: e  reason: collision with root package name */
    public final int f48356e;

    public K0(int i10, int i11, String str, String str2, String str3, String str4) {
        if (31 != (i10 & 31)) {
            R4.b.e2(i10, 31, I0.f48348b);
            throw null;
        }
        this.f48352a = str;
        this.f48353b = str2;
        this.f48354c = str3;
        this.f48355d = str4;
        this.f48356e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        if (AbstractC3557B.K(this.f48352a, k02.f48352a) && AbstractC3557B.K(this.f48353b, k02.f48353b) && AbstractC3557B.K(this.f48354c, k02.f48354c) && AbstractC3557B.K(this.f48355d, k02.f48355d) && this.f48356e == k02.f48356e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f48354c, E9.f.v(this.f48353b, this.f48352a.hashCode() * 31, 31), 31);
        String str = this.f48355d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return ((v10 + i10) * 31) + this.f48356e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("User(id=");
        sb2.append(this.f48352a);
        sb2.append(", email=");
        sb2.append(this.f48353b);
        sb2.append(", name=");
        sb2.append(this.f48354c);
        sb2.append(", picture=");
        sb2.append(this.f48355d);
        sb2.append(", created=");
        return android.gov.nist.core.a.l(sb2, this.f48356e, Separators.RPAREN);
    }

    public K0(int i10, String str, String str2, String str3, String str4) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("email", str2);
        AbstractC3557B.c0("name", str3);
        this.f48352a = str;
        this.f48353b = str2;
        this.f48354c = str3;
        this.f48355d = str4;
        this.f48356e = i10;
    }
}

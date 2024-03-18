package wc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: wc.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6165g {
    public static final C6164f Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48305a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48306b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48307c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48308d;

    /* renamed from: e  reason: collision with root package name */
    public final int f48309e;

    public C6165g(int i10, int i11, String str, String str2, String str3, String str4) {
        if (31 == (i10 & 31)) {
            this.f48305a = str;
            this.f48306b = str2;
            this.f48307c = str3;
            this.f48308d = str4;
            this.f48309e = i11;
            return;
        }
        R4.b.e2(i10, 31, C6163e.f48304b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6165g)) {
            return false;
        }
        C6165g c6165g = (C6165g) obj;
        if (AbstractC3557B.K(this.f48305a, c6165g.f48305a) && AbstractC3557B.K(this.f48306b, c6165g.f48306b) && AbstractC3557B.K(this.f48307c, c6165g.f48307c) && AbstractC3557B.K(this.f48308d, c6165g.f48308d) && this.f48309e == c6165g.f48309e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f48307c, E9.f.v(this.f48306b, this.f48305a.hashCode() * 31, 31), 31);
        String str = this.f48308d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return ((v10 + i10) * 31) + this.f48309e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserResponse(id=");
        sb2.append(this.f48305a);
        sb2.append(", email=");
        sb2.append(this.f48306b);
        sb2.append(", name=");
        sb2.append(this.f48307c);
        sb2.append(", picture=");
        sb2.append(this.f48308d);
        sb2.append(", created=");
        return android.gov.nist.core.a.l(sb2, this.f48309e, Separators.RPAREN);
    }
}

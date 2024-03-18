package c6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: c6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2296a {

    /* renamed from: a  reason: collision with root package name */
    public final C2302g f26289a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26290b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26291c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26292d;

    /* renamed from: e  reason: collision with root package name */
    public final String f26293e;

    public C2296a(C2302g c2302g, String str, String str2, String str3, String str4) {
        AbstractC3557B.c0("connectivity", str4);
        this.f26289a = c2302g;
        this.f26290b = str;
        this.f26291c = str2;
        this.f26292d = str3;
        this.f26293e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2296a)) {
            return false;
        }
        C2296a c2296a = (C2296a) obj;
        if (AbstractC3557B.K(this.f26289a, c2296a.f26289a) && AbstractC3557B.K(this.f26290b, c2296a.f26290b) && AbstractC3557B.K(this.f26291c, c2296a.f26291c) && AbstractC3557B.K(this.f26292d, c2296a.f26292d) && AbstractC3557B.K(this.f26293e, c2296a.f26293e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        C2302g c2302g = this.f26289a;
        if (c2302g == null) {
            i10 = 0;
        } else {
            i10 = c2302g.hashCode();
        }
        int i14 = i10 * 31;
        String str = this.f26290b;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str2 = this.f26291c;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str3 = this.f26292d;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return this.f26293e.hashCode() + ((i16 + i13) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Client(simCarrier=");
        sb2.append(this.f26289a);
        sb2.append(", signalStrength=");
        sb2.append(this.f26290b);
        sb2.append(", downlinkKbps=");
        sb2.append(this.f26291c);
        sb2.append(", uplinkKbps=");
        sb2.append(this.f26292d);
        sb2.append(", connectivity=");
        return R.a.t(sb2, this.f26293e, Separators.RPAREN);
    }
}

package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6282b0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49255a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49256b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49257c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49258d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49259e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49260f;

    /* renamed from: g  reason: collision with root package name */
    public final String f49261g;

    public C6282b0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f49255a = str;
        this.f49256b = str2;
        this.f49257c = str3;
        this.f49258d = str4;
        this.f49259e = str5;
        this.f49260f = str6;
        this.f49261g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6282b0)) {
            return false;
        }
        C6282b0 c6282b0 = (C6282b0) obj;
        if (AbstractC3557B.K(this.f49255a, c6282b0.f49255a) && AbstractC3557B.K(this.f49256b, c6282b0.f49256b) && AbstractC3557B.K(this.f49257c, c6282b0.f49257c) && AbstractC3557B.K(this.f49258d, c6282b0.f49258d) && AbstractC3557B.K(this.f49259e, c6282b0.f49259e) && AbstractC3557B.K(this.f49260f, c6282b0.f49260f) && AbstractC3557B.K(this.f49261g, c6282b0.f49261g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        String str = this.f49255a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i17 = i10 * 31;
        String str2 = this.f49256b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i18 = (i17 + i11) * 31;
        String str3 = this.f49257c;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i19 = (i18 + i12) * 31;
        String str4 = this.f49258d;
        if (str4 == null) {
            i13 = 0;
        } else {
            i13 = str4.hashCode();
        }
        int i20 = (i19 + i13) * 31;
        String str5 = this.f49259e;
        if (str5 == null) {
            i14 = 0;
        } else {
            i14 = str5.hashCode();
        }
        int i21 = (i20 + i14) * 31;
        String str6 = this.f49260f;
        if (str6 == null) {
            i15 = 0;
        } else {
            i15 = str6.hashCode();
        }
        int i22 = (i21 + i15) * 31;
        String str7 = this.f49261g;
        if (str7 != null) {
            i16 = str7.hashCode();
        }
        return i22 + i16;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Meta(codeType=");
        sb2.append(this.f49255a);
        sb2.append(", parentProcess=");
        sb2.append(this.f49256b);
        sb2.append(", incidentIdentifier=");
        sb2.append(this.f49257c);
        sb2.append(", process=");
        sb2.append(this.f49258d);
        sb2.append(", exceptionType=");
        sb2.append(this.f49259e);
        sb2.append(", exceptionCodes=");
        sb2.append(this.f49260f);
        sb2.append(", path=");
        return R.a.t(sb2, this.f49261g, Separators.RPAREN);
    }
}

package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class G implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f11778a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11779b;

    /* renamed from: c  reason: collision with root package name */
    public final Yg.r f11780c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11781d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11782e;

    /* renamed from: f  reason: collision with root package name */
    public final Fb.f f11783f;

    /* renamed from: g  reason: collision with root package name */
    public final List f11784g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11785h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f11786i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f11787j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f11788k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f11789l;

    public G(String str, String str2, Yg.r rVar, String str3, String str4, Fb.f fVar, List list, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC3557B.c0("countries", list);
        this.f11778a = str;
        this.f11779b = str2;
        this.f11780c = rVar;
        this.f11781d = str3;
        this.f11782e = str4;
        this.f11783f = fVar;
        this.f11784g = list;
        this.f11785h = z10;
        this.f11786i = z11;
        this.f11787j = z12;
        this.f11788k = z13;
        this.f11789l = z14;
    }

    public static G e(G g10, String str, String str2, Yg.r rVar, String str3, String str4, Fb.f fVar, List list, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10) {
        String str5;
        String str6;
        Yg.r rVar2;
        String str7;
        String str8;
        Fb.f fVar2;
        List list2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        if ((i10 & 1) != 0) {
            str5 = g10.f11778a;
        } else {
            str5 = str;
        }
        if ((i10 & 2) != 0) {
            str6 = g10.f11779b;
        } else {
            str6 = str2;
        }
        if ((i10 & 4) != 0) {
            rVar2 = g10.f11780c;
        } else {
            rVar2 = rVar;
        }
        if ((i10 & 8) != 0) {
            str7 = g10.f11781d;
        } else {
            str7 = str3;
        }
        if ((i10 & 16) != 0) {
            str8 = g10.f11782e;
        } else {
            str8 = str4;
        }
        if ((i10 & 32) != 0) {
            fVar2 = g10.f11783f;
        } else {
            fVar2 = fVar;
        }
        if ((i10 & 64) != 0) {
            list2 = g10.f11784g;
        } else {
            list2 = list;
        }
        if ((i10 & 128) != 0) {
            z15 = g10.f11785h;
        } else {
            z15 = z10;
        }
        if ((i10 & 256) != 0) {
            z16 = g10.f11786i;
        } else {
            z16 = z11;
        }
        if ((i10 & 512) != 0) {
            z17 = g10.f11787j;
        } else {
            z17 = z12;
        }
        if ((i10 & 1024) != 0) {
            z18 = g10.f11788k;
        } else {
            z18 = z13;
        }
        if ((i10 & 2048) != 0) {
            z19 = g10.f11789l;
        } else {
            z19 = z14;
        }
        g10.getClass();
        AbstractC3557B.c0("countries", list2);
        return new G(str5, str6, rVar2, str7, str8, fVar2, list2, z15, z16, z17, z18, z19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (AbstractC3557B.K(this.f11778a, g10.f11778a) && AbstractC3557B.K(this.f11779b, g10.f11779b) && AbstractC3557B.K(this.f11780c, g10.f11780c) && AbstractC3557B.K(this.f11781d, g10.f11781d) && AbstractC3557B.K(this.f11782e, g10.f11782e) && AbstractC3557B.K(this.f11783f, g10.f11783f) && AbstractC3557B.K(this.f11784g, g10.f11784g) && this.f11785h == g10.f11785h && this.f11786i == g10.f11786i && this.f11787j == g10.f11787j && this.f11788k == g10.f11788k && this.f11789l == g10.f11789l) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        String str;
        String str2;
        if ((!this.f11784g.isEmpty()) && this.f11783f != null && (str = this.f11778a) != null && (!Lg.n.n2(str)) && (str2 = this.f11779b) != null && (!Lg.n.n2(str2)) && this.f11780c != null && (this.f11781d != null || !this.f11789l)) {
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
        int i16;
        int i17;
        int i18;
        int i19 = 0;
        String str = this.f11778a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i20 = i10 * 31;
        String str2 = this.f11779b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i21 = (i20 + i11) * 31;
        Yg.r rVar = this.f11780c;
        if (rVar == null) {
            i12 = 0;
        } else {
            i12 = rVar.f22420Y.hashCode();
        }
        int i22 = (i21 + i12) * 31;
        String str3 = this.f11781d;
        if (str3 == null) {
            i13 = 0;
        } else {
            i13 = str3.hashCode();
        }
        int i23 = (i22 + i13) * 31;
        String str4 = this.f11782e;
        if (str4 == null) {
            i14 = 0;
        } else {
            i14 = str4.hashCode();
        }
        int i24 = (i23 + i14) * 31;
        Fb.f fVar = this.f11783f;
        if (fVar != null) {
            i19 = fVar.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f11784g, (i24 + i19) * 31, 31);
        int i25 = 1237;
        if (this.f11785h) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i26 = (s10 + i15) * 31;
        if (this.f11786i) {
            i16 = 1231;
        } else {
            i16 = 1237;
        }
        int i27 = (i26 + i16) * 31;
        if (this.f11787j) {
            i17 = 1231;
        } else {
            i17 = 1237;
        }
        int i28 = (i27 + i17) * 31;
        if (this.f11788k) {
            i18 = 1231;
        } else {
            i18 = 1237;
        }
        int i29 = (i28 + i18) * 31;
        if (this.f11789l) {
            i25 = 1231;
        }
        return i29 + i25;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FinishAccountState(firstName=");
        sb2.append(this.f11778a);
        sb2.append(", lastName=");
        sb2.append(this.f11779b);
        sb2.append(", birthday=");
        sb2.append(this.f11780c);
        sb2.append(", phone=");
        sb2.append(this.f11781d);
        sb2.append(", birthdayError=");
        sb2.append(this.f11782e);
        sb2.append(", selectedCountry=");
        sb2.append(this.f11783f);
        sb2.append(", countries=");
        sb2.append(this.f11784g);
        sb2.append(", preventSignup=");
        sb2.append(this.f11785h);
        sb2.append(", hasAttemptedTosViolation=");
        sb2.append(this.f11786i);
        sb2.append(", requiresParentalConsent=");
        sb2.append(this.f11787j);
        sb2.append(", requiresKRAddendum=");
        sb2.append(this.f11788k);
        sb2.append(", requiresPhoneVerification=");
        return AbstractC4194d.w(sb2, this.f11789l, Separators.RPAREN);
    }
}

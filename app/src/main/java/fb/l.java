package Fb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class l {
    public static final k Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f5156a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5157b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f5158c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5159d;

    /* renamed from: e  reason: collision with root package name */
    public final Yg.p f5160e;

    public l(int i10, Boolean bool, String str, Boolean bool2, String str2, Yg.p pVar) {
        if ((i10 & 1) == 0) {
            this.f5156a = null;
        } else {
            this.f5156a = bool;
        }
        if ((i10 & 2) == 0) {
            this.f5157b = null;
        } else {
            this.f5157b = str;
        }
        if ((i10 & 4) == 0) {
            this.f5158c = null;
        } else {
            this.f5158c = bool2;
        }
        if ((i10 & 8) == 0) {
            this.f5159d = null;
        } else {
            this.f5159d = str2;
        }
        if ((i10 & 16) == 0) {
            this.f5160e = null;
        } else {
            this.f5160e = pVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f5156a, lVar.f5156a) && AbstractC3557B.K(this.f5157b, lVar.f5157b) && AbstractC3557B.K(this.f5158c, lVar.f5158c) && AbstractC3557B.K(this.f5159d, lVar.f5159d) && AbstractC3557B.K(this.f5160e, lVar.f5160e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        Boolean bool = this.f5156a;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        int i15 = i10 * 31;
        String str = this.f5157b;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        Boolean bool2 = this.f5158c;
        if (bool2 == null) {
            i12 = 0;
        } else {
            i12 = bool2.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        String str2 = this.f5159d;
        if (str2 == null) {
            i13 = 0;
        } else {
            i13 = str2.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        Yg.p pVar = this.f5160e;
        if (pVar != null) {
            i14 = pVar.f22419Y.hashCode();
        }
        return i18 + i14;
    }

    public final String toString() {
        return "OnboardLoginResponse(phoneException=" + this.f5156a + ", ipCountry=" + this.f5157b + ", arkoseEnabled=" + this.f5158c + ", arkoseDataPayload=" + this.f5159d + ", maxBirthDateUtc=" + this.f5160e + Separators.RPAREN;
    }
}

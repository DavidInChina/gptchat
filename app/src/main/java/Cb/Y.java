package Cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class Y {
    public static final X Companion = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer[] f2918h = {g0.Companion.serializer(), null, null, null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final g0 f2919a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2920b;

    /* renamed from: c  reason: collision with root package name */
    public final C0293c f2921c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2922d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2923e;

    /* renamed from: f  reason: collision with root package name */
    public final Yg.p f2924f;

    /* renamed from: g  reason: collision with root package name */
    public final F f2925g;

    public Y(int i10, g0 g0Var, String str, C0293c c0293c, String str2, String str3, Yg.p pVar, F f6) {
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, W.f2917b);
            throw null;
        }
        this.f2919a = g0Var;
        if ((i10 & 2) == 0) {
            this.f2920b = null;
        } else {
            this.f2920b = str;
        }
        if ((i10 & 4) == 0) {
            this.f2921c = null;
        } else {
            this.f2921c = c0293c;
        }
        if ((i10 & 8) == 0) {
            this.f2922d = null;
        } else {
            this.f2922d = str2;
        }
        if ((i10 & 16) == 0) {
            this.f2923e = null;
        } else {
            this.f2923e = str3;
        }
        if ((i10 & 32) == 0) {
            this.f2924f = null;
        } else {
            this.f2924f = pVar;
        }
        if ((i10 & 64) == 0) {
            this.f2925g = null;
        } else {
            this.f2925g = f6;
        }
    }

    public static Y a(Y y10, g0 g0Var, String str, C0293c c0293c, String str2, String str3, Yg.p pVar, F f6, int i10) {
        g0 g0Var2;
        String str4;
        C0293c c0293c2;
        String str5;
        String str6;
        Yg.p pVar2;
        F f10;
        if ((i10 & 1) != 0) {
            g0Var2 = y10.f2919a;
        } else {
            g0Var2 = g0Var;
        }
        if ((i10 & 2) != 0) {
            str4 = y10.f2920b;
        } else {
            str4 = str;
        }
        if ((i10 & 4) != 0) {
            c0293c2 = y10.f2921c;
        } else {
            c0293c2 = c0293c;
        }
        if ((i10 & 8) != 0) {
            str5 = y10.f2922d;
        } else {
            str5 = str2;
        }
        if ((i10 & 16) != 0) {
            str6 = y10.f2923e;
        } else {
            str6 = str3;
        }
        if ((i10 & 32) != 0) {
            pVar2 = y10.f2924f;
        } else {
            pVar2 = pVar;
        }
        if ((i10 & 64) != 0) {
            f10 = y10.f2925g;
        } else {
            f10 = f6;
        }
        y10.getClass();
        AbstractC3557B.c0("stage", g0Var2);
        return new Y(g0Var2, str4, c0293c2, str5, str6, pVar2, f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        if (this.f2919a != y10.f2919a || !AbstractC3557B.K(this.f2920b, y10.f2920b) || !AbstractC3557B.K(this.f2921c, y10.f2921c)) {
            return false;
        }
        String str = this.f2922d;
        String str2 = y10.f2922d;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        String str3 = this.f2923e;
        String str4 = y10.f2923e;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f2924f, y10.f2924f) && AbstractC3557B.K(this.f2925g, y10.f2925g)) {
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
        int hashCode = this.f2919a.hashCode() * 31;
        int i15 = 0;
        String str = this.f2920b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i16 = (hashCode + i10) * 31;
        C0293c c0293c = this.f2921c;
        if (c0293c == null) {
            i11 = 0;
        } else {
            i11 = c0293c.hashCode();
        }
        int i17 = (i16 + i11) * 31;
        String str2 = this.f2922d;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int i18 = (i17 + i12) * 31;
        String str3 = this.f2923e;
        if (str3 == null) {
            i13 = 0;
        } else {
            i13 = str3.hashCode();
        }
        int i19 = (i18 + i13) * 31;
        Yg.p pVar = this.f2924f;
        if (pVar == null) {
            i14 = 0;
        } else {
            i14 = pVar.f22419Y.hashCode();
        }
        int i20 = (i19 + i14) * 31;
        F f6 = this.f2925g;
        if (f6 != null) {
            i15 = f6.hashCode();
        }
        return i20 + i15;
    }

    public final String toString() {
        String str;
        String str2 = "null";
        String str3 = this.f2922d;
        if (str3 == null) {
            str = str2;
        } else {
            str = android.gov.nist.core.a.A("ArkoseToken(value=", str3, Separators.RPAREN);
        }
        String str4 = this.f2923e;
        if (str4 != null) {
            str2 = android.gov.nist.core.a.A("PhoneVerificationId(value=", str4, Separators.RPAREN);
        }
        return "OnboardingState(stage=" + this.f2919a + ", email=" + this.f2920b + ", accountInfo=" + this.f2921c + ", arkoseToken=" + str + ", phoneVerificationId=" + str2 + ", againstTermsOfServiceSignUpTimestamp=" + this.f2924f + ", config=" + this.f2925g + Separators.RPAREN;
    }

    public Y(g0 g0Var, String str, C0293c c0293c, String str2, String str3, Yg.p pVar, F f6) {
        this.f2919a = g0Var;
        this.f2920b = str;
        this.f2921c = c0293c;
        this.f2922d = str2;
        this.f2923e = str3;
        this.f2924f = pVar;
        this.f2925g = f6;
    }
}

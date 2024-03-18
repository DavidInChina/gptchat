package Cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class F {
    public static final E Companion = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer[] f2868g = {null, null, null, null, null, new C2695d(Fb.d.f5143a, 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final F f2869h;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2870a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2871b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2872c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2873d;

    /* renamed from: e  reason: collision with root package name */
    public final Yg.r f2874e;

    /* renamed from: f  reason: collision with root package name */
    public final List f2875f;

    /* JADX WARN: Type inference failed for: r2v0, types: [Cb.E, java.lang.Object] */
    static {
        String country = Locale.getDefault().getCountry();
        AbstractC3557B.b0("getCountry(...)", country);
        f2869h = new F(true, true, null, country, Bi.c.J0(), kf.v.f37483Y);
    }

    public F(boolean z10, boolean z11, String str, String str2, Yg.r rVar, List list) {
        AbstractC3557B.c0("defaultCountry", str2);
        AbstractC3557B.c0("maxBirthDate", rVar);
        AbstractC3557B.c0("countries", list);
        this.f2870a = z10;
        this.f2871b = z11;
        this.f2872c = str;
        this.f2873d = str2;
        this.f2874e = rVar;
        this.f2875f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        if (this.f2870a == f6.f2870a && this.f2871b == f6.f2871b && AbstractC3557B.K(this.f2872c, f6.f2872c) && AbstractC3557B.K(this.f2873d, f6.f2873d) && AbstractC3557B.K(this.f2874e, f6.f2874e) && AbstractC3557B.K(this.f2875f, f6.f2875f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 1237;
        if (this.f2870a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i13 = i10 * 31;
        if (this.f2871b) {
            i12 = 1231;
        }
        int i14 = (i13 + i12) * 31;
        String str = this.f2872c;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        return this.f2875f.hashCode() + ((this.f2874e.f22420Y.hashCode() + E9.f.v(this.f2873d, (i14 + i11) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingConfig(phoneVerificationRequired=");
        sb2.append(this.f2870a);
        sb2.append(", arkoseRequired=");
        sb2.append(this.f2871b);
        sb2.append(", arkosePayload=");
        sb2.append(this.f2872c);
        sb2.append(", defaultCountry=");
        sb2.append(this.f2873d);
        sb2.append(", maxBirthDate=");
        sb2.append(this.f2874e);
        sb2.append(", countries=");
        return android.gov.nist.core.a.o(sb2, this.f2875f, Separators.RPAREN);
    }

    public F(int i10, boolean z10, boolean z11, String str, String str2, Yg.r rVar, List list) {
        if ((i10 & 1) == 0) {
            this.f2870a = true;
        } else {
            this.f2870a = z10;
        }
        if ((i10 & 2) == 0) {
            this.f2871b = true;
        } else {
            this.f2871b = z11;
        }
        if ((i10 & 4) == 0) {
            this.f2872c = null;
        } else {
            this.f2872c = str;
        }
        if ((i10 & 8) == 0) {
            String country = Locale.getDefault().getCountry();
            AbstractC3557B.b0("getCountry(...)", country);
            this.f2873d = country;
        } else {
            this.f2873d = str2;
        }
        if ((i10 & 16) == 0) {
            this.f2874e = Bi.c.J0();
        } else {
            this.f2874e = rVar;
        }
        if ((i10 & 32) == 0) {
            this.f2875f = kf.v.f37483Y;
        } else {
            this.f2875f = list;
        }
    }
}

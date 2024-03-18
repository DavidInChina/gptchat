package Rb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class C {
    public static final B Companion = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer[] f15248k = {null, null, null, null, null, null, null, null, null, new C2695d(C1259e.f15347a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f15249a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15250b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15251c;

    /* renamed from: d  reason: collision with root package name */
    public final List f15252d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15253e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15254f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15255g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15256h;

    /* renamed from: i  reason: collision with root package name */
    public final String f15257i;

    /* renamed from: j  reason: collision with root package name */
    public final List f15258j;

    public C(int i10, String str, String str2, String str3, List list, boolean z10, String str4, String str5, String str6, String str7, List list2) {
        if (31 != (i10 & 31)) {
            R4.b.e2(i10, 31, A.f15247b);
            throw null;
        }
        this.f15249a = str;
        this.f15250b = str2;
        this.f15251c = str3;
        this.f15252d = list;
        this.f15253e = z10;
        if ((i10 & 32) == 0) {
            this.f15254f = null;
        } else {
            this.f15254f = str4;
        }
        if ((i10 & 64) == 0) {
            this.f15255g = null;
        } else {
            this.f15255g = str5;
        }
        if ((i10 & 128) == 0) {
            this.f15256h = null;
        } else {
            this.f15256h = str6;
        }
        if ((i10 & 256) == 0) {
            this.f15257i = null;
        } else {
            this.f15257i = str7;
        }
        if ((i10 & 512) == 0) {
            this.f15258j = kf.v.f37483Y;
        } else {
            this.f15258j = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (AbstractC3557B.K(this.f15249a, c10.f15249a) && AbstractC3557B.K(this.f15250b, c10.f15250b) && AbstractC3557B.K(this.f15251c, c10.f15251c) && AbstractC3557B.K(this.f15252d, c10.f15252d) && this.f15253e == c10.f15253e && AbstractC3557B.K(this.f15254f, c10.f15254f) && AbstractC3557B.K(this.f15255g, c10.f15255g) && AbstractC3557B.K(this.f15256h, c10.f15256h) && AbstractC3557B.K(this.f15257i, c10.f15257i) && AbstractC3557B.K(this.f15258j, c10.f15258j)) {
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
        int v10 = E9.f.v(this.f15250b, this.f15249a.hashCode() * 31, 31);
        int i15 = 0;
        String str = this.f15251c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f15252d, (v10 + i10) * 31, 31);
        if (this.f15253e) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i16 = (s10 + i11) * 31;
        String str2 = this.f15254f;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        String str3 = this.f15255g;
        if (str3 == null) {
            i13 = 0;
        } else {
            i13 = str3.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        String str4 = this.f15256h;
        if (str4 == null) {
            i14 = 0;
        } else {
            i14 = str4.hashCode();
        }
        int i19 = (i18 + i14) * 31;
        String str5 = this.f15257i;
        if (str5 != null) {
            i15 = str5.hashCode();
        }
        return this.f15258j.hashCode() + ((i19 + i15) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReportContentReason(id=");
        sb2.append(this.f15249a);
        sb2.append(", cta=");
        sb2.append(this.f15250b);
        sb2.append(", explanation=");
        sb2.append(this.f15251c);
        sb2.append(", subReasons=");
        sb2.append(this.f15252d);
        sb2.append(", hasDetails=");
        sb2.append(this.f15253e);
        sb2.append(", detailsPlaceholder=");
        sb2.append(this.f15254f);
        sb2.append(", linkExplanation=");
        sb2.append(this.f15255g);
        sb2.append(", linkAttachment=");
        sb2.append(this.f15256h);
        sb2.append(", subtext=");
        sb2.append(this.f15257i);
        sb2.append(", additionalFields=");
        return android.gov.nist.core.a.o(sb2, this.f15258j, Separators.RPAREN);
    }

    public C(String str, String str2, String str3, String str4, String str5, List list, int i10) {
        kf.v vVar = kf.v.f37483Y;
        str3 = (i10 & 64) != 0 ? null : str3;
        str5 = (i10 & 256) != 0 ? null : str5;
        this.f15249a = ParameterNames.ID;
        this.f15250b = str;
        this.f15251c = "explanation";
        this.f15252d = vVar;
        this.f15253e = true;
        this.f15254f = str2;
        this.f15255g = str3;
        this.f15256h = str4;
        this.f15257i = str5;
        this.f15258j = list;
    }
}

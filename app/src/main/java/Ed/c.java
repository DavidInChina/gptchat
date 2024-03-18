package Ed;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import wd.C6168C;
import wd.C6171F;
import wd.C6182c0;
import wd.C6190g0;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f4657a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4658b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4659c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4660d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4661e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4662f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4663g;

    /* renamed from: h  reason: collision with root package name */
    public final C6171F f4664h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4665i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4666j;

    public c(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, String str6, C6171F c6171f, boolean z11, boolean z12) {
        if (1023 != (i10 & 1023)) {
            R4.b.e2(i10, 1023, a.f4656b);
            throw null;
        }
        this.f4657a = str;
        this.f4658b = str2;
        this.f4659c = str3;
        this.f4660d = str4;
        this.f4661e = str5;
        this.f4662f = z10;
        this.f4663g = str6;
        this.f4664h = c6171f;
        this.f4665i = z11;
        this.f4666j = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!AbstractC3557B.K(this.f4657a, cVar.f4657a) || !AbstractC3557B.K(this.f4658b, cVar.f4658b)) {
            return false;
        }
        String str = this.f4659c;
        String str2 = cVar.f4659c;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        String str3 = this.f4660d;
        String str4 = cVar.f4660d;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        if (!AbstractC3557B.K(this.f4661e, cVar.f4661e) || this.f4662f != cVar.f4662f) {
            return false;
        }
        String str5 = this.f4663g;
        String str6 = cVar.f4663g;
        if (str5 != null ? !(str6 != null && AbstractC3557B.K(str5, str6)) : str6 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f4664h, cVar.f4664h) && this.f4665i == cVar.f4665i && this.f4666j == cVar.f4666j) {
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
        int v10 = E9.f.v(this.f4658b, this.f4657a.hashCode() * 31, 31);
        int i16 = 0;
        String str = this.f4659c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i17 = (v10 + i10) * 31;
        String str2 = this.f4660d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i18 = (i17 + i11) * 31;
        String str3 = this.f4661e;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i19 = (i18 + i12) * 31;
        int i20 = 1237;
        if (this.f4662f) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i21 = (i19 + i13) * 31;
        String str4 = this.f4663g;
        if (str4 == null) {
            i14 = 0;
        } else {
            i14 = str4.hashCode();
        }
        int i22 = (i21 + i14) * 31;
        C6171F c6171f = this.f4664h;
        if (c6171f != null) {
            i16 = c6171f.hashCode();
        }
        int i23 = (i22 + i16) * 31;
        if (this.f4665i) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i24 = (i23 + i15) * 31;
        if (this.f4666j) {
            i20 = 1231;
        }
        return i24 + i20;
    }

    public final String toString() {
        String str;
        String str2;
        String b10 = C6190g0.b(this.f4658b);
        String str3 = "null";
        String str4 = this.f4659c;
        if (str4 == null) {
            str = str3;
        } else {
            str = C6168C.a(str4);
        }
        String str5 = this.f4660d;
        if (str5 == null) {
            str2 = str3;
        } else {
            str2 = C6182c0.a(str5);
        }
        String str6 = this.f4663g;
        if (str6 != null) {
            str3 = l.a(str6);
        }
        StringBuilder sb2 = new StringBuilder("GetTokenRequest(voice=");
        android.gov.nist.core.a.y(sb2, this.f4657a, ", modelSlug=", b10, ", conversationId=");
        android.gov.nist.core.a.y(sb2, str, ", parentMessageId=", str2, ", languageCode=");
        sb2.append(this.f4661e);
        sb2.append(", responseInterruptibility=");
        sb2.append(this.f4662f);
        sb2.append(", voiceSessionId=");
        sb2.append(str3);
        sb2.append(", conversationMode=");
        sb2.append(this.f4664h);
        sb2.append(", enableMessageStreaming=");
        sb2.append(this.f4665i);
        sb2.append(", voiceTrainingAllowed=");
        return AbstractC4194d.w(sb2, this.f4666j, Separators.RPAREN);
    }

    public c(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, C6171F c6171f, boolean z11, boolean z12) {
        AbstractC3557B.c0("voice", str);
        AbstractC3557B.c0("modelSlug", str2);
        this.f4657a = str;
        this.f4658b = str2;
        this.f4659c = str3;
        this.f4660d = str4;
        this.f4661e = str5;
        this.f4662f = z10;
        this.f4663g = str6;
        this.f4664h = c6171f;
        this.f4665i = z11;
        this.f4666j = z12;
    }
}

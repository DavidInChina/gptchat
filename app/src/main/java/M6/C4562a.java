package m6;

import E9.f;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Map;
import java.util.UUID;
import jf.C3959i;
import k6.AbstractC4194d;
import kf.AbstractC4268D;
import z.AbstractC6708l;

/* renamed from: m6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4562a {

    /* renamed from: m  reason: collision with root package name */
    public static final String f38944m;

    /* renamed from: a  reason: collision with root package name */
    public final String f38945a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38946b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f38947c;

    /* renamed from: d  reason: collision with root package name */
    public final String f38948d;

    /* renamed from: e  reason: collision with root package name */
    public final String f38949e;

    /* renamed from: f  reason: collision with root package name */
    public final String f38950f;

    /* renamed from: g  reason: collision with root package name */
    public final String f38951g;

    /* renamed from: h  reason: collision with root package name */
    public final int f38952h;

    /* renamed from: i  reason: collision with root package name */
    public final int f38953i;

    /* renamed from: j  reason: collision with root package name */
    public final int f38954j;

    /* renamed from: k  reason: collision with root package name */
    public final String f38955k;

    /* renamed from: l  reason: collision with root package name */
    public final String f38956l;

    static {
        String uuid = new UUID(0L, 0L).toString();
        AbstractC3557B.b0("UUID(0, 0).toString()", uuid);
        f38944m = uuid;
    }

    public C4562a(String str, String str2, boolean z10, String str3, String str4, String str5, String str6, int i10, int i11, int i12, String str7, String str8) {
        AbstractC3557B.c0("applicationId", str);
        AbstractC3557B.c0("sessionId", str2);
        AbstractC2469q0.q("sessionState", i10);
        AbstractC2469q0.q("sessionStartReason", i11);
        AbstractC2469q0.q("viewType", i12);
        this.f38945a = str;
        this.f38946b = str2;
        this.f38947c = z10;
        this.f38948d = str3;
        this.f38949e = str4;
        this.f38950f = str5;
        this.f38951g = str6;
        this.f38952h = i10;
        this.f38953i = i11;
        this.f38954j = i12;
        this.f38955k = str7;
        this.f38956l = str8;
    }

    public static C4562a a(C4562a c4562a, String str, boolean z10, String str2, String str3, String str4, String str5, int i10, int i11, int i12, String str6, String str7, int i13) {
        String str8;
        boolean z11;
        String str9;
        String str10;
        String str11;
        String str12;
        int i14;
        int i15;
        int i16;
        String str13;
        String str14;
        String str15 = c4562a.f38945a;
        if ((i13 & 2) != 0) {
            str8 = c4562a.f38946b;
        } else {
            str8 = str;
        }
        if ((i13 & 4) != 0) {
            z11 = c4562a.f38947c;
        } else {
            z11 = z10;
        }
        if ((i13 & 8) != 0) {
            str9 = c4562a.f38948d;
        } else {
            str9 = str2;
        }
        if ((i13 & 16) != 0) {
            str10 = c4562a.f38949e;
        } else {
            str10 = str3;
        }
        if ((i13 & 32) != 0) {
            str11 = c4562a.f38950f;
        } else {
            str11 = str4;
        }
        if ((i13 & 64) != 0) {
            str12 = c4562a.f38951g;
        } else {
            str12 = str5;
        }
        if ((i13 & 128) != 0) {
            i14 = c4562a.f38952h;
        } else {
            i14 = i10;
        }
        if ((i13 & 256) != 0) {
            i15 = c4562a.f38953i;
        } else {
            i15 = i11;
        }
        if ((i13 & 512) != 0) {
            i16 = c4562a.f38954j;
        } else {
            i16 = i12;
        }
        if ((i13 & 1024) != 0) {
            str13 = c4562a.f38955k;
        } else {
            str13 = str6;
        }
        if ((i13 & 2048) != 0) {
            str14 = c4562a.f38956l;
        } else {
            str14 = str7;
        }
        c4562a.getClass();
        AbstractC3557B.c0("applicationId", str15);
        AbstractC3557B.c0("sessionId", str8);
        AbstractC2469q0.q("sessionState", i14);
        AbstractC2469q0.q("sessionStartReason", i15);
        AbstractC2469q0.q("viewType", i16);
        return new C4562a(str15, str8, z11, str9, str10, str11, str12, i14, i15, i16, str13, str14);
    }

    public final Map b() {
        return AbstractC4268D.a1(new C3959i("application_id", this.f38945a), new C3959i("session_id", this.f38946b), new C3959i("session_active", Boolean.valueOf(this.f38947c)), new C3959i("session_state", AbstractC4194d.g(this.f38952h)), new C3959i("session_start_reason", AbstractC4194d.f(this.f38953i)), new C3959i("view_id", this.f38948d), new C3959i("view_name", this.f38949e), new C3959i("view_url", this.f38950f), new C3959i("view_type", AbstractC4194d.h(this.f38954j)), new C3959i("action_id", this.f38951g), new C3959i("synthetics_test_id", this.f38955k), new C3959i("synthetics_result_id", this.f38956l));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4562a)) {
            return false;
        }
        C4562a c4562a = (C4562a) obj;
        if (AbstractC3557B.K(this.f38945a, c4562a.f38945a) && AbstractC3557B.K(this.f38946b, c4562a.f38946b) && this.f38947c == c4562a.f38947c && AbstractC3557B.K(this.f38948d, c4562a.f38948d) && AbstractC3557B.K(this.f38949e, c4562a.f38949e) && AbstractC3557B.K(this.f38950f, c4562a.f38950f) && AbstractC3557B.K(this.f38951g, c4562a.f38951g) && this.f38952h == c4562a.f38952h && this.f38953i == c4562a.f38953i && this.f38954j == c4562a.f38954j && AbstractC3557B.K(this.f38955k, c4562a.f38955k) && AbstractC3557B.K(this.f38956l, c4562a.f38956l)) {
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
        int v10 = f.v(this.f38946b, this.f38945a.hashCode() * 31, 31);
        boolean z10 = this.f38947c;
        if (z10) {
            z10 = true;
        }
        int i15 = z10 ? 1 : 0;
        int i16 = z10 ? 1 : 0;
        int i17 = (v10 + i15) * 31;
        int i18 = 0;
        String str = this.f38948d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i19 = (i17 + i10) * 31;
        String str2 = this.f38949e;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i20 = (i19 + i11) * 31;
        String str3 = this.f38950f;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i21 = (i20 + i12) * 31;
        String str4 = this.f38951g;
        if (str4 == null) {
            i13 = 0;
        } else {
            i13 = str4.hashCode();
        }
        int d10 = AbstractC6708l.d(this.f38954j, AbstractC6708l.d(this.f38953i, AbstractC6708l.d(this.f38952h, (i21 + i13) * 31, 31), 31), 31);
        String str5 = this.f38955k;
        if (str5 == null) {
            i14 = 0;
        } else {
            i14 = str5.hashCode();
        }
        int i22 = (d10 + i14) * 31;
        String str6 = this.f38956l;
        if (str6 != null) {
            i18 = str6.hashCode();
        }
        return i22 + i18;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RumContext(applicationId=");
        sb2.append(this.f38945a);
        sb2.append(", sessionId=");
        sb2.append(this.f38946b);
        sb2.append(", isSessionActive=");
        sb2.append(this.f38947c);
        sb2.append(", viewId=");
        sb2.append(this.f38948d);
        sb2.append(", viewName=");
        sb2.append(this.f38949e);
        sb2.append(", viewUrl=");
        sb2.append(this.f38950f);
        sb2.append(", actionId=");
        sb2.append(this.f38951g);
        sb2.append(", sessionState=");
        sb2.append(AbstractC4194d.H(this.f38952h));
        sb2.append(", sessionStartReason=");
        sb2.append(AbstractC4194d.G(this.f38953i));
        sb2.append(", viewType=");
        sb2.append(AbstractC4194d.I(this.f38954j));
        sb2.append(", syntheticsTestId=");
        sb2.append(this.f38955k);
        sb2.append(", syntheticsResultId=");
        return R.a.t(sb2, this.f38956l, Separators.RPAREN);
    }
}

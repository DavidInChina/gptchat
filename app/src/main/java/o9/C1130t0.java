package O9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6182c0;

@AbstractC1998i
/* renamed from: O9.t0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1130t0 {
    public static final C1128s0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f13594a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13595b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13596c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13597d;

    public C1130t0(int i10, String str, String str2, String str3, String str4) {
        if ((i10 & 1) == 0) {
            this.f13594a = null;
        } else {
            this.f13594a = str;
        }
        if ((i10 & 2) == 0) {
            this.f13595b = null;
        } else {
            this.f13595b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f13596c = null;
        } else {
            this.f13596c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f13597d = null;
        } else {
            this.f13597d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1130t0)) {
            return false;
        }
        C1130t0 c1130t0 = (C1130t0) obj;
        String str = c1130t0.f13594a;
        String str2 = this.f13594a;
        if (str2 != null ? !(str != null && AbstractC3557B.K(str2, str)) : str != null) {
            return false;
        }
        if (!AbstractC3557B.K(this.f13595b, c1130t0.f13595b) || !AbstractC3557B.K(this.f13596c, c1130t0.f13596c)) {
            return false;
        }
        String str3 = this.f13597d;
        String str4 = c1130t0.f13597d;
        if (str3 != null ? str4 != null && AbstractC3557B.K(str3, str4) : str4 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f13594a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = i10 * 31;
        String str2 = this.f13595b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f13596c;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.f13597d;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        String str;
        String str2 = "null";
        String str3 = this.f13594a;
        if (str3 == null) {
            str = str2;
        } else {
            str = wd.O.a(str3);
        }
        String str4 = this.f13597d;
        if (str4 != null) {
            str2 = C6182c0.a(str4);
        }
        StringBuilder s10 = android.gov.nist.core.a.s("OauthAction(gizmoId=", str, ", gizmoActionId=");
        s10.append(this.f13595b);
        s10.append(", domain=");
        s10.append(this.f13596c);
        s10.append(", targetMessageId=");
        s10.append(str2);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}

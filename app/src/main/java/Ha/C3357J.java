package ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6182c0;

@AbstractC1998i
/* renamed from: ha.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3357J implements K {
    public static final C3356I Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f32011a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32012b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32013c;

    /* renamed from: d  reason: collision with root package name */
    public final String f32014d;

    /* renamed from: e  reason: collision with root package name */
    public final String f32015e;

    public C3357J(int i10, String str, String str2, String str3, String str4, String str5) {
        if (16 != (i10 & 16)) {
            R4.b.e2(i10, 16, C3355H.f32010b);
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f32011a = null;
        } else {
            this.f32011a = str;
        }
        if ((i10 & 2) == 0) {
            this.f32012b = null;
        } else {
            this.f32012b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f32013c = null;
        } else {
            this.f32013c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f32014d = null;
        } else {
            this.f32014d = str4;
        }
        this.f32015e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3357J)) {
            return false;
        }
        C3357J c3357j = (C3357J) obj;
        if (!AbstractC3557B.K(this.f32011a, c3357j.f32011a)) {
            return false;
        }
        String str = this.f32012b;
        String str2 = c3357j.f32012b;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (!AbstractC3557B.K(this.f32013c, c3357j.f32013c) || !AbstractC3557B.K(this.f32014d, c3357j.f32014d)) {
            return false;
        }
        String str3 = this.f32015e;
        String str4 = c3357j.f32015e;
        if (str3 != null ? str4 != null && AbstractC3557B.K(str3, str4) : str4 == null) {
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
        String str = this.f32011a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = i10 * 31;
        String str2 = this.f32012b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f32013c;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f32014d;
        if (str4 == null) {
            i13 = 0;
        } else {
            i13 = str4.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        String str5 = this.f32015e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }

    public final String toString() {
        String str;
        String str2 = "null";
        String str3 = this.f32012b;
        if (str3 == null) {
            str = str2;
        } else {
            str = wd.O.a(str3);
        }
        String str4 = this.f32015e;
        if (str4 != null) {
            str2 = C6182c0.a(str4);
        }
        StringBuilder sb2 = new StringBuilder("OauthAction(actionType=");
        android.gov.nist.core.a.y(sb2, this.f32011a, ", gizmoId=", str, ", gizmoActionId=");
        sb2.append(this.f32013c);
        sb2.append(", domain=");
        sb2.append(this.f32014d);
        sb2.append(", targetMessageId=");
        sb2.append(str2);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }

    public C3357J(String str, String str2, String str3, String str4, String str5) {
        this.f32011a = str;
        this.f32012b = str2;
        this.f32013c = str3;
        this.f32014d = str4;
        this.f32015e = str5;
    }
}

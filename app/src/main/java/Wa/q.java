package Wa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.O;

@AbstractC1998i
/* loaded from: classes.dex */
public final class q {
    public static final p Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f20866a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20867b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20868c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20869d;

    public q(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, o.f20865b);
            throw null;
        }
        this.f20866a = str;
        this.f20867b = str2;
        this.f20868c = str3;
        this.f20869d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        String str = qVar.f20866a;
        String str2 = this.f20866a;
        if (str2 != null ? !(str != null && AbstractC3557B.K(str2, str)) : str != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f20867b, qVar.f20867b) && AbstractC3557B.K(this.f20868c, qVar.f20868c) && AbstractC3557B.K(this.f20869d, qVar.f20869d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f20866a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f20867b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f20868c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return this.f20869d.hashCode() + ((i14 + i12) * 31);
    }

    public final String toString() {
        String str;
        String str2 = this.f20866a;
        if (str2 == null) {
            str = "null";
        } else {
            str = O.a(str2);
        }
        StringBuilder s10 = android.gov.nist.core.a.s("GizmoOauthRequest(gizmoId=", str, ", gizmoActionId=");
        s10.append(this.f20867b);
        s10.append(", domain=");
        s10.append(this.f20868c);
        s10.append(", redirectTo=");
        return R.a.t(s10, this.f20869d, Separators.RPAREN);
    }

    public q(String str, String str2, String str3, String str4) {
        this.f20866a = str;
        this.f20867b = str2;
        this.f20868c = str3;
        this.f20869d = str4;
    }
}

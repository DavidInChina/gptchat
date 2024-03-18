package ta;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;
import wd.C6182c0;

@AbstractC1998i
/* loaded from: classes.dex */
public final class b0 {
    public static final a0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f45903a;

    /* renamed from: b  reason: collision with root package name */
    public final String f45904b;

    /* renamed from: c  reason: collision with root package name */
    public final String f45905c;

    /* renamed from: d  reason: collision with root package name */
    public final String f45906d;

    public b0(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, Z.f45886b);
            throw null;
        }
        this.f45903a = str;
        this.f45904b = str2;
        this.f45905c = str3;
        this.f45906d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (!AbstractC3557B.K(this.f45903a, b0Var.f45903a) || !AbstractC3557B.K(this.f45904b, b0Var.f45904b)) {
            return false;
        }
        String str = this.f45905c;
        String str2 = b0Var.f45905c;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        String str3 = this.f45906d;
        String str4 = b0Var.f45906d;
        if (str3 != null ? str4 != null && AbstractC3557B.K(str3, str4) : str4 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f45903a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int v10 = E9.f.v(this.f45904b, i10 * 31, 31);
        String str2 = this.f45905c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i13 = (v10 + i11) * 31;
        String str3 = this.f45906d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        String str;
        String str2 = "null";
        String str3 = this.f45905c;
        if (str3 == null) {
            str = str2;
        } else {
            str = C6182c0.a(str3);
        }
        String str4 = this.f45906d;
        if (str4 != null) {
            str2 = C6168C.a(str4);
        }
        StringBuilder sb2 = new StringBuilder("RequestHashParameters(accountId=");
        sb2.append(this.f45903a);
        sb2.append(", deviceId=");
        android.gov.nist.core.a.y(sb2, this.f45904b, ", parentMessageId=", str, ", conversationId=");
        return R.a.t(sb2, str2, Separators.RPAREN);
    }

    public b0(String str, String str2, String str3, String str4) {
        AbstractC3557B.c0("deviceId", str2);
        this.f45903a = str;
        this.f45904b = str2;
        this.f45905c = str3;
        this.f45906d = str4;
    }
}

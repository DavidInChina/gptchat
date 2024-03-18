package Z9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;
import wd.O;
import wd.y0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f23425a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23426b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23427c;

    public d(String str, String str2, String str3) {
        this.f23425a = str;
        this.f23426b = str2;
        this.f23427c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!AbstractC3557B.K(this.f23425a, dVar.f23425a)) {
            return false;
        }
        String str = this.f23426b;
        String str2 = dVar.f23426b;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        String str3 = this.f23427c;
        String str4 = dVar.f23427c;
        if (str3 != null ? str4 != null && AbstractC3557B.K(str3, str4) : str4 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f23425a.hashCode() * 31;
        int i11 = 0;
        String str = this.f23426b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f23427c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        String str;
        String a5 = C6168C.a(this.f23425a);
        String str2 = "null";
        String str3 = this.f23426b;
        if (str3 == null) {
            str = str2;
        } else {
            str = y0.a(str3);
        }
        String str4 = this.f23427c;
        if (str4 != null) {
            str2 = O.a(str4);
        }
        return R.a.t(android.gov.nist.core.a.t("ConversationInfo(id=", a5, ", sharedId=", str, ", gizmoId="), str2, Separators.RPAREN);
    }
}

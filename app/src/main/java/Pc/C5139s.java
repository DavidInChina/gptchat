package pc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: pc.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5139s {

    /* renamed from: a  reason: collision with root package name */
    public final String f43023a;

    public C5139s(String str) {
        this.f43023a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5139s)) {
            return false;
        }
        String str = ((C5139s) obj).f43023a;
        String str2 = this.f43023a;
        if (str2 != null ? str != null && AbstractC3557B.K(str2, str) : str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f43023a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.f43023a;
        if (str2 == null) {
            str = "null";
        } else {
            str = android.gov.nist.core.a.A("Id(value=", str2, Separators.RPAREN);
        }
        return android.gov.nist.core.a.A("PurchaseTransaction(id=", str, Separators.RPAREN);
    }
}

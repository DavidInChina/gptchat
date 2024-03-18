package I9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6168C;

/* renamed from: I9.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0783t0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8452a;

    public C0783t0(String str) {
        this.f8452a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0783t0)) {
            return false;
        }
        String str = ((C0783t0) obj).f8452a;
        String str2 = this.f8452a;
        if (str2 != null ? str != null && AbstractC3557B.K(str2, str) : str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8452a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.f8452a;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6168C.a(str2);
        }
        return android.gov.nist.core.a.A("ClickConversation(remoteConversationId=", str, Separators.RPAREN);
    }
}

package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class O implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31368a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31369b;

    public O(String str, String str2) {
        AbstractC3557B.c0("messageId", str);
        AbstractC3557B.c0("url", str2);
        this.f31368a = str;
        this.f31369b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        if (AbstractC3557B.K(this.f31368a, o10.f31368a) && AbstractC3557B.K(this.f31369b, o10.f31369b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31369b.hashCode() + (this.f31368a.hashCode() * 31);
    }

    public final String toString() {
        return R.a.t(android.gov.nist.core.a.s("ClickLink(messageId=", C6182c0.a(this.f31368a), ", url="), this.f31369b, Separators.RPAREN);
    }
}

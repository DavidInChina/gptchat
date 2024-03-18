package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class S implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f31372a;

    public S(String str) {
        AbstractC3557B.c0("code", str);
        this.f31372a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof S) && AbstractC3557B.K(this.f31372a, ((S) obj).f31372a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31372a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("CopyCode(code="), this.f31372a, Separators.RPAREN);
    }
}

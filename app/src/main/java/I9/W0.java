package I9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6205s;

/* loaded from: classes2.dex */
public final class W0 implements X0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6205s f8248a;

    public W0(C6205s c6205s) {
        AbstractC3557B.c0("accountUser", c6205s);
        this.f8248a = c6205s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof W0) && AbstractC3557B.K(this.f8248a, ((W0) obj).f8248a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8248a.hashCode();
    }

    public final String toString() {
        return "SwitchAccount(accountUser=" + this.f8248a + Separators.RPAREN;
    }
}

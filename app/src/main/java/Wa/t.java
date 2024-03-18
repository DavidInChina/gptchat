package Wa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class t {
    public static final s Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f20872a;

    public t(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f20872a = str;
        } else {
            R4.b.e2(i10, 1, r.f20871b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && AbstractC3557B.K(this.f20872a, ((t) obj).f20872a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20872a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("GizmoOauthResponse(redirectUri="), this.f20872a, Separators.RPAREN);
    }
}

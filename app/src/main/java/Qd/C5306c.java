package qd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: qd.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5306c implements AbstractC5308e {

    /* renamed from: a  reason: collision with root package name */
    public final String f44065a;

    public C5306c(String str) {
        this.f44065a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5306c) && AbstractC3557B.K(this.f44065a, ((C5306c) obj).f44065a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f44065a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("SoftSunset(message="), this.f44065a, Separators.RPAREN);
    }
}

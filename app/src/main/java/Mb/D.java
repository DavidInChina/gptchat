package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class D implements F {

    /* renamed from: a  reason: collision with root package name */
    public final String f11764a;

    public D(String str) {
        AbstractC3557B.c0("value", str);
        this.f11764a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof D) && AbstractC3557B.K(this.f11764a, ((D) obj).f11764a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11764a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("UpdateLastName(value="), this.f11764a, Separators.RPAREN);
    }
}

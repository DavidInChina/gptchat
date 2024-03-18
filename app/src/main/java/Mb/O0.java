package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class O0 implements P0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11824a;

    public O0(String str) {
        AbstractC3557B.c0("code", str);
        this.f11824a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof O0) && AbstractC3557B.K(this.f11824a, ((O0) obj).f11824a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11824a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("UpdateCode(code="), this.f11824a, Separators.RPAREN);
    }
}

package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class J0 implements K0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11803a;

    public J0(String str) {
        AbstractC3557B.c0("error", str);
        this.f11803a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof J0) && AbstractC3557B.K(this.f11803a, ((J0) obj).f11803a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11803a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ShowError(error="), this.f11803a, Separators.RPAREN);
    }
}

package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class E implements F {

    /* renamed from: a  reason: collision with root package name */
    public final String f11767a;

    public E(String str) {
        AbstractC3557B.c0("value", str);
        this.f11767a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof E) && AbstractC3557B.K(this.f11767a, ((E) obj).f11767a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11767a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("UpdatePhone(value="), this.f11767a, Separators.RPAREN);
    }
}

package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class C implements F {

    /* renamed from: a  reason: collision with root package name */
    public final String f11761a;

    public C(String str) {
        AbstractC3557B.c0("value", str);
        this.f11761a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C) && AbstractC3557B.K(this.f11761a, ((C) obj).f11761a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11761a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("UpdateFirstName(value="), this.f11761a, Separators.RPAREN);
    }
}

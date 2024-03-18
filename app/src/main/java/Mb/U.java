package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class U extends Y {

    /* renamed from: a  reason: collision with root package name */
    public final String f11851a;

    public U(String str) {
        this.f11851a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        if (AbstractC3557B.K(this.f11851a, ((U) obj).f11851a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11851a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("NavigateTo(route=", AbstractC3557B.F2(this.f11851a), Separators.RPAREN);
    }
}

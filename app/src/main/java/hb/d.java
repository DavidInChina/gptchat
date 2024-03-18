package hb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f32104a;

    public d(String str) {
        this.f32104a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && AbstractC3557B.K(this.f32104a, ((d) obj).f32104a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32104a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("ShowSnackBar(message="), this.f32104a, Separators.RPAREN);
    }
}

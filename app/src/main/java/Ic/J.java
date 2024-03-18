package ic;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class J implements O {

    /* renamed from: a  reason: collision with root package name */
    public final String f32957a;

    public J(String str) {
        AbstractC3557B.c0("query", str);
        this.f32957a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof J) && AbstractC3557B.K(this.f32957a, ((J) obj).f32957a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32957a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("OnSearch(query="), this.f32957a, Separators.RPAREN);
    }
}

package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class B implements F {

    /* renamed from: a  reason: collision with root package name */
    public final Fb.f f11757a;

    public B(Fb.f fVar) {
        AbstractC3557B.c0("country", fVar);
        this.f11757a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof B) && AbstractC3557B.K(this.f11757a, ((B) obj).f11757a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11757a.hashCode();
    }

    public final String toString() {
        return "UpdateCountry(country=" + this.f11757a + Separators.RPAREN;
    }
}

package na;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class O implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final Sc.n f39844a;

    public O(Sc.n nVar) {
        AbstractC3557B.c0("model", nVar);
        this.f39844a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof O) && AbstractC3557B.K(this.f39844a, ((O) obj).f39844a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39844a.hashCode();
    }

    public final String toString() {
        return "SelectModel(model=" + this.f39844a + Separators.RPAREN;
    }
}

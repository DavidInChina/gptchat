package sb;

import android.gov.nist.core.Separators;
import gb.C3235l;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class q implements t {

    /* renamed from: a  reason: collision with root package name */
    public final C3235l f45518a;

    public q(C3235l c3235l) {
        AbstractC3557B.c0("data", c3235l);
        this.f45518a = c3235l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && AbstractC3557B.K(this.f45518a, ((q) obj).f45518a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45518a.hashCode();
    }

    public final String toString() {
        return "ImageThumbsUp(data=" + this.f45518a + Separators.RPAREN;
    }
}

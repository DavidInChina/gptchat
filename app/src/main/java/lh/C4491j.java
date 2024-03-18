package lh;

import Ng.AbstractC1073l0;
import Ng.D0;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: lh.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4491j implements AbstractC4493l {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1073l0 f38484a;

    public C4491j(D0 d02) {
        this.f38484a = d02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4491j) && AbstractC3557B.K(this.f38484a, ((C4491j) obj).f38484a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38484a.hashCode();
    }

    public final String toString() {
        return "InFlight(job=" + this.f38484a + Separators.RPAREN;
    }
}

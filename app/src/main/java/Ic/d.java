package Ic;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.v0;

/* loaded from: classes2.dex */
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final v0 f8539a;

    public d(v0 v0Var) {
        this.f8539a = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && AbstractC3557B.K(this.f8539a, ((d) obj).f8539a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8539a.hashCode();
    }

    public final String toString() {
        return "Done(result=" + this.f8539a + Separators.RPAREN;
    }
}

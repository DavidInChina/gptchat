package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final String f49038a;

    public M(String str) {
        this.f49038a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof M) && AbstractC3557B.K(this.f49038a, ((M) obj).f49038a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49038a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("CiTest(testExecutionId="), this.f49038a, Separators.RPAREN);
    }
}

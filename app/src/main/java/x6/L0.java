package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49035a;

    public L0(String str) {
        this.f49035a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof L0) && AbstractC3557B.K(this.f49035a, ((L0) obj).f49035a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49035a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("CiTest(testExecutionId="), this.f49035a, Separators.RPAREN);
    }
}

package Na;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class e {
    public static final d Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f12767a;

    public /* synthetic */ e(String str) {
        this.f12767a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f12767a, ((e) obj).f12767a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12767a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("LatencySessionId(value="), this.f12767a, Separators.RPAREN);
    }
}

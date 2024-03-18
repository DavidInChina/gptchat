package Ec;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class H implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final F f4605a;

    public H(F f6) {
        AbstractC3557B.c0("state", f6);
        this.f4605a = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof H) && AbstractC3557B.K(this.f4605a, ((H) obj).f4605a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4605a.hashCode();
    }

    public final String toString() {
        return "WhisperViewState(state=" + this.f4605a + Separators.RPAREN;
    }
}

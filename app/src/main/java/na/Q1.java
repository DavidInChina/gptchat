package na;

import android.gov.nist.core.Separators;
import fa.C2969F;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class Q1 extends Gi.e {

    /* renamed from: k  reason: collision with root package name */
    public final C2969F f39858k;

    public Q1(C2969F c2969f) {
        AbstractC3557B.c0("message", c2969f);
        this.f39858k = c2969f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Q1) && AbstractC3557B.K(this.f39858k, ((Q1) obj).f39858k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39858k.hashCode();
    }

    public final String toString() {
        return "Stop(message=" + this.f39858k + Separators.RPAREN;
    }
}

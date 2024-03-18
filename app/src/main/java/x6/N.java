package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final Number f49044a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f49045b;

    public N(Number number, Number number2) {
        this.f49044a = number;
        this.f49045b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        if (AbstractC3557B.K(this.f49044a, n10.f49044a) && AbstractC3557B.K(this.f49045b, n10.f49045b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f49044a.hashCode() * 31;
        Number number = this.f49045b;
        if (number == null) {
            i10 = 0;
        } else {
            i10 = number.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.f49044a + ", sessionReplaySampleRate=" + this.f49045b + Separators.RPAREN;
    }
}

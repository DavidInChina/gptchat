package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a  reason: collision with root package name */
    public final Number f49039a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f49040b;

    public M0(Number number, Number number2) {
        this.f49039a = number;
        this.f49040b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m02 = (M0) obj;
        if (AbstractC3557B.K(this.f49039a, m02.f49039a) && AbstractC3557B.K(this.f49040b, m02.f49040b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f49039a.hashCode() * 31;
        Number number = this.f49040b;
        if (number == null) {
            i10 = 0;
        } else {
            i10 = number.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "Configuration(sessionSampleRate=" + this.f49039a + ", sessionReplaySampleRate=" + this.f49040b + Separators.RPAREN;
    }
}

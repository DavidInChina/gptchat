package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a  reason: collision with root package name */
    public final Number f48979a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f48980b;

    public G0(Number number, Number number2) {
        this.f48979a = number;
        this.f48980b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        if (AbstractC3557B.K(this.f48979a, g02.f48979a) && AbstractC3557B.K(this.f48980b, g02.f48980b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48980b.hashCode() + (this.f48979a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.f48979a + ", height=" + this.f48980b + Separators.RPAREN;
    }
}

package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final Number f48952a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f48953b;

    public F(Number number, Number number2) {
        this.f48952a = number;
        this.f48953b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        if (AbstractC3557B.K(this.f48952a, f6.f48952a) && AbstractC3557B.K(this.f48953b, f6.f48953b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48953b.hashCode() + (this.f48952a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.f48952a + ", height=" + this.f48953b + Separators.RPAREN;
    }
}

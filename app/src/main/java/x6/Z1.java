package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class Z1 {

    /* renamed from: a  reason: collision with root package name */
    public final Number f49206a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f49207b;

    public Z1(Number number, Number number2) {
        this.f49206a = number;
        this.f49207b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z1)) {
            return false;
        }
        Z1 z12 = (Z1) obj;
        if (AbstractC3557B.K(this.f49206a, z12.f49206a) && AbstractC3557B.K(this.f49207b, z12.f49207b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49207b.hashCode() + (this.f49206a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.f49206a + ", height=" + this.f49207b + Separators.RPAREN;
    }
}

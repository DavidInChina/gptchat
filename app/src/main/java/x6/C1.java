package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class C1 {

    /* renamed from: a  reason: collision with root package name */
    public final Z1 f48931a;

    /* renamed from: b  reason: collision with root package name */
    public final Q1 f48932b;

    public C1(Z1 z12, Q1 q12) {
        this.f48931a = z12;
        this.f48932b = q12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1)) {
            return false;
        }
        C1 c12 = (C1) obj;
        if (AbstractC3557B.K(this.f48931a, c12.f48931a) && AbstractC3557B.K(this.f48932b, c12.f48932b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        Z1 z12 = this.f48931a;
        if (z12 == null) {
            i10 = 0;
        } else {
            i10 = z12.hashCode();
        }
        int i12 = i10 * 31;
        Q1 q12 = this.f48932b;
        if (q12 != null) {
            i11 = q12.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "Display(viewport=" + this.f48931a + ", scroll=" + this.f48932b + Separators.RPAREN;
    }
}

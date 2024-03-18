package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class X {
    public static final W Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final U f48371a;

    public X(int i10, U u10) {
        if ((i10 & 1) == 0) {
            this.f48371a = null;
        } else {
            this.f48371a = u10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof X) && AbstractC3557B.K(this.f48371a, ((X) obj).f48371a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        U u10 = this.f48371a;
        if (u10 == null) {
            return 0;
        }
        return u10.hashCode();
    }

    public final String toString() {
        return "Metadata(dalle=" + this.f48371a + Separators.RPAREN;
    }
}

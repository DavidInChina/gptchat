package Bg;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public abstract class e0 implements d0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (c() == d0Var.c() && b() == d0Var.b() && getType().equals(d0Var.getType())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = b().hashCode();
        if (m0.m(getType())) {
            return (hashCode * 31) + 19;
        }
        int i11 = hashCode * 31;
        if (c()) {
            i10 = 17;
        } else {
            i10 = getType().hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        if (c()) {
            return Separators.STAR;
        }
        if (b() == p0.f2146h0) {
            return getType().toString();
        }
        return b() + Separators.SP + getType();
    }
}

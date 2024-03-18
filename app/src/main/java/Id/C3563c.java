package id;

import android.gov.nist.core.Separators;

/* renamed from: id.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3563c extends AbstractC3566f {

    /* renamed from: a  reason: collision with root package name */
    public final double f33091a;

    public C3563c(double d10) {
        this.f33091a = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3563c) && Double.compare(this.f33091a, ((C3563c) obj).f33091a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f33091a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return "DoubleValue(value=" + this.f33091a + Separators.RPAREN;
    }
}

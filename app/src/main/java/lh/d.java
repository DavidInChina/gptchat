package Lh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public final class d extends Hh.i {

    /* renamed from: Y  reason: collision with root package name */
    public final double f11176Y;

    public d(double d10) {
        this.f11176Y = d10;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.t(Double.valueOf(this.f11176Y));
        return e.f11179i0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        if (Double.compare(this.f11176Y, ((d) obj).f11176Y) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f11176Y);
        return (d.class.hashCode() * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }
}

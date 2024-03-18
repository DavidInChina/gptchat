package Lh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public final class f extends Hh.i {

    /* renamed from: Y  reason: collision with root package name */
    public final float f11182Y;

    public f(float f6) {
        this.f11182Y = f6;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.t(Float.valueOf(this.f11182Y));
        return g.f11186j0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        if (Float.compare(this.f11182Y, ((f) obj).f11182Y) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11182Y) + (f.class.hashCode() * 31);
    }
}

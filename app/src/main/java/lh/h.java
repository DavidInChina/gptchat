package Lh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public final class h extends Hh.i {

    /* renamed from: Y  reason: collision with root package name */
    public final int f11189Y;

    public h(int i10) {
        this.f11189Y = i10;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.t(Integer.valueOf(this.f11189Y));
        return k.f11199n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        if (this.f11189Y == ((h) obj).f11189Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (h.class.hashCode() * 31) + this.f11189Y;
    }
}

package Lh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public final class j extends Hh.i {

    /* renamed from: Y  reason: collision with root package name */
    public final short f11191Y;

    public j(short s10) {
        this.f11191Y = s10;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.p(17, this.f11191Y);
        return k.f11199n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        if (this.f11191Y == ((j) obj).f11191Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (j.class.hashCode() * 31) + this.f11191Y;
    }
}

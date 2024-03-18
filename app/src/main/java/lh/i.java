package Lh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public final class i extends Hh.i {

    /* renamed from: Y  reason: collision with root package name */
    public final byte f11190Y;

    public i(byte b10) {
        this.f11190Y = b10;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.p(16, this.f11190Y);
        return k.f11199n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        if (this.f11190Y == ((i) obj).f11190Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (i.class.hashCode() * 31) + this.f11190Y;
    }
}

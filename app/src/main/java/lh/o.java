package Lh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public final class o extends Hh.i {

    /* renamed from: Y  reason: collision with root package name */
    public final String f11210Y;

    public o(String str) {
        this.f11210Y = str;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.t(this.f11210Y);
        return Hh.o.SINGLE.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        if (this.f11210Y.equals(((o) obj).f11210Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11210Y.hashCode() + (o.class.hashCode() * 31);
    }
}

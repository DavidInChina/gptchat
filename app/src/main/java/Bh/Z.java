package Bh;

import Eh.AbstractC0523w;

/* loaded from: classes2.dex */
public final class Z implements AbstractC0238c0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC0523w f2310Y;

    public Z(AbstractC0523w abstractC0523w) {
        this.f2310Y = abstractC0523w;
    }

    @Override // Bh.AbstractC0238c0
    public final X d(Dh.n nVar) {
        return new Y(this.f2310Y.c(nVar));
    }

    @Override // Bh.AbstractC0261o
    public final AbstractC0265q e(AbstractC0265q abstractC0265q) {
        return this.f2310Y.e(abstractC0265q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.class != obj.getClass()) {
            return false;
        }
        if (this.f2310Y.equals(((Z) obj).f2310Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2310Y.hashCode() + (Z.class.hashCode() * 31);
    }
}

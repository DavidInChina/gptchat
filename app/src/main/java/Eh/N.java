package Eh;

import Bh.AbstractC0265q;
import wh.AbstractC6226B;
import wh.AbstractC6250o;

/* loaded from: classes.dex */
public final class N implements T, L {

    /* renamed from: Y  reason: collision with root package name */
    public final int f4756Y = 0;

    @Override // Eh.T
    public final S a(AbstractC6250o abstractC6250o) {
        int size = abstractC6250o.getParameters().size();
        int i10 = this.f4756Y;
        if (i10 < size) {
            return new M((AbstractC6226B) abstractC6250o.getParameters().get(i10));
        }
        throw new IllegalArgumentException(abstractC6250o + " does not have a parameter with index " + i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N.class != obj.getClass()) {
            return false;
        }
        if (this.f4756Y == ((N) obj).f4756Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (N.class.hashCode() * 31) + this.f4756Y;
    }

    @Override // Eh.L
    public final T b(Dh.n nVar) {
        return this;
    }

    @Override // Bh.AbstractC0261o
    public final AbstractC0265q e(AbstractC0265q abstractC0265q) {
        return abstractC0265q;
    }
}

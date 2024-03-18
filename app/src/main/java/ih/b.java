package Ih;

import Eh.AbstractC0511j;
import Hh.i;
import Hh.l;
import Hh.o;
import yh.AbstractC6632q;
import yh.l1;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f8609Y;

    public b(l1 l1Var) {
        this.f8609Y = l1Var;
    }

    public static b h(AbstractC6632q abstractC6632q) {
        if (!abstractC6632q.a1()) {
            return new b(abstractC6632q.l0());
        }
        throw new IllegalArgumentException("Cannot cast to primitive type: " + abstractC6632q);
    }

    @Override // Hh.n
    public final l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.H(192, this.f8609Y.D0());
        return o.ZERO.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        if (this.f8609Y.equals(((b) obj).f8609Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8609Y.hashCode() + (b.class.hashCode() * 31);
    }
}

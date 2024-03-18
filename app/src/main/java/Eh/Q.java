package Eh;

import wh.AbstractC6250o;
import yh.l1;

/* loaded from: classes.dex */
public final class Q implements T {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f4761Y;

    public Q(l1 l1Var) {
        this.f4761Y = l1Var;
    }

    @Override // Eh.T
    public final S a(AbstractC6250o abstractC6250o) {
        return new P(abstractC6250o, this.f4761Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q.class != obj.getClass()) {
            return false;
        }
        if (this.f4761Y.equals(((Q) obj).f4761Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4761Y.hashCode() + (Q.class.hashCode() * 31);
    }
}

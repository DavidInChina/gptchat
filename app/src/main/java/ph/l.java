package ph;

import Sh.J;
import yh.l1;

/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: d  reason: collision with root package name */
    public final J f43211d;

    public l(J j6) {
        super(h.f43206Y);
        this.f43211d = j6;
    }

    @Override // ph.k, ph.g
    public final String a(l1 l1Var) {
        return super.a(l1Var) + "$" + this.f43211d.a();
    }

    @Override // ph.k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override // ph.k
    public final int hashCode() {
        return super.hashCode();
    }
}

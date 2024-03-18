package Qh;

import yh.l1;

/* loaded from: classes2.dex */
public final class Z extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f14984a;

    public Z(l1 l1Var) {
        this.f14984a = l1Var;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return ((l1) obj).K0(this.f14984a);
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.class != obj.getClass()) {
            return false;
        }
        if (!this.f14984a.equals(((Z) obj).f14984a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14984a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "isSubTypeOf(" + this.f14984a + ')';
    }
}
